package com.abybijo.agent0.data

/**
 * CHAPTER 15 — SUSTAINING THE POSTURE AND CAPSTONE (Capstone)
 *
 * The course is only useful if it survives real life. This chapter turns
 * 15 chapters of learning into a routine and a complete personal plan,
 * and it is the last chapter by design — the certificate unlocks only
 * after this chapter's last brief.
 */
fun chapter15() = Chapter(
    id = "capstone",
    index = 15,
    code = "CH-15",
    title = "Sustaining the Posture and Capstone",
    glyph = "\u2605",
    tier = Tier.ADVANCED,
    tagline = "From course to routine — and a plan that survives real life.",
    briefs = listOf(
        Brief(
            id = "cap-daily",
            title = "From Course to Routine: Your Daily Posture",
            glyph = "\u2605",
            summary = "The smallest daily set that actually holds — the posture you can keep on a busy day.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "A course ends. A routine continues. The daily posture is " +
                        "the smallest set of habits that holds your security " +
                        "together on an ordinary day: the checks you make, the " +
                        "pauses you take, and the defaults you keep. It must be " +
                        "small enough to survive a busy day, because a posture " +
                        "that only works on quiet days is not a posture."
                ),
                Block.Heading("The smallest set that holds", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Pause before sharing, clicking, or granting access — the one habit that underlies everything.",
                        "Keep devices locked, accounts protected, and updates on.",
                        "Notice what is new or unexpected, and check it before acting on it.",
                        "End the day with nothing sensitive left open, shared, or exposed."
                    )
                ),
                Block.Field(
                    "Small beats complete",
                    "A five-item daily set you actually do beats a fifty-item " +
                        "set you abandon by Wednesday. Build the small set first, " +
                        "and add to it only when it holds."
                ),
                Block.Para(
                    "Write your daily set down, and put it where you will see " +
                        "it. A routine you cannot remember is a routine you do " +
                        "not have."
                )
            ),
            outcomes = listOf(
                "Define a small daily posture that survives a busy day.",
                "Identify the pause-before-acting habit as the foundation of daily OPSEC.",
                "Write the daily set down and place it where it will be seen."
            ),
            howTo = listOf(
                "Choose the smallest set of daily habits that covers sharing, clicking, access, and locking.",
                "Write the set down and place it where you will see it daily.",
                "Practise it for two weeks before adding anything to it.",
                "Remove anything that consistently fails, and replace it with something smaller."
            ),
            bestPractices = listOf(
                "Small and kept beats complete and abandoned.",
                "A routine you cannot remember is a routine you do not have."
            ),
            cautions = listOf(
                "A daily set that only works on quiet days is not a posture.",
                "Adding habits before the small set holds breaks the small set."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to sustaining good practice.")
            )
        ),
        Brief(
            id = "cap-reviews",
            title = "Weekly and Monthly OPSEC Reviews",
            glyph = "\u25C8",
            summary = "A review rhythm that catches drift before it becomes exposure.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Drift is how postures fail: slowly, unnoticed, one small " +
                        "exception at a time. Reviews catch drift. A weekly " +
                        "review catches what changed this week. A monthly review " +
                        "catches what changed this month — access, accounts, " +
                        "settings, and habits — before any of it becomes exposure."
                ),
                Block.Heading("Weekly and monthly", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Weekly: what did I share, grant, or install this week, and does it still need to exist?",
                        "Weekly: any new accounts, any new access, any new devices?",
                        "Monthly: review account access, shared drives, app permissions, and privacy settings.",
                        "Monthly: review your threat model — has anything in your life changed?"
                    )
                ),
                Block.Field(
                    "Reviews are scheduled, or they do not happen",
                    "A review you do 'when you have time' is a review you do " +
                        "never. Put it on a calendar, with a fixed day, and keep " +
                        "the appointment with yourself."
                ),
                Block.Para(
                    "Keep reviews short. Fifteen minutes weekly and thirty " +
                        "minutes monthly will catch more drift than an annual " +
                        "overhaul ever will."
                )
            ),
            outcomes = listOf(
                "Run a short weekly review of sharing, access, and new accounts.",
                "Run a monthly review of permissions, settings, and your threat model.",
                "Schedule reviews on a calendar, with a fixed day."
            ),
            howTo = listOf(
                "Put a weekly review and a monthly review on your calendar, on fixed days.",
                "Weekly: check what you shared, granted, or installed, and whether it still needs to exist.",
                "Monthly: review account access, shared drives, permissions, and settings.",
                "Monthly: ask whether your threat model has changed."
            ),
            bestPractices = listOf(
                "Short and regular beats long and annual.",
                "A review on a calendar happens; a review 'when you have time' does not."
            ),
            cautions = listOf(
                "Drift is slow and unnoticed; without reviews, it becomes exposure.",
                "An annual overhaul catches drift a year too late."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to sustaining good practice.")
            )
        ),
        Brief(
            id = "cap-stress",
            title = "Habits That Survive Stress and Tiredness",
            glyph = "\u2764",
            summary = "Designing for the day you are not at your best — because that is the day mistakes happen.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Mistakes do not happen on your best days. They happen when " +
                        "you are stressed, tired, rushed, or upset — when your " +
                        "attention is elsewhere and your habits are all you have. " +
                        "Design your habits for those days: make the safe action " +
                        "the easy action, and the risky action the one that " +
                        "requires effort."
                ),
                Block.Heading("Design for your worst day", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Make safe defaults automatic: locked devices, protected accounts, and verified contacts, set once.",
                        "Remove risky shortcuts: if a shortcut bypasses a check, it will be used on the worst day.",
                        "Delay consequential actions when stressed: sharing, sending, and granting can usually wait an hour.",
                        "Have a rule for tired days: if you are too tired to check, do not act — wait."
                    )
                ),
                Block.Field(
                    "Safe must be easy",
                    "On a stressed day, you will take the easiest path. If the " +
                        "easiest path is the safe path, you will be safe. If it " +
                        "is not, you will not be."
                ),
                Block.Para(
                    "Forgive yourself for a bad day, and fix the design that " +
                        "let it hurt you. Blame does not prevent the next bad day; " +
                        "design does."
                )
            ),
            outcomes = listOf(
                "Design habits so the safe action is the easy action.",
                "Delay consequential actions when stressed or tired.",
                "Fix the design after a bad day, instead of only blaming yourself."
            ),
            howTo = listOf(
                "Set safe defaults once: locked devices, protected accounts, verified contacts.",
                "Remove shortcuts that bypass checks.",
                "Adopt a tired-day rule: if you are too tired to check, do not act yet.",
                "After a mistake on a bad day, change the design, not only the intention."
            ),
            bestPractices = listOf(
                "Design for your worst day, because that is when mistakes happen.",
                "Safe must be easy, or stress will choose the risky path."
            ),
            cautions = listOf(
                "Shortcuts that bypass checks will be used on the worst day.",
                "Blame without design change guarantees the next bad day hurts the same way."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to sustaining good practice.")
            )
        ),
        Brief(
            id = "cap-burnout",
            title = "Burnout, Vigilance Fatigue, and Balance",
            glyph = "\u25CB",
            summary = "Why constant vigilance fails, and what replaces it — because a posture you cannot sustain is a posture you will abandon.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Constant vigilance is not sustainable. Nobody can be alert " +
                        "to everything, all the time, and trying produces vigilance " +
                        "fatigue: attention that dulls, warnings that get ignored, " +
                        "and eventually a posture abandoned entirely. The answer " +
                        "is not more vigilance. It is better design: defaults, " +
                        "routines, and reviews that carry the load, so your " +
                        "attention is spent only where it matters."
                ),
                Block.Heading("What replaces vigilance", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Defaults: set safe settings once, so you do not need to decide every time.",
                        "Routines: daily, weekly, and monthly habits that run without constant attention.",
                        "Priorities: spend attention on the risks that matter most, and accept the rest.",
                        "Rest: a posture that leaves no room for rest will be abandoned, and abandonment is the worst outcome."
                    )
                ),
                Block.Warning(
                    "Burnout is a security risk",
                    "A person who has burned out on security does not become " +
                        "careless in one area. They become careless everywhere, " +
                        "at once. Protecting your attention is protecting your security."
                ),
                Block.Para(
                    "Balance is not compromise. It is the recognition that a " +
                        "posture must fit a life, or it will not survive that life."
                )
            ),
            outcomes = listOf(
                "Explain why constant vigilance fails through vigilance fatigue.",
                "Replace vigilance with defaults, routines, and priorities.",
                "Treat burnout as a security risk, not a personal failing."
            ),
            howTo = listOf(
                "Set safe defaults once, so daily decisions are fewer.",
                "Build daily, weekly, and monthly routines that run without constant attention.",
                "Prioritise the risks that matter most, and accept the rest consciously.",
                "Protect time for rest, as part of the posture, not against it."
            ),
            bestPractices = listOf(
                "Defaults and routines carry the load; attention is spent only where it matters.",
                "A posture that fits a life survives that life."
            ),
            cautions = listOf(
                "Constant vigilance produces fatigue, then abandonment.",
                "Burnout makes a person careless everywhere, at once."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to sustaining good practice.")
            )
        ),
        Brief(
            id = "cap-updating",
            title = "Updating Your Threat Model as Life Changes",
            glyph = "\u21C4",
            summary = "New job, new place, new relationship, new risk — and a threat model that must change with them.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Your threat model is not permanent. It changes when your " +
                        "life changes: a new job, a new place, a new relationship, " +
                        "a new public role, a new adversary. A posture built for " +
                        "your old life will not protect your new one, and may " +
                        "even mislead you about where the risks now are."
                ),
                Block.Heading("When life changes, revisit", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "New job: new access, new colleagues, new information, new adversaries.",
                        "New place: new networks, new borders, new physical risks.",
                        "New relationship: new shared information, new household exposure, new routines.",
                        "New public role: new visibility, new motivated adversaries, new pressure."
                    )
                ),
                Block.Field(
                    "The monthly review is the trigger",
                    "Your monthly review asks whether your threat model has " +
                        "changed. Life changes are the answer. Use the review to " +
                        "catch them, and update the model before the new risks " +
                        "become incidents."
                ),
                Block.Para(
                    "Updating a threat model is not starting over. It is " +
                        "re-running the five steps — critical information, threats, " +
                        "vulnerabilities, countermeasures, and review — for the " +
                        "life you have now."
                )
            ),
            outcomes = listOf(
                "Recognise life changes that require a threat model update.",
                "Re-run the five-step process for a changed life.",
                "Use the monthly review as the trigger for updating."
            ),
            howTo = listOf(
                "When your life changes, list what is new: job, place, relationship, role.",
                "Re-run the five steps for the new situation.",
                "Update your daily set, your routines, and your reviews to match.",
                "Record the change and its date, so the next review can see it."
            ),
            bestPractices = listOf(
                "A threat model is a living document, not a one-time exercise.",
                "The monthly review exists to catch life changes."
            ),
            cautions = listOf(
                "A posture built for an old life misleads you about a new life's risks.",
                "Ignoring a life change until it becomes an incident is the commonest failure."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to threat modelling.")
            )
        ),
        Brief(
            id = "cap-teaching",
            title = "Teaching Others Without Leaking",
            glyph = "\u25C9",
            summary = "Helping family and colleagues while keeping Rule 1 — because teaching is sharing, and sharing must stay disciplined.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Teaching others is one of the best ways to strengthen your " +
                        "own posture — and one of the easiest ways to leak. " +
                        "Examples from your own life reveal your own risks. " +
                        "Stories about incidents reveal other people's. Teaching " +
                        "must therefore be disciplined: teach principles, not " +
                        "personal cases, and teach with examples that are not " +
                        "your own."
                ),
                Block.Heading("Teach principles, not cases", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Use general examples and public cases, not your own incidents or your team's.",
                        "Teach the habit, not the threat: what to do, not only what to fear.",
                        "Respect the learner's level: a family member needs different teaching from a colleague.",
                        "Do not use teaching to show off what you know about someone else's risks."
                    )
                ),
                Block.Field(
                    "Teaching is sharing",
                    "Every example you give is information you share. Choose " +
                        "examples that teach the principle without revealing " +
                        "anything that should stay private."
                ),
                Block.Para(
                    "The best teaching is quiet and practical: help someone " +
                        "set up two-factor authentication, review their settings, " +
                        "or write their own daily set. That help lasts longer " +
                        "than any lecture."
                )
            ),
            outcomes = listOf(
                "Teach OPSEC principles using general and public examples, not personal cases.",
                "Adapt teaching to the learner's level and needs.",
                "Help practically: settings, habits, and daily sets, not only lectures."
            ),
            howTo = listOf(
                "Choose examples that teach the principle without revealing private information.",
                "Teach the habit to practise, not only the threat to fear.",
                "Adapt to the learner: family, colleague, or team, each differently.",
                "Help with one practical change at a time."
            ),
            bestPractices = listOf(
                "Practical help lasts longer than lectures.",
                "General examples teach as well as personal ones, without the leak."
            ),
            cautions = listOf(
                "Personal examples leak your own risks; team examples leak your team's.",
                "Teaching to show off what you know about others' risks breaches Rule 1."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to helping others.")
            )
        ),
        Brief(
            id = "cap-plan1",
            title = "Your Personal OPSEC Plan, Part 1: Critical Information",
            glyph = "\u25A3",
            summary = "Writing down what you must protect, for yourself only — the first half of your personal plan.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "Your personal OPSEC plan begins with critical information: " +
                        "what, if exposed, would harm you, your household, or " +
                        "your work? Write it down, for yourself only, and keep " +
                        "it where only you can reach it. This is not a document " +
                        "to share. It is a document to think with."
                ),
                Block.Heading("What must you protect?", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Identity: what identifies you, and what would let someone impersonate you?",
                        "Location and routine: where you are, where you go, and when?",
                        "Relationships: who matters to you, and what would expose them?",
                        "Work: what information, if exposed, would harm your work or your colleagues?",
                        "Access: what credentials, keys, and recovery paths would let someone in?"
                    )
                ),
                Block.Warning(
                    "For yourself only",
                    "This plan contains exactly the information an adversary " +
                        "would want. Keep it private, offline if possible, and " +
                        "never share it, even with people you trust. Trust does " +
                        "not make a copy safe."
                ),
                Block.Para(
                    "Be honest and specific. A plan that says 'everything' " +
                        "protects nothing, because it prioritises nothing. A plan " +
                        "that names the real items can be acted on."
                )
            ),
            outcomes = listOf(
                "Write down your critical information, honestly and specifically.",
                "Keep the plan private, for yourself only.",
                "Prioritise: name the real items, not 'everything'."
            ),
            howTo = listOf(
                "List what would harm you, your household, or your work if exposed.",
                "Cover identity, location, routine, relationships, work, and access.",
                "Be specific: name the real items, not general categories.",
                "Keep the plan private and offline where possible, and never share it."
            ),
            bestPractices = listOf(
                "Specificity is what makes a plan actionable.",
                "A plan kept private is a plan that cannot be used against you."
            ),
            cautions = listOf(
                "This plan is exactly what an adversary would want; guard it accordingly.",
                "A plan that says 'everything' prioritises nothing."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to personal planning.")
            )
        ),
        Brief(
            id = "cap-plan2",
            title = "Your Personal OPSEC Plan, Part 2: Threats, Risks, and Countermeasures",
            glyph = "\u25A3",
            summary = "Completing the plan from the five-step process — threats, vulnerabilities, countermeasures, and review.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "Part 2 completes the plan you began in Part 1, using the " +
                        "five-step OPSEC process that runs through this whole " +
                        "course. For each item of critical information, ask: who " +
                        "threatens it, where are you vulnerable, what " +
                        "countermeasure will you use, and when will you review it?"
                ),
                Block.Heading("The five steps, applied to your life", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Identify critical information: your Part 1 list.",
                        "Analyse threats: who would want each item, and how motivated are they?",
                        "Analyse vulnerabilities: where could each item leak, in your actual life?",
                        "Apply countermeasures: what habit, setting, or tool protects each item?",
                        "Review: when will you revisit this plan, and what will trigger an earlier review?"
                    )
                ),
                Block.Field(
                    "A plan is a cycle, not a document",
                    "The fifth step — review — is what makes the plan alive. " +
                        "Without it, the plan ages, your life changes, and the " +
                        "plan quietly stops protecting you."
                ),
                Block.Para(
                    "Keep the completed plan with Part 1, private, for " +
                        "yourself only. Review it monthly, and whenever your " +
                        "life changes."
                )
            ),
            outcomes = listOf(
                "Complete a personal plan using all five OPSEC steps.",
                "Assign a countermeasure and a review date to each critical item.",
                "Keep the completed plan private and review it monthly."
            ),
            howTo = listOf(
                "For each Part 1 item, identify who threatens it and how motivated they are.",
                "Find where each item could leak in your actual life.",
                "Assign a habit, setting, or tool as its countermeasure.",
                "Set a monthly review date, and earlier triggers for life changes."
            ),
            bestPractices = listOf(
                "Every critical item gets a threat, a vulnerability, a countermeasure, and a review.",
                "Review is the step that keeps the plan alive."
            ),
            cautions = listOf(
                "A plan without review ages into irrelevance.",
                "Countermeasures that do not fit your life will not be used."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to personal planning.")
            )
        ),
        Brief(
            id = "cap-scenario",
            title = "Capstone Scenario: A Full-Day Decision Exercise",
            glyph = "\u25C8",
            summary = "A branching, full-day drill that uses every tier of the curriculum — Foundation, Core, Advanced, and Specialisation.",
            minutes = 6,
            blocks = listOf(
                Block.Para(
                    "This is the capstone exercise: a full day, from waking to " +
                        "sleeping, in which every decision draws on a different " +
                        "tier of the course. You will face a suspicious message, " +
                        "a meeting with a stranger, a border crossing, a team " +
                        "mistake, and a public post — and each decision will " +
                        "test whether the habits of fifteen chapters have become " +
                        "your own."
                ),
                Block.Heading("How to use this exercise", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Read each situation slowly, and decide before reading on.",
                        "For each decision, ask: which chapter does this belong to, and what does it teach?",
                        "Notice where you hesitate: hesitation shows where a habit is not yet automatic.",
                        "Afterwards, list the habits that held, and the ones that need more practice."
                    )
                ),
                Block.Field(
                    "The exercise is the test",
                    "There is no separate final exam in this course. This " +
                        "exercise, and your honest assessment of it, is the " +
                        "test — because in real life, there is no exam either. " +
                        "There are only decisions, made under pressure, with " +
                        "incomplete information."
                ),
                Block.Para(
                    "Use the drills in the Brief Completion Hub for this brief " +
                        "to practise the full-day exercise in branching form, " +
                        "and return to it whenever your life changes."
                )
            ),
            outcomes = listOf(
                "Apply Foundation, Core, Advanced, and Specialisation learning to a full day of decisions.",
                "Identify which habits are automatic and which need more practice.",
                "Assess your own posture honestly, without an exam."
            ),
            howTo = listOf(
                "Work through a full day of situations, deciding before reading on.",
                "For each decision, name the chapter and habit it tests.",
                "List habits that held and habits that need practice.",
                "Return to this exercise whenever your life changes."
            ),
            bestPractices = listOf(
                "Honest self-assessment beats a passing score.",
                "Hesitation is information: it shows where practice is needed."
            ),
            cautions = listOf(
                "In real life there is no exam, only decisions under pressure.",
                "Skipping the exercise and claiming completion defeats its purpose."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to practising OPSEC.")
            )
        ),
        Brief(
            id = "cap-completion",
            title = "Completion, Next Steps, and Staying Current",
            glyph = "\u2605",
            summary = "What to re-read, what to practise, and how to stay current without chasing every new tool.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "You have completed 120 briefs. That is a real achievement, " +
                        "and it is also a beginning: the posture you built must " +
                        "now survive real life, and the world it protects you " +
                        "in will keep changing. Staying current does not mean " +
                        "chasing every new tool or threat. It means returning " +
                        "to the fundamentals, regularly, and updating only what " +
                        "your life actually requires."
                ),
                Block.Heading("What to do next", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Re-read your personal plan monthly, and update it when life changes.",
                        "Practise the drills regularly, especially the ones you found hardest.",
                        "Revisit the chapters that matter most to your current life, not every chapter equally.",
                        "Follow one or two trusted, defensive sources for updates, and ignore the noise."
                    )
                ),
                Block.Field(
                    "The certificate is a record, not a finish line",
                    "Your certificate records that you completed this course, " +
                        "on your own device, at your own pace. It is not an " +
                        "accredited qualification. The real qualification is the " +
                        "posture you keep, day after day, after the course ends."
                ),
                Block.Para(
                    "Thank you for doing this work seriously. The habits you " +
                        "built here protect not only you, but the people around " +
                        "you. Keep them, review them, and pass them on — " +
                        "without leaking, and without fear."
                )
            ),
            outcomes = listOf(
                "Plan monthly plan reviews and regular drill practice after completion.",
                "Choose one or two trusted defensive sources for updates, ignoring noise.",
                "Understand the certificate as a self-paced, on-device completion record, not an accredited qualification."
            ),
            howTo = listOf(
                "Review your personal plan monthly, and update it on life changes.",
                "Practise drills regularly, especially the hardest ones.",
                "Revisit the chapters most relevant to your current life.",
                "Follow one or two trusted defensive sources for updates."
            ),
            bestPractices = listOf(
                "Staying current means returning to fundamentals, not chasing every tool.",
                "The posture you keep after the course is the real qualification."
            ),
            cautions = listOf(
                "Chasing every new tool and threat is noise, not currency.",
                "A certificate is a record, not a finish line."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to staying current.")
            )
        )
    )
)
