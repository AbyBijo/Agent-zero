package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk drills, batch 6a: 36 drills, two more per brief, for CH-00 to CH-02. */
object ScenariosBulk6a {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "bulk-d172", title = "Practices Are Not Rules",
            intro = "A new learner insists every numbered practice in the programme is a Rule, and argues about Rule 7, Rule 12, and Rule 15.",
            start = "step1", briefKey = "orientation/rules",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you correct?",
                    choices = listOf(
                        ScenarioChoice("Nothing; more rules are safer", "bad1"),
                        ScenarioChoice("Rule 1 is the only Rule; the rest are practices, checklists, and cautions", "step2"),
                        ScenarioChoice("That rules do not matter", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why does the distinction matter?",
                    choices = listOf(
                        ScenarioChoice("For terminology only", "bad1"),
                        ScenarioChoice("Because practices are judged against Rule 1 and can change; rules are the standard itself", "good1"),
                        ScenarioChoice("Because it is shorter", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You explain the distinction, and the learner stops arguing about numbered rules that do not exist.",
                    outcome = Outcome.GOOD, lesson = "Rule 1 is the only Rule. Everything else is a practice judged against it."),
                "bad1" to ScenarioStep(id = "bad1", text = "You accept many rules, and the programme's standard dissolves into argument.",
                    outcome = Outcome.BAD, lesson = "Many rules blur the one standard that matters."),
                "bad2" to ScenarioStep(id = "bad2", text = "You dismiss practices entirely, losing the guidance that implements the Rule.",
                    outcome = Outcome.BAD, lesson = "Practices implement the Rule. Dismissing them leaves the Rule abstract.")
            )
        ),
        Scenario(
            id = "bulk-d173", title = "Rule Versus Convenience",
            intro = "Following Rule 1 is inconvenient today: a shortcut would save an hour, at the cost of exposing critical information.",
            start = "step1", briefKey = "orientation/rules",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Take the shortcut; it is only once", "bad1"),
                        ScenarioChoice("Follow Rule 1; 'only once' is how exceptions become habits", "step2"),
                        ScenarioChoice("Take the shortcut but feel guilty", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why not 'only once'?",
                    choices = listOf(
                        ScenarioChoice("Because guilt is bad", "bad1"),
                        ScenarioChoice("Because exceptions set precedents, and precedents become the real rule", "good1"),
                        ScenarioChoice("Because someone might notice", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You follow the Rule despite inconvenience, and the precedent stays intact.",
                    outcome = Outcome.GOOD, lesson = "'Only once' is how exceptions become habits. Precedents become the real rule."),
                "bad1" to ScenarioStep(id = "bad1", text = "You take the shortcut once, then again, until the shortcut is the routine.",
                    outcome = Outcome.BAD, lesson = "One exception is a precedent. Precedents compound."),
                "bad2" to ScenarioStep(id = "bad2", text = "You take the shortcut and feel guilty, which changes nothing about the exposure.",
                    outcome = Outcome.BAD, lesson = "Guilt is not a countermeasure. The exposure happened anyway.")
            )
        ),
        Scenario(
            id = "bulk-d174", title = "Bookmark Versus Position",
            intro = "You return to the programme. It offers your last position and your bookmarks. You confuse the two.",
            start = "step1", briefKey = "orientation/howto",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the difference?",
                    choices = listOf(
                        ScenarioChoice("None", "bad1"),
                        ScenarioChoice("Last position is automatic; bookmarks are deliberate marks you chose", "step2"),
                        ScenarioChoice("Bookmarks are automatic", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why keep both?",
                    choices = listOf(
                        ScenarioChoice("Redundancy", "bad1"),
                        ScenarioChoice("Because resuming and returning to chosen material are different needs", "good1"),
                        ScenarioChoice("Because the app does", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You use last position to resume and bookmarks to return to chosen briefs.",
                    outcome = Outcome.GOOD, lesson = "Bookmarks are deliberate; last position is automatic. Different needs, both kept."),
                "bad1" to ScenarioStep(id = "bad1", text = "You treat them as the same and lose track of both.",
                    outcome = Outcome.BAD, lesson = "Confusing resume with return loses both functions."),
                "bad2" to ScenarioStep(id = "bad2", text = "You assume bookmarks are automatic, and never mark anything deliberately.",
                    outcome = Outcome.BAD, lesson = "Deliberate marks require deliberate action. Automatic is not chosen.")
            )
        ),
        Scenario(
            id = "bulk-d175", title = "Certificate Needs a Name",
            intro = "You approach completion. The programme asks for your real name for the certificate, and you consider entering a nickname.",
            start = "step1", briefKey = "orientation/howto",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What does the certificate require?",
                    choices = listOf(
                        ScenarioChoice("Any name", "bad1"),
                        ScenarioChoice("A real name; placeholders are never fabricated", "step2"),
                        ScenarioChoice("No name", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why not a placeholder?",
                    choices = listOf(
                        ScenarioChoice("Because it looks bad", "bad1"),
                        ScenarioChoice("Because a completion record with a fabricated name is a false record", "good1"),
                        ScenarioChoice("Because it is policy", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You enter your real name, and the certificate is an honest record.",
                    outcome = Outcome.GOOD, lesson = "Certificates require real names. Fabricated names make false records."),
                "bad1" to ScenarioStep(id = "bad1", text = "You enter a nickname, and the certificate records a person who does not exist.",
                    outcome = Outcome.BAD, lesson = "A nickname on a completion record is a fabrication, not a preference."),
                "bad2" to ScenarioStep(id = "bad2", text = "You leave it blank, and the certificate cannot honestly be issued.",
                    outcome = Outcome.BAD, lesson = "A nameless certificate records nobody's completion.")
            )
        ),
        Scenario(
            id = "bulk-d176", title = "Week Two Slump",
            intro = "In week two, enthusiasm fades. The programme feels long, and skipping a week seems harmless.",
            start = "step1", briefKey = "orientation/first-week",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Skip a week; you will catch up", "bad1"),
                        ScenarioChoice("Shrink the daily habit to something small you will actually do, and continue", "step2"),
                        ScenarioChoice("Quit and restart later", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why shrink rather than skip?",
                    choices = listOf(
                        ScenarioChoice("Because small is better", "bad1"),
                        ScenarioChoice("Because continuity beats intensity: a small habit kept beats a large habit abandoned", "good1"),
                        ScenarioChoice("Because it is easier", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You shrink the habit, keep continuity, and week two passes without a break.",
                    outcome = Outcome.GOOD, lesson = "Continuity beats intensity. A small habit kept beats a large habit abandoned."),
                "bad1" to ScenarioStep(id = "bad1", text = "You skip a week, and catching up never happens.",
                    outcome = Outcome.BAD, lesson = "'Catch up later' is how programmes die quietly."),
                "bad2" to ScenarioStep(id = "bad2", text = "You quit to restart later, and later never comes.",
                    outcome = Outcome.BAD, lesson = "Restarting later is quitting with a nicer name.")
            )
        ),
        Scenario(
            id = "bulk-d177", title = "Notes You Actually Use",
            intro = "You take notes in every brief, but never read them again. They accumulate, unused.",
            start = "step1", briefKey = "orientation/first-week",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the problem?",
                    choices = listOf(
                        ScenarioChoice("Note-taking itself", "bad1"),
                        ScenarioChoice("Notes without review: written but never used", "step2"),
                        ScenarioChoice("Too many notes", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Stop taking notes", "bad1"),
                        ScenarioChoice("Review notes briefly and regularly, and turn the best into habits", "good1"),
                        ScenarioChoice("Take fewer notes", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You review notes regularly, and they become habits instead of archives.",
                    outcome = Outcome.GOOD, lesson = "Notes work only when reviewed. Unreviewed notes are archives, not learning."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame note-taking and stop, losing reflection entirely.",
                    outcome = Outcome.BAD, lesson = "Note-taking is not the problem; unreviewed notes are."),
                "bad2" to ScenarioStep(id = "bad2", text = "You take fewer notes, which are still never reviewed.",
                    outcome = Outcome.BAD, lesson = "Fewer unreviewed notes are still unreviewed.")
            )
        ),
        Scenario(
            id = "bulk-d178", title = "Doctrine in Daily Life",
            intro = "You wonder whether military doctrine has anything to do with your ordinary life: no secrets, no enemies, nothing to protect.",
            start = "step1", briefKey = "doctrine/origins",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you reconsider?",
                    choices = listOf(
                        ScenarioChoice("Nothing; doctrine is for soldiers", "bad1"),
                        ScenarioChoice("That observation and inference apply to anyone: your routines, contacts, and data are all observable", "step2"),
                        ScenarioChoice("That you have no enemies", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is observable about an ordinary life?",
                    choices = listOf(
                        ScenarioChoice("Nothing important", "bad1"),
                        ScenarioChoice("Routines, locations, contacts, finances, health — all of it, in aggregate", "good1"),
                        ScenarioChoice("Only social media", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You see that ordinary lives are fully observable, and doctrine applies.",
                    outcome = Outcome.GOOD, lesson = "Observation and inference apply to everyone. Ordinary lives are observable lives."),
                "bad1" to ScenarioStep(id = "bad1", text = "You dismiss doctrine as military, and leave an observable life unprotected.",
                    outcome = Outcome.BAD, lesson = "'Nothing to protect' is the most common reason for leaving everything exposed."),
                "bad2" to ScenarioStep(id = "bad2", text = "You focus on enemies, missing that observation needs no enmity — only opportunity.",
                    outcome = Outcome.BAD, lesson = "Observation needs opportunity, not enmity. Data brokers and scammers observe without hating you.")
            )
        ),
        Scenario(
            id = "bulk-d179", title = "Five Steps, Out of Order",
            intro = "You jump straight to countermeasures: buying tools and installing apps, before identifying critical information.",
            start = "step1", briefKey = "doctrine/origins",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is wrong?",
                    choices = listOf(
                        ScenarioChoice("Nothing; tools help", "bad1"),
                        ScenarioChoice("Step 5 without steps 1 to 4: controls with no risks to answer", "step2"),
                        ScenarioChoice("The tools are wrong", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Keep the tools", "bad1"),
                        ScenarioChoice("Return to step 1, then assess whether each tool answers a named risk", "good1"),
                        ScenarioChoice("Buy better tools", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You return to step 1 and keep only tools that answer named risks.",
                    outcome = Outcome.GOOD, lesson = "Countermeasures without prior steps are purchases, not protection. Order matters."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep tools that answer no named risk, and real risks stay unaddressed.",
                    outcome = Outcome.BAD, lesson = "Tools first means risks last — or never."),
                "bad2" to ScenarioStep(id = "bad2", text = "You buy better tools, still without risks to answer.",
                    outcome = Outcome.BAD, lesson = "Better tools without risks are still purchases, not protection.")
            )
        ),
        Scenario(
            id = "bulk-d180", title = "Critical, But Public",
            intro = "You exclude public information from your critical list, assuming only secrets matter.",
            start = "step1", briefKey = "doctrine/step1",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you miss?",
                    choices = listOf(
                        ScenarioChoice("Nothing; public is public", "bad1"),
                        ScenarioChoice("That public data in aggregate — routines, locations, contacts — can harm you", "step2"),
                        ScenarioChoice("Secrets", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What belongs on the list?",
                    choices = listOf(
                        ScenarioChoice("Only secrets", "bad1"),
                        ScenarioChoice("Anything an adversary could use to harm you, secret or public", "good1"),
                        ScenarioChoice("Everything public", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You add public-but-harmful items to the list, with proportionate controls.",
                    outcome = Outcome.GOOD, lesson = "Critical is defined by adversary use and harm, not by secrecy. Public data counts."),
                "bad1" to ScenarioStep(id = "bad1", text = "You protect only secrets, while public routines and locations expose you daily.",
                    outcome = Outcome.BAD, lesson = "Secrets-only protection ignores the public half of exposure."),
                "bad2" to ScenarioStep(id = "bad2", text = "You add everything public, and the list becomes unprotectable again.",
                    outcome = Outcome.BAD, lesson = "Prioritisation, not completeness, makes a list usable.")
            )
        ),
        Scenario(
            id = "bulk-d181", title = "List Never Reviewed",
            intro = "You made a critical information list a year ago and never reviewed it. Your life has changed completely since.",
            start = "step1", briefKey = "doctrine/step1",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is stale?",
                    choices = listOf(
                        ScenarioChoice("Nothing; lists are stable", "bad1"),
                        ScenarioChoice("The list: it describes a former life, not your current one", "step2"),
                        ScenarioChoice("Your memory", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Keep using it", "bad1"),
                        ScenarioChoice("Rebuild it for your current life, and schedule reviews on change", "good1"),
                        ScenarioChoice("Delete it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You rebuild the list for your current life and schedule reviews.",
                    outcome = Outcome.GOOD, lesson = "Critical lists decay as lives change. Rebuild on change, review regularly."),
                "bad1" to ScenarioStep(id = "bad1", text = "You protect a former life while your current life's critical items go unlisted.",
                    outcome = Outcome.BAD, lesson = "A stale list protects the past, not the present."),
                "bad2" to ScenarioStep(id = "bad2", text = "You delete the list, leaving no list at all.",
                    outcome = Outcome.BAD, lesson = "Rebuild, don't delete. No list is worse than a stale one.")
            )
        ),
        Scenario(
            id = "bulk-d182", title = "Threat From Inside",
            intro = "Your threat analysis covers only external attackers. A trusted insider with access never appears in it.",
            start = "step1", briefKey = "doctrine/step2",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is missing?",
                    choices = listOf(
                        ScenarioChoice("Nothing; insiders are trusted", "bad1"),
                        ScenarioChoice("Insider threats: trusted people with access, grievances, or carelessness", "step2"),
                        ScenarioChoice("External threats", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you handle insider risk without paranoia?",
                    choices = listOf(
                        ScenarioChoice("Distrust everyone", "bad1"),
                        ScenarioChoice("Least access, separation, and monitoring proportionate to the role", "good1"),
                        ScenarioChoice("Ignore it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You add insider risk with proportionate controls: least access and separation.",
                    outcome = Outcome.GOOD, lesson = "Threat analysis must include insiders. Least access handles them without paranoia."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust insiders categorically, and an insider incident blindsides you.",
                    outcome = Outcome.BAD, lesson = "Categorical trust is not threat analysis. Insiders are adversaries too, sometimes."),
                "bad2" to ScenarioStep(id = "bad2", text = "You distrust everyone, destroying the teamwork that insider controls should protect.",
                    outcome = Outcome.BAD, lesson = "Total distrust is not a control; it is the collapse of the team.")
            )
        ),
        Scenario(
            id = "bulk-d183", title = "Capability Without Intent",
            intro = "A nation-state could, in theory, target you. You have no reason to believe it wants to.",
            start = "step1", briefKey = "doctrine/step2",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "How do you rate this threat?",
                    choices = listOf(
                        ScenarioChoice("Maximum; capability is everything", "bad1"),
                        ScenarioChoice("Low for now: capability without intent, noted and monitored", "step2"),
                        ScenarioChoice("Zero; ignore it", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What does monitoring mean here?",
                    choices = listOf(
                        ScenarioChoice("Constant vigilance", "bad1"),
                        ScenarioChoice("Noting the capability, and revisiting if intent signals appear", "good1"),
                        ScenarioChoice("Nothing", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You note the capability, rate intent low, and revisit on signals.",
                    outcome = Outcome.GOOD, lesson = "Threat is capability plus intent. Note capable-but-uninterested actors; revisit on signals."),
                "bad1" to ScenarioStep(id = "bad1", text = "You build maximum defences against a disinterested nation-state, exhausting yourself.",
                    outcome = Outcome.BAD, lesson = "Maximum defence against unlikely threats starves likely ones."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ignore a capable actor entirely, with no trigger to revisit.",
                    outcome = Outcome.BAD, lesson = "Ignoring removes the trigger to revisit. Note and monitor instead.")
            )
        ),
        Scenario(
            id = "bulk-d184", title = "Vulnerability You Cannot See",
            intro = "You assess vulnerabilities you know about, but never ask what you might be missing.",
            start = "step1", briefKey = "doctrine/step3",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the blind spot?",
                    choices = listOf(
                        ScenarioChoice("None; you know your weaknesses", "bad1"),
                        ScenarioChoice("Unknown vulnerabilities: weaknesses you have not thought of", "step2"),
                        ScenarioChoice("Known vulnerabilities", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you find unknowns?",
                    choices = listOf(
                        ScenarioChoice("Think harder", "bad1"),
                        ScenarioChoice("Ask others, audit systematically, and test assumptions", "good1"),
                        ScenarioChoice("Assume there are none", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You audit systematically and invite outside eyes, finding vulnerabilities you missed.",
                    outcome = Outcome.GOOD, lesson = "Unknown vulnerabilities are found by audits, outside eyes, and testing — not by thinking harder alone."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust your own inventory, and unknown weaknesses stay unknown until exploited.",
                    outcome = Outcome.BAD, lesson = "Self-inventories miss self-blind-spots. Outside eyes are the remedy."),
                "bad2" to ScenarioStep(id = "bad2", text = "You assume no unknowns exist, which is the most dangerous assumption of all.",
                    outcome = Outcome.BAD, lesson = "'No unknowns' is itself an unknown. Assume unknowns exist.")
            )
        ),
        Scenario(
            id = "bulk-d185", title = "The Human Vulnerability",
            intro = "Your technical defences are strong, but you discuss sensitive work openly with friends, 'because they are not technical'.",
            start = "step1", briefKey = "doctrine/step3",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the vulnerability?",
                    choices = listOf(
                        ScenarioChoice("None; friends are not attackers", "bad1"),
                        ScenarioChoice("Human disclosure: sensitive talk to people outside the need-to-know circle", "step2"),
                        ScenarioChoice("Weak encryption", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Encrypt more", "bad1"),
                        ScenarioChoice("Keep sensitive talk within need-to-know, whatever the audience's technical level", "good1"),
                        ScenarioChoice("Stop talking to friends", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You bound sensitive talk by need-to-know, not by the audience's technical level.",
                    outcome = Outcome.GOOD, lesson = "Human disclosure is a vulnerability regardless of audience. Need-to-know bounds talk."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust friends categorically, and sensitive details spread through social networks.",
                    outcome = Outcome.BAD, lesson = "Friends are not adversaries, but they are channels. Disclosure spreads through them."),
                "bad2" to ScenarioStep(id = "bad2", text = "You encrypt more, which does nothing about spoken disclosure.",
                    outcome = Outcome.BAD, lesson = "Encryption does not cover conversation. Talk is the vulnerability here.")
            )
        ),
        Scenario(
            id = "bulk-d186", title = "Risk You Cannot Quantify",
            intro = "You cannot put numbers on a risk: no statistics, no probabilities, only judgement.",
            start = "step1", briefKey = "doctrine/step4",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Invent numbers", "bad1"),
                        ScenarioChoice("Assess qualitatively: high, medium, low likelihood and harm, with reasoning", "step2"),
                        ScenarioChoice("Skip the assessment", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why is qualitative assessment valid?",
                    choices = listOf(
                        ScenarioChoice("It is not", "bad1"),
                        ScenarioChoice("Because reasoned qualitative judgement prioritises action, while invented numbers mislead", "good1"),
                        ScenarioChoice("Because it is faster", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You assess qualitatively with reasoning, and prioritise honestly.",
                    outcome = Outcome.GOOD, lesson = "Qualitative assessment with reasoning beats invented numbers. Never fabricate statistics."),
                "bad1" to ScenarioStep(id = "bad1", text = "You invent precise numbers, and false precision drives bad priorities.",
                    outcome = Outcome.BAD, lesson = "Invented numbers are worse than honest judgement. False precision misleads."),
                "bad2" to ScenarioStep(id = "bad2", text = "You skip assessment, and prioritisation becomes guesswork.",
                    outcome = Outcome.BAD, lesson = "Skipped assessment is not humility; it is abdication of prioritisation.")
            )
        ),
        Scenario(
            id = "bulk-d187", title = "Risk Accepted, Noted",
            intro = "After assessment, you accept a risk: its harm is low, its countermeasure costs more than the risk warrants.",
            start = "step1", briefKey = "doctrine/step4",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What makes acceptance legitimate?",
                    choices = listOf(
                        ScenarioChoice("Ignoring the risk", "bad1"),
                        ScenarioChoice("A conscious decision, recorded, with a trigger to revisit", "step2"),
                        ScenarioChoice("Low harm alone", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you record?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("The risk, the reasoning, and the trigger that would reopen it", "good1"),
                        ScenarioChoice("The acceptance only", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You record the accepted risk with reasoning and a revisit trigger.",
                    outcome = Outcome.GOOD, lesson = "Accepted risks are recorded decisions with revisit triggers — not ignored risks."),
                "bad1" to ScenarioStep(id = "bad1", text = "You ignore the risk and call it acceptance.",
                    outcome = Outcome.BAD, lesson = "Ignoring is not accepting. Acceptance is a recorded decision."),
                "bad2" to ScenarioStep(id = "bad2", text = "You record acceptance without reasoning or trigger, so it is never revisited.",
                    outcome = Outcome.BAD, lesson = "Acceptance without a trigger is permanent by default. Record the trigger.")
            )
        ),
        Scenario(
            id = "bulk-d188", title = "Countermeasure That Creates Risk",
            intro = "A new security tool requires broad access to all your data, to 'protect' it.",
            start = "step1", briefKey = "doctrine/step5",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you assess?",
                    choices = listOf(
                        ScenarioChoice("Only its protection", "bad1"),
                        ScenarioChoice("Whether the tool's own access creates a new risk larger than the one it addresses", "step2"),
                        ScenarioChoice("Its price", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "The tool's access exceeds its benefit. What then?",
                    choices = listOf(
                        ScenarioChoice("Use it anyway", "bad1"),
                        ScenarioChoice("Decline it, or find a tool with proportionate access", "good1"),
                        ScenarioChoice("Limit its use", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You decline a tool whose access exceeds its benefit.",
                    outcome = Outcome.GOOD, lesson = "Countermeasures can create risks. Assess the tool's own access against its benefit."),
                "bad1" to ScenarioStep(id = "bad1", text = "You adopt a tool that broadens your exposure in the name of protection.",
                    outcome = Outcome.BAD, lesson = "A protector with broad access is a new vulnerability wearing a protector's badge."),
                "bad2" to ScenarioStep(id = "bad2", text = "You limit its use, but its broad access remains live whenever used.",
                    outcome = Outcome.BAD, lesson = "Limited use of broad access is still broad access.")
            )
        ),
        Scenario(
            id = "bulk-d189", title = "Two Controls, One Risk",
            intro = "Two controls address the same risk, each partially. Together they overlap, and you assume the risk is covered.",
            start = "step1", briefKey = "doctrine/step5",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you check?",
                    choices = listOf(
                        ScenarioChoice("That both exist", "bad1"),
                        ScenarioChoice("Whether together they actually cover the risk, or leave a gap between them", "step2"),
                        ScenarioChoice("Their cost", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "A gap remains between them. What then?",
                    choices = listOf(
                        ScenarioChoice("Accept it; two controls are enough", "bad1"),
                        ScenarioChoice("Close the gap with a third control, or redesign the two", "good1"),
                        ScenarioChoice("Add a fourth control", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You check coverage, find the gap, and close it deliberately.",
                    outcome = Outcome.GOOD, lesson = "Overlapping controls can still leave gaps. Check coverage, not count."),
                "bad1" to ScenarioStep(id = "bad1", text = "You count controls and assume coverage, while a gap stays open.",
                    outcome = Outcome.BAD, lesson = "Control count is not coverage. Gaps hide between overlapping controls."),
                "bad2" to ScenarioStep(id = "bad2", text = "You add controls blindly, increasing complexity without checking the gap.",
                    outcome = Outcome.BAD, lesson = "More controls without coverage analysis add complexity, not protection.")
            )
        ),
        Scenario(
            id = "bulk-d190", title = "Ten Minutes, Skipped Steps",
            intro = "In a hurry, you run a 'ten-minute model' that covers only countermeasures, skipping the first four steps.",
            start = "step1", briefKey = "doctrine/threat-model-ten",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is this?",
                    choices = listOf(
                        ScenarioChoice("A fast model", "bad1"),
                        ScenarioChoice("Not a model at all: countermeasures without critical information, threat, vulnerability, or risk", "step2"),
                        ScenarioChoice("Efficiency", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What does a real ten-minute model include?",
                    choices = listOf(
                        ScenarioChoice("Only countermeasures", "bad1"),
                        ScenarioChoice("All five steps, compressed — none skipped", "good1"),
                        ScenarioChoice("Only the adversary", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You compress all five steps and make a grounded decision in ten minutes.",
                    outcome = Outcome.GOOD, lesson = "A ten-minute model compresses every step. Skipping steps is not compressing."),
                "bad1" to ScenarioStep(id = "bad1", text = "You call countermeasures alone a model, and act without knowing what you protect.",
                    outcome = Outcome.BAD, lesson = "Countermeasures without prior steps are guesses with tools."),
                "bad2" to ScenarioStep(id = "bad2", text = "You call skipping efficiency, and efficiency becomes the excuse for every skipped step.",
                    outcome = Outcome.BAD, lesson = "Efficiency that skips steps is not efficiency; it is abdication.")
            )
        ),
        Scenario(
            id = "bulk-d191", title = "Ten Minutes, Honest Limits",
            intro = "Your ten-minute model reveals uncertainty you cannot resolve in ten minutes. The decision is consequential.",
            start = "step1", briefKey = "doctrine/threat-model-ten",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Decide anyway", "bad1"),
                        ScenarioChoice("Acknowledge the limit, defer the consequential decision, and do the full model", "step2"),
                        ScenarioChoice("Guess", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why defer?",
                    choices = listOf(
                        ScenarioChoice("Because you are slow", "bad1"),
                        ScenarioChoice("Because consequential decisions on unresolved uncertainty are gambles, not models", "good1"),
                        ScenarioChoice("Because it is procedure", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You defer, do the full model, and decide on resolved uncertainty.",
                    outcome = Outcome.GOOD, lesson = "Short models have honest limits. Consequential decisions deserve full models when uncertainty remains."),
                "bad1" to ScenarioStep(id = "bad1", text = "You decide on unresolved uncertainty, and a consequential gamble goes wrong.",
                    outcome = Outcome.BAD, lesson = "Deciding consequentially on unresolved uncertainty is gambling, not modelling."),
                "bad2" to ScenarioStep(id = "bad2", text = "You guess, which is deciding without even the short model's discipline.",
                    outcome = Outcome.BAD, lesson = "Guessing discards even the compressed model. Defer instead.")
            )
        ),
        Scenario(
            id = "bulk-d192", title = "Passphrase on Paper",
            intro = "You write your master passphrase on paper and keep it in your desk, 'in case you forget'.",
            start = "step1", briefKey = "digital/passwords",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the trade?",
                    choices = listOf(
                        ScenarioChoice("None; paper is safe", "bad1"),
                        ScenarioChoice("Recovery against physical exposure: anyone with desk access gains your vault", "step2"),
                        ScenarioChoice("Convenience", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is a better recovery plan?",
                    choices = listOf(
                        ScenarioChoice("No recovery", "bad1"),
                        ScenarioChoice("A secure, controlled backup: a trusted person, a safe, or a split secret — not an open desk", "good1"),
                        ScenarioChoice("A photo of the paper", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You move recovery to a controlled store, keeping both recovery and security.",
                    outcome = Outcome.GOOD, lesson = "Recovery plans must be controlled, not convenient. An open desk is not a vault."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep the passphrase in an open desk, and anyone with desk access owns your vault.",
                    outcome = Outcome.BAD, lesson = "Paper in an open desk is a vault key left in the lock."),
                "bad2" to ScenarioStep(id = "bad2", text = "You photograph the paper, spreading the passphrase to cloud backups and galleries.",
                    outcome = Outcome.BAD, lesson = "Photographing a secret multiplies its copies across cloud and gallery.")
            )
        ),
        Scenario(
            id = "bulk-d193", title = "Password Manager Breach",
            intro = "News breaks: your password manager provider was breached. You panic about all your passwords.",
            start = "step1", briefKey = "digital/passwords",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What determines your exposure?",
                    choices = listOf(
                        ScenarioChoice("The headlines", "bad1"),
                        ScenarioChoice("Whether your vault data was encrypted with a key the provider does not hold", "step2"),
                        ScenarioChoice("Your master password's length", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Change all passwords in panic", "bad1"),
                        ScenarioChoice("Assess what was actually exposed, change what is at risk starting with the most critical, and strengthen the master password", "good1"),
                        ScenarioChoice("Abandon the manager", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You assess actual exposure and act by priority, starting with critical accounts.",
                    outcome = Outcome.GOOD, lesson = "Provider breaches vary by what was exposed. Assess, prioritise, act — panic helps no one."),
                "bad1" to ScenarioStep(id = "bad1", text = "You panic-change everything at once, making errors and locking yourself out.",
                    outcome = Outcome.BAD, lesson = "Panic changes create new problems. Assessed, prioritised changes do not."),
                "bad2" to ScenarioStep(id = "bad2", text = "You abandon the manager for reused passwords, which is strictly worse.",
                    outcome = Outcome.BAD, lesson = "Abandoning a manager for reuse trades a assessed risk for a certain one.")
            )
        ),
        Scenario(
            id = "bulk-d194", title = "Second Factor, Lost Phone",
            intro = "Your phone — your authenticator app — is lost. Your accounts need second factors you no longer have.",
            start = "step1", briefKey = "digital/twofactor",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What should you have prepared?",
                    choices = listOf(
                        ScenarioChoice("Nothing; phones are rarely lost", "bad1"),
                        ScenarioChoice("Backup codes or a second registered device, stored securely", "step2"),
                        ScenarioChoice("SMS fallback everywhere", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Now that it is lost, what do you do?",
                    choices = listOf(
                        ScenarioChoice("Create new accounts", "bad1"),
                        ScenarioChoice("Use backup codes or account recovery, starting with the most critical accounts", "good1"),
                        ScenarioChoice("Disable two-factor everywhere", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You recover via backup codes, starting with critical accounts, and re-register a new device.",
                    outcome = Outcome.GOOD, lesson = "Second factors need backups: codes or a second device, stored securely, before loss."),
                "bad1" to ScenarioStep(id = "bad1", text = "You have no backups, and account recovery becomes a long, uncertain process.",
                    outcome = Outcome.BAD, lesson = "A second factor without a backup is a lockout waiting for a lost phone."),
                "bad2" to ScenarioStep(id = "bad2", text = "You disable two-factor everywhere to recover, leaving accounts weaker than before.",
                    outcome = Outcome.BAD, lesson = "Disabling two-factor to recover trades a temporary problem for permanent weakness.")
            )
        ),
        Scenario(
            id = "bulk-d195", title = "Authenticator App, Shared Secret",
            intro = "You set up an authenticator app by scanning a QR code, and screenshot the QR 'for backup'.",
            start = "step1", briefKey = "digital/twofactor",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did the screenshot capture?",
                    choices = listOf(
                        ScenarioChoice("Nothing important", "bad1"),
                        ScenarioChoice("The shared secret: anyone with it can generate your codes", "step2"),
                        ScenarioChoice("The app's logo", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is a safe backup?",
                    choices = listOf(
                        ScenarioChoice("A screenshot in your gallery", "bad1"),
                        ScenarioChoice("Backup codes or a second device, stored securely and separately", "good1"),
                        ScenarioChoice("Emailing the QR to yourself", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You delete the screenshot and use proper backup codes stored securely.",
                    outcome = Outcome.GOOD, lesson = "A QR screenshot is the shared secret itself. Anyone with it generates your codes."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep the QR screenshot in your gallery, synced to the cloud, readable by anyone with gallery access.",
                    outcome = Outcome.BAD, lesson = "Gallery screenshots sync to clouds. A secret in a gallery is a published secret."),
                "bad2" to ScenarioStep(id = "bad2", text = "You email the QR to yourself, spreading the secret across mail systems.",
                    outcome = Outcome.BAD, lesson = "Emailing a secret multiplies its copies across mail infrastructure.")
            )
        ),
        Scenario(
            id = "bulk-d196", title = "Encrypted Drive, Lost Key",
            intro = "Your encrypted drive's key is lost. The data is intact, encrypted, and unrecoverable.",
            start = "step1", briefKey = "digital/encryption",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What does this prove?",
                    choices = listOf(
                        ScenarioChoice("Encryption is bad", "bad1"),
                        ScenarioChoice("Encryption without key management is data loss waiting to happen", "step2"),
                        ScenarioChoice("Drives fail", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What should key management include?",
                    choices = listOf(
                        ScenarioChoice("Memorising the key", "bad1"),
                        ScenarioChoice("A secure, controlled backup of the key, separate from the drive", "good1"),
                        ScenarioChoice("Writing it on the drive", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You adopt key backups separate from the drive, so encryption protects without guaranteeing loss.",
                    outcome = Outcome.GOOD, lesson = "Encryption needs key management: a secure key backup, separate from the data."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame encryption, and abandon it for unencrypted storage.",
                    outcome = Outcome.BAD, lesson = "Abandoning encryption over key loss trades data loss for data exposure."),
                "bad2" to ScenarioStep(id = "bad2", text = "You write the key on the drive, defeating the encryption entirely.",
                    outcome = Outcome.BAD, lesson = "A key stored with the data is no key at all.")
            )
        ),
        Scenario(
            id = "bulk-d197", title = "End-to-End, But Backed Up Plain",
            intro = "Your messages are end-to-end encrypted, but your cloud backup stores them in plain text.",
            start = "step1", briefKey = "digital/encryption",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "Where is the hole?",
                    choices = listOf(
                        ScenarioChoice("The messenger", "bad1"),
                        ScenarioChoice("The backup: plain-text copies defeat end-to-end encryption", "step2"),
                        ScenarioChoice("The phone", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("A different messenger", "bad1"),
                        ScenarioChoice("End-to-end encrypted backups, or no message backups, with the key protected", "good1"),
                        ScenarioChoice("Disable backups", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You switch to end-to-end encrypted backups and protect the key.",
                    outcome = Outcome.GOOD, lesson = "Plain-text backups defeat end-to-end encryption. Backups must be encrypted too."),
                "bad1" to ScenarioStep(id = "bad1", text = "You switch messengers, but the plain backup remains.",
                    outcome = Outcome.BAD, lesson = "The messenger was not the hole. The backup was."),
                "bad2" to ScenarioStep(id = "bad2", text = "You disable all backups, losing message history and device recovery.",
                    outcome = Outcome.BAD, lesson = "Disabling backups trades a privacy hole for a recovery hole. Encrypt backups instead.")
            )
        ),
        Scenario(
            id = "bulk-d198", title = "Disappearing Messages, Screenshots",
            intro = "You rely on disappearing messages for sensitive talk. The other party screenshots everything.",
            start = "step1", briefKey = "digital/comms",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What failed?",
                    choices = listOf(
                        ScenarioChoice("The app", "bad1"),
                        ScenarioChoice("The assumption: disappearing messages control the other party, which they do not", "step2"),
                        ScenarioChoice("The timer", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do disappearing messages actually do?",
                    choices = listOf(
                        ScenarioChoice("Prevent screenshots", "bad1"),
                        ScenarioChoice("Reduce your own stored history, nothing more", "good1"),
                        ScenarioChoice("Guarantee deletion everywhere", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You treat disappearing messages as history reduction, not as control over others.",
                    outcome = Outcome.GOOD, lesson = "Disappearing messages reduce your history. They do not control the other party's screenshots."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame the app for screenshots it cannot prevent.",
                    outcome = Outcome.BAD, lesson = "No app prevents another device's camera. Disappearing is not disappearing everywhere."),
                "bad2" to ScenarioStep(id = "bad2", text = "You shorten the timer, which changes nothing about screenshots.",
                    outcome = Outcome.BAD, lesson = "Shorter timers do not stop screenshots. They only shorten your own history.")
            )
        ),
        Scenario(
            id = "bulk-d199", title = "Wrong Group, Right Message",
            intro = "You send a sensitive message to the wrong group chat. It is read instantly.",
            start = "step1", briefKey = "digital/comms",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Delete it and hope", "bad1"),
                        ScenarioChoice("Delete it, and immediately assess who saw it and what must be mitigated", "step2"),
                        ScenarioChoice("Send a correction", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why is deletion not enough?",
                    choices = listOf(
                        ScenarioChoice("It is enough", "bad1"),
                        ScenarioChoice("Because recipients may have read, screenshotted, or forwarded it before deletion", "good1"),
                        ScenarioChoice("Because deletion is slow", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You delete, assess exposure, and mitigate: warn, change, contain.",
                    outcome = Outcome.GOOD, lesson = "Deletion does not un-read a message. Assess who saw it and mitigate."),
                "bad1" to ScenarioStep(id = "bad1", text = "You delete and hope, while readers forward what you hoped was gone.",
                    outcome = Outcome.BAD, lesson = "Hope is not mitigation. Deletion without assessment leaves exposure unknown."),
                "bad2" to ScenarioStep(id = "bad2", text = "You send a correction, drawing more attention to the original message.",
                    outcome = Outcome.BAD, lesson = "Corrections amplify. Assess first, then act quietly and deliberately.")
            )
        ),
        Scenario(
            id = "bulk-d200", title = "Update, Postponed",
            intro = "A critical security update is available. You postpone it for a week because you are busy.",
            start = "step1", briefKey = "digital/devices",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What happens during the week?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Attackers exploit the known, public flaw the update patches", "step2"),
                        ScenarioChoice("The device slows down", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is the rule for security updates?",
                    choices = listOf(
                        ScenarioChoice("Install when convenient", "bad1"),
                        ScenarioChoice("Install promptly; known flaws are exploited fastest", "good1"),
                        ScenarioChoice("Wait for reviews", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You install promptly, closing a known, public flaw before exploitation.",
                    outcome = Outcome.GOOD, lesson = "Known flaws are exploited fastest. Security updates are prompt, not convenient."),
                "bad1" to ScenarioStep(id = "bad1", text = "You postpone a week, and a public flaw is exploited in the interval.",
                    outcome = Outcome.BAD, lesson = "Postponed updates are open windows. Public flaws are public targets."),
                "bad2" to ScenarioStep(id = "bad2", text = "You wait for reviews, while exploitation needs no reviews.",
                    outcome = Outcome.BAD, lesson = "Review-waiting is postponement with a nicer name. Exploiters do not wait.")
            )
        ),
        Scenario(
            id = "bulk-d201", title = "Permission Creep",
            intro = "An app you installed for one purpose gradually gains permissions: location, contacts, microphone, files.",
            start = "step1", briefKey = "digital/devices",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is permission creep?",
                    choices = listOf(
                        ScenarioChoice("Normal app growth", "bad1"),
                        ScenarioChoice("Permissions accumulating beyond what the app's purpose requires", "step2"),
                        ScenarioChoice("A bug", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Accept all; apps need permissions", "bad1"),
                        ScenarioChoice("Review permissions against purpose, revoke what is unnecessary, and remove apps that demand excess", "good1"),
                        ScenarioChoice("Ignore it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You review and revoke, keeping permissions tied to purpose.",
                    outcome = Outcome.GOOD, lesson = "Permissions must match purpose. Review them, revoke excess, remove demanding apps."),
                "bad1" to ScenarioStep(id = "bad1", text = "You accept all permissions, and one app holds your location, contacts, and microphone.",
                    outcome = Outcome.BAD, lesson = "Accept-all is how one app becomes a surveillance device."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ignore creep, and permissions accumulate silently for years.",
                    outcome = Outcome.BAD, lesson = "Creep is silent. Only reviews catch it.")
            )
        ),
        Scenario(
            id = "bulk-d202", title = "Evil Twin Network",
            intro = "You join 'Cafe_WiFi_Free' — but the real café network is 'Cafe_WiFi'. Yours is an attacker's twin.",
            start = "step1", briefKey = "digital/network",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is an evil twin?",
                    choices = listOf(
                        ScenarioChoice("A second café", "bad1"),
                        ScenarioChoice("A fake network impersonating a legitimate one, to intercept traffic", "step2"),
                        ScenarioChoice("A slow network", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you avoid twins?",
                    choices = listOf(
                        ScenarioChoice("Join the strongest signal", "bad1"),
                        ScenarioChoice("Confirm the exact network name with staff, and use encrypted connections plus a VPN", "good1"),
                        ScenarioChoice("Join any open network", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You confirm network names with staff and encrypt everything, defeating the twin.",
                    outcome = Outcome.GOOD, lesson = "Evil twins impersonate legitimate networks. Confirm names with staff; encrypt everything."),
                "bad1" to ScenarioStep(id = "bad1", text = "You join the strongest signal, which is the attacker's twin placed nearby.",
                    outcome = Outcome.BAD, lesson = "Strongest signal is often the attacker's. Signal strength is not legitimacy."),
                "bad2" to ScenarioStep(id = "bad2", text = "You join any open network, and twins welcome you.",
                    outcome = Outcome.BAD, lesson = "Open networks are twins' habitat. Verify before joining.")
            )
        ),
        Scenario(
            id = "bulk-d203", title = "Auto-Join, Auto-Exposed",
            intro = "Your phone auto-joins a network it remembers — but the network is an attacker's copy of one you once used.",
            start = "step1", briefKey = "digital/network",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the flaw?",
                    choices = listOf(
                        ScenarioChoice("The phone's memory", "bad1"),
                        ScenarioChoice("Auto-join trusts network names, which attackers can copy", "step2"),
                        ScenarioChoice("Wi-Fi itself", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Disable auto-join for untrusted networks, and forget networks you no longer use", "good1"),
                        ScenarioChoice("Use cellular only", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You disable auto-join and forget old networks, closing the twin's door.",
                    outcome = Outcome.GOOD, lesson = "Auto-join trusts names, and names are copyable. Disable it for untrusted networks."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep auto-join, and your phone joins attacker copies wherever you go.",
                    outcome = Outcome.BAD, lesson = "Auto-join is auto-exposure to any network with a familiar name."),
                "bad2" to ScenarioStep(id = "bad2", text = "You switch to cellular only, which is impractical and unnecessary when auto-join is controlled.",
                    outcome = Outcome.BAD, lesson = "Cellular-only is avoidance, not control. Control auto-join instead.")
            )
        ),
        Scenario(
            id = "bulk-d204", title = "Attachment From a Friend",
            intro = "A friend's account sends you an attachment. The friend did not send it — their account was compromised.",
            start = "step1", briefKey = "digital/email",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you trust?",
                    choices = listOf(
                        ScenarioChoice("The friend's name", "bad1"),
                        ScenarioChoice("Nothing yet; compromised accounts send malware under trusted names", "step2"),
                        ScenarioChoice("The attachment type", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you verify?",
                    choices = listOf(
                        ScenarioChoice("Open it carefully", "bad1"),
                        ScenarioChoice("Contact the friend through a separate channel and ask if they sent it", "good1"),
                        ScenarioChoice("Reply to the email", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You verify separately, learn the account was compromised, and avoid the malware.",
                    outcome = Outcome.GOOD, lesson = "Compromised accounts send malware under trusted names. Verify through a separate channel."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust a friend's name and open malware.",
                    outcome = Outcome.BAD, lesson = "A trusted name on a compromised account is an attacker's best disguise."),
                "bad2" to ScenarioStep(id = "bad2", text = "You open it carefully, which is not a protection against malware.",
                    outcome = Outcome.BAD, lesson = "There is no careful way to open malware. Verify first.")
            )
        ),
        Scenario(
            id = "bulk-d205", title = "Newsletter That Tracks",
            intro = "A newsletter you read tracks opens, clicks, and location through hidden pixels and links.",
            start = "step1", briefKey = "digital/email",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is tracked?",
                    choices = listOf(
                        ScenarioChoice("Nothing; email is private", "bad1"),
                        ScenarioChoice("Opens, clicks, location, and device details, via pixels and tracked links", "step2"),
                        ScenarioChoice("Only subscriptions", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What reduces it?",
                    choices = listOf(
                        ScenarioChoice("Unsubscribing from everything", "bad1"),
                        ScenarioChoice("Blocking remote images, using plain-text or privacy-protecting mail settings, and not clicking tracked links", "good1"),
                        ScenarioChoice("Reading faster", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You block remote images and tracked links, shrinking email surveillance.",
                    outcome = Outcome.GOOD, lesson = "Email tracks opens, clicks, and location via pixels and links. Block images and tracked links."),
                "bad1" to ScenarioStep(id = "bad1", text = "You assume email is private, while every open and click is logged.",
                    outcome = Outcome.BAD, lesson = "Email is a tracking medium by default. Privacy needs settings, not assumptions."),
                "bad2" to ScenarioStep(id = "bad2", text = "You read faster, which changes nothing about tracking.",
                    outcome = Outcome.BAD, lesson = "Speed does not defeat pixels. Blocking does.")
            )
        ),
        Scenario(
            id = "bulk-d206", title = "Backup, But One Copy",
            intro = "You back up diligently — to a single drive, kept next to the computer it backs up.",
            start = "step1", briefKey = "digital/backups-restore",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What single event destroys both?",
                    choices = listOf(
                        ScenarioChoice("Nothing; backups are separate", "bad1"),
                        ScenarioChoice("Fire, theft, or flood affecting the room: original and backup together", "step2"),
                        ScenarioChoice("A virus", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is the fix?",
                    choices = listOf(
                        ScenarioChoice("A bigger drive", "bad1"),
                        ScenarioChoice("3-2-1: three copies, two media, one offsite", "good1"),
                        ScenarioChoice("Two drives in the same room", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You adopt 3-2-1, so no single room's disaster takes your data.",
                    outcome = Outcome.GOOD, lesson = "3-2-1: three copies, two media, one offsite. A backup beside its original is half a backup."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep one backup beside its original, and one fire takes both.",
                    outcome = Outcome.BAD, lesson = "Proximity defeats backup purpose. Offsite is the point."),
                "bad2" to ScenarioStep(id = "bad2", text = "You add a second drive in the same room, which the same fire also takes.",
                    outcome = Outcome.BAD, lesson = "Two copies in one room are one disaster away from zero copies.")
            )
        ),
        Scenario(
            id = "bulk-d207", title = "Restore Test, Failed",
            intro = "Testing a restore, you discover the backup software has been silently failing for months.",
            start = "step1", briefKey = "digital/backups-restore",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What saved you?",
                    choices = listOf(
                        ScenarioChoice("Luck", "bad1"),
                        ScenarioChoice("The restore test itself: it found the failure before a real disaster did", "step2"),
                        ScenarioChoice("The software", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Trust the software again", "bad1"),
                        ScenarioChoice("Scheduled restore tests and backup monitoring, so silent failure is caught", "good1"),
                        ScenarioChoice("A new software", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You schedule restore tests and monitoring, so silent failure is caught early.",
                    outcome = Outcome.GOOD, lesson = "Backup software fails silently. Scheduled restore tests and monitoring catch it."),
                "bad1" to ScenarioStep(id = "bad1", text = "You credit luck, and keep trusting untested backups.",
                    outcome = Outcome.BAD, lesson = "Luck is not a backup strategy. Testing is."),
                "bad2" to ScenarioStep(id = "bad2", text = "You switch software without adding tests, and the new software can fail silently too.",
                    outcome = Outcome.BAD, lesson = "New software without tests repeats the silent failure.")
            )
        )
    )
}
