package com.abybijo.agent0.feature.chapters

import androidx.compose.foundation.layout.Arrangement
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
import com.abybijo.agent0.data.Brief
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.CheckGlyph
import com.abybijo.agent0.ui.components.EmptyState
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.SolidRule
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

@Composable
fun ChapterDetailScreen(
    chapterId: String,
    progress: Progress,
    onBack: () -> Unit,
    onOpenBrief: (String, String) -> Unit
) {
    val chapter = Curriculum.chapter(chapterId)
    if (chapter == null) {
        Agent0Screen(title = "Not found", onBack = onBack) {
            item { EmptyState("That chapter does not exist.") }
        }
        return
    }

    val done = progress.chapterDone(chapterId)

    Agent0Screen(
        title = chapter.title,
        eyebrow = "${chapter.code} \u00B7 ${chapter.tier.label}",
        onBack = onBack
    ) {
        item {
            Spacer(Modifier.height(12.dp))
            RevealIn {
                Panel(background = Ink.Void) {
                    Row(verticalAlignment = Alignment.Top) {
                        Text(
                            chapter.glyph,
                            style = MaterialTheme.typography.displayLarge,
                            color = Ink.Soft
                        )
                        Spacer(Modifier.width(16.dp))
                        Column(Modifier.weight(1f)) {
                            Text(
                                chapter.tagline,
                                style = MaterialTheme.typography.bodyLarge,
                                color = Ink.Soft
                            )
                            Spacer(Modifier.height(14.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Tag(chapter.tier.label)
                                Spacer(Modifier.width(8.dp))
                                Tag("${chapter.briefs.size} briefs")
                                Spacer(Modifier.width(8.dp))
                                Tag("~${chapter.totalMinutes} min")
                            }
                        }
                    }
                    Spacer(Modifier.height(18.dp))
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Eyebrow("Chapter progress")
                        Text(
                            "$done/${chapter.briefs.size}",
                            style = MaterialTheme.typography.labelSmall,
                            color = Ink.Mid
                        )
                    }
                    Spacer(Modifier.height(10.dp))
                    AsciiBar(
                        progress = done.toFloat() / chapter.briefs.size,
                        slots = 22,
                        showPercent = false
                    )
                }
            }
            Spacer(Modifier.height(22.dp))
            RevealIn(delayMillis = 80) { Eyebrow("Briefs") }
            Spacer(Modifier.height(4.dp))
        }

        itemsIndexed(chapter.briefs) { i, brief ->
            RevealIn(delayMillis = 110 + i * 45) {
                BriefRow(
                    index = i + 1,
                    brief = brief,
                    complete = progress.isBriefDone(chapterId, brief.id),
                    onClick = { onOpenBrief(chapterId, brief.id) }
                )
            }
        }
    }
}

@Composable
private fun BriefRow(index: Int, brief: Brief, complete: Boolean, onClick: () -> Unit) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .noRippleClickable(onClick = onClick)
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Column(
                modifier = Modifier.width(34.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Spacer(Modifier.height(2.dp))
                CheckGlyph(checked = complete, size = 15.dp)
            }
            Column(Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        index.toString().padStart(2, '0'),
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim
                    )
                    Spacer(Modifier.width(10.dp))
                    Text(
                        brief.title,
                        style = MaterialTheme.typography.titleMedium,
                        color = if (complete) Ink.Mid else Ink.White
                    )
                }
                Spacer(Modifier.height(6.dp))
                Text(
                    brief.summary,
                    style = MaterialTheme.typography.bodySmall,
                    color = Ink.Dim
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    "${brief.minutes} MIN \u00B7 ${brief.references.size} REFS",
                    style = MaterialTheme.typography.labelSmall,
                    color = Ink.Rule
                )
            }
            Text("\u203A", style = MaterialTheme.typography.headlineSmall, color = Ink.Rule)
        }
        SolidRule(color = Ink.Hairline)
    }
}
