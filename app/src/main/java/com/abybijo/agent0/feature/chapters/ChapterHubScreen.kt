package com.abybijo.agent0.feature.chapters

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.data.Scenarios
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.EmptyState
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.theme.Ink

/**
 * v2.0.1 — Chapter Summary Hub.
 *
 * Shown when a chapter's last brief is completed (from the brief hub's
 * Next action at a chapter boundary, or from the chapter page once the
 * chapter is complete). It summarises the chapter — briefs, drills,
 * minutes — lists every brief with its mark, and asks whether to
 * continue to the next chapter's first brief. Back goes to the
 * chapter page, never to the brief just finished.
 */
@Composable
fun ChapterHubScreen(
    chapterId: String,
    progress: Progress,
    onBack: () -> Unit,
    onOpenBrief: (String, String) -> Unit,
    onOpenProfile: () -> Unit
) {
    BackHandler { onBack() }

    val chapter = Curriculum.chapter(chapterId)
    if (chapter == null) {
        Agent0Screen(title = "Not found", onBack = onBack) {
            item { EmptyState("That chapter does not exist.") }
        }
        return
    }

    val done = progress.chapterDone(chapterId)
    val total = chapter.briefs.size
    val complete = done == total
    val chapterDrills = Scenarios.all.filter { it.briefKey.substringBefore("/") == chapterId }
    val drillsDone = chapterDrills.count { it.id in progress.scenariosDone }
    val chapterIndex = Curriculum.chapters.indexOf(chapter)
    val nextChapter = Curriculum.chapters.getOrNull(chapterIndex + 1)
    val nextFirstBrief = nextChapter?.briefs?.firstOrNull()

    Agent0Screen(
        title = chapter.title,
        eyebrow = "${chapter.code} \u00B7 chapter summary",
        onBack = onBack
    ) {
        if (!complete) {
            item {
                Spacer(Modifier.height(14.dp))
                Panel(background = Ink.Void) {
                    Eyebrow("Chapter in progress")
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "This chapter is $done/$total briefs complete. " +
                            "Finish every brief to unlock its summary.",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Ink.Mid
                    )
                }
                Spacer(Modifier.height(20.dp))
                GhostButton(text = "Back to chapter", leading = "\u2190", onClick = onBack)
            }
            return@Agent0Screen
        }

        // ── summary ───────────────────────────────────────────────────
        item {
            Spacer(Modifier.height(14.dp))
            RevealIn {
                Panel {
                    Eyebrow("Chapter complete")
                    Spacer(Modifier.height(8.dp))
                    Text(
                        chapter.title,
                        style = MaterialTheme.typography.titleMedium,
                        color = Ink.White
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        chapter.tagline,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Mid
                    )
                    Spacer(Modifier.height(12.dp))
                    Row {
                        Tag("$done/$total briefs")
                        Spacer(Modifier.width(7.dp))
                        Tag("$drillsDone/${chapterDrills.size} drills")
                        Spacer(Modifier.width(7.dp))
                        Tag("~${chapter.totalMinutes} min")
                    }
                }
            }
            Spacer(Modifier.height(18.dp))
        }

        // ── briefs in this chapter ────────────────────────────────────
        item {
            RevealIn {
                Panel(background = Ink.Void) {
                    Eyebrow("Briefs \u00B7 all complete")
                    Spacer(Modifier.height(6.dp))
                    chapter.briefs.forEach { brief ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("\u2713", color = Ink.White)
                            Spacer(Modifier.width(10.dp))
                            Text(
                                brief.title,
                                style = MaterialTheme.typography.bodyMedium,
                                color = Ink.Mid,
                                modifier = Modifier.weight(1f)
                            )
                        }
                        Spacer(Modifier.height(8.dp))
                    }
                }
            }
            Spacer(Modifier.height(24.dp))
        }

        // ── continue ──────────────────────────────────────────────────
        item {
            RevealIn {
                if (nextChapter != null && nextFirstBrief != null) {
                    Text(
                        "Continue to the next chapter?",
                        style = MaterialTheme.typography.titleMedium,
                        color = Ink.White
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "${nextChapter.code} \u2014 ${nextChapter.title}: " +
                            "first brief \u201C${nextFirstBrief.title}\u201D.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Mid
                    )
                    Spacer(Modifier.height(14.dp))
                    PrimaryButton(
                        text = "Continue to ${nextChapter.code}",
                        leading = "\u2192",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { onOpenBrief(nextChapter.id, nextFirstBrief.id) }
                    )
                } else {
                    Panel(background = Ink.Void) {
                        Eyebrow("Programme complete")
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "This was the final chapter. Your certificate is in your profile.",
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
