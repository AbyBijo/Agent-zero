package com.abybijo.agent0.feature.drills

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.data.QuizBankFinal
import com.abybijo.agent0.data.QuizQuestion
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.EmptyState
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink
import kotlinx.coroutines.delay
import kotlin.random.Random

/**
 * v2.0 Phase 5d — Final Exam (user decision 2026-10-27).
 *
 * A DEDICATED questionnaire (QuizBankFinal, not the practice bank):
 * 100 MCQs aligned to the curriculum, at least half Advanced.
 * 30-minute window; pass mark 70/100. Unlocks only after all 120
 * briefs are complete (enforced by the Profile button, and by the
 * caller gating this route). Every attempt jumbles BOTH question
 * order and option order, so retakes never look alike. Leaving
 * mid-exam abandons that attempt; a retake draws a fresh jumble.
 * Unanswered questions count as wrong. The result is stored
 * locally only, via [onExamPassed]; nothing is transmitted.
 */
const val FINAL_EXAM_QUESTIONS = 100
const val FINAL_EXAM_MINUTES = 30
const val FINAL_EXAM_PASS = 70

private data class ExamItem(
    val question: QuizQuestion,
    val options: List<String>,
    val answerIndex: Int
)

@Composable
fun FinalExamScreen(
    onBack: () -> Unit,
    onExamPassed: (Long) -> Unit,
    onOpenProfile: () -> Unit
) {
    var seed by remember { mutableStateOf(System.currentTimeMillis()) }

    // Fresh jumble per attempt: questions shuffled, then each
    // question's options shuffled with its answer remapped.
    val items = remember(seed) {
        val rng = Random(seed)
        QuizBankFinal.all.shuffled(rng).take(FINAL_EXAM_QUESTIONS).map { q ->
            val order = q.options.indices.shuffled(rng)
            ExamItem(q, order.map { q.options[it] }, order.indexOf(q.answerIndex))
        }
    }

    var index by remember(seed) { mutableIntStateOf(0) }
    val answers = remember(seed) { mutableStateMapOf<Int, Int>() }
    var submitted by remember(seed) { mutableStateOf(false) }
    var score by remember(seed) { mutableIntStateOf(0) }
    var recorded by remember(seed) { mutableStateOf(false) }

    val totalSeconds = FINAL_EXAM_MINUTES * 60
    val deadlineMs = remember(seed) { System.currentTimeMillis() + totalSeconds * 1000L }
    var remaining by remember(seed) { mutableIntStateOf(totalSeconds) }

    fun submit() {
        if (submitted) return
        score = items.indices.count { answers[it] == items[it].answerIndex }
        submitted = true
    }

    LaunchedEffect(seed) {
        while (remaining > 0) {
            delay(1000)
            remaining = ((deadlineMs - System.currentTimeMillis()) / 1000)
                .toInt().coerceAtLeast(0)
        }
    }
    LaunchedEffect(remaining) {
        if (remaining == 0 && !submitted) submit()
    }
    LaunchedEffect(submitted) {
        if (submitted && score >= FINAL_EXAM_PASS && !recorded) {
            recorded = true
            onExamPassed(System.currentTimeMillis())
        }
    }

    if (items.size < FINAL_EXAM_QUESTIONS) {
        Agent0Screen(title = "Final exam", onBack = onBack) {
            item { EmptyState("The final exam bank is incomplete. Please report this.") }
        }
        return
    }

    val minutes = remaining / 60
    val seconds = remaining % 60
    val timeText = "%d:%02d".format(minutes, seconds)

    Agent0Screen(
        title = "Final exam",
        eyebrow = if (submitted) "Result" else "Question ${index + 1} of ${items.size} \u00B7 $timeText left",
        onBack = onBack
    ) {
        if (submitted) {
            item {
                Spacer(Modifier.height(14.dp))
                RevealIn {
                    Panel {
                        Eyebrow(if (score >= FINAL_EXAM_PASS) "Passed" else "Not passed")
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "$score / ${items.size}",
                            style = MaterialTheme.typography.displaySmall,
                            color = Ink.White
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            if (score >= FINAL_EXAM_PASS) {
                                "You passed the final exam. Your certificate is unlocked in your profile."
                            } else {
                                "Pass mark is $FINAL_EXAM_PASS. Review the course and retake — " +
                                    "every retake is a fresh jumble of questions and options."
                            },
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Mid
                        )
                    }
                }
                Spacer(Modifier.height(20.dp))
                if (score >= FINAL_EXAM_PASS) {
                    PrimaryButton(
                        text = "View profile",
                        leading = "\u2192",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = onOpenProfile
                    )
                } else {
                    PrimaryButton(
                        text = "Retake exam",
                        leading = "\u21BB",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {
                            seed = System.currentTimeMillis()
                            index = 0
                            answers.clear()
                            submitted = false
                            score = 0
                            recorded = false
                        }
                    )
                }
                Spacer(Modifier.height(12.dp))
                GhostButton(text = "Back", leading = "\u2190", onClick = onBack)
            }
            return@Agent0Screen
        }

        // NOTE: named `current`, not `item` — a local called `item`
        // would shadow LazyListScope.item and break compilation.
        val current = items[index]
        item {
            Spacer(Modifier.height(14.dp))
            Text(
                "Unanswered questions count as wrong. Leaving abandons this attempt.",
                style = MaterialTheme.typography.bodySmall,
                color = Ink.Dim
            )
            Spacer(Modifier.height(16.dp))
        }

        item(key = "q$index") {
            RevealIn {
                Text(
                    current.question.prompt,
                    style = MaterialTheme.typography.headlineSmall,
                    color = Ink.White
                )
            }
            Spacer(Modifier.height(20.dp))
        }

        // Option rows (local: QuizScreen's OptionRow is private to it).
        current.options.forEachIndexed { oi, option ->
            item(key = "q${index}o$oi") {
                val selected = answers[index] == oi
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                        .background(if (selected) Ink.Soft else Ink.Void)
                        .border(
                            1.dp,
                            if (selected) Ink.White else Ink.Rule,
                            RoundedCornerShape(10.dp)
                        )
                        .noRippleClickable { answers[index] = oi }
                        .padding(14.dp)
                ) {
                    Row {
                        Text(
                            "${('A' + oi)}",
                            style = MaterialTheme.typography.bodyMedium,
                            color = if (selected) Ink.White else Ink.Dim
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            option,
                            style = MaterialTheme.typography.bodyMedium,
                            color = if (selected) Ink.White else Ink.Mid
                        )
                    }
                }
                Spacer(Modifier.height(10.dp))
            }
        }

        item {
            Spacer(Modifier.height(10.dp))
            Row {
                GhostButton(
                    text = "Previous",
                    leading = "\u2190",
                    enabled = index > 0,
                    onClick = { if (index > 0) index-- }
                )
                Spacer(Modifier.width(10.dp))
                if (index < items.lastIndex) {
                    PrimaryButton(
                        text = "Next",
                        leading = "\u2192",
                        modifier = Modifier.weight(1f),
                        onClick = { index++ }
                    )
                } else {
                    PrimaryButton(
                        text = "Submit exam",
                        leading = "\u2713",
                        modifier = Modifier.weight(1f),
                        onClick = { submit() }
                    )
                }
            }
            Spacer(Modifier.height(12.dp))
            GhostButton(text = "Submit now", onClick = { submit() })
            Spacer(Modifier.height(8.dp))
            Text(
                "Answered ${answers.size} of ${items.size} \u00B7 $timeText remaining",
                style = MaterialTheme.typography.bodySmall,
                color = Ink.Dim
            )
            Spacer(Modifier.height(12.dp))
        }
    }
}
