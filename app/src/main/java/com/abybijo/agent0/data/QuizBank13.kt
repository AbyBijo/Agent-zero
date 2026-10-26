package com.abybijo.agent0.data

/** v2.0 Phase 4c: questions linked to CH-13 OSINT briefs, three per brief. */
object QuizBank13 {
    val all: List<QuizQuestion> = listOf(
        QuizQuestion(
            prompt = "Why is combined public information riskier than any single item?",
            options = listOf("It is not", "Because location, routine, and relationships together form a picture no single item shows", "Because combinations are illegal", "Because single items are always harmless"),
            answerIndex = 1,
            rationale = "Combination is the risk: pieces assemble into routines, locations, and networks.",
            id = "osint-q01", briefKey = "osint/osint-shadow", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Which categories form your public shadow?",
            options = listOf("Only social media posts", "Identity, location, relationships, and history, including old accounts", "Only public records", "Only photos"),
            answerIndex = 1,
            rationale = "The shadow spans identity, location, relationships, and history, including forgotten accounts.",
            id = "osint-q02", briefKey = "osint/osint-shadow", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What rule governs all self-audit work in this chapter?",
            options = listOf("Audit anyone who is public", "Defensive self-audit only, never investigating another person", "Audit only colleagues", "Audit only with permission from a platform"),
            answerIndex = 1,
            rationale = "Self-audit techniques must never be turned on another person.",
            id = "osint-q03", briefKey = "osint/osint-shadow", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should a self-audit search include?",
            options = listOf("Only your current name", "Names, usernames, emails, phone numbers, and photos, including image search and old usernames", "Only social media", "Only your email"),
            answerIndex = 1,
            rationale = "A complete audit covers names, usernames, emails, numbers, photos, and forgotten accounts.",
            id = "osint-q04", briefKey = "osint/osint-self-audit", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A colleague asks you to audit them 'to show them how exposed they are'. What should you do?",
            options = listOf("Audit them; it is helpful", "Decline to audit them, and teach them to audit themselves", "Audit them secretly", "Refuse to help at all"),
            answerIndex = 1,
            rationale = "Investigating another person is not self-defence, even with good intentions.",
            id = "osint-q05", briefKey = "osint/osint-self-audit", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should self-audit findings be sorted?",
            options = listOf("By date", "Into remove, restrict, or accept", "By platform", "By embarrassment"),
            answerIndex = 1,
            rationale = "Sorting into remove, restrict, or accept turns findings into actions.",
            id = "osint-q06", briefKey = "osint/osint-self-audit", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How do social media posts combine into unintended exposure?",
            options = listOf("They do not", "Photos show locations, tags show relationships, timestamps show routines, friend lists show networks", "Only through hashtags", "Only if posts are public"),
            answerIndex = 1,
            rationale = "Each post is a piece, and platforms assemble the pieces for anyone who looks.",
            id = "osint-q07", briefKey = "osint/osint-social", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why are friends' posts about you part of your shadow?",
            options = listOf("They are not", "Because tags, photos, and check-ins by friends reveal you, even when your own posts are careful", "Because friends share passwords", "Because platforms merge accounts"),
            answerIndex = 1,
            rationale = "Your shadow includes what others post about you, not only what you post.",
            id = "osint-q08", briefKey = "osint/osint-social", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What setting prevents tags appearing without your agreement?",
            options = listOf("Private account only", "Tag approval / tag review", "Blocking friends", "Deleting tags daily"),
            answerIndex = 1,
            rationale = "Tag approval makes future tags require your agreement before appearing.",
            id = "osint-q09", briefKey = "osint/osint-social", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Where do data brokers get personal information?",
            options = listOf("By hacking", "Largely from public records and other public sources, assembled into a package", "From governments only", "From your devices directly"),
            answerIndex = 1,
            rationale = "Brokers assemble public information; they do not create it by hacking.",
            id = "osint-q10", briefKey = "osint/osint-brokers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is broker removal maintenance, not a one-time fix?",
            options = listOf("It is a one-time fix", "Because brokers refresh their data and listings reappear", "Because removal expires legally", "Because brokers ignore requests"),
            answerIndex = 1,
            rationale = "Refreshed data restores listings, so removal must be repeated regularly.",
            id = "osint-q11", briefKey = "osint/osint-brokers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why can no paid service erase you from the internet completely?",
            options = listOf("It can, for a high fee", "Because removing a broker listing does not remove the underlying public record", "Because the internet is too large", "Because services are lazy"),
            answerIndex = 1,
            rationale = "Brokers assemble public records; the records themselves remain.",
            id = "osint-q12", briefKey = "osint/osint-brokers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What are the three categories for sorting exposure?",
            options = listOf("Public, private, secret", "Remove, reduce, or accept-and-adapt", "Delete, hide, ignore", "High, medium, low"),
            answerIndex = 1,
            rationale = "Remove your posts, reduce future exposure, and adapt around what cannot be removed.",
            id = "osint-q13", briefKey = "osint/osint-removal", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "In what priority order should removal be tackled?",
            options = listOf("Oldest first", "Location and routine first", "Easiest first", "Most embarrassing first"),
            answerIndex = 1,
            rationale = "Location and routine are the highest-risk exposure, so they come first.",
            id = "osint-q14", briefKey = "osint/osint-removal", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is chasing removal of what cannot be removed harmful?",
            options = listOf("It is not harmful", "It wastes effort and creates false comfort while real exposure stays", "It is illegal", "It alerts the source"),
            answerIndex = 1,
            rationale = "Effort spent on the unremovable is effort not spent on the removable.",
            id = "osint-q15", briefKey = "osint/osint-removal", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is publicity described as a one-way door?",
            options = listOf("Because events have one entrance", "Because you can become more public at any time, but becoming less public afterwards is slow and partial", "Because publicity is permanent by law", "Because audiences only grow"),
            answerIndex = 1,
            rationale = "Becoming less public after publicity is slow, partial, and often impossible.",
            id = "osint-q16", briefKey = "osint/osint-public-speaking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Before a public appearance, what should you check?",
            options = listOf("Audience size only", "What organisers and publishers will post about you, before they post it", "Ticket prices", "Other speakers"),
            answerIndex = 1,
            rationale = "Reviewing what others will post lets you control what becomes permanently public.",
            id = "osint-q17", briefKey = "osint/osint-public-speaking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the goal for public visibility in this chapter?",
            options = listOf("Maximum visibility", "Deliberate visibility, chosen rather than drifted into", "No visibility", "Visibility only for work"),
            answerIndex = 1,
            rationale = "Visibility itself is not the enemy; accidental exposure is.",
            id = "osint-q18", briefKey = "osint/osint-public-speaking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why delay travel and location posts until after returning?",
            options = listOf("To build suspense", "Because live posts announce that your home is empty, and when you return", "Because networks abroad are slow", "Because photos need editing"),
            answerIndex = 1,
            rationale = "Live travel posts announce absence and routine in real time.",
            id = "osint-q19", briefKey = "osint/osint-personal-life", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is most useful to an adversary in personal posts?",
            options = listOf("Opinions", "Routines: regular times, places, and routes", "Food photos", "Memes"),
            answerIndex = 1,
            rationale = "Routines predict where you will be, and when — the most actionable information.",
            id = "osint-q20", briefKey = "osint/osint-personal-life", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why ask before posting about another person?",
            options = listOf("Politeness only", "Because posting about them exposes them to your audience without their consent", "Because it is illegal otherwise", "Because they may dislike the photo"),
            answerIndex = 1,
            rationale = "Their privacy is not yours to trade for engagement.",
            id = "osint-q21", briefKey = "osint/osint-personal-life", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why can one household member's post expose the whole household?",
            options = listOf("It cannot", "Because households share an address, a network, and often devices", "Because families share passwords", "Because posts are always public"),
            answerIndex = 1,
            rationale = "A shared address, network, and devices mean one member's exposure is everyone's.",
            id = "osint-q22", briefKey = "osint/osint-household", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should household posting rules be set?",
            options = listOf("Imposed by one person", "Agreed together, written down, and revisited as children grow and circumstances change", "Set once and forgotten", "Enforced by monitoring"),
            answerIndex = 1,
            rationale = "Household protection is a conversation, not an imposed rule or surveillance.",
            id = "osint-q23", briefKey = "osint/osint-household", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you check beyond your own household's posts?",
            options = listOf("Nothing", "What schools, clubs, and organisations post about your family", "Neighbours' posts", "News coverage only"),
            answerIndex = 1,
            rationale = "Organisations post about families routinely, unless asked not to.",
            id = "osint-q24", briefKey = "osint/osint-household", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "For journalists, activists, and creators, what does higher visibility require?",
            options = listOf("Lower discipline, for speed", "Higher discipline, not lower", "No discipline, for authenticity", "Only legal advice"),
            answerIndex = 1,
            rationale = "Higher visibility attracts more motivated adversaries, so discipline must rise with it.",
            id = "osint-q25", briefKey = "osint/osint-public-roles", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What must be protected at least as carefully as yourself in public-facing work?",
            options = listOf("Your equipment", "Sources and contacts, and the fact of contact itself", "Your schedule", "Your audience"),
            answerIndex = 1,
            rationale = "A source's trust is not yours to trade, and the fact of contact itself can endanger them.",
            id = "osint-q26", briefKey = "osint/osint-public-roles", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should public-facing workers have ready in advance?",
            options = listOf("A public response to post", "A plan for doxxing and targeting, made before it happens", "Legal representation on retainer", "A second identity"),
            answerIndex = 1,
            rationale = "A doxxing plan made in advance beats one made in panic.",
            id = "osint-q27", briefKey = "osint/osint-public-roles", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a private core?",
            options = listOf("A secret identity", "The part of your life that will never be public, no matter the opportunity", "Encrypted storage", "A private account"),
            answerIndex = 1,
            rationale = "The private core is defined by what will never be public, whatever the opportunity.",
            id = "osint-q28", briefKey = "osint/osint-private-core", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does a public-private boundary need maintenance?",
            options = listOf("It does not", "Because a boundary declared once and never reviewed will drift with every new pressure", "Because platforms change", "Because audiences grow"),
            answerIndex = 1,
            rationale = "Boundaries drift under pressure unless reviewed and maintained.",
            id = "osint-q29", briefKey = "osint/osint-private-core", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What makes a public life sustainable, according to this chapter?",
            options = listOf("Constant visibility", "A private core that exists for itself, not for an audience", "Strict secrecy", "Large audiences"),
            answerIndex = 1,
            rationale = "A life that is not content is what makes the public part sustainable.",
            id = "osint-q30", briefKey = "osint/osint-private-core", difficulty = "Advanced"
        )
    )
}
