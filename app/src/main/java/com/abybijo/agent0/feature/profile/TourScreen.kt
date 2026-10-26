package com.abybijo.agent0.feature.profile

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.theme.Ink

private data class TourStep(val page: String, val title: String, val text: String)

/**
 * v2.0 guided tour (SRS §7.2). A step-by-step walkthrough of every page,
 * in order, with Skip at any point and replay from Settings or Profile.
 * Finishing (or skipping) records tour completion on-device; skipping
 * never blocks learning.
 */
@Composable
fun TourScreen(onBack: () -> Unit, onComplete: () -> Unit) {
    val steps = listOf(
        TourStep("Base", "Home", "Your dashboard. Continue where you left off, see your progress, and reach every section from here."),
        TourStep("Train", "Curriculum", "Chapters and briefs, in order. A brief unlocks only when the previous brief is completed."),
        TourStep("Train", "A brief", "Read the lesson, then mark it as read. The last page of a brief opens its Completion Hub — quiz, drills, cases, and resources for that brief."),
        TourStep("Drills", "Drills", "Scenario drills, quizzes, checklists, and the diagnostic. Drills and questions unlock with the briefs they belong to."),
        TourStep("Intel", "Cases", "Real, documented case archives, and the vetted resources index. Cases linked to a brief unlock with that brief."),
        TourStep("Intel", "Resources", "Tools, forums, and other resources, listed by category with their trade-offs. Nothing here is fetched live — it is bundled text."),
        TourStep("Profile", "Profile", "Your name, age (display only), avatar, progress, bookmarks, badges, and, at the end, your certificate when every brief is complete."),
        TourStep("Settings", "Settings", "Name, age, avatar, display and motion, local data, and the About and About Developer pages."),
        TourStep("Rule 1", "The only Rule", "You don't talk about this. Everything else in the app is a practice, a checklist, or a caution — not another rule.")
    )
    var index by remember { mutableIntStateOf(0) }
    val step = steps[index]

    Agent0Screen(
        title = "Guided tour",
        eyebrow = "Step ${index + 1} of ${steps.size}",
        onBack = onBack
    ) {
        item {
            Spacer(Modifier.height(14.dp))
            RevealIn {
                Panel {
                    Eyebrow(step.page)
                    Spacer(Modifier.height(10.dp))
                    Text(step.title, style = MaterialTheme.typography.headlineSmall, color = Ink.White)
                    Spacer(Modifier.height(10.dp))
                    Text(step.text, style = MaterialTheme.typography.bodyMedium, color = Ink.Mid)
                }
            }
            Spacer(Modifier.height(20.dp))
            Row(Modifier.fillMaxWidth()) {
                GhostButton(text = "Skip tour", onClick = { onComplete(); onBack() })
                Spacer(Modifier.width(10.dp))
                if (index > 0) {
                    GhostButton(text = "Back", onClick = { index-- })
                    Spacer(Modifier.width(10.dp))
                }
                if (index < steps.lastIndex) {
                    PrimaryButton(
                        text = "Next",
                        leading = "\u2192",
                        modifier = Modifier.weight(1f),
                        onClick = { index++ }
                    )
                } else {
                    PrimaryButton(
                        text = "Finish tour",
                        leading = "\u2713",
                        modifier = Modifier.weight(1f),
                        onClick = { onComplete(); onBack() }
                    )
                }
            }
            Spacer(Modifier.height(26.dp))
        }
    }
}
