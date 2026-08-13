package com.abybijo.agent0.feature.drills

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.ChecklistGroup
import com.abybijo.agent0.data.Checklists
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.CheckGlyph
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.Motion

@Composable
fun ChecklistScreen(
    progress: Progress,
    onBack: () -> Unit,
    onToggle: (String) -> Unit,
    onReset: (String) -> Unit
) {
    var expanded by rememberSaveable { mutableStateOf(Checklists.groups.first().id) }

    Agent0Screen(
        title = "Checklists",
        eyebrow = "${progress.checkedItems.size}/${Checklists.totalItems} items complete",
        onBack = onBack
    ) {
        item {
            Spacer(Modifier.height(12.dp))
            RevealIn { AsciiBar(progress.checklistFraction, slots = 24) }
            Spacer(Modifier.height(18.dp))
        }

        itemsIndexed(Checklists.groups) { i, group ->
            RevealIn(delayMillis = 50 + i * 40) {
                ChecklistCard(
                    group = group,
                    checked = progress.checkedItems,
                    expanded = expanded == group.id,
                    onExpand = { expanded = if (expanded == group.id) "" else group.id },
                    onToggle = onToggle,
                    onReset = { onReset(group.id) }
                )
            }
            Spacer(Modifier.height(10.dp))
        }
    }
}

@Composable
private fun ChecklistCard(
    group: ChecklistGroup,
    checked: Set<String>,
    expanded: Boolean,
    onExpand: () -> Unit,
    onToggle: (String) -> Unit,
    onReset: () -> Unit
) {
    val done = group.items.indices.count { "${group.id}/$it" in checked }
    val total = group.items.size
    val haptic = LocalHapticFeedback.current

    val chevron by animateFloatAsState(
        targetValue = if (expanded) 90f else 0f,
        animationSpec = tween(Motion.Normal, easing = Motion.Decode),
        label = "chevron"
    )

    Panel(
        borderColor = if (done == total) Ink.Rule else Ink.Hairline,
        padding = 0.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .noRippleClickable(onClick = onExpand)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                group.glyph,
                style = MaterialTheme.typography.headlineSmall,
                color = Ink.Soft,
                modifier = Modifier.width(36.dp)
            )
            Column(Modifier.weight(1f)) {
                Text(
                    group.title,
                    style = MaterialTheme.typography.titleMedium,
                    color = Ink.White
                )
                Spacer(Modifier.height(5.dp))
                Text(
                    "$done/$total complete",
                    style = MaterialTheme.typography.labelSmall,
                    color = Ink.Dim
                )
            }
            Text(
                "\u203A",
                style = MaterialTheme.typography.headlineSmall,
                color = Ink.Rule,
                modifier = Modifier.rotate(chevron)
            )
        }

        AnimatedVisibility(
            visible = expanded,
            enter = fadeIn(tween(Motion.Fast)) + expandVertically(tween(Motion.Normal, easing = Motion.Decode)),
            exit = fadeOut(tween(Motion.Instant)) + shrinkVertically(tween(Motion.Fast))
        ) {
            Column(Modifier.padding(horizontal = 16.dp)) {
                DashRule()
                group.items.forEachIndexed { i, item ->
                    val key = "${group.id}/$i"
                    val isChecked = key in checked
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .noRippleClickable {
                                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                onToggle(key)
                            }
                            .padding(vertical = 13.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Box(Modifier.width(30.dp).padding(top = 2.dp)) {
                            CheckGlyph(checked = isChecked, size = 15.dp)
                        }
                        Text(
                            text = item,
                            style = MaterialTheme.typography.bodyMedium,
                            color = if (isChecked) Ink.Dim else Ink.Soft,
                            textDecoration = if (isChecked) TextDecoration.LineThrough else null
                        )
                    }
                }
                DashRule()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 14.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        "RESET GROUP",
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim,
                        modifier = Modifier.noRippleClickable {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                            onReset()
                        }
                    )
                }
            }
        }
    }
}
