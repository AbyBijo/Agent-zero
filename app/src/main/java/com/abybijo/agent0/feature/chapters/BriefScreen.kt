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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.BriefTemplates
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.feature.illustration.BriefIllustration
import com.abybijo.agent0.feature.illustration.BriefIllustrations
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
    onOpenBrief: (String, String) -> Unit,
    onOpenHub: (String, String) -> Unit = { _, _ -> },
    onSaveNote: (String, String) -> Unit = { _, _ -> },
    onDeleteNote: (String) -> Unit = {}
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

    // v2.0 locking guard (SRS §4): a locked brief shows no body text,
    // only its prerequisite and a button to that prerequisite.
    if (!progress.isBriefAccessible(chapterId, briefId)) {
        val prerequisiteKey = progress.prerequisiteFor(chapterId, briefId)
        val prerequisite = prerequisiteKey?.split("/")?.let { (c, b) ->
            Curriculum.chapter(c)?.let { ch -> ch to ch.briefs.firstOrNull { it.id == b } }
        }
        Agent0Screen(title = brief.title, eyebrow = "${chapter.code} \u00B7 ${chapter.title}", onBack = onBack) {
            item {
                Spacer(Modifier.height(14.dp))
                Panel(background = Ink.Void) {
                    Eyebrow("Locked")
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "Complete the previous brief first to unlock this brief.",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Ink.Mid
                    )
                    if (prerequisite != null) {
                        Spacer(Modifier.height(12.dp))
                        Text(
                            "Prerequisite \u00B7 ${prerequisite.first.code} \u2014 ${prerequisite.second?.title}",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.White
                        )
                    }
                }
                Spacer(Modifier.height(20.dp))
                if (prerequisite != null && prerequisite.second != null) {
                    PrimaryButton(
                        text = "Go to prerequisite",
                        leading = "\u2192",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {
                            onOpenBrief(prerequisite.first.id, prerequisite.second!!.id)
                        }
                    )
                }
            }
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

    // v2.0 brief template (SRS §6): a brief's own fields win, otherwise
    // the Phase 3 template map supplies the sections. Additive only.
    val templateFallback = BriefTemplates.forKey(key)
    val templateSections = listOf(
        "Outcomes \u00B7 after this brief, you will be able to" to
            brief.outcomes.ifEmpty { templateFallback?.outcomes ?: emptyList() },
        "How to" to brief.howTo.ifEmpty { templateFallback?.howTo ?: emptyList() },
        "Best practices" to brief.bestPractices.ifEmpty { templateFallback?.bestPractices ?: emptyList() },
        "Cautions" to brief.cautions.ifEmpty { templateFallback?.cautions ?: emptyList() }
    ).filter { it.second.isNotEmpty() }

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

        // ── v2.0 illustration ─────────────────────────────────────────
        // Runtime vector line art, one per brief (Phase 3b). Rendered
        // before the lesson blocks, after the meta strip.
        BriefIllustrations.forKey(key)?.let { spec ->
            item {
                RevealIn(delayMillis = 130) {
                    Panel {
                        Eyebrow("Illustration")
                        Spacer(Modifier.height(6.dp))
                        BriefIllustration(motif = spec.motif)
                        Spacer(Modifier.height(6.dp))
                        Text(
                            spec.caption,
                            style = MaterialTheme.typography.bodySmall,
                            color = Ink.Mid
                        )
                    }
                }
                Spacer(Modifier.height(18.dp))
            }
        }

        // ── content blocks ────────────────────────────────────────────
        itemsIndexed(brief.blocks) { i, block ->
            RevealIn(delayMillis = 150 + (i.coerceAtMost(10) * 40)) {
                BlockView(block = block, onOpenUrl = openUrl)
            }
        }

        // ── v2.0 brief template ───────────────────────────────────────
        if (templateSections.isNotEmpty()) {
            item {
                Spacer(Modifier.height(18.dp))
                RevealIn {
                    Panel(background = Ink.Void) {
                        templateSections.forEachIndexed { i, (heading, items) ->
                            if (i > 0) {
                                Spacer(Modifier.height(14.dp))
                                DashRule()
                                Spacer(Modifier.height(14.dp))
                            }
                            Eyebrow(heading)
                            Spacer(Modifier.height(8.dp))
                            items.forEach { text ->
                                Row {
                                    Text("\u2014 ", color = Ink.Dim)
                                    Text(
                                        text,
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = Ink.Mid,
                                        modifier = Modifier.weight(1f)
                                    )
                                }
                                Spacer(Modifier.height(6.dp))
                            }
                        }
                    }
                }
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

        // ── personal note ─────────────────────────────────────────────
        // v2.0 (SRS §7.4): one editable note per brief, local only,
        // never included in the certificate or any share payload.
        item {
            Spacer(Modifier.height(18.dp))
            RevealIn {
                val savedNote = progress.notes[key] ?: ""
                var noteDraft by remember(key, savedNote) { mutableStateOf(savedNote) }
                Panel {
                    Eyebrow("Your note \u00B7 private, on this device only")
                    Spacer(Modifier.height(10.dp))
                    OutlinedTextField(
                        value = noteDraft,
                        onValueChange = { noteDraft = it },
                        minLines = 3,
                        placeholder = { Text("Write what this brief means for you…", color = Ink.Dim) },
                        textStyle = MaterialTheme.typography.bodyMedium.copy(color = Ink.White),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            focusedIndicatorColor = Ink.White,
                            unfocusedIndicatorColor = Ink.Rule,
                            cursorColor = Ink.White
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(Modifier.height(12.dp))
                    Row {
                        GhostButton(
                            text = "Save note",
                            enabled = noteDraft != savedNote,
                            onClick = { onSaveNote(key, noteDraft) }
                        )
                        if (savedNote.isNotBlank()) {
                            Spacer(Modifier.width(10.dp))
                            GhostButton(
                                text = "Delete note",
                                onClick = { noteDraft = ""; onDeleteNote(key) }
                            )
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
                    // v2.0 Phase 5 (SRS §6.4): after the last page, Next
                    // opens the Brief Completion Hub, which carries the
                    // clear Next Brief action. Marking complete first if
                    // needed keeps the hub's unlock rule intact.
                    PrimaryButton(
                        text = "Brief hub",
                        leading = "\u2192",
                        modifier = Modifier.weight(1f),
                        onClick = {
                            if (!complete) onToggleComplete(key)
                            onOpenHub(chapterId, briefId)
                        }
                    )
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
