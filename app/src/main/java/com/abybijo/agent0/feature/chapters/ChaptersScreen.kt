package com.abybijo.agent0.feature.chapters

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.Chapter
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

@Composable
fun ChaptersScreen(
    progress: Progress,
    onOpenChapter: (String) -> Unit,
    onSearch: () -> Unit
) {
    Agent0Screen(
        title = "Curriculum",
        eyebrow = "${Curriculum.chapters.size} chapters \u00B7 ${Curriculum.totalBriefs} briefs \u00B7 ~${Curriculum.totalMinutes} min",
        action = {
            Box(
                Modifier
                    .clip(RoundedCornerShape(2.dp))
                    .noRippleClickable(onClick = onSearch)
                    .padding(6.dp)
            ) {
                Text("\u2315", style = MaterialTheme.typography.headlineSmall, color = Ink.Soft)
            }
        }
    ) {
        item {
            Spacer(Modifier.height(12.dp))
            RevealIn {
                Panel(background = Ink.Void) {
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Eyebrow("Overall progress")
                        Text(
                            "${progress.completedBriefs.size}/${Curriculum.totalBriefs}",
                            style = MaterialTheme.typography.titleMedium,
                            color = Ink.White
                        )
                    }
                    Spacer(Modifier.height(12.dp))
                    AsciiBar(progress.briefFraction, slots = 24)
                }
            }
            Spacer(Modifier.height(18.dp))
        }

        itemsIndexed(Curriculum.chapters) { i, chapter ->
            RevealIn(delayMillis = 60 + i * 45) {
                ChapterCard(
                    chapter = chapter,
                    done = progress.chapterDone(chapter.id),
                    onClick = { onOpenChapter(chapter.id) }
                )
            }
            Spacer(Modifier.height(10.dp))
        }
    }
}

@Composable
private fun ChapterCard(chapter: Chapter, done: Int, onClick: () -> Unit) {
    val total = chapter.briefs.size
    val complete = done == total

    Panel(
        borderColor = if (complete) Ink.Rule else Ink.Hairline,
        modifier = Modifier
            .fillMaxWidth()
            .noRippleClickable(onClick = onClick)
    ) {
        Row(verticalAlignment = Alignment.Top) {
            Column(Modifier.width(46.dp)) {
                Text(
                    chapter.glyph,
                    style = MaterialTheme.typography.headlineMedium,
                    color = if (complete) Ink.White else Ink.Soft
                )
            }
            Column(Modifier.weight(1f)) {
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        chapter.code,
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim
                    )
                    Text(
                        chapter.tier.glyph,
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Mid
                    )
                }
                Spacer(Modifier.height(6.dp))
                Text(
                    chapter.title,
                    style = MaterialTheme.typography.headlineSmall,
                    color = Ink.White
                )
                Spacer(Modifier.height(7.dp))
                Text(
                    chapter.tagline,
                    style = MaterialTheme.typography.bodySmall,
                    color = Ink.Mid
                )
                Spacer(Modifier.height(14.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Tag(chapter.tier.label, filled = complete)
                    Spacer(Modifier.width(8.dp))
                    Text(
                        "$done/$total",
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim
                    )
                    Spacer(Modifier.weight(1f))
                    Text(
                        "~${chapter.totalMinutes} MIN",
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim
                    )
                }
                Spacer(Modifier.height(12.dp))
                AsciiBar(
                    progress = if (total == 0) 0f else done.toFloat() / total,
                    slots = 16,
                    showPercent = false
                )
            }
        }
    }
}
