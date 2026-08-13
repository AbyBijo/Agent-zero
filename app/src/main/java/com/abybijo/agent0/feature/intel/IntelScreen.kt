package com.abybijo.agent0.feature.intel

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
import com.abybijo.agent0.data.Cases
import com.abybijo.agent0.data.Resources
import com.abybijo.agent0.nav.Route
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

@Composable
fun IntelScreen(onNavigate: (String) -> Unit) {
    Agent0Screen(
        title = "Intel",
        eyebrow = "Case archive and verified references"
    ) {
        item {
            Spacer(Modifier.height(14.dp))
            RevealIn {
                Panel(
                    modifier = Modifier.noRippleClickable { onNavigate(Route.CASES) }
                ) {
                    Row(verticalAlignment = Alignment.Top) {
                        Text(
                            "\u26A0",
                            style = MaterialTheme.typography.displayLarge,
                            color = Ink.Soft,
                            modifier = Modifier.width(58.dp)
                        )
                        Column(Modifier.weight(1f)) {
                            Text(
                                "Case Archive",
                                style = MaterialTheme.typography.headlineSmall,
                                color = Ink.White
                            )
                            Spacer(Modifier.height(8.dp))
                            Text(
                                "${Cases.all.size} documented OPSEC failures — Snowden, OPM, " +
                                    "SolarWinds, Stuxnet and more — each reduced to what a " +
                                    "defender should change tomorrow.",
                                style = MaterialTheme.typography.bodySmall,
                                color = Ink.Mid
                            )
                            Spacer(Modifier.height(12.dp))
                            Row {
                                Tag("${Cases.all.size} cases")
                                Spacer(Modifier.width(8.dp))
                                Tag("${Cases.tags.size} themes")
                            }
                        }
                        Text("\u203A", style = MaterialTheme.typography.headlineSmall, color = Ink.Rule)
                    }
                }
            }
            Spacer(Modifier.height(12.dp))
        }

        item {
            RevealIn(delayMillis = 70) {
                Panel(
                    modifier = Modifier.noRippleClickable { onNavigate(Route.RESOURCES) }
                ) {
                    Row(verticalAlignment = Alignment.Top) {
                        Text(
                            "\u25F1",
                            style = MaterialTheme.typography.displayLarge,
                            color = Ink.Soft,
                            modifier = Modifier.width(58.dp)
                        )
                        Column(Modifier.weight(1f)) {
                            Text(
                                "Resources",
                                style = MaterialTheme.typography.headlineSmall,
                                color = Ink.White
                            )
                            Spacer(Modifier.height(8.dp))
                            Text(
                                "${Resources.all.size} vetted tools, organisations, books and " +
                                    "training references across ${Resources.categories.size} " +
                                    "categories. Opens in your browser.",
                                style = MaterialTheme.typography.bodySmall,
                                color = Ink.Mid
                            )
                            Spacer(Modifier.height(12.dp))
                            Row {
                                Tag("${Resources.all.size} links")
                                Spacer(Modifier.width(8.dp))
                                Tag("external")
                            }
                        }
                        Text("\u203A", style = MaterialTheme.typography.headlineSmall, color = Ink.Rule)
                    }
                }
            }
            Spacer(Modifier.height(24.dp))
        }

        item {
            RevealIn(delayMillis = 120) { Eyebrow("Featured cases") }
            Spacer(Modifier.height(10.dp))
        }

        itemsIndexed(Cases.all.take(5)) { i, c ->
            RevealIn(delayMillis = 160 + i * 45) {
                Panel(
                    background = Ink.Void,
                    modifier = Modifier
                        .fillMaxWidth()
                        .noRippleClickable { onNavigate(Route.caseDetail(c.id)) }
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            c.year,
                            style = MaterialTheme.typography.labelSmall,
                            color = Ink.Dim,
                            modifier = Modifier.width(46.dp)
                        )
                        Text(
                            c.title,
                            style = MaterialTheme.typography.titleMedium,
                            color = Ink.White,
                            modifier = Modifier.weight(1f)
                        )
                        Text("\u203A", style = MaterialTheme.typography.bodyLarge, color = Ink.Rule)
                    }
                }
            }
            Spacer(Modifier.height(8.dp))
        }
    }
}
