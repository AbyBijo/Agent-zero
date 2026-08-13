package com.abybijo.agent0.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.abybijo.agent0.ui.theme.Ink

/**
 * CRT scanline wash + a slow travelling scan bar.
 * Applied to full-screen scaffolds so every surface reads as a terminal
 * without costing a bitmap. Extremely cheap: two draw ops per frame.
 */
fun Modifier.crtScanlines(
    lineSpacingPx: Float = 4f,
    alpha: Float = 0.05f
): Modifier = this.drawWithCache {
    onDrawWithContent {
        drawContent()
        var y = 0f
        while (y < size.height) {
            drawLine(
                color = Color.White.copy(alpha = alpha),
                start = Offset(0f, y),
                end = Offset(size.width, y),
                strokeWidth = 1f
            )
            y += lineSpacingPx
        }
    }
}

/** A soft white bar that sweeps down the screen forever, like a CRT refresh. */
fun Modifier.scanSweep(periodMillis: Int = 7000, intensity: Float = 0.035f): Modifier = composed {
    val t = rememberInfiniteTransition(label = "scan")
    val p by t.animateFloat(
        initialValue = -0.25f,
        targetValue = 1.25f,
        animationSpec = infiniteRepeatable(
            animation = tween(periodMillis, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "scanPos"
    )
    drawWithCache {
        val bandHeight = size.height * 0.22f
        val brush = Brush.verticalGradient(
            colors = listOf(
                Color.Transparent,
                Color.White.copy(alpha = intensity),
                Color.Transparent
            ),
            startY = p * size.height - bandHeight / 2f,
            endY = p * size.height + bandHeight / 2f
        )
        onDrawWithContent {
            drawContent()
            drawRect(brush = brush, topLeft = Offset.Zero, size = Size(size.width, size.height))
        }
    }
}

/** Vignette to pull focus to the centre of the "screen". */
fun Modifier.vignette(strength: Float = 0.55f): Modifier = this.drawWithCache {
    val brush = Brush.radialGradient(
        colors = listOf(Color.Transparent, Ink.Black.copy(alpha = strength)),
        center = Offset(size.width / 2f, size.height / 2f),
        radius = size.maxDimension * 0.75f
    )
    onDrawWithContent {
        drawContent()
        drawRect(brush = brush)
    }
}
