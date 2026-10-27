package com.abybijo.agent0.feature.profile

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.nav.Route
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.StatRow
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

/** Inbuilt avatars only — glyphs, no photo, camera, or gallery access. */
object Avatars {
    val options: List<Pair<String, String>> = listOf(
        "sigil" to "\u25CE",
        "penguin" to "\uD83D\uDC27",
        "diamond" to "\u25C6",
        "hex" to "\u2B22",
        "star" to "\u2605"
    )
    fun glyphFor(id: String): String =
        options.firstOrNull { it.first == id }?.second ?: "\u25CE"
}

/**
 * v2.0 Profile page (SRS §8). Replaces About as a top-level page.
 * Shows name, age (display-only, never gates content), progress,
 * bookmarks, chapter badges, and the certificate section at the end.
 * Certificate gate (Phase 5d, user decision 2026-10-27): all briefs
 * complete AND the final exam passed. PNG/PDF/share arrive in 5e.
 */
@Composable
fun ProfileScreen(
    progress: Progress,
    onNavigate: (String) -> Unit,
    onOpenBrief: (String, String) -> Unit,
    onToggleBookmark: (String) -> Unit,
    onUserName: (String) -> Unit,
    onUserAge: (Int?) -> Unit,
    onAvatarId: (String) -> Unit,
    onDeleteNote: (String) -> Unit = {},
    onStartTour: () -> Unit = {},
    onTakeFinalExam: () -> Unit = {},
    onOpenCertificate: () -> Unit = {}
) {
    var nameDraft by remember { mutableStateOf(progress.userName) }
    var ageDraft by remember { mutableStateOf(progress.userAge?.toString() ?: "") }
    val ageValue = ageDraft.toIntOrNull()?.takeIf { it in 1..120 }

    Agent0Screen(
        title = "Profile",
        eyebrow = "Your record \u00B7 on this device only",
        action = {
            Text(
                "\u2699",
                style = MaterialTheme.typography.headlineSmall,
                color = Ink.Soft,
                modifier = Modifier
                    .noRippleClickable { onNavigate(Route.SETTINGS) }
                    .padding(6.dp)
            )
        }
    ) {
        // ── header ────────────────────────────────────────────────
        item {
            Spacer(Modifier.height(14.dp))
            RevealIn {
                Panel {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            Avatars.glyphFor(progress.avatarId),
                            style = MaterialTheme.typography.displayLarge,
                            color = Ink.White
                        )
                        Spacer(Modifier.width(16.dp))
                        Column(Modifier.weight(1f)) {
                            Text(
                                progress.userName.ifBlank { "Unnamed operative" },
                                style = MaterialTheme.typography.headlineSmall,
                                color = Ink.White
                            )
                            Spacer(Modifier.height(6.dp))
                            Text(
                                if (progress.userAge != null) "Age ${progress.userAge} \u00B7 display only"
                                else "Age not set \u00B7 display only",
                                style = MaterialTheme.typography.bodySmall,
                                color = Ink.Mid
                            )
                        }
                    }
                    Spacer(Modifier.height(16.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Eyebrow("Progress")
                        Spacer(Modifier.weight(1f))
                        Text(
                            "${progress.completedBriefs.size}/${Curriculum.totalBriefs}",
                            style = MaterialTheme.typography.titleMedium,
                            color = Ink.White
                        )
                    }
                    Spacer(Modifier.height(10.dp))
                    AsciiBar(progress.briefFraction, slots = 24)
                    Spacer(Modifier.height(12.dp))
                    if (!progress.lastPosition.isBlank()) {
                        Text(
                            "Continue where you left off \u00B7 ${progress.lastPosition}",
                            style = MaterialTheme.typography.bodySmall,
                            color = Ink.Dim
                        )
                    }
                    if (progress.userName.isBlank() || progress.userAge == null) {
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "Profile incomplete. Completing it is suggested, never required to learn.",
                            style = MaterialTheme.typography.bodySmall,
                            color = Ink.Dim
                        )
                    }
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── edit profile ────────────────────────────────────────────
        item {
            RevealIn {
                Panel {
                    Eyebrow("Edit profile")
                    Spacer(Modifier.height(10.dp))
                    OutlinedTextField(
                        value = nameDraft,
                        onValueChange = { nameDraft = it },
                        singleLine = true,
                        placeholder = { Text("Your name", color = Ink.Dim) },
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
                    Spacer(Modifier.height(10.dp))
                    OutlinedTextField(
                        value = ageDraft,
                        onValueChange = { ageDraft = it.filter { c -> c.isDigit() }.take(3) },
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        placeholder = { Text("Age (display only)", color = Ink.Dim) },
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
                            text = "Save name",
                            enabled = nameDraft.isNotBlank() && nameDraft != progress.userName,
                            onClick = { onUserName(nameDraft) }
                        )
                        Spacer(Modifier.width(10.dp))
                        GhostButton(
                            text = "Save age",
                            enabled = ageValue != progress.userAge,
                            onClick = { onUserAge(ageValue) }
                        )
                    }
                    Spacer(Modifier.height(14.dp))
                    GhostButton(text = "Replay guided tour", onClick = onStartTour)
                    Spacer(Modifier.height(14.dp))
                    Eyebrow("Avatar \u00B7 inbuilt only")
                    Spacer(Modifier.height(10.dp))
                    Row {
                        Avatars.options.forEach { (id, glyph) ->
                            val selected = (progress.avatarId.ifBlank { "sigil" } == id)
                            Text(
                                glyph,
                                style = MaterialTheme.typography.headlineMedium,
                                color = if (selected) Ink.White else Ink.Dim,
                                modifier = Modifier
                                    .noRippleClickable { onAvatarId(id) }
                                    .padding(horizontal = 8.dp, vertical = 4.dp)
                            )
                        }
                    }
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── chapters ────────────────────────────────────────────────
        item {
            RevealIn {
                Panel(background = Ink.Void) {
                    Eyebrow("Chapters")
                    Spacer(Modifier.height(12.dp))
                    Curriculum.chapters.forEach { chapter ->
                        val done = progress.chapterDone(chapter.id)
                        StatRow(
                            "${chapter.code} ${chapter.title}",
                            "$done/${chapter.briefs.size}"
                        )
                        Spacer(Modifier.height(8.dp))
                    }
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── bookmarks ───────────────────────────────────────────────
        item {
            RevealIn {
                Panel {
                    Eyebrow("Bookmarks \u00B7 ${progress.bookmarks.size}")
                    Spacer(Modifier.height(10.dp))
                    if (progress.bookmarks.isEmpty()) {
                        Text(
                            "No bookmarks yet. Tap the star on any brief to mark it here.",
                            style = MaterialTheme.typography.bodySmall,
                            color = Ink.Mid
                        )
                    } else {
                        progress.bookmarks.sorted().forEach { key ->
                            val parts = key.split("/")
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .noRippleClickable {
                                        if (parts.size == 2) onOpenBrief(parts[0], parts[1])
                                    }
                                    .padding(vertical = 8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    key,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Ink.White,
                                    modifier = Modifier.weight(1f)
                                )
                                Text(
                                    "\u2715",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Ink.Dim,
                                    modifier = Modifier
                                        .noRippleClickable { onToggleBookmark(key) }
                                        .padding(6.dp)
                                )
                            }
                        }
                    }
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── notes ───────────────────────────────────────────────────
        item {
            RevealIn {
                Panel {
                    Eyebrow("Your notes \u00B7 ${progress.notes.size} \u00B7 private")
                    Spacer(Modifier.height(10.dp))
                    if (progress.notes.isEmpty()) {
                        Text(
                            "No notes yet. Add one at the bottom of any brief — " +
                                "it stays on this device and is never part of your certificate.",
                            style = MaterialTheme.typography.bodySmall,
                            color = Ink.Mid
                        )
                    } else {
                        progress.notes.entries.sortedBy { it.key }.forEach { (noteKey, note) ->
                            val parts = noteKey.split("/")
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .noRippleClickable {
                                        if (parts.size == 2) onOpenBrief(parts[0], parts[1])
                                    }
                                    .padding(vertical = 8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(Modifier.weight(1f)) {
                                    Text(
                                        noteKey,
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = Ink.White
                                    )
                                    Text(
                                        note.take(120),
                                        style = MaterialTheme.typography.bodySmall,
                                        color = Ink.Mid
                                    )
                                }
                                Text(
                                    "\u2715",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Ink.Dim,
                                    modifier = Modifier
                                        .noRippleClickable { onDeleteNote(noteKey) }
                                        .padding(6.dp)
                                )
                            }
                        }
                    }
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── badges ──────────────────────────────────────────────────
        // v2.0.1: badges are chapter-only, shown in a grid, and unlock
        // only when the whole chapter is complete.
        item {
            RevealIn {
                Panel(background = Ink.Void) {
                    val chaptersEarned = Curriculum.chapters.count {
                        progress.chapterDone(it.id) == it.briefs.size
                    }
                    Eyebrow("Badges \u00B7 one per completed chapter")
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "$chaptersEarned earned \u00B7 " +
                            "${Curriculum.chapters.size - chaptersEarned} locked",
                        style = MaterialTheme.typography.titleMedium,
                        color = Ink.White
                    )
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "A chapter badge unlocks only when every brief in that " +
                            "chapter is complete. There is no leaderboard — these " +
                            "are your own marks, on this device only.",
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Mid
                    )
                    Spacer(Modifier.height(12.dp))
                    Curriculum.chapters.chunked(4).forEach { rowChapters ->
                        Row(
                            Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            rowChapters.forEach { chapter ->
                                val earned =
                                    progress.chapterDone(chapter.id) == chapter.briefs.size
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .border(
                                            1.dp,
                                            if (earned) Ink.White else Ink.Rule
                                        )
                                        .padding(vertical = 12.dp, horizontal = 4.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Text(
                                            if (earned) "\u2713" else "\u25A1",
                                            style = MaterialTheme.typography.titleMedium,
                                            color = if (earned) Ink.White else Ink.Dim
                                        )
                                        Spacer(Modifier.height(4.dp))
                                        Text(
                                            chapter.code,
                                            style = MaterialTheme.typography.labelSmall,
                                            color = if (earned) Ink.White else Ink.Dim,
                                            maxLines = 1
                                        )
                                    }
                                }
                            }
                            repeat(4 - rowChapters.size) {
                                Spacer(Modifier.weight(1f))
                            }
                        }
                        Spacer(Modifier.height(10.dp))
                    }
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── certificate ─────────────────────────────────────────────
        item {
            RevealIn {
                Panel(borderColor = Ink.Rule) {
                    Eyebrow("Certificate of completion")
                    Spacer(Modifier.height(10.dp))
                    if (progress.isCertificateUnlocked) {
                        Text(
                            "Unlocked. View your certificate, download it as " +
                                "image or PDF, or share it.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.White
                        )
                        Spacer(Modifier.height(14.dp))
                        PrimaryButton(
                            text = "View certificate",
                            leading = "\u2192",
                            modifier = Modifier.fillMaxWidth(),
                            onClick = onOpenCertificate
                        )
                    } else if (progress.isExamReady) {
                        Tag("FINAL EXAM")
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "All ${Curriculum.totalBriefs} briefs complete and " +
                                "${progress.scenariosDone.size} drills done. One step remains: " +
                                "the final exam — 100 questions, 30 minutes, pass mark 70. " +
                                "It uses its own questionnaire, jumbled on every take.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Mid
                        )
                        Spacer(Modifier.height(14.dp))
                        PrimaryButton(
                            text = "Take the final exam",
                            leading = "\u2192",
                            modifier = Modifier.fillMaxWidth(),
                            onClick = onTakeFinalExam
                        )
                    } else if (progress.certificateRemaining == 0) {
                        // v2.0.1: briefs done, drills short of the 35% gate.
                        Tag("LOCKED")
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "All briefs complete. The final exam unlocks once you " +
                                "have also completed at least 35% of the drills — " +
                                "${progress.examDrillsRemaining} more to go " +
                                "(${progress.scenariosDone.size}/${progress.drillsRequiredForExam}).",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Mid
                        )
                        Spacer(Modifier.height(12.dp))
                        AsciiBar(progress.scenarioFraction, slots = 24)
                    } else {
                        Tag("LOCKED")
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "Complete ${progress.certificateRemaining} of " +
                                "${Curriculum.totalBriefs} briefs to unlock your certificate. " +
                                "It will be a self-paced, on-device completion record, " +
                                "not an accredited qualification.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Mid
                        )
                    }
                }
            }
            Spacer(Modifier.height(26.dp))
        }
    }
}
