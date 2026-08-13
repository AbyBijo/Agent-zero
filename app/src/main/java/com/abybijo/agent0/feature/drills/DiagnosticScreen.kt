package com.abybijo.agent0.feature.drills

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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.Diagnostic
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.CheckGlyph
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.ScrambleText
import com.abybijo.agent0.ui.components.SolidRule
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

@Composable
fun DiagnosticScreen(
    progress: Progress,
    onBack: () -> Unit,
    onRecord: (Int) -> Unit
) {
    var answers by remember { mutableStateOf(setOf<Int>()) }
    var submitted by remember { mutableStateOf(false) }
    val haptic = LocalHapticFeedback.current

    val score = Diagnostic.items.withIndex()
        .filter { it.index in answers }
        .sumOf { it.value.weight }

    if (submitted) {
        DiagnosticResult(
            score = score,
            gaps = Diagnostic.items.withIndex()
                .filter { it.index !in answers }
                .sortedByDescending { it.value.weight }
                .map { it.value },
            onRetake = { answers = emptySet(); submitted = false },
            onBack = onBack
        )
        return
    }

    Agent0Screen(
        title = "Self-Diagnostic",
        eyebrow = "${answers.size}/${Diagnostic.items.size} answered",
        onBack = onBack
    ) {
        item {
            Spacer(Modifier.height(12.dp))
            RevealIn {
                Panel(background = Ink.Void) {
                    Text(
                        "Tick only what is true today — not what you intend to do. An " +
                            "honest low score is useful; an inflated one is worse than not " +
                            "taking the audit at all.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Mid
                    )
                    if (progress.diagTaken) {
                        Spacer(Modifier.height(12.dp))
                        DashRule()
                        Spacer(Modifier.height(12.dp))
                        Text(
                            "PREVIOUS: ${Diagnostic.grade(progress.diagScore)} \u00B7 " +
                                "${progress.diagScore}/${Diagnostic.maxScore}",
                            style = MaterialTheme.typography.labelSmall,
                            color = Ink.Dim
                        )
                    }
                }
            }
            Spacer(Modifier.height(18.dp))
        }

        itemsIndexed(Diagnostic.items) { i, item ->
            val checked = i in answers
            RevealIn(delayMillis = 40 + (i.coerceAtMost(12)) * 30) {
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .noRippleClickable {
                                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                answers = if (checked) answers - i else answers + i
                            }
                            .padding(vertical = 14.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Box(Modifier.width(30.dp).padding(top = 2.dp)) {
                            CheckGlyph(checked = checked, size = 15.dp)
                        }
                        Text(
                            item.prompt,
                            style = MaterialTheme.typography.bodyMedium,
                            color = if (checked) Ink.White else Ink.Soft,
                            modifier = Modifier.weight(1f)
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "\u00D7${item.weight}",
                            style = MaterialTheme.typography.labelSmall,
                            color = Ink.Rule
                        )
                    }
                    SolidRule(color = Ink.Hairline)
                }
            }
        }

        item {
            Spacer(Modifier.height(22.dp))
            PrimaryButton(
                text = "Score my posture",
                leading = "\u25B8",
                modifier = Modifier.fillMaxWidth(),
                onClick = { onRecord(score); submitted = true }
            )
        }
    }
}

@Composable
private fun DiagnosticResult(
    score: Int,
    gaps: List<com.abybijo.agent0.data.DiagnosticItem>,
    onRetake: () -> Unit,
    onBack: () -> Unit
) {
    val pct = score * 100 / Diagnostic.maxScore

    Agent0Screen(title = "Posture Report", eyebrow = "Local only \u00B7 not transmitted", onBack = onBack) {
        item {
            Spacer(Modifier.height(18.dp))
            RevealIn {
                Panel {
                    Eyebrow("Assessment")
                    Spacer(Modifier.height(12.dp))
                    ScrambleText(
                        text = Diagnostic.grade(score),
                        style = MaterialTheme.typography.displayLarge,
                        durationMillis = 800
                    )
                    Spacer(Modifier.height(14.dp))
                    Row(verticalAlignment = Alignment.Bottom) {
                        Text(
                            "$score",
                            style = MaterialTheme.typography.headlineMedium,
                            color = Ink.White
                        )
                        Text(
                            " / ${Diagnostic.maxScore}",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Ink.Dim
                        )
                        Spacer(Modifier.weight(1f))
                        Text(
                            "$pct%",
                            style = MaterialTheme.typography.headlineMedium,
                            color = Ink.White
                        )
                    }
                    Spacer(Modifier.height(16.dp))
                    AsciiBar(score.toFloat() / Diagnostic.maxScore, slots = 22, showPercent = false)
                    Spacer(Modifier.height(18.dp))
                    Text(
                        Diagnostic.verdict(score),
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Soft
                    )
                }
            }
            Spacer(Modifier.height(22.dp))
        }

        if (gaps.isNotEmpty()) {
            item {
                RevealIn(delayMillis = 80) {
                    Eyebrow("Gaps \u00B7 highest impact first")
                }
                Spacer(Modifier.height(6.dp))
            }
            itemsIndexed(gaps.take(12)) { i, gap ->
                RevealIn(delayMillis = 120 + i * 35) {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(vertical = 13.dp),
                            verticalAlignment = Alignment.Top
                        ) {
                            Text(
                                (i + 1).toString().padStart(2, '0'),
                                style = MaterialTheme.typography.labelSmall,
                                color = Ink.Dim,
                                modifier = Modifier.width(28.dp).padding(top = 2.dp)
                            )
                            Text(
                                gap.prompt,
                                style = MaterialTheme.typography.bodyMedium,
                                color = Ink.Soft,
                                modifier = Modifier.weight(1f)
                            )
                            Spacer(Modifier.width(10.dp))
                            Tag("w${gap.weight}")
                        }
                        SolidRule(color = Ink.Hairline)
                    }
                }
            }
        } else {
            item {
                RevealIn {
                    Panel(background = Ink.Void) {
                        Text(
                            "No gaps recorded. Maintain the routine and re-run this monthly " +
                                "— posture decays quietly.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Soft
                        )
                    }
                }
            }
        }

        item {
            Spacer(Modifier.height(22.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                GhostButton(text = "Retake", leading = "\u21BB", onClick = onRetake)
                PrimaryButton(
                    text = "Done",
                    leading = "\u2713",
                    modifier = Modifier.weight(1f),
                    onClick = onBack
                )
            }
        }
    }
}
