package com.abybijo.agent0.data

/**
 * CHAPTER 09 — AI-ERA OPSEC (Specialisation)
 *
 * What AI tools learn from you, what synthetic media does to trust, and how
 * to use AI without leaking the very information OPSEC exists to protect.
 * Defensive only: nothing here teaches how to create deceptive synthetic
 * media to harm others. New briefs are written to the v2.0 template from
 * the start: outcomes, how-to, best practices, and cautions are fields
 * on the brief itself, not a separate map.
 */
fun chapter09() = Chapter(
    id = "ai-era",
    index = 9,
    code = "CH-09",
    title = "AI-Era OPSEC",
    glyph = "\u25C8",
    tier = Tier.ADVANCED,
    tagline = "Use AI without feeding it the information you are protecting.",
    briefs = listOf(
        Brief(
            id = "ai-feed",
            title = "AI Tools and What You Feed Them",
            glyph = "\u25C9",
            summary = "A prompt, a file, and a conversation can each reveal more than you meant to share.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "An AI tool is not a private notebook. What you type, paste, or upload " +
                        "can be stored, reviewed, used to improve the service, or exposed " +
                        "in a later breach of that service. Treat every AI input as a " +
                        "disclosure, and decide before you send it whether that disclosure " +
                        "is acceptable."
                ),
                Block.Heading("What leaks, in practice", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Names, addresses, and identifiers pasted into a prompt or document.",
                        "Internal documents, code, and emails uploaded for summarising or editing.",
                        "The question itself: asking about a sensitive topic reveals that the topic matters to you.",
                        "Patterns over time: many small, harmless prompts can add up to a clear picture."
                    )
                ),
                Block.Field(
                    "The test before you send",
                    "Read the prompt as if it were published. If you would not publish it, " +
                        "do not send it — redact it, generalise it, or do the work locally instead."
                ),
                Block.Para(
                    "This is not a reason to avoid AI tools. It is a reason to use them " +
                        "deliberately: for public or low-sensitivity material, freely; for " +
                        "sensitive material, only with redactions, a trusted local tool, or " +
                        "not at all."
                )
            ),
            outcomes = listOf(
                "List what a prompt, a file, and a conversation can each reveal.",
                "Apply the publish test to an AI input before sending it.",
                "Decide when to redact, generalise, or work locally instead."
            ),
            howTo = listOf(
                "Before sending, remove names, identifiers, and internal details from the input.",
                "Generalise the question: ask about the pattern, not the specific case.",
                "Keep sensitive work in a local tool or a service whose data handling you have checked.",
                "Review what you have already shared, and stop sharing the same kind of material."
            ),
            bestPractices = listOf(
                "Assume AI inputs are stored and potentially reviewed, unless the service clearly says otherwise.",
                "Small leaks accumulate; the tenth harmless prompt can complete a picture."
            ),
            cautions = listOf(
                "A tool that feels private is not private; chat interfaces are services, not notebooks.",
                "Uploading a document leaks everything in it, not only the part you asked about."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to protecting data when using online services."),
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Recommendations for privacy-respecting tools and services.")
            )
        ),
        Brief(
            id = "ai-memory",
            title = "Prompts, Memory, and Model Retention",
            glyph = "\u25D1",
            summary = "What is remembered, where, and for how long — and how to take control of it.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Many AI services remember things across conversations: preferences, " +
                        "facts about you, and details from past chats. That memory is " +
                        "convenient, and it is also a store of your information held by " +
                        "someone else, governed by their settings, their retention policy, " +
                        "and their security."
                ),
                Block.Heading("Take control of memory", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Find the memory or history setting and read what it actually stores.",
                        "Turn memory off for sensitive use, or use a separate account or session for it.",
                        "Delete stored memories and past conversations regularly, not only when you remember to.",
                        "Do not correct a model into remembering a secret; a correction is also an input."
                    )
                ),
                Block.Warning(
                    "Retention is not deletion",
                    "Deleting a chat does not always delete the data from every system that " +
                        "processed it. Check the provider's retention policy, and assume a " +
                        "delay between deletion and disappearance."
                ),
                Block.Para(
                    "Memory is useful for ordinary work. The OPSEC question is not whether " +
                        "memory exists, but whether the things it remembers are things you " +
                        "would be comfortable with a stranger reading."
                )
            ),
            outcomes = listOf(
                "Explain what AI memory stores and where it lives.",
                "Turn memory off or separate it for sensitive use.",
                "Delete stored memories and conversations on a schedule."
            ),
            howTo = listOf(
                "Open the service's memory and history settings and read them, not just the summary.",
                "Use a separate session or account for sensitive topics.",
                "Delete past conversations that contain personal or work details.",
                "Re-check settings after updates, which sometimes reset them."
            ),
            bestPractices = listOf(
                "Default to memory off for anything sensitive; turn it on only for ordinary work.",
                "Treat a stored memory as a disclosure that persists until you delete it."
            ),
            cautions = listOf(
                "Deleting a chat in the interface does not guarantee immediate deletion everywhere.",
                "Settings change with updates; a setting you set once is not a setting you keep forever."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to data retention and account settings.")
            )
        ),
        Brief(
            id = "ai-work-home",
            title = "AI Assistants at Work and at Home",
            glyph = "\u2302",
            summary = "Separate work, personal, and sensitive use, or they will merge on their own.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "The same assistant often serves your job, your home, and your private " +
                        "life. When those uses share one account, one memory, and one " +
                        "history, information crosses boundaries you meant to keep: work " +
                        "details surface at home, personal details surface at work, and " +
                        "sensitive details surface in both."
                ),
                Block.Heading("Separate the uses", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Use separate accounts or profiles for work, personal, and sensitive use.",
                        "Check your employer's policy before putting work material into a personal AI account.",
                        "Keep a work assistant's memory and a personal assistant's memory apart.",
                        "Do not let a home device with a shared assistant hear work conversations by default."
                    )
                ),
                Block.Field(
                    "The employer's view",
                    "Work material put into a personal tool may breach your employer's rules " +
                        "even when the tool itself is secure. The risk is contractual and " +
                        "professional, not only technical."
                ),
                Block.Para(
                    "Separation is a habit, not a purchase. Two accounts and a rule about " +
                        "which one to use for what will do more than any single tool."
                )
            ),
            outcomes = listOf(
                "Separate work, personal, and sensitive AI use into different accounts or profiles.",
                "Check employer policy before using a personal AI account for work material.",
                "Keep home devices from capturing work conversations by default."
            ),
            howTo = listOf(
                "Create separate accounts or profiles for work and personal use.",
                "Write a one-line rule for yourself: which account for which kind of material.",
                "Review a home assistant's listening and history settings.",
                "Move any work material already in a personal account out of it, and delete it there."
            ),
            bestPractices = listOf(
                "Boundaries that are easy to keep are boundaries that get kept.",
                "When in doubt about work material, use the work-approved tool or do not use AI at all."
            ),
            cautions = listOf(
                "Shared accounts merge histories silently; you may not notice until a suggestion reveals it.",
                "A policy breach can cost a job even when no technical breach occurred."
            ),
            references = listOf(
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Recommendations for accounts and profiles.")
            )
        ),
        Brief(
            id = "ai-deepfake",
            title = "Deepfakes, Voice Cloning, and Synthetic Media",
            glyph = "\u25CE",
            summary = "Recognise synthetic media, and know what to do when you cannot tell.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "A voice, a face, and a video can now be convincingly faked with a " +
                        "short sample of the real thing. That changes verification: seeing " +
                        "and hearing are no longer proof. It also changes your own exposure: " +
                        "every public recording of you is potential training material for " +
                        "an impersonation."
                ),
                Block.Heading("When you receive synthetic-looking media", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Verify through a separate channel before acting on an urgent voice or video message.",
                        "Agree a code word with people who might need to reach you urgently.",
                        "Look for inconsistencies: lip sync, blinking, lighting, background, and unnatural pauses.",
                        "Remember that absence of obvious flaws proves nothing; good fakes have none."
                    )
                ),
                Block.Warning(
                    "When you cannot tell",
                    "If you cannot verify it, do not act on it. A delayed response to a real " +
                        "message costs little; an immediate response to a fake can cost a great deal."
                ),
                Block.Heading("Reduce your own exposure", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Limit public audio and video of yourself where you can.",
                        "Do not post voice samples, such as readings or songs, without thinking about reuse.",
                        "Tell family and colleagues that voice impersonation exists, before they receive one."
                    )
                )
            ),
            outcomes = listOf(
                "Explain why seeing and hearing are no longer proof of identity.",
                "Verify an urgent voice or video message through a separate channel.",
                "Reduce your own public audio and video exposure."
            ),
            howTo = listOf(
                "Agree a code word with family and close colleagues for urgent requests.",
                "For any urgent request by voice or video, call back on a number you already trust.",
                "Check public audio and video of yourself and remove what is unnecessary.",
                "Brief the people most likely to be targeted in your name."
            ),
            bestPractices = listOf(
                "Verification through a separate channel is the defence; detection alone is not.",
                "A code word agreed in advance is cheap and defeats most impersonations."
            ),
            cautions = listOf(
                "Good synthetic media has no obvious flaws; looking for flaws is not a reliable test.",
                "Urgency is the attacker's tool; it is designed to make you skip verification."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to verification and impersonation.")
            )
        ),
        Brief(
            id = "ai-phishing",
            title = "AI-Assisted Phishing and Social Engineering",
            glyph = "\u26A0",
            summary = "AI makes old attacks cheaper, faster, and more convincing — the defences stay procedural.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "AI tools let an attacker write fluent, personalised messages at scale, " +
                        "in any language, with correct names, job titles, and context scraped " +
                        "from public sources. The result is phishing that no longer looks " +
                        "like phishing: no typos, no awkward phrasing, no generic greeting."
                ),
                Block.Heading("What still gives it away", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "The request itself: money, credentials, or urgent action, especially in secret.",
                        "The channel: a message that arrived somewhere unexpected, or from a new account.",
                        "The pressure: a deadline that exists only to stop you checking.",
                        "The verification gap: no way to confirm it except through the message itself."
                    )
                ),
                Block.Field(
                    "The defence does not change",
                    "You cannot reliably detect AI-written phishing by style any more. You " +
                        "defend against it the same way as before: verify through a separate " +
                        "channel, and follow a procedure for sensitive requests."
                ),
                Block.Para(
                    "Report convincing attempts. The next target will not know what you " +
                        "learned unless you share it."
                )
            ),
            outcomes = listOf(
                "Explain why AI-written phishing is harder to spot by style alone.",
                "Defend against it with verification and procedure, not detection.",
                "Report convincing attempts so others are warned."
            ),
            howTo = listOf(
                "For any sensitive request, verify through a channel you trust, not the message.",
                "Follow a written procedure for money and credential requests, even when the message looks perfect.",
                "Report the attempt to your organisation or the impersonated service.",
                "Warn the people the attacker is likely to try next."
            ),
            bestPractices = listOf(
                "Style is no longer a reliable signal; procedure is.",
                "A request that cannot survive verification is a request to refuse."
            ),
            cautions = listOf(
                "Fluent, personalised, and correctly addressed does not mean legitimate.",
                "AI lets attackers personalise at scale; your public posts are their raw material."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to phishing and verification.")
            )
        ),
        Brief(
            id = "ai-media-evidence",
            title = "Images, Video, and AI-Generated Evidence",
            glyph = "\u25A3",
            summary = "Verify media before acting on it, and never treat a single image as proof.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Images and video can now be generated, altered, or taken out of " +
                        "context with little effort. A convincing image of an event, a " +
                        "document, or a person proves only that someone could produce such " +
                        "an image. Acting on it without verification — sharing it, " +
                        "accusing someone, or changing a decision — spreads the attack " +
                        "further than the attacker could alone."
                ),
                Block.Heading("Verify before you act", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Check the source: who published it first, and what else have they published?",
                        "Look for the same event reported independently, by sources that do not copy each other.",
                        "Check for context: when and where was this actually taken, and does that match the claim?",
                        "Reverse-search the image where you can, and check for signs of generation or editing."
                    )
                ),
                Block.Field(
                    "Sharing is acting",
                    "Forwarding unverified media is not neutral. It gives the media reach, " +
                        "credibility, and a new audience that trusts you more than the original source."
                ),
                Block.Para(
                    "If you cannot verify it, say so, and do not share it as if you had. " +
                        "Uncertainty stated plainly is more useful than confidence borrowed " +
                        "from a picture."
                )
            ),
            outcomes = listOf(
                "Verify an image or video before acting on or sharing it.",
                "Check source, independent reporting, and context separately.",
                "State uncertainty plainly when verification fails."
            ),
            howTo = listOf(
                "Trace the media to its earliest publication and its publisher.",
                "Find at least one independent source for the same claim.",
                "Reverse-search the image and check its context and date.",
                "If verification fails, do not share it as evidence."
            ),
            bestPractices = listOf(
                "One source is a claim; two independent sources are the beginning of evidence.",
                "Sharing is an action with consequences, not a neutral pass-along."
            ),
            cautions = listOf(
                "A convincing image proves only that it could be produced, not that it happened.",
                "Out-of-context real media is as misleading as generated media, and harder to spot."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to verifying information.")
            )
        ),
        Brief(
            id = "ai-agents",
            title = "Automation, Agents, and Delegated Access",
            glyph = "\u2699",
            summary = "When you let a tool act for you, you grant it everything it needs to act — check what that is.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "AI agents and automations can read your email, book travel, move " +
                        "money, and post on your behalf. To do that, they need access: to " +
                        "your accounts, your files, and your contacts. That access is the " +
                        "risk. An agent with broad access that is compromised, misled, or " +
                        "simply mistaken can do more damage, faster, than you could by hand."
                ),
                Block.Heading("Grant narrowly, review often", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Grant the minimum access the task needs, for the shortest time it needs it.",
                        "Never give an agent your main credentials; use scoped access or a separate account where possible.",
                        "Require confirmation before irreversible actions: payments, deletions, and messages to others.",
                        "Review granted access regularly, and revoke what is no longer used."
                    )
                ),
                Block.Warning(
                    "Delegation is not abdication",
                    "You remain responsible for what an agent does in your name. If you " +
                        "would not do it yourself without checking, do not let an agent do " +
                        "it without checking either."
                ),
                Block.Para(
                    "Start with low-stakes tasks, watch what the agent actually does, and " +
                        "expand access only when its behaviour has earned trust."
                )
            ),
            outcomes = listOf(
                "Grant AI agents minimum, time-limited access.",
                "Require confirmation before irreversible agent actions.",
                "Review and revoke agent access on a schedule."
            ),
            howTo = listOf(
                "List every account and permission an agent currently holds.",
                "Remove access for tasks you no longer automate.",
                "Turn on confirmation for payments, deletions, and outbound messages.",
                "Use a separate account for agent access where the service allows it."
            ),
            bestPractices = listOf(
                "Minimum access, minimum time, maximum visibility into what was done.",
                "Trust an agent in proportion to how long you have watched it behave correctly."
            ),
            cautions = listOf(
                "An agent can be misled by instructions hidden in data it reads.",
                "Broad access granted for convenience is broad access for an attacker who compromises the agent."
            ),
            references = listOf(
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Recommendations for accounts and permissions.")
            )
        ),
        Brief(
            id = "ai-verify-output",
            title = "Checking AI Output Before You Act on It",
            glyph = "\u2713",
            summary = "Verification is an OPSEC step, not an afterthought — especially when the output sounds certain.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "AI output sounds confident even when it is wrong, invented, or " +
                        "out of date. It can fabricate citations, misstate facts, and " +
                        "present a guess as a conclusion. Acting on it without checking — " +
                        "sending it to a colleague, quoting it in a decision, or following " +
                        "its instructions — turns one error into a chain of them."
                ),
                Block.Heading("Check what matters", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Verify facts, figures, and citations against a primary source before using them.",
                        "Check dates: an answer may describe a situation that has changed.",
                        "For instructions, test them in a safe place before applying them to real systems.",
                        "For decisions, ask what the output did not consider, and who would disagree."
                    )
                ),
                Block.Field(
                    "Confidence is not evidence",
                    "Fluent, well-structured, and detailed output feels true. That feeling " +
                        "is a property of the writing, not of the facts. Treat it as a draft " +
                        "to be checked, not a verdict to be followed."
                ),
                Block.Para(
                    "The more consequential the action, the more independent the check " +
                        "must be. A second AI tool is not an independent check of the first."
                )
            ),
            outcomes = listOf(
                "Verify AI output against a primary source before acting on it.",
                "Check facts, dates, and citations separately.",
                "Scale the check to the consequence of the action."
            ),
            howTo = listOf(
                "For any fact you will rely on, find it in a primary source yourself.",
                "Test instructions in a safe environment before applying them.",
                "Ask what the output omitted or who would disagree with it.",
                "Do not use a second AI tool as the only check on the first."
            ),
            bestPractices = listOf(
                "Treat AI output as a draft, not a verdict.",
                "The higher the stakes, the more independent the verification must be."
            ),
            cautions = listOf(
                "Fabricated citations look real; checking the citation, not just the claim, matters.",
                "Confidence in the writing is not evidence for the facts."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to verifying information.")
            )
        ),
        Brief(
            id = "ai-research-code",
            title = "AI in Research, Writing, and Code",
            glyph = "\u270E",
            summary = "Drafts, code, and citations leak too — through what you paste in and what you publish.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Using AI for research, writing, or code feels safer than chatting, " +
                        "because the material seems technical or generic. It is not. A " +
                        "draft can contain unpublished ideas, internal names, and private " +
                        "data. Code can contain credentials, internal addresses, and " +
                        "proprietary logic. Citations can be fabricated, and a published " +
                        "piece that repeats them spreads the fabrication."
                ),
                Block.Heading("Work cleanly", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Strip credentials, internal addresses, and private names from code before pasting it anywhere.",
                        "Do not paste unpublished research, drafts, or ideas into a public AI service.",
                        "Verify every citation an AI tool produces before publishing it.",
                        "Disclose AI assistance where your audience or employer expects it."
                    )
                ),
                Block.Warning(
                    "Code is data",
                    "A snippet pasted for debugging can contain a key, a token, or an " +
                        "internal endpoint. Search for secrets before you paste, not after."
                ),
                Block.Para(
                    "The safest workflow is boring: redact first, verify second, publish " +
                        "third. AI makes the first two steps more important, not less."
                )
            ),
            outcomes = listOf(
                "Strip secrets and private details from code and drafts before using AI tools.",
                "Verify AI-produced citations before publishing them.",
                "Disclose AI assistance where it is expected."
            ),
            howTo = listOf(
                "Search a code snippet for keys, tokens, and internal addresses before pasting it.",
                "Redact unpublished ideas and private names from drafts before AI assistance.",
                "Check every AI citation against its claimed source before publishing.",
                "Keep a note of what was AI-assisted, for yourself and for disclosure."
            ),
            bestPractices = listOf(
                "Redact first, verify second, publish third.",
                "Assume anything pasted into a service is retained by that service."
            ),
            cautions = listOf(
                "A single pasted credential can outlive the conversation that contained it.",
                "Fabricated citations in published work damage your credibility, not the tool's."
            ),
            references = listOf(
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Recommendations for code and documents.")
            )
        ),
        Brief(
            id = "ai-personal-rules",
            title = "AI-Era Personal Rules: A Practical Set",
            glyph = "\u25C8",
            summary = "A short, usable rule set for everyday AI use, built from this chapter.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "This chapter's lessons reduce to a set you can actually remember " +
                        "and use. Keep it short on purpose: a rule set you cannot recall " +
                        "under pressure is decoration, not defence."
                ),
                Block.Terminal(
                    listOf(
                        "1. Do not feed it what you would not publish.",
                        "2. Separate work, personal, and sensitive use.",
                        "3. Verify voice, video, and media through another channel.",
                        "4. Grant agents minimum access, and require confirmation.",
                        "5. Check AI output against a primary source before acting.",
                        "6. Review memory, history, and granted access regularly."
                    )
                ),
                Block.Heading("Make it yours", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Write these rules where you will see them when you open an AI tool.",
                        "Adjust them to your life, but do not quietly drop a rule that is inconvenient.",
                        "Revisit them when you adopt a new tool, not only when something goes wrong."
                    )
                ),
                Block.Para(
                    "Rules are not a substitute for judgement, but judgement is easier " +
                        "when the default answer is already decided."
                )
            ),
            outcomes = listOf(
                "State the six AI-era personal rules from memory.",
                "Apply them to a new AI tool before using it for sensitive material.",
                "Revisit and adjust the rules when your tools change."
            ),
            howTo = listOf(
                "Write the six rules where you will see them when opening an AI tool.",
                "Before a new tool, check it against each rule in turn.",
                "Schedule a regular review of memory, history, and granted access.",
                "When a rule is inconvenient, change the workflow, not the rule, unless you have a reason to record."
            ),
            bestPractices = listOf(
                "A short rule set you remember beats a long policy you never open.",
                "Defaults decided in advance survive pressure better than decisions made in it."
            ),
            cautions = listOf(
                "Rules quietly dropped for convenience are rules that no longer exist.",
                "A new tool resets the question; old approvals do not carry over automatically."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to everyday privacy practice.")
            )
        )
    )
)
