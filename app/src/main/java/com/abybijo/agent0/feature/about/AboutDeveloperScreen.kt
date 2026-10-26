package com.abybijo.agent0.feature.about

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.theme.Ink

/**
 * v2.0 About Developer page (SRS §9.4). Separate from About.
 * Minimal details only, public contacts only, and support buttons
 * that hand off to the system browser or mail — no in-app account,
 * no data collection, and no response-time promise.
 */
@Composable
fun AboutDeveloperScreen(onBack: () -> Unit) {
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
                        putExtra(Intent.EXTRA_SUBJECT, "Agent-0 support")
                    },
                    "Send email"
                )
            )
        }
    }

    Agent0Screen(title = "About Developer", eyebrow = "Minimal details", onBack = onBack) {
        item {
            Spacer(Modifier.height(14.dp))
            RevealIn {
                Panel {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            Credits.AUTHOR,
                            style = MaterialTheme.typography.headlineSmall,
                            color = Ink.White
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "Android & Web Developer \u00B7 Second-year BCA student",
                            style = MaterialTheme.typography.bodySmall,
                            color = Ink.Mid
                        )
                    }
                }
            }
            Spacer(Modifier.height(14.dp))
        }
        item {
            RevealIn {
                Panel {
                    Eyebrow("Contacts \u00B7 public only")
                    Spacer(Modifier.height(12.dp))
                    GhostButton(
                        text = "GitHub \u2014 github.com/AbyBijo",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { openUrl(Credits.GITHUB) }
                    )
                    Spacer(Modifier.height(10.dp))
                    GhostButton(
                        text = "Website \u2014 abybijo.com",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { openUrl(Credits.WEBSITE) }
                    )
                    Spacer(Modifier.height(10.dp))
                    GhostButton(
                        text = "Email \u2014 ${Credits.EMAIL_PRIMARY}",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { sendMail(Credits.EMAIL_PRIMARY) }
                    )
                }
            }
            Spacer(Modifier.height(14.dp))
        }
        item {
            RevealIn {
                Panel(background = Ink.Void) {
                    Eyebrow("Support")
                    Spacer(Modifier.height(12.dp))
                    PrimaryButton(
                        text = "Contact developer",
                        leading = "@",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { sendMail(Credits.EMAIL_PRIMARY) }
                    )
                    Spacer(Modifier.height(10.dp))
                    GhostButton(
                        text = "Report an issue on GitHub",
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { openUrl("https://github.com/AbyBijo/Agent-zero/issues") }
                    )
                    Spacer(Modifier.height(12.dp))
                    Text(
                        "Support goes through the system browser or mail. " +
                            "Nothing is collected in the app, and no response time is promised.",
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Mid
                    )
                }
            }
            Spacer(Modifier.height(26.dp))
        }
    }
}
