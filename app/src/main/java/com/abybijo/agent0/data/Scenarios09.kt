package com.abybijo.agent0.data

/** v2.0 Phase 4c: drills linked to CH-09 AI-Era briefs, one per brief. */
object Scenarios09 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "ai-feed-drill",
            title = "The Feed Knows Too Much",
            intro = "Your feed shows an ad for a product you only mentioned aloud yesterday, and a post about a place you visited last week. A friend asks how the app knew.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you explain first?",
                    choices = listOf(
                        ScenarioChoice("The app must be listening to your microphone", "bad1"),
                        ScenarioChoice("Your data — searches, location, contacts — is profiled and shared across services", "step2"),
                        ScenarioChoice("It is a coincidence; feeds are random", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "Your friend asks what to change. What do you recommend?",
                    choices = listOf(
                        ScenarioChoice("Delete the app and hope for the best", "bad2"),
                        ScenarioChoice("Review permissions, ad settings, and what data the app collects, then restrict it", "good1"),
                        ScenarioChoice("Turn off the phone's microphone permission only", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You review permissions and ad settings together, restrict location and contacts, and turn off personalised ads. The feed becomes less uncanny, because the profile feeding it is smaller.",
                    outcome = Outcome.GOOD,
                    lesson = "Feeds run on profiles built from your data. Shrinking the profile shrinks the feed's knowledge of you."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You blame the microphone and change nothing else. The profiling continues through searches, location, and data sharing, and the feed keeps knowing.",
                    outcome = Outcome.BAD,
                    lesson = "Microphone blame is a distraction. Profiling runs on many data sources, and only restricting them changes the outcome."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You dismiss it as coincidence and change nothing. The profile grows, and the feed's predictions get sharper, not duller.",
                    outcome = Outcome.BAD,
                    lesson = "Dismissing profiling as coincidence leaves the profile intact. Check the settings, or the pattern continues."
                )
            ),
            briefKey = "ai-era/ai-feed"
        ),
        Scenario(
            id = "ai-memory-drill",
            title = "The Assistant Remembers",
            intro = "An AI assistant answers a question using a private detail you shared with it months ago, in a conversation you had forgotten. You realise it has kept everything.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Keep using it — memory is convenient", "bad1"),
                        ScenarioChoice("Check what it has stored, and whether you can delete or disable memory", "step2"),
                        ScenarioChoice("Ask it to forget that one detail and move on", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You find a memory setting and a stored history. What is the safe move?",
                    choices = listOf(
                        ScenarioChoice("Delete stored memories and disable memory for sensitive topics", "good1"),
                        ScenarioChoice("Delete only the embarrassing item", "bad2"),
                        ScenarioChoice("Leave it — the provider promises privacy", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You delete stored memories, disable memory for sensitive topics, and stop sharing private details with the assistant. What it cannot recall, it cannot reveal.",
                    outcome = Outcome.GOOD,
                    lesson = "AI memory is a record. Delete it, disable it for sensitive topics, and do not feed it what it should not hold."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You trust the provider's promise and change nothing. The stored details remain, available to future prompts, future features, and future breaches.",
                    outcome = Outcome.BAD,
                    lesson = "A privacy promise does not delete a record. Only deletion and disabling change what is stored."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You delete one item and keep sharing. The assistant rebuilds its picture of you from everything else you continue to share.",
                    outcome = Outcome.BAD,
                    lesson = "Deleting one memory while continuing to share freely rebuilds the same profile."
                )
            ),
            briefKey = "ai-era/ai-memory"
        ),
        Scenario(
            id = "ai-work-home-drill",
            title = "Work Data in a Personal Chatbot",
            intro = "A colleague pastes a confidential work document into a public AI chatbot to summarise it, then shares the summary in the team chat. You see the message.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Use the summary — it is already in the chat", "bad1"),
                        ScenarioChoice("Tell the colleague the document is now outside company control, and escalate per policy", "step2"),
                        ScenarioChoice("Ignore it; it is the colleague's problem", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The colleague says the chatbot is free and everyone uses it. What is the key point?",
                    choices = listOf(
                        ScenarioChoice("Free tools still store and may train on what you paste", "good1"),
                        ScenarioChoice("It is fine if the summary is accurate", "bad1"),
                        ScenarioChoice("Only the document's author may complain", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You escalate, the document is treated as exposed, and the team agrees a rule: no confidential material in public AI tools, only in approved ones. The summary is deleted from the chat.",
                    outcome = Outcome.GOOD,
                    lesson = "Pasting confidential material into a public AI tool is disclosing it. Treat it as exposed, and set a rule before the next time."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You use the summary, spreading the exposed material further. When the exposure is discovered, the trail leads through everyone who forwarded it.",
                    outcome = Outcome.BAD,
                    lesson = "Using exposed material spreads the exposure. Contain it instead of forwarding it."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You ignore it. The colleague repeats the habit with more sensitive documents, until a serious exposure forces a response.",
                    outcome = Outcome.BAD,
                    lesson = "Ignoring a disclosure habit lets it grow. Raise it early, while the fix is still a conversation."
                )
            ),
            briefKey = "ai-era/ai-work-home"
        ),
        Scenario(
            id = "ai-deepfake-drill",
            title = "The Video That Cannot Be Real",
            intro = "A video circulates of a public figure saying something shocking. It looks real, sounds real, and your group chat is already reacting. You are asked to share it.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do before sharing?",
                    choices = listOf(
                        ScenarioChoice("Share it — it looks real and everyone is sharing it", "bad1"),
                        ScenarioChoice("Pause and check: source, other coverage, and signs of synthetic media", "step2"),
                        ScenarioChoice("Share it with a question mark, so you are not claiming it is true", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "No reputable source carries the claim, and the video's audio does not match its lip movements. What now?",
                    choices = listOf(
                        ScenarioChoice("Share it anyway with a disclaimer", "bad1"),
                        ScenarioChoice("Do not share it, and tell the group why: no source, mismatched audio, likely synthetic", "good1"),
                        ScenarioChoice("Wait for someone else to debunk it", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You do not share, and you explain the checks to the group. Two others delete their shares. The video's spread stops in your circle, at least.",
                    outcome = Outcome.GOOD,
                    lesson = "Pausing to verify, and explaining the check, stops synthetic media more effectively than any disclaimer on a share."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You share it. By the time it is debunked, it has been seen as true by people who will never see the correction.",
                    outcome = Outcome.BAD,
                    lesson = "A share with a disclaimer still spreads the content. Corrections rarely reach everyone the original did."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You wait. The video spreads unchecked through your circle, and the debunk, when it comes, is dismissed as a cover-up.",
                    outcome = Outcome.BAD,
                    lesson = "Waiting for someone else to verify leaves the field to the content itself. Verify, or do not share."
                )
            ),
            briefKey = "ai-era/ai-deepfake"
        ),
        Scenario(
            id = "ai-phishing-drill",
            title = "The Perfect Email, Written by AI",
            intro = "You receive an email from your manager, in their exact style, referencing a real project and asking you to approve an urgent payment. Nothing looks wrong — except a faint sense that the timing is odd.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Approve it — the style and project details match", "bad1"),
                        ScenarioChoice("Verify through a separate, known-good channel before acting", "step2"),
                        ScenarioChoice("Reply to the email asking if it is real", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "Your manager, reached by phone, says they sent nothing. What now?",
                    choices = listOf(
                        ScenarioChoice("Report it as AI-assisted phishing and delete it", "good1"),
                        ScenarioChoice("Ignore it, since you did not act", "bad2"),
                        ScenarioChoice("Forward it to colleagues as a warning, with the payment link intact", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You report it, and security confirms an AI-generated spear-phishing campaign using scraped project details. Your report helps block it for everyone.",
                    outcome = Outcome.GOOD,
                    lesson = "AI makes phishing flawless in style. Style is no longer evidence. Verify through a separate channel, and report."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You approve the payment, or forward the live link. Either way, the attacker profits from a message that looked perfect because a machine wrote it.",
                    outcome = Outcome.BAD,
                    lesson = "Flawless style is cheap now. A perfect-looking message is not a verified message."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You reply to the attacker, or ignore a live campaign. Replying confirms you are a responsive target; ignoring leaves the campaign running.",
                    outcome = Outcome.BAD,
                    lesson = "Never verify through the suspicious channel itself, and always report a confirmed phish."
                )
            ),
            briefKey = "ai-era/ai-phishing"
        ),
        Scenario(
            id = "ai-media-evidence-drill",
            title = "A Photo as Evidence",
            intro = "A colleague shows you a photo as proof of an incident and asks you to act on it immediately. The photo looks convincing, but you have no source, no metadata, and no second account.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Act on it — a photo is proof", "bad1"),
                        ScenarioChoice("Treat it as a claim, not proof, and seek a second source", "step2"),
                        ScenarioChoice("Dismiss it entirely — photos can be faked", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "No second source confirms it, and the photo's details do not match the claimed time and place. What now?",
                    choices = listOf(
                        ScenarioChoice("Act anyway, to be safe", "bad1"),
                        ScenarioChoice("Hold action, explain what is missing, and keep looking for corroboration", "good1"),
                        ScenarioChoice("Accuse the colleague of faking it", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You hold, explain the gaps, and keep checking. A second source later contradicts the photo. Acting on it would have harmed an innocent person.",
                    outcome = Outcome.GOOD,
                    lesson = "In the AI era, a photo is a claim, not proof. Corroboration, not appearance, decides whether to act."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You act on an uncorroborated photo. The action harms someone, and the photo is later shown to be synthetic.",
                    outcome = Outcome.BAD,
                    lesson = "Acting on appearance alone, in an era of synthetic media, risks real harm from false evidence."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You dismiss everything, including genuine evidence that follows. Blanket scepticism is as dangerous as blanket belief.",
                    outcome = Outcome.BAD,
                    lesson = "Scepticism means demanding corroboration, not dismissing every claim. Judge each piece on its evidence."
                )
            ),
            briefKey = "ai-era/ai-media-evidence"
        ),
        Scenario(
            id = "ai-agents-drill",
            title = "The Agent With Your Keys",
            intro = "An AI agent offers to handle your bookings, emails, and purchases for you. To work, it needs access to your accounts, your payment method, and your inbox. It promises to act only on your instructions.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you grant it?",
                    choices = listOf(
                        ScenarioChoice("Full access — that is the point of an agent", "bad1"),
                        ScenarioChoice("Least access for one narrow task, with limits and review", "step2"),
                        ScenarioChoice("Nothing — agents can never be trusted", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The agent books a more expensive option than you wanted, citing 'availability'. What does this teach you?",
                    choices = listOf(
                        ScenarioChoice("Agents interpret instructions loosely; set hard limits and review every action", "good1"),
                        ScenarioChoice("Give it more guidance and full access so it understands you better", "bad1"),
                        ScenarioChoice("Accept the booking; agents know best", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You set spending caps, require approval for purchases, and review the agent's actions weekly. It becomes a useful tool, bounded by rules you control.",
                    outcome = Outcome.GOOD,
                    lesson = "Agents act on your behalf, with your credentials. Bound them with least access, hard limits, and review — or do not use them."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Full access lets the agent spend, share, and commit you in ways you did not intend, and every action carries your name.",
                    outcome = Outcome.BAD,
                    lesson = "An agent's actions are your actions. Full access means full responsibility for what it does."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You refuse all agents and do everything manually, including tasks where a bounded agent would have saved time safely. Caution is good; blanket refusal is a lost tool.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Blanket refusal avoids risk but loses a useful tool. Bounded use — least access, limits, review — is the middle path."
                )
            ),
            briefKey = "ai-era/ai-agents"
        ),
        Scenario(
            id = "ai-verify-output-drill",
            title = "The Confident Wrong Answer",
            intro = "An AI assistant gives you a confident, detailed answer to a technical question, with citations that look real. Something feels slightly off, but you cannot say what.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do before using the answer?",
                    choices = listOf(
                        ScenarioChoice("Use it — it is detailed and cited", "bad1"),
                        ScenarioChoice("Check the citations and the key claims against a primary source", "step2"),
                        ScenarioChoice("Ask the assistant if it is sure", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "One citation does not exist, and a key claim contradicts the primary source. What now?",
                    choices = listOf(
                        ScenarioChoice("Use the parts that sound right", "bad1"),
                        ScenarioChoice("Discard the answer and work from the primary source", "good1"),
                        ScenarioChoice("Ask the assistant to fix it and trust the fix", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You work from the primary source and get the right answer. The assistant's confidence was never evidence; the source was.",
                    outcome = Outcome.GOOD,
                    lesson = "AI output is fluent, not verified. Check citations and key claims against primary sources before using it."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You use the answer. The error reaches your work, and is discovered by someone else, with your name on it.",
                    outcome = Outcome.BAD,
                    lesson = "Fluency is not accuracy. Using unverified output makes its errors your errors."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You ask the assistant if it is sure. It apologises, gives a new answer, and is confident again — and wrong again, differently.",
                    outcome = Outcome.BAD,
                    lesson = "Asking an AI if it is sure produces confidence, not verification. Only an outside source verifies."
                )
            ),
            briefKey = "ai-era/ai-verify-output"
        ),
        Scenario(
            id = "ai-research-code-drill",
            title = "The Code That Works — Unsafely",
            intro = "An AI coding assistant gives you code that works perfectly in testing. A colleague points out it handles user input without checking it, and stores a secret in plain text.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Ship it — it works, and the issues are theoretical", "bad1"),
                        ScenarioChoice("Fix the input handling and the secret storage before shipping", "step2"),
                        ScenarioChoice("Ask the assistant to make it secure and ship whatever it returns", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The fixed code needs review. What do you check?",
                    choices = listOf(
                        ScenarioChoice("That it still works in testing", "bad2"),
                        ScenarioChoice("Input handling, secrets, permissions, and what it does with data — then review it like human-written code", "good1"),
                        ScenarioChoice("Nothing — the assistant already fixed it", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You fix the flaws and review the result as you would any code. It ships working and safe, and you understand why.",
                    outcome = Outcome.GOOD,
                    lesson = "AI code must be reviewed like human code: working is not safe, and generated fixes need the same review as generated code."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You ship unsafe code, or ship an unreviewed fix. The flaw reaches users, with your name on the commit.",
                    outcome = Outcome.BAD,
                    lesson = "Working in testing is not safe in production. Input handling and secret storage are not theoretical issues."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You trust the assistant's fix without review. The fix introduces a new flaw, which you discover only after shipping.",
                    outcome = Outcome.BAD,
                    lesson = "An AI fix needs the same review as AI code. Trusting the fix blindly repeats the original mistake."
                )
            ),
            briefKey = "ai-era/ai-research-code"
        ),
        Scenario(
            id = "ai-personal-rules-drill",
            title = "Your AI Rules, Tested",
            intro = "You have written personal rules for AI use: no private data in public tools, verify output, no AI-made media shared as real. A busy day tempts you to break all three at once.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What holds on a busy day?",
                    choices = listOf(
                        ScenarioChoice("Break the rules just this once — the deadline matters more", "bad1"),
                        ScenarioChoice("Follow the rules, and let the deadline slip or the task shrink", "step2"),
                        ScenarioChoice("Follow the easy rules and break the hard one", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "A colleague asks why you are slower than the team, who paste everything into AI tools. What do you say?",
                    choices = listOf(
                        ScenarioChoice("Your rules protect data and accuracy, and speed built on exposure is not speed", "good1"),
                        ScenarioChoice("Nothing — rules are personal, and explaining them is pointless", "bad2"),
                        ScenarioChoice("Drop the rules to keep up", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You keep the rules, explain them plainly, and two colleagues adopt them. The deadline slips by an hour; nothing leaks, and nothing false ships.",
                    outcome = Outcome.GOOD,
                    lesson = "Personal AI rules only matter if they hold on busy days. A rule broken 'just this once' is a rule that does not exist."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You break the rules for speed. Private data enters a public tool, unverified output ships, and the busy day becomes a long incident.",
                    outcome = Outcome.BAD,
                    lesson = "Busy days are when rules matter most, because they are when mistakes are cheapest to make and costliest to fix."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You follow the easy rules and break the hard one. The hard rule was the one protecting the most sensitive data.",
                    outcome = Outcome.BAD,
                    lesson = "Partial compliance protects the easy parts and exposes the hard ones. Rules are a set, not a menu."
                )
            ),
            briefKey = "ai-era/ai-personal-rules"
        )
    )
}
