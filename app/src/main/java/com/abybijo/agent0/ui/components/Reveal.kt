package com.abybijo.agent0.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameMillis
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.Motion
import kotlin.math.roundToInt
import kotlin.random.Random

/**
 * Slide + fade entrance used for virtually every block of content in Agent-0.
 * Content lifts from below and resolves into place on the Decode curve.
 */
@Composable
fun RevealIn(
    modifier: Modifier = Modifier,
    delayMillis: Int = 0,
    fromY: Dp = 14.dp,
    durationMillis: Int = Motion.Normal,
    content: @Composable BoxScope.() -> Unit
) {
    var visible by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) { visible = true }

    val progress by animateFloatAsState(
        targetValue = if (visible) 1f else 0f,
        animationSpec = tween(durationMillis, delayMillis, Motion.Decode),
        label = "reveal"
    )
    val px = with(LocalDensity.current) { fromY.toPx() }

    Box(
        modifier = modifier.graphicsLayer {
            alpha = progress
            translationY = (1f - progress) * px
        },
        content = content
    )
}

/**
 * Character-by-character typewriter, the signature reveal of the app.
 * A block cursor trails the text while it types.
 */
@Composable
fun TypewriterText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = LocalTextStyle.current,
    charDelayMillis: Int = 18,
    startDelayMillis: Int = 0,
    showCursor: Boolean = true,
    onFinished: (() -> Unit)? = null
) {
    var shown by remember(text) { mutableIntStateOf(0) }
    var done by remember(text) { mutableStateOf(false) }

    LaunchedEffect(text) {
        shown = 0
        done = false
        var elapsed = 0L
        var last = 0L
        // Frame-driven so typing stays smooth and never blocks recomposition.
        withFrameMillis { last = it }
        while (shown < text.length) {
            withFrameMillis { now ->
                elapsed += (now - last).coerceAtMost(64L)
                last = now
            }
            val target = ((elapsed - startDelayMillis) / charDelayMillis)
                .coerceAtLeast(0L).toInt()
            if (target > shown) shown = target.coerceAtMost(text.length)
        }
        done = true
        onFinished?.invoke()
    }

    val blink = rememberBlink(enabled = showCursor && !done)

    Text(
        text = buildAnnotatedString {
            append(text.take(shown))
            if (showCursor && !done && blink) {
                withStyle(SpanStyle(color = Ink.White)) { append("\u2588") }
            }
        },
        style = style,
        modifier = modifier
    )
}

/**
 * "Decrypting" scramble reveal: glyphs churn through noise then lock in,
 * left to right. Used for headers and stat values.
 */
@Composable
fun ScrambleText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = LocalTextStyle.current,
    durationMillis: Int = Motion.Cinematic,
    delayMillis: Int = 0
) {
    val charset = remember { "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#%&/\\<>*+=-_".toCharArray() }
    var frame by remember(text) { mutableIntStateOf(0) }
    var locked by remember(text) { mutableIntStateOf(0) }

    LaunchedEffect(text) {
        locked = 0
        frame = 0
        var elapsed = 0L
        var last = 0L
        withFrameMillis { last = it }
        while (locked < text.length) {
            withFrameMillis { now ->
                elapsed += (now - last).coerceAtMost(64L)
                last = now
                frame++
            }
            val p = ((elapsed - delayMillis).toFloat() / durationMillis).coerceIn(0f, 1f)
            locked = (p * text.length).roundToInt()
        }
    }

    val rendered = remember(text, locked, frame) {
        buildAnnotatedString {
            text.forEachIndexed { i, c ->
                when {
                    i < locked || c == ' ' -> append(c)
                    else -> withStyle(SpanStyle(color = Ink.Dim)) {
                        append(charset[Random.nextInt(charset.size)])
                    }
                }
            }
        }
    }
    Text(text = rendered, style = style, modifier = modifier)
}

/** Shared blinking-cursor clock. */
@Composable
fun rememberBlink(enabled: Boolean = true, periodMillis: Int = 1060): Boolean {
    var on by remember { mutableStateOf(true) }
    LaunchedEffect(enabled) {
        if (!enabled) { on = false; return@LaunchedEffect }
        var last = 0L
        var acc = 0L
        withFrameMillis { last = it }
        while (true) {
            withFrameMillis { now ->
                acc += (now - last).coerceAtMost(64L); last = now
            }
            if (acc >= periodMillis / 2) { on = !on; acc = 0 }
        }
    }
    return on
}

/** A single blinking block cursor, for prompts. */
@Composable
fun BlinkingCursor(modifier: Modifier = Modifier, style: TextStyle = LocalTextStyle.current) {
    val on = rememberBlink()
    Text(
        text = "\u2588",
        style = style,
        modifier = modifier.alpha(if (on) 1f else 0f)
    )
}

/** Progress bar drawn as terminal glyphs: [██████░░░░░░] 50% */
@Composable
fun AsciiBar(
    progress: Float,
    modifier: Modifier = Modifier,
    slots: Int = 20,
    showPercent: Boolean = true
) {
    val animated by animateFloatAsState(
        targetValue = progress.coerceIn(0f, 1f),
        animationSpec = tween(Motion.Slow, easing = Motion.Decode),
        label = "asciiBar"
    )
    val filled = (animated * slots).roundToInt()
    val pct = (animated * 100).roundToInt()
    Text(
        text = buildAnnotatedString {
            withStyle(SpanStyle(color = Ink.Rule)) { append("[") }
            withStyle(SpanStyle(color = Ink.White)) { append("\u2588".repeat(filled)) }
            withStyle(SpanStyle(color = Ink.Hairline)) { append("\u2591".repeat(slots - filled)) }
            withStyle(SpanStyle(color = Ink.Rule)) { append("]") }
            if (showPercent) {
                withStyle(SpanStyle(color = Ink.Mid)) { append("  ${pct.toString().padStart(3)}%") }
            }
        },
        style = MaterialTheme.typography.bodySmall,
        modifier = modifier
    )
}

/** Utility: an AnnotatedString label like "01 //" used as a section index. */
fun indexLabel(i: Int): AnnotatedString = buildAnnotatedString {
    withStyle(SpanStyle(color = Ink.Dim)) {
        append(i.toString().padStart(2, '0')); append(" //")
    }
}

/** Linear sweep used by the boot sequence. */
@Composable
fun rememberSweep(durationMillis: Int, running: Boolean = true): Float {
    val p by animateFloatAsState(
        targetValue = if (running) 1f else 0f,
        animationSpec = tween(durationMillis, easing = LinearEasing),
        label = "sweep"
    )
    return p
}
