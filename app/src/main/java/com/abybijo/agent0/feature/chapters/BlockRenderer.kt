package com.abybijo.agent0.feature.chapters

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.data.Block
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

/**
 * Renders one content [Block]. Kept separate from the screen so every block
 * type has exactly one visual definition across the whole app.
 */
@Composable
fun BlockView(block: Block, onOpenUrl: (String) -> Unit) {
    when (block) {
        is Block.Para -> Text(
            text = block.text,
            style = MaterialTheme.typography.bodyLarge,
            color = Ink.Soft,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        is Block.Heading -> Column(Modifier.padding(top = 10.dp, bottom = 12.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (block.glyph.isNotEmpty()) {
                    Text(
                        block.glyph,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Dim
                    )
                    Spacer(Modifier.width(9.dp))
                }
                Text(
                    block.text,
                    style = MaterialTheme.typography.titleMedium,
                    color = Ink.White
                )
            }
        }

        is Block.Bullets -> Column(Modifier.padding(bottom = 14.dp)) {
            block.items.forEach { item ->
                Row(
                    modifier = Modifier.padding(vertical = 5.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Text(
                        "\u2022",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Ink.Rule,
                        modifier = Modifier.width(20.dp)
                    )
                    Text(
                        item,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Soft
                    )
                }
            }
        }

        is Block.Numbered -> Column(Modifier.padding(bottom = 14.dp)) {
            block.items.forEachIndexed { i, item ->
                Row(
                    modifier = Modifier.padding(vertical = 6.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Text(
                        (i + 1).toString().padStart(2, '0'),
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim,
                        modifier = Modifier.width(28.dp).padding(top = 3.dp)
                    )
                    Text(
                        item,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Soft
                    )
                }
            }
        }

        is Block.Field -> Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clip(RoundedCornerShape(2.dp))
                .background(Ink.Void)
                .border(1.dp, Ink.Rule, RoundedCornerShape(2.dp))
        ) {
            Row {
                Box(Modifier.width(3.dp).height(0.dp))
                Column(Modifier.padding(16.dp)) {
                    Eyebrow(block.label, color = Ink.Mid)
                    Spacer(Modifier.height(10.dp))
                    Text(
                        block.text,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Soft
                    )
                }
            }
        }

        is Block.Terminal -> Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
                .clip(RoundedCornerShape(2.dp))
                .background(Ink.Void)
                .border(1.dp, Ink.Hairline, RoundedCornerShape(2.dp))
        ) {
            Column(
                Modifier
                    .horizontalScroll(rememberScrollState())
                    .padding(14.dp)
            ) {
                block.lines.forEach { line ->
                    Text(
                        text = if (line.isEmpty()) " " else line,
                        style = MaterialTheme.typography.bodySmall,
                        color = when {
                            line.startsWith("$") -> Ink.White
                            line.startsWith(">") -> Ink.White
                            line.startsWith("!") -> Ink.Soft
                            else -> Ink.Mid
                        }
                    )
                }
            }
        }

        is Block.Table -> Column(Modifier.padding(vertical = 8.dp)) {
            block.rows.forEachIndexed { i, (k, v) ->
                if (i > 0) DashRule()
                Column(Modifier.padding(vertical = 12.dp)) {
                    Text(
                        k,
                        style = MaterialTheme.typography.titleMedium,
                        color = Ink.White
                    )
                    Spacer(Modifier.height(6.dp))
                    Text(
                        v,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Mid
                    )
                }
            }
        }

        is Block.Link -> Column(
            modifier = Modifier
                .fillMaxWidth()
                .noRippleClickable { onOpenUrl(block.url) }
                .padding(vertical = 10.dp)
        ) {
            Text(
                text = "${block.title} \u2197",
                style = MaterialTheme.typography.bodyMedium,
                color = Ink.White,
                textDecoration = TextDecoration.Underline
            )
            if (block.note.isNotEmpty()) {
                Spacer(Modifier.height(4.dp))
                Text(block.note, style = MaterialTheme.typography.bodySmall, color = Ink.Dim)
            }
        }
    }
}
