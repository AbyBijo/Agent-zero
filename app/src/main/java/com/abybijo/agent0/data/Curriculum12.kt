package com.abybijo.agent0.data

/**
 * CHAPTER 12 — INCIDENT RESPONSE, RECOVERY, AND REPORTING (Specialisation)
 *
 * What to do in the first hour, the first day, and the weeks after an
 * incident. This expands the incident-response brief in CH-07 into a
 * complete, usable sequence. Safety first: if a person is in danger, get
 * real-world help first — Rule 1 never means "do not report".
 */
fun chapter12() = Chapter(
    id = "incident",
    index = 12,
    code = "CH-12",
    title = "Incident Response, Recovery, and Reporting",
    glyph = "\u26A0",
    tier = Tier.ADVANCED,
    tagline = "First hour, first day, and the weeks after — in order, without panic.",
    briefs = listOf(
        Brief(
            id = "ir-first-hour",
            title = "First Hour: Stop, Preserve, Do Not Panic",
            glyph = "\u23F1",
            summary = "The order of actions that prevents a bad incident becoming worse.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "The first hour after discovering an incident sets its course. " +
                        "Panic makes it worse: wiping everything destroys evidence, " +
                        "changing passwords from a compromised device hands the new " +
                        "password to the attacker, and warning everyone before you know " +
                        "what happened spreads confusion. Calm, in order, is the skill."
                ),
                Block.Heading("Stop, preserve, note", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Stop the bleeding: disconnect, revoke sessions, or isolate the affected account or device.",
                        "Preserve evidence: do not wipe, reinstall, or overwrite anything yet.",
                        "Note times, symptoms, and actions taken, while they are fresh.",
                        "If a person is in danger, get real-world help first; everything else waits."
                    )
                ),
                Block.Warning(
                    "Do not panic-wipe",
                    "Wiping a device or deleting an account in the first hour feels like " +
                        "action. It usually destroys the only evidence that explains what " +
                        "happened, and it does not guarantee the attacker is gone."
                ),
                Block.Para(
                    "You will not know everything in the first hour, and you do not " +
                        "need to. Containment and notes are enough. Diagnosis comes next."
                )
            ),
            outcomes = listOf(
                "Act in the right order in the first hour: stop, preserve, note.",
                "Avoid panic-wiping and password changes from a compromised device.",
                "Put a person's safety before any technical step."
            ),
            howTo = listOf(
                "Disconnect or isolate the affected account or device.",
                "Write down times, symptoms, and every action you take.",
                "Change passwords only from a clean device, once containment is done.",
                "If anyone is in danger, get real-world help immediately."
            ),
            bestPractices = listOf(
                "The first hour is for containment and notes, not for blame or complete diagnosis.",
                "A written note made in the first hour is worth more than a perfect memory a day later."
            ),
            cautions = listOf(
                "Wiping destroys evidence and does not guarantee the attacker is gone.",
                "Changing passwords from the compromised device hands them to the attacker."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to incident response.")
            )
        ),
        Brief(
            id = "ir-evidence",
            title = "What Happened? Evidence Without Contamination",
            glyph = "\u25CE",
            summary = "Observe and preserve, without destroying the trail you need to understand.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Understanding an incident means preserving evidence before you " +
                        "change anything. Every action you take on an affected system — " +
                        "logging in, opening files, running a scan — can alter what it " +
                        "records. Observe first, copy what you can, and change as little " +
                        "as possible until you know what you are dealing with."
                ),
                Block.Heading("Preserve before you fix", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Screenshot or photograph alerts, messages, and unusual activity, with times visible.",
                        "Save logs, headers, and message details before they rotate or are deleted.",
                        "Note what was normal before the incident, so you can spot what changed.",
                        "Keep a chain of notes: who did what, when, and on which device."
                    )
                ),
                Block.Field(
                    "Evidence is for decisions",
                    "You preserve evidence not for a courtroom you may never enter, but " +
                        "for decisions you must make now: what is compromised, what must " +
                        "change, and who must be told."
                ),
                Block.Para(
                    "If the incident may need professional or law-enforcement help, " +
                        "preserve more, not less, and touch the affected systems as " +
                        "little as possible until you have advice."
                )
            ),
            outcomes = listOf(
                "Preserve evidence before changing an affected system.",
                "Record times, symptoms, and actions in a usable chain of notes.",
                "Decide what is compromised from evidence, not from assumption."
            ),
            howTo = listOf(
                "Screenshot alerts and unusual activity with times visible.",
                "Save logs, headers, and message details before they disappear.",
                "Write down what was normal before the incident.",
                "Keep a running note of who did what, when, and on which device."
            ),
            bestPractices = listOf(
                "Observe first, copy second, change last.",
                "A note made at the time beats a reconstruction made later."
            ),
            cautions = listOf(
                "Logging in and poking around an affected system alters its evidence.",
                "Assuming the scope of an incident, in either direction, leads to the wrong response."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to incident response.")
            )
        ),
        Brief(
            id = "ir-account",
            title = "Containing a Compromised Account",
            glyph = "\u25A3",
            summary = "Lock, recover, and check, in order — from a clean device.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "A compromised account is contained in a specific order, and the " +
                        "order matters. Lock the attacker out first, recover the account " +
                        "through a trusted channel, then check what was done while they " +
                        "had access. Doing these out of order — checking first, or " +
                        "recovering from a compromised device — lets the attacker stay " +
                        "or return."
                ),
                Block.Heading("Lock, recover, check", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Revoke all sessions and connected apps from the provider's security page, using a clean device.",
                        "Change the password, and turn on the strongest two-factor method available.",
                        "Check recovery email, phone number, and security questions for changes the attacker made.",
                        "Review sent messages, forwarding rules, and connected apps for anything the attacker set up."
                    )
                ),
                Block.Warning(
                    "Check for persistence",
                    "Attackers often leave a way back in: a forwarding rule, a connected " +
                        "app, or a changed recovery address. Recovery is not complete until " +
                        "those are found and removed."
                ),
                Block.Para(
                    "After recovery, watch the account closely for a while. A quiet " +
                        "period does not prove the attacker is gone; persistence is " +
                        "designed to be quiet."
                )
            ),
            outcomes = listOf(
                "Contain a compromised account in the order: lock, recover, check.",
                "Find persistence mechanisms an attacker may have left behind.",
                "Recover using a clean device and the strongest available second factor."
            ),
            howTo = listOf(
                "From a clean device, revoke all sessions and connected apps.",
                "Change the password and enable the strongest two-factor method offered.",
                "Check recovery details, forwarding rules, and connected apps for attacker changes.",
                "Monitor the account closely after recovery for signs of return."
            ),
            bestPractices = listOf(
                "Order matters: lock first, recover second, check third.",
                "Recovery from a compromised device is not recovery."
            ),
            cautions = listOf(
                "Forwarding rules and connected apps are the commonest way back in.",
                "A quiet account after recovery does not prove the attacker is gone."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to account recovery.")
            )
        ),
        Brief(
            id = "ir-device",
            title = "Containing a Compromised Device",
            glyph = "\u25A3",
            summary = "Isolate, preserve, and decide whether to wipe — deliberately, not in panic.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "A compromised device is different from a compromised account: " +
                        "the device itself may be the attacker's foothold, and anything " +
                        "you do on it — including changing passwords — may be observed. " +
                        "Isolate it first, preserve what you need, and decide about " +
                        "wiping based on evidence, not fear."
                ),
                Block.Heading("Isolate, preserve, decide", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Disconnect the device from networks, and do not use it for sensitive actions.",
                        "Back up or copy what you need, from a clean system, before any wipe.",
                        "Decide whether to wipe and reinstall from known-good media, or to seek professional help first.",
                        "After a wipe, change credentials from a clean device, and restore only data you trust."
                    )
                ),
                Block.Field(
                    "When to seek help",
                    "If the device holds critical work, if the compromise may be targeted, " +
                        "or if you need evidence preserved, get professional help before " +
                        "wiping. A wipe is easy; undoing one is impossible."
                ),
                Block.Para(
                    "A wiped device with the same compromised credentials restored to " +
                        "it is not a clean device. Recovery means clean device, clean " +
                        "credentials, and trusted data only."
                )
            ),
            outcomes = listOf(
                "Isolate a compromised device and stop using it for sensitive actions.",
                "Preserve needed data before deciding about a wipe.",
                "Recover to a clean device with clean credentials and trusted data only."
            ),
            howTo = listOf(
                "Disconnect the device from networks immediately.",
                "Copy needed data from a clean system before any wipe.",
                "Wipe and reinstall from known-good media, or seek professional help first if evidence matters.",
                "Change credentials from a clean device and restore only trusted data."
            ),
            bestPractices = listOf(
                "Isolation first; everything sensitive moves to a clean device.",
                "A wipe without clean credentials and trusted data is theatre, not recovery."
            ),
            cautions = listOf(
                "Changing passwords on the compromised device hands them to the attacker.",
                "Restoring a backup that contains the compromise restores the compromise."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to device compromise.")
            )
        ),
        Brief(
            id = "ir-breach",
            title = "Data Breach: What to Change, in What Order",
            glyph = "\u21C4",
            summary = "Credentials, sessions, and recovery paths, prioritised by risk — not all at once, and not at random.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "When your data is caught in a breach, the question is not whether " +
                        "to act, but in what order. Changing everything at once, from a " +
                        "device you have not checked, creates confusion and misses the " +
                        "risks that matter most. Prioritise by what an attacker can do " +
                        "with the exposed data, and how quickly."
                ),
                Block.Heading("In priority order", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "First, the account that was breached, and any account sharing its password.",
                        "Second, your email account, because it recovers most other accounts.",
                        "Third, financial and work accounts, and any account with a stored payment method.",
                        "Fourth, sessions: revoke them everywhere, not only on the device you are using.",
                        "Finally, recovery paths: check recovery email, phone, and security questions for changes."
                    )
                ),
                Block.Field(
                    "Reuse is the multiplier",
                    "A breach of one service becomes a breach of many only when passwords " +
                        "are reused. If your passwords are unique, a single breach stays single."
                ),
                Block.Para(
                    "Keep a note of what you changed and when. In a breach, your own " +
                        "memory is unreliable, and a written record prevents changing the " +
                        "same thing twice while missing something else entirely."
                )
            ),
            outcomes = listOf(
                "Prioritise breach response by risk: breached account, email, financial and work accounts, sessions, recovery paths.",
                "Explain why password reuse turns one breach into many.",
                "Keep a record of what was changed and when."
            ),
            howTo = listOf(
                "Change the breached account's password, then every account sharing it.",
                "Secure your email account next, then financial and work accounts.",
                "Revoke sessions everywhere, not only on one device.",
                "Check and fix recovery details, and write down what you changed."
            ),
            bestPractices = listOf(
                "Priority beats completeness in the first hour; completeness follows in the first day.",
                "Unique passwords are what keep a single breach single."
            ),
            cautions = listOf(
                "Changing everything at once, without order, misses the highest risks.",
                "Sessions left active elsewhere undo a password change."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to data breaches.")
            )
        ),
        Brief(
            id = "ir-identity-theft",
            title = "Identity Theft and Account Recovery",
            glyph = "\u25C8",
            summary = "The long, unglamorous recovery sequence — taken in order, without shortcuts.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "Identity theft recovery is slow, administrative, and frustrating. " +
                        "Accounts must be reclaimed one by one, records corrected, and " +
                        "new accounts watched for months. There is no single fix, and " +
                        "anyone promising one, for a fee, is running a second scam. " +
                        "The sequence below is the work; doing it in order is what " +
                        "makes it end."
                ),
                Block.Heading("The sequence", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Secure your email and phone accounts first; they recover everything else.",
                        "Reclaim accounts one by one, changing passwords and recovery details as you go.",
                        "Place fraud alerts or freezes where your jurisdiction offers them, and keep the reference numbers.",
                        "Report the theft to the relevant authority and to each affected provider, in writing where possible.",
                        "Keep a single file of every case number, letter, and call, with dates."
                    )
                ),
                Block.Warning(
                    "Recovery scams follow identity theft",
                    "After a theft, offers to recover your identity or money, for an " +
                        "upfront fee, are almost always a second scam. Legitimate help " +
                        "does not arrive unsolicited and does not charge upfront."
                ),
                Block.Para(
                    "Recovery takes months, not days. Watch for new accounts, new " +
                        "credit, and new activity in your name long after the original " +
                        "theft feels finished."
                )
            ),
            outcomes = listOf(
                "Recover from identity theft in order: email and phone first, then accounts one by one.",
                "Use fraud alerts or freezes where your jurisdiction offers them.",
                "Keep a single dated file of every case number and communication."
            ),
            howTo = listOf(
                "Secure email and phone accounts before reclaiming anything else.",
                "Reclaim accounts one by one, fixing passwords and recovery details each time.",
                "Place fraud alerts or freezes and keep their reference numbers.",
                "Report to the relevant authority and each provider, in writing where possible."
            ),
            bestPractices = listOf(
                "One dated file, kept current, is what makes a long recovery manageable.",
                "Watch for new activity in your name for months after the theft."
            ),
            cautions = listOf(
                "Upfront-fee recovery offers after a theft are a second scam.",
                "Recovering accounts without fixing email and phone first leaves the attacker a way back."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to identity theft.")
            )
        ),
        Brief(
            id = "ir-reporting",
            title = "Reporting: Who, When, and What to Say",
            glyph = "\u2709",
            summary = "Reporting without oversharing — and Rule 1 in reporting: report what matters, to the right place, and no further.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Reporting an incident is not a breach of Rule 1. Rule 1 means you " +
                        "do not talk about this casually, publicly, or to people who do " +
                        "not need to know. Reporting to the right place — your bank, " +
                        "your employer, the platform, or the relevant authority — is " +
                        "exactly what Rule 1 allows, because those are the people who " +
                        "can act on it. If a person is in danger, report immediately, " +
                        "to real-world help, without waiting for a perfect account."
                ),
                Block.Heading("Who, when, what", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Who: the provider, your bank, your employer, or the authority that can act — not social media, not a group chat.",
                        "When: as soon as you have the basic facts; do not wait for a complete picture.",
                        "What: facts, times, and what you observed — not speculation about who did it or why.",
                        "What not: passwords, full credentials, or details that would help someone else repeat the attack."
                    )
                ),
                Block.Field(
                    "Report early, report factually",
                    "An early, factual report helps investigators and providers act. A " +
                        "late, speculative report helps no one and can harm people named " +
                        "without evidence."
                ),
                Block.Para(
                    "Keep copies of what you reported and when. If the incident " +
                        "escalates, your early report is the record that you acted " +
                        "promptly and responsibly."
                )
            ),
            outcomes = listOf(
                "Explain why reporting to the right place does not breach Rule 1.",
                "Report early, factually, and only to people who can act.",
                "Keep copies of reports and their dates."
            ),
            howTo = listOf(
                "Identify who can act: provider, bank, employer, or authority.",
                "Report as soon as you have basic facts, without waiting for completeness.",
                "Report facts and times, not speculation about the attacker.",
                "Keep copies of every report, with dates."
            ),
            bestPractices = listOf(
                "Early and factual beats late and complete.",
                "Report to the place that can act, not to the audience that will react."
            ),
            cautions = listOf(
                "Reporting publicly or casually breaches Rule 1 and can harm people named without evidence.",
                "Never include passwords or full credentials in a report."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to reporting incidents.")
            )
        ),
        Brief(
            id = "ir-talking",
            title = "Talking to Others After an Incident",
            glyph = "\u25CB",
            summary = "What to tell colleagues, family, and the public — and what not to tell anyone yet.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "After an incident, people will ask what happened, and you will " +
                        "want to tell them. Tell them in tiers: the people affected " +
                        "need facts and actions; everyone else needs only what affects " +
                        "them. Details about methods, vulnerabilities, and ongoing " +
                        "investigation stay private until they are resolved, because " +
                        "sharing them helps an attacker more than it reassures a listener."
                ),
                Block.Heading("Tiers of telling", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Affected people: what happened, what it means for them, and what they should do, plainly and early.",
                        "Colleagues: what changes in procedure, without the technical detail that would help an attacker.",
                        "Everyone else: nothing yet, unless they are affected or can help.",
                        "Public statements: only through the proper channel, and only what is confirmed."
                    )
                ),
                Block.Field(
                    "Honesty without detail",
                    "You can be honest about the fact of an incident while withholding " +
                        "its technical detail. 'We had an incident, we contained it, and " +
                        "here is what you should do' is both honest and safe."
                ),
                Block.Para(
                    "Agree, in advance or as early as possible, who speaks about the " +
                        "incident. Multiple unofficial accounts create confusion that " +
                        "an attacker, or a journalist, will fill in for you."
                )
            ),
            outcomes = listOf(
                "Tell affected people facts and actions, plainly and early.",
                "Withhold technical detail that would help an attacker.",
                "Agree who speaks about an incident, and through which channel."
            ),
            howTo = listOf(
                "List who is actually affected, and tell them first, plainly.",
                "Tell colleagues what changes in procedure, without technical detail.",
                "Hold public statements until facts are confirmed and a proper channel is agreed.",
                "Designate one speaker or channel for the incident."
            ),
            bestPractices = listOf(
                "Honesty about the fact, restraint about the detail.",
                "One speaker, one channel, confirmed facts only."
            ),
            cautions = listOf(
                "Unofficial accounts fill gaps with speculation, which then becomes the story.",
                "Technical detail shared to reassure can become an attacker's guide."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to incident communication.")
            )
        ),
        Brief(
            id = "ir-recovery-checklist",
            title = "Recovery Checklist and Return to Normal",
            glyph = "\u2713",
            summary = "A checklist for getting back to a safe routine — and for knowing when you are actually there.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Return to normal is a decision, not a feeling. It happens when a " +
                        "checklist is complete, not when the incident stops feeling " +
                        "urgent. Use this checklist, in order, and do not declare " +
                        "recovery complete until every item is checked or consciously " +
                        "accepted as a remaining risk."
                ),
                Block.Heading("The checklist", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Affected accounts recovered, with clean credentials and checked recovery details.",
                        "Affected devices isolated, wiped, or replaced, with trusted data only restored.",
                        "Sessions revoked everywhere, and persistence mechanisms removed.",
                        "Affected people told, reports made, and copies kept.",
                        "Monitoring in place: alerts on, and a watch period agreed.",
                        "Backups verified: a restore tested, not assumed."
                    )
                ),
                Block.Field(
                    "Normal, but not the same",
                    "Return to normal usually means return to a changed normal: new " +
                        "passwords, new procedures, and a lesson recorded. Pretending " +
                        "nothing changed is how the same incident repeats."
                ),
                Block.Para(
                    "Write down what changed permanently as a result of the incident. " +
                        "That list is the beginning of the after-action review."
                )
            ),
            outcomes = listOf(
                "Use a checklist to decide when recovery is complete.",
                "Verify accounts, devices, sessions, reports, monitoring, and backups before declaring recovery.",
                "Record what changed permanently as a result of the incident."
            ),
            howTo = listOf(
                "Work the checklist in order, item by item, without skipping.",
                "Test a backup restore before declaring recovery complete.",
                "Set a monitoring watch period and keep alerts on during it.",
                "Write down permanent changes that result from the incident."
            ),
            bestPractices = listOf(
                "Recovery is a checklist decision, not a feeling of calm.",
                "A tested restore is the only backup that counts."
            ),
            cautions = listOf(
                "Declaring recovery early, because urgency has faded, leaves persistence in place.",
                "Returning to exactly the old routine invites exactly the old incident."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to recovery.")
            )
        ),
        Brief(
            id = "ir-after-action",
            title = "After-Action Review: Learning Without Blame",
            glyph = "\u25C8",
            summary = "What to change, what to keep, and how to record it — so the next incident is smaller.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "An incident that teaches nothing will repeat. An after-action " +
                        "review turns it into a lesson, but only if it is blame-free: " +
                        "people who fear blame hide mistakes, and hidden mistakes are " +
                        "the ones that repeat. Review the system, not the person."
                ),
                Block.Heading("Four questions", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "What happened, in order, according to the notes made at the time?",
                        "What worked, and should be kept?",
                        "What failed, and was it a person, a procedure, or a tool?",
                        "What will change, who owns the change, and by when?"
                    )
                ),
                Block.Field(
                    "Record it, or it did not happen",
                    "A review that is not written down, with owners and dates, is a " +
                        "conversation, not a change. The next incident will not remember " +
                        "your conversation."
                ),
                Block.Para(
                    "Share the lessons, without the blame and without the technical " +
                        "detail that would help an attacker. A lesson shared is a " +
                        "lesson multiplied; a lesson hoarded is a lesson wasted."
                )
            ),
            outcomes = listOf(
                "Run a blame-free after-action review using four questions.",
                "Turn lessons into changes with owners and dates.",
                "Share lessons without blame and without attacker-useful detail."
            ),
            howTo = listOf(
                "Reconstruct the incident from notes made at the time, in order.",
                "List what worked, what failed, and whether each failure was person, procedure, or tool.",
                "Assign every change an owner and a date.",
                "Write the review down and share its lessons appropriately."
            ),
            bestPractices = listOf(
                "Review the system, not the person; blame hides the mistakes that repeat.",
                "A change without an owner and a date is a wish, not a change."
            ),
            cautions = listOf(
                "Skipping the review guarantees repeating the same failure.",
                "Sharing technical detail in a lesson can become an attacker's guide."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to learning from incidents.")
            )
        )
    )
)
