package com.abybijo.agent0.feature.about

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.data.Cases
import com.abybijo.agent0.data.Checklists
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.data.QuizBank
import com.abybijo.agent0.data.Resources
import com.abybijo.agent0.data.Scenarios
import com.abybijo.agent0.nav.Route
import com.abybijo.agent0.ui.components.Agent0Logo
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.ScrambleText
import com.abybijo.agent0.ui.components.SolidRule
import com.abybijo.agent0.ui.components.StatRow
import com.abybijo.agent0.ui.components.Tag
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.theme.Ink

/** Author + project constants. Edit here to rebrand a fork. */
object Credits {
    const val AUTHOR = "Aby Bijo"
    const val GITHUB = "https://github.com/AbyBijo"
    const val EMAIL_PRIMARY = "Abybijo1978@gmail.com"
    const val EMAIL_ACADEMIC = "abybijo2025bca@mac.edu.in"
    const val VERSION = "1.0.0"
}

@Composable
fun AboutScreen(onNavigate: (String) -> Unit) {
    val context = LocalContext.current

    val openUrl: (String) -> Unit = { url ->
        runCatching {
            context.startActivity(
                Intent.createChooser(Intent(Intent.ACTION_VIEW, Uri.parse(url)), "Open link")
            )
        }
    }
    val sendMail: (String) -> Unit = { address ->
        runCatching {
            context.startActivity(
                Intent.createChooser(
                    Intent(Intent.ACTION_SENDTO).apply {
                        data = Uri.parse("mailto:$address")
                        putExtra(Intent.EXTRA_SUBJECT, "Agent-0 feedback")
                    },
                    "Send email"
                )
            )
        }
    }

    Agent0Screen(
        title = "About",
        eyebrow = "Agent-0 \u00B7 v${Credits.VERSION}",
        action = {
            Box(
                Modifier
                    .clip(RoundedCornerShape(2.dp))
                    .noRippleClickable { onNavigate(Route.SETTINGS) }
                    .padding(6.dp)
            ) {
                Text("\u2699", style = MaterialTheme.typography.headlineSmall, color = Ink.Soft)
            }
        }
    ) {
        // ── sigil ─────────────────────────────────────────────────────
        item {
            Spacer(Modifier.height(24.dp))
            RevealIn {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Agent0Logo(size = 104.dp, spin = true)
                    Spacer(Modifier.height(20.dp))
                    ScrambleText(
                        text = "AGENT-0",
                        style = MaterialTheme.typography.displayLarge,
                        durationMillis = 800
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "OPSEC TRAINING PROGRAM",
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim
                    )
                }
            }
            Spacer(Modifier.height(32.dp))
        }

        // ── with love ─────────────────────────────────────────────────
        item {
            RevealIn(delayMillis = 80) {
                Panel {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            "With love",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Ink.Mid
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "By ${Credits.AUTHOR}",
                            style = MaterialTheme.typography.headlineMedium,
                            color = Ink.White,
                            textAlign = TextAlign.Center
                        )
                    }
                    Spacer(Modifier.height(20.dp))
                    DashRule()
                    Spacer(Modifier.height(6.dp))

                    ContactRow(
                        label = "GitHub",
                        value = "github.com/AbyBijo",
                        onClick = { openUrl(Credits.GITHUB) }
                    )
                    DashRule()
                    ContactRow(
                        label = "Email",
                        value = Credits.EMAIL_PRIMARY,
                        onClick = { sendMail(Credits.EMAIL_PRIMARY) }
                    )
                    DashRule()
                    ContactRow(
                        label = "Academic",
                        value = Credits.EMAIL_ACADEMIC,
                        onClick = { sendMail(Credits.EMAIL_ACADEMIC) }
                    )
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── free ──────────────────────────────────────────────────────
        item {
            RevealIn(delayMillis = 130) {
                Panel(background = Ink.Void) {
                    Eyebrow("No payment. Ever.")
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "Every chapter, drill, case file and reference is unlocked. There " +
                            "are no purchases, no subscriptions, no ads, no accounts and no " +
                            "analytics. Security education behind a paywall protects nobody.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Soft
                    )
                    Spacer(Modifier.height(14.dp))
                    Row {
                        Tag("free", filled = true)
                        Spacer(Modifier.width(7.dp))
                        Tag("offline")
                        Spacer(Modifier.width(7.dp))
                        Tag("no tracking")
                    }
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── contents ──────────────────────────────────────────────────
        item {
            RevealIn(delayMillis = 180) {
                Panel {
                    Eyebrow("What's inside")
                    Spacer(Modifier.height(14.dp))
                    StatRow("Chapters", "${Curriculum.chapters.size}")
                    Spacer(Modifier.height(10.dp))
                    StatRow("Briefs", "${Curriculum.totalBriefs}")
                    Spacer(Modifier.height(10.dp))
                    StatRow("Reading time", "~${Curriculum.totalMinutes} min")
                    Spacer(Modifier.height(10.dp))
                    StatRow("Scenario drills", "${Scenarios.all.size}")
                    Spacer(Modifier.height(10.dp))
                    StatRow("Quiz bank", "${QuizBank.all.size}")
                    Spacer(Modifier.height(10.dp))
                    StatRow("Checklist items", "${Checklists.totalItems}")
                    Spacer(Modifier.height(10.dp))
                    StatRow("Case files", "${Cases.all.size}")
                    Spacer(Modifier.height(10.dp))
                    StatRow("References", "${Resources.all.size}")
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── privacy ───────────────────────────────────────────────────
        item {
            RevealIn(delayMillis = 220) {
                Panel {
                    Eyebrow("Privacy by construction")
                    Spacer(Modifier.height(12.dp))
                    listOf(
                        "The app declares no INTERNET permission — it cannot phone home even if it wanted to.",
                        "All progress lives in this app's private storage and is wiped on uninstall.",
                        "The Passphrase Lab runs in memory; nothing you type is stored or logged.",
                        "External references hand off to your browser through a chooser, so you stay in control."
                    ).forEach {
                        Row(
                            modifier = Modifier.padding(vertical = 6.dp),
                            verticalAlignment = Alignment.Top
                        ) {
                            Text(
                                "\u25B8",
                                style = MaterialTheme.typography.bodyMedium,
                                color = Ink.Dim,
                                modifier = Modifier.width(20.dp)
                            )
                            Text(it, style = MaterialTheme.typography.bodyMedium, color = Ink.Soft)
                        }
                    }
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── disclaimer ────────────────────────────────────────────────
        item {
            RevealIn(delayMillis = 260) {
                Panel(background = Ink.Void, borderColor = Ink.Rule) {
                    Eyebrow("Disclaimer")
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "Agent-0 is educational material for defensive operational security. " +
                            "Attack techniques are described only so they can be recognised and " +
                            "resisted. It is not legal advice, and laws governing encryption, " +
                            "anonymity, and recording differ substantially between countries — " +
                            "you are responsible for your own compliance. For a state-level " +
                            "adversary, seek a professional assessment.",
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Mid
                    )
                }
            }
            Spacer(Modifier.height(14.dp))
        }

        // ── acknowledgements ──────────────────────────────────────────
        item {
            RevealIn(delayMillis = 300) {
                Panel(background = Ink.Void) {
                    Eyebrow("Standing on")
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "This curriculum draws on public work by the Electronic Frontier " +
                            "Foundation, NIST, CISA, OWASP, the Tor Project, Privacy Guides, " +
                            "the Whonix documentation team, and decades of conference research " +
                            "from DEF CON and CCC. Verify everything here against those sources.",
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Mid
                    )
                }
            }
            Spacer(Modifier.height(26.dp))
        }

        item {
            RevealIn(delayMillis = 340) {
                Column(
                    Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SolidRule(color = Ink.Hairline)
                    Spacer(Modifier.height(20.dp))
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

@Composable
private fun ContactRow(label: String, value: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .noRippleClickable(onClick = onClick)
            .padding(vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            label.uppercase(),
            style = MaterialTheme.typography.labelSmall,
            color = Ink.Dim,
            modifier = Modifier.width(84.dp)
        )
        Text(
            value,
            style = MaterialTheme.typography.bodyMedium,
            color = Ink.White,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.weight(1f)
        )
        Text("\u2197", style = MaterialTheme.typography.bodyMedium, color = Ink.Mid)
    }
}
