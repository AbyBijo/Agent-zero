package com.abybijo.agent0.data

/** v2.0 Phase 4c: questions linked to CH-09 AI-Era briefs, three per brief. */
object QuizBank09 {
    val all: List<QuizQuestion> = listOf(
        QuizQuestion(
            prompt = "Why can a feed seem to know things you never typed?",
            options = listOf("It reads your mind", "It profiles you from searches, location, contacts, and data shared across services", "Feeds are random", "It only uses what you post"),
            answerIndex = 1,
            rationale = "Feeds run on profiles built from many data sources, not only your posts.",
            id = "ai-q01", briefKey = "ai-era/ai-feed", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What most reduces what a feed knows about you?",
            options = listOf("Turning off microphone permission only", "Restricting permissions, ad settings, and data collection together", "Deleting one post", "Using the app less for a day"),
            answerIndex = 1,
            rationale = "Profiling uses many sources, so only restricting them together shrinks the profile.",
            id = "ai-q02", briefKey = "ai-era/ai-feed", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is 'the app is listening' usually the wrong explanation for uncanny ads?",
            options = listOf("Apps cannot listen at all", "Profiling from other data usually explains the prediction", "Ads are never personalised", "Microphones are disabled by law"),
            answerIndex = 1,
            rationale = "Search, location, purchase, and shared data usually explain predictions without any listening.",
            id = "ai-q03", briefKey = "ai-era/ai-feed", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "An AI assistant recalls a private detail you shared months ago. What does this show?",
            options = listOf("It has a good memory for you", "It retains what you share, and that record can surface later", "It guessed correctly", "It read your other apps"),
            answerIndex = 1,
            rationale = "AI memory is a stored record, and stored records surface in later conversations.",
            id = "ai-q04", briefKey = "ai-era/ai-memory", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the safest approach to sensitive topics with an AI assistant?",
            options = listOf("Share them; the provider promises privacy", "Delete stored memories and disable memory for sensitive topics", "Share them in code words", "Share them only once"),
            answerIndex = 1,
            rationale = "Only deletion and disabling change what is stored; promises do not delete records.",
            id = "ai-q05", briefKey = "ai-era/ai-memory", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does deleting one stored memory not solve AI memory risk?",
            options = listOf("It does solve it", "The assistant rebuilds its picture from everything else you keep sharing", "Deletion is impossible", "Memories are backed up forever"),
            answerIndex = 1,
            rationale = "Continued sharing rebuilds the same profile from new material.",
            id = "ai-q06", briefKey = "ai-era/ai-memory", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A colleague pastes a confidential document into a public AI chatbot. What has happened?",
            options = listOf("Nothing, if the summary is accurate", "The document has been disclosed outside company control", "Only the author is affected", "It is safe if the chatbot is free"),
            answerIndex = 1,
            rationale = "Public tools store and may train on pasted content, so pasting is disclosure.",
            id = "ai-q07", briefKey = "ai-era/ai-work-home", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do when you see confidential material pasted into a public AI tool?",
            options = listOf("Use the summary, since it is already out", "Treat it as exposed and escalate per policy", "Ignore it", "Delete your copy only"),
            answerIndex = 1,
            rationale = "Exposure must be contained and escalated, not spread further by forwarding.",
            id = "ai-q08", briefKey = "ai-era/ai-work-home", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is 'everyone uses it' not a justification for pasting work data into a public AI tool?",
            options = listOf("It is a justification", "Common use does not change what the tool stores or who can access it", "Free tools are always safe", "Only managers may decide"),
            answerIndex = 1,
            rationale = "Popularity does not alter a tool's data handling; pasted content is still disclosed.",
            id = "ai-q09", briefKey = "ai-era/ai-work-home", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the first check before sharing a shocking video?",
            options = listOf("How many people already shared it", "Its source, other coverage, and signs of synthetic media", "Whether it confirms your view", "How realistic it looks"),
            answerIndex = 1,
            rationale = "Source and corroboration, not realism or popularity, decide whether to share.",
            id = "ai-q10", briefKey = "ai-era/ai-deepfake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does sharing with a disclaimer still spread synthetic media?",
            options = listOf("It does not", "Most viewers see the content, not the disclaimer, and corrections rarely reach them all", "Disclaimers are illegal", "Platforms remove disclaimed posts"),
            answerIndex = 1,
            rationale = "A share spreads the content regardless of the note attached; corrections travel less far.",
            id = "ai-q11", briefKey = "ai-era/ai-deepfake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does this app's defensive-only rule mean for synthetic media?",
            options = listOf("You may create it for education", "You learn to detect and resist it, never to create deceptive media", "You may create it if labelled", "It applies only to videos"),
            answerIndex = 1,
            rationale = "The chapter is defensive only: detection and resistance, never creation of deceptive media.",
            id = "ai-q12", briefKey = "ai-era/ai-deepfake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "An email in your manager's exact style asks for an urgent payment. What is the key fact?",
            options = listOf("Style proves it is genuine", "AI makes flawless style cheap, so style is no longer evidence", "Managers never email about payments", "Urgent emails are always fake"),
            answerIndex = 1,
            rationale = "AI-generated phishing copies style perfectly; only out-of-band verification establishes genuineness.",
            id = "ai-q13", briefKey = "ai-era/ai-phishing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should you verify a suspicious payment request?",
            options = listOf("Reply to the email asking if it is real", "Verify through a separate, known-good channel", "Check the email's logo", "Wait for a second email"),
            answerIndex = 1,
            rationale = "The suspicious channel itself cannot verify the request; a separate channel can.",
            id = "ai-q14", briefKey = "ai-era/ai-phishing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "After confirming a message is AI-generated phishing, what should you do?",
            options = listOf("Ignore it, since you did not act", "Report it so it can be blocked for everyone", "Forward it with the link intact as a warning", "Reply to waste the attacker's time"),
            answerIndex = 1,
            rationale = "Reporting lets security block the campaign; ignoring leaves it running.",
            id = "ai-q15", briefKey = "ai-era/ai-phishing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "In the AI era, what is a photo presented without source or corroboration?",
            options = listOf("Proof", "A claim, not proof", "Worthless in all cases", "Proof if it looks real"),
            answerIndex = 1,
            rationale = "Synthetic media means appearance alone cannot establish truth; corroboration decides.",
            id = "ai-q16", briefKey = "ai-era/ai-media-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What decides whether to act on media evidence?",
            options = listOf("How convincing it looks", "Corroboration from a second, independent source", "How quickly it spreads", "Who showed it to you"),
            answerIndex = 1,
            rationale = "Independent corroboration, not appearance or popularity, establishes reliability.",
            id = "ai-q17", briefKey = "ai-era/ai-media-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is blanket scepticism — dismissing all media — also dangerous?",
            options = listOf("It is not dangerous", "It discards genuine evidence along with false evidence", "It is too slow", "It requires expertise"),
            answerIndex = 1,
            rationale = "Scepticism means demanding corroboration, not dismissing every claim outright.",
            id = "ai-q18", briefKey = "ai-era/ai-media-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "An AI agent needs your account access to act for you. What should you grant?",
            options = listOf("Full access, or it cannot work", "Least access for one narrow task, with limits and review", "Access only to your inbox", "Nothing ever"),
            answerIndex = 1,
            rationale = "Agents act with your credentials, so bound them with least access, limits, and review.",
            id = "ai-q19", briefKey = "ai-era/ai-agents", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "An agent books a more expensive option than you wanted. What is the lesson?",
            options = listOf("Give it more access so it understands you", "Agents interpret instructions loosely, so set hard limits and review actions", "Agents always choose the best option", "Accept its choice"),
            answerIndex = 1,
            rationale = "Loose interpretation plus broad access produces unintended commitments in your name.",
            id = "ai-q20", briefKey = "ai-era/ai-agents", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Who is responsible for an AI agent's actions taken with your credentials?",
            options = listOf("The agent's provider", "You, because the agent acts in your name", "No one", "The service it booked with"),
            answerIndex = 1,
            rationale = "An agent's actions are your actions, which is why its access must be bounded.",
            id = "ai-q21", briefKey = "ai-era/ai-agents", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "An AI answer is confident, detailed, and cited. What should you check first?",
            options = listOf("Its confidence level", "Its citations and key claims against a primary source", "Its length", "Whether it agrees with you"),
            answerIndex = 1,
            rationale = "Fluency and citations can both be fabricated; only a primary source verifies.",
            id = "ai-q22", briefKey = "ai-era/ai-verify-output", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You ask an AI if it is sure, and it apologises and gives a new answer. What have you gained?",
            options = listOf("Verification", "A new confident answer, not verification", "A correct answer", "Proof it was wrong before"),
            answerIndex = 1,
            rationale = "Asking for confidence produces confidence, not verification; only an outside source verifies.",
            id = "ai-q23", briefKey = "ai-era/ai-verify-output", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does using unverified AI output make its errors your errors?",
            options = listOf("It does not", "Because you put your name on work you did not verify", "Because AI output is copyrighted", "Because it is always wrong"),
            answerIndex = 1,
            rationale = "Publishing or acting on output adopts it as your work, errors included.",
            id = "ai-q24", briefKey = "ai-era/ai-verify-output", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "AI-generated code works in testing but mishandles user input and stores a secret in plain text. What should you do?",
            options = listOf("Ship it; testing passed", "Fix the flaws and review it like human-written code before shipping", "Ask the AI to fix it and ship the fix unreviewed", "Remove the tests"),
            answerIndex = 1,
            rationale = "Working is not safe; generated code and generated fixes both need human review.",
            id = "ai-q25", briefKey = "ai-era/ai-research-code", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does 'review AI code like human code' mean in practice?",
            options = listOf("Check only that it runs", "Check input handling, secrets, permissions, and data handling", "Trust it if it is long", "Run it once"),
            answerIndex = 1,
            rationale = "The same security checks apply regardless of who — or what — wrote the code.",
            id = "ai-q26", briefKey = "ai-era/ai-research-code", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is an AI fix not automatically trustworthy?",
            options = listOf("It is always trustworthy", "A fix can introduce new flaws, so it needs the same review as the original code", "Fixes are too short", "AI cannot fix code"),
            answerIndex = 1,
            rationale = "Generated fixes are generated code, with the same risk profile as the original.",
            id = "ai-q27", briefKey = "ai-era/ai-research-code", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Personal AI rules matter most when?",
            options = listOf("On quiet days", "On busy days, when breaking them is most tempting and most costly", "Never; rules are optional", "Only at work"),
            answerIndex = 1,
            rationale = "Busy days are when mistakes are cheapest to make and costliest to fix.",
            id = "ai-q28", briefKey = "ai-era/ai-personal-rules", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does 'a rule broken just this once is a rule that does not exist' mean?",
            options = listOf("Rules must never change", "Rules that bend under pressure do not protect you when pressure is highest", "Rules are useless", "You must follow rules perfectly forever"),
            answerIndex = 1,
            rationale = "A rule's value is in holding under pressure; exceptions under pressure void it.",
            id = "ai-q29", briefKey = "ai-era/ai-personal-rules", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A colleague's team pastes everything into public AI tools and works faster. What is the sound response?",
            options = listOf("Drop your rules to keep up", "Keep rules that protect data and accuracy; speed built on exposure is not speed", "Report the team", "Do the same, but secretly"),
            answerIndex = 1,
            rationale = "Speed gained by disclosing data and shipping unverified output is not a genuine advantage.",
            id = "ai-q30", briefKey = "ai-era/ai-personal-rules", difficulty = "Advanced"
        )
    )
}
