package com.abybijo.agent0.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.Progress
import com.abybijo.agent0.data.Cases
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.data.Resources
import com.abybijo.agent0.data.Scenarios
import com.abybijo.agent0.nav.Route
import com.abybijo.agent0.ui.components.Agent0Mark
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.ScrambleText
import com.abybijo.agent0.ui.components.SolidRule
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.components.TypewriterText
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip

/**
 * Base of operations. Shows clearance, the next brief to read, and quick
 * routes into every subsystem. Everything staggers in on load.
 */
@Composable
fun HomeScreen(
    progress: Progress,
    onOpenBrief: (String, String) -> Unit,
    onNavigate: (String) -> Unit
) {
    val nextKey = progress.nextBriefKey
    val next = nextKey?.split("/")?.let { (c, b) ->
        Curriculum.chapter(c)?.let { ch -> ch to ch.briefs.first { it.id == b } }
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Ink.Black)
            .statusBarsPadding(),
        contentPadding = androidx.compose.foundation.layout.PaddingValues(
            start = 20.dp, end = 20.dp, top = 18.dp, bottom = 30.dp
        )
    ) {
        // ── identity header ───────────────────────────────────────────
        item {
            RevealIn {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Agent0Mark(size = 30.dp)
                    Spacer(Modifier.width(12.dp))
                    Column(Modifier.weight(1f)) {
                        Text(
                            "AGENT-0",
                            style = MaterialTheme.typography.titleMedium,
                            color = Ink.White
                        )
                        Text(
                            "OPSEC TRAINING PROGRAM",
                            style = MaterialTheme.typography.labelSmall,
                            color = Ink.Dim
                        )
                    }
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(2.dp))
                            .noRippleClickable { onNavigate(Route.SEARCH) }
                            .padding(8.dp)
                    ) {
                        Text(
                            "\u2315",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Ink.Soft
                        )
                    }
                }
            }
            Spacer(Modifier.height(22.dp))
        }

        // ── clearance ─────────────────────────────────────────────────
        item {
            RevealIn(delayMillis = 60) {
                Panel {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Column {
                            Eyebrow("Clearance")
                            Spacer(Modifier.height(8.dp))
                            ScrambleText(
                                text = progress.rank,
                                style = MaterialTheme.typography.headlineMedium,
                                durationMillis = 700
                            )
                        }
                        Text(
                            "${(progress.clearance * 100).toInt()}%",
                            style = MaterialTheme.typography.headlineMedium,
                            color = Ink.White
                        )
                    }
                    Spacer(Modifier.height(16.dp))
                    AsciiBar(progress = progress.clearance, slots = 22, showPercent = false)
                    Spacer(Modifier.height(16.dp))
                    DashRule()
                    Spacer(Modifier.height(14.dp))
                    Row(Modifier.fillMaxWidth()) {
                        MiniStat(
                            "Briefs",
                            "${progress.completedBriefs.size}/${Curriculum.totalBriefs}",
                            Modifier.weight(1f)
                        )
                        MiniStat(
                            "Drills",
                            "${progress.scenariosDone.size}/${Scenarios.all.size}",
                            Modifier.weight(1f)
                        )
                        MiniStat(
                            "Quiz",
                            if (progress.quizRuns > 0) "${progress.quizBest}/10" else "\u2014",
                            Modifier.weight(1f)
                        )
                    }
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── next up ───────────────────────────────────────────────────
        item {
            RevealIn(delayMillis = 120) {
                if (next != null) {
                    val (chapter, brief) = next
                    Panel(
                        borderColor = Ink.Rule,
                        modifier = Modifier.noRippleClickable {
                            onOpenBrief(chapter.id, brief.id)
                        }
                    ) {
                        Row(
                            Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Eyebrow(
                                if (progress.completedBriefs.isEmpty()) "Start here"
                                else "Resume"
                            )
                            Text(
                                "${chapter.code} \u00B7 ${brief.minutes} MIN",
                                style = MaterialTheme.typography.labelSmall,
                                color = Ink.Dim
                            )
                        }
                        Spacer(Modifier.height(12.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                brief.glyph,
                                style = MaterialTheme.typography.headlineSmall,
                                color = Ink.Soft
                            )
                            Spacer(Modifier.width(12.dp))
                            TypewriterText(
                                text = brief.title,
                                style = MaterialTheme.typography.headlineSmall,
                                charDelayMillis = 24,
                                startDelayMillis = 200
                            )
                        }
                        Spacer(Modifier.height(10.dp))
                        Text(
                            brief.summary,
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Mid
                        )
                        Spacer(Modifier.height(14.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                "OPEN BRIEF",
                                style = MaterialTheme.typography.labelSmall,
                                color = Ink.White
                            )
                            Spacer(Modifier.width(8.dp))
                            Text("\u2192", style = MaterialTheme.typography.bodyMedium, color = Ink.White)
                        }
                    }
                } else {
                    Panel(borderColor = Ink.Rule) {
                        Eyebrow("Curriculum complete")
                        Spacer(Modifier.height(10.dp))
                        Text(
                            "All ${Curriculum.totalBriefs} briefs read. Competence here is a " +
                                "maintained state, not an achieved one — keep the checklists " +
                                "and monthly diagnostic running.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Mid
                        )
                    }
                }
            }
            Spacer(Modifier.height(22.dp))
        }

        // ── quick access ──────────────────────────────────────────────
        item {
            RevealIn(delayMillis = 180) { Eyebrow("Subsystems") }
            Spacer(Modifier.height(10.dp))
        }

        val entries = listOf(
            QuickEntry("\u2630", "Chapters", "${Curriculum.chapters.size} tracks \u00B7 ${Curriculum.totalBriefs} briefs", Route.CHAPTERS),
            QuickEntry("\u2317", "Scenario Drills", "${Scenarios.all.size} branching decisions", Route.SCENARIO_LIST),
            QuickEntry("\u25C9", "Assessment", "Test recall under pressure", Route.QUIZ),
            QuickEntry("\u2713", "Checklists", "Daily, weekly, travel, incident", Route.CHECKLISTS),
            QuickEntry("\u25D4", "Self-Diagnostic", "Score your current posture", Route.DIAGNOSTIC),
            QuickEntry("\u26A0", "Case Archive", "${Cases.all.size} documented failures", Route.CASES),
            QuickEntry("\u25F1", "Resources", "${Resources.all.size} vetted references", Route.RESOURCES)
        )

        itemsIndexed(entries) { i, e ->
            RevealIn(delayMillis = 210 + i * 40) {
                QuickRow(entry = e, onClick = { onNavigate(e.route) })
            }
        }

        item {
            Spacer(Modifier.height(26.dp))
            RevealIn(delayMillis = 520) {
                Panel(background = Ink.Void, borderColor = Ink.Hairline) {
                    Text(
                        "RULE 01",
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "You don't talk about this.",
                        style = MaterialTheme.typography.titleMedium,
                        color = Ink.Soft
                    )
                }
            }
        }
    }
}

private data class QuickEntry(
    val glyph: String,
    val title: String,
    val subtitle: String,
    val route: String
)

@Composable
private fun QuickRow(entry: QuickEntry, onClick: () -> Unit) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .noRippleClickable(onClick = onClick)
                .padding(vertical = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                entry.glyph,
                style = MaterialTheme.typography.bodyLarge,
                color = Ink.Soft,
                modifier = Modifier.width(30.dp)
            )
            Column(Modifier.weight(1f)) {
                Text(
                    entry.title,
                    style = MaterialTheme.typography.titleMedium,
                    color = Ink.White
                )
                Spacer(Modifier.height(3.dp))
                Text(
                    entry.subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = Ink.Dim,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Text("\u203A", style = MaterialTheme.typography.headlineSmall, color = Ink.Rule)
        }
        SolidRule(color = Ink.Hairline)
    }
}

@Composable
private fun MiniStat(label: String, value: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(label.uppercase(), style = MaterialTheme.typography.labelSmall, color = Ink.Dim)
        Spacer(Modifier.height(5.dp))
        Text(value, style = MaterialTheme.typography.titleMedium, color = Ink.White)
    }
}
