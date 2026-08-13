package com.abybijo.agent0.feature.drills

import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.ScrambleText
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

/**
 * Risk = Threat × Vulnerability × Impact, scored 1..5 each.
 * Deliberately crude: the value is in forcing the three-factor conversation,
 * not in false precision.
 */
@Composable
fun RiskScreen(onBack: () -> Unit) {
    var threat by remember { mutableIntStateOf(3) }
    var vuln by remember { mutableIntStateOf(3) }
    var impact by remember { mutableIntStateOf(3) }

    val raw = threat * vuln * impact          // 1..125
    val pct = raw / 125f
    val band = when {
        raw >= 75 -> "CRITICAL"
        raw >= 45 -> "HIGH"
        raw >= 20 -> "MODERATE"
        raw >= 8 -> "LOW"
        else -> "MINIMAL"
    }
    val advice = when {
        raw >= 75 -> "Act now. Reduce the vulnerability this week, and build a recovery path in parallel — assume this one will be attempted."
        raw >= 45 -> "Schedule mitigation deliberately. Add detection so you know if it starts, even before prevention is complete."
        raw >= 20 -> "Worth a proportionate control. Automate it so it costs you no ongoing attention."
        raw >= 8 -> "Document and monitor. Revisit if any of the three factors changes."
        else -> "Accept explicitly and move on. Note the decision so it isn't re-litigated."
    }

    Agent0Screen(
        title = "Risk Calculator",
        eyebrow = "Threat \u00D7 Vulnerability \u00D7 Impact",
        onBack = onBack
    ) {
        item {
            Spacer(Modifier.height(14.dp))
            RevealIn {
                Panel {
                    Eyebrow("Computed risk")
                    Spacer(Modifier.height(12.dp))
                    Row(verticalAlignment = Alignment.Bottom) {
                        ScrambleText(
                            text = band,
                            style = MaterialTheme.typography.headlineMedium,
                            durationMillis = 500
                        )
                        Spacer(Modifier.weight(1f))
                        Text(
                            "$raw",
                            style = MaterialTheme.typography.displayLarge,
                            color = Ink.White
                        )
                        Text(
                            "/125",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Dim
                        )
                    }
                    Spacer(Modifier.height(16.dp))
                    AsciiBar(pct, slots = 22, showPercent = false)
                    Spacer(Modifier.height(16.dp))
                    DashRule()
                    Spacer(Modifier.height(14.dp))
                    Text(advice, style = MaterialTheme.typography.bodyMedium, color = Ink.Soft)
                }
            }
            Spacer(Modifier.height(22.dp))
        }

        item {
            RevealIn(delayMillis = 70) {
                Stepper(
                    label = "Threat",
                    hint = "How capable and motivated is the adversary?",
                    value = threat,
                    labels = listOf(
                        "Nobody is trying",
                        "Opportunistic sweeps",
                        "Criminal interest",
                        "Targeted and skilled",
                        "Resourced and patient"
                    ),
                    onChange = { threat = it }
                )
            }
            Spacer(Modifier.height(16.dp))
        }
        item {
            RevealIn(delayMillis = 110) {
                Stepper(
                    label = "Vulnerability",
                    hint = "How likely is an attempt to succeed here?",
                    value = vuln,
                    labels = listOf(
                        "Hardened, layered",
                        "Solid, minor gaps",
                        "Average defences",
                        "Known weaknesses",
                        "Effectively open"
                    ),
                    onChange = { vuln = it }
                )
            }
            Spacer(Modifier.height(16.dp))
        }
        item {
            RevealIn(delayMillis = 150) {
                Stepper(
                    label = "Impact",
                    hint = "What happens the day it's exposed?",
                    value = impact,
                    labels = listOf(
                        "Negligible",
                        "Inconvenient",
                        "Costly",
                        "Severe",
                        "Existential / safety"
                    ),
                    onChange = { impact = it }
                )
            }
            Spacer(Modifier.height(22.dp))
        }

        item {
            RevealIn(delayMillis = 190) {
                Panel(background = Ink.Void) {
                    Eyebrow("Remember")
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "If any factor is genuinely near zero, the risk is near zero — that " +
                            "is the point of the multiplication. A terrifying vulnerability " +
                            "nobody can reach, or a determined adversary after something " +
                            "worthless, are both noise competing for attention you should " +
                            "spend elsewhere.",
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Mid
                    )
                }
            }
        }
    }
}

@Composable
private fun Stepper(
    label: String,
    hint: String,
    value: Int,
    labels: List<String>,
    onChange: (Int) -> Unit
) {
    val haptic = LocalHapticFeedback.current
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Eyebrow(label)
            Spacer(Modifier.weight(1f))
            Text(
                labels[value - 1],
                style = MaterialTheme.typography.labelSmall,
                color = Ink.Mid
            )
        }
        Spacer(Modifier.height(6.dp))
        Text(hint, style = MaterialTheme.typography.bodySmall, color = Ink.Dim)
        Spacer(Modifier.height(12.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(7.dp)) {
            (1..5).forEach { n ->
                val active = n <= value
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(42.dp)
                        .clip(RoundedCornerShape(2.dp))
                        .background(if (active) Ink.White else Ink.Panel)
                        .border(
                            1.dp,
                            if (n == value) Ink.White else Ink.Hairline,
                            RoundedCornerShape(2.dp)
                        )
                        .noRippleClickable {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            onChange(n)
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "$n",
                        style = MaterialTheme.typography.titleMedium,
                        color = if (active) Ink.Black else Ink.Dim
                    )
                }
            }
        }
    }
}
