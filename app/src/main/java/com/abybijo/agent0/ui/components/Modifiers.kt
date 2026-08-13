package com.abybijo.agent0.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed

/**
 * Clickable with no Material ripple. Agent-0 never uses ripples — feedback is
 * carried by scale, inversion and haptics instead, which keeps the monochrome
 * surface perfectly clean.
 */
fun Modifier.noRippleClickable(
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    onClick: () -> Unit
): Modifier = composed {
    val source = interactionSource ?: remember { MutableInteractionSource() }
    clickable(
        interactionSource = source,
        indication = null,
        enabled = enabled,
        onClick = onClick
    )
}

/** Convenience for a composable-scoped interaction source. */
@Composable
fun rememberInteraction(): MutableInteractionSource = remember { MutableInteractionSource() }
