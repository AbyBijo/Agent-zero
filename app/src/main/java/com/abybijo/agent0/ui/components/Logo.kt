package com.abybijo.agent0.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.theme.Ink
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

/**
 * The Agent-0 sigil — drawn entirely in code, no raster assets.
 *
 * Structure (outside → in), echoing an agency service seal:
 *   · outer ring + inner ring with a laurel of radial ticks between them
 *   · 13 "clearance" studs set into the ring gap
 *   · a shield containing a keyhole (the classified core)
 *   · a bold "0" counter-form implied by the shield's ring
 *   · crosshair ticks at the cardinal points (surveillance reticle)
 *
 * Everything is pure white on black. [spin] slowly rotates the tick laurel,
 * which is what makes the splash mark feel alive without any colour.
 */
@Composable
fun Agent0Logo(
    modifier: Modifier = Modifier,
    size: Dp = 120.dp,
    spin: Boolean = true,
    progress: Float = 1f
) {
    val transition = rememberInfiniteTransition(label = "sigil")
    val angle by transition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(28_000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "sigilSpin"
    )

    Canvas(modifier = modifier.size(size)) {
        drawSigil(
            spinDeg = if (spin) angle else 0f,
            reveal = progress.coerceIn(0f, 1f)
        )
    }
}

private fun DrawScope.drawSigil(spinDeg: Float, reveal: Float) {
    val c = Offset(size.width / 2f, size.height / 2f)
    val r = size.minDimension / 2f
    val unit = r / 100f          // design grid: 100 units = radius
    fun u(v: Float) = v * unit

    val white = Ink.White
    val stroke = u(2.6f)

    // ── outer ring ────────────────────────────────────────────────────────
    drawCircle(
        color = white.copy(alpha = reveal),
        radius = r - u(2f),
        center = c,
        style = Stroke(width = stroke)
    )
    // ── inner ring ────────────────────────────────────────────────────────
    drawCircle(
        color = white.copy(alpha = reveal),
        radius = u(74f),
        center = c,
        style = Stroke(width = u(1.6f))
    )

    // ── laurel of radial ticks in the ring gap (rotates) ──────────────────
    rotate(degrees = spinDeg, pivot = c) {
        val ticks = 60
        for (i in 0 until ticks) {
            val a = (i.toFloat() / ticks) * 2f * PI.toFloat()
            val major = i % 5 == 0
            val innerR = u(78f)
            val outerR = if (major) u(94f) else u(87f)
            val alpha = if (major) 1f else 0.45f
            drawLine(
                color = white.copy(alpha = alpha * reveal),
                start = Offset(c.x + cos(a) * innerR, c.y + sin(a) * innerR),
                end = Offset(c.x + cos(a) * outerR, c.y + sin(a) * outerR),
                strokeWidth = if (major) u(2.4f) else u(1.2f)
            )
        }
    }

    // ── 13 clearance studs, static, set just inside the inner ring ────────
    val studs = 13
    for (i in 0 until studs) {
        val a = -PI.toFloat() / 2f + (i.toFloat() / studs) * 2f * PI.toFloat()
        val rr = u(66f)
        drawCircle(
            color = white.copy(alpha = 0.75f * reveal),
            radius = u(2.2f),
            center = Offset(c.x + cos(a) * rr, c.y + sin(a) * rr)
        )
    }

    // ── crosshair reticle ticks at cardinals ──────────────────────────────
    listOf(0f, 90f, 180f, 270f).forEach { deg ->
        val a = Math.toRadians(deg.toDouble()).toFloat()
        drawLine(
            color = white.copy(alpha = reveal),
            start = Offset(c.x + cos(a) * u(96f), c.y + sin(a) * u(96f)),
            end = Offset(c.x + cos(a) * u(112f), c.y + sin(a) * u(112f)),
            strokeWidth = u(2f)
        )
    }

    // ── shield ────────────────────────────────────────────────────────────
    val shield = Path().apply {
        val w = u(46f)      // half width
        val top = c.y - u(46f)
        val shoulder = c.y - u(10f)
        val bottom = c.y + u(52f)
        moveTo(c.x - w, top)
        lineTo(c.x + w, top)
        lineTo(c.x + w, shoulder)
        // sweeping sides down to the point
        cubicTo(
            c.x + w, shoulder + u(30f),
            c.x + u(26f), bottom - u(8f),
            c.x, bottom
        )
        cubicTo(
            c.x - u(26f), bottom - u(8f),
            c.x - w, shoulder + u(30f),
            c.x - w, shoulder
        )
        close()
    }
    drawPath(path = shield, color = white.copy(alpha = reveal), style = Stroke(width = u(3f)))

    // horizontal chief bar across the shield
    drawLine(
        color = white.copy(alpha = 0.8f * reveal),
        start = Offset(c.x - u(46f), c.y - u(26f)),
        end = Offset(c.x + u(46f), c.y - u(26f)),
        strokeWidth = u(2f)
    )

    // ── keyhole: the classified core ──────────────────────────────────────
    drawCircle(
        color = white.copy(alpha = reveal),
        radius = u(13f),
        center = Offset(c.x, c.y + u(2f)),
        style = Stroke(width = u(3f))
    )
    val stem = Path().apply {
        moveTo(c.x - u(6.5f), c.y + u(14f))
        lineTo(c.x + u(6.5f), c.y + u(14f))
        lineTo(c.x + u(4f), c.y + u(34f))
        lineTo(c.x - u(4f), c.y + u(34f))
        close()
    }
    drawPath(path = stem, color = white.copy(alpha = reveal))

    // ── dashed inner accent ring, gives the seal its engraved feel ────────
    drawCircle(
        color = white.copy(alpha = 0.35f * reveal),
        radius = u(58f),
        center = c,
        style = Stroke(
            width = u(1f),
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(u(3f), u(5f)), 0f)
        )
    )
}

/**
 * Compact mark for the top bar: ring + keyhole only, legible at 24dp.
 */
@Composable
fun Agent0Mark(modifier: Modifier = Modifier, size: Dp = 26.dp, tint: Color = Ink.White) {
    Canvas(modifier = modifier.size(size)) {
        val c = Offset(this.size.width / 2f, this.size.height / 2f)
        val r = this.size.minDimension / 2f
        val u = r / 100f
        drawCircle(tint, radius = r - u * 4f, center = c, style = Stroke(width = u * 8f))
        drawCircle(
            tint,
            radius = u * 30f,
            center = Offset(c.x, c.y - u * 6f),
            style = Stroke(width = u * 8f)
        )
        drawRect(
            color = tint,
            topLeft = Offset(c.x - u * 9f, c.y + u * 14f),
            size = Size(u * 18f, u * 32f)
        )
    }
}
