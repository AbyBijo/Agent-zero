package com.abybijo.agent0.feature.drills

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.ScrambleText
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.TerminalFont
import kotlin.math.ln
import kotlin.math.pow

/**
 * Entropy demonstrator. Runs entirely in memory — the field is never stored,
 * logged or transmitted, and the screen says so plainly.
 *
 * Entropy model: charset size ^ length, expressed in bits, with penalties for
 * the patterns real cracking rigs exploit first. It is a teaching aid, not an
 * audit tool.
 */
@Composable
fun PasswordLabScreen(onBack: () -> Unit) {
    var input by remember { mutableStateOf("") }

    val analysis = remember(input) { analyse(input) }

    Agent0Screen(
        title = "Passphrase Lab",
        eyebrow = "In-memory only \u00B7 nothing stored or sent",
        onBack = onBack
    ) {
        item {
            Spacer(Modifier.height(16.dp))
            RevealIn {
                Column {
                    Eyebrow("Test string")
                    Spacer(Modifier.height(10.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(2.dp))
                            .background(Ink.Void)
                            .border(1.dp, Ink.Rule, RoundedCornerShape(2.dp))
                            .padding(horizontal = 14.dp, vertical = 16.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                "$ ",
                                style = MaterialTheme.typography.bodyLarge,
                                color = Ink.Dim
                            )
                            BasicTextField(
                                value = input,
                                onValueChange = { input = it },
                                singleLine = true,
                                textStyle = MaterialTheme.typography.bodyLarge.copy(
                                    color = Ink.White,
                                    fontFamily = TerminalFont
                                ),
                                cursorBrush = SolidColor(Ink.White),
                                keyboardOptions = KeyboardOptions(
                                    capitalization = KeyboardCapitalization.None,
                                    autoCorrect = false
                                ),
                                modifier = Modifier.weight(1f),
                                decorationBox = { inner ->
                                    // Single child: placeholder is layered behind the field.
                                    Box {
                                        if (input.isEmpty()) {
                                            Text(
                                                "type a candidate passphrase\u2026",
                                                style = MaterialTheme.typography.bodyLarge,
                                                color = Ink.Rule
                                            )
                                        }
                                        inner()
                                    }
                                }
                            )
                        }
                    }
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "Never type a passphrase you actually use into any tool, including " +
                            "this one. Test its shape, not the real string.",
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Dim
                    )
                }
            }
            Spacer(Modifier.height(22.dp))
        }

        item {
            RevealIn(delayMillis = 60) {
                Panel {
                    Row(verticalAlignment = Alignment.Bottom) {
                        Column {
                            Eyebrow("Strength")
                            Spacer(Modifier.height(8.dp))
                            ScrambleText(
                                text = analysis.verdict,
                                style = MaterialTheme.typography.headlineMedium,
                                durationMillis = 450
                            )
                        }
                        Spacer(Modifier.weight(1f))
                        Column(horizontalAlignment = Alignment.End) {
                            Text(
                                "${analysis.bits.toInt()}",
                                style = MaterialTheme.typography.displayLarge,
                                color = Ink.White
                            )
                            Text(
                                "BITS",
                                style = MaterialTheme.typography.labelSmall,
                                color = Ink.Dim
                            )
                        }
                    }
                    Spacer(Modifier.height(16.dp))
                    AsciiBar((analysis.bits / 100f).coerceIn(0f, 1f), slots = 22, showPercent = false)
                    Spacer(Modifier.height(18.dp))
                    DashRule()
                    Spacer(Modifier.height(14.dp))
                    Row(Modifier.fillMaxWidth()) {
                        Column(Modifier.weight(1f)) {
                            Eyebrow("Length")
                            Spacer(Modifier.height(5.dp))
                            Text(
                                "${input.length}",
                                style = MaterialTheme.typography.titleMedium,
                                color = Ink.White
                            )
                        }
                        Column(Modifier.weight(1f)) {
                            Eyebrow("Charset")
                            Spacer(Modifier.height(5.dp))
                            Text(
                                "${analysis.charset}",
                                style = MaterialTheme.typography.titleMedium,
                                color = Ink.White
                            )
                        }
                        Column(Modifier.weight(1.4f)) {
                            Eyebrow("Offline crack")
                            Spacer(Modifier.height(5.dp))
                            Text(
                                analysis.crackTime,
                                style = MaterialTheme.typography.titleMedium,
                                color = Ink.White
                            )
                        }
                    }
                }
            }
            Spacer(Modifier.height(18.dp))
        }

        if (analysis.notes.isNotEmpty()) {
            item {
                RevealIn(delayMillis = 100) { Eyebrow("Findings") }
                Spacer(Modifier.height(10.dp))
            }
            itemsIndexed(analysis.notes) { i, note ->
                RevealIn(delayMillis = 130 + i * 40) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 7.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Text(
                            if (note.good) "\u2713" else "!",
                            style = MaterialTheme.typography.bodyMedium,
                            color = if (note.good) Ink.White else Ink.Mid,
                            modifier = Modifier.width(24.dp)
                        )
                        Text(
                            note.text,
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Soft
                        )
                    }
                }
            }
        }

        item {
            Spacer(Modifier.height(22.dp))
            RevealIn(delayMillis = 200) {
                Panel(background = Ink.Void) {
                    Eyebrow("The rule")
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "Length beats complexity. Six random words generated by dice or " +
                            "software is stronger than any clever short string you invented, " +
                            "and far easier to remember. Substitutions like @ for a add " +
                            "almost nothing — every cracking wordlist applies them automatically.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Soft
                    )
                    Spacer(Modifier.height(14.dp))
                    Row {
                        Tag("diceware")
                        Spacer(Modifier.width(8.dp))
                        Tag("6+ words")
                        Spacer(Modifier.width(8.dp))
                        Tag("unique per vault")
                    }
                }
            }
        }
    }
}

private data class Note(val text: String, val good: Boolean)

private data class Analysis(
    val bits: Double,
    val charset: Int,
    val verdict: String,
    val crackTime: String,
    val notes: List<Note>
)

private val COMMON = setOf(
    "password", "123456", "qwerty", "letmein", "admin", "welcome", "monkey",
    "dragon", "iloveyou", "abc123", "111111", "password1", "sunshine", "princess",
    "football", "charlie", "aa123456", "donald", "qwerty123", "master", "login"
)

private fun analyse(input: String): Analysis {
    if (input.isEmpty()) {
        return Analysis(0.0, 0, "EMPTY", "\u2014", emptyList())
    }

    var charset = 0
    if (input.any { it.isLowerCase() }) charset += 26
    if (input.any { it.isUpperCase() }) charset += 26
    if (input.any { it.isDigit() }) charset += 10
    if (input.any { !it.isLetterOrDigit() && !it.isWhitespace() }) charset += 33
    if (input.any { it.isWhitespace() }) charset += 1
    if (charset == 0) charset = 26

    var bits = input.length * (ln(charset.toDouble()) / ln(2.0))

    val notes = mutableListOf<Note>()
    val lower = input.lowercase()

    // ── penalties for what crackers try first ─────────────────────────
    if (COMMON.any { lower.contains(it) }) {
        bits *= 0.25
        notes.add(Note("Contains a string from common breach wordlists — tried within seconds.", false))
    }
    if (Regex("(.)\\1{2,}").containsMatchIn(input)) {
        bits *= 0.85
        notes.add(Note("Repeated characters reduce effective entropy.", false))
    }
    if (Regex("(012|123|234|345|456|567|678|789|abc|qwe|asd|zxc)").containsMatchIn(lower)) {
        bits *= 0.8
        notes.add(Note("Sequential keyboard or numeric run detected.", false))
    }
    if (Regex("^[A-Z][a-z]+\\d{1,4}[!@#$]?$").matches(input)) {
        bits *= 0.5
        notes.add(Note("Classic Capital+word+digits+symbol shape — heavily targeted by rules-based attacks.", false))
    }
    if (Regex("(19|20)\\d{2}").containsMatchIn(input)) {
        bits *= 0.9
        notes.add(Note("Looks like it contains a year — a very small search space.", false))
    }
    if (lower.contains("@") && Regex("[a4][s5][s5]").containsMatchIn(lower)) {
        notes.add(Note("Leetspeak substitutions are applied automatically by cracking rules.", false))
    }

    // ── positives ─────────────────────────────────────────────────────
    val words = input.trim().split(Regex("[\\s\\-_.]+")).filter { it.length > 2 }
    if (words.size >= 4) {
        notes.add(Note("Multi-word passphrase structure — strong and memorable.", true))
    }
    if (input.length >= 20) {
        notes.add(Note("Length above 20 characters defeats offline brute force.", true))
    } else if (input.length < 12) {
        notes.add(Note("Under 12 characters. Length is the dominant factor — add words.", false))
    }
    if (charset >= 85) {
        notes.add(Note("Wide character set in use.", true))
    }

    val verdict = when {
        bits < 28 -> "TRIVIAL"
        bits < 40 -> "WEAK"
        bits < 60 -> "FAIR"
        bits < 80 -> "STRONG"
        else -> "EXCELLENT"
    }

    // 100 billion guesses/sec — a realistic offline GPU rig against fast hashing.
    val guesses = 2.0.pow(bits) / 2.0
    val seconds = guesses / 1e11

    val crackTime = when {
        seconds < 1 -> "instant"
        seconds < 60 -> "${seconds.toInt()}s"
        seconds < 3600 -> "${(seconds / 60).toInt()}m"
        seconds < 86400 -> "${(seconds / 3600).toInt()}h"
        seconds < 2.6e6 -> "${(seconds / 86400).toInt()}d"
        seconds < 3.15e7 -> "${(seconds / 2.6e6).toInt()}mo"
        seconds < 3.15e10 -> "${(seconds / 3.15e7).toInt()}y"
        seconds < 3.15e13 -> "${(seconds / 3.15e10).toInt()}k yr"
        seconds < 3.15e16 -> "${(seconds / 3.15e13).toInt()}M yr"
        else -> "eons"
    }

    return Analysis(bits, charset, verdict, crackTime, notes)
}
