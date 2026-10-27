package com.abybijo.agent0.feature.chapters

import android.content.Intent
import android.net.Uri
import androidx.activity.compose.BackHandler
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.Cases
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.data.QuizBank
import com.abybijo.agent0.data.Scenarios
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.EmptyState
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

/**
 * v2.0 Phase 5 — Brief Completion Hub (SRS §6.4).
 *
 * Opened from a brief's Next action once the brief is marked complete.
 * Gathers, for this brief only: its question bank, its drills (unlocked by
 * completing the brief), its linked cases, and its resources — plus a clear
 * Next Brief action. Notes are deliberately absent: personal notes are
 * local-only and never appear in hubs, certificates, or share payloads.
 */
@Composable
fun BriefHubScreen(
    chapterId: String,
    briefId: String,
    progress: Progress,
    onBack: () -> Unit,
    onOpenBrief: (String, String) -> Unit,
    onOpenScenario: (String) -> Unit,
    onOpenCase: (String) -> Unit,
    onOpenResources: () -> Unit,
    onOpenProfile: () -> Unit,
    onOpenChapterHub: (String) -> Unit = {}
) {
    // v2.0.1: system back follows the header back button — to the
    // chapter page, never back through earlier briefs and hubs.
    BackHandler { onBack() }

    val context = LocalContext.current
    val chapter = Curriculum.chapter(chapterId)
    val brief = Curriculum.brief(chapterId, briefId)

    if (chapter == null || brief == null) {
        Agent0Screen(title = "Not found", onBack = onBack) {
            item { EmptyState("That brief does not exist.") }
        }
        return
    }

    val key = "$chapterId/$briefId"
    val complete = key in progress.completedBriefs

    val openUrl: (String) -> Unit = { url ->
        runCatching {
            context.startActivity(
                Intent.createChooser(
                    Intent(Intent.ACTION_VIEW, Uri.parse(url)),
                    "Open reference"
                )
            )
        }
    }

    val questions = remember(key) { QuizBank.all.filter { it.briefKey == key } }
    val drills = remember(key) { Scenarios.all.filter { it.briefKey == key } }
    val cases = remember(key) { Cases.all.filter { it.briefKey == key } }
    val nextKey = remember(key) { Curriculum.nextKey(key) }
    val next = nextKey?.split("/")?.let { (c, b) ->
        Curriculum.chapter(c)?.let { ch -> ch to ch.briefs.first { it.id == b } }
    }

    Agent0Screen(
        title = "Brief hub",
        eyebrow = "${chapter.code} \u00B7 ${brief.title}",
        onBack = onBack
    ) {
        if (!complete) {
            item {
                Spacer(Modifier.height(14.dp))
                Panel(background = Ink.Void) {
                    Eyebrow("Not yet complete")
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "Complete this brief first to unlock its hub.",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Ink.Mid
                    )
                }
                Spacer(Modifier.height(20.dp))
                GhostButton(text = "Back to brief", leading = "\u2190", onClick = onBack)
            }
            return@Agent0Screen
        }

        // ── summary ───────────────────────────────────────────────────
        item {
            Spacer(Modifier.height(14.dp))
            RevealIn {
                Panel {
                    Eyebrow("Brief complete")
                    Spacer(Modifier.height(8.dp))
                    Text(
                        brief.title,
                        style = MaterialTheme.typography.titleMedium,
                        color = Ink.White
                    )
                    Spacer(Modifier.height(10.dp))
                    Row {
                        Tag("${questions.size} questions")
                        Spacer(Modifier.width(7.dp))
                        Tag("${drills.size} drills")
                        Spacer(Modifier.width(7.dp))
                        Tag("${cases.size} cases")
                    }
                }
            }
            Spacer(Modifier.height(18.dp))
        }

        // ── question bank ─────────────────────────────────────────────
        item {
            RevealIn {
                Panel {
                    Eyebrow("Question bank \u00B7 this brief")
                    Spacer(Modifier.height(6.dp))
                    if (questions.isEmpty()) {
                        Text(
                            "No questions are linked to this brief yet.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Dim
                        )
                    } else {
                        var revealed by remember(key) { mutableStateOf(setOf<Int>()) }
                        questions.forEachIndexed { i, q ->
                            if (i > 0) {
                                Spacer(Modifier.height(10.dp))
                                DashRule()
                                Spacer(Modifier.height(10.dp))
                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .noRippleClickable {
                                        revealed = if (i in revealed) revealed - i else revealed + i
                                    }
                            ) {
                                Text(
                                    q.prompt,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Ink.White
                                )
                                Spacer(Modifier.height(6.dp))
                                q.options.forEachIndexed { oi, option ->
                                    Text(
                                        "${('A' + oi)} \u00B7 $option",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = if (i in revealed && oi == q.answerIndex) Ink.White else Ink.Dim
                                    )
                                }
                                if (i in revealed) {
                                    Spacer(Modifier.height(6.dp))
                                    Text(
                                        "Answer: ${('A' + q.answerIndex)} \u2014 ${q.rationale}",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = Ink.Mid
                                    )
                                } else {
                                    Spacer(Modifier.height(4.dp))
                                    Text(
                                        "Tap to reveal the answer",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = Ink.Rule
                                    )
                                }
                            }
                        }
                    }
                }
            }
            Spacer(Modifier.height(18.dp))
        }

        // ── drills ────────────────────────────────────────────────────
        item {
            RevealIn {
                Panel {
                    Eyebrow("Drills \u00B7 unlocked by completing this brief")
                    Spacer(Modifier.height(6.dp))
                    if (drills.isEmpty()) {
                        Text(
                            "No drills are linked to this brief yet.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Dim
                        )
                    } else {
                        drills.forEachIndexed { i, drill ->
                            if (i > 0) {
                                Spacer(Modifier.height(8.dp))
                                DashRule()
                                Spacer(Modifier.height(8.dp))
                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .noRippleClickable { onOpenScenario(drill.id) }
                                    .padding(vertical = 6.dp)
                            ) {
                                Text(
                                    "${drill.title} \u2192",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Ink.White
                                )
                            }
                        }
                    }
                }
            }
            Spacer(Modifier.height(18.dp))
        }

        // ── linked cases ──────────────────────────────────────────────
        item {
            RevealIn {
                Panel {
                    Eyebrow("Linked cases")
                    Spacer(Modifier.height(6.dp))
                    if (cases.isEmpty()) {
                        Text(
                            "No cases are linked to this brief yet.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Dim
                        )
                    } else {
                        cases.forEachIndexed { i, case ->
                            if (i > 0) {
                                Spacer(Modifier.height(8.dp))
                                DashRule()
                                Spacer(Modifier.height(8.dp))
                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .noRippleClickable { onOpenCase(case.id) }
                                    .padding(vertical = 6.dp)
                            ) {
                                Text(
                                    "${case.title} \u2192",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Ink.White
                                )
                                if (case.source.isNotBlank()) {
                                    Spacer(Modifier.height(3.dp))
                                    Text(
                                        "Source: ${case.source}",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = Ink.Dim
                                    )
                                }
                            }
                        }
                    }
                }
            }
            Spacer(Modifier.height(18.dp))
        }

        // ── resources ─────────────────────────────────────────────────
        item {
            RevealIn {
                Panel {
                    Eyebrow("Resources \u00B7 this brief")
                    Spacer(Modifier.height(6.dp))
                    if (brief.references.isEmpty()) {
                        Text(
                            "No references are listed for this brief.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Dim
                        )
                    } else {
                        brief.references.forEachIndexed { i, ref ->
                            if (i > 0) DashRule()
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .noRippleClickable { openUrl(ref.url) }
                                    .padding(vertical = 10.dp)
                            ) {
                                Text(
                                    "${ref.title} \u2197",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Ink.White,
                                    textDecoration = TextDecoration.Underline
                                )
                                if (ref.note.isNotEmpty()) {
                                    Spacer(Modifier.height(4.dp))
                                    Text(
                                        ref.note,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = Ink.Dim
                                    )
                                }
                            }
                        }
                    }
                    Spacer(Modifier.height(12.dp))
                    GhostButton(text = "All resources", onClick = onOpenResources)
                }
            }
            Spacer(Modifier.height(24.dp))
        }

        // ── next ──────────────────────────────────────────────────────
        item {
            RevealIn {
                if (next != null && next.first.id != chapterId) {
                    // v2.0.1: crossing into a new chapter goes through
                    // the chapter summary hub, which asks about continuing
                    // to that chapter's first brief.
                    Panel(background = Ink.Void) {
                        Eyebrow("Chapter complete")
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "You have finished ${chapter.code} \u2014 ${chapter.title}. " +
                                "See the chapter summary before moving on.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Mid
                        )
                    }
                    Spacer(Modifier.height(16.dp))
                    PrimaryButton(
                        text = "Chapter summary",
                        leading = "\u2192",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { onOpenChapterHub(chapterId) }
                    )
                    Spacer(Modifier.height(12.dp))
                    Text(
                        "UP NEXT \u00B7 ${next.first.code} \u2014 ${next.second.title}",
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim
                    )
                } else if (next != null) {
                    PrimaryButton(
                        text = "Next brief",
                        leading = "\u2192",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { onOpenBrief(next.first.id, next.second.id) }
                    )
                    Spacer(Modifier.height(12.dp))
                    Text(
                        "UP NEXT \u00B7 ${next.first.code} \u2014 ${next.second.title}",
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim
                    )
                } else {
                    Panel(background = Ink.Void) {
                        Eyebrow("Programme complete")
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "This is the final brief. Your certificate is in your profile.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Mid
                        )
                    }
                    Spacer(Modifier.height(16.dp))
                    PrimaryButton(
                        text = "View profile",
                        leading = "\u2192",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = onOpenProfile
                    )
                }
            }
            Spacer(Modifier.height(12.dp))
        }
    }
}
