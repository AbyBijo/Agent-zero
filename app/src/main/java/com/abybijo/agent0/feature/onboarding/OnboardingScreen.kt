package com.abybijo.agent0.feature.onboarding

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.data.Cases
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.data.Scenarios
import com.abybijo.agent0.ui.components.Agent0Logo
import com.abybijo.agent0.ui.components.AsciiBar
import com.abybijo.agent0.ui.components.CheckGlyph
import com.abybijo.agent0.ui.components.DashRule
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.Panel
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.components.RevealIn
import com.abybijo.agent0.ui.components.TypewriterText
import com.abybijo.agent0.ui.components.crtScanlines
import com.abybijo.agent0.ui.components.noRippleClickable
import com.abybijo.agent0.ui.components.vignette
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.Motion

private data class OnboardPage(
    val eyebrow: String,
    val title: String,
    val body: String,
    val bullets: List<String> = emptyList()
)

private val PAGES = listOf(
    OnboardPage(
        eyebrow = "Rule 01",
        title = "You don't talk about this.",
        body = "Most compromises begin with information that was volunteered, not stolen. " +
            "Before any tool or technique, adopt the habit of deciding — deliberately — " +
            "who gets to know what.",
        bullets = listOf(
            "Don't narrate your security setup.",
            "Don't post real-time location.",
            "Silence is free and reversible."
        )
    ),
    OnboardPage(
        eyebrow = "What this is",
        title = "A training program, not a toolbox.",
        body = "Eight chapters take you from beginner hygiene to threat modelling and " +
            "incident response. Each brief is a few minutes long and ends with references " +
            "you can verify yourself.",
        bullets = listOf(
            "${Curriculum.chapters.size} chapters \u00B7 ${Curriculum.totalBriefs} briefs \u00B7 graded by expertise",
            "${Scenarios.all.size} branching drills, a quiz bank and a self-diagnostic",
            "${Cases.all.size} documented case studies from real breaches"
        )
    ),
    OnboardPage(
        eyebrow = "How it works",
        title = "Read. Drill. Apply. Audit.",
        body = "Reading produces recognition; drilling produces recall. Recognition fails " +
            "under pressure. Work one chapter a week and change one thing at a time.",
        bullets = listOf(
            "READ a brief — four minutes, one idea.",
            "DRILL it with a scenario or quiz.",
            "APPLY one change immediately.",
            "AUDIT monthly with the diagnostic."
        )
    ),
    OnboardPage(
        eyebrow = "Your data",
        title = "Nothing leaves this device.",
        body = "Agent-0 requests no network permission. There is no account, no analytics, " +
            "no sync and no payment. Your progress lives in this app's private storage and " +
            "you can wipe it at any time from Settings.",
        bullets = listOf(
            "No INTERNET permission in the manifest",
            "No telemetry, ever",
            "Free and complete — nothing is locked"
        )
    )
)

/**
 * Four-panel onboarding, ending in an explicit acknowledgement. The recruit
 * must tick the ethical-use box before entering — a deliberate friction point.
 */
@Composable
fun OnboardingScreen(onComplete: () -> Unit) {
    var page by rememberSaveable { mutableIntStateOf(0) }
    var acknowledged by rememberSaveable { mutableStateOf(false) }
    val last = page == PAGES.lastIndex

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Ink.Black)
            .crtScanlines()
            .vignette(0.4f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .padding(horizontal = 22.dp, vertical = 18.dp)
        ) {
            // ── header ────────────────────────────────────────────────
            Row(verticalAlignment = Alignment.CenterVertically) {
                Agent0Logo(size = 34.dp, spin = false)
                Spacer(Modifier.width(11.dp))
                Column {
                    Text(
                        "AGENT-0",
                        style = MaterialTheme.typography.titleMedium,
                        color = Ink.White
                    )
                    Text(
                        "INDUCTION",
                        style = MaterialTheme.typography.labelSmall,
                        color = Ink.Dim
                    )
                }
                Spacer(Modifier.weight(1f))
                Text(
                    "${page + 1}/${PAGES.size}",
                    style = MaterialTheme.typography.labelSmall,
                    color = Ink.Dim
                )
            }

            Spacer(Modifier.height(16.dp))
            AsciiBar(
                progress = (page + 1f) / PAGES.size,
                slots = 24,
                showPercent = false
            )
            Spacer(Modifier.height(28.dp))

            // ── body ──────────────────────────────────────────────────
            Box(modifier = Modifier.weight(1f)) {
                AnimatedContent(
                    targetState = page,
                    transitionSpec = {
                        (slideInVertically(tween(Motion.Normal, easing = Motion.Decode)) { it / 5 } +
                            fadeIn(tween(Motion.Normal))) togetherWith
                            (slideOutVertically(tween(Motion.Fast)) { -it / 6 } +
                                fadeOut(tween(Motion.Fast)))
                    },
                    label = "onboardPage"
                ) { index ->
                    val p = PAGES[index]
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                    ) {
                        Eyebrow(p.eyebrow)
                        Spacer(Modifier.height(12.dp))
                        TypewriterText(
                            text = p.title,
                            style = MaterialTheme.typography.headlineMedium,
                            charDelayMillis = 22
                        )
                        Spacer(Modifier.height(18.dp))
                        RevealIn(delayMillis = 320) {
                            Text(
                                p.body,
                                style = MaterialTheme.typography.bodyLarge,
                                color = Ink.Soft
                            )
                        }
                        Spacer(Modifier.height(20.dp))
                        p.bullets.forEachIndexed { i, b ->
                            RevealIn(delayMillis = 460 + i * 70) {
                                Row(
                                    modifier = Modifier.padding(vertical = 5.dp),
                                    verticalAlignment = Alignment.Top
                                ) {
                                    Text(
                                        "\u25B8",
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = Ink.Dim
                                    )
                                    Spacer(Modifier.width(10.dp))
                                    Text(
                                        b,
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = Ink.Mid
                                    )
                                }
                            }
                        }

                        if (index == PAGES.lastIndex) {
                            Spacer(Modifier.height(26.dp))
                            RevealIn(delayMillis = 700) {
                                Panel(borderColor = Ink.Rule) {
                                    Eyebrow("Acknowledgement")
                                    Spacer(Modifier.height(10.dp))
                                    Text(
                                        "This program is for defensive education. Attack " +
                                            "techniques are described only so you can recognise " +
                                            "and resist them. Laws on encryption, anonymity and " +
                                            "recording vary by country — you are responsible for " +
                                            "your own compliance.",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = Ink.Mid
                                    )
                                    Spacer(Modifier.height(14.dp))
                                    DashRule()
                                    Spacer(Modifier.height(14.dp))
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(2.dp))
                                            .noRippleClickable { acknowledged = !acknowledged }
                                            .padding(vertical = 4.dp)
                                    ) {
                                        CheckGlyph(checked = acknowledged, size = 18.dp)
                                        Spacer(Modifier.width(12.dp))
                                        Text(
                                            "I will use this knowledge defensively and lawfully.",
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = if (acknowledged) Ink.White else Ink.Mid
                                        )
                                    }
                                }
                            }
                        }
                        Spacer(Modifier.height(24.dp))
                    }
                }
            }

            // ── controls ──────────────────────────────────────────────
            Spacer(Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (page > 0) {
                    GhostButton(text = "Back", onClick = { page-- })
                }
                Spacer(Modifier.weight(1f))
                if (last) {
                    PrimaryButton(
                        text = "Begin",
                        leading = "\u25B6",
                        enabled = acknowledged,
                        onClick = onComplete
                    )
                } else {
                    PrimaryButton(
                        text = "Continue",
                        leading = "\u25B8",
                        onClick = { page++ }
                    )
                }
            }
            Spacer(Modifier.height(6.dp))
        }
    }
}
