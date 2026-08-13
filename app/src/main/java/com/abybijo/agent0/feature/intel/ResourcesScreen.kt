package com.abybijo.agent0.feature.intel

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.data.ResourceItem
import com.abybijo.agent0.data.Resources
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.EmptyState
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.SolidRule
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

@Composable
fun ResourcesScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    var query by remember { mutableStateOf("") }
    var category by remember { mutableStateOf<String?>(null) }

    val results = remember(query, category) {
        Resources.search(query).let { list ->
            if (category == null) list else list.filter { it.category == category }
        }
    }
    val grouped = remember(results) { results.groupBy { it.category } }

    val open: (String) -> Unit = { url ->
        runCatching {
            context.startActivity(
                Intent.createChooser(Intent(Intent.ACTION_VIEW, Uri.parse(url)), "Open reference")
            )
        }
    }

    Agent0Screen(
        title = "Resources",
        eyebrow = "${results.size} references \u00B7 opens in your browser",
        onBack = onBack
    ) {
        item {
            Spacer(Modifier.height(12.dp))
            SearchField(query, "search tools, orgs, books\u2026") { query = it }
            Spacer(Modifier.height(12.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ) {
                CategoryChip("ALL", category == null) { category = null }
                Resources.categories.forEach { c ->
                    Spacer(Modifier.width(7.dp))
                    CategoryChip(c, category == c) { category = if (category == c) null else c }
                }
            }
            Spacer(Modifier.height(10.dp))
            RevealIn {
                Panel(background = Ink.Void) {
                    Text(
                        "Agent-0 has no network access. These links hand off to your browser " +
                            "so you can verify each project yourself — which is exactly what " +
                            "you should do before trusting any security tool.",
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Mid
                    )
                }
            }
            Spacer(Modifier.height(18.dp))
        }

        if (results.isEmpty()) {
            item { EmptyState("Nothing matches that search.") }
        }

        grouped.forEach { (cat, items) ->
            item(key = "h-$cat") {
                Spacer(Modifier.height(10.dp))
                Eyebrow("$cat \u00B7 ${items.size}")
                Spacer(Modifier.height(6.dp))
            }
            itemsIndexed(items, key = { _, r -> "${cat}-${r.name}" }) { i, r ->
                RevealIn(delayMillis = (i.coerceAtMost(8)) * 30) {
                    ResourceRow(item = r, onClick = { open(r.url) })
                }
            }
        }
    }
}

@Composable
private fun ResourceRow(item: ResourceItem, onClick: () -> Unit) {
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .noRippleClickable(onClick = onClick)
                .padding(vertical = 15.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    item.name,
                    style = MaterialTheme.typography.titleMedium,
                    color = Ink.White,
                    textDecoration = TextDecoration.Underline,
                    modifier = Modifier.weight(1f)
                )
                Spacer(Modifier.width(8.dp))
                Text("\u2197", style = MaterialTheme.typography.bodyMedium, color = Ink.Mid)
            }
            Spacer(Modifier.height(6.dp))
            Text(item.description, style = MaterialTheme.typography.bodySmall, color = Ink.Mid)
            Spacer(Modifier.height(5.dp))
            Text(item.url, style = MaterialTheme.typography.bodySmall, color = Ink.Rule)
        }
        SolidRule(color = Ink.Hairline)
    }
}

@Composable
private fun CategoryChip(text: String, selected: Boolean, onClick: () -> Unit) {
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
