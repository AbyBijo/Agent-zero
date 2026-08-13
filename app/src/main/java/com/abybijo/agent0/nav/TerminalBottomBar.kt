package com.abybijo.agent0.nav

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.components.SolidRule
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.Motion

/**
 * Bottom navigation, rebuilt from scratch rather than using Material's
 * NavigationBar — no ripples, no pill indicator, no colour. The active tab is
 * marked by a white rule that grows above it and by luminance alone.
 */
@Composable
fun TerminalBottomBar(
    current: String?,
    onSelect: (Tab) -> Unit,
    modifier: Modifier = Modifier
) {
    val haptic = LocalHapticFeedback.current

    Column(modifier = modifier.fillMaxWidth().background(Ink.Void)) {
        SolidRule(color = Ink.Hairline)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 6.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Tab.entries.forEach { tab ->
                val selected = current == tab.route
                TabItem(
                    tab = tab,
                    selected = selected,
                    onClick = {
                        if (!selected) {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            onSelect(tab)
                        }
                    }
                )
            }
        }
    }
}

@Composable
private fun TabItem(tab: Tab, selected: Boolean, onClick: () -> Unit) {
    val alpha by animateFloatAsState(
        targetValue = if (selected) 1f else 0.42f,
        animationSpec = tween(Motion.Fast, easing = Motion.Snap),
        label = "tabAlpha"
    )
    val scale by animateFloatAsState(
        targetValue = if (selected) 1f else 0.94f,
        animationSpec = tween(Motion.Fast, easing = Motion.Snap),
        label = "tabScale"
    )
    val markerWidth by animateDpAsState(
        targetValue = if (selected) 18.dp else 0.dp,
        animationSpec = tween(Motion.Normal, easing = Motion.Decode),
        label = "tabMarker"
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .noRippleClickable(onClick = onClick)
            .padding(horizontal = 10.dp, vertical = 4.dp)
            .scale(scale)
    ) {
        Box(
            modifier = Modifier
                .height(2.dp)
                .width(markerWidth)
                .background(Ink.White)
        )
        Spacer(Modifier.height(7.dp))
        Text(
            text = tab.glyph,
            style = MaterialTheme.typography.bodyLarge,
            color = Ink.White,
            modifier = Modifier.alpha(alpha)
        )
        Spacer(Modifier.height(3.dp))
        Text(
            text = tab.label.uppercase(),
            style = MaterialTheme.typography.labelSmall,
            color = Ink.White,
            modifier = Modifier.alpha(alpha)
        )
    }
}
