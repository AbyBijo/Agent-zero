package com.abybijo.agent0.data

/** v2.0 Phase 4c: drills linked to CH-10 Financial Privacy briefs, one per brief. */
object Scenarios10 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "fin-footprint-drill",
            title = "The Statement That Tells a Story",
            intro = "A friend looks at a month of your card statements and correctly guesses your routines, your workplace, and your weekend habits — from purchases alone.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What does this show?",
                    choices = listOf(
                        ScenarioChoice("Card statements are private, so this cannot happen", "bad1"),
                        ScenarioChoice("Every purchase is a data point, and together they reveal routines", "step2"),
                        ScenarioChoice("Only cash purchases reveal anything", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you change first?",
                    choices = listOf(
                        ScenarioChoice("Stop using cards entirely", "bad2"),
                        ScenarioChoice("Review what your statements reveal, and separate spending by purpose", "good1"),
                        ScenarioChoice("Use one card for everything, to keep it simple", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You separate spending by purpose, review statements monthly, and reduce what any single statement reveals. Your footprint is still there, but it no longer tells a whole story at a glance.",
                    outcome = Outcome.GOOD,
                    lesson = "Purchases are data points. Separation and review stop a single statement from telling your whole story."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You assume statements are private and change nothing. Anyone who sees one — a breach, a shared screen, a statement left out — sees the whole story.",
                    outcome = Outcome.BAD,
                    lesson = "Private does not mean unexposed. Statements leak through breaches, sharing, and carelessness."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You go all-cash or all-one-card, both extremes that fail: one is impractical, the other concentrates the whole story in one place.",
                    outcome = Outcome.BAD,
                    lesson = "Extremes fail. Separation by purpose, not all-or-nothing, is the workable answer."
                )
            ),
            briefKey = "financial/fin-footprint"
        ),
        Scenario(
            id = "fin-separation-drill",
            title = "One Account for Everything",
            intro = "You use one bank account and one card for work, personal spending, subscriptions, and a side project. A client dispute freezes the account, and suddenly nothing works.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What went wrong?",
                    choices = listOf(
                        ScenarioChoice("Bad luck; nothing could have prevented it", "bad1"),
                        ScenarioChoice("One account meant one failure point for every part of your life", "step2"),
                        ScenarioChoice("The bank was at fault", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "How do you restructure?",
                    choices = listOf(
                        ScenarioChoice("Open separate accounts for work, personal, and subscriptions, with separate cards", "good1"),
                        ScenarioChoice("Open a second account identical to the first", "bad2"),
                        ScenarioChoice("Keep one account but use cash more", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You separate accounts by purpose. A future freeze affects one part of your life, not all of it, and each statement reveals only its own purpose.",
                    outcome = Outcome.GOOD,
                    lesson = "Separation limits blast radius: one frozen account should not freeze your whole life."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You change nothing and call it bad luck. The next dispute, fraud hold, or error freezes everything again.",
                    outcome = Outcome.BAD,
                    lesson = "A single point of failure is a design choice, not bad luck. Redesign it."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "A second identical account doubles the paperwork without separating anything: the same failure still hits both purposes at once.",
                    outcome = Outcome.BAD,
                    lesson = "Duplication is not separation. Accounts must be separated by purpose, not merely multiplied."
                )
            ),
            briefKey = "financial/fin-separation"
        ),
        Scenario(
            id = "fin-payments-drill",
            title = "The Payment App's Memory",
            intro = "A payment app shows your transaction history to anyone who picks up your unlocked phone, including notes, names, and amounts. A friend jokes about a payment they saw.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you fix first?",
                    choices = listOf(
                        ScenarioChoice("Delete the app", "bad2"),
                        ScenarioChoice("Lock the app, hide history where possible, and stop writing revealing notes", "step2"),
                        ScenarioChoice("Tell friends not to look", "bad1")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What about the notes on past payments?",
                    choices = listOf(
                        ScenarioChoice("Leave them; history is history", "bad1"),
                        ScenarioChoice("Remove revealing notes and keep future notes neutral", "good1"),
                        ScenarioChoice("Delete your account entirely", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You lock the app, neutralise notes, and keep history minimal. A picked-up phone now shows a locked app, not your financial life.",
                    outcome = Outcome.GOOD,
                    lesson = "Payment apps are financial diaries. Lock them, and write notes as if strangers will read them."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You rely on friends not looking. Friends look, phones get borrowed, and screens get seen. Politeness is not a control.",
                    outcome = Outcome.BAD,
                    lesson = "Relying on others not to look is not a security control. Lock the app instead."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You delete the app or the account, losing its convenience and history, when locking and neutral notes would have sufficed.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Deletion is sometimes right, but for a useful app, locking and neutral notes usually suffice."
                )
            ),
            briefKey = "financial/fin-payments"
        ),
        Scenario(
            id = "fin-cash-prepaid-drill",
            title = "Cash for the Sensitive Purchase",
            intro = "You need to buy something you would rather not have on a statement — a gift, a medical item, a donation. You are about to pay by card out of habit.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Pay by card; statements are private anyway", "bad1"),
                        ScenarioChoice("Pay cash, or with a prepaid card, so the purchase leaves no statement trail", "step2"),
                        ScenarioChoice("Ask someone else to buy it", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "A friend says cash is suspicious. What is the sound answer?",
                    choices = listOf(
                        ScenarioChoice("Cash is a normal payment method, and choosing it for privacy is legitimate", "good1"),
                        ScenarioChoice("Agree, and pay by card after all", "bad1"),
                        ScenarioChoice("Buy it online with a gift card bought by card", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You pay cash. No statement, no data broker entry, no future ad. Privacy is not suspicion; it is a choice about what to record.",
                    outcome = Outcome.GOOD,
                    lesson = "Cash and prepaid cards break the statement trail for purchases you do not want recorded."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You pay by card. The purchase joins your statement, your profile, and every future use of that data.",
                    outcome = Outcome.BAD,
                    lesson = "Habit defeats intention. If a purchase should not be recorded, the payment method must match that intention."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You involve someone else, or buy a gift card by card — either way, the trail remains, now with an extra person in it.",
                    outcome = Outcome.BAD,
                    lesson = "Routing a purchase through someone else, or through a card-bought gift card, does not break the trail."
                )
            ),
            briefKey = "financial/fin-cash-prepaid"
        ),
        Scenario(
            id = "fin-subscriptions-drill",
            title = "The Subscriptions You Forgot",
            intro = "You check your statements and find five subscriptions you forgot: two you never use, one you cancelled but still pay for, and two free trials that converted silently.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Cancel everything at once", "bad2"),
                        ScenarioChoice("List them, cancel what you do not use, and dispute the one you cancelled", "step2"),
                        ScenarioChoice("Leave them; the amounts are small", "bad1")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "How do you stop this recurring?",
                    choices = listOf(
                        ScenarioChoice("Use a separate card for subscriptions, and review it monthly", "good1"),
                        ScenarioChoice("Set calendar reminders for every trial", "bad2"),
                        ScenarioChoice("Never subscribe to anything again", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You cancel the unused ones, dispute the wrongly-charged one, and route future subscriptions through one card you review monthly. Forgotten subscriptions have nowhere to hide.",
                    outcome = Outcome.GOOD,
                    lesson = "Subscriptions leak money and data silently. One card plus a monthly review makes them visible."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Small amounts, left alone, add up to a large annual total — and each subscription is another service holding your payment details.",
                    outcome = Outcome.BAD,
                    lesson = "Small recurring charges are still charges, and still exposures. Review them, or pay them forever."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Cancelling everything, or tracking every trial by hand, both fail: one loses services you value, the other collapses under its own effort.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Systems beat willpower: one subscription card plus a monthly review beats manual tracking."
                )
            ),
            briefKey = "financial/fin-subscriptions"
        ),
        Scenario(
            id = "fin-banking-apps-drill",
            title = "Banking on a Borrowed Phone",
            intro = "Your phone dies while travelling. A friend offers their phone so you can check your bank balance 'just quickly'. You are about to log in.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Log in; it is just a balance check", "bad1"),
                        ScenarioChoice("Decline, and wait until you have a trusted device", "step2"),
                        ScenarioChoice("Log in, then log out carefully", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You really need the balance urgently. What is the least-bad option?",
                    choices = listOf(
                        ScenarioChoice("Call your bank's phone line from your own number", "good1"),
                        ScenarioChoice("Log in on the friend's phone in a private browser tab", "bad1"),
                        ScenarioChoice("Ask the friend to log in for you", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You call your bank, verify by phone, and get the balance without entering credentials into a device you do not control. Urgency did not override the rule.",
                    outcome = Outcome.GOOD,
                    lesson = "Never enter banking credentials into a device you do not control. A phone call to your bank is the safe urgent option."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You log in on a borrowed device. Saved passwords, session tokens, and keylogging risks all apply, and 'just a balance check' still exposes the account.",
                    outcome = Outcome.BAD,
                    lesson = "A quick login is still a login. Borrowed devices are untrusted devices."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Logging out carefully, or asking the friend to log in, still exposes credentials or account access to a device and person you do not control.",
                    outcome = Outcome.BAD,
                    lesson = "Careful logout does not undo credential exposure on an untrusted device."
                )
            ),
            briefKey = "financial/fin-banking-apps"
        ),
        Scenario(
            id = "fin-crypto-drill",
            title = "The Crypto Tip",
            intro = "A friend urges you to buy a cryptocurrency they promise will double, and offers to 'help' by holding your wallet keys for you. The pressure is friendly and urgent.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Buy in and let the friend hold the keys — they know more than you", "bad1"),
                        ScenarioChoice("Decline to act on a tip, and never give anyone your keys", "step2"),
                        ScenarioChoice("Buy a small amount to be polite", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The friend says you are missing out. What is the sound answer?",
                    choices = listOf(
                        ScenarioChoice("General information is not advice, and urgency is a pressure tactic, not evidence", "good1"),
                        ScenarioChoice("Buy, but keep the keys yourself", "bad2"),
                        ScenarioChoice("Ask the friend for their track record", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You decline, keep your keys to yourself, and lose nothing. The coin later collapses, and the friend's other 'tips' collapse with it.",
                    outcome = Outcome.GOOD,
                    lesson = "Never share wallet keys, never act on urgent tips, and treat crypto claims as general information, not advice."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You hand over keys or buy on a tip. Keys given away are funds given away, and tips are not evidence.",
                    outcome = Outcome.BAD,
                    lesson = "Keys are ownership. Anyone holding your keys holds your funds."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "A polite small purchase still normalises acting on tips, and still risks funds you cannot afford to lose.",
                    outcome = Outcome.BAD,
                    lesson = "Politeness is not a reason to risk funds. Decline cleanly."
                )
            ),
            briefKey = "financial/fin-crypto"
        ),
        Scenario(
            id = "fin-tax-records-drill",
            title = "The Tax File, Shared Carelessly",
            intro = "You need to send tax documents to an accountant. You are about to email them, unencrypted, from a shared computer, because it is fastest.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Email them; accountants expect email", "bad1"),
                        ScenarioChoice("Send them through a secure channel, from a trusted device, and confirm receipt", "step2"),
                        ScenarioChoice("Send them, then delete the sent email", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The accountant says email is fine and they do it all the time. What now?",
                    choices = listOf(
                        ScenarioChoice("Insist on the secure channel; common practice is not safe practice", "good1"),
                        ScenarioChoice("Accept email, since the professional prefers it", "bad1"),
                        ScenarioChoice("Split the documents across several emails", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You use the secure channel, confirm receipt, and keep your own copy organised. Tax records — identity, income, accounts — travel protected, not exposed.",
                    outcome = Outcome.GOOD,
                    lesson = "Tax documents are identity documents. They travel only through secure channels, from trusted devices."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You email sensitive records unencrypted, from a shared computer. The email lives in sent folders, servers, and backups, exposed to anyone with access to any of them.",
                    outcome = Outcome.BAD,
                    lesson = "Email is not a secure channel for identity documents, however common it is."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Deleting a sent email, or splitting documents across emails, does not recall copies already made on servers and devices.",
                    outcome = Outcome.BAD,
                    lesson = "Deletion after sending does not undo sending. Protect before sending, not after."
                )
            ),
            briefKey = "financial/fin-tax-records"
        ),
        Scenario(
            id = "fin-scams-drill",
            title = "The Bank Will Never Ask",
            intro = "You get a call from 'your bank's fraud team' about suspicious activity. They ask you to read out a code sent to your phone to 'verify' you, and to move money to a 'safe account'. They sound professional and urgent.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Read the code and move the money; it is urgent", "bad1"),
                        ScenarioChoice("Hang up and call your bank on its published number", "step2"),
                        ScenarioChoice("Ask them to prove who they are", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "Your bank, on its published number, confirms there is no fraud case and no such team call. What now?",
                    choices = listOf(
                        ScenarioChoice("Report the scam call to your bank", "good1"),
                        ScenarioChoice("Ignore it, since you did not fall for it", "bad2"),
                        ScenarioChoice("Call the scammer back to confront them", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You hang up, verify independently, and report the call. Your money stays put, and the bank adds the number to its scam warnings.",
                    outcome = Outcome.GOOD,
                    lesson = "Banks never ask for codes or for money to be moved to a safe account. Hang up, call the published number, report."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You read the code or move the money. The code gives the scammer access; the safe account is theirs. Both are irreversible in practice.",
                    outcome = Outcome.BAD,
                    lesson = "Codes and safe-account moves are the scam's payload. Never comply, however professional the caller sounds."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Asking a scammer to prove themselves, or ignoring a live scam, both fail: proof is faked easily, and silence leaves the scam running for others.",
                    outcome = Outcome.BAD,
                    lesson = "Do not debate scammers, and do not stay silent. Hang up, verify, report."
                )
            ),
            briefKey = "financial/fin-scams"
        ),
        Scenario(
            id = "fin-routine-drill",
            title = "The Monthly Money Check",
            intro = "It is the end of the month. You have not reviewed statements, subscriptions, or account access in months. Everything 'seems fine', which is exactly the problem.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do this month?",
                    choices = listOf(
                        ScenarioChoice("Skip it again; everything seems fine", "bad1"),
                        ScenarioChoice("Run a short monthly review: statements, subscriptions, access, alerts", "step2"),
                        ScenarioChoice("Check only the main account balance", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The review finds an unknown small charge and an old app still connected to your bank. What now?",
                    choices = listOf(
                        ScenarioChoice("Dispute the charge and revoke the old app's access", "good1"),
                        ScenarioChoice("Watch the charge for another month", "bad2"),
                        ScenarioChoice("Ignore the old app; it is not doing anything", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You dispute the charge, revoke the old access, and set a monthly review reminder. The routine caught what 'seems fine' hid.",
                    outcome = Outcome.GOOD,
                    lesson = "A short monthly review — statements, subscriptions, access, alerts — catches what silence hides."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You skip the review, or ignore old access. Unknown charges and forgotten connections persist, quietly, for months.",
                    outcome = Outcome.BAD,
                    lesson = "'Seems fine' is not a review. Without one, small exposures persist indefinitely."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Checking only the balance, or watching a suspicious charge for another month, lets the exposure continue while you wait.",
                    outcome = Outcome.BAD,
                    lesson = "A balance check is not a review, and waiting on a suspicious charge is not caution."
                )
            ),
            briefKey = "financial/fin-routine"
        )
    )
}
