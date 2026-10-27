package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk drills, batch 4: 30 drills, a second drill per brief, for CH-09 to CH-11. */
object ScenariosBulk4 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "bulk-d101", title = "The Feed That Follows",
            intro = "After searching for a medical topic once, your feed fills with related ads for weeks. You never posted about it.",
            start = "step1", briefKey = "ai-era/ai-feed",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What built this feed?",
                    choices = listOf(
                        ScenarioChoice("A coincidence", "bad1"),
                        ScenarioChoice("Profiling from searches, clicks, and dwell time, assembled into an interest profile", "step2"),
                        ScenarioChoice("Your friends", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Stop searching", "bad1"),
                        ScenarioChoice("Limit history, ad personalisation, and tracking, and use separate contexts for sensitive searches", "good1"),
                        ScenarioChoice("Delete the app", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You shrink the profile feeding the feed, and sensitive searches stop following you for weeks.",
                    outcome = Outcome.GOOD, lesson = "Feeds run on profiles built from your behaviour. Shrinking the profile shrinks the feed's knowledge."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame coincidence, and the profile keeps growing.",
                    outcome = Outcome.BAD, lesson = "Feeds are not coincidence. They are profiles, and profiles are built from behaviour."),
                "bad2" to ScenarioStep(id = "bad2", text = "You delete the app, but the profile and its data remain with the provider.",
                    outcome = Outcome.BAD, lesson = "Deleting an app does not delete the profile behind it.")
            )
        ),
        Scenario(
            id = "bulk-d102", title = "The Assistant Remembers",
            intro = "Months later, a chatbot brings up a personal detail you told it once, in a different conversation.",
            start = "step1", briefKey = "ai-era/ai-memory",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What happened?",
                    choices = listOf(
                        ScenarioChoice("The chatbot guessed", "bad1"),
                        ScenarioChoice("Its memory stored your detail across sessions and recalled it", "step2"),
                        ScenarioChoice("A bug", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Keep chatting", "bad1"),
                        ScenarioChoice("Review and delete stored memories, limit what you share, and check memory settings", "good1"),
                        ScenarioChoice("Start a new account", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You clear stored memories and share less, treating the assistant as a record, not a confidant.",
                    outcome = Outcome.GOOD, lesson = "AI memory stores your words across sessions. Treat it as a record, not a conversation."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep chatting, adding more to a memory you never reviewed.",
                    outcome = Outcome.BAD, lesson = "Unreviewed memory grows with every chat. Review it, or it reviews you."),
                "bad2" to ScenarioStep(id = "bad2", text = "You start a new account, but the old memory remains stored under the old one.",
                    outcome = Outcome.BAD, lesson = "A new account does not erase an old memory. Delete it deliberately.")
            )
        ),
        Scenario(
            id = "bulk-d103", title = "Work on the Kitchen Table",
            intro = "You work from home. A family member walks past your screen during a sensitive video call.",
            start = "step1", briefKey = "ai-era/ai-work-home",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What boundary failed?",
                    choices = listOf(
                        ScenarioChoice("None; family is trusted", "bad1"),
                        ScenarioChoice("The work-home boundary: sensitive work visible and audible in a shared home space", "step2"),
                        ScenarioChoice("The video app", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Close the door sometimes", "bad1"),
                        ScenarioChoice("A dedicated space, screen privacy, headset use, and agreed household rules for sensitive calls", "good1"),
                        ScenarioChoice("Work only when alone", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You create a real boundary: space, screen, sound, and household agreement.",
                    outcome = Outcome.GOOD, lesson = "Home workspaces are shared spaces. Boundaries must cover sight, sound, and household agreement."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust family, and sensitive work stays visible to everyone passing.",
                    outcome = Outcome.BAD, lesson = "Trust does not close a sightline. Boundaries do."),
                "bad2" to ScenarioStep(id = "bad2", text = "You work only when alone, which is impractical and collapses within a week.",
                    outcome = Outcome.BAD, lesson = "Impractical boundaries collapse. Design ones that survive ordinary life.")
            )
        ),
        Scenario(
            id = "bulk-d104", title = "The Video That Was Not Real",
            intro = "A video of a public figure saying something shocking spreads fast. It looks completely real.",
            start = "step1", briefKey = "ai-era/ai-deepfake",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do before believing or sharing?",
                    choices = listOf(
                        ScenarioChoice("Share it; it looks real", "bad1"),
                        ScenarioChoice("Check the source, seek independent corroboration, and look for provenance", "step2"),
                        ScenarioChoice("Check the comments", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "No reputable source corroborates it. What then?",
                    choices = listOf(
                        ScenarioChoice("Share it with a disclaimer", "bad1"),
                        ScenarioChoice("Do not share it; warn others it is unverified if asked", "good1"),
                        ScenarioChoice("Share it privately", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You refuse to spread unverified synthetic media, and the fake stalls.",
                    outcome = Outcome.GOOD, lesson = "Realism is no longer evidence. Source, corroboration, and provenance are."),
                "bad1" to ScenarioStep(id = "bad1", text = "You share a convincing fake, and your credibility carries it further.",
                    outcome = Outcome.BAD, lesson = "Sharing is endorsement. A fake shared by you becomes your fake."),
                "bad2" to ScenarioStep(id = "bad2", text = "You trust comments, which are as easily faked as the video.",
                    outcome = Outcome.BAD, lesson = "Comments are not corroboration. Independent sources are.")
            )
        ),
        Scenario(
            id = "bulk-d105", title = "The Perfect Email",
            intro = "A phishing email arrives with perfect grammar, your name, your role, and a plausible request. Nothing looks wrong.",
            start = "step1", briefKey = "ai-era/ai-phishing",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you rely on now that grammar no longer signals phishing?",
                    choices = listOf(
                        ScenarioChoice("The logo", "bad1"),
                        ScenarioChoice("Verification through a separate channel, regardless of how convincing the message is", "step2"),
                        ScenarioChoice("Your instincts", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "The request is unusual for the sender. What do you do?",
                    choices = listOf(
                        ScenarioChoice("Comply; it looks legitimate", "bad1"),
                        ScenarioChoice("Pause and verify out-of-band before any action", "good1"),
                        ScenarioChoice("Reply asking for proof", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You verify out-of-band and discover a personalised AI phishing attempt.",
                    outcome = Outcome.GOOD, lesson = "AI makes phishing fluent and personal. Only independent verification defends you now."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust a perfect logo, which AI generates in seconds.",
                    outcome = Outcome.BAD, lesson = "Logos, grammar, and personalisation are all cheap to fake now."),
                "bad2" to ScenarioStep(id = "bad2", text = "You trust instincts trained on old phishing, which AI phishing defeats.",
                    outcome = Outcome.BAD, lesson = "Instincts trained on flawed phishing fail against flawless phishing.")
            )
        ),
        Scenario(
            id = "bulk-d106", title = "Photo as Proof",
            intro = "Someone presents a photo as proof of an event. You suspect it may be AI-generated.",
            start = "step1", briefKey = "ai-era/ai-media-evidence",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you check?",
                    choices = listOf(
                        ScenarioChoice("Whether it looks real", "bad1"),
                        ScenarioChoice("Provenance, corroboration, and chain of custody", "step2"),
                        ScenarioChoice("Its resolution", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Provenance is missing and no one corroborates it. What do you conclude?",
                    choices = listOf(
                        ScenarioChoice("It is probably real", "bad1"),
                        ScenarioChoice("It is unverified, and must not be treated as evidence", "good1"),
                        ScenarioChoice("It is fake", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You treat unverified media as unverified, not as evidence and not as fake.",
                    outcome = Outcome.GOOD, lesson = "Media without provenance or corroboration is unverified — neither evidence nor proven fake."),
                "bad1" to ScenarioStep(id = "bad1", text = "You judge by realism, which synthetic media now masters.",
                    outcome = Outcome.BAD, lesson = "Realism is no longer a test. Synthetic media passes it routinely."),
                "bad2" to ScenarioStep(id = "bad2", text = "You declare it fake without evidence, which is as unjustified as declaring it real.",
                    outcome = Outcome.BAD, lesson = "Unverified is not fake. Precision matters: say unverified.")
            )
        ),
        Scenario(
            id = "bulk-d107", title = "The Agent's Permissions",
            intro = "An AI agent offers to manage your inbox, calendar, and files. It asks for broad access to all three.",
            start = "step1", briefKey = "ai-era/ai-agents",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you grant?",
                    choices = listOf(
                        ScenarioChoice("Everything; it needs access to work", "bad1"),
                        ScenarioChoice("Least access for the specific task, for the shortest time, with review", "step2"),
                        ScenarioChoice("Nothing; agents are unsafe", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "After it acts, what do you check?",
                    choices = listOf(
                        ScenarioChoice("Nothing; it worked", "bad1"),
                        ScenarioChoice("What it did, what it accessed, and whether that matches what you asked", "good1"),
                        ScenarioChoice("Its speed", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You grant least access, review its actions, and revoke what it no longer needs.",
                    outcome = Outcome.GOOD, lesson = "Agents act with your access. Least access, shortest time, with review — and revocation after."),
                "bad1" to ScenarioStep(id = "bad1", text = "You grant broad access, and the agent's compromise becomes your compromise.",
                    outcome = Outcome.BAD, lesson = "Broad agent access is broad exposure. Least access is the rule."),
                "bad2" to ScenarioStep(id = "bad2", text = "You refuse all agents, losing useful help for want of proportionate controls.",
                    outcome = Outcome.BAD, lesson = "Refusal without proportion is not security; it is avoidance of useful tools.")
            )
        ),
        Scenario(
            id = "bulk-d108", title = "Confident and Wrong",
            intro = "An AI assistant gives a confident, detailed answer about a legal question. It cites cases that sound authoritative.",
            start = "step1", briefKey = "ai-era/ai-verify-output",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do before acting on it?",
                    choices = listOf(
                        ScenarioChoice("Act on it; it is detailed", "bad1"),
                        ScenarioChoice("Verify claims against independent, trusted sources", "step2"),
                        ScenarioChoice("Ask the AI again", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "The cited cases do not exist. What did you learn?",
                    choices = listOf(
                        ScenarioChoice("AI is useless", "bad1"),
                        ScenarioChoice("AI output is fluent by design, not accurate by design; confidence is not correctness", "good1"),
                        ScenarioChoice("This AI is broken", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You verify independently, catch fabricated citations, and act on verified information.",
                    outcome = Outcome.GOOD, lesson = "AI fluency is not accuracy. Verify consequential claims against independent sources."),
                "bad1" to ScenarioStep(id = "bad1", text = "You act on detailed fiction, and a legal decision rests on invented cases.",
                    outcome = Outcome.BAD, lesson = "Detail is not verification. Fabricated citations are detailed too."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ask the same AI again, which confidently confirms its own fiction.",
                    outcome = Outcome.BAD, lesson = "Asking the same source again verifies nothing. Independent sources verify.")
            )
        ),
        Scenario(
            id = "bulk-d109", title = "Pasted Secrets",
            intro = "A colleague pastes confidential work material into a public AI tool to 'summarise it quickly'.",
            start = "step1", briefKey = "ai-era/ai-research-code",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What just happened?",
                    choices = listOf(
                        ScenarioChoice("Nothing; it is just a summary", "bad1"),
                        ScenarioChoice("Confidential material was disclosed to an external provider, possibly for storage or training", "step2"),
                        ScenarioChoice("A productivity gain", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Do the same; it is convenient", "bad1"),
                        ScenarioChoice("Treat AI tools as external recipients: never paste sensitive material, and flag the exposure", "good1"),
                        ScenarioChoice("Delete the chat", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You flag the exposure and stop pasting sensitive material into external tools.",
                    outcome = Outcome.GOOD, lesson = "AI tools are external recipients. Pasted material may be stored or trained on."),
                "bad1" to ScenarioStep(id = "bad1", text = "You treat a summary as harmless, while confidential material leaves your control.",
                    outcome = Outcome.BAD, lesson = "Summarising does not declassify. The material left control the moment it was pasted."),
                "bad2" to ScenarioStep(id = "bad2", text = "You delete the chat, but the provider may already hold the material.",
                    outcome = Outcome.BAD, lesson = "Deleting your copy does not delete the provider's copy.")
            )
        ),
        Scenario(
            id = "bulk-d110", title = "Your Own AI Rules",
            intro = "You have no personal rules for AI tools, so each new tool gets whatever you feel like sharing that day.",
            start = "step1", briefKey = "ai-era/ai-personal-rules",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the problem?",
                    choices = listOf(
                        ScenarioChoice("None; flexibility is good", "bad1"),
                        ScenarioChoice("Without rules, sharing is decided by mood, and sensitive material slips out", "step2"),
                        ScenarioChoice("Rules are restrictive", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is a good first rule?",
                    choices = listOf(
                        ScenarioChoice("Never use AI", "bad1"),
                        ScenarioChoice("Never paste sensitive personal or work material into AI tools", "good1"),
                        ScenarioChoice("Use only one tool", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You adopt a simple first rule, and sensitive sharing stops depending on mood.",
                    outcome = Outcome.GOOD, lesson = "Personal AI rules replace mood-based sharing with decided boundaries."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep deciding by mood, and sensitive material keeps slipping out on bad days.",
                    outcome = Outcome.BAD, lesson = "Mood is not a policy. Bad days leak what good days would protect."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ban AI entirely, which collapses at the first deadline.",
                    outcome = Outcome.BAD, lesson = "Total bans collapse under pressure. Simple, keepable rules survive.")
            )
        ),
        Scenario(
            id = "bulk-d111", title = "The Forgotten Account",
            intro = "Mapping your financial footprint, you find an old account you forgot: still open, still holding data, still linked to your email.",
            start = "step1", briefKey = "financial/fin-footprint",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "Why does it matter?",
                    choices = listOf(
                        ScenarioChoice("It does not; you do not use it", "bad1"),
                        ScenarioChoice("Unused accounts still hold data, can be breached, and can be used for fraud", "step2"),
                        ScenarioChoice("It costs fees", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Leave it", "bad1"),
                        ScenarioChoice("Close it, confirm closure, and request data deletion where possible", "good1"),
                        ScenarioChoice("Change its password", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You close the forgotten account and confirm deletion, shrinking your footprint.",
                    outcome = Outcome.GOOD, lesson = "Forgotten accounts are live exposure. Close, confirm, request deletion."),
                "bad1" to ScenarioStep(id = "bad1", text = "You leave a forgotten account open, and it is breached a year later.",
                    outcome = Outcome.BAD, lesson = "Unused does not mean safe. Open accounts are breached like active ones."),
                "bad2" to ScenarioStep(id = "bad2", text = "You change its password but leave it open, data intact, access intact.",
                    outcome = Outcome.BAD, lesson = "A new password on a forgotten account is still a forgotten account.")
            )
        ),
        Scenario(
            id = "bulk-d112", title = "Bills and Secrets Together",
            intro = "One account pays your rent, your subscriptions, and a sensitive membership. Its statement tells your whole story.",
            start = "step1", briefKey = "financial/fin-separation",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the fix?",
                    choices = listOf(
                        ScenarioChoice("A different bank", "bad1"),
                        ScenarioChoice("Separate accounts by purpose, so no single record shows everything", "step2"),
                        ScenarioChoice("Paper statements", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What goes where?",
                    choices = listOf(
                        ScenarioChoice("Everything in one place for simplicity", "bad1"),
                        ScenarioChoice("Bills, daily spending, and sensitive payments in separate accounts", "good1"),
                        ScenarioChoice("Randomly", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You separate by purpose, and no single statement tells your whole story.",
                    outcome = Outcome.GOOD, lesson = "Separation means no single record shows everything. Bills, spending, and sensitive payments apart."),
                "bad1" to ScenarioStep(id = "bad1", text = "You switch banks, but one account still shows everything.",
                    outcome = Outcome.BAD, lesson = "The bank is not the problem; the single record is."),
                "bad2" to ScenarioStep(id = "bad2", text = "You use paper statements, which are still complete records, now also physical.",
                    outcome = Outcome.BAD, lesson = "Paper does not separate. Accounts do.")
            )
        ),
        Scenario(
            id = "bulk-d113", title = "Card Trail",
            intro = "Reviewing a year of card transactions, you can reconstruct your routines, contacts, and movements from merchants and times.",
            start = "step1", briefKey = "financial/fin-payments",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do card records reveal?",
                    choices = listOf(
                        ScenarioChoice("Only amounts", "bad1"),
                        ScenarioChoice("Merchant, time, location, amount, and patterns over time", "step2"),
                        ScenarioChoice("Nothing personal", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change for sensitive purchases?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Use a separated payment method or cash, within legal limits, so sensitive purchases do not ride your main trail", "good1"),
                        ScenarioChoice("A new card", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You separate sensitive purchases from your main card trail.",
                    outcome = Outcome.GOOD, lesson = "Card records reveal routines and contacts over time. Separate sensitive purchases from the main trail."),
                "bad1" to ScenarioStep(id = "bad1", text = "You see only amounts, and miss that merchants and times reconstruct your life.",
                    outcome = Outcome.BAD, lesson = "Amounts are the least of it. Merchants, times, and patterns are the story."),
                "bad2" to ScenarioStep(id = "bad2", text = "You get a new card from the same account, and the trail continues uninterrupted.",
                    outcome = Outcome.BAD, lesson = "A new card on the same account is the same trail.")
            )
        ),
        Scenario(
            id = "bulk-d114", title = "Prepaid, But Not Anonymous",
            intro = "You buy a prepaid card for privacy, paying with your main card and activating it with your phone number.",
            start = "step1", briefKey = "financial/fin-cash-prepaid",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What linked the prepaid card to you?",
                    choices = listOf(
                        ScenarioChoice("Nothing; prepaid is anonymous", "bad1"),
                        ScenarioChoice("Purchase records and activation details linking it to you", "step2"),
                        ScenarioChoice("The card number", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is prepaid's real benefit?",
                    choices = listOf(
                        ScenarioChoice("Anonymity", "bad1"),
                        ScenarioChoice("Reduced linkage and limited exposure, not anonymity", "good1"),
                        ScenarioChoice("No benefit", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You use prepaid for reduced linkage, understanding its limits.",
                    outcome = Outcome.GOOD, lesson = "Prepaid reduces linkage; it does not grant anonymity. Purchase and activation can still link it to you."),
                "bad1" to ScenarioStep(id = "bad1", text = "You assume prepaid is anonymous, and act as if untraceable.",
                    outcome = Outcome.BAD, lesson = "Assuming anonymity produces the riskiest behaviour. Prepaid is pseudonymous at best."),
                "bad2" to ScenarioStep(id = "bad2", text = "You dismiss prepaid entirely, losing a useful reduction in linkage.",
                    outcome = Outcome.BAD, lesson = "Reduced linkage is still valuable, even without anonymity.")
            )
        ),
        Scenario(
            id = "bulk-d115", title = "Subscription You Forgot",
            intro = "A subscription you stopped using three years ago is still charging monthly and still holds your data.",
            start = "step1", briefKey = "financial/fin-subscriptions",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is it costing?",
                    choices = listOf(
                        ScenarioChoice("Only money", "bad1"),
                        ScenarioChoice("Money, data exposure, and live access — all without benefit", "step2"),
                        ScenarioChoice("Nothing", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Pause it", "bad1"),
                        ScenarioChoice("Cancel it, confirm cancellation, and request data deletion", "good1"),
                        ScenarioChoice("Ignore it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You cancel, confirm, and request deletion, closing a forgotten door.",
                    outcome = Outcome.GOOD, lesson = "Forgotten subscriptions keep charging, keep data, and keep access. Cancel, confirm, delete."),
                "bad1" to ScenarioStep(id = "bad1", text = "You pause it, keeping data and access alive for a service you do not use.",
                    outcome = Outcome.BAD, lesson = "Pausing preserves exposure. Cancelling ends it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ignore it, and three more years of charges and exposure accumulate.",
                    outcome = Outcome.BAD, lesson = "Ignoring a subscription is paying for exposure you do not want.")
            )
        ),
        Scenario(
            id = "bulk-d116", title = "Phone Lost, Money Exposed",
            intro = "Your phone is stolen. It has banking apps logged in, with no additional authentication.",
            start = "step1", briefKey = "financial/fin-banking-apps",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did the thief gain?",
                    choices = listOf(
                        ScenarioChoice("A phone", "bad1"),
                        ScenarioChoice("Access to money, not just messages, because banking apps were logged in", "step2"),
                        ScenarioChoice("Your contacts", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What should have protected the apps?",
                    choices = listOf(
                        ScenarioChoice("A phone case", "bad1"),
                        ScenarioChoice("Strongest available authentication on banking apps, plus transaction alerts and remote wipe", "good1"),
                        ScenarioChoice("A short PIN", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You enable strong app authentication, alerts, and remote wipe, so a stolen phone is not a stolen wallet.",
                    outcome = Outcome.GOOD, lesson = "Banking apps turn phone theft into money theft. Authenticate apps strongly, alert transactions, enable wipe."),
                "bad1" to ScenarioStep(id = "bad1", text = "You see a stolen phone, missing that logged-in banking apps make it a stolen wallet.",
                    outcome = Outcome.BAD, lesson = "A phone with logged-in banking is a wallet. Protect it as one."),
                "bad2" to ScenarioStep(id = "bad2", text = "You rely on a short PIN, which a thief observes or guesses.",
                    outcome = Outcome.BAD, lesson = "Short PINs are observable and guessable. Banking apps need stronger authentication.")
            )
        ),
        Scenario(
            id = "bulk-d117", title = "Public Ledger, Private Life",
            intro = "You use cryptocurrency believing it is anonymous. Someone links your address to your identity and reads your transaction history.",
            start = "step1", briefKey = "financial/fin-crypto",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What was wrong with the belief?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Most crypto is pseudonymous, not anonymous; public ledgers make transactions visible", "step2"),
                        ScenarioChoice("The exchange", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How was the address linked?",
                    choices = listOf(
                        ScenarioChoice("By magic", "bad1"),
                        ScenarioChoice("Through exchanges, metadata, and transaction patterns", "good1"),
                        ScenarioChoice("By the wallet", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You understand crypto as pseudonymous and act accordingly.",
                    outcome = Outcome.GOOD, lesson = "Crypto is pseudonymous, not anonymous. Public ledgers plus linkage expose transaction history."),
                "bad1" to ScenarioStep(id = "bad1", text = "You act as if anonymous, and your transaction history becomes public knowledge.",
                    outcome = Outcome.BAD, lesson = "Assuming anonymity produces behaviour that linkage then exposes."),
                "bad2" to ScenarioStep(id = "bad2", text = "You blame the exchange, missing that the ledger itself is public.",
                    outcome = Outcome.BAD, lesson = "The ledger is public by design. Linkage needs only one bridge to identity.")
            )
        ),
        Scenario(
            id = "bulk-d118", title = "Tax Records in Email",
            intro = "Your tax records live in your email, unencrypted, searchable, and synced to every device.",
            start = "step1", briefKey = "financial/fin-tax-records",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the risk?",
                    choices = listOf(
                        ScenarioChoice("None; email is private", "bad1"),
                        ScenarioChoice("Sensitive financial records exposed through any email compromise, on every synced device", "step2"),
                        ScenarioChoice("Clutter", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Where should they live?",
                    choices = listOf(
                        ScenarioChoice("In email, but organised", "bad1"),
                        ScenarioChoice("Encrypted, backed up, and access-controlled, outside everyday email", "good1"),
                        ScenarioChoice("On paper only", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You move tax records to encrypted, backed-up, access-controlled storage.",
                    outcome = Outcome.GOOD, lesson = "Tax records are sensitive data: encrypt, back up, control access — not in everyday email."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust email privacy, and one compromise exposes years of financial records.",
                    outcome = Outcome.BAD, lesson = "Email is a wide, synced surface. Sensitive records do not belong in it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You move to paper only, losing backups and searchability.",
                    outcome = Outcome.BAD, lesson = "Paper-only loses backups. Encrypted digital storage gives both protection and recovery.")
            )
        ),
        Scenario(
            id = "bulk-d119", title = "Secret Investment Tip",
            intro = "A message promises huge returns, demands urgency and secrecy, and asks for payment in an unusual method.",
            start = "step1", briefKey = "financial/fin-scams",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What pattern is this?",
                    choices = listOf(
                        ScenarioChoice("A good opportunity", "bad1"),
                        ScenarioChoice("The classic scam pattern: urgency, secrecy, unusual payment", "step2"),
                        ScenarioChoice("A private offer", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Invest a small test amount", "bad1"),
                        ScenarioChoice("Refuse, and verify any legitimate offer through independent, trusted channels", "good1"),
                        ScenarioChoice("Ask the sender for proof", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You refuse the pattern and verify independently, keeping your money.",
                    outcome = Outcome.GOOD, lesson = "Urgency, secrecy, and unusual payment are the scam pattern, whatever the story."),
                "bad1" to ScenarioStep(id = "bad1", text = "You invest a test amount, which is exactly how the scam hooks you for more.",
                    outcome = Outcome.BAD, lesson = "Test amounts are hooks, not due diligence. The pattern is the verdict."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ask the scammer for proof, and they manufacture it.",
                    outcome = Outcome.BAD, lesson = "Scammers manufacture proof on demand. Independent verification is the only proof.")
            )
        ),
        Scenario(
            id = "bulk-d120", title = "The Quarterly Review",
            intro = "You have not reviewed statements, subscriptions, or permissions in over a year. Problems have accumulated quietly.",
            start = "step1", briefKey = "financial/fin-routine",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What does a routine review catch?",
                    choices = listOf(
                        ScenarioChoice("Nothing much", "bad1"),
                        ScenarioChoice("Forgotten subscriptions, odd transactions, stale permissions, and linked services", "step2"),
                        ScenarioChoice("Only fraud", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What routine do you set?",
                    choices = listOf(
                        ScenarioChoice("Annual, if remembered", "bad1"),
                        ScenarioChoice("Regular and light: statements, subscriptions, permissions, linked services, on a schedule", "good1"),
                        ScenarioChoice("Daily checks", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You set a regular, light review, and problems are caught early from now on.",
                    outcome = Outcome.GOOD, lesson = "Regular, light reviews of statements, subscriptions, permissions, and links catch problems early."),
                "bad1" to ScenarioStep(id = "bad1", text = "You review annually if remembered, and problems accumulate for a year at a time.",
                    outcome = Outcome.BAD, lesson = "Annual-if-remembered is not a routine. Schedule it, or it does not happen."),
                "bad2" to ScenarioStep(id = "bad2", text = "You check daily, exhaust yourself, and abandon the routine within a month.",
                    outcome = Outcome.BAD, lesson = "Daily financial checks are unsustainable. Regular and light survives.")
            )
        ),
        Scenario(
            id = "bulk-d121", title = "Shared Doc, Shared Secrets",
            intro = "Your team shares a document widely 'for transparency'. It contains details only three people needed.",
            start = "step1", briefKey = "team/team-discipline",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did transparency cost?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Need-to-know discipline: every extra reader is another point of compromise", "step2"),
                        ScenarioChoice("Time", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Share more, but carefully", "bad1"),
                        ScenarioChoice("Share by need, with access limited to roles that require it", "good1"),
                        ScenarioChoice("Stop sharing", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You share by need, and the document's exposure shrinks to its real audience.",
                    outcome = Outcome.GOOD, lesson = "Sharing by need, not by transparency slogans, is team discipline."),
                "bad1" to ScenarioStep(id = "bad1", text = "You share widely for transparency, and sensitive details reach people who never needed them.",
                    outcome = Outcome.BAD, lesson = "Transparency without need-to-know is just expanded exposure."),
                "bad2" to ScenarioStep(id = "bad2", text = "You stop sharing entirely, and coordination that needed sharing fails.",
                    outcome = Outcome.BAD, lesson = "No sharing is not discipline; sharing by need is.")
            )
        ),
        Scenario(
            id = "bulk-d122", title = "Need to Know, Tested",
            intro = "A colleague asks for details outside their role, saying 'I just want to understand the full picture.'",
            start = "step1", briefKey = "team/team-need-to-know",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Share; curiosity is harmless", "bad1"),
                        ScenarioChoice("Share only what their role requires, and explain the boundary kindly", "step2"),
                        ScenarioChoice("Refuse rudely", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why hold the boundary?",
                    choices = listOf(
                        ScenarioChoice("To be secretive", "bad1"),
                        ScenarioChoice("Because every person who knows is another point of compromise, and roles define need", "good1"),
                        ScenarioChoice("Because policy says so", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You hold the boundary kindly, and the colleague respects it.",
                    outcome = Outcome.GOOD, lesson = "Need to know is a boundary held kindly, not secretively. Roles define need."),
                "bad1" to ScenarioStep(id = "bad1", text = "You share for curiosity, and the circle of knowledge grows without need.",
                    outcome = Outcome.BAD, lesson = "Curiosity is not need. Every extra knower is extra exposure."),
                "bad2" to ScenarioStep(id = "bad2", text = "You refuse rudely, and the colleague works around you next time.",
                    outcome = Outcome.BAD, lesson = "Rude refusals breed workarounds. Kind boundaries hold.")
            )
        ),
        Scenario(
            id = "bulk-d123", title = "The Shared Login",
            intro = "Your team shares one login for a service, 'because it is simpler'. Nobody can say who did what, or when.",
            start = "step1", briefKey = "team/team-shared",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is lost?",
                    choices = listOf(
                        ScenarioChoice("Nothing; it is simpler", "bad1"),
                        ScenarioChoice("Accountability: actions cannot be attributed, and revocation affects everyone", "step2"),
                        ScenarioChoice("Money", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What replaces it?",
                    choices = listOf(
                        ScenarioChoice("A stronger shared password", "bad1"),
                        ScenarioChoice("Individual accounts, or a shared vault with individual access", "good1"),
                        ScenarioChoice("No password", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You move to individual access, and actions become attributable again.",
                    outcome = Outcome.GOOD, lesson = "Shared logins destroy accountability. Individual access restores it."),
                "bad1" to ScenarioStep(id = "bad1", text = "You strengthen a shared password, which still cannot attribute actions.",
                    outcome = Outcome.BAD, lesson = "Strength does not fix sharing. Attribution needs individual accounts."),
                "bad2" to ScenarioStep(id = "bad2", text = "You remove passwords, which is not a solution at all.",
                    outcome = Outcome.BAD, lesson = "Removing authentication is not fixing shared authentication.")
            )
        ),
        Scenario(
            id = "bulk-d124", title = "Day-One Access",
            intro = "A new team member gets full access on day one, before any security onboarding.",
            start = "step1", briefKey = "team/team-onboarding",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is wrong?",
                    choices = listOf(
                        ScenarioChoice("Nothing; trust new members", "bad1"),
                        ScenarioChoice("Access before onboarding and before role need is established", "step2"),
                        ScenarioChoice("It is slow otherwise", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is the right order?",
                    choices = listOf(
                        ScenarioChoice("Access, then onboarding", "bad1"),
                        ScenarioChoice("Onboarding first, then access only for what the role requires", "good1"),
                        ScenarioChoice("Access on request", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You reorder: onboarding first, access by role need second.",
                    outcome = Outcome.GOOD, lesson = "Onboarding before access, and access by role need. Day-one full access is a policy failure."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust day-one full access, and a new member holds data they never needed.",
                    outcome = Outcome.BAD, lesson = "Trust is not a substitute for onboarding and role-based access."),
                "bad2" to ScenarioStep(id = "bad2", text = "You grant access on request, which is access without onboarding or need.",
                    outcome = Outcome.BAD, lesson = "Request is not need. Onboarding and role define access.")
            )
        ),
        Scenario(
            id = "bulk-d125", title = "Meeting Notes That Travel",
            intro = "Meeting notes containing sensitive detail are shared with people who were not in the meeting and did not need them.",
            start = "step1", briefKey = "team/team-meetings",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the problem?",
                    choices = listOf(
                        ScenarioChoice("Note-taking", "bad1"),
                        ScenarioChoice("Notes travel further than meetings, carrying sensitive detail to unneeded readers", "step2"),
                        ScenarioChoice("Sharing", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do notes exclude?",
                    choices = listOf(
                        ScenarioChoice("Decisions", "bad1"),
                        ScenarioChoice("Sensitive detail not needed by the note's readers", "good1"),
                        ScenarioChoice("Action items", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You write notes for their readers, excluding sensitive detail they do not need.",
                    outcome = Outcome.GOOD, lesson = "Notes travel further than meetings. Write them for their readers, not the room."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame note-taking, while the real problem is distribution without need.",
                    outcome = Outcome.BAD, lesson = "Notes are not the problem; unneeded distribution is."),
                "bad2" to ScenarioStep(id = "bad2", text = "You stop sharing notes, and coordination that needed them fails.",
                    outcome = Outcome.BAD, lesson = "No notes is not the fix; need-based notes are.")
            )
        ),
        Scenario(
            id = "bulk-d126", title = "Vendor With the Keys",
            intro = "A vendor is given broad, permanent access 'to make support easier'. The engagement ends, but access remains.",
            start = "step1", briefKey = "team/team-vendors",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What went wrong twice?",
                    choices = listOf(
                        ScenarioChoice("The vendor", "bad1"),
                        ScenarioChoice("Broad permanent access granted, and no revocation when the engagement ended", "step2"),
                        ScenarioChoice("Support needs", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is the right model?",
                    choices = listOf(
                        ScenarioChoice("Trust vendors", "bad1"),
                        ScenarioChoice("Least access, time-limited, with revocation owned and dated", "good1"),
                        ScenarioChoice("No vendor access", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You move vendors to least, time-limited access with owned revocation.",
                    outcome = Outcome.GOOD, lesson = "Vendor access: least, time-limited, revocation owned and dated."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame the vendor for access you granted permanently.",
                    outcome = Outcome.BAD, lesson = "Access granted permanently is your decision, not the vendor's fault."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ban vendor access, making support impossible.",
                    outcome = Outcome.BAD, lesson = "Banning access is not managing it. Least and time-limited is.")
            )
        ),
        Scenario(
            id = "bulk-d127", title = "Working From a Café",
            intro = "A remote team member works from a café, discussing sensitive work on calls, screen visible to neighbours.",
            start = "step1", briefKey = "team/team-remote",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is exposed?",
                    choices = listOf(
                        ScenarioChoice("Nothing; cafés are normal", "bad1"),
                        ScenarioChoice("Sight, sound, and network: screens, voices, and untrusted Wi-Fi", "step2"),
                        ScenarioChoice("Only the network", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is the remote standard?",
                    choices = listOf(
                        ScenarioChoice("Work anywhere", "bad1"),
                        ScenarioChoice("Controlled sight and sound, work devices only, protected connections", "good1"),
                        ScenarioChoice("Work from home only", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You set a remote standard: controlled sight and sound, work devices, protected connections.",
                    outcome = Outcome.GOOD, lesson = "Remote work needs a standard: sight, sound, devices, connections — all controlled."),
                "bad1" to ScenarioStep(id = "bad1", text = "You accept café work as normal, and sensitive work is overheard and overseen.",
                    outcome = Outcome.BAD, lesson = "Normal is not secure. Cafés expose sight, sound, and network together."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ban remote work, losing its benefits for want of a standard.",
                    outcome = Outcome.BAD, lesson = "Banning remote work is not managing it. A standard is.")
            )
        ),
        Scenario(
            id = "bulk-d128", title = "Manager Bypasses the Rule",
            intro = "A manager bypasses a security rule 'just this once' for speed. The team watches.",
            start = "step1", briefKey = "team/team-managers",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did the team learn?",
                    choices = listOf(
                        ScenarioChoice("That rules are flexible", "bad1"),
                        ScenarioChoice("That rules are optional when inconvenient — from the person who should model them", "step2"),
                        ScenarioChoice("That managers are busy", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What restores the rule?",
                    choices = listOf(
                        ScenarioChoice("A memo", "bad1"),
                        ScenarioChoice("The manager acknowledging it, following the rule visibly, and enforcing it consistently", "good1"),
                        ScenarioChoice("Stricter rules", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "The manager models the rule visibly, and its authority returns.",
                    outcome = Outcome.GOOD, lesson = "Managers set rules by example. A bypassed rule is a dead rule until modelled again."),
                "bad1" to ScenarioStep(id = "bad1", text = "The team learns rules are flexible, and flexibility spreads to every rule.",
                    outcome = Outcome.BAD, lesson = "One visible bypass teaches the whole team that rules are optional."),
                "bad2" to ScenarioStep(id = "bad2", text = "A memo restores nothing while behaviour contradicts it.",
                    outcome = Outcome.BAD, lesson = "Memos do not restore authority. Modelled behaviour does.")
            )
        ),
        Scenario(
            id = "bulk-d129", title = "Blame After the Mistake",
            intro = "A team member makes a security mistake. The team blames them publicly, and future mistakes go unreported.",
            start = "step1", briefKey = "team/team-mistake",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did blame cost?",
                    choices = listOf(
                        ScenarioChoice("Nothing; accountability matters", "bad1"),
                        ScenarioChoice("Future reporting: mistakes now go underground", "step2"),
                        ScenarioChoice("Morale only", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What replaces blame?",
                    choices = listOf(
                        ScenarioChoice("Ignoring mistakes", "bad1"),
                        ScenarioChoice("Fixing the process, supporting the member, and sharing the lesson", "good1"),
                        ScenarioChoice("Private blame", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You fix the process and share the lesson, and reporting returns.",
                    outcome = Outcome.GOOD, lesson = "Blame drives mistakes underground. Process fixes and shared lessons bring them to light."),
                "bad1" to ScenarioStep(id = "bad1", text = "You defend blame as accountability, while reporting collapses.",
                    outcome = Outcome.BAD, lesson = "Accountability is fixing processes, not punishing people publicly."),
                "bad2" to ScenarioStep(id = "bad2", text = "You blame privately, which still teaches the team that mistakes are punished.",
                    outcome = Outcome.BAD, lesson = "Private blame still suppresses reporting. The culture, not the venue, is the problem.")
            )
        ),
        Scenario(
            id = "bulk-d130", title = "Drill Without Debrief",
            intro = "Your team runs a security drill. It goes well, everyone has fun, and nobody debriefs.",
            start = "step1", briefKey = "team/team-drills",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What was wasted?",
                    choices = listOf(
                        ScenarioChoice("Nothing; it went well", "bad1"),
                        ScenarioChoice("The learning: without a debrief, what worked and failed is never captured", "step2"),
                        ScenarioChoice("Time", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What does a debrief produce?",
                    choices = listOf(
                        ScenarioChoice("A good feeling", "bad1"),
                        ScenarioChoice("Concrete changes: what worked, what failed, what changes", "good1"),
                        ScenarioChoice("A report", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You debrief and change procedures, turning a fun drill into lasting improvement.",
                    outcome = Outcome.GOOD, lesson = "A drill without a debrief is theatre. What worked, what failed, what changes — that is the value."),
                "bad1" to ScenarioStep(id = "bad1", text = "You call a fun drill a success, and nothing improves.",
                    outcome = Outcome.BAD, lesson = "Fun is not success. Captured learning is."),
                "bad2" to ScenarioStep(id = "bad2", text = "You write a report nobody reads, which is a debrief in name only.",
                    outcome = Outcome.BAD, lesson = "A report nobody acts on is not a debrief. Changes are.")
            )
        )
    )
}
