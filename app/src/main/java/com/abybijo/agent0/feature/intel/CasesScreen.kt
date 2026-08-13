package com.abybijo.agent0.feature.intel

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
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
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.data.Cases
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.EmptyState
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.TerminalFont

@Composable
fun CasesScreen(onBack: () -> Unit, onOpen: (String) -> Unit) {
    var query by remember { mutableStateOf("") }
    var tag by remember { mutableStateOf<String?>(null) }

    val results = remember(query, tag) { Cases.search(query, tag) }

    Agent0Screen(
        title = "Case Archive",
        eyebrow = "${results.size} of ${Cases.all.size} cases",
        onBack = onBack
    ) {
        item {
            Spacer(Modifier.height(12.dp))
            SearchField(
                value = query,
                placeholder = "search cases\u2026",
                onChange = { query = it }
            )
            Spacer(Modifier.height(12.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ) {
                FilterChip("ALL", tag == null) { tag = null }
                Cases.tags.take(14).forEach { t ->
                    Spacer(Modifier.width(7.dp))
                    FilterChip(t, tag == t) { tag = if (tag == t) null else t }
                }
            }
            Spacer(Modifier.height(16.dp))
        }

        if (results.isEmpty()) {
            item { EmptyState("No cases match that filter.") }
        }

        itemsIndexed(results) { i, c ->
            RevealIn(delayMillis = (i.coerceAtMost(10)) * 35) {
                Panel(
                    modifier = Modifier
                        .fillMaxWidth()
                        .noRippleClickable { onOpen(c.id) }
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            c.year,
                            style = MaterialTheme.typography.labelSmall,
                            color = Ink.Dim
                        )
                        Spacer(Modifier.weight(1f))
                        Text("\u203A", style = MaterialTheme.typography.bodyLarge, color = Ink.Rule)
                    }
                    Spacer(Modifier.height(8.dp))
                    Text(
                        c.title,
                        style = MaterialTheme.typography.titleMedium,
                        color = Ink.White
                    )
                    Spacer(Modifier.height(9.dp))
                    Text(
                        c.summary,
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Mid,
                        maxLines = 3
                    )
                    Spacer(Modifier.height(12.dp))
                    Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                        c.tags.forEachIndexed { j, t ->
                            if (j > 0) Spacer(Modifier.width(7.dp))
                            Tag(t)
                        }
                    }
                }
            }
            Spacer(Modifier.height(10.dp))
        }
    }
}

@Composable
fun CaseDetailScreen(caseId: String, onBack: () -> Unit) {
    val c = Cases.all.firstOrNull { it.id == caseId }
    if (c == null) {
        Agent0Screen(title = "Not found", onBack = onBack) {
            item { EmptyState("That case is not in the archive.") }
        }
        return
    }

    Agent0Screen(title = c.title, eyebrow = "Case file \u00B7 ${c.year}", onBack = onBack) {
        item {
            Spacer(Modifier.height(14.dp))
            RevealIn {
                Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    c.tags.forEachIndexed { i, t ->
                        if (i > 0) Spacer(Modifier.width(7.dp))
                        Tag(t)
                    }
                }
            }
            Spacer(Modifier.height(20.dp))
        }

        item {
            RevealIn(delayMillis = 60) {
                Panel(background = Ink.Void) {
                    Eyebrow("Summary")
                    Spacer(Modifier.height(11.dp))
                    Text(
                        c.summary,
                        style = MaterialTheme.typography.bodyLarge,
                        color = Ink.Soft
                    )
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        item {
            RevealIn(delayMillis = 110) {
                Column {
                    Eyebrow("What happened")
                    Spacer(Modifier.height(11.dp))
                    Text(
                        c.details,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Soft
                    )
                }
            }
            Spacer(Modifier.height(24.dp))
        }

        item {
            RevealIn(delayMillis = 160) { Eyebrow("Lessons for defenders") }
            Spacer(Modifier.height(8.dp))
        }

        itemsIndexed(c.lessons) { i, lesson ->
            RevealIn(delayMillis = 200 + i * 50) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 13.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Text(
                            (i + 1).toString().padStart(2, '0'),
                            style = MaterialTheme.typography.labelSmall,
                            color = Ink.Dim,
                            modifier = Modifier.width(30.dp).padding(top = 2.dp)
                        )
                        Text(
                            lesson,
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Soft
                        )
                    }
                    DashRule()
                }
            }
        }
    }
}

@Composable
fun SearchField(value: String, placeholder: String, onChange: (String) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(2.dp))
            .background(Ink.Void)
            .border(1.dp, Ink.Hairline, RoundedCornerShape(2.dp))
            .padding(horizontal = 13.dp, vertical = 13.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("\u2315 ", style = MaterialTheme.typography.bodyMedium, color = Ink.Dim)
            BasicTextField(
                value = value,
                onValueChange = onChange,
                singleLine = true,
                textStyle = MaterialTheme.typography.bodyMedium.copy(
                    color = Ink.White,
                    fontFamily = TerminalFont
                ),
                cursorBrush = SolidColor(Ink.White),
                modifier = Modifier.weight(1f),
                decorationBox = { inner ->
                    // Single child: placeholder is layered behind the field.
                    Box {
                        if (value.isEmpty()) {
                            Text(
                                placeholder,
                                style = MaterialTheme.typography.bodyMedium,
                                color = Ink.Rule
                            )
                        }
                        inner()
                    }
                }
            )
            if (value.isNotEmpty()) {
                Text(
                    "\u2715",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Ink.Dim,
                    modifier = Modifier.noRippleClickable { onChange("") }
                )
            }
        }
    }
}

@Composable
private fun FilterChip(text: String, selected: Boolean, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(2.dp))
            .background(if (selected) Ink.White else Ink.Panel)
            .border(1.dp, if (selected) Ink.White else Ink.Hairline, RoundedCornerShape(2.dp))
            .noRippleClickable(onClick = onClick)
            .padding(horizontal = 11.dp, vertical = 7.dp)
    ) {
        Text(
            text.uppercase(),
            style = MaterialTheme.typography.labelSmall,
            color = if (selected) Ink.Black else Ink.Mid
        )
    }
}
