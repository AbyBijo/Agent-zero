package com.abybijo.agent0.data

/** v2.0 Phase 4c: questions linked to CH-15 Capstone briefs, three per brief. */
object QuizBank15 {
    val all: List<QuizQuestion> = listOf(
        QuizQuestion(
            prompt = "What should a daily posture routine have for bad mornings?",
            options = listOf("Nothing; skip it", "A shortest version that still prevents irreversible exposure", "A longer version", "An alarm"),
            answerIndex = 1,
            rationale = "A routine designed to shrink survives bad mornings; a routine that cannot shrink gets skipped.",
            id = "cap-q01", briefKey = "capstone/cap-daily", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What belongs in the shortest version of a daily routine?",
            options = listOf("Whatever you remember", "The checks that prevent irreversible exposure: devices, messages, and what you are about to share", "Only phone checks", "Only email checks"),
            answerIndex = 1,
            rationale = "The short version covers irreversible exposure, not everything.",
            id = "cap-q02", briefKey = "capstone/cap-daily", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why are busy days the days that most need the routine?",
            options = listOf("Because they are stressful", "Because busy days are when mistakes happen most", "Because routines are for busy days", "Because they are longer"),
            answerIndex = 1,
            rationale = "Mistakes cluster on busy, tired days — precisely when the routine is most tempting to skip.",
            id = "cap-q03", briefKey = "capstone/cap-daily", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should a monthly OPSEC review look for first?",
            options = listOf("Whether anything bad happened", "What changed since the last review: jobs, groups, apps, contacts", "Whether the plan still looks good", "New threats in the news"),
            answerIndex = 1,
            rationale = "Reviews catch change before change catches you.",
            id = "cap-q04", briefKey = "capstone/cap-reviews", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do before closing a review?",
            options = listOf("File it away", "Update the plan and set the next review date", "Tell someone about it", "Delete old notes"),
            answerIndex = 1,
            rationale = "A review without an updated plan and a next date is a conversation, not a review.",
            id = "cap-q05", briefKey = "capstone/cap-reviews", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is 'nothing bad happened' not a successful review outcome?",
            options = listOf("It is a successful outcome", "Because the review's job is to find change and update the plan, not only to find past harm", "Because reviews must find problems", "Because harm is always present"),
            answerIndex = 1,
            rationale = "A review that finds no change, deliberately, is still a review — but only if it looked for change.",
            id = "cap-q06", briefKey = "capstone/cap-reviews", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What kind of habit survives stress and tiredness?",
            options = listOf("A complicated, thorough check", "A simple, physical, practised habit — pause, check, send — not a new decision", "A habit that depends on alertness", "Willpower"),
            answerIndex = 1,
            rationale = "Tired minds cannot make new decisions well; simple, practised habits survive them.",
            id = "cap-q07", briefKey = "capstone/cap-stress", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why design habits for tired days rather than good days?",
            options = listOf("Because tired days are more common", "Because tired days are when habits are tested and mistakes are most likely", "Because good days need no habits", "Because tired days are harder"),
            answerIndex = 1,
            rationale = "Habits are tested on tired days; design for the test, not the easy case.",
            id = "cap-q08", briefKey = "capstone/cap-stress", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the pause-check-send habit protecting?",
            options = listOf("Speed", "The recipient: preventing sensitive material reaching the wrong chat", "Battery", "Politeness"),
            answerIndex = 1,
            rationale = "Pause, check the recipient, then send — a two-second habit against a permanent mistake.",
            id = "cap-q09", briefKey = "capstone/cap-stress", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is vigilance fatigue?",
            options = listOf("Getting better at OPSEC", "Constant alertness wearing out your ability to notice, so you start ignoring warnings — including real ones", "Being careless", "Laziness"),
            answerIndex = 1,
            rationale = "Fatigue is the failure mode of constant alertness, not of carelessness.",
            id = "cap-q10", briefKey = "capstone/cap-burnout", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How do you fix vigilance fatigue?",
            options = listOf("Push harder and stay more vigilant", "Reduce to the controls that matter most, automate what can be automated, and rest deliberately", "Stop all OPSEC for a month", "Ignore warnings"),
            answerIndex = 1,
            rationale = "Less, better-chosen vigilance, deliberately rested, restores attention.",
            id = "cap-q11", briefKey = "capstone/cap-burnout", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is constant alertness not vigilance?",
            options = listOf("It is vigilance", "Because constant alertness exhausts attention, and exhausted attention notices nothing", "Because it is tiring", "Because it is unsustainable"),
            answerIndex = 1,
            rationale = "Sustainable vigilance is selective and rested; constant alertness is fatigue.",
            id = "cap-q12", briefKey = "capstone/cap-burnout", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When life changes significantly, what should you update?",
            options = listOf("Only passwords", "Only the new job's details", "The whole threat model: critical information, adversaries, and exposures", "Nothing, if the old plan was good"),
            answerIndex = 1,
            rationale = "Life changes are whole-model changes, not single-detail changes.",
            id = "cap-q13", briefKey = "capstone/cap-updating", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is wrong with faithfully following an old plan after life changes?",
            options = listOf("Nothing", "The plan answers the old life's questions, not the new life's", "It is slower", "It is less thorough"),
            answerIndex = 1,
            rationale = "Faithfulness to an old plan is not faithfulness to the posture.",
            id = "cap-q14", briefKey = "capstone/cap-updating", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What triggers a threat-model update?",
            options = listOf("Only a security incident", "Any significant life change: job, city, public role, relationships, or routines", "Only a new device", "Only annually"),
            answerIndex = 1,
            rationale = "Life changes change the model; incidents are only one trigger among many.",
            id = "cap-q15", briefKey = "capstone/cap-updating", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When teaching someone OPSEC, what should you teach with?",
            options = listOf("Your own setup, as the clearest example", "Generic examples, and the learner's own situation", "Only theory", "Your setup with details changed"),
            answerIndex = 1,
            rationale = "Your setup is not teaching material; generic examples and the learner's situation are.",
            id = "cap-q16", briefKey = "capstone/cap-teaching", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why not teach with your own setup, even with details changed?",
            options = listOf("Because it is too advanced", "Because it leaks your posture, and a changed detail can be un-changed", "Because it is boring", "Because learners dislike it"),
            answerIndex = 1,
            rationale = "A changed detail is a detail that can be un-changed; the leak remains.",
            id = "cap-q17", briefKey = "capstone/cap-teaching", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What makes teaching practical without leaking?",
            options = listOf("Using the learner's own critical information and adversaries", "Using your own examples", "Avoiding examples", "Teaching only tools"),
            answerIndex = 1,
            rationale = "The learner's situation is the practical example that leaks nothing of yours.",
            id = "cap-q18", briefKey = "capstone/cap-teaching", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What counts as critical information?",
            options = listOf("Everything you own, do, or know", "What an adversary could use to harm you", "Only financial information", "Only secrets"),
            answerIndex = 1,
            rationale = "Critical information is defined by adversary use and harm, not by ownership or secrecy alone.",
            id = "cap-q19", briefKey = "capstone/cap-plan1", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is a hundred-item 'important' list not a plan?",
            options = listOf("It takes too long to write", "If everything is critical, nothing is — the list cannot guide choices", "It is too thorough", "It is hard to update"),
            answerIndex = 1,
            rationale = "Prioritisation is the plan; without it, there is only a list.",
            id = "cap-q20", briefKey = "capstone/cap-plan1", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How do you narrow a critical-information list?",
            options = listOf("Keep the first ten items", "Keep only financial items", "Ask what an adversary could use, and what harm it would cause, and keep only what passes both tests", "Keep what is easiest to protect"),
            answerIndex = 1,
            rationale = "Adversary use and harm are the two tests that narrow a list correctly.",
            id = "cap-q21", briefKey = "capstone/cap-plan1", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "In what order does the OPSEC process run?",
            options = listOf("Countermeasures, threats, risks", "Threats, risks, countermeasures", "Risks, threats, countermeasures", "Countermeasures, risks, threats"),
            answerIndex = 1,
            rationale = "Threats, risks, countermeasures — in that order — is the spine of the whole course.",
            id = "cap-q22", briefKey = "capstone/cap-plan2", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What justifies a countermeasure in a plan?",
            options = listOf("That you like the tool", "That it answers a named risk, which answers a named threat", "That it is popular", "That it is free"),
            answerIndex = 1,
            rationale = "Every countermeasure must answer a named risk; liking a tool is not a justification.",
            id = "cap-q23", briefKey = "capstone/cap-plan2", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why not choose countermeasures before threats and risks?",
            options = listOf("Because it is slower", "Because tools chosen first protect what you like, not what is threatened", "Because tools change", "Because threats are more interesting"),
            answerIndex = 1,
            rationale = "A plan full of liked tools is a hobby, not a posture.",
            id = "cap-q24", briefKey = "capstone/cap-plan2", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why do small decisions matter in a full-day exercise?",
            options = listOf("They do not; only big decisions matter", "Because small decisions compound into patterns, and patterns leak", "Because small decisions are easier", "Because days are long"),
            answerIndex = 1,
            rationale = "Patterns are built from small decisions; protecting the pattern means protecting each one.",
            id = "cap-q25", briefKey = "capstone/cap-scenario", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What discipline applies across a full day of decisions?",
            options = listOf("Instinct", "The same discipline to each: pause, check, minimise, record", "Care only for the biggest decision", "Speed"),
            answerIndex = 1,
            rationale = "One discipline, applied to every decision, protects both moments and patterns.",
            id = "cap-q26", briefKey = "capstone/cap-scenario", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does a capstone scenario test that single-brief drills do not?",
            options = listOf("Memory", "Whether discipline holds across a whole day of compounding decisions", "Speed", "Tool knowledge"),
            answerIndex = 1,
            rationale = "Capstone tests sustained discipline, not isolated knowledge.",
            id = "cap-q27", briefKey = "capstone/cap-scenario", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does completing all 120 briefs mean?",
            options = listOf("You are done with OPSEC", "You have finished the course, and now the posture must be maintained", "You are an expert", "You need no further practice"),
            answerIndex = 1,
            rationale = "Completion is the start of maintenance, not the end of the posture.",
            id = "cap-q28", briefKey = "capstone/cap-completion", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you set up before closing the course?",
            options = listOf("Nothing; you will remember", "A review schedule, an update trigger for life changes, and a practice habit", "A certificate on the wall", "A new course"),
            answerIndex = 1,
            rationale = "Maintenance must be scheduled before you finish, or it will not happen.",
            id = "cap-q29", briefKey = "capstone/cap-completion", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does the certificate record?",
            options = listOf("An accredited qualification", "A self-paced, on-device completion record — not an accredited qualification", "Expertise", "A job credential"),
            answerIndex = 1,
            rationale = "The certificate is explicitly a self-paced on-device completion record, not an accredited qualification.",
            id = "cap-q30", briefKey = "capstone/cap-completion", difficulty = "Advanced"
        )
    )
}
