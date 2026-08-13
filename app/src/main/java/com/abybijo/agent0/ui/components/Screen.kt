package com.abybijo.agent0.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.theme.Ink

/**
 * Standard screen chrome: black canvas, terminal header, optional back
 * affordance. Every screen in the app uses this so the frame never shifts.
 */
@Composable
fun Agent0Screen(
    title: String,
    modifier: Modifier = Modifier,
    eyebrow: String? = null,
    onBack: (() -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    listState: LazyListState = rememberLazyListState(),
    contentPadding: PaddingValues = PaddingValues(horizontal = 20.dp),
    content: LazyListScope.() -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Ink.Black)
            .statusBarsPadding()
    ) {
        ScreenHeader(title = title, eyebrow = eyebrow, onBack = onBack, action = action)
        LazyColumn(
            state = listState,
            modifier = Modifier.fillMaxSize(),
            contentPadding = contentPadding,
            verticalArrangement = Arrangement.spacedBy(0.dp)
        ) {
            content()
            item { Spacer(Modifier.height(36.dp)) }
        }
    }
}

/** Non-scrolling variant for screens that manage their own scroll. */
@Composable
fun Agent0Frame(
    title: String,
    modifier: Modifier = Modifier,
    eyebrow: String? = null,
    onBack: (() -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Ink.Black)
            .statusBarsPadding()
    ) {
        ScreenHeader(title = title, eyebrow = eyebrow, onBack = onBack, action = action)
        content()
    }
}

@Composable
private fun ScreenHeader(
    title: String,
    eyebrow: String?,
    onBack: (() -> Unit)?,
    action: (@Composable () -> Unit)?
) {
    val haptic = LocalHapticFeedback.current
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 14.dp, bottom = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (onBack != null) {
                Box(
                    modifier = Modifier
                        .size(34.dp)
                        .noRippleClickable {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            onBack()
                        },
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        "\u2190",
                        style = MaterialTheme.typography.headlineSmall,
                        color = Ink.Soft
                    )
                }
                Spacer(Modifier.width(4.dp))
            }
            Column(Modifier.weight(1f)) {
                if (eyebrow != null) {
                    Eyebrow(eyebrow)
                    Spacer(Modifier.height(4.dp))
                }
                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineSmall,
                    color = Ink.White,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
            if (action != null) {
                Spacer(Modifier.width(10.dp))
                action()
            }
        }
        SolidRule(color = Ink.Hairline)
        Spacer(Modifier.height(4.dp))
    }
}

/** Empty-state block used by search and filtered lists. */
@Composable
fun EmptyState(text: String, glyph: String = "\u2205", modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth().padding(vertical = 56.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(glyph, style = MaterialTheme.typography.displayLarge, color = Ink.Rule)
        Spacer(Modifier.height(14.dp))
        Text(text, style = MaterialTheme.typography.bodyMedium, color = Ink.Dim)
    }
}
