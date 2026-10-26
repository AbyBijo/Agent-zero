package com.abybijo.agent0.feature.illustration

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.theme.Ink

/**
 * v2.0 per-brief illustrations (SRS §6), Phase 3b.
 *
 * Illustrations are drawn at runtime as vector line art — no bitmaps, no
 * new libraries, and no APK size cost worth measuring. The palette follows
 * the app's monochrome rule exactly: black canvas, white/cream lines, and
 * yellow only for warnings, red only for danger. A motif is reused across
 * briefs that share a theme; the caption is what makes each brief's
 * illustration specific to that brief.
 */
enum class Motif {
    CIRCLE, KEY, LOCK, EYE, SHIELD, NETWORK, ENVELOPE, DEVICE, CHAIN,
    MAP, HOURGLASS, SCALE, MASK, BOOK, STAIRS, WARNING, DANGER
}

private val line = Stroke(width = 5f)
private val thin = Stroke(width = 3f)

private fun DrawScope.centre(): Offset = Offset(size.width / 2f, size.height / 2f)
private fun DrawScope.unit(): Float = minOf(size.width, size.height) / 4f

private fun DrawScope.drawMotif(motif: Motif) {
    val c = centre()
    val u = unit()
    val w = Ink.White
    when (motif) {
        Motif.CIRCLE -> {
            drawCircle(w, radius = u * 1.4f, center = c, style = line)
            drawCircle(w, radius = u * 0.8f, center = c, style = thin)
            drawCircle(w, radius = u * 0.2f, center = c)
        }
        Motif.KEY -> {
            drawCircle(w, radius = u * 0.7f, center = Offset(c.x - u * 0.7f, c.y), style = line)
            drawLine(w, Offset(c.x, c.y), Offset(c.x + u * 1.6f, c.y), strokeWidth = 5f)
            drawLine(w, Offset(c.x + u * 1.2f, c.y), Offset(c.x + u * 1.2f, c.y + u * 0.5f), strokeWidth = 5f)
            drawLine(w, Offset(c.x + u * 1.6f, c.y), Offset(c.x + u * 1.6f, c.y + u * 0.5f), strokeWidth = 5f)
        }
        Motif.LOCK -> {
            drawArc(w, startAngle = 180f, sweepAngle = 180f, useCenter = false,
                topLeft = Offset(c.x - u * 0.6f, c.y - u * 1.2f), size = Size(u * 1.2f, u * 1.2f), style = line)
            drawRect(w, topLeft = Offset(c.x - u * 0.9f, c.y - u * 0.3f),
                size = Size(u * 1.8f, u * 1.3f), style = line)
            drawCircle(w, radius = u * 0.18f, center = Offset(c.x, c.y + u * 0.35f))
        }
        Motif.EYE -> {
            drawOval(w, topLeft = Offset(c.x - u * 1.6f, c.y - u * 0.7f),
                size = Size(u * 3.2f, u * 1.4f), style = line)
            drawCircle(w, radius = u * 0.45f, center = c, style = line)
            drawCircle(w, radius = u * 0.15f, center = c)
        }
        Motif.SHIELD -> {
            val path = Path().apply {
                moveTo(c.x, c.y - u * 1.3f)
                lineTo(c.x + u, c.y - u * 0.9f)
                lineTo(c.x + u, c.y + u * 0.3f)
                lineTo(c.x, c.y + u * 1.3f)
                lineTo(c.x - u, c.y + u * 0.3f)
                lineTo(c.x - u, c.y - u * 0.9f)
                close()
            }
            drawPath(path, w, style = line)
            drawLine(w, Offset(c.x, c.y - u * 0.6f), Offset(c.x, c.y + u * 0.6f), strokeWidth = 3f)
        }
        Motif.NETWORK -> {
            val nodes = listOf(
                Offset(c.x - u, c.y - u * 0.8f), Offset(c.x + u, c.y - u * 0.8f),
                Offset(c.x - u, c.y + u * 0.8f), Offset(c.x + u, c.y + u * 0.8f), c
            )
            nodes.forEach { n -> drawLine(w, c, n, strokeWidth = 3f) }
            nodes.forEach { n -> drawCircle(w, radius = u * 0.3f, center = n, style = line) }
        }
        Motif.ENVELOPE -> {
            drawRect(w, topLeft = Offset(c.x - u * 1.5f, c.y - u * 0.9f),
                size = Size(u * 3f, u * 1.8f), style = line)
            drawLine(w, Offset(c.x - u * 1.5f, c.y - u * 0.9f), c, strokeWidth = 3f)
            drawLine(w, Offset(c.x + u * 1.5f, c.y - u * 0.9f), c, strokeWidth = 3f)
        }
        Motif.DEVICE -> {
            drawRect(w, topLeft = Offset(c.x - u * 0.8f, c.y - u * 1.3f),
                size = Size(u * 1.6f, u * 2.6f), style = line)
            drawLine(w, Offset(c.x - u * 0.4f, c.y + u * 0.9f), Offset(c.x + u * 0.4f, c.y + u * 0.9f), strokeWidth = 3f)
        }
        Motif.CHAIN -> {
            drawOval(w, topLeft = Offset(c.x - u * 1.4f, c.y - u * 0.5f),
                size = Size(u * 1.4f, u), style = line)
            drawOval(w, topLeft = Offset(c.x, c.y - u * 0.5f),
                size = Size(u * 1.4f, u), style = line)
        }
        Motif.MAP -> {
            drawCircle(w, radius = u * 0.8f, center = Offset(c.x, c.y - u * 0.3f), style = line)
            val path = Path().apply {
                moveTo(c.x - u * 0.7f, c.y + u * 0.2f)
                lineTo(c.x, c.y + u * 1.4f)
                lineTo(c.x + u * 0.7f, c.y + u * 0.2f)
                close()
            }
            drawPath(path, w, style = line)
        }
        Motif.HOURGLASS -> {
            val path = Path().apply {
                moveTo(c.x - u, c.y - u * 1.2f)
                lineTo(c.x + u, c.y - u * 1.2f)
                lineTo(c.x, c.y)
                lineTo(c.x + u, c.y + u * 1.2f)
                lineTo(c.x - u, c.y + u * 1.2f)
                lineTo(c.x, c.y)
                close()
            }
            drawPath(path, w, style = line)
            drawLine(w, Offset(c.x - u, c.y - u * 1.2f), Offset(c.x + u, c.y - u * 1.2f), strokeWidth = 5f)
            drawLine(w, Offset(c.x - u, c.y + u * 1.2f), Offset(c.x + u, c.y + u * 1.2f), strokeWidth = 5f)
        }
        Motif.SCALE -> {
            drawLine(w, Offset(c.x, c.y - u * 1.2f), Offset(c.x, c.y + u * 1.2f), strokeWidth = 5f)
            drawLine(w, Offset(c.x - u * 1.3f, c.y - u * 0.6f), Offset(c.x + u * 1.3f, c.y - u * 0.6f), strokeWidth = 5f)
            drawArc(w, startAngle = 0f, sweepAngle = 180f, useCenter = false,
                topLeft = Offset(c.x - u * 1.6f, c.y - u * 0.6f), size = Size(u * 0.6f, u * 0.6f), style = thin)
            drawArc(w, startAngle = 0f, sweepAngle = 180f, useCenter = false,
                topLeft = Offset(c.x + u, c.y - u * 0.6f), size = Size(u * 0.6f, u * 0.6f), style = thin)
        }
        Motif.MASK -> {
            drawOval(w, topLeft = Offset(c.x - u * 1.2f, c.y - u * 0.9f),
                size = Size(u * 2.4f, u * 1.8f), style = line)
            drawCircle(Ink.Black, radius = u * 0.25f, center = Offset(c.x - u * 0.5f, c.y))
            drawCircle(Ink.Black, radius = u * 0.25f, center = Offset(c.x + u * 0.5f, c.y))
            drawCircle(w, radius = u * 0.25f, center = Offset(c.x - u * 0.5f, c.y), style = thin)
            drawCircle(w, radius = u * 0.25f, center = Offset(c.x + u * 0.5f, c.y), style = thin)
        }
        Motif.BOOK -> {
            drawRect(w, topLeft = Offset(c.x - u * 1.2f, c.y - u),
                size = Size(u * 2.4f, u * 2f), style = line)
            drawLine(w, Offset(c.x, c.y - u), Offset(c.x, c.y + u), strokeWidth = 3f)
            drawLine(w, Offset(c.x - u * 0.8f, c.y - u * 0.4f), Offset(c.x - u * 0.3f, c.y - u * 0.4f), strokeWidth = 3f)
            drawLine(w, Offset(c.x + u * 0.3f, c.y - u * 0.4f), Offset(c.x + u * 0.8f, c.y - u * 0.4f), strokeWidth = 3f)
        }
        Motif.STAIRS -> {
            val steps = listOf(
                Offset(c.x - u * 1.5f, c.y + u * 0.3f), Offset(c.x - u * 0.7f, c.y + u * 0.3f),
                Offset(c.x - u * 0.7f, c.y - u * 0.4f), Offset(c.x + u * 0.1f, c.y - u * 0.4f),
                Offset(c.x + u * 0.1f, c.y - u), Offset(c.x + u * 0.9f, c.y - u)
            )
            var prev = Offset(c.x - u * 1.5f, c.y + u)
            steps.forEach { p -> drawLine(w, prev, p, strokeWidth = 5f); prev = p }
        }
        Motif.WARNING -> {
            val yellow = Color(0xFFFFC107)
            val path = Path().apply {
                moveTo(c.x, c.y - u * 1.2f)
                lineTo(c.x + u * 1.3f, c.y + u)
                lineTo(c.x - u * 1.3f, c.y + u)
                close()
            }
            drawPath(path, yellow, style = line)
            drawLine(yellow, Offset(c.x, c.y - u * 0.4f), Offset(c.x, c.y + u * 0.3f), strokeWidth = 5f)
            drawCircle(yellow, radius = u * 0.12f, center = Offset(c.x, c.y + u * 0.6f))
        }
        Motif.DANGER -> {
            val red = Color(0xFFE53935)
            drawLine(red, Offset(c.x - u * 0.8f, c.y - u * 0.8f), Offset(c.x + u * 0.8f, c.y + u * 0.8f), strokeWidth = 6f)
            drawLine(red, Offset(c.x + u * 0.8f, c.y - u * 0.8f), Offset(c.x - u * 0.8f, c.y + u * 0.8f), strokeWidth = 6f)
            drawCircle(red, radius = u * 1.3f, center = c, style = line)
        }
    }
}

/** One vector illustration, drawn on a black canvas. */
@Composable
fun BriefIllustration(motif: Motif, modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .height(120.dp)
    ) {
        drawMotif(motif)
    }
}
