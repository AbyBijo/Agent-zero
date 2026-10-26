package com.abybijo.agent0.data

/** v2.0 Phase 4c: drills linked to CH-11 Team OPSEC briefs, one per brief. */
object Scenarios11 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "team-discipline-drill",
            title = "The Careful One and the Careless Team",
            intro = "You are careful with security. A teammate routinely shares internal documents in a public chat 'for convenience', and the team has started copying the habit.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Stay careful yourself and say nothing", "bad2"),
                        ScenarioChoice("Raise it with the team: one gap exposes everyone, and propose a shared rule", "step2"),
                        ScenarioChoice("Report the teammate to management immediately", "bad1")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The team agrees a rule but drifts back within a week. What now?",
                    choices = listOf(
                        ScenarioChoice("Give up; teams cannot change", "bad2"),
                        ScenarioChoice("Make the rule easy: a private channel for internal documents, set as the default", "good1"),
                        ScenarioChoice("Police every message yourself", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The private channel becomes the default, and sharing there is easier than sharing publicly. The habit changes because the easy path changed, not because anyone was scolded.",
                    outcome = Outcome.GOOD,
                    lesson = "Team OPSEC is a shared posture, changed by making the safe path the easy path — not by one careful person alone."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Immediate escalation or personal policing creates resentment, and the team hides its sharing instead of stopping it.",
                    outcome = Outcome.BAD,
                    lesson = "Escalation without a workable alternative drives behaviour underground, not away."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Staying silent while the team copies a bad habit means your own care protects nothing: the team's gap is your gap.",
                    outcome = Outcome.BAD,
                    lesson = "One careful person cannot carry a careless team. Raise it, and propose the fix."
                )
            ),
            briefKey = "team/team-discipline"
        ),
        Scenario(
            id = "team-need-to-know-drill",
            title = "Access for a New Role",
            intro = "A colleague moves to a new role and asks you to grant them the same access as their old team 'just in case', plus their new team's access. It would be faster to say yes.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you grant?",
                    choices = listOf(
                        ScenarioChoice("Both sets, to be helpful", "bad1"),
                        ScenarioChoice("Only what the new role requires, and revoke the old access", "step2"),
                        ScenarioChoice("Nothing until a manager approves in writing", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The colleague says the old access is needed for one handover task. What now?",
                    choices = listOf(
                        ScenarioChoice("Grant it temporarily, with an expiry date, for that task", "good1"),
                        ScenarioChoice("Refuse outright", "bad2"),
                        ScenarioChoice("Grant it permanently, to avoid repeat requests", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The colleague gets new-role access, old access revoked, and temporary access for the handover, expiring automatically. Need-to-know held, and the work still got done.",
                    outcome = Outcome.GOOD,
                    lesson = "Need-to-know means access matched to current work, with temporary access — expiring — for genuine exceptions."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Both sets of access accumulate. The colleague now holds more than either role requires, permanently, and nobody remembers why.",
                    outcome = Outcome.BAD,
                    lesson = "Access granted 'just in case' is access granted forever. Grant for current work only."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Blanket refusal, or demanding written approval for routine access, pushes the colleague to workarounds that bypass access control entirely.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Need-to-know must not become secrecy theatre, or people will route around it."
                )
            ),
            briefKey = "team/team-need-to-know"
        ),
        Scenario(
            id = "team-shared-drill",
            title = "The Password Everyone Knows",
            intro = "Your team shares one password for a service account. A member leaves, and someone suggests 'we should probably change it' — but changing it means telling everyone, and nobody does.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is the core problem?",
                    choices = listOf(
                        ScenarioChoice("The password is too weak", "bad2"),
                        ScenarioChoice("A shared password cannot be revoked for one person or traced to one person", "step2"),
                        ScenarioChoice("Leavers cannot be trusted", "bad1")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What is the fix?",
                    choices = listOf(
                        ScenarioChoice("Change the shared password and tell everyone again", "bad2"),
                        ScenarioChoice("Give each person their own account, and revoke the leaver's", "good1"),
                        ScenarioChoice("Make the shared password longer", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Individual accounts replace the shared password. The leaver's access is revoked cleanly, and future departures are a single revocation, not a team-wide password change.",
                    outcome = Outcome.GOOD,
                    lesson = "Shared credentials fail the revocability test. Individual accounts with role-based access are the fix."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "A longer password, or blaming leavers, changes nothing: the credential is still shared, still unrevocable per person, still untraceable.",
                    outcome = Outcome.BAD,
                    lesson = "Password strength does not fix sharing. Only individual access fixes sharing."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Changing the shared password and re-sharing it repeats the same failure, with a new password everyone knows.",
                    outcome = Outcome.BAD,
                    lesson = "Re-sharing a changed password is the same failure with a fresh secret."
                )
            ),
            briefKey = "team/team-shared"
        ),
        Scenario(
            id = "team-onboarding-drill",
            title = "The Departure Nobody Owned",
            intro = "A team member left three weeks ago. You discover they still have access to the shared drive, the group chat, and a spare office key. Nobody was assigned to revoke any of it.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Revoke everything now, including informal access", "step2"),
                        ScenarioChoice("Ask the former member to delete their access", "bad1"),
                        ScenarioChoice("Leave it; they were trustworthy", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "How do you prevent the next departure from going the same way?",
                    choices = listOf(
                        ScenarioChoice("Write an offboarding checklist with a named owner, covering formal and informal access", "good1"),
                        ScenarioChoice("Remind everyone to be more careful", "bad2"),
                        ScenarioChoice("Revoke access only for senior departures", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Access is revoked, and a checklist with a named owner now runs on departure day, covering accounts, drives, chats, and keys. The next departure closes cleanly.",
                    outcome = Outcome.GOOD,
                    lesson = "Offboarding is a checklist with an owner, covering informal access too — not a hope that someone remembers."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Asking a former member to revoke themselves, or revoking only for senior staff, leaves access open for everyone else, indefinitely.",
                    outcome = Outcome.BAD,
                    lesson = "Revocation is the team's job, on departure day, for every departure."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Trusting a former member, or reminding everyone to be careful, changes nothing: the access remains, and trust is not a control.",
                    outcome = Outcome.BAD,
                    lesson = "Trust is not access control. Revoke, and record the revocation."
                )
            ),
            briefKey = "team/team-onboarding"
        ),
        Scenario(
            id = "team-meetings-drill",
            title = "The Notes That Travelled",
            intro = "Meeting notes from a sensitive discussion were stored in a shared document with no restrictions. A colleague forwards the document to someone who was not in the meeting, 'for context'.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What went wrong first?",
                    choices = listOf(
                        ScenarioChoice("The colleague who forwarded it", "bad2"),
                        ScenarioChoice("Notes stored without the meeting's access rules", "step2"),
                        ScenarioChoice("Taking notes at all", "bad1")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Ban meeting notes", "bad1"),
                        ScenarioChoice("Store notes with the same access as the meeting, and restrict recordings more tightly", "good1"),
                        ScenarioChoice("Tell colleagues not to forward things", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Notes now live where only the meeting's audience can reach them, recordings are restricted further, and forwarding outside that audience is visibly a breach, not a favour.",
                    outcome = Outcome.GOOD,
                    lesson = "Notes are the real record. Store them with the meeting's access rules, or they will travel further than the meeting."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Banning notes, or blaming only the forwarder, misses the cause: unrestricted storage made forwarding trivial.",
                    outcome = Outcome.BAD,
                    lesson = "Fix the storage, not only the forwarder. Unrestricted notes invite forwarding."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Asking colleagues not to forward, without changing storage, leaves the same document one click from the same result.",
                    outcome = Outcome.BAD,
                    lesson = "Requests are not controls. Access rules are controls."
                )
            ),
            briefKey = "team/team-meetings"
        ),
        Scenario(
            id = "team-vendors-drill",
            title = "The Vendor Who Stayed",
            intro = "A contractor finished work six months ago, but their account is still active, and nobody knows who owns revoking it. The account was used last week — by someone.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Revoke the account and investigate the recent use", "step2"),
                        ScenarioChoice("Email the vendor asking if they still need it", "bad2"),
                        ScenarioChoice("Leave it; the vendor is trustworthy", "bad1")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "How do you prevent this for the next vendor?",
                    choices = listOf(
                        ScenarioChoice("Vendor access with an expiry date and a named owner for revocation, agreed before access starts", "good1"),
                        ScenarioChoice("Shorter contracts", "bad2"),
                        ScenarioChoice("Vendor access only for large vendors", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The account is revoked, the use is investigated, and future vendor access expires automatically with a named owner. Vendor access now ends when vendor work ends.",
                    outcome = Outcome.GOOD,
                    lesson = "Vendor access needs an expiry date and an owner, agreed before access starts — or it outlives the work."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Trusting the vendor, or limiting rules to large vendors, leaves the same unmonitored door open for everyone else.",
                    outcome = Outcome.BAD,
                    lesson = "Trust is not revocation. Every vendor account needs an owner and an expiry."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Asking the vendor, or shortening contracts without changing access rules, leaves the account active while you wait.",
                    outcome = Outcome.BAD,
                    lesson = "Revoke first, then ask. An active account under investigation is an active risk."
                )
            ),
            briefKey = "team/team-vendors"
        ),
        Scenario(
            id = "team-remote-drill",
            title = "Working From the Kitchen Table",
            intro = "A teammate works from home with family around, takes work calls on speaker, and leaves work documents visible on the kitchen table. They say home is private.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is wrong with 'home is private'?",
                    choices = listOf(
                        ScenarioChoice("Nothing; home is private", "bad1"),
                        ScenarioChoice("Home is shared with family, guests, and smart devices — it is a public network with better furniture", "step2"),
                        ScenarioChoice("Only the documents matter, not the calls", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What does the teammate change?",
                    choices = listOf(
                        ScenarioChoice("Separate work device and accounts, use protections on every network, keep work out of shared spaces", "good1"),
                        ScenarioChoice("Work only when family is out", "bad2"),
                        ScenarioChoice("Use headphones for calls only", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The teammate separates work from personal, uses protections everywhere, and keeps work out of shared view. One set of rules now covers office and home alike.",
                    outcome = Outcome.GOOD,
                    lesson = "Remote work needs one set of rules for both settings, with the posture travelling with the person."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Headphones alone, or calling home private, leaves documents visible, networks untrusted, and accounts mixed.",
                    outcome = Outcome.BAD,
                    lesson = "Home is not the office. Shared spaces and shared networks need the same discipline as public ones."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Working only when family is out is unworkable and collapses at the first busy week.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Rules must survive real life, not only ideal conditions."
                )
            ),
            briefKey = "team/team-remote"
        ),
        Scenario(
            id = "team-managers-drill",
            title = "The Manager Who Bypasses",
            intro = "A manager routinely bypasses security rules 'to get things done faster', and the team has noticed. When you raise it, the manager says rules are for the team, not for leadership.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What does the manager's behaviour teach the team?",
                    choices = listOf(
                        ScenarioChoice("That rules are optional for everyone", "step2"),
                        ScenarioChoice("That leadership is exempt", "bad1"),
                        ScenarioChoice("Nothing; teams ignore managers", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What changes the pattern?",
                    choices = listOf(
                        ScenarioChoice("The manager follows the rules visibly, explains them in terms of the team's work, and resources them", "good1"),
                        ScenarioChoice("Stricter enforcement on the team", "bad1"),
                        ScenarioChoice("A new policy document", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The manager models the posture, explains its why, and provides time and tools. The team follows, because the posture now makes sense and is visibly shared.",
                    outcome = Outcome.GOOD,
                    lesson = "The manager's behaviour is the policy the team actually learns. Model it, explain it, resource it."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Stricter enforcement while leadership bypasses rules teaches the team that rules are punishment, not protection — and they will be bypassed in secret.",
                    outcome = Outcome.BAD,
                    lesson = "Enforcement without modelling produces compliance theatre, not security."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "A new policy document, unread and unmodelled, changes nothing about what the team actually does.",
                    outcome = Outcome.BAD,
                    lesson = "Policies do not change behaviour. Modelled, explained, resourced behaviour does."
                )
            ),
            briefKey = "team/team-managers"
        ),
        Scenario(
            id = "team-mistake-drill",
            title = "The Colleague Who Clicked",
            intro = "A colleague clicks a phishing link and immediately tells you, frightened. You are the first person they told. How you respond will decide whether the next person reports or hides.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Contain the exposure, using the incident sequence", "step2"),
                        ScenarioChoice("Tell the colleague how careless they were", "bad1"),
                        ScenarioChoice("Keep it quiet to protect them", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "After containment, what do you say to the colleague?",
                    choices = listOf(
                        ScenarioChoice("Thank them for reporting early, and ask what in the design allowed the mistake", "good1"),
                        ScenarioChoice("Warn them never to do it again", "bad2"),
                        ScenarioChoice("Discuss it with the wider team as a cautionary tale", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The exposure is contained, the design flaw is fixed, and the colleague is thanked. The next person who clicks will report early too — because they saw what reporting earns.",
                    outcome = Outcome.GOOD,
                    lesson = "Contain, learn, support — in that order. Early reporting is a favour to the team; treat it as one."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Blame, or gossiping about the mistake to the wider team, teaches everyone to hide the next one until it becomes an incident.",
                    outcome = Outcome.BAD,
                    lesson = "Blame is a security failure: it drives mistakes underground."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Keeping it quiet protects the colleague but leaves the exposure uncontained and the design flaw unfixed.",
                    outcome = Outcome.BAD,
                    lesson = "Kindness without containment is not kindness to the team. Contain first, then support."
                )
            ),
            briefKey = "team/team-mistake"
        ),
        Scenario(
            id = "team-drills-drill",
            title = "The Annual Training Day",
            intro = "Your team has annual security training: a long presentation, once a year, which everyone forgets within a week. A recent incident shows the training changed nothing.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What replaces annual training?",
                    choices = listOf(
                        ScenarioChoice("More annual training, longer", "bad1"),
                        ScenarioChoice("Short, regular drills and reviews, one thing at a time, in real conditions", "step2"),
                        ScenarioChoice("No training; people learn from incidents", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "How do you keep drills honest?",
                    choices = listOf(
                        ScenarioChoice("Make them blame-free, and record what each one changed, with an owner", "good1"),
                        ScenarioChoice("Rank teams by drill scores", "bad1"),
                        ScenarioChoice("Run them only after incidents", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Short drills and scheduled reviews become habit. Each one changes something small, with an owner, and the team's posture improves visibly over months.",
                    outcome = Outcome.GOOD,
                    lesson = "Small, regular, and real beats large, annual, and theoretical. A habit is a schedule, not a sentiment."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Longer training, or ranking teams, produces performances: attendance without learning, and scores without change.",
                    outcome = Outcome.BAD,
                    lesson = "Training that is performed is not training that is learned. Drills must change behaviour, not produce scores."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Learning only from incidents means learning only after harm, and only about the incident that happened.",
                    outcome = Outcome.BAD,
                    lesson = "Incidents are expensive teachers. Drills teach the same lessons before the harm."
                )
            ),
            briefKey = "team/team-drills"
        )
    )
}
