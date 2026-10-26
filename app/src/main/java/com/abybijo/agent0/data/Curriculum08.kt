package com.abybijo.agent0.data

/**
 * CHAPTER 08 — FIELDCRAFT (Advanced)
 *
 * Putting the earlier chapters together under real-world pressure:
 * choosing channels, travelling, handling money trails, working
 * while observed, operating as a team, and sustaining the posture.
 * Defensive education only: nothing here is a guide to evading
 * lawful authority, and nothing replaces legal advice where the
 * law of a place you visit is involved.
 */
fun chapter08() = Chapter(
    id = "fieldcraft",
    index = 8,
    code = "CH-08",
    title = "Fieldcraft",
    glyph = "\u2694",
    tier = Tier.ADVANCED,
    tagline = "Putting it all together under real-world pressure.",
    briefs = listOf(
        Brief(
            id = "secure-comms",
            title = "Secure Communications",
            glyph = "\u2709",
            summary = "Pick the channel by the risk, then verify who is on the other end.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "A secure conversation has three parts, and all three must hold: " +
                        "the content must be protected in transit, the identity of the " +
                        "other party must be verified, and the metadata around the " +
                        "conversation must be kept as small as possible. A tool that " +
                        "protects only one of the three is not a secure channel on its own."
                ),
                Block.Heading("Choose the channel by the risk", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "For sensitive conversations, use an end-to-end encrypted messenger, not SMS or ordinary email.",
                        "Keep separate channels for separate purposes, so one compromised account does not expose every conversation.",
                        "Verify safety numbers or key fingerprints through a second, trusted channel before discussing anything sensitive.",
                        "Treat disappearing messages as a housekeeping feature, not a guarantee: the other party can still screenshot, forward, or photograph a message.",
                        "Agree the channel, the backup channel, and the code word for verification before you actually need them."
                    )
                ),
                Block.Heading("Metadata still talks", "\u25B8"),
                Block.Field(
                    "Verify before you trust",
                    "A familiar name and photo are not verification. Compare keys or " +
                        "fingerprints in person, or over a voice call you already trust, " +
                        "and re-verify after either party reinstalls, changes device, or " +
                        "reports a security alert."
                ),
                Block.Para(
                    "Test the channel calmly, when nothing is at stake. The worst time " +
                        "to learn that a contact cannot receive encrypted messages, or " +
                        "that a verification step fails, is in the middle of an incident."
                )
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to encrypted messaging and verification."),
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Recommendations for messengers and communication tools.")
            )
        ),
        Brief(
            id = "border-device",
            title = "Crossing Borders With Devices",
            glyph = "\u2708",
            summary = "Travel light, plan before you travel, and never improvise at a border.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "A border is a different legal environment from your home or office. " +
                        "A device may be inspected, and data on it may be copied or held. " +
                        "The defence is preparation done at home, not a decision made " +
                        "under pressure at a checkpoint."
                ),
                Block.Heading("Travel light", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Back up everything at home, then remove from the travel device anything you do not need on the trip.",
                        "Travel, where possible, with a clean device: wiped, encrypted, and holding only trip essentials.",
                        "Use a strong PIN or passphrase rather than biometrics for the crossing itself, where your device allows that choice.",
                        "Log out of non-essential cloud accounts and browsers before you travel.",
                        "Carry only the documents the trip requires, and keep them separate from the device where practical."
                    )
                ),
                Block.Field(
                    "Plan, do not improvise",
                    "Read your organisation's travel policy and, where relevant, seek " +
                        "legal advice before you travel, so you know in advance what to " +
                        "expect and who to contact. Do not make up a new plan at the border."
                ),
                Block.Para(
                    "On return, treat the travel device as untrusted until it has been " +
                        "wiped and restored from your home backup, and change any " +
                        "credentials you entered while travelling that you cannot be " +
                        "sure stayed private."
                )
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Border-crossing and device guidance."),
                Reference("CISA", "https://www.cisa.gov/", "Travel and device security guidance from the US cyber agency.")
            )
        ),
        Brief(
            id = "financial-privacy",
            title = "Financial Privacy",
            glyph = "\u25CF",
            summary = "Money trails link identities. Keep them short, separate, and reviewed.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Payments, subscriptions, loyalty schemes, and statements all create " +
                        "records that link a person to a place, a time, and a purchase. " +
                        "Financial privacy is therefore mostly bookkeeping discipline: " +
                        "fewer trails, separated trails, and regular review."
                ),
                Block.Heading("Shorten the trail", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Use a separate card or account for online shopping, so a merchant breach does not expose your main account.",
                        "Use virtual or single-use card numbers where your bank offers them.",
                        "Decline loyalty schemes for purchases you would rather not have recorded, and review the schemes you already joined.",
                        "Never share full account numbers, card numbers, or one-time codes by email, message, or phone call you did not initiate.",
                        "Keep statements and receipts for as long as you need them, then destroy them securely."
                    )
                ),
                Block.Field(
                    "Watch the trail",
                    "Review statements every month for charges you do not recognise, " +
                        "however small. Small test charges often precede larger fraud, " +
                        "and early reporting limits the damage."
                ),
                Block.Para(
                    "If a payment method is compromised, freeze or replace it, update " +
                        "the legitimate subscriptions that used it, and keep a note of " +
                        "what was changed so nothing silently stops working later."
                )
            ),
            references = listOf(
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Payment and privacy recommendations."),
                Reference("EFF", "https://www.eff.org/", "Consumer privacy and surveillance analysis.")
            )
        ),
        Brief(
            id = "under-surveillance",
            title = "Working Under Surveillance",
            glyph = "\u25C9",
            summary = "When you may be observed, lower the signal and do not escalate alone.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "Working under surveillance, whether by cameras, by people nearby, " +
                        "or by monitoring of a network, calls for calm and for less " +
                        "exposure, not for dramatic countermeasures. The goal is to " +
                        "reduce what can be observed, and to get sensitive work done " +
                        "in a safer place and time."
                ),
                Block.Heading("Lower the signal", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Do not discuss sensitive matters where you can be overheard, and do not read sensitive material where a screen can be seen.",
                        "Use a privacy screen, keep documents out of sight, and lock the screen the moment you step away.",
                        "Assume a public or shared network is observed, and keep sensitive work off it.",
                        "Keep the sensitive conversation for a private setting you trust, rather than forcing it into an exposed one.",
                        "Write down, privately, what you observed and when, so you can report facts rather than impressions."
                    )
                ),
                Block.Field(
                    "Do not escalate alone",
                    "If you feel unsafe, move to a public place, contact a trusted " +
                        "person or your organisation's security contact, and follow " +
                        "their advice. Do not confront anyone you believe is watching you."
                ),
                Block.Para(
                    "Afterwards, review what may have been exposed and change what " +
                        "needs changing: credentials used in the exposed setting, " +
                        "documents left visible, and any meeting that should move " +
                        "to a safer channel."
                )
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guidance for working in observed environments."),
                Reference("CISA", "https://www.cisa.gov/", "Physical and personnel security guidance.")
            )
        ),
        Brief(
            id = "team-opsec",
            title = "Team OPSEC",
            glyph = "\u25A3",
            summary = "A team is only as disciplined as its weakest shared habit.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Individual discipline does not scale on its own. A team needs " +
                        "shared rules, agreed before the work starts, that every " +
                        "member can actually follow. Rules invented mid-incident are " +
                        "rarely followed and often resented."
                ),
                Block.Heading("Agree the rules before the work", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Decide what is critical information for this team, and who needs to know each item.",
                        "Agree one channel for sensitive discussion, and keep casual chat off it.",
                        "Agree a code word or shared secret for verifying sensitive requests out of band.",
                        "Write a short onboarding checklist for new members and an offboarding checklist for leavers.",
                        "Agree how incidents are reported, without blame, and who is contacted first."
                    )
                ),
                Block.Field(
                    "One leak, one lesson",
                    "When something slips, debrief the process, not the person. " +
                        "Fix the rule, the checklist, or the tool that allowed the " +
                        "slip, and share the lesson with the whole team."
                ),
                Block.Para(
                    "Review the team's rules whenever the team, the work, or the " +
                        "threat changes. A rule that no longer fits the work will be " +
                        "quietly ignored, and an ignored rule protects nobody."
                )
            ),
            references = listOf(
                Reference("NIST — Cybersecurity Framework", "https://www.nist.gov/cyberframework", "Govern, identify, and protect functions for teams."),
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Tool and practice recommendations for groups.")
            )
        ),
        Brief(
            id = "sustain",
            title = "Sustaining the Posture",
            glyph = "\u2723",
            summary = "Fieldcraft is a rhythm, not a one-time setup.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Fieldcraft fails the same way every other posture fails: quietly, " +
                        "through drift. Accounts accumulate, permissions widen, backups " +
                        "stop being tested, and the threat picture changes while the " +
                        "plan stays frozen. Sustaining means building a rhythm small " +
                        "enough that you will actually keep it."
                ),
                Block.Heading("A rhythm you can keep", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Monthly: run the Self-Diagnostic, review login alerts, and restore one real file from backup.",
                        "Quarterly: re-read your threat model and update it for anything that changed in your life or work.",
                        "Annually: full inventory of accounts, devices, and recovery settings; retire what you no longer use.",
                        "After any incident, however small: write down what happened, what helped, and what to change.",
                        "Teach one other person a skill from this chapter. Teaching exposes gaps faster than re-reading."
                    )
                ),
                Block.Field(
                    "Measure, do not guess",
                    "A checklist completed and a backup actually restored are evidence. " +
                        "A feeling that things are probably fine is not. Keep the " +
                        "evidence, and let it tell you where the posture is thinning."
                ),
                Block.Para(
                    "If the rhythm stops working, shrink it rather than abandoning it. " +
                        "One maintained habit beats a perfect plan that nobody follows."
                )
            ),
            references = listOf(
                Reference("NIST — Cybersecurity Framework", "https://www.nist.gov/cyberframework", "Continuous improvement and governance."),
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Maintaining a personal security plan.")
            )
        )
    )
)
