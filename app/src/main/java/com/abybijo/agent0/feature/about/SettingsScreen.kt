package com.abybijo.agent0.feature.about

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.Checklists
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.StatRow
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.Motion

@Composable
fun SettingsScreen(
    progress: Progress,
    onBack: () -> Unit,
    onReduceMotion: (Boolean) -> Unit,
    onScanlines: (Boolean) -> Unit,
    onWipe: () -> Unit
) {
    var confirmWipe by remember { mutableStateOf(false) }

    Agent0Screen(title = "Settings", eyebrow = "Local configuration", onBack = onBack) {
        item {
            Spacer(Modifier.height(14.dp))
            RevealIn {
                Panel {
                    Eyebrow("Display & motion")
                    Spacer(Modifier.height(6.dp))
                    ToggleRow(
                        title = "Reduce motion",
                        subtitle = "Skips the boot sequence and shortens transitions.",
                        checked = progress.reduceMotion,
                        onChange = onReduceMotion
                    )
                    DashRule()
                    ToggleRow(
                        title = "CRT scanlines",
                        subtitle = "The terminal overlay across every screen.",
                        checked = progress.scanlines,
                        onChange = onScanlines
                    )
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        item {
            RevealIn(delayMillis = 70) {
                Panel(background = Ink.Void) {
                    Eyebrow("Stored on this device")
                    Spacer(Modifier.height(14.dp))
                    StatRow("Briefs read", "${progress.completedBriefs.size}/${Curriculum.totalBriefs}")
                    Spacer(Modifier.height(10.dp))
                    StatRow("Checklist items", "${progress.checkedItems.size}/${Checklists.totalItems}")
                    Spacer(Modifier.height(10.dp))
                    StatRow("Drills completed", "${progress.scenariosDone.size}")
                    Spacer(Modifier.height(10.dp))
                    StatRow("Bookmarks", "${progress.bookmarks.size}")
                    Spacer(Modifier.height(10.dp))
                    StatRow("Quiz attempts", "${progress.quizRuns}")
                    Spacer(Modifier.height(16.dp))
                    DashRule()
                    Spacer(Modifier.height(14.dp))
                    Text(
                        "This is the complete list of what Agent-0 knows about you. It never " +
                            "leaves the device, and uninstalling removes it entirely.",
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Mid
                    )
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        item {
            RevealIn(delayMillis = 120) {
                Panel(borderColor = Ink.Rule) {
                    Eyebrow("Burn local data")
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "Erase all progress, bookmarks, scores and settings. This cannot be " +
                            "undone and returns the app to a fresh install state.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Soft
                    )
                    Spacer(Modifier.height(18.dp))
                    if (!confirmWipe) {
                        GhostButton(
                            text = "Wipe everything",
                            leading = "\u26A0",
                            modifier = Modifier.fillMaxWidth(),
                            onClick = { confirmWipe = true }
                        )
                    } else {
                        Text(
                            "Confirm: this erases everything.",
                            style = MaterialTheme.typography.labelSmall,
                            color = Ink.White
                        )
                        Spacer(Modifier.height(12.dp))
                        Row {
                            GhostButton(text = "Cancel", onClick = { confirmWipe = false })
                            Spacer(Modifier.width(10.dp))
                            PrimaryButton(
                                text = "Confirm wipe",
                                leading = "\u2715",
                                modifier = Modifier.weight(1f),
                                onClick = { onWipe(); confirmWipe = false; onBack() }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ToggleRow(
    title: String,
    subtitle: String,
    checked: Boolean,
    onChange: (Boolean) -> Unit
) {
    val haptic = LocalHapticFeedback.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .noRippleClickable {
                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                onChange(!checked)
            }
            .padding(vertical = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(Modifier.weight(1f)) {
            Text(title, style = MaterialTheme.typography.titleMedium, color = Ink.White)
            Spacer(Modifier.height(5.dp))
            Text(subtitle, style = MaterialTheme.typography.bodySmall, color = Ink.Dim)
        }
        Spacer(Modifier.width(14.dp))
        TerminalSwitch(checked = checked)
    }
}

/** A switch drawn as a bracketed terminal toggle: [ ▓  ] / [  ▓ ] */
@Composable
private fun TerminalSwitch(checked: Boolean) {
    val offset by animateFloatAsState(
        targetValue = if (checked) 1f else 0f,
        animationSpec = tween(Motion.Fast, easing = Motion.Snap),
        label = "switch"
    )
    Box(
        modifier = Modifier
            .width(46.dp)
            .height(26.dp)
            .clip(RoundedCornerShape(2.dp))
            .background(if (checked) Ink.White else Ink.Panel)
            .border(1.dp, if (checked) Ink.White else Ink.Rule, RoundedCornerShape(2.dp)),
        contentAlignment = Alignment.CenterStart
    ) {
        Box(
            modifier = Modifier
                .offset(x = (4 + offset * 20).dp)
                .size(width = 16.dp, height = 16.dp)
                .background(if (checked) Ink.Black else Ink.Rule)
        )
    }
}
