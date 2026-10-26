package com.abybijo.agent0.data

/** v2.0 Phase 4c: drills linked to CH-12 Incident Response briefs, one per brief. */
object Scenarios12 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "ir-first-hour-drill",
            title = "The Alert at Midnight",
            intro = "At midnight you get an alert: a login to your main account from an unfamiliar country, and a password-change email you did not request. Your first instinct is to wipe everything and change every password at once.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Wipe the device and change all passwords immediately", "bad1"),
                        ScenarioChoice("Stop, preserve, note: isolate, record times and symptoms, get help if anyone is in danger", "step2"),
                        ScenarioChoice("Ignore it until morning", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You have contained and noted. What is the next step?",
                    choices = listOf(
                        ScenarioChoice("Change passwords from the affected device", "bad1"),
                        ScenarioChoice("Recover from a clean device, in order: lock, recover, check", "good1"),
                        ScenarioChoice("Delete the account to end the incident", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You contain, note, and recover from a clean device in order. The attacker is locked out, the evidence is preserved, and your notes make the rest of the recovery straightforward.",
                    outcome = Outcome.GOOD,
                    lesson = "The first hour is for containment and notes, not panic. Order — stop, preserve, note, then recover from a clean device — prevents a bad incident becoming worse."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Wiping destroys the only evidence, and changing passwords from the compromised device hands the new ones to the attacker. The incident gets worse, not better.",
                    outcome = Outcome.BAD,
                    lesson = "Panic-wiping and compromised-device password changes help the attacker, not you."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Ignoring the alert, or deleting the account, either lets the attacker work all night or destroys evidence and access you will need for recovery.",
                    outcome = Outcome.BAD,
                    lesson = "Neither ignoring nor deleting is containment. Isolate, preserve, and note — now."
                )
            ),
            briefKey = "incident/ir-first-hour"
        ),
        Scenario(
            id = "ir-evidence-drill",
            title = "Do Not Touch That",
            intro = "You discover unusual activity on a device. Your instinct is to log in, look around, run a scan, and fix what you find — immediately, before anything else happens.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Log in and investigate thoroughly", "bad1"),
                        ScenarioChoice("Screenshot alerts and activity with times, and save logs before changing anything", "step2"),
                        ScenarioChoice("Wipe it and start clean", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You have preserved what you can. What guides the next decision?",
                    choices = listOf(
                        ScenarioChoice("What the evidence shows about scope, not what you assume", "good1"),
                        ScenarioChoice("Your gut feeling about how bad it is", "bad2"),
                        ScenarioChoice("Whatever is fastest to fix", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Your preserved evidence shows the compromise is limited to one account, not the whole device. Recovery is targeted, quick, and complete — because you knew the scope before acting.",
                    outcome = Outcome.GOOD,
                    lesson = "Preserve before you fix. Evidence decides scope, and scope decides the response."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Investigating on the affected system alters its evidence, and fixing by speed rather than scope either misses the real compromise or overreacts to a minor one.",
                    outcome = Outcome.BAD,
                    lesson = "Every action on an affected system alters its evidence. Observe and copy first, change last."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Wiping destroys the evidence that would have told you what happened, and whether it is really over.",
                    outcome = Outcome.BAD,
                    lesson = "A wipe without evidence is a guess, not a recovery."
                )
            ),
            briefKey = "incident/ir-evidence"
        ),
        Scenario(
            id = "ir-account-drill",
            title = "Locked Out of Your Own Account",
            intro = "You cannot log in to an important account: the password does not work, and a recovery email you do not recognise has been added. An attacker has been inside.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is the recovery order?",
                    choices = listOf(
                        ScenarioChoice("Check what the attacker did first, then recover", "bad2"),
                        ScenarioChoice("Lock, recover, check — from a clean device", "step2"),
                        ScenarioChoice("Create a new account and abandon the old one", "bad1")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You have recovered the account. What must you still check?",
                    choices = listOf(
                        ScenarioChoice("Forwarding rules, connected apps, and recovery details for attacker persistence", "good1"),
                        ScenarioChoice("Nothing; recovery means it is over", "bad1"),
                        ScenarioChoice("Only the inbox", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You find a forwarding rule sending your mail to the attacker, and remove it, along with an unknown connected app. Recovery is real, because persistence is gone.",
                    outcome = Outcome.GOOD,
                    lesson = "Lock, recover, check — in that order, from a clean device — and check for persistence, or recovery is an illusion."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Abandoning the account, or assuming recovery is complete, leaves the attacker with a forwarding rule, a connected app, or a changed recovery address — a way back in.",
                    outcome = Outcome.BAD,
                    lesson = "Recovery is not complete until persistence is found and removed."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Checking before locking, or checking only the inbox, lets the attacker act while you look, and misses the persistence mechanisms that matter.",
                    outcome = Outcome.BAD,
                    lesson = "Order matters: lock first, recover second, check third — and check everywhere, not only the inbox."
                )
            ),
            briefKey = "incident/ir-account"
        ),
        Scenario(
            id = "ir-device-drill",
            title = "The Phone That Is Not Yours Anymore",
            intro = "Your phone behaves strangely: battery draining, data spiking, apps you did not install. You suspect compromise, and you need the phone for work today.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Keep using it for work; you need it today", "bad1"),
                        ScenarioChoice("Disconnect it and stop using it for sensitive actions", "step2"),
                        ScenarioChoice("Change all passwords on it immediately", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You have isolated it. What is the recovery path?",
                    choices = listOf(
                        ScenarioChoice("Copy needed data from a clean system, then wipe and reinstall from known-good media, or seek help first if evidence matters", "good1"),
                        ScenarioChoice("Run an antivirus scan and keep using it", "bad1"),
                        ScenarioChoice("Restore your last backup immediately", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You isolate, preserve, wipe from known-good media, and restore only trusted data with clean credentials from a clean device. The phone is yours again.",
                    outcome = Outcome.GOOD,
                    lesson = "Isolate, preserve, decide — and recover to a clean device with clean credentials and trusted data only."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Continuing to use a compromised device, or trusting a scan to clear it, lets the attacker observe your work and your new passwords.",
                    outcome = Outcome.BAD,
                    lesson = "A suspected-compromised device is not a work device until it is rebuilt."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Changing passwords on the compromised device hands them over, and restoring a backup that contains the compromise restores the compromise.",
                    outcome = Outcome.BAD,
                    lesson = "Never change credentials on a compromised device, and never restore untrusted data blindly."
                )
            ),
            briefKey = "incident/ir-device"
        ),
        Scenario(
            id = "ir-breach-drill",
            title = "Your Data in a Breach",
            intro = "You learn a service you use suffered a breach exposing emails and passwords. You use that password in several places, including your email account.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you change first?",
                    choices = listOf(
                        ScenarioChoice("Everything at once, in any order", "bad2"),
                        ScenarioChoice("In priority order: breached account, accounts sharing its password, then email, then financial and work accounts", "step2"),
                        ScenarioChoice("Only the breached service", "bad1")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "After passwords, what else must you do?",
                    choices = listOf(
                        ScenarioChoice("Revoke sessions everywhere, check recovery details, and write down what you changed", "good1"),
                        ScenarioChoice("Nothing else; new passwords are enough", "bad1"),
                        ScenarioChoice("Change passwords again next week", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You change in priority order, revoke sessions everywhere, fix recovery details, and record the changes. The breach stays single, because your passwords are now unique.",
                    outcome = Outcome.GOOD,
                    lesson = "Breach response is prioritised: breached account, shared passwords, email, financial and work, sessions, recovery — in that order."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Changing only the breached service, or only passwords without revoking sessions, leaves the attacker in your other accounts and your active sessions.",
                    outcome = Outcome.BAD,
                    lesson = "Reuse turns one breach into many, and live sessions undo password changes."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Changing everything at once without order misses the highest risks while you are busy with the lowest.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Priority beats completeness in the first hour; completeness follows in the first day."
                )
            ),
            briefKey = "incident/ir-breach"
        ),
        Scenario(
            id = "ir-identity-theft-drill",
            title = "Someone Is You",
            intro = "You discover accounts opened in your name, and a loan application you never made. An offer arrives, unsolicited, to 'recover your identity' for an upfront fee.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do about the offer?",
                    choices = listOf(
                        ScenarioChoice("Pay it; recovery is urgent", "bad1"),
                        ScenarioChoice("Ignore it — upfront-fee recovery offers after a theft are a second scam", "step2"),
                        ScenarioChoice("Pay half now", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What is the real recovery order?",
                    choices = listOf(
                        ScenarioChoice("Secure email and phone first, reclaim accounts one by one, place fraud alerts or freezes, report in writing, keep one dated file", "good1"),
                        ScenarioChoice("Reclaim the loan account first, then everything else", "bad2"),
                        ScenarioChoice("Wait for the thief to stop", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You secure email and phone, reclaim accounts one by one, place alerts, report in writing, and keep one dated file. Recovery takes months, but it ends — without paying a second scammer.",
                    outcome = Outcome.GOOD,
                    lesson = "Identity theft recovery is slow, ordered, and administrative. Upfront-fee offers are a second scam."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Paying the recovery offer, or waiting for the thief to stop, either funds a second scam or lets the theft grow.",
                    outcome = Outcome.BAD,
                    lesson = "Legitimate help does not arrive unsolicited and does not charge upfront."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Paying half, or reclaiming accounts without securing email and phone first, leaves the attacker a way back into everything you reclaim.",
                    outcome = Outcome.BAD,
                    lesson = "Email and phone first, or every reclaimed account can be taken again."
                )
            ),
            briefKey = "incident/ir-identity-theft"
        ),
        Scenario(
            id = "ir-reporting-drill",
            title = "To Report, or Not",
            intro = "An incident at work exposes customer data. A colleague suggests keeping it quiet to avoid trouble, saying Rule 1 means not talking about it. You are unsure.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "Does Rule 1 forbid reporting?",
                    choices = listOf(
                        ScenarioChoice("Yes; Rule 1 means silence", "bad1"),
                        ScenarioChoice("No; reporting to the people who can act is exactly what Rule 1 allows", "step2"),
                        ScenarioChoice("Only if no one was harmed", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "How do you report?",
                    choices = listOf(
                        ScenarioChoice("Early, factually, to the provider, employer, or authority that can act — never with passwords or credentials", "good1"),
                        ScenarioChoice("Publicly, so everyone knows", "bad1"),
                        ScenarioChoice("After a complete investigation, months later", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You report early and factually to the right place, with copies kept. The exposure is contained, customers are protected, and your report is the record that you acted promptly.",
                    outcome = Outcome.GOOD,
                    lesson = "Reporting to the right place does not breach Rule 1. Early and factual beats late and complete."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Keeping quiet, or reporting publicly, either lets the exposure grow or breaches Rule 1 and harms people named without evidence.",
                    outcome = Outcome.BAD,
                    lesson = "Silence is not Rule 1, and publicity is not reporting. Report to the place that can act."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Waiting for completeness, or reporting only if harm is proven, delays the very action that would prevent the harm.",
                    outcome = Outcome.BAD,
                    lesson = "Report on basic facts, early. Completeness follows; harm prevented does not wait."
                )
            ),
            briefKey = "incident/ir-reporting"
        ),
        Scenario(
            id = "ir-talking-drill",
            title = "What to Tell, and to Whom",
            intro = "After an incident, affected customers need to know, colleagues are asking, and a journalist has called. Everyone wants a statement, now, and you have incomplete facts.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "Who do you tell first?",
                    choices = listOf(
                        ScenarioChoice("The journalist, to control the story", "bad1"),
                        ScenarioChoice("Affected people, plainly: what happened, what it means for them, what they should do", "step2"),
                        ScenarioChoice("Everyone at once, with everything you know", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you tell colleagues and the public?",
                    choices = listOf(
                        ScenarioChoice("Technical detail, to prove transparency", "bad1"),
                        ScenarioChoice("What changes in procedure, and confirmed facts only, through one agreed channel", "good1"),
                        ScenarioChoice("Nothing until everything is known", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Affected people get facts and actions early, colleagues get procedure changes, and the public gets confirmed facts through one channel. Honesty without detail holds.",
                    outcome = Outcome.GOOD,
                    lesson = "Tell affected people first, plainly. Withhold technical detail that would help an attacker, and speak through one channel."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Leading with the journalist, or sharing technical detail for transparency, hands an attacker a guide and creates a story you cannot control.",
                    outcome = Outcome.BAD,
                    lesson = "Transparency about the fact is not transparency about the detail. Detail helps attackers."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Telling everyone everything, or telling no one until complete, either spreads detail or lets speculation fill the gap.",
                    outcome = Outcome.BAD,
                    lesson = "Tiers of telling: affected people first, confirmed facts only, one channel."
                )
            ),
            briefKey = "incident/ir-talking"
        ),
        Scenario(
            id = "ir-recovery-checklist-drill",
            title = "Are We Back to Normal?",
            intro = "After an incident, things feel calmer. The team wants to declare recovery complete and return to normal routines. You have a checklist, and three items are unchecked.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What decides whether recovery is complete?",
                    choices = listOf(
                        ScenarioChoice("That things feel calm", "bad1"),
                        ScenarioChoice("That the checklist is complete, or remaining risks are consciously accepted", "step2"),
                        ScenarioChoice("That a week has passed", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The unchecked items are: sessions not yet revoked, and a backup never tested. What now?",
                    choices = listOf(
                        ScenarioChoice("Declare recovery and finish them later", "bad1"),
                        ScenarioChoice("Revoke sessions, test a restore, and only then declare recovery", "good1"),
                        ScenarioChoice("Declare recovery for accounts, and handle devices later", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Sessions are revoked, a restore is tested and works, and recovery is declared on evidence. The return to normal is a changed normal, with new procedures recorded.",
                    outcome = Outcome.GOOD,
                    lesson = "Recovery is a checklist decision, not a feeling. A tested restore is the only backup that counts."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Declaring recovery on calm feelings, or with sessions live and backups untested, leaves persistence in place and recovery unproven.",
                    outcome = Outcome.BAD,
                    lesson = "Calm is not recovery. Unrevoked sessions and untested backups are unfinished recovery."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Partial declarations — accounts recovered but devices not — invite the same incident back through the unfinished half.",
                    outcome = Outcome.BAD,
                    lesson = "Recovery is whole or it is not recovery. Finish the checklist."
                )
            ),
            briefKey = "incident/ir-recovery-checklist"
        ),
        Scenario(
            id = "ir-after-action-drill",
            title = "The Review Nobody Wanted",
            intro = "After an incident, the team wants to move on. Someone suggests a review, and the room goes quiet: nobody wants to be blamed for what went wrong.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "How do you run the review?",
                    choices = listOf(
                        ScenarioChoice("Find who made the mistake", "bad1"),
                        ScenarioChoice("Blame-free, using four questions: what happened, what worked, what failed, what changes", "step2"),
                        ScenarioChoice("Skip it; moving on is healthier", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The review finds a procedure flaw, not a person flaw. What makes it a change, not a conversation?",
                    choices = listOf(
                        ScenarioChoice("Writing it down, with an owner and a date", "good1"),
                        ScenarioChoice("Agreeing verbally that it should change", "bad2"),
                        ScenarioChoice("Sharing the technical detail widely as a lesson", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The review is written down, the change has an owner and a date, and the lesson is shared without blame and without attacker-useful detail. The next incident will be smaller.",
                    outcome = Outcome.GOOD,
                    lesson = "Review the system, not the person. A change without an owner and a date is a wish, not a change."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Blaming a person, or sharing technical detail widely, either hides future mistakes or hands attackers a guide.",
                    outcome = Outcome.BAD,
                    lesson = "Blame hides the mistakes that repeat. Detail shared carelessly helps attackers."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Skipping the review, or agreeing verbally without recording, guarantees the same failure will repeat, unremembered.",
                    outcome = Outcome.BAD,
                    lesson = "A review not written down is a conversation, not a change. The next incident will not remember it."
                )
            ),
            briefKey = "incident/ir-after-action"
        )
    )
}
