package com.abybijo.agent0.data

/** v2.0 Phase 4c: drills linked to CH-15 Capstone briefs, one per brief. */
object Scenarios15 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "cap-daily-drill",
            title = "The Morning You Skip Everything",
            intro = "You wake late, tired, and behind schedule. Your daily posture routine — check devices, review messages, confirm nothing sensitive is exposed — feels like a luxury you cannot afford today.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Skip the routine entirely; today is too busy", "bad1"),
                        ScenarioChoice("Run the shortest version that still covers the essentials", "step2"),
                        ScenarioChoice("Do the full routine, and be late for everything", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What belongs in the shortest version?",
                    choices = listOf(
                        ScenarioChoice("The checks that prevent irreversible exposure: devices, messages, and what you are about to share", "good1"),
                        ScenarioChoice("Only checking your phone", "bad2"),
                        ScenarioChoice("Whatever you happen to remember", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You run the essentials in two minutes: devices locked, messages reviewed, nothing sensitive about to be shared. The routine survived a bad morning because it was designed to shrink, not to break.",
                    outcome = Outcome.GOOD,
                    lesson = "A daily posture must have a shortest version that still prevents irreversible exposure — designed to shrink, not to break."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Skipping the routine, or running it from memory, leaves the day's first exposure unchecked — and busy days are when mistakes happen most.",
                    outcome = Outcome.BAD,
                    lesson = "Busy days need the routine most, not least. Design a short version; never rely on memory."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Running the full routine and being late for everything makes the routine a burden — and burdens get abandoned.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "A routine that cannot shrink will be skipped. Build the short version deliberately."
                )
            ),
            briefKey = "capstone/cap-daily"
        ),
        Scenario(
            id = "cap-reviews-drill",
            title = "The Review You Keep Postponing",
            intro = "Your monthly OPSEC review is three months overdue. In that time you changed jobs, joined a new group chat, and started using a new app. Nothing bad has happened — yet.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What does the overdue review need to cover first?",
                    choices = listOf(
                        ScenarioChoice("What changed since the last review: job, groups, apps, and contacts", "step2"),
                        ScenarioChoice("Whether anything bad happened", "bad1"),
                        ScenarioChoice("Your old plan, to confirm it still looks good", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you do with the changes?",
                    choices = listOf(
                        ScenarioChoice("Update the threat model and the plan, then set the next review date before closing", "good1"),
                        ScenarioChoice("Note the changes for later", "bad1"),
                        ScenarioChoice("Update only the biggest change", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The review catches three months of change: new job, new groups, new app — each with its own exposure. The plan is updated, and the next review date is set before you close the book. Nothing bad needed to happen first.",
                    outcome = Outcome.GOOD,
                    lesson = "Reviews exist to catch change before it catches you. Update the plan, then set the next review before closing."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Checking only whether anything bad happened, or noting changes for later, leaves the exposure open — the review that finds nothing still found nothing, deliberately.",
                    outcome = Outcome.BAD,
                    lesson = "A review that only looks for past harm is not a review. It looks for change, and updates the plan."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Confirming the old plan, or updating only the biggest change, leaves the smaller changes — groups and apps — unexamined.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Review all changes, not only the biggest. Small changes compound."
                )
            ),
            briefKey = "capstone/cap-reviews"
        ),
        Scenario(
            id = "cap-stress-drill",
            title = "Tired, Rushed, and About to Share",
            intro = "You are exhausted after a long day and need to send a message urgently. You are about to paste something sensitive into the wrong chat — the one with people who should not see it.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What stops you?",
                    choices = listOf(
                        ScenarioChoice("Nothing; you send it and hope", "bad1"),
                        ScenarioChoice("A habit built for tired days: pause, check the recipient, then send", "step2"),
                        ScenarioChoice("Willpower, in the moment", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What makes that habit work when you are tired?",
                    choices = listOf(
                        ScenarioChoice("It is simple, physical, and practised — pause, check, send — not a decision", "good1"),
                        ScenarioChoice("It is complicated and thorough", "bad2"),
                        ScenarioChoice("It depends on being alert", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You pause, check the recipient, and send to the right chat. The habit worked precisely because it was simple and practised — it did not ask a tired mind to make a new decision.",
                    outcome = Outcome.GOOD,
                    lesson = "Habits that survive stress are simple, physical, and practised — not decisions made under pressure."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Sending and hoping, or relying on alertness, fails exactly when you are tired — which is when the mistake was most likely.",
                    outcome = Outcome.BAD,
                    lesson = "Design for tired days, not good days. Tired days are when habits are tested."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Willpower, or a complicated check, collapses under tiredness. What survives is simple and automatic.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Willpower is not a control. A simple, practised pause is."
                )
            ),
            briefKey = "capstone/cap-stress"
        ),
        Scenario(
            id = "cap-burnout-drill",
            title = "Always On, Always Watching",
            intro = "You have been hyper-vigilant for months: checking everything, trusting nothing, treating every message as a threat. You are exhausted, and you are starting to ignore warnings — including real ones.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is happening?",
                    choices = listOf(
                        ScenarioChoice("You are getting better at OPSEC", "bad1"),
                        ScenarioChoice("Vigilance fatigue: constant alertness has worn out your ability to notice", "step2"),
                        ScenarioChoice("You are becoming careless", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Reduce to the controls that matter most, automate what can be automated, and rest deliberately", "good1"),
                        ScenarioChoice("Push harder and stay more vigilant", "bad1"),
                        ScenarioChoice("Stop all OPSEC for a month", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You keep the controls that matter, automate the rest, and rest deliberately. Your attention recovers — and with it, your ability to notice the real warnings.",
                    outcome = Outcome.GOOD,
                    lesson = "Sustainable vigilance is selective and rested. Constant alertness is not vigilance; it is fatigue."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Pushing harder deepens the fatigue, and ignoring warnings — including real ones — is the failure mode fatigue creates.",
                    outcome = Outcome.BAD,
                    lesson = "More vigilance does not fix vigilance fatigue. Less, better-chosen vigilance does."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Stopping everything, or calling yourself careless, either abandons the posture or misdiagnoses fatigue as character.",
                    outcome = Outcome.BAD,
                    lesson = "Fatigue is a system problem, not a character failure. Fix the system: fewer controls, better chosen, deliberately rested."
                )
            ),
            briefKey = "capstone/cap-burnout"
        ),
        Scenario(
            id = "cap-updating-drill",
            title = "A New Life, An Old Plan",
            intro = "Your life has changed: a new job, a new city, a public role you did not have before. Your OPSEC plan, written two years ago, still describes the old life. You are still following it faithfully.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is wrong with following the old plan faithfully?",
                    choices = listOf(
                        ScenarioChoice("Nothing; a good plan lasts", "bad1"),
                        ScenarioChoice("The plan answers the old life's questions: old critical information, old adversaries, old exposures", "step2"),
                        ScenarioChoice("It is outdated, but only slightly", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you update?",
                    choices = listOf(
                        ScenarioChoice("Critical information, adversaries, and exposures — the whole threat model, in order", "good1"),
                        ScenarioChoice("Only the new job's details", "bad1"),
                        ScenarioChoice("Only your passwords", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You rebuild the threat model for the new life: new critical information, new adversaries, new exposures — and a new plan follows from it. Faithfulness to an old plan is not faithfulness to the posture.",
                    outcome = Outcome.GOOD,
                    lesson = "Threat models expire when life changes. Update the whole model — critical information, adversaries, exposures — not one detail."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Updating only the new job, or only passwords, leaves the public role and the new city unexamined — the biggest changes, unplanned.",
                    outcome = Outcome.BAD,
                    lesson = "Life changes are whole-model changes. Update the model, not a detail."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "A plan that 'only slightly' outdated still answers the wrong life's questions — and the wrong questions give the wrong controls.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Slightly outdated is still outdated. Rebuild when life changes."
                )
            ),
            briefKey = "capstone/cap-updating"
        ),
        Scenario(
            id = "cap-teaching-drill",
            title = "Teaching a Friend",
            intro = "A friend asks you to teach them OPSEC. You are tempted to show them your own setup — your tools, your routines, your critical information — because it is the clearest example you have.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "Why not show them your own setup?",
                    choices = listOf(
                        ScenarioChoice("Because it is rude to refuse", "bad1"),
                        ScenarioChoice("Because teaching with your own setup leaks your own posture to someone who does not need it", "step2"),
                        ScenarioChoice("Because your setup is too advanced", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you teach with instead?",
                    choices = listOf(
                        ScenarioChoice("Generic examples, and their own situation — their critical information, their adversaries", "good1"),
                        ScenarioChoice("Your setup, but with details changed", "bad1"),
                        ScenarioChoice("Nothing practical, only theory", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You teach with generic examples and the friend's own situation. The friend learns a posture built for their life, and your posture stays yours.",
                    outcome = Outcome.GOOD,
                    lesson = "Teach principles with generic examples and the learner's own situation — never with your own setup."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Showing your setup, even with details changed, leaks your posture — and a changed detail is a detail that can be un-changed.",
                    outcome = Outcome.BAD,
                    lesson = "Your setup is not teaching material. Generic examples are."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Teaching only theory, or refusing to teach, either leaves the friend unhelped or wastes a chance to help safely.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Practical teaching is possible without leaking: use their situation, not yours."
                )
            ),
            briefKey = "capstone/cap-teaching"
        ),
        Scenario(
            id = "cap-plan1-drill",
            title = "What Matters Most?",
            intro = "You are writing the first part of your personal OPSEC plan: critical information. You have listed everything you own, everything you do, and everything you know — a hundred items, all marked 'important'.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is wrong with a hundred 'important' items?",
                    choices = listOf(
                        ScenarioChoice("Nothing; thoroughness is good", "bad1"),
                        ScenarioChoice("If everything is critical, nothing is — the list cannot guide choices", "step2"),
                        ScenarioChoice("It takes too long to write", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "How do you narrow it?",
                    choices = listOf(
                        ScenarioChoice("Ask what an adversary could use, and what harm it would cause, and keep only what passes both tests", "good1"),
                        ScenarioChoice("Keep the first ten items", "bad1"),
                        ScenarioChoice("Keep only financial items", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Your list narrows to what an adversary could actually use, and what would actually harm you. The plan can now guide choices, because it knows what matters most.",
                    outcome = Outcome.GOOD,
                    lesson = "Critical information is what an adversary could use to harm you — not everything you own or know."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "A hundred 'important' items, or the first ten, cannot guide choices — the plan protects everything equally, which means it protects nothing well.",
                    outcome = Outcome.BAD,
                    lesson = "Prioritisation is the plan. Without it, there is no plan, only a list."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Keeping only financial items, or worrying only about writing time, either narrows by the wrong test or by no test at all.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Narrow by adversary use and harm, not by category or convenience."
                )
            ),
            briefKey = "capstone/cap-plan1"
        ),
        Scenario(
            id = "cap-plan2-drill",
            title = "Threats, Risks, Countermeasures",
            intro = "You have listed your critical information. Now you must list threats, assess risks, and choose countermeasures. You are tempted to choose countermeasures first — you already know which tools you like.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "Why not choose countermeasures first?",
                    choices = listOf(
                        ScenarioChoice("Because tools are the fun part", "bad1"),
                        ScenarioChoice("Because countermeasures chosen before threats and risks protect the wrong things, or nothing", "step2"),
                        ScenarioChoice("Because it is slower", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What order do you follow?",
                    choices = listOf(
                        ScenarioChoice("Threats, then risks, then countermeasures — and only countermeasures that answer a named risk", "good1"),
                        ScenarioChoice("Countermeasures, then threats", "bad1"),
                        ScenarioChoice("Risks, then threats, then countermeasures", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Every countermeasure in your plan answers a named risk, which answers a named threat, which threatens named critical information. Nothing is in the plan because you like it.",
                    outcome = Outcome.GOOD,
                    lesson = "The OPSEC order is threats, risks, countermeasures — and every countermeasure must answer a named risk."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Tools chosen first protect what you like, not what is threatened — and a plan full of liked tools is a hobby, not a posture.",
                    outcome = Outcome.BAD,
                    lesson = "Countermeasures follow threats and risks, never precede them."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Reversing threats and risks, or choosing by speed, breaks the chain that justifies each countermeasure.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Order matters: threats, risks, countermeasures, in that order."
                )
            ),
            briefKey = "capstone/cap-plan2"
        ),
        Scenario(
            id = "cap-scenario-drill",
            title = "A Full Day, Start to Finish",
            intro = "Your capstone day: a morning message from an unknown contact, a meeting in an unfamiliar place, a border-style request for your device, and an evening post you want to share. Each decision alone seems small.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What connects these four decisions?",
                    choices = listOf(
                        ScenarioChoice("Nothing; each is separate", "bad1"),
                        ScenarioChoice("Each one reveals or protects critical information, and together they reveal a pattern", "step2"),
                        ScenarioChoice("Only the device request matters", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "How do you handle the day?",
                    choices = listOf(
                        ScenarioChoice("Apply the same discipline to each: pause, check, minimise, record", "good1"),
                        ScenarioChoice("Handle the big one carefully and rush the small ones", "bad1"),
                        ScenarioChoice("Handle each by instinct", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You pause, check, minimise, and record through all four decisions. No single decision leaked much — and together, they leaked nothing, because the pattern was protected too.",
                    outcome = Outcome.GOOD,
                    lesson = "Small decisions compound into patterns. Discipline applied to each one protects the pattern as well as the moment."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Rushing the small decisions, or treating them as separate, lets the pattern leak even when each moment seems safe.",
                    outcome = Outcome.BAD,
                    lesson = "Patterns are built from small decisions. Protect the pattern, not only the big moment."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Handling each decision by instinct, or caring only about the device request, either has no discipline or protects only one moment.",
                    outcome = Outcome.BAD,
                    lesson = "Instinct is not a posture. The same discipline, applied to every decision, is."
                )
            ),
            briefKey = "capstone/cap-scenario"
        ),
        Scenario(
            id = "cap-completion-drill",
            title = "Finished — So What Now?",
            intro = "You have completed all 120 briefs. You feel finished. A friend asks what changed, and you realise you have not yet decided what staying current looks like — or what you will do next month.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What does completion mean?",
                    choices = listOf(
                        ScenarioChoice("You are done with OPSEC", "bad1"),
                        ScenarioChoice("You have finished the course, and now the posture must be maintained — reviews, updates, practice", "step2"),
                        ScenarioChoice("You are an expert", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you set up before closing the course?",
                    choices = listOf(
                        ScenarioChoice("A review schedule, an update trigger for life changes, and a practice habit", "good1"),
                        ScenarioChoice("Nothing; you will remember", "bad1"),
                        ScenarioChoice("A certificate on the wall", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You leave the course with a review schedule, an update trigger, and a practice habit. Completion was not the end of the posture — it was the beginning of maintaining it.",
                    outcome = Outcome.GOOD,
                    lesson = "Completion is the start of maintenance: reviews, update triggers, and practice — scheduled before you close the course."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Treating completion as the end, or trusting memory, lets the posture decay — quietly, until a hard day reveals it.",
                    outcome = Outcome.BAD,
                    lesson = "A posture without maintenance decays. Schedule the maintenance before you finish."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Calling yourself an expert, or displaying a certificate, either overstates what a course gives or mistakes a record for a posture.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "A certificate records completion; it does not maintain a posture. Only scheduled practice does."
                )
            ),
            briefKey = "capstone/cap-completion"
        )
    )
}
