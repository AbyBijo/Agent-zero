package com.abybijo.agent0.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.Motion

/** The standard bordered container. Sharp corners, hairline rule, no shadow. */
@Composable
fun Panel(
    modifier: Modifier = Modifier,
    padding: Dp = 16.dp,
    borderColor: Color = Ink.Hairline,
    background: Color = Ink.Panel,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(2.dp))
            .background(background)
            .border(BorderStroke(1.dp, borderColor), RoundedCornerShape(2.dp))
            .padding(padding),
        content = content
    )
}

/** Uppercase tracked-out label — the app's section eyebrow. */
@Composable
fun Eyebrow(text: String, modifier: Modifier = Modifier, color: Color = Ink.Dim) {
    Text(
        text = text.uppercase(),
        style = MaterialTheme.typography.labelSmall,
        color = color,
        modifier = modifier
    )
}

/** Small outlined tag. */
@Composable
fun Tag(text: String, modifier: Modifier = Modifier, filled: Boolean = false) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(2.dp))
            .background(if (filled) Ink.White else Color.Transparent)
            .border(1.dp, if (filled) Ink.White else Ink.Rule, RoundedCornerShape(2.dp))
            .padding(horizontal = 7.dp, vertical = 3.dp)
    ) {
        Text(
            text = text.uppercase(),
            style = MaterialTheme.typography.labelSmall,
            color = if (filled) Ink.Black else Ink.Mid,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

/** Dashed horizontal divider, terminal style. */
@Composable
fun DashRule(modifier: Modifier = Modifier, color: Color = Ink.Hairline) {
    Box(
        modifier
            .fillMaxWidth()
            .height(1.dp)
            .drawBehind {
                drawLine(
                    color = color,
                    start = Offset(0f, size.height / 2),
                    end = Offset(size.width, size.height / 2),
                    strokeWidth = size.height,
                    pathEffect = PathEffect.dashPathEffect(floatArrayOf(6f, 6f), 0f)
                )
            }
    )
}

@Composable
fun SolidRule(modifier: Modifier = Modifier, color: Color = Ink.Hairline) {
    Box(modifier.fillMaxWidth().height(1.dp).background(color))
}

/**
 * Primary action. Inverts to a white slab on press and fires a haptic tick —
 * the app's core micro-interaction.
 */
@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: String? = null
) {
    val interaction = remember { MutableInteractionSource() }
    val pressed by interaction.collectIsPressedAsState()
    val haptic = LocalHapticFeedback.current
    val scale by animateFloatAsState(
        targetValue = if (pressed) 0.975f else 1f,
        animationSpec = tween(Motion.Instant, easing = Motion.Snap),
        label = "btnScale"
    )
    val bg by animateFloatAsState(
        targetValue = if (pressed) 1f else 0f,
        animationSpec = tween(Motion.Fast, easing = Motion.Snap),
        label = "btnBg"
    )

    Box(
        modifier = modifier
            .scale(scale)
            .clip(RoundedCornerShape(2.dp))
            .background(lerpMono(Ink.White, bg, enabled))
            .border(1.dp, if (enabled) Ink.White else Ink.Rule, RoundedCornerShape(2.dp))
            .noRippleClickable(enabled = enabled, interactionSource = interaction) {
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                onClick()
            }
            .padding(horizontal = 20.dp, vertical = 13.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            if (leading != null) {
                Text(
                    leading,
                    style = MaterialTheme.typography.titleMedium,
                    color = if (enabled) Ink.Black else Ink.Dim
                )
                Spacer(Modifier.width(10.dp))
            }
            Text(
                text = text.uppercase(),
                style = MaterialTheme.typography.titleMedium,
                color = if (enabled) Ink.Black else Ink.Dim
            )
        }
    }
}

/** Secondary/ghost action: outlined, fills white on press. */
@Composable
fun GhostButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: String? = null
) {
    val interaction = remember { MutableInteractionSource() }
    val pressed by interaction.collectIsPressedAsState()
    val haptic = LocalHapticFeedback.current
    val fill by animateFloatAsState(
        targetValue = if (pressed) 1f else 0f,
        animationSpec = tween(Motion.Fast, easing = Motion.Snap),
        label = "ghostFill"
    )
    val scale by animateFloatAsState(
        targetValue = if (pressed) 0.975f else 1f,
        animationSpec = tween(Motion.Instant, easing = Motion.Snap),
        label = "ghostScale"
    )
    Box(
        modifier = modifier
            .scale(scale)
            .clip(RoundedCornerShape(2.dp))
            .background(Color.White.copy(alpha = fill))
            .border(1.dp, if (enabled) Ink.Rule else Ink.Hairline, RoundedCornerShape(2.dp))
            .noRippleClickable(enabled = enabled, interactionSource = interaction) {
                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                onClick()
            }
            .padding(horizontal = 18.dp, vertical = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            if (leading != null) {
                Text(
                    leading,
                    style = MaterialTheme.typography.bodyMedium,
                    color = blendOnFill(fill, enabled)
                )
                Spacer(Modifier.width(8.dp))
            }
            Text(
                text = text.uppercase(),
                style = MaterialTheme.typography.titleMedium,
                color = blendOnFill(fill, enabled)
            )
        }
    }
}

/** Key/value stat row used across dashboards. */
@Composable
fun StatRow(label: String, value: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(label.uppercase(), style = MaterialTheme.typography.labelSmall, color = Ink.Dim)
        Text(value, style = MaterialTheme.typography.titleMedium, color = Ink.White)
    }
}

/** A hollow / filled square used as the app's checkbox glyph. */
@Composable
fun CheckGlyph(checked: Boolean, modifier: Modifier = Modifier, size: Dp = 16.dp) {
    val t by animateFloatAsState(
        targetValue = if (checked) 1f else 0f,
        animationSpec = tween(Motion.Fast, easing = Motion.Snap),
        label = "check"
    )
    Box(
        modifier = modifier.size(size).drawBehind {
            drawRect(
                color = Ink.Rule.copy(alpha = 1f - 0.4f * t),
                style = Stroke(width = 2f)
            )
            if (t > 0f) {
                val inset = this.size.minDimension * (0.30f - 0.08f * t)
                drawRect(
                    color = Color.White.copy(alpha = t),
                    topLeft = Offset(inset, inset),
                    size = androidx.compose.ui.geometry.Size(
                        this.size.width - inset * 2,
                        this.size.height - inset * 2
                    )
                )
            }
        }
    )
}

private fun lerpMono(target: Color, t: Float, enabled: Boolean): Color =
    if (!enabled) Color.Transparent
    else Color(
        red = target.red,
        green = target.green,
        blue = target.blue,
        alpha = 0.86f + 0.14f * t
    )

private fun blendOnFill(fill: Float, enabled: Boolean): Color = when {
    !enabled -> Ink.Dim
    fill > 0.5f -> Ink.Black
    else -> Ink.White
}
