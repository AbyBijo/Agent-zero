package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk drills, batch 1: 36 drills, two per brief, for CH-00 to CH-02. */
object ScenariosBulk1 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "bulk-d001", title = "Only One Rule",
            intro = "A friend asks why your programme has only one rule. You start to list five more rules you remember from elsewhere.",
            start = "step1", briefKey = "orientation/rules",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you say?",
                    choices = listOf(
                        ScenarioChoice("There are many rules; Rule 1 is just the first", "bad1"),
                        ScenarioChoice("Rule 1 is the only Rule; the rest are practices, checklists, and cautions", "step2"),
                        ScenarioChoice("Rules do not matter; tools matter", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Your friend asks why that matters. What do you say?",
                    choices = listOf(
                        ScenarioChoice("Because fewer rules are easier to memorise", "bad1"),
                        ScenarioChoice("Because one rule keeps the standard clear: protect critical information, and judge every practice against it", "good1"),
                        ScenarioChoice("Because the programme is new", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You explain that one rule keeps the standard clear, and every practice is judged against it.",
                    outcome = Outcome.GOOD, lesson = "One rule, judged against everything else, keeps a programme honest and simple."),
                "bad1" to ScenarioStep(id = "bad1", text = "You multiply rules until the standard blurs and nobody remembers what matters most.",
                    outcome = Outcome.BAD, lesson = "Many rules blur the standard. One rule keeps it clear."),
                "bad2" to ScenarioStep(id = "bad2", text = "You dismiss rules entirely, and your friend leaves with no standard at all.",
                    outcome = Outcome.BAD, lesson = "Tools without a standard are just purchases. Rule 1 is the standard.")
            )
        ),
        Scenario(
            id = "bulk-d002", title = "Danger First",
            intro = "During a discussion of Rule 1, someone says: 'If I am in danger, should I still protect information first?'",
            start = "step1", briefKey = "orientation/rules",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you answer?",
                    choices = listOf(
                        ScenarioChoice("Yes, always protect information first", "bad1"),
                        ScenarioChoice("Get real-world help first; Rule 1 never means do not report", "step2"),
                        ScenarioChoice("Wait until the danger passes, then decide", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "They ask why. What do you say?",
                    choices = listOf(
                        ScenarioChoice("Because reporting is a legal duty", "bad1"),
                        ScenarioChoice("Because information protection serves safety, not the reverse; a rule that endangers people is a bad rule", "good1"),
                        ScenarioChoice("Because danger is rare", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You explain that protection serves safety, and help comes first.",
                    outcome = Outcome.GOOD, lesson = "Rule 1 never means do not report. Safety comes first."),
                "bad1" to ScenarioStep(id = "bad1", text = "You put information above a person in danger, and the rule fails its own purpose.",
                    outcome = Outcome.BAD, lesson = "A rule that endangers people to protect information has its priorities backwards."),
                "bad2" to ScenarioStep(id = "bad2", text = "You delay help while danger continues.",
                    outcome = Outcome.BAD, lesson = "Delay in danger is itself harm. Act first, then protect.")
            )
        ),
        Scenario(
            id = "bulk-d003", title = "Locked Door",
            intro = "You open the programme and see a locked brief. Its title and time are visible, but the body is hidden. You want to skip ahead.",
            start = "step1", briefKey = "orientation/howto",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Skip ahead by any means available", "bad1"),
                        ScenarioChoice("Complete the current brief, which unlocks the next", "step2"),
                        ScenarioChoice("Read only the outcomes and move on", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why does sequential unlocking help?",
                    choices = listOf(
                        ScenarioChoice("It slows you down", "bad1"),
                        ScenarioChoice("It ensures foundations come before advanced material, so later briefs make sense", "good1"),
                        ScenarioChoice("It is a game mechanic", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You complete the brief in order, and the next unlocks with its foundations in place.",
                    outcome = Outcome.GOOD, lesson = "Sequential locking ensures foundations before advanced material."),
                "bad1" to ScenarioStep(id = "bad1", text = "You skip ahead and find advanced material you cannot use, because its foundations are missing.",
                    outcome = Outcome.BAD, lesson = "Skipping foundations makes advanced material useless."),
                "bad2" to ScenarioStep(id = "bad2", text = "You read outcomes without the body and mistake a summary for understanding.",
                    outcome = Outcome.BAD, lesson = "Outcomes tell you what a brief covers, not what it teaches.")
            )
        ),
        Scenario(
            id = "bulk-d004", title = "Notes Stay Local",
            intro = "You write a personal note in a brief about a sensitive situation. A friend asks whether it will be shared with your certificate.",
            start = "step1", briefKey = "orientation/howto",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you tell them?",
                    choices = listOf(
                        ScenarioChoice("Yes, everything is shared", "bad1"),
                        ScenarioChoice("No: notes are local only and excluded from any share payload", "step2"),
                        ScenarioChoice("Only if you export them", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why does that matter?",
                    choices = listOf(
                        ScenarioChoice("Because notes are unimportant", "bad1"),
                        ScenarioChoice("Because honest notes require privacy; if notes were shared, people would stop writing honestly", "good1"),
                        ScenarioChoice("Because storage is limited", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You explain that local-only notes make honest reflection safe.",
                    outcome = Outcome.GOOD, lesson = "Notes stay local and out of shares, so reflection stays honest."),
                "bad1" to ScenarioStep(id = "bad1", text = "You wrongly claim notes are shared, and your friend stops writing notes.",
                    outcome = Outcome.BAD, lesson = "Misunderstanding privacy destroys the habit that privacy protects."),
                "bad2" to ScenarioStep(id = "bad2", text = "You hedge, and your friend is left unsure whether to trust the programme.",
                    outcome = Outcome.BAD, lesson = "Uncertainty about privacy is nearly as damaging as no privacy.")
            )
        ),
        Scenario(
            id = "bulk-d005", title = "First Week Pace",
            intro = "It is your first week. You are tempted to read all 16 chapters at once to 'get it over with'.",
            start = "step1", briefKey = "orientation/first-week",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Read everything at once", "bad1"),
                        ScenarioChoice("One brief at a time, in order, with notes", "step2"),
                        ScenarioChoice("Read only the chapter summaries", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why is the slower pace better?",
                    choices = listOf(
                        ScenarioChoice("It is not; speed is better", "bad1"),
                        ScenarioChoice("Because a posture is built by habits, not by reading; one brief at a time builds habits", "good1"),
                        ScenarioChoice("Because the programme forces it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You pace yourself, take notes, and finish the week with habits, not just pages read.",
                    outcome = Outcome.GOOD, lesson = "A posture is built by habits, not by reading speed."),
                "bad1" to ScenarioStep(id = "bad1", text = "You binge-read, remember little, and change nothing.",
                    outcome = Outcome.BAD, lesson = "Binge-reading produces familiarity, not capability."),
                "bad2" to ScenarioStep(id = "bad2", text = "You skim summaries and mistake outlines for understanding.",
                    outcome = Outcome.BAD, lesson = "Summaries outline; briefs teach. Skimming is not learning.")
            )
        ),
        Scenario(
            id = "bulk-d006", title = "A Missed Day",
            intro = "You miss a day in your first week. The programme records it without judgement. You feel like giving up.",
            start = "step1", briefKey = "orientation/first-week",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Give up; the streak is broken", "bad1"),
                        ScenarioChoice("Record it without judgement and continue the next day", "step2"),
                        ScenarioChoice("Backdate the missed day", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why continue after a lapse?",
                    choices = listOf(
                        ScenarioChoice("Because the record demands it", "bad1"),
                        ScenarioChoice("Because one lapse is not failure; only quitting is", "good1"),
                        ScenarioChoice("Because others will notice", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You continue the next day, and the lapse becomes a footnote, not an ending.",
                    outcome = Outcome.GOOD, lesson = "Missed days are recorded without judgement. Only quitting is failure."),
                "bad1" to ScenarioStep(id = "bad1", text = "You quit over one missed day, losing a posture for the sake of a record.",
                    outcome = Outcome.BAD, lesson = "Quitting over a lapse trades a posture for a streak."),
                "bad2" to ScenarioStep(id = "bad2", text = "You falsify the record, and now your own record lies to you.",
                    outcome = Outcome.BAD, lesson = "A falsified record cannot guide you. Honesty, even about lapses, is the point.")
            )
        ),
        Scenario(
            id = "bulk-d007", title = "Purple Dragon",
            intro = "A colleague asks where OPSEC came from. You recall 'Purple Dragon' from the doctrine brief.",
            start = "step1", briefKey = "doctrine/origins",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you explain?",
                    choices = listOf(
                        ScenarioChoice("It came from a 2020 startup", "bad1"),
                        ScenarioChoice("It came from US military experience in Vietnam, where observation revealed operations", "step2"),
                        ScenarioChoice("It came from a novel", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why does that history matter for civilians?",
                    choices = listOf(
                        ScenarioChoice("It does not", "bad1"),
                        ScenarioChoice("Because the principle — observation reveals intentions — applies to anyone whose information is observed", "good1"),
                        ScenarioChoice("Because civilians face the same enemies", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You explain the military origin and the civilian principle behind it.",
                    outcome = Outcome.GOOD, lesson = "OPSEC's origin is military; its principle — observation reveals intentions — is universal."),
                "bad1" to ScenarioStep(id = "bad1", text = "You invent a modern origin, and your colleague learns a false history.",
                    outcome = Outcome.BAD, lesson = "False origins undermine trust in the doctrine itself."),
                "bad2" to ScenarioStep(id = "bad2", text = "You cite fiction, and the doctrine sounds like fiction too.",
                    outcome = Outcome.BAD, lesson = "Doctrine grounded in real history carries weight fiction cannot.")
            )
        ),
        Scenario(
            id = "bulk-d008", title = "NSDD 298",
            intro = "Someone asks what NSDD 298 is. You know it formalised the five-step process.",
            start = "step1", briefKey = "doctrine/origins",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you say?",
                    choices = listOf(
                        ScenarioChoice("A software standard", "bad1"),
                        ScenarioChoice("A 1988 US national security directive formalising OPSEC", "step2"),
                        ScenarioChoice("A military unit", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why formalise a process at all?",
                    choices = listOf(
                        ScenarioChoice("For bureaucracy", "bad1"),
                        ScenarioChoice("So that protection is systematic and repeatable, not a matter of individual talent", "good1"),
                        ScenarioChoice("For secrecy", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You explain the directive and why formal process beats individual talent.",
                    outcome = Outcome.GOOD, lesson = "Formal process makes protection systematic and repeatable."),
                "bad1" to ScenarioStep(id = "bad1", text = "You misidentify the directive, and the process sounds like a tech spec.",
                    outcome = Outcome.BAD, lesson = "Getting the source wrong weakens the doctrine's authority."),
                "bad2" to ScenarioStep(id = "bad2", text = "You describe a unit, and the process sounds like a team, not a method.",
                    outcome = Outcome.BAD, lesson = "OPSEC is a method anyone can use, not a unit's secret.")
            )
        ),
        Scenario(
            id = "bulk-d009", title = "What Is Critical?",
            intro = "You sit down to list your critical information. Everything feels important, and your list grows to fifty items.",
            start = "step1", briefKey = "doctrine/step1",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Keep all fifty; everything is critical", "bad1"),
                        ScenarioChoice("Ask of each item: what could an adversary do with this, and how badly would it harm me?", "step2"),
                        ScenarioChoice("Keep only secrets", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Your list shrinks to eight items. Why is that better?",
                    choices = listOf(
                        ScenarioChoice("It is not; more is safer", "bad1"),
                        ScenarioChoice("Because a prioritised list can actually be protected; an endless list protects nothing", "good1"),
                        ScenarioChoice("Because it is shorter to write", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You prioritise by adversary use and harm, and get a list you can actually protect.",
                    outcome = Outcome.GOOD, lesson = "Critical means: an adversary could use it to harm you. Everything else is not critical."),
                "bad1" to ScenarioStep(id = "bad1", text = "You protect everything equally, which means you protect nothing well.",
                    outcome = Outcome.BAD, lesson = "If everything is critical, nothing is."),
                "bad2" to ScenarioStep(id = "bad2", text = "You keep only secrets, and miss public information that harms you in aggregate.",
                    outcome = Outcome.BAD, lesson = "Critical information is not only secrets; public data in aggregate can harm too.")
            )
        ),
        Scenario(
            id = "bulk-d010", title = "The Obvious Item",
            intro = "Listing critical information, you skip your daily routine — it seems too ordinary to matter.",
            start = "step1", briefKey = "doctrine/step1",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you reconsider?",
                    choices = listOf(
                        ScenarioChoice("Nothing; routines are ordinary", "bad1"),
                        ScenarioChoice("That routines reveal where you will be, when, and with whom — exactly what an adversary needs", "step2"),
                        ScenarioChoice("That routines are boring", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you add to the list?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Routine details that predict your location and contacts, with a countermeasure", "good1"),
                        ScenarioChoice("Your entire schedule", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You add routine details to the list, with a proportionate countermeasure.",
                    outcome = Outcome.GOOD, lesson = "Ordinary information — routines, locations — is often the most critical, because it predicts."),
                "bad1" to ScenarioStep(id = "bad1", text = "You leave routines off the list, and your most predictable information stays unprotected.",
                    outcome = Outcome.BAD, lesson = "Predictability is exposure. Routines belong on the list."),
                "bad2" to ScenarioStep(id = "bad2", text = "You add your entire schedule and overwhelm the list again.",
                    outcome = Outcome.BAD, lesson = "Prioritisation, not completeness, is what makes a list usable.")
            )
        ),
        Scenario(
            id = "bulk-d011", title = "Who Wants It?",
            intro = "You have listed critical information. Now you must analyse threats, and you start with 'hackers'.",
            start = "step1", briefKey = "doctrine/step2",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is wrong with starting at 'hackers'?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("It is a category, not an adversary; you need specific actors, capabilities, and intent", "step2"),
                        ScenarioChoice("Hackers are not real", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "You name three specific actors. What do you assess for each?",
                    choices = listOf(
                        ScenarioChoice("Their budget only", "bad1"),
                        ScenarioChoice("Capability and intent toward you", "good1"),
                        ScenarioChoice("Their reputation", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You assess specific actors by capability and intent, and get a threat picture you can act on.",
                    outcome = Outcome.GOOD, lesson = "Threat analysis names actors, capability, and intent — not categories."),
                "bad1" to ScenarioStep(id = "bad1", text = "You plan against 'hackers' in general, and your controls fit nobody in particular.",
                    outcome = Outcome.BAD, lesson = "Generic adversaries produce generic controls."),
                "bad2" to ScenarioStep(id = "bad2", text = "You deny real adversaries exist, and plan against nobody.",
                    outcome = Outcome.BAD, lesson = "Denying adversaries is not a threat model; it is blindness.")
            )
        ),
        Scenario(
            id = "bulk-d012", title = "Capable But Uninterested",
            intro = "You identify a highly capable adversary, but they have no reason to target you. Your instinct is to build maximum defences anyway.",
            start = "step1", briefKey = "doctrine/step2",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Build maximum defences anyway", "bad1"),
                        ScenarioChoice("Note the capability, assess intent as low, and prioritise accordingly", "step2"),
                        ScenarioChoice("Ignore them entirely", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why not maximum defences?",
                    choices = listOf(
                        ScenarioChoice("Because they are expensive", "bad1"),
                        ScenarioChoice("Because defences that burden you get abandoned, and effort spent here is not spent on real threats", "good1"),
                        ScenarioChoice("Because capability alone is not a threat", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You prioritise by capability plus intent, and spend effort where threats are real.",
                    outcome = Outcome.GOOD, lesson = "Threat is capability plus intent. Capability without intent is not your current threat."),
                "bad1" to ScenarioStep(id = "bad1", text = "You exhaust yourself defending against an uninterested adversary, and neglect real ones.",
                    outcome = Outcome.BAD, lesson = "Over-defence against unlikely threats starves defence against likely ones."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ignore a capable adversary entirely, with no monitoring if intent changes.",
                    outcome = Outcome.BAD, lesson = "Low intent today is not no intent forever. Note and monitor, don't ignore.")
            )
        ),
        Scenario(
            id = "bulk-d013", title = "The Overheard Call",
            intro = "You take a sensitive work call in a café. A stranger at the next table is reading, or appears to be.",
            start = "step1", briefKey = "doctrine/step3",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What vulnerability have you created?",
                    choices = listOf(
                        ScenarioChoice("None; cafés are public", "bad1"),
                        ScenarioChoice("An acoustic vulnerability: sensitive information spoken where strangers can hear it", "step2"),
                        ScenarioChoice("A network vulnerability", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is the countermeasure?",
                    choices = listOf(
                        ScenarioChoice("Speak quietly", "bad1"),
                        ScenarioChoice("Do not discuss sensitive matters in public places; move or reschedule", "good1"),
                        ScenarioChoice("Use code words", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You move the call to a private place, closing the acoustic vulnerability.",
                    outcome = Outcome.GOOD, lesson = "Vulnerabilities are not only technical. A spoken word in public is a vulnerability."),
                "bad1" to ScenarioStep(id = "bad1", text = "You assume public places are safe for private talk, and your call is overheard.",
                    outcome = Outcome.BAD, lesson = "Public means overheard. Sensitive talk needs a private place."),
                "bad2" to ScenarioStep(id = "bad2", text = "You focus on the network and miss the ears in the room.",
                    outcome = Outcome.BAD, lesson = "The most obvious vulnerability is often the human one in the room.")
            )
        ),
        Scenario(
            id = "bulk-d014", title = "The Helpful Colleague",
            intro = "A colleague offers to carry a sensitive document through a public area for you, to save you time.",
            start = "step1", briefKey = "doctrine/step3",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What vulnerability does this create?",
                    choices = listOf(
                        ScenarioChoice("None; colleagues are trusted", "bad1"),
                        ScenarioChoice("An uncontrolled handoff: the document passes through hands and places you do not control", "step2"),
                        ScenarioChoice("A delay", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Accept; trust is enough", "bad1"),
                        ScenarioChoice("Carry it yourself, or use a controlled transfer method", "good1"),
                        ScenarioChoice("Seal it in an envelope and accept", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You keep control of the document's journey, closing the handoff vulnerability.",
                    outcome = Outcome.GOOD, lesson = "Every handoff is a vulnerability. Control the chain, or accept the exposure knowingly."),
                "bad1" to ScenarioStep(id = "bad1", text = "You hand sensitive material to an uncontrolled journey because trust felt sufficient.",
                    outcome = Outcome.BAD, lesson = "Trust is not control. A trusted person in an uncontrolled place is still uncontrolled."),
                "bad2" to ScenarioStep(id = "bad2", text = "You seal the envelope but still lose control of where it goes.",
                    outcome = Outcome.BAD, lesson = "A seal protects content, not custody. Control the journey, not just the package.")
            )
        ),
        Scenario(
            id = "bulk-d015", title = "Likely and Harmless",
            intro = "You assess a risk: an adversary will likely learn your lunch routine, but the harm is trivial.",
            start = "step1", briefKey = "doctrine/step4",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "How do you rate this risk?",
                    choices = listOf(
                        ScenarioChoice("High, because it is likely", "bad1"),
                        ScenarioChoice("Low overall: high likelihood, low harm, so proportionate attention", "step2"),
                        ScenarioChoice("Ignore it", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do with a low risk?",
                    choices = listOf(
                        ScenarioChoice("Nothing at all", "bad1"),
                        ScenarioChoice("Note it and apply a proportionate, low-cost control", "good1"),
                        ScenarioChoice("Apply the strongest control", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You rate likelihood times harm, and apply a proportionate control.",
                    outcome = Outcome.GOOD, lesson = "Risk is likelihood combined with harm. Either alone misleads."),
                "bad1" to ScenarioStep(id = "bad1", text = "You rate by likelihood alone and waste strong controls on trivial harm.",
                    outcome = Outcome.BAD, lesson = "Likelihood alone is not risk. Harm matters equally."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ignore a noted risk entirely, and it grows unmonitored.",
                    outcome = Outcome.BAD, lesson = "Low risk still deserves a note and a proportionate control.")
            )
        ),
        Scenario(
            id = "bulk-d016", title = "Unlikely and Catastrophic",
            intro = "You assess another risk: unlikely, but if it happened, it would destroy your work and reputation.",
            start = "step1", briefKey = "doctrine/step4",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "How do you rate this risk?",
                    choices = listOf(
                        ScenarioChoice("Low, because it is unlikely", "bad1"),
                        ScenarioChoice("High enough to warrant a countermeasure, because severity dominates", "step2"),
                        ScenarioChoice("Ignore it; it will not happen", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What countermeasure fits?",
                    choices = listOf(
                        ScenarioChoice("A cheap, partial one", "bad1"),
                        ScenarioChoice("One proportionate to the severity: backups, separation, and a plan, even for an unlikely event", "good1"),
                        ScenarioChoice("None; probability is low", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You protect against a severe risk even though it is unlikely, with backups and a plan.",
                    outcome = Outcome.GOOD, lesson = "Severity can dominate likelihood. Unlikely and catastrophic still deserves a countermeasure."),
                "bad1" to ScenarioStep(id = "bad1", text = "You rate by likelihood alone and leave a catastrophic risk unprotected.",
                    outcome = Outcome.BAD, lesson = "Likelihood alone understates severe risks."),
                "bad2" to ScenarioStep(id = "bad2", text = "You dismiss the risk because it has not happened yet.",
                    outcome = Outcome.BAD, lesson = "'It has not happened' is not a risk assessment.")
            )
        ),
        Scenario(
            id = "bulk-d017", title = "A Control Without a Risk",
            intro = "A vendor pitches an expensive monitoring tool. You have not assessed any risk it would address.",
            start = "step1", briefKey = "doctrine/step5",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you ask first?",
                    choices = listOf(
                        ScenarioChoice("Its price", "bad1"),
                        ScenarioChoice("Which named risk, from my steps 1 to 4, does this address?", "step2"),
                        ScenarioChoice("Its features", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "It addresses no named risk. What do you do?",
                    choices = listOf(
                        ScenarioChoice("Buy it anyway; more tools are safer", "bad1"),
                        ScenarioChoice("Decline, and return to your risk assessment", "good1"),
                        ScenarioChoice("Buy a cheaper version", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You decline a control without a risk, and return to your assessment.",
                    outcome = Outcome.GOOD, lesson = "Every countermeasure must answer a named risk. Tools without risks are purchases, not protection."),
                "bad1" to ScenarioStep(id = "bad1", text = "You buy a tool with no risk to address, and your budget and attention are spent.",
                    outcome = Outcome.BAD, lesson = "Unjustified tools consume the budget real controls need."),
                "bad2" to ScenarioStep(id = "bad2", text = "You buy a cheaper unjustified tool, which is still unjustified.",
                    outcome = Outcome.BAD, lesson = "Price does not justify a control. A named risk does.")
            )
        ),
        Scenario(
            id = "bulk-d018", title = "The Unmaintained Control",
            intro = "You installed a strong control a year ago. You have not checked it since, and it quietly stopped working months ago.",
            start = "step1", briefKey = "doctrine/step5",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What went wrong?",
                    choices = listOf(
                        ScenarioChoice("The tool was bad", "bad1"),
                        ScenarioChoice("The control was installed but never maintained, so it decayed", "step2"),
                        ScenarioChoice("The risk changed", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Buy a new tool", "bad1"),
                        ScenarioChoice("Add maintenance to your routine: check controls on a schedule, not by accident", "good1"),
                        ScenarioChoice("Remove the control", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You schedule control checks, so decay is caught before an incident catches it.",
                    outcome = Outcome.GOOD, lesson = "A countermeasure is complete only when it is maintained."),
                "bad1" to ScenarioStep(id = "bad1", text = "You replace a decayed tool with a new one, and the new one will decay the same way.",
                    outcome = Outcome.BAD, lesson = "Replacing tools without maintenance repeats the failure."),
                "bad2" to ScenarioStep(id = "bad2", text = "You remove the control entirely, leaving the risk unaddressed.",
                    outcome = Outcome.BAD, lesson = "A decayed control needs maintenance, not removal.")
            )
        ),
        Scenario(
            id = "bulk-d019", title = "Ten Minutes, One Decision",
            intro = "You have ten minutes before a meeting to decide whether to share a document. A full threat model would take an hour.",
            start = "step1", briefKey = "doctrine/threat-model-ten",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Share without thinking", "bad1"),
                        ScenarioChoice("Run a compressed model: critical information, adversary, vulnerability, risk, countermeasure", "step2"),
                        ScenarioChoice("Refuse to share", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "The compressed model shows real risk. What then?",
                    choices = listOf(
                        ScenarioChoice("Share anyway", "bad1"),
                        ScenarioChoice("Delay sharing, or share a redacted version, and do the full model later", "good1"),
                        ScenarioChoice("Cancel the meeting", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You compress the model, find the risk, and share safely or not at all.",
                    outcome = Outcome.GOOD, lesson = "A ten-minute model touches every step, compressed — not skipped."),
                "bad1" to ScenarioStep(id = "bad1", text = "You share without thinking, and time pressure becomes the vulnerability.",
                    outcome = Outcome.BAD, lesson = "Time pressure is not an excuse to skip the model; it is a reason to compress it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You refuse all sharing, and the work stalls for want of a proportionate decision.",
                    outcome = Outcome.BAD, lesson = "Refusal without assessment is not security; it is avoidance.")
            )
        ),
        Scenario(
            id = "bulk-d020", title = "When Ten Minutes Is Not Enough",
            intro = "A new, high-stakes partnership is proposed. You are tempted to use a ten-minute model because it is quick.",
            start = "step1", briefKey = "doctrine/threat-model-ten",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Use the ten-minute model", "bad1"),
                        ScenarioChoice("Use the full model: high stakes and new situations deserve it", "step2"),
                        ScenarioChoice("Skip modelling; trust the partner", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why full rather than compressed?",
                    choices = listOf(
                        ScenarioChoice("Because it is longer", "bad1"),
                        ScenarioChoice("Because compressed models miss detail, and detail matters most when stakes are high", "good1"),
                        ScenarioChoice("Because partners expect it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You use the full model for a high-stakes, new situation, and catch risks the short model would miss.",
                    outcome = Outcome.GOOD, lesson = "Short models are for routine, low-stakes decisions. High stakes deserve the full process."),
                "bad1" to ScenarioStep(id = "bad1", text = "You compress a high-stakes decision and miss risks that only detail reveals.",
                    outcome = Outcome.BAD, lesson = "Compressing a high-stakes model is false economy."),
                "bad2" to ScenarioStep(id = "bad2", text = "You skip modelling entirely and trust a new partner blindly.",
                    outcome = Outcome.BAD, lesson = "Trust without assessment is not a model at all.")
            )
        ),
        Scenario(
            id = "bulk-d021", title = "One Password Everywhere",
            intro = "You use one strong password for email, banking, and social media. It has never been breached, as far as you know.",
            start = "step1", briefKey = "digital/passwords",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the risk?",
                    choices = listOf(
                        ScenarioChoice("None; it is strong", "bad1"),
                        ScenarioChoice("One breach anywhere opens every account sharing it, via credential stuffing", "step2"),
                        ScenarioChoice("It is hard to remember", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Make the password longer", "bad1"),
                        ScenarioChoice("Use unique, random passwords everywhere, managed by a password manager", "good1"),
                        ScenarioChoice("Change it monthly", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You switch to unique passwords via a manager, so one breach stays one breach.",
                    outcome = Outcome.GOOD, lesson = "Reuse turns one breach into many. Unique passwords contain every breach."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep one strong password everywhere, and one breach opens your whole life.",
                    outcome = Outcome.BAD, lesson = "Strength does not survive reuse. One leak is enough."),
                "bad2" to ScenarioStep(id = "bad2", text = "You rotate one password monthly, still reused everywhere, still one breach away from total loss.",
                    outcome = Outcome.BAD, lesson = "Rotation without uniqueness is motion without protection.")
            )
        ),
        Scenario(
            id = "bulk-d022", title = "The Master Password",
            intro = "You adopt a password manager. Now you must choose one master password to protect all the rest.",
            start = "step1", briefKey = "digital/passwords",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What makes a good master password?",
                    choices = listOf(
                        ScenarioChoice("A short, complex string", "bad1"),
                        ScenarioChoice("A long, random, memorable passphrase, used nowhere else", "step2"),
                        ScenarioChoice("Your birth date plus a symbol", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What else protects the vault?",
                    choices = listOf(
                        ScenarioChoice("Nothing; the password is enough", "bad1"),
                        ScenarioChoice("A second factor on the vault, and a secure recovery plan", "good1"),
                        ScenarioChoice("Writing it on paper", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You choose a long unique passphrase, add a second factor, and plan recovery.",
                    outcome = Outcome.GOOD, lesson = "The master password guards everything; give it length, uniqueness, and a second factor."),
                "bad1" to ScenarioStep(id = "bad1", text = "You choose a short complex password, which is weaker than a long passphrase and harder to remember.",
                    outcome = Outcome.BAD, lesson = "Length beats complexity for memorability and strength."),
                "bad2" to ScenarioStep(id = "bad2", text = "You build your master password from personal data, which is guessable.",
                    outcome = Outcome.BAD, lesson = "Personal data in a password is an invitation to guess it.")
            )
        ),
        Scenario(
            id = "bulk-d023", title = "SMS Code Arrives",
            intro = "You log in and receive an SMS code. A message follows: 'We detected suspicious activity. Reply with the code to verify.'",
            start = "step1", briefKey = "digital/twofactor",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Reply with the code", "bad1"),
                        ScenarioChoice("Do not share the code with anyone; a legitimate service never asks for it", "step2"),
                        ScenarioChoice("Reply with a fake code", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do next?",
                    choices = listOf(
                        ScenarioChoice("Ignore it", "bad1"),
                        ScenarioChoice("Log in via the official app or site directly and check for real alerts", "good1"),
                        ScenarioChoice("Call the number in the message", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You refuse to share the code and verify through the official channel directly.",
                    outcome = Outcome.GOOD, lesson = "Second-factor codes are never shared. Verification goes through a channel you choose, not one a message supplies."),
                "bad1" to ScenarioStep(id = "bad1", text = "You share the code, and the attacker logs in as you.",
                    outcome = Outcome.BAD, lesson = "A shared second factor is a surrendered account."),
                "bad2" to ScenarioStep(id = "bad2", text = "You call the number in the suspect message, reaching the attacker.",
                    outcome = Outcome.BAD, lesson = "Never verify through a channel supplied by the suspect message.")
            )
        ),
        Scenario(
            id = "bulk-d024", title = "Upgrading the Second Factor",
            intro = "Your most important account offers SMS, authenticator app, and hardware key options. You currently use SMS.",
            start = "step1", briefKey = "digital/twofactor",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you choose?",
                    choices = listOf(
                        ScenarioChoice("Stay on SMS; it works", "bad1"),
                        ScenarioChoice("Move to the hardware key, the phishing-resistant option", "step2"),
                        ScenarioChoice("Use email codes", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What about backup access?",
                    choices = listOf(
                        ScenarioChoice("None needed", "bad1"),
                        ScenarioChoice("Register a second key or backup codes, stored securely", "good1"),
                        ScenarioChoice("Keep SMS as backup", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You upgrade to a hardware key with a secure backup, closing the SIM-swap hole.",
                    outcome = Outcome.GOOD, lesson = "Hardware keys are phishing-resistant. SMS is the weakest second factor, vulnerable to SIM swaps."),
                "bad1" to ScenarioStep(id = "bad1", text = "You stay on SMS, and a SIM swap later hands your account to an attacker.",
                    outcome = Outcome.BAD, lesson = "SMS codes can be stolen by transferring your number. 'It works' is not 'it is safe'."),
                "bad2" to ScenarioStep(id = "bad2", text = "You switch to email codes, which are only as safe as your email account.",
                    outcome = Outcome.BAD, lesson = "A second factor is only as strong as its own channel.")
            )
        ),
        Scenario(
            id = "bulk-d025", title = "Encrypted, But Visible",
            intro = "You send an end-to-end encrypted message. A friend says: 'So nobody can know we talked.'",
            start = "step1", briefKey = "digital/encryption",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you correct?",
                    choices = listOf(
                        ScenarioChoice("Nothing; they are right", "bad1"),
                        ScenarioChoice("Content is hidden, but metadata — who, when, how much — remains visible", "step2"),
                        ScenarioChoice("Encryption hides everything", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why does metadata matter?",
                    choices = listOf(
                        ScenarioChoice("It does not", "bad1"),
                        ScenarioChoice("Because patterns of contact, timing, and frequency reveal relationships and routines", "good1"),
                        ScenarioChoice("Because providers sell it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You explain that encryption protects content, not metadata, and adjust expectations accordingly.",
                    outcome = Outcome.GOOD, lesson = "Encryption hides content, not metadata. Who, when, and how much remain visible."),
                "bad1" to ScenarioStep(id = "bad1", text = "You let your friend believe encrypted means invisible, and they share freely.",
                    outcome = Outcome.BAD, lesson = "False confidence in encryption produces careless behaviour."),
                "bad2" to ScenarioStep(id = "bad2", text = "You claim encryption hides everything, which is simply false.",
                    outcome = Outcome.BAD, lesson = "Overclaiming a tool's protection is worse than no tool, because it changes behaviour.")
            )
        ),
        Scenario(
            id = "bulk-d026", title = "The Encrypted Backup",
            intro = "You back up your phone to the cloud. The backup is encrypted, but the provider holds the key.",
            start = "step1", briefKey = "digital/encryption",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What does provider-held encryption mean?",
                    choices = listOf(
                        ScenarioChoice("Nobody can read the backup", "bad1"),
                        ScenarioChoice("The provider can read it, and so can anyone who compels or compromises the provider", "step2"),
                        ScenarioChoice("It is the same as end-to-end encryption", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do for sensitive backups?",
                    choices = listOf(
                        ScenarioChoice("Accept provider encryption", "bad1"),
                        ScenarioChoice("Use end-to-end encrypted backups, where only you hold the key, and protect that key", "good1"),
                        ScenarioChoice("Stop backing up", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You switch sensitive backups to end-to-end encryption and guard the key.",
                    outcome = Outcome.GOOD, lesson = "Who holds the key decides who can read the data. Provider-held keys mean provider-readable data."),
                "bad1" to ScenarioStep(id = "bad1", text = "You assume all encryption is equal, and your backup is readable by the provider.",
                    outcome = Outcome.BAD, lesson = "'Encrypted' without 'who holds the key' is an incomplete claim."),
                "bad2" to ScenarioStep(id = "bad2", text = "You stop backing up, trading a privacy risk for a data-loss certainty.",
                    outcome = Outcome.BAD, lesson = "Abandoning backups is not a privacy strategy; it is a data-loss strategy.")
            )
        ),
        Scenario(
            id = "bulk-d027", title = "The Group Chat Leak",
            intro = "You share sensitive news in a small encrypted group chat. A member screenshots it and forwards it elsewhere.",
            start = "step1", briefKey = "digital/comms",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What failed?",
                    choices = listOf(
                        ScenarioChoice("The encryption", "bad1"),
                        ScenarioChoice("The trust boundary: encryption protects against outsiders, not against members", "step2"),
                        ScenarioChoice("The app", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Use a different app", "bad1"),
                        ScenarioChoice("Share sensitive news only with people and groups whose discretion you have reason to trust, and keep it minimal", "good1"),
                        ScenarioChoice("Ban screenshots", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You accept that group privacy is set by its least careful member, and share accordingly.",
                    outcome = Outcome.GOOD, lesson = "A group chat is as exposed as its least careful member. Encryption does not fix trust."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame encryption, which worked exactly as designed — against outsiders.",
                    outcome = Outcome.BAD, lesson = "Blaming the tool for a trust failure means the trust failure repeats."),
                "bad2" to ScenarioStep(id = "bad2", text = "You rely on screenshot bans, which are trivially bypassed with another device.",
                    outcome = Outcome.BAD, lesson = "Technical bans on screenshots do not survive a second camera.")
            )
        ),
        Scenario(
            id = "bulk-d028", title = "The Recorded Call",
            intro = "You have a sensitive call on an encrypted app. You assume it cannot be recorded.",
            start = "step1", briefKey = "digital/comms",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is true?",
                    choices = listOf(
                        ScenarioChoice("Encrypted calls cannot be recorded", "bad1"),
                        ScenarioChoice("The other party can record it, whatever the app does", "step2"),
                        ScenarioChoice("Only the provider can record it", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Stop calling", "bad1"),
                        ScenarioChoice("Say only what you would accept being recorded, and agree sensitive ground rules in advance", "good1"),
                        ScenarioChoice("Use a different app", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You speak as if the call could be recorded, because it can be — by the other party.",
                    outcome = Outcome.GOOD, lesson = "Encryption protects a call from outsiders, not from the other participant."),
                "bad1" to ScenarioStep(id = "bad1", text = "You speak freely on an encrypted call, and your words are recorded by the other party.",
                    outcome = Outcome.BAD, lesson = "'Encrypted' is not 'unrecordable'. The other party is always a recorder."),
                "bad2" to ScenarioStep(id = "bad2", text = "You switch apps, but the other party can record on any app.",
                    outcome = Outcome.BAD, lesson = "No app prevents the other party from recording. Only your words do.")
            )
        ),
        Scenario(
            id = "bulk-d029", title = "The Unlocked Phone",
            intro = "You leave your phone unlocked on a café table while you order. A stranger picks it up 'to return it'.",
            start = "step1", briefKey = "digital/devices",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What was exposed?",
                    choices = listOf(
                        ScenarioChoice("Nothing; it was only a minute", "bad1"),
                        ScenarioChoice("Everything unlocked on the device: messages, accounts, photos, and data", "step2"),
                        ScenarioChoice("Only the home screen", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What habit prevents this?",
                    choices = listOf(
                        ScenarioChoice("A short auto-lock and a strong passcode, plus keeping the device with you", "good1"),
                        ScenarioChoice("A phone case", "bad1"),
                        ScenarioChoice("Face unlock only", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You adopt short auto-lock, a strong passcode, and keep the device on your person.",
                    outcome = Outcome.GOOD, lesson = "An unlocked device in a stranger's hands is an open device. Lock short, lock strong, keep it close."),
                "bad1" to ScenarioStep(id = "bad1", text = "You assume a minute is safe, and a stranger reads your unlocked life.",
                    outcome = Outcome.BAD, lesson = "A minute is enough. Unlocked means open."),
                "bad2" to ScenarioStep(id = "bad2", text = "You rely on face unlock alone, which opens for your face — and can be pointed at you.",
                    outcome = Outcome.BAD, lesson = "Biometrics are convenience, not a substitute for a strong passcode and short lock.")
            )
        ),
        Scenario(
            id = "bulk-d030", title = "The Old App",
            intro = "An app you have not used in two years still sits on your phone, with broad permissions granted long ago.",
            start = "step1", briefKey = "digital/devices",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the risk?",
                    choices = listOf(
                        ScenarioChoice("None; you do not use it", "bad1"),
                        ScenarioChoice("It still holds permissions and data, and may still be updated or breached", "step2"),
                        ScenarioChoice("It wastes storage", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Leave it", "bad1"),
                        ScenarioChoice("Remove it, and revoke its account access and permissions", "good1"),
                        ScenarioChoice("Log out only", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You remove the app and revoke its access, closing a forgotten door.",
                    outcome = Outcome.GOOD, lesson = "Unused apps still hold permissions and data. Removal plus revocation closes them."),
                "bad1" to ScenarioStep(id = "bad1", text = "You leave a forgotten app with broad permissions, and it is breached through an old flaw.",
                    outcome = Outcome.BAD, lesson = "Forgotten apps are unmaintained doors. They are breached first."),
                "bad2" to ScenarioStep(id = "bad2", text = "You log out but leave the app installed, permissions intact, data intact.",
                    outcome = Outcome.BAD, lesson = "Logging out is not removal. Permissions and data remain.")
            )
        ),
        Scenario(
            id = "bulk-d031", title = "Café Wi-Fi",
            intro = "You join a café's free Wi-Fi and open your email. The network needs no password.",
            start = "step1", briefKey = "digital/network",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "How do you treat this network?",
                    choices = listOf(
                        ScenarioChoice("As trusted; the café is reputable", "bad1"),
                        ScenarioChoice("As untrusted, every time", "step2"),
                        ScenarioChoice("As safe for email only", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What protects you here?",
                    choices = listOf(
                        ScenarioChoice("Nothing needed", "bad1"),
                        ScenarioChoice("Encrypted connections everywhere, and a trusted VPN for sensitive traffic", "good1"),
                        ScenarioChoice("A strong password", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You treat the network as hostile and protect every connection on it.",
                    outcome = Outcome.GOOD, lesson = "Public networks are untrusted regardless of reputation or passwords."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust a reputable café's network, and a local observer reads your traffic.",
                    outcome = Outcome.BAD, lesson = "Reputation does not secure a network. Anyone on it can observe it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You assume email is safe on an open network, and credentials are intercepted.",
                    outcome = Outcome.BAD, lesson = "No traffic is safe on an untrusted network without encryption.")
            )
        ),
        Scenario(
            id = "bulk-d032", title = "What the VPN Hides",
            intro = "A friend says a VPN makes them completely anonymous online. You know better.",
            start = "step1", briefKey = "digital/network",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you correct?",
                    choices = listOf(
                        ScenarioChoice("Nothing; they are right", "bad1"),
                        ScenarioChoice("A VPN hides traffic from local observers, but the provider sees it, and logged-in services still know you", "step2"),
                        ScenarioChoice("VPNs are useless", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "When is a VPN the right tool?",
                    choices = listOf(
                        ScenarioChoice("Always", "bad1"),
                        ScenarioChoice("On untrusted networks, to hide traffic from local observers", "good1"),
                        ScenarioChoice("For anonymity", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You explain a VPN's real protection and its limits, and use it where it fits.",
                    outcome = Outcome.GOOD, lesson = "A VPN shifts trust to the provider. It hides traffic locally; it does not anonymise you."),
                "bad1" to ScenarioStep(id = "bad1", text = "You let your friend believe a VPN anonymises them, and they act as if invisible.",
                    outcome = Outcome.BAD, lesson = "False anonymity produces the riskiest behaviour of all."),
                "bad2" to ScenarioStep(id = "bad2", text = "You dismiss VPNs entirely, losing a useful protection on untrusted networks.",
                    outcome = Outcome.BAD, lesson = "A limited tool is still a tool. Dismissing it loses real protection.")
            )
        ),
        Scenario(
            id = "bulk-d033", title = "Urgent Login Link",
            intro = "An email claims your account will be closed today unless you log in via its link. The logo looks perfect.",
            start = "step1", briefKey = "digital/email",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Click the link and log in quickly", "bad1"),
                        ScenarioChoice("Go to the service directly, not via the link, and check for any real alert", "step2"),
                        ScenarioChoice("Reply asking if it is real", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "There is no alert on the real site. What was the email?",
                    choices = listOf(
                        ScenarioChoice("A mistake", "bad1"),
                        ScenarioChoice("Phishing: urgency plus a link, designed to steal credentials", "good1"),
                        ScenarioChoice("A test", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You bypass the link, check directly, and find no alert — the email was phishing.",
                    outcome = Outcome.GOOD, lesson = "Never log in via an emailed link. Navigate yourself and check there."),
                "bad1" to ScenarioStep(id = "bad1", text = "You click and log in on a fake page, handing your credentials to the attacker.",
                    outcome = Outcome.BAD, lesson = "A perfect logo is cheap to copy. Urgency plus a link is the pattern, not the proof."),
                "bad2" to ScenarioStep(id = "bad2", text = "You reply to the phishers, confirming your address is active and monitored.",
                    outcome = Outcome.BAD, lesson = "Replying to phishing confirms your address and invites more.")
            )
        ),
        Scenario(
            id = "bulk-d034", title = "The Familiar Sender",
            intro = "An email from a colleague's exact address asks you to open an attachment urgently. Something feels slightly off.",
            start = "step1", briefKey = "digital/email",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you trust?",
                    choices = listOf(
                        ScenarioChoice("The sender address; it is exact", "bad1"),
                        ScenarioChoice("Nothing yet; addresses can be spoofed or accounts compromised — verify separately", "step2"),
                        ScenarioChoice("The urgency; colleagues do send urgent mail", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you verify?",
                    choices = listOf(
                        ScenarioChoice("Reply to the email", "bad1"),
                        ScenarioChoice("Contact the colleague through a separate, trusted channel you already use", "good1"),
                        ScenarioChoice("Open the attachment carefully", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You verify out-of-band, learn the colleague's account was compromised, and avoid the malware.",
                    outcome = Outcome.GOOD, lesson = "Sender addresses can be spoofed and accounts compromised. Verify through a separate channel."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust an exact address, open the attachment, and install malware.",
                    outcome = Outcome.BAD, lesson = "An exact address proves nothing: spoofing and compromise both produce exact addresses."),
                "bad2" to ScenarioStep(id = "bad2", text = "You open the attachment 'carefully', which is not a protection at all.",
                    outcome = Outcome.BAD, lesson = "There is no careful way to open a malicious attachment. Verify first, open second.")
            )
        ),
        Scenario(
            id = "bulk-d035", title = "The Untested Backup",
            intro = "Your drive fails. You reach for your backup — the one you have never tested restoring from.",
            start = "step1", briefKey = "digital/backups-restore",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you discover?",
                    choices = listOf(
                        ScenarioChoice("It works perfectly", "bad1"),
                        ScenarioChoice("It is corrupt, incomplete, or encrypted with a key you lost", "step2"),
                        ScenarioChoice("It is slow", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What should you have done?",
                    choices = listOf(
                        ScenarioChoice("Backed up more often", "bad1"),
                        ScenarioChoice("Tested restores regularly, and protected backup keys like the data itself", "good1"),
                        ScenarioChoice("Used two backup tools", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You learn the lesson for next time: test restores, protect keys, verify backups.",
                    outcome = Outcome.GOOD, lesson = "An untested backup is a hope, not a backup. Restore tests prove it works."),
                "bad1" to ScenarioStep(id = "bad1", text = "You assumed a backup that exists is a backup that works, and lose your data.",
                    outcome = Outcome.BAD, lesson = "Existence is not function. Only a tested restore proves a backup."),
                "bad2" to ScenarioStep(id = "bad2", text = "You add a second untested backup, doubling hope without adding proof.",
                    outcome = Outcome.BAD, lesson = "Two untested backups are two hopes, not one certainty.")
            )
        ),
        Scenario(
            id = "bulk-d036", title = "The Stolen Backup",
            intro = "A thief steals your backup drive. It is unencrypted, containing years of personal data.",
            start = "step1", briefKey = "digital/backups-restore",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the consequence?",
                    choices = listOf(
                        ScenarioChoice("Only the drive is lost", "bad1"),
                        ScenarioChoice("A total breach: the backup contains the same sensitive data as the original", "step2"),
                        ScenarioChoice("Nothing; backups are not sensitive", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What should backups be?",
                    choices = listOf(
                        ScenarioChoice("Frequent only", "bad1"),
                        ScenarioChoice("Encrypted, with keys protected, and stored with the same care as the original data", "good1"),
                        ScenarioChoice("Hidden", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You encrypt future backups and protect their keys, treating backups as data itself.",
                    outcome = Outcome.GOOD, lesson = "A backup is a copy of your data. Unencrypted, its theft is a total breach."),
                "bad1" to ScenarioStep(id = "bad1", text = "You treat the theft as a hardware loss, missing that years of data are now in other hands.",
                    outcome = Outcome.BAD, lesson = "Backup theft is data theft. The drive is the least of it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You hide backups instead of encrypting them, and hiding is not protection.",
                    outcome = Outcome.BAD, lesson = "Obscurity is not encryption. Hidden unencrypted data is still readable data.")
            )
        )
    )
}
