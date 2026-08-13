package com.abybijo.agent0.feature.drills

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.QuizBank
import com.abybijo.agent0.data.QuizQuestion
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.ScrambleText
import com.abybijo.agent0.ui.components.TypewriterText
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.Motion

private const val QUESTION_COUNT = 10

@Composable
fun QuizScreen(
    progress: Progress,
    onBack: () -> Unit,
    onRecord: (Int) -> Unit
) {
    var seed by remember { mutableStateOf(System.currentTimeMillis()) }
    val questions = remember(seed) { QuizBank.session(QUESTION_COUNT, seed) }

    var index by remember(seed) { mutableIntStateOf(0) }
    var selected by remember(seed) { mutableStateOf<Int?>(null) }
    var score by remember(seed) { mutableIntStateOf(0) }
    var finished by remember(seed) { mutableStateOf(false) }
    var wrong by remember(seed) { mutableStateOf(listOf<QuizQuestion>()) }

    val haptic = LocalHapticFeedback.current

    if (finished) {
        QuizResult(
            score = score,
            total = questions.size,
            wrong = wrong,
            best = progress.quizBest,
            onRetry = { seed = System.currentTimeMillis() },
            onBack = onBack
        )
        return
    }

    val q = questions[index]

    Agent0Screen(
        title = "Assessment",
        eyebrow = "Question ${index + 1} of ${questions.size}",
        onBack = onBack
    ) {
        item {
            Spacer(Modifier.height(14.dp))
            AsciiBar((index).toFloat() / questions.size, slots = 24, showPercent = false)
            Spacer(Modifier.height(24.dp))
        }

        item(key = "q$index") {
            RevealIn {
                TypewriterText(
                    text = q.prompt,
                    style = MaterialTheme.typography.headlineSmall,
                    charDelayMillis = 14
                )
            }
            Spacer(Modifier.height(22.dp))
        }

        itemsIndexed(q.options) { i, option ->
            key(index, i) {
                RevealIn(delayMillis = 120 + i * 50) {
                    OptionRow(
                        label = ('A' + i).toString(),
                        text = option,
                        state = when {
                            selected == null -> OptionState.IDLE
                            i == q.answerIndex -> OptionState.CORRECT
                            i == selected -> OptionState.WRONG
                            else -> OptionState.DIMMED
                        },
                        onClick = {
                            if (selected == null) {
                                selected = i
                                if (i == q.answerIndex) {
                                    score++
                                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                                } else {
                                    wrong = wrong + q
                                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                                }
                            }
                        }
                    )
                }
                Spacer(Modifier.height(9.dp))
            }
        }

        item {
            AnimatedVisibility(
                visible = selected != null,
                enter = fadeIn(tween(Motion.Normal)) + expandVertically(tween(Motion.Normal))
            ) {
                Column {
                    Spacer(Modifier.height(14.dp))
                    Panel(background = Ink.Void, borderColor = Ink.Rule) {
                        Eyebrow(
                            if (selected == q.answerIndex) "\u2713 Correct" else "\u2715 Incorrect"
                        )
                        Spacer(Modifier.height(10.dp))
                        Text(
                            q.rationale,
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Soft
                        )
                    }
                    Spacer(Modifier.height(18.dp))
                    PrimaryButton(
                        text = if (index == questions.lastIndex) "See results" else "Next",
                        leading = "\u2192",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {
                            if (index == questions.lastIndex) {
                                onRecord(score)
                                finished = true
                            } else {
                                index++
                                selected = null
                            }
                        }
                    )
                }
            }
        }
    }
}

private enum class OptionState { IDLE, CORRECT, WRONG, DIMMED }

@Composable
private fun OptionRow(
    label: String,
    text: String,
    state: OptionState,
    onClick: () -> Unit
) {
    val border = when (state) {
        OptionState.IDLE -> Ink.Hairline
        OptionState.CORRECT -> Ink.White
        OptionState.WRONG -> Ink.Rule
        OptionState.DIMMED -> Ink.Hairline
    }
    val textColor = when (state) {
        OptionState.IDLE -> Ink.Soft
        OptionState.CORRECT -> Ink.White
        OptionState.WRONG -> Ink.Mid
        OptionState.DIMMED -> Ink.Rule
    }
    val scale by animateFloatAsState(
        targetValue = if (state == OptionState.CORRECT) 1.01f else 1f,
        animationSpec = tween(Motion.Normal, easing = Motion.Decode),
        label = "optScale"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .scale(scale)
            .clip(RoundedCornerShape(2.dp))
            .background(if (state == OptionState.CORRECT) Ink.PanelHi else Ink.Panel)
            .border(1.dp, border, RoundedCornerShape(2.dp))
            .noRippleClickable(enabled = state == OptionState.IDLE, onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 15.dp),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            label,
            style = MaterialTheme.typography.labelSmall,
            color = if (state == OptionState.CORRECT) Ink.White else Ink.Dim,
            modifier = Modifier.width(24.dp).padding(top = 2.dp)
        )
        Text(text, style = MaterialTheme.typography.bodyMedium, color = textColor)
        if (state == OptionState.CORRECT) {
            Spacer(Modifier.weight(1f))
            Text("\u2713", style = MaterialTheme.typography.bodyMedium, color = Ink.White)
        }
        if (state == OptionState.WRONG) {
            Spacer(Modifier.weight(1f))
            Text("\u2715", style = MaterialTheme.typography.bodyMedium, color = Ink.Mid)
        }
    }
}

@Composable
private fun QuizResult(
    score: Int,
    total: Int,
    wrong: List<QuizQuestion>,
    best: Int,
    onRetry: () -> Unit,
    onBack: () -> Unit
) {
    val pct = if (total == 0) 0 else score * 100 / total
    val verdict = when {
        pct >= 90 -> "EXCELLENT"
        pct >= 70 -> "SOLID"
        pct >= 50 -> "PASSABLE"
        else -> "NEEDS WORK"
    }

    Agent0Screen(title = "Results", eyebrow = "Assessment complete", onBack = onBack) {
        item {
            Spacer(Modifier.height(18.dp))
            RevealIn {
                Panel {
                    Eyebrow("Score")
                    Spacer(Modifier.height(10.dp))
                    Row(verticalAlignment = Alignment.Bottom) {
                        ScrambleText(
                            text = "$score",
                            style = MaterialTheme.typography.displayLarge,
                            durationMillis = 600
                        )
                        Text(
                            " / $total",
                            style = MaterialTheme.typography.headlineMedium,
                            color = Ink.Dim
                        )
                        Spacer(Modifier.weight(1f))
                        Text(
                            verdict,
                            style = MaterialTheme.typography.titleMedium,
                            color = Ink.White
                        )
                    }
                    Spacer(Modifier.height(16.dp))
                    AsciiBar(score.toFloat() / total, slots = 22)
                    Spacer(Modifier.height(14.dp))
                    Text(
                        "Personal best: ${maxOf(best, score)}/$total",
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim
                    )
                }
            }
            Spacer(Modifier.height(20.dp))
        }

        if (wrong.isNotEmpty()) {
            item {
                RevealIn(delayMillis = 80) { Eyebrow("Review \u00B7 ${wrong.size} missed") }
                Spacer(Modifier.height(12.dp))
            }
            itemsIndexed(wrong) { i, q ->
                RevealIn(delayMillis = 120 + i * 45) {
                    Panel(background = Ink.Void) {
                        Text(
                            q.prompt,
                            style = MaterialTheme.typography.titleMedium,
                            color = Ink.White
                        )
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "\u2713 ${q.options[q.answerIndex]}",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Soft
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            q.rationale,
                            style = MaterialTheme.typography.bodySmall,
                            color = Ink.Mid
                        )
                    }
                }
                Spacer(Modifier.height(9.dp))
            }
        }

        item {
            Spacer(Modifier.height(16.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                GhostButton(text = "Done", onClick = onBack)
                PrimaryButton(
                    text = "New set",
                    leading = "\u21BB",
                    modifier = Modifier.weight(1f),
                    onClick = onRetry
                )
            }
        }
    }
}
