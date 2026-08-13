package com.abybijo.agent0.feature.drills

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.Outcome
import com.abybijo.agent0.data.Scenarios
import com.abybijo.agent0.ui.components.Agent0Frame
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.CheckGlyph
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.EmptyState
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.SolidRule
import com.abybijo.agent0.ui.components.TypewriterText
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.Motion

@Composable
fun ScenarioListScreen(
    progress: Progress,
    onBack: () -> Unit,
    onOpen: (String) -> Unit
) {
    Agent0Screen(
        title = "Scenario Drills",
        eyebrow = "${Scenarios.all.size} drills \u00B7 ${progress.scenariosDone.size} completed",
        onBack = onBack
    ) {
        item {
            Spacer(Modifier.height(12.dp))
            RevealIn {
                AsciiBar(progress.scenarioFraction, slots = 24)
            }
            Spacer(Modifier.height(6.dp))
            RevealIn(delayMillis = 40) {
                Text(
                    "There are no trick questions. Choose what you would actually do — " +
                        "a wrong path teaches more than a lucky guess.",
                    style = MaterialTheme.typography.bodySmall,
                    color = Ink.Dim,
                    modifier = Modifier.padding(vertical = 12.dp)
                )
            }
            Spacer(Modifier.height(6.dp))
        }

        itemsIndexed(Scenarios.all) { i, s ->
            val done = s.id in progress.scenariosDone
            RevealIn(delayMillis = 60 + (i.coerceAtMost(12)) * 35) {
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .noRippleClickable { onOpen(s.id) }
                            .padding(vertical = 16.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Box(Modifier.width(32.dp).padding(top = 2.dp)) {
                            CheckGlyph(checked = done, size = 15.dp)
                        }
                        Column(Modifier.weight(1f)) {
                            Text(
                                s.title,
                                style = MaterialTheme.typography.titleMedium,
                                color = if (done) Ink.Mid else Ink.White
                            )
                            Spacer(Modifier.height(6.dp))
                            Text(
                                s.intro.take(110).let { if (s.intro.length > 110) "$it\u2026" else it },
                                style = MaterialTheme.typography.bodySmall,
                                color = Ink.Dim
                            )
                        }
                        Text("\u203A", style = MaterialTheme.typography.headlineSmall, color = Ink.Rule)
                    }
                    SolidRule(color = Ink.Hairline)
                }
            }
        }
    }
}

@Composable
fun ScenarioScreen(
    scenarioId: String,
    onBack: () -> Unit,
    onComplete: (String) -> Unit
) {
    val scenario = Scenarios.byId(scenarioId)
    if (scenario == null) {
        Agent0Screen(title = "Not found", onBack = onBack) {
            item { EmptyState("That drill does not exist.") }
        }
        return
    }

    var stepId by remember(scenarioId) { mutableStateOf<String?>(null) }
    var path by remember(scenarioId) { mutableStateOf(listOf<String>()) }
    val haptic = LocalHapticFeedback.current

    val step = stepId?.let { scenario.steps[it] }

    LaunchedEffect(step?.outcome) {
        if (step?.outcome != null) onComplete(scenarioId)
    }

    Agent0Frame(
        title = scenario.title,
        eyebrow = if (stepId == null) "Briefing" else "Decision ${path.size + 1}",
        onBack = onBack
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp)
        ) {
            Spacer(Modifier.height(18.dp))

            AnimatedContent(
                targetState = stepId,
                transitionSpec = {
                    (slideInVertically(tween(Motion.Normal, easing = Motion.Decode)) { it / 6 } +
                        fadeIn(tween(Motion.Normal))) togetherWith fadeOut(tween(Motion.Fast))
                },
                label = "scenarioStep"
            ) { current ->
                Column {
                    if (current == null) {
                        // ── briefing ──────────────────────────────────
                        Panel(background = Ink.Void) {
                            Eyebrow("Situation")
                            Spacer(Modifier.height(12.dp))
                            TypewriterText(
                                text = scenario.intro,
                                style = MaterialTheme.typography.bodyLarge.copy(color = Ink.Soft),
                                charDelayMillis = 11,
                                showCursor = false
                            )
                        }
                        Spacer(Modifier.height(24.dp))
                        PrimaryButton(
                            text = "Begin drill",
                            leading = "\u25B6",
                            modifier = Modifier.fillMaxWidth(),
                            onClick = { stepId = scenario.start }
                        )
                    } else {
                        val s = scenario.steps[current]
                        if (s == null) {
                            EmptyState("Broken branch.")
                        } else if (s.outcome != null) {
                            // ── terminal node ─────────────────────────
                            val good = s.outcome == Outcome.GOOD
                            Panel(
                                background = if (good) Ink.PanelHi else Ink.Void,
                                borderColor = if (good) Ink.White else Ink.Rule
                            ) {
                                Eyebrow(
                                    when (s.outcome) {
                                        Outcome.GOOD -> "\u2713 Outcome \u00B7 Contained"
                                        Outcome.BAD -> "\u2715 Outcome \u00B7 Compromised"
                                        Outcome.NEUTRAL -> "\u25CB Outcome"
                                    }
                                )
                                Spacer(Modifier.height(12.dp))
                                Text(
                                    s.text,
                                    style = MaterialTheme.typography.bodyLarge,
                                    color = Ink.Soft
                                )
                            }
                            if (s.lesson != null) {
                                Spacer(Modifier.height(14.dp))
                                Panel(background = Ink.Panel) {
                                    Eyebrow("Lesson")
                                    Spacer(Modifier.height(10.dp))
                                    Text(
                                        s.lesson,
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = Ink.White
                                    )
                                }
                            }
                            Spacer(Modifier.height(22.dp))
                            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                                GhostButton(
                                    text = "Retry",
                                    leading = "\u21BB",
                                    onClick = { stepId = null; path = emptyList() }
                                )
                                PrimaryButton(
                                    text = "Done",
                                    leading = "\u2713",
                                    modifier = Modifier.weight(1f),
                                    onClick = onBack
                                )
                            }
                        } else {
                            // ── decision node ─────────────────────────
                            TypewriterText(
                                text = s.text,
                                style = MaterialTheme.typography.headlineSmall,
                                charDelayMillis = 13
                            )
                            Spacer(Modifier.height(22.dp))
                            s.choices.forEachIndexed { i, choice ->
                                RevealIn(delayMillis = 200 + i * 70) {
                                    ChoiceRow(
                                        label = ('A' + i).toString(),
                                        text = choice.text,
                                        onClick = {
                                            haptic.performHapticFeedback(
                                                HapticFeedbackType.TextHandleMove
                                            )
                                            path = path + current
                                            stepId = choice.next
                                        }
                                    )
                                }
                                Spacer(Modifier.height(9.dp))
                            }
                        }
                    }
                }
            }
            Spacer(Modifier.height(40.dp))
        }
    }
}

@Composable
private fun ChoiceRow(label: String, text: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(2.dp))
            .background(Ink.Panel)
            .border(1.dp, Ink.Hairline, RoundedCornerShape(2.dp))
            .noRippleClickable(onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 16.dp),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            label,
            style = MaterialTheme.typography.labelSmall,
            color = Ink.Dim,
            modifier = Modifier.width(24.dp).padding(top = 2.dp)
        )
        Text(
            text,
            style = MaterialTheme.typography.bodyMedium,
            color = Ink.Soft,
            modifier = Modifier.weight(1f)
        )
        Text("\u203A", style = MaterialTheme.typography.bodyMedium, color = Ink.Rule)
    }
}
