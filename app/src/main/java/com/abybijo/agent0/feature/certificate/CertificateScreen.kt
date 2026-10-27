package com.abybijo.agent0.feature.certificate

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.components.Agent0Logo
import com.abybijo.agent0.ui.components.Agent0Screen
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.theme.Ink
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * v2.0 Phase 5e — In-app certificate view.
 *
 * Shows the same artwork the PNG/PDF carry: sigil, AGENT-0,
 * the learner's real name, "has completed the Agent Zero OPSEC
 * Course", completion date, and the not-accredited disclaimer.
 * A certificate is never fabricated: with no real name set, this
 * screen asks the learner to set one in Profile instead of
 * inventing a placeholder name.
 */
@Composable
fun CertificateScreen(
    userName: String,
    finalExamDate: Long,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var status by remember { mutableStateOf("") }

    Agent0Screen(
        title = "Certificate",
        eyebrow = "Agent Zero OPSEC Course",
        onBack = onBack
    ) {
        if (userName.isBlank() || finalExamDate <= 0L) {
            item {
                Spacer(Modifier.height(14.dp))
                Panel(background = Ink.Void) {
                    Eyebrow("Name required")
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "Set your real name in Profile to view your certificate. " +
                            "A name is never invented for you.",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Ink.Mid
                    )
                }
                Spacer(Modifier.height(20.dp))
                GhostButton(text = "Back", leading = "\u2190", onClick = onBack)
            }
            return@Agent0Screen
        }

        item {
            Spacer(Modifier.height(14.dp))
            RevealIn {
                Panel {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Agent0Logo(size = 120.dp, spin = false)
                    }
                    Spacer(Modifier.height(14.dp))
                    Text(
                        "AGENT-0",
                        style = MaterialTheme.typography.titleMedium,
                        color = Ink.White,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(Modifier.height(18.dp))
                    Text(
                        "Certificate of Completion",
                        style = MaterialTheme.typography.headlineMedium,
                        color = Ink.White,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(Modifier.height(18.dp))
                    Text(
                        "This certifies that",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Ink.Mid,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(Modifier.height(10.dp))
                    Text(
                        userName,
                        style = MaterialTheme.typography.displaySmall,
                        color = Ink.White,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(Modifier.height(14.dp))
                    Text(
                        "has completed the Agent Zero OPSEC Course",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Ink.Mid,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(Modifier.height(24.dp))
                    Text(
                        "Completed on ${CertificateRenderer.formatDate(finalExamDate)}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Ink.Mid,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(Modifier.height(12.dp))
                    Text(
                        "Self-paced, on-device completion record \u2014 " +
                            "not an accredited qualification",
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Dim,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }
            }
            Spacer(Modifier.height(20.dp))
        }

        item {
            RevealIn {
                PrimaryButton(
                    text = "Download PNG",
                    leading = "\u2193",
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        scope.launch {
                            val bytes = withContext(Dispatchers.Default) {
                                CertificateRenderer.renderPng(context, userName, finalExamDate)
                            }
                            val uri = CertificateRenderer.saveToDownloads(
                                context, bytes,
                                CertificateRenderer.PNG_NAME, "image/png"
                            )
                            status = if (uri != null) {
                                "Saved to Downloads/Agent-0."
                            } else {
                                "Could not save. Try sharing instead."
                            }
                        }
                    }
                )
                Spacer(Modifier.height(10.dp))
                PrimaryButton(
                    text = "Download PDF",
                    leading = "\u2193",
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        scope.launch {
                            val bytes = withContext(Dispatchers.Default) {
                                CertificateRenderer.renderPdf(context, userName, finalExamDate)
                            }
                            val uri = CertificateRenderer.saveToDownloads(
                                context, bytes,
                                CertificateRenderer.PDF_NAME, "application/pdf"
                            )
                            status = if (uri != null) {
                                "Saved to Downloads/Agent-0."
                            } else {
                                "Could not save. Try sharing instead."
                            }
                        }
                    }
                )
                Spacer(Modifier.height(10.dp))
                GhostButton(
                    text = "Share PNG",
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        scope.launch {
                            val bytes = withContext(Dispatchers.Default) {
                                CertificateRenderer.renderPng(context, userName, finalExamDate)
                            }
                            CertificateRenderer.share(
                                context, bytes,
                                CertificateRenderer.PNG_NAME, "image/png"
                            )
                        }
                    }
                )
                Spacer(Modifier.height(10.dp))
                GhostButton(
                    text = "Share PDF",
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        scope.launch {
                            val bytes = withContext(Dispatchers.Default) {
                                CertificateRenderer.renderPdf(context, userName, finalExamDate)
                            }
                            CertificateRenderer.share(
                                context, bytes,
                                CertificateRenderer.PDF_NAME, "application/pdf"
                            )
                        }
                    }
                )
                if (status.isNotEmpty()) {
                    Spacer(Modifier.height(12.dp))
                    Text(
                        status,
                        style = MaterialTheme.typography.bodySmall,
                        color = Ink.Mid
                    )
                }
            }
            Spacer(Modifier.height(12.dp))
        }
    }
}
