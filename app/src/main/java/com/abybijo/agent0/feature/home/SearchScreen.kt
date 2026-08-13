package com.abybijo.agent0.feature.home

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.data.Cases
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.data.Resources
import com.abybijo.agent0.feature.intel.SearchField
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.EmptyState
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.SolidRule
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

/**
 * Unified search across briefs, cases and resources.
 * Purely local — it filters in-memory data structures.
 */
@Composable
fun SearchScreen(
    onBack: () -> Unit,
    onOpenBrief: (String, String) -> Unit
) {
    var query by remember { mutableStateOf("") }

    val briefs = remember(query) { Curriculum.search(query) }
    val cases = remember(query) {
        if (query.isBlank()) emptyList() else Cases.search(query).take(8)
    }
    val resources = remember(query) {
        if (query.isBlank()) emptyList() else Resources.search(query).take(8)
    }
    val total = briefs.size + cases.size + resources.size

    Agent0Screen(
        title = "Search",
        eyebrow = if (query.isBlank()) "Briefs, cases and references" else "$total results",
        onBack = onBack
    ) {
        item {
            Spacer(Modifier.height(12.dp))
            SearchField(query, "search everything\u2026") { query = it }
            Spacer(Modifier.height(20.dp))
        }

        if (query.isBlank()) {
            item {
                EmptyState("Type to search ${Curriculum.totalBriefs} briefs, " +
                    "${Cases.all.size} cases and ${Resources.all.size} references.", "\u2315")
            }
        } else if (total == 0) {
            item { EmptyState("Nothing found for \"$query\".") }
        }

        if (briefs.isNotEmpty()) {
            item {
                Eyebrow("Briefs \u00B7 ${briefs.size}")
                Spacer(Modifier.height(4.dp))
            }
            itemsIndexed(briefs) { i, (chapter, brief) ->
                RevealIn(delayMillis = (i.coerceAtMost(8)) * 30) {
                    Column {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .noRippleClickable { onOpenBrief(chapter.id, brief.id) }
                                .padding(vertical = 14.dp),
                            verticalAlignment = Alignment.Top
                        ) {
                            Text(
                                brief.glyph,
                                style = MaterialTheme.typography.bodyLarge,
                                color = Ink.Soft,
                                modifier = Modifier.width(30.dp)
                            )
                            Column(Modifier.weight(1f)) {
                                Text(
                                    brief.title,
                                    style = MaterialTheme.typography.titleMedium,
                                    color = Ink.White
                                )
                                Spacer(Modifier.height(4.dp))
                                Text(
                                    "${chapter.code} \u00B7 ${chapter.title}",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = Ink.Dim
                                )
                                Spacer(Modifier.height(6.dp))
                                Text(
                                    brief.summary,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Ink.Mid
                                )
                            }
                            Text(
                                "\u203A",
                                style = MaterialTheme.typography.headlineSmall,
                                color = Ink.Rule
                            )
                        }
                        SolidRule(color = Ink.Hairline)
                    }
                }
            }
            item { Spacer(Modifier.height(20.dp)) }
        }

        if (cases.isNotEmpty()) {
            item {
                Eyebrow("Cases \u00B7 ${cases.size}")
                Spacer(Modifier.height(4.dp))
            }
            itemsIndexed(cases) { i, c ->
                RevealIn(delayMillis = (i.coerceAtMost(8)) * 30) {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(vertical = 13.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                c.year,
                                style = MaterialTheme.typography.labelSmall,
                                color = Ink.Dim,
                                modifier = Modifier.width(46.dp)
                            )
                            Text(
                                c.title,
                                style = MaterialTheme.typography.bodyMedium,
                                color = Ink.Soft,
                                modifier = Modifier.weight(1f)
                            )
                        }
                        SolidRule(color = Ink.Hairline)
                    }
                }
            }
            item { Spacer(Modifier.height(20.dp)) }
        }

        if (resources.isNotEmpty()) {
            item {
                Eyebrow("References \u00B7 ${resources.size}")
                Spacer(Modifier.height(4.dp))
            }
            itemsIndexed(resources) { i, r ->
                RevealIn(delayMillis = (i.coerceAtMost(8)) * 30) {
                    Column {
                        Column(Modifier.fillMaxWidth().padding(vertical = 13.dp)) {
                            Text(
                                r.name,
                                style = MaterialTheme.typography.bodyMedium,
                                color = Ink.Soft
                            )
                            Spacer(Modifier.height(4.dp))
                            Text(
                                r.category,
                                style = MaterialTheme.typography.labelSmall,
                                color = Ink.Dim
                            )
                        }
                        SolidRule(color = Ink.Hairline)
                    }
                }
            }
        }
    }
}
