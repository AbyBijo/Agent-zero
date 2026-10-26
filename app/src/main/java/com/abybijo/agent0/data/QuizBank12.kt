package com.abybijo.agent0.data

/** v2.0 Phase 4c: questions linked to CH-12 Incident Response briefs, three per brief. */
object QuizBank12 {
    val all: List<QuizQuestion> = listOf(
        QuizQuestion(
            prompt = "What is the correct order of actions in the first hour of an incident?",
            options = listOf("Wipe, change passwords, investigate", "Stop, preserve, note", "Report, wipe, recover", "Ignore, wait, recover"),
            answerIndex = 1,
            rationale = "Containment and notes come first; diagnosis and recovery follow from a clean device.",
            id = "ir-q01", briefKey = "incident/ir-first-hour", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why must you not change passwords from a compromised device?",
            options = listOf("It is slower", "It hands the new passwords to the attacker", "It is against policy", "It locks you out"),
            answerIndex = 1,
            rationale = "A compromised device observes what you type, including new credentials.",
            id = "ir-q02", briefKey = "incident/ir-first-hour", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "If a person is in danger during an incident, what comes first?",
            options = listOf("Preserving evidence", "Getting real-world help", "Containing the account", "Noting times"),
            answerIndex = 1,
            rationale = "A person's safety comes before every technical step.",
            id = "ir-q03", briefKey = "incident/ir-first-hour", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why preserve evidence before changing an affected system?",
            options = listOf("For court, only", "Because every action on the system alters its evidence, and evidence decides scope", "Because it is faster", "Because logs are permanent"),
            answerIndex = 1,
            rationale = "Evidence decides scope, and scope decides the response; altering it blinds the response.",
            id = "ir-q04", briefKey = "incident/ir-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you record during an incident?",
            options = listOf("Only the final outcome", "Times, symptoms, and every action taken, with who did what on which device", "Only attacker details", "Nothing; memory suffices"),
            answerIndex = 1,
            rationale = "A chain of notes made at the time is what later decisions run on.",
            id = "ir-q05", briefKey = "incident/ir-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is evidence preserved even if no court case is expected?",
            options = listOf("It is not", "Because it guides decisions now: what is compromised, what must change, who must be told", "Because it is required", "Because it proves blame"),
            answerIndex = 1,
            rationale = "Evidence is for decisions, not only for courtrooms.",
            id = "ir-q06", briefKey = "incident/ir-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the correct order for containing a compromised account?",
            options = listOf("Check, lock, recover", "Lock, recover, check", "Recover, check, lock", "Delete, recreate, check"),
            answerIndex = 1,
            rationale = "Lock the attacker out first, recover through a trusted channel, then check what was done.",
            id = "ir-q07", briefKey = "incident/ir-account", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "After recovering an account, what must you check for?",
            options = listOf("Only the inbox", "Forwarding rules, connected apps, and changed recovery details — attacker persistence", "Only the password strength", "Nothing; recovery is complete"),
            answerIndex = 1,
            rationale = "Persistence mechanisms are the commonest way back in after recovery.",
            id = "ir-q08", briefKey = "incident/ir-account", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why recover an account only from a clean device?",
            options = listOf("Clean devices are faster", "Recovery from a compromised device is not recovery; the attacker observes it", "It is policy", "Clean devices have better browsers"),
            answerIndex = 1,
            rationale = "A compromised device hands new credentials and recovery steps to the attacker.",
            id = "ir-q09", briefKey = "incident/ir-account", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A device is suspected compromised. What is the first step?",
            options = listOf("Keep using it for urgent work", "Disconnect it and stop using it for sensitive actions", "Change all passwords on it", "Run a scan and continue"),
            answerIndex = 1,
            rationale = "Isolation first; everything sensitive moves to a clean device.",
            id = "ir-q10", briefKey = "incident/ir-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When should you seek professional help before wiping a device?",
            options = listOf("Never", "If it holds critical work, the compromise may be targeted, or evidence must be preserved", "Only for expensive devices", "Only if you cannot wipe it yourself"),
            answerIndex = 1,
            rationale = "A wipe is easy and irreversible; help before wiping preserves evidence and critical work.",
            id = "ir-q11", briefKey = "incident/ir-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does restoring a backup not automatically clean a device?",
            options = listOf("Backups are slow", "A backup containing the compromise restores the compromise", "Backups do not include settings", "Restores always fail"),
            answerIndex = 1,
            rationale = "Only trusted data, restored to a clean device with clean credentials, is a recovery.",
            id = "ir-q12", briefKey = "incident/ir-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "In a data breach, what do you change first?",
            options = listOf("Everything at once", "The breached account, then accounts sharing its password, then email", "Your email last", "Only the breached service"),
            answerIndex = 1,
            rationale = "Priority order: breached account, shared passwords, email, financial and work accounts, sessions, recovery.",
            id = "ir-q13", briefKey = "incident/ir-breach", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is your email account second in breach priority?",
            options = listOf("It is the most used", "Because it recovers most other accounts", "Because it is oldest", "Because it holds the most data"),
            answerIndex = 1,
            rationale = "Email is the recovery path for most accounts, so securing it secures the rest.",
            id = "ir-q14", briefKey = "incident/ir-breach", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why revoke sessions everywhere after a breach, not only on one device?",
            options = listOf("It is faster", "Sessions left active elsewhere undo a password change", "It is required", "Devices sync slowly"),
            answerIndex = 1,
            rationale = "A live session elsewhere remains live regardless of a new password.",
            id = "ir-q15", briefKey = "incident/ir-breach", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "In identity theft recovery, what do you secure first?",
            options = listOf("The loan account", "Email and phone accounts", "Social media", "Credit cards"),
            answerIndex = 1,
            rationale = "Email and phone recover everything else, so they come first.",
            id = "ir-q16", briefKey = "incident/ir-identity-theft", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "An unsolicited offer to recover your identity for an upfront fee is most likely what?",
            options = listOf("Legitimate help", "A second scam following the theft", "A government service", "A bank service"),
            answerIndex = 1,
            rationale = "Legitimate help does not arrive unsolicited and does not charge upfront.",
            id = "ir-q17", briefKey = "incident/ir-identity-theft", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What single habit makes long identity theft recovery manageable?",
            options = listOf("Calling daily", "One dated file of every case number, letter, and call", "Hiring help immediately", "Changing all passwords weekly"),
            answerIndex = 1,
            rationale = "One current, dated file is what a months-long recovery runs on.",
            id = "ir-q18", briefKey = "incident/ir-identity-theft", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Does Rule 1 forbid reporting an incident?",
            options = listOf("Yes, always", "No; reporting to the people who can act is exactly what Rule 1 allows", "Only for serious incidents", "Only with permission"),
            answerIndex = 1,
            rationale = "Rule 1 forbids casual and public talk, not reporting to those who can act.",
            id = "ir-q19", briefKey = "incident/ir-reporting", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When should you report an incident?",
            options = listOf("After a complete investigation", "As soon as you have basic facts", "Only if harm is proven", "After a week"),
            answerIndex = 1,
            rationale = "Early and factual beats late and complete; completeness follows.",
            id = "ir-q20", briefKey = "incident/ir-reporting", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What must you never include in an incident report?",
            options = listOf("Times", "Passwords or full credentials", "Facts observed", "Your contact details"),
            answerIndex = 1,
            rationale = "Credentials in a report create a new exposure and help no investigator.",
            id = "ir-q21", briefKey = "incident/ir-reporting", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "After an incident, who should be told first?",
            options = listOf("The press", "Affected people, plainly: what happened, what it means for them, what to do", "Everyone at once", "No one"),
            answerIndex = 1,
            rationale = "Affected people need facts and actions early; everyone else waits for confirmed facts.",
            id = "ir-q22", briefKey = "incident/ir-talking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why withhold technical detail when talking about an incident?",
            options = listOf("To hide blame", "Because technical detail shared to reassure can become an attacker's guide", "Because people would not understand", "Because it is secret by law"),
            answerIndex = 1,
            rationale = "Detail helps attackers more than it reassures listeners.",
            id = "ir-q23", briefKey = "incident/ir-talking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why agree one speaker and one channel for an incident?",
            options = listOf("For control", "Because multiple unofficial accounts create confusion that others fill with speculation", "For speed", "Because journalists prefer it"),
            answerIndex = 1,
            rationale = "Unofficial accounts fill gaps with speculation, which then becomes the story.",
            id = "ir-q24", briefKey = "incident/ir-talking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What decides whether recovery is complete?",
            options = listOf("That things feel calm", "That a checklist is complete, or remaining risks are consciously accepted", "That a week has passed", "That management says so"),
            answerIndex = 1,
            rationale = "Recovery is a checklist decision, not a feeling or a calendar date.",
            id = "ir-q25", briefKey = "incident/ir-recovery-checklist", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the only backup that counts for recovery?",
            options = listOf("The newest backup", "A restore that has been tested", "A cloud backup", "A backup made yesterday"),
            answerIndex = 1,
            rationale = "An untested backup is a hope, not a backup; only a tested restore counts.",
            id = "ir-q26", briefKey = "incident/ir-recovery-checklist", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is returning to exactly the old routine after an incident a failure?",
            options = listOf("It is not", "Because it invites exactly the old incident to repeat", "Because routines must always change", "Because it looks bad"),
            answerIndex = 1,
            rationale = "Return to normal usually means a changed normal, with lessons recorded.",
            id = "ir-q27", briefKey = "incident/ir-recovery-checklist", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What are the four questions of a blame-free after-action review?",
            options = listOf("Who, when, where, why", "What happened, what worked, what failed, what will change", "Who, what, how, how much", "What, so what, now what, who cares"),
            answerIndex = 1,
            rationale = "Four questions — happened, worked, failed, changes — structure a review without blame.",
            id = "ir-q28", briefKey = "incident/ir-after-action", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does blame make future incidents worse?",
            options = listOf("It hurts morale", "Because blamed people hide mistakes, and hidden mistakes repeat", "It wastes time", "It is unfair"),
            answerIndex = 1,
            rationale = "Blame drives mistakes underground, where they repeat unreported.",
            id = "ir-q29", briefKey = "incident/ir-after-action", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What turns a review's lessons into changes?",
            options = listOf("Agreeing verbally", "Writing them down, with an owner and a date", "Sharing them widely", "Discussing them once"),
            answerIndex = 1,
            rationale = "A change without an owner and a date is a wish, not a change.",
            id = "ir-q30", briefKey = "incident/ir-after-action", difficulty = "Advanced"
        )
    )
}
