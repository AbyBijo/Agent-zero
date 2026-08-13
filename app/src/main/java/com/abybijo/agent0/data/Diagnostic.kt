package com.abybijo.agent0.data

/**
 * Self-diagnostic. Weighted so that the controls with the largest real-world
 * blast-radius reduction dominate the score.
 */
object Diagnostic {
    val items: List<DiagnosticItem> = listOf(
        DiagnosticItem("I use a password manager for all accounts", 3),
        DiagnosticItem("I have unique passwords for every account", 3),
        DiagnosticItem("My master passphrase is 6+ random words", 2),
        DiagnosticItem("I use 2FA on email, password manager, and cloud accounts", 3),
        DiagnosticItem("I use hardware security keys (FIDO2) for critical accounts", 2),
        DiagnosticItem("I keep my devices' OS and apps up to date", 3),
        DiagnosticItem("Full-disk encryption is enabled on all devices", 3),
        DiagnosticItem("I back up data and test restores monthly", 2),
        DiagnosticItem("I verify sender domains before clicking email links", 2),
        DiagnosticItem("I report phishing to my security team", 1),
        DiagnosticItem("I use a privacy-respecting email provider", 1),
        DiagnosticItem("I avoid posting real-time location on social media", 2),
        DiagnosticItem("I shred sensitive documents before disposal", 1),
        DiagnosticItem("I challenge strangers asking to tailgate", 2),
        DiagnosticItem("I lock my screen every time I leave my desk", 2),
        DiagnosticItem("I use encrypted messaging (Signal/Matrix) for sensitive chats", 2),
        DiagnosticItem("I verify wire-transfer requests out-of-band", 2),
        DiagnosticItem("I review app permissions quarterly", 1),
        DiagnosticItem("I have a documented incident response plan", 2),
        DiagnosticItem("I know the signs of social engineering", 1),
        DiagnosticItem("I minimize PII collected/stored in my projects", 2),
        DiagnosticItem("I avoid using SMS-based 2FA where possible", 1),
        DiagnosticItem("I keep offline recovery codes in a safe place", 2),
        DiagnosticItem("I practice \"assume breach\" in my threat modeling", 1),
    )

    val maxScore: Int = items.sumOf { it.weight }

    fun grade(score: Int): String {
        val pct = if (maxScore == 0) 0 else score * 100 / maxScore
        return when {
            pct >= 90 -> "HARDENED"
            pct >= 75 -> "RESILIENT"
            pct >= 55 -> "ADEQUATE"
            pct >= 35 -> "EXPOSED"
            else -> "CRITICAL"
        }
    }

    fun verdict(score: Int): String {
        val pct = if (maxScore == 0) 0 else score * 100 / maxScore
        return when {
            pct >= 90 -> "Your posture is disciplined. Maintain it — drift is the enemy now. Re-run monthly."
            pct >= 75 -> "Strong baseline. Close the remaining gaps below in priority order."
            pct >= 55 -> "Workable, but an attacker has options. Address the highest-weight gaps this week."
            pct >= 35 -> "Significant exposure. Fix credentials and device encryption before anything else."
            else -> "Critical exposure. Start with Chapter 02 and work the Daily Routine checklist."
        }
    }
}
