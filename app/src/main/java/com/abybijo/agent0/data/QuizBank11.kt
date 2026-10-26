package com.abybijo.agent0.data

/** v2.0 Phase 4c: questions linked to CH-11 Team OPSEC briefs, three per brief. */
object QuizBank11 {
    val all: List<QuizQuestion> = listOf(
        QuizQuestion(
            prompt = "Why can one careful person not carry a careless team?",
            options = listOf("They can, if careful enough", "An attacker needs only one gap, and a team's gap is everyone's gap", "Careful people are slower", "Teams do not share information"),
            answerIndex = 1,
            rationale = "Team exposure is collective: one member's gap exposes the whole team.",
            id = "team-q01", briefKey = "team/team-discipline", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a team posture?",
            options = listOf("One person's habits", "The shared, written-down habits for handling, storing, and sharing information", "A policy document nobody reads", "The manager's opinion"),
            answerIndex = 1,
            rationale = "A posture is shared and written down, or it is merely a hope.",
            id = "team-q02", briefKey = "team/team-discipline", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why treat a weak link as a design problem?",
            options = listOf("To avoid blaming anyone", "Because if one mistake exposes everything, the design is wrong, not just the person", "Because people cannot improve", "Because design is cheaper"),
            answerIndex = 1,
            rationale = "Design that lets one mistake cost everything will keep costing everything, whoever makes the mistake.",
            id = "team-q03", briefKey = "team/team-discipline", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does need-to-know mean in a real team?",
            options = listOf("Everyone is locked out of everything", "Each person can access what their work requires, and nothing more", "Only managers know anything", "Nothing is ever shared"),
            answerIndex = 1,
            rationale = "Need-to-know matches access to work, not blanket secrecy.",
            id = "team-q04", briefKey = "team/team-need-to-know", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When should access be reviewed?",
            options = listOf("Only when people leave", "When roles change, not only when people leave", "Never; access is permanent", "Only after incidents"),
            answerIndex = 1,
            rationale = "Roles change constantly, and access must change with them.",
            id = "team-q05", briefKey = "team/team-need-to-know", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does a workaround signal?",
            options = listOf("A disobedient employee", "That the access rule is wrong, not only that the person is", "That security is working", "That training is needed"),
            answerIndex = 1,
            rationale = "Workarounds are feedback on the rule; rules that block work get bypassed.",
            id = "team-q06", briefKey = "team/team-need-to-know", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why can a shared password not be revoked for one person?",
            options = listOf("It can, easily", "Because everyone knows it, revoking for one means changing it for all — which rarely happens", "Because passwords cannot change", "Because leavers forget it"),
            answerIndex = 1,
            rationale = "Shared credentials fail the revocability test by design.",
            id = "team-q07", briefKey = "team/team-shared", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What replaces a shared account?",
            options = listOf("A longer shared password", "Individual accounts with role-based access", "No account at all", "A shared password changed monthly"),
            answerIndex = 1,
            rationale = "Individual accounts can be revoked per person and traced per person.",
            id = "team-q08", briefKey = "team/team-shared", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why audit shared drives regularly?",
            options = listOf("To find old files", "Because access granted once is rarely reviewed, and accumulates", "To save storage", "Because drives fail"),
            answerIndex = 1,
            rationale = "Unreviewed access accumulates until everyone can see everything.",
            id = "team-q09", briefKey = "team/team-shared", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When should a departing member's access be revoked?",
            options = listOf("When someone remembers", "On the day they leave", "After a month, in case they return", "Only for senior staff"),
            answerIndex = 1,
            rationale = "Departure-day revocation is a rule, not a favour, and applies to every departure.",
            id = "team-q10", briefKey = "team/team-onboarding", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does an offboarding checklist commonly forget?",
            options = listOf("Email accounts", "Informal access: group chats, shared drives, and keys", "Payroll", "Desk keys only"),
            answerIndex = 1,
            rationale = "Formal accounts get revoked; informal access gets forgotten — and stays open.",
            id = "team-q11", briefKey = "team/team-onboarding", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does an onboarding/offboarding checklist need a named owner?",
            options = listOf("For blame", "So it is never nobody's job", "For paperwork", "Owners are optional"),
            answerIndex = 1,
            rationale = "Checklists without owners are hopes, not processes.",
            id = "team-q12", briefKey = "team/team-onboarding", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Where does team information most often actually leak?",
            options = listOf("Through hacking", "Through notes, recordings, and casual sharing after meetings", "Through printed documents only", "Through competitors"),
            answerIndex = 1,
            rationale = "Notes outlive meetings and travel further than the meeting ever intended.",
            id = "team-q13", briefKey = "team/team-meetings", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why are recordings the most sensitive form of meeting notes?",
            options = listOf("They take storage", "They capture what was said, not only what was decided", "They are hard to share", "They are always public"),
            answerIndex = 1,
            rationale = "Recordings preserve unguarded speech, not just agreed decisions.",
            id = "team-q14", briefKey = "team/team-meetings", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should meeting notes be stored?",
            options = listOf("Anywhere convenient", "Where only the meeting's intended audience can reach them", "In email, for everyone", "Nowhere; do not take notes"),
            answerIndex = 1,
            rationale = "Notes need the meeting's access rules, or they travel further than the meeting.",
            id = "team-q15", briefKey = "team/team-meetings", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should be agreed before giving a vendor access?",
            options = listOf("Nothing; trust the vendor", "Least access, data handling terms, and revocation ownership, in writing", "Only the price", "Only the timeline"),
            answerIndex = 1,
            rationale = "Terms agreed before access are terms you can enforce; after access, leverage is gone.",
            id = "team-q16", briefKey = "team/team-vendors", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the commonest vendor access failure?",
            options = listOf("Vendors stealing data", "Access left active after the contract ends", "Vendors refusing access", "Too little access"),
            answerIndex = 1,
            rationale = "Vendor access outlives vendor work when nobody owns revoking it.",
            id = "team-q17", briefKey = "team/team-vendors", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should every vendor access grant include?",
            options = listOf("A discount", "An expiry date and a named owner for revocation", "A public announcement", "Unlimited time"),
            answerIndex = 1,
            rationale = "Expiry plus ownership ensures access ends when work ends.",
            id = "team-q18", briefKey = "team/team-vendors", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is 'home is private' wrong for remote work?",
            options = listOf("It is not wrong", "Home is shared with family, guests, and smart devices, on untrusted networks", "Homes have no locks", "Remote work is unsafe by nature"),
            answerIndex = 1,
            rationale = "Home networks and spaces are shared, not controlled like an office.",
            id = "team-q19", briefKey = "team/team-remote", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why one set of rules for office and remote work?",
            options = listOf("For simplicity", "Rules that apply in only one setting get broken in the other", "Because managers prefer it", "Because offices are safer"),
            answerIndex = 1,
            rationale = "Split rules fail in whichever setting they do not cover.",
            id = "team-q20", briefKey = "team/team-remote", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What travels with a remote worker?",
            options = listOf("Their office", "Their posture: protections, separation, and discipline", "Their colleagues", "Nothing"),
            answerIndex = 1,
            rationale = "The office no longer travels with the person, so the posture must.",
            id = "team-q21", briefKey = "team/team-remote", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does a manager's bypassing of security rules teach the team?",
            options = listOf("Nothing", "That rules are optional, and will be bypassed in secret", "That managers are efficient", "That rules do not apply to anyone"),
            answerIndex = 1,
            rationale = "The manager's behaviour is the policy the team actually learns.",
            id = "team-q22", briefKey = "team/team-managers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What three things should a manager do for a team posture?",
            options = listOf("Write, enforce, punish", "Model it, explain it, resource it", "Delegate, ignore, audit", "Fund, hire, fire"),
            answerIndex = 1,
            rationale = "Modelling, explaining in terms of real work, and resourcing are what make a posture followed.",
            id = "team-q23", briefKey = "team/team-managers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does fear-driven compliance fail?",
            options = listOf("It does not fail", "It produces compliance theatre: rules followed where visible, bypassed where not, mistakes hidden", "It is too slow", "Teams dislike fear"),
            answerIndex = 1,
            rationale = "Fear hides mistakes until they become incidents.",
            id = "team-q24", briefKey = "team/team-managers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A teammate reports a mistake early. What should happen first?",
            options = listOf("Blame them", "Contain the exposure, using the incident sequence", "Discuss it with the whole team", "Keep it quiet"),
            answerIndex = 1,
            rationale = "Contain, learn, support — in that order. Blame or gossip comes after nothing.",
            id = "team-q25", briefKey = "team/team-mistake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is blame a security failure?",
            options = listOf("It hurts feelings", "It drives the next mistake underground, until one is never reported", "It is unkind", "It wastes time"),
            answerIndex = 1,
            rationale = "Blamed people hide mistakes; hidden mistakes become incidents.",
            id = "team-q26", briefKey = "team/team-mistake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does Rule 1 mean inside a team after an incident?",
            options = listOf("Tell no one", "Discuss it only with those who need to know, not as gossip", "Tell everyone, for transparency", "Tell the press"),
            answerIndex = 1,
            rationale = "Rule 1 inside a team means need-to-know discussion, not gossip and not silence.",
            id = "team-q27", briefKey = "team/team-mistake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What replaces annual security training?",
            options = listOf("Longer annual training", "Short, regular drills and reviews, one thing at a time", "No training", "Training only after incidents"),
            answerIndex = 1,
            rationale = "Small, regular, real drills build habits; annual presentations are forgotten within a week.",
            id = "team-q28", briefKey = "team/team-drills", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why must drills and reviews be blame-free?",
            options = listOf("To be kind", "Because blamed reviews become performances, not learning", "Because scores do not matter", "Because drills are optional"),
            answerIndex = 1,
            rationale = "Blame turns reviews into performances that hide the failures they exist to find.",
            id = "team-q29", briefKey = "team/team-drills", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What proves a team values its posture?",
            options = listOf("Saying so", "The schedule: drills and reviews that actually happen", "A policy document", "A large budget"),
            answerIndex = 1,
            rationale = "A habit is a schedule, not a sentiment; the schedule is the proof.",
            id = "team-q30", briefKey = "team/team-drills", difficulty = "Advanced"
        )
    )
}
