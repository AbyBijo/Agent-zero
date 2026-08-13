package com.abybijo.agent0.feature.onboarding

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.components.Agent0Logo
import com.abybijo.agent0.ui.components.ScrambleText
import com.abybijo.agent0.ui.components.crtScanlines
import com.abybijo.agent0.ui.components.scanSweep
import com.abybijo.agent0.ui.components.vignette
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.Motion
import kotlinx.coroutines.delay

private val BOOT_LINES = listOf(
    "agent0 --init",
    "loading doctrine .................. OK",
    "mounting local store .............. OK",
    "network interfaces ................ NONE",
    "telemetry ......................... DISABLED",
    "clearance ......................... PENDING"
)

/**
 * Cold-open boot sequence. Runs once per launch, ~2.4s, and can be skipped
 * by tapping anywhere. Sets the tone before a single word of content.
 */
@Composable
fun BootScreen(
    reduceMotion: Boolean,
    onFinished: () -> Unit
) {
    var line by remember { mutableIntStateOf(0) }
    var showMark by remember { mutableIntStateOf(0) }

    LaunchedEffect(reduceMotion) {
        if (reduceMotion) { onFinished(); return@LaunchedEffect }
        delay(180)
        showMark = 1
        delay(420)
        BOOT_LINES.indices.forEach { i ->
            line = i + 1
            delay(190)
        }
        delay(520)
        onFinished()
    }

    val markReveal by animateFloatAsState(
        targetValue = if (showMark == 1) 1f else 0f,
        animationSpec = tween(Motion.Slow, easing = Motion.Decode),
        label = "markReveal"
    )
    val markScale by animateFloatAsState(
        targetValue = if (showMark == 1) 1f else 0.82f,
        animationSpec = tween(Motion.Slow, easing = Motion.Decode),
        label = "markScale"
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Ink.Black)
            .crtScanlines()
            .scanSweep()
            .vignette(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 32.dp)
        ) {
            Agent0Logo(
                size = 128.dp,
                spin = true,
                progress = markReveal,
                modifier = Modifier.scale(markScale)
            )
            Spacer(Modifier.height(26.dp))

            AnimatedVisibility(visible = showMark == 1, enter = fadeIn(tween(Motion.Slow))) {
                ScrambleText(
                    text = "AGENT-0",
                    style = MaterialTheme.typography.displayLarge,
                    durationMillis = 900
                )
            }
            Spacer(Modifier.height(8.dp))
            Text(
                text = "OPSEC TRAINING PROGRAM",
                style = MaterialTheme.typography.labelSmall,
                color = Ink.Dim,
                modifier = Modifier.alpha(markReveal)
            )

            Spacer(Modifier.height(44.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(3.dp)
            ) {
                BOOT_LINES.forEachIndexed { i, text ->
                    AnimatedVisibility(
                        visible = i < line,
                        enter = fadeIn(tween(Motion.Fast))
                    ) {
                        Text(
                            text = if (i == 0) "$ $text" else "  $text",
                            style = MaterialTheme.typography.bodySmall,
                            color = if (i == 0) Ink.Soft else Ink.Dim,
                            textAlign = TextAlign.Start,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }
    }
}
