package com.abybijo.agent0.feature.drills

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.Checklists
import com.abybijo.agent0.data.Diagnostic
import com.abybijo.agent0.data.QuizBank
import com.abybijo.agent0.data.Scenarios
import com.abybijo.agent0.nav.Route
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

private data class Drill(
    val glyph: String,
    val title: String,
    val desc: String,
    val meta: String,
    val route: String,
    val progress: Float?
)

@Composable
fun DrillsScreen(progress: Progress, onNavigate: (String) -> Unit) {
    val drills = listOf(
        Drill(
            "\u2317", "Scenario Drills",
            "Branching decisions under pressure. Every ending teaches.",
            "${progress.scenariosDone.size}/${Scenarios.all.size} completed",
            Route.SCENARIO_LIST,
            progress.scenarioFraction
        ),
        Drill(
            "\u25C9", "Assessment",
            "Ten questions from a bank of ${QuizBank.all.size}, with rationales.",
            if (progress.quizRuns > 0) "Best ${progress.quizBest}/10 \u00B7 ${progress.quizRuns} runs"
            else "Not attempted",
            Route.QUIZ,
            if (progress.quizRuns > 0) progress.quizBest / 10f else 0f
        ),
        Drill(
            "\u2713", "Checklists",
            "Operational routines: daily, weekly, travel, incident.",
            "${progress.checkedItems.size}/${Checklists.totalItems} items",
            Route.CHECKLISTS,
            progress.checklistFraction
        ),
        Drill(
            "\u25D4", "Self-Diagnostic",
            "Weighted audit of your actual posture. Re-run monthly.",
            if (progress.diagTaken) "${Diagnostic.grade(progress.diagScore)} \u00B7 ${progress.diagScore}/${Diagnostic.maxScore}"
            else "Not taken",
            Route.DIAGNOSTIC,
            if (progress.diagTaken) progress.diagFraction else 0f
        ),
        Drill(
            "\u2696", "Risk Calculator",
            "Score threat \u00D7 vulnerability \u00D7 impact for a real item.",
            "Interactive tool",
            Route.RISK,
            null
        ),
        Drill(
            "\u26BF", "Passphrase Lab",
            "See how entropy actually behaves. Nothing is stored or sent.",
            "Interactive tool",
            Route.PASSWORD_LAB,
            null
        )
    )

    Agent0Screen(
        title = "Drills",
        eyebrow = "Recognition fails under pressure. Recall doesn't."
    ) {
        item {
            Spacer(Modifier.height(12.dp))
            RevealIn {
                Panel(background = Ink.Void) {
                    Eyebrow("Training loop")
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "READ \u2192 DRILL \u2192 APPLY \u2192 AUDIT",
                        style = MaterialTheme.typography.titleMedium,
                        color = Ink.White
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "Reading a brief produces recognition. Running the matching drill " +
                            "produces recall — which is what you'll actually have available " +
                            "when someone is rushing you.",
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Mid
                    )
                }
            }
            Spacer(Modifier.height(20.dp))
        }

        itemsIndexed(drills) { i, d ->
            RevealIn(delayMillis = 60 + i * 45) {
                DrillCard(drill = d, onClick = { onNavigate(d.route) })
            }
            Spacer(Modifier.height(10.dp))
        }
    }
}

@Composable
private fun DrillCard(drill: Drill, onClick: () -> Unit) {
    Panel(
        modifier = Modifier
            .fillMaxWidth()
            .noRippleClickable(onClick = onClick)
    ) {
        Row(verticalAlignment = Alignment.Top) {
            Text(
                drill.glyph,
                style = MaterialTheme.typography.headlineMedium,
                color = Ink.Soft,
                modifier = Modifier.width(44.dp)
            )
            Column(Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        drill.title,
                        style = MaterialTheme.typography.headlineSmall,
                        color = Ink.White,
                        modifier = Modifier.weight(1f)
                    )
                    Text("\u203A", style = MaterialTheme.typography.headlineSmall, color = Ink.Rule)
                }
                Spacer(Modifier.height(7.dp))
                Text(drill.desc, style = MaterialTheme.typography.bodySmall, color = Ink.Mid)
                Spacer(Modifier.height(12.dp))
                Text(
                    drill.meta.uppercase(),
                    style = MaterialTheme.typography.labelSmall,
                    color = Ink.Dim
                )
                if (drill.progress != null) {
                    Spacer(Modifier.height(10.dp))
                    AsciiBar(drill.progress, slots = 18, showPercent = false)
                }
            }
        }
    }
}
