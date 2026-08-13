package com.abybijo.agent0.feature.chapters

import android.content.Intent
import android.net.Uri
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.CheckGlyph
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.EmptyState
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.SolidRule
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.components.TypewriterText
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

/**
 * The reader. Blocks stagger in as the screen settles; the recruit marks the
 * brief read at the bottom and is handed straight to the next one.
 */
@Composable
fun BriefScreen(
    chapterId: String,
    briefId: String,
    progress: Progress,
    onBack: () -> Unit,
    onToggleComplete: (String) -> Unit,
    onBookmark: (String) -> Unit,
    onOpenBrief: (String, String) -> Unit
) {
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
    val bookmarked = key in progress.bookmarks

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

    val nextKey = remember(key) { Curriculum.nextKey(key) }
    val next = nextKey?.split("/")?.let { (c, b) ->
        Curriculum.chapter(c)?.let { ch -> ch to ch.briefs.first { it.id == b } }
    }

    Agent0Screen(
        title = brief.title,
        eyebrow = "${chapter.code} \u00B7 ${chapter.title}",
        onBack = onBack,
        action = {
            Box(
                Modifier
                    .clip(RoundedCornerShape(2.dp))
                    .noRippleClickable { onBookmark(key) }
                    .padding(6.dp)
            ) {
                Text(
                    if (bookmarked) "\u2605" else "\u2606",
                    style = MaterialTheme.typography.headlineSmall,
                    color = if (bookmarked) Ink.White else Ink.Rule
                )
            }
        }
    ) {
        // ── meta strip ────────────────────────────────────────────────
        item {
            Spacer(Modifier.height(14.dp))
            RevealIn {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        brief.glyph,
                        style = MaterialTheme.typography.headlineMedium,
                        color = Ink.Soft
                    )
                    Spacer(Modifier.width(14.dp))
                    Column(Modifier.weight(1f)) {
                        Row {
                            Tag(chapter.tier.label)
                            Spacer(Modifier.width(7.dp))
                            Tag("${brief.minutes} min")
                        }
                    }
                }
            }
            Spacer(Modifier.height(16.dp))
            RevealIn(delayMillis = 70) {
                TypewriterText(
                    text = brief.summary,
                    style = MaterialTheme.typography.bodyLarge.copy(color = Ink.Mid),
                    charDelayMillis = 12,
                    showCursor = false
                )
            }
            Spacer(Modifier.height(18.dp))
            RevealIn(delayMillis = 110) { SolidRule(color = Ink.Hairline) }
            Spacer(Modifier.height(20.dp))
        }

        // ── content blocks ────────────────────────────────────────────
        itemsIndexed(brief.blocks) { i, block ->
            RevealIn(delayMillis = 150 + (i.coerceAtMost(10) * 40)) {
                BlockView(block = block, onOpenUrl = openUrl)
            }
        }

        // ── references ────────────────────────────────────────────────
        if (brief.references.isNotEmpty()) {
            item {
                Spacer(Modifier.height(18.dp))
                RevealIn {
                    Panel(background = Ink.Void) {
                        Eyebrow("References \u00B7 verify independently")
                        Spacer(Modifier.height(6.dp))
                        brief.references.forEachIndexed { i, ref ->
                            if (i > 0) DashRule()
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .noRippleClickable { openUrl(ref.url) }
                                    .padding(vertical = 13.dp)
                            ) {
                                Text(
                                    "${ref.title} \u2197",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Ink.White,
                                    textDecoration = TextDecoration.Underline
                                )
                                if (ref.note.isNotEmpty()) {
                                    Spacer(Modifier.height(5.dp))
                                    Text(
                                        ref.note,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = Ink.Dim
                                    )
                                }
                                Spacer(Modifier.height(4.dp))
                                Text(
                                    ref.url,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Ink.Rule
                                )
                            }
                        }
                    }
                }
            }
        }

        // ── completion ────────────────────────────────────────────────
        item {
            Spacer(Modifier.height(24.dp))
            RevealIn {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .noRippleClickable { onToggleComplete(key) }
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CheckGlyph(checked = complete, size = 19.dp)
                    Spacer(Modifier.width(14.dp))
                    Text(
                        if (complete) "Marked as read" else "Mark this brief as read",
                        style = MaterialTheme.typography.titleMedium,
                        color = if (complete) Ink.White else Ink.Mid
                    )
                }
            }
            Spacer(Modifier.height(20.dp))
        }

        item {
            RevealIn(delayMillis = 60) {
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    GhostButton(text = "Back", leading = "\u2190", onClick = onBack)
                    if (next != null) {
                        PrimaryButton(
                            text = "Next brief",
                            leading = "\u2192",
                            modifier = Modifier.weight(1f),
                            onClick = {
                                if (!complete) onToggleComplete(key)
                                onOpenBrief(next.first.id, next.second.id)
                            }
                        )
                    }
                }
            }
            if (next != null) {
                Spacer(Modifier.height(12.dp))
                RevealIn(delayMillis = 100) {
                    Text(
                        "UP NEXT \u00B7 ${next.first.code} \u2014 ${next.second.title}",
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim
                    )
                }
            }
        }
    }
}
