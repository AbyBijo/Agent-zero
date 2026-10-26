package com.abybijo.agent0.feature.illustration

/**
 * Per-brief illustration assignments (SRS §6), Phase 3b.
 * One motif + one caption per existing brief, keyed by "chapterId/briefId".
 * Motifs are reused across briefs that share a theme; captions are brief-specific.
 * New chapters (Phase 4) extend this map with their own entries.
 */
data class BriefIllustrationSpec(val motif: Motif, val caption: String)

object BriefIllustrations {
    val all: Map<String, BriefIllustrationSpec> = mapOf(
        "orientation/rules" to BriefIllustrationSpec(Motif.CIRCLE, "Rule 1, at the centre of everything else."),
        "orientation/howto" to BriefIllustrationSpec(Motif.STAIRS, "Read, drill, check, repeat — one step at a time."),
        "orientation/first-week" to BriefIllustrationSpec(Motif.HOURGLASS, "A week is enough to fix the foundations."),
        "doctrine/origins" to BriefIllustrationSpec(Motif.BOOK, "OPSEC begins with a definition, not a purchase."),
        "doctrine/step1" to BriefIllustrationSpec(Motif.EYE, "First, see what must be protected."),
        "doctrine/step2" to BriefIllustrationSpec(Motif.EYE, "Then, see who wants it."),
        "doctrine/step3" to BriefIllustrationSpec(Motif.SHIELD, "Find the gaps before an adversary does."),
        "doctrine/step4" to BriefIllustrationSpec(Motif.SCALE, "Weigh likelihood against impact."),
        "doctrine/step5" to BriefIllustrationSpec(Motif.SHIELD, "Apply the countermeasure you will actually keep."),
        "doctrine/threat-model-ten" to BriefIllustrationSpec(Motif.BOOK, "A threat model on one page, in ten minutes."),
        "digital/passwords" to BriefIllustrationSpec(Motif.KEY, "One key per door, and no key reused."),
        "digital/twofactor" to BriefIllustrationSpec(Motif.LOCK, "A second lock on the doors that matter most."),
        "digital/encryption" to BriefIllustrationSpec(Motif.LOCK, "Scrambled in transit, scrambled at rest."),
        "digital/comms" to BriefIllustrationSpec(Motif.ENVELOPE, "Choose the envelope that fits the letter."),
        "digital/devices" to BriefIllustrationSpec(Motif.DEVICE, "The device in your pocket is a computer."),
        "digital/network" to BriefIllustrationSpec(Motif.NETWORK, "A VPN shifts trust; Tor spreads it out."),
        "digital/email" to BriefIllustrationSpec(Motif.WARNING, "Urgency is the tell. Slow down."),
        "digital/backups-restore" to BriefIllustrationSpec(Motif.CIRCLE, "A backup is only proven by a restore."),
        "physical/access" to BriefIllustrationSpec(Motif.LOCK, "A door that closes itself is a control."),
        "physical/cleandesk" to BriefIllustrationSpec(Motif.EYE, "A passer-by needs only seconds."),
        "physical/travel" to BriefIllustrationSpec(Motif.MAP, "Travel light in data, not only in luggage."),
        "physical/surveillance" to BriefIllustrationSpec(Motif.EYE, "Notice, note, and do not lead it home."),
        "physical/assets" to BriefIllustrationSpec(Motif.LOCK, "Physical access defeats digital controls."),
        "physical/home-base" to BriefIllustrationSpec(Motif.SHIELD, "Ordinary-looking is safer than fortified-looking."),
        "human/vectors" to BriefIllustrationSpec(Motif.WARNING, "Procedures protect you when recognition fails."),
        "human/redflags" to BriefIllustrationSpec(Motif.WARNING, "Urgency plus secrecy is enough to stop."),
        "human/verification" to BriefIllustrationSpec(Motif.KEY, "Verify through a channel the requester does not control."),
        "human/influence" to BriefIllustrationSpec(Motif.MASK, "Influence works best when you do not notice it."),
        "human/verifying-strangers" to BriefIllustrationSpec(Motif.EYE, "Ask questions that do not answer theirs."),
        "cognitive/biases" to BriefIllustrationSpec(Motif.SCALE, "Check the decision, not only the feeling."),
        "cognitive/emotion" to BriefIllustrationSpec(Motif.DANGER, "Emotion is information, not instruction."),
        "cognitive/models" to BriefIllustrationSpec(Motif.BOOK, "Two models that disagree mean: gather more information."),
        "cognitive/mindset" to BriefIllustrationSpec(Motif.CIRCLE, "What you do on an ordinary Tuesday."),
        "cognitive/calm-pressure" to BriefIllustrationSpec(Motif.HOURGLASS, "Pressure narrows attention; a procedure widens it back."),
        "identity/compartments" to BriefIllustrationSpec(Motif.CHAIN, "Break one link without breaking the chain."),
        "identity/metadata" to BriefIllustrationSpec(Motif.NETWORK, "Patterns leak even when messages do not."),
        "identity/osint" to BriefIllustrationSpec(Motif.EYE, "Look at your own shadow before an adversary does."),
        "identity/personas" to BriefIllustrationSpec(Motif.MASK, "Consistency is the whole defence of a persona."),
        "identity/photo-metadata" to BriefIllustrationSpec(Motif.MAP, "A photo can place you precisely."),
        "tradecraft/threatmodel" to BriefIllustrationSpec(Motif.BOOK, "A model that changes nothing is a document, not a defence."),
        "tradecraft/incident" to BriefIllustrationSpec(Motif.DANGER, "Contain first, diagnose second."),
        "tradecraft/sustaining" to BriefIllustrationSpec(Motif.STAIRS, "Sustaining is mostly scheduled maintenance."),
        "tradecraft/first-hour" to BriefIllustrationSpec(Motif.HOURGLASS, "The first hour is for containment and notes."),
        "fieldcraft/secure-comms" to BriefIllustrationSpec(Motif.ENVELOPE, "Brevity is a security control in the field."),
        "fieldcraft/border-device" to BriefIllustrationSpec(Motif.DEVICE, "What is not on the device cannot be inspected."),
        "fieldcraft/financial-privacy" to BriefIllustrationSpec(Motif.CHAIN, "Payment data links identities, places, and habits."),
        "fieldcraft/under-surveillance" to BriefIllustrationSpec(Motif.EYE, "Normal behaviour is camouflage."),
        "fieldcraft/team-opsec" to BriefIllustrationSpec(Motif.NETWORK, "A team is only as secure as its least-informed member."),
        "fieldcraft/sustain" to BriefIllustrationSpec(Motif.STAIRS, "Endurance is a security control."),
        // ── CH-09 AI-Era (Phase 4a) ────────────────────────────────
        "ai-era/ai-feed" to BriefIllustrationSpec(Motif.ENVELOPE, "Read the prompt as if it were published."),
        "ai-era/ai-memory" to BriefIllustrationSpec(Motif.BOOK, "Memory is a store held by someone else."),
        "ai-era/ai-work-home" to BriefIllustrationSpec(Motif.CHAIN, "Work, personal, and sensitive use must not merge."),
        "ai-era/ai-deepfake" to BriefIllustrationSpec(Motif.MASK, "Seeing and hearing are no longer proof."),
        "ai-era/ai-phishing" to BriefIllustrationSpec(Motif.WARNING, "Style is no longer a reliable signal."),
        "ai-era/ai-media-evidence" to BriefIllustrationSpec(Motif.EYE, "One image is a claim, not proof."),
        "ai-era/ai-agents" to BriefIllustrationSpec(Motif.KEY, "Delegation is not abdication."),
        "ai-era/ai-verify-output" to BriefIllustrationSpec(Motif.SCALE, "Confidence in the writing is not evidence."),
        "ai-era/ai-research-code" to BriefIllustrationSpec(Motif.BOOK, "Redact first, verify second, publish third."),
        "ai-era/ai-personal-rules" to BriefIllustrationSpec(Motif.CIRCLE, "Six rules you can actually remember."),
        // ── CH-10 Financial Privacy (Phase 4a) ───────────────────────
        "financial/fin-footprint" to BriefIllustrationSpec(Motif.MAP, "A purchase history is a biography with timestamps."),
        "financial/fin-separation" to BriefIllustrationSpec(Motif.CHAIN, "Separation limits blast radius."),
        "financial/fin-payments" to BriefIllustrationSpec(Motif.SCALE, "Choose the method by the risk, not by habit."),
        "financial/fin-cash-prepaid" to BriefIllustrationSpec(Motif.CIRCLE, "No method is magic."),
        "financial/fin-subscriptions" to BriefIllustrationSpec(Motif.NETWORK, "The discount is the price."),
        "financial/fin-banking-apps" to BriefIllustrationSpec(Motif.DEVICE, "Alerts turn a surprise into a minutes-old problem."),
        "financial/fin-crypto" to BriefIllustrationSpec(Motif.DANGER, "Public does not mean private."),
        "financial/fin-tax-records" to BriefIllustrationSpec(Motif.BOOK, "Encrypted, backed up, and access-controlled."),
        "financial/fin-scams" to BriefIllustrationSpec(Motif.WARNING, "A recovery offer that arrives unsolicited is a scam."),
        "financial/fin-routine" to BriefIllustrationSpec(Motif.HOURGLASS, "Scheduled routines survive busy months."),
        // ── CH-12 Incident Response (Phase 4b, first batch) ──────────
        "incident/ir-first-hour" to BriefIllustrationSpec(Motif.HOURGLASS, "Stop, preserve, note — in that order."),
        "incident/ir-evidence" to BriefIllustrationSpec(Motif.EYE, "Observe first, copy second, change last."),
        "incident/ir-account" to BriefIllustrationSpec(Motif.LOCK, "Lock, recover, check — from a clean device."),
        "incident/ir-device" to BriefIllustrationSpec(Motif.DEVICE, "Isolation first; sensitive work moves elsewhere."),
        "incident/ir-breach" to BriefIllustrationSpec(Motif.SCALE, "Priority beats completeness in the first hour."),
        "incident/ir-identity-theft" to BriefIllustrationSpec(Motif.BOOK, "One dated file makes a long recovery manageable."),
        "incident/ir-reporting" to BriefIllustrationSpec(Motif.ENVELOPE, "Early and factual beats late and complete."),
        "incident/ir-talking" to BriefIllustrationSpec(Motif.CIRCLE, "Honesty about the fact, restraint about the detail."),
        "incident/ir-recovery-checklist" to BriefIllustrationSpec(Motif.SCALE, "Recovery is a checklist decision, not a feeling."),
        "incident/ir-after-action" to BriefIllustrationSpec(Motif.BOOK, "Review the system, not the person."),
        // ── CH-11 Team OPSEC (Phase 4b, second batch) ───────────────
        "team/team-discipline" to BriefIllustrationSpec(Motif.CIRCLE, "A posture, not a person."),
        "team/team-need-to-know" to BriefIllustrationSpec(Motif.KEY, "Access that matches the work, and nothing more."),
        "team/team-shared" to BriefIllustrationSpec(Motif.CHAIN, "If you cannot revoke one person, you have no control."),
        "team/team-onboarding" to BriefIllustrationSpec(Motif.STAIRS, "Access in, access out, in order."),
        "team/team-meetings" to BriefIllustrationSpec(Motif.BOOK, "Notes outlive meetings."),
        "team/team-vendors" to BriefIllustrationSpec(Motif.NETWORK, "A vendor's gap becomes your gap."),
        "team/team-remote" to BriefIllustrationSpec(Motif.MAP, "The posture travels with the person."),
        "team/team-managers" to BriefIllustrationSpec(Motif.SHIELD, "The manager's behaviour is the policy the team learns."),
        "team/team-mistake" to BriefIllustrationSpec(Motif.SHIELD, "Blame is a security failure."),
        "team/team-drills" to BriefIllustrationSpec(Motif.HOURGLASS, "A habit is a schedule, not a sentiment.")
    )

    fun forKey(key: String): BriefIllustrationSpec? = all[key]
}
