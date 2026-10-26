package com.abybijo.agent0.feature.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.nav.Route
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.theme.Ink

/** One tour step: the page it explains and the route it is shown over. */
data class TourStep(val page: String, val title: String, val text: String, val route: String)

/** v2.0 guided tour steps (SRS §7.2), in page order. */
object TourSteps {
    val all: List<TourStep> by lazy {
        val firstBriefRoute = Curriculum.orderedKeys.firstOrNull()?.let { key ->
            val parts = key.split("/")
            if (parts.size == 2) Route.brief(parts[0], parts[1]) else Route.CHAPTERS
        } ?: Route.CHAPTERS
        listOf(
            TourStep("Base", "Home", "Your dashboard. Continue where you left off, see your progress, and reach every section from here.", Route.HOME),
            TourStep("Train", "Curriculum", "Chapters and briefs, in order. A brief unlocks only when the previous brief is completed.", Route.CHAPTERS),
            TourStep("Train", "A brief", "Read the lesson, then mark it as read. At the bottom you can also write a private note for this brief.", firstBriefRoute),
            TourStep("Drills", "Drills", "Scenario drills, quizzes, checklists, and the diagnostic. Drills and questions unlock with the briefs they belong to.", Route.DRILLS),
            TourStep("Intel", "Cases", "Real, documented case archives, and the vetted resources index. Cases linked to a brief unlock with that brief.", Route.CASES),
            TourStep("Intel", "Resources", "Tools, forums, and other resources, listed by category with their trade-offs. Nothing here is fetched live — it is bundled text.", Route.RESOURCES),
            TourStep("Profile", "Profile", "Your name, age (display only), avatar, progress, bookmarks, notes, badges, and, at the end, your certificate when every brief is complete.", Route.PROFILE),
            TourStep("Settings", "Settings", "Name, age, avatar, display and motion, local data, and the About and About Developer pages.", Route.SETTINGS),
            TourStep("Rule 1", "The only Rule", "You don't talk about this. Everything else in the app is a practice, a checklist, or a caution — not another rule.", Route.ABOUT)
        )
    }
}

/**
 * v2.0 guided tour as a true overlay: a floating card shown on top of the
 * real page it is explaining, not a separate tour page. Next/Back move
 * both the step and the underlying page. Skip and Finish both dismiss
 * the tour and record it as completed, so it never blocks learning.
 */
@Composable
fun TourOverlay(
    stepIndex: Int,
    onBack: () -> Unit,
    onNext: () -> Unit,
    onSkip: () -> Unit,
    onFinish: () -> Unit,
    modifier: Modifier = Modifier
) {
    val steps = TourSteps.all
    val step = steps[stepIndex.coerceIn(0, steps.lastIndex)]
    Panel(modifier = modifier) {
        Column {
            Eyebrow("Guided tour \u00B7 step ${stepIndex + 1} of ${steps.size} \u00B7 ${step.page}")
            Spacer(Modifier.height(10.dp))
            Text(step.title, style = MaterialTheme.typography.headlineSmall, color = Ink.White)
            Spacer(Modifier.height(8.dp))
            Text(step.text, style = MaterialTheme.typography.bodyMedium, color = Ink.Mid)
            Spacer(Modifier.height(16.dp))
            Row(Modifier.fillMaxWidth()) {
                GhostButton(text = "Skip", onClick = onSkip)
                Spacer(Modifier.width(10.dp))
                if (stepIndex > 0) {
                    GhostButton(text = "Back", onClick = onBack)
                    Spacer(Modifier.width(10.dp))
                }
                if (stepIndex < steps.lastIndex) {
                    PrimaryButton(
                        text = "Next",
                        leading = "\u2192",
                        modifier = Modifier.weight(1f),
                        onClick = onNext
                    )
                } else {
                    PrimaryButton(
                        text = "Finish tour",
                        leading = "\u2713",
                        modifier = Modifier.weight(1f),
                        onClick = onFinish
                    )
                }
            }
            Spacer(Modifier.height(4.dp))
            Text(
                "You are looking at the real ${step.page} page underneath this card.",
                style = MaterialTheme.typography.bodySmall,
                color = Ink.Dim,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}
