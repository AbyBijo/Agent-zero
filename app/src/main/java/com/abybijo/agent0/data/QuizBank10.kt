package com.abybijo.agent0.data

/** v2.0 Phase 4c: questions linked to CH-10 Financial Privacy briefs, three per brief. */
object QuizBank10 {
    val all: List<QuizQuestion> = listOf(
        QuizQuestion(
            prompt = "What can a month of card statements reveal together?",
            options = listOf("Nothing, if amounts are small", "Routines, workplace, and weekend habits", "Only total spending", "Only the card's bank"),
            answerIndex = 1,
            rationale = "Purchases are data points, and together they reveal patterns no single purchase shows.",
            id = "fin-q01", briefKey = "financial/fin-footprint", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why review statements monthly, rather than only checking balances?",
            options = listOf("Balances are inaccurate", "Statements reveal patterns, subscriptions, and unknown charges that balances hide", "It is required by law", "Balances do not update"),
            answerIndex = 1,
            rationale = "A balance hides what a statement shows: patterns, recurring charges, and anomalies.",
            id = "fin-q02", briefKey = "financial/fin-footprint", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does separating spending by purpose achieve?",
            options = listOf("Higher spending", "No single statement tells your whole story", "Fewer cards", "No statements at all"),
            answerIndex = 1,
            rationale = "Separation limits what any one statement, breach, or shared screen can reveal.",
            id = "fin-q03", briefKey = "financial/fin-footprint", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is one account for everything a risk?",
            options = listOf("It costs more", "One freeze, fraud hold, or error affects every part of your life at once", "Banks dislike it", "It prevents saving"),
            answerIndex = 1,
            rationale = "A single account is a single point of failure for work, personal life, and subscriptions alike.",
            id = "fin-q04", briefKey = "financial/fin-separation", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the difference between duplication and separation?",
            options = listOf("None", "Duplication multiplies identical accounts; separation divides by purpose", "Separation costs more", "Duplication is safer"),
            answerIndex = 1,
            rationale = "Two identical accounts fail together; purpose-separated accounts fail independently.",
            id = "fin-q05", briefKey = "financial/fin-separation", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Which accounts should be separated, at minimum?",
            options = listOf("Only savings", "Work, personal, and subscriptions, with separate cards", "Only work", "None; one account is fine"),
            answerIndex = 1,
            rationale = "Work, personal, and subscription spending have different risks and different audiences.",
            id = "fin-q06", briefKey = "financial/fin-separation", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why should payment app notes be written neutrally?",
            options = listOf("Notes are deleted automatically", "Anyone who sees the app — a borrowed phone, a shared screen — can read them", "Notes affect fees", "Neutral notes are required"),
            answerIndex = 1,
            rationale = "Payment histories are financial diaries, visible to anyone who sees the app.",
            id = "fin-q07", briefKey = "financial/fin-payments", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the first protection for a payment app on your phone?",
            options = listOf("Deleting history daily", "Locking the app itself", "Using it only at home", "Hiding the app icon"),
            answerIndex = 1,
            rationale = "An app lock stops a picked-up or borrowed phone from opening your financial history.",
            id = "fin-q08", briefKey = "financial/fin-payments", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is relying on friends not to look at your payment history not a control?",
            options = listOf("Friends always look", "Politeness is not a security control; phones get borrowed and screens get seen", "Friends cannot see apps", "It is rude to ask"),
            answerIndex = 1,
            rationale = "Controls must work without relying on other people's restraint.",
            id = "fin-q09", briefKey = "financial/fin-payments", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When is cash or a prepaid card the right payment choice?",
            options = listOf("Never; cash is suspicious", "For purchases you do not want recorded on a statement", "Only for large purchases", "Only abroad"),
            answerIndex = 1,
            rationale = "Cash and prepaid cards break the statement trail for purchases that should not be recorded.",
            id = "fin-q10", briefKey = "financial/fin-cash-prepaid", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does buying a gift card by card not break the trail?",
            options = listOf("It does break it", "The gift card purchase itself appears on the statement", "Gift cards are tracked separately", "It breaks it only for small amounts"),
            answerIndex = 1,
            rationale = "The card purchase of the gift card is itself a recorded transaction.",
            id = "fin-q11", briefKey = "financial/fin-cash-prepaid", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Is choosing cash for privacy suspicious?",
            options = listOf("Yes, always", "No; cash is a normal payment method, and privacy is a legitimate choice", "Only for large amounts", "Only if you hide it"),
            answerIndex = 1,
            rationale = "Privacy is a legitimate reason to choose a payment method, not evidence of wrongdoing.",
            id = "fin-q12", briefKey = "financial/fin-cash-prepaid", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why do forgotten subscriptions matter beyond their cost?",
            options = listOf("They do not", "Each one is another service holding your payment details", "They slow your phone", "They affect credit scores directly"),
            answerIndex = 1,
            rationale = "Every subscription is a stored payment method and a data relationship, not only a charge.",
            id = "fin-q13", briefKey = "financial/fin-subscriptions", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What system best prevents forgotten subscriptions?",
            options = listOf("Tracking every trial by hand", "One subscription card, reviewed monthly", "Never subscribing", "Cancelling everything yearly"),
            answerIndex = 1,
            rationale = "One card plus a monthly review makes subscriptions visible without manual tracking.",
            id = "fin-q14", briefKey = "financial/fin-subscriptions", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A subscription you cancelled still charges you. What should you do?",
            options = listOf("Wait; it will stop", "Dispute the charge and confirm cancellation in writing", "Cancel your card immediately", "Ignore small amounts"),
            answerIndex = 1,
            rationale = "A charge after cancellation is a dispute, confirmed in writing, not something to wait out.",
            id = "fin-q15", briefKey = "financial/fin-subscriptions", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why must you never enter banking credentials into a borrowed device?",
            options = listOf("It is impolite", "Saved passwords, session tokens, and keylogging risks expose the account", "Banks block borrowed devices", "It is slower"),
            answerIndex = 1,
            rationale = "A device you do not control may retain credentials or sessions after you log out.",
            id = "fin-q16", briefKey = "financial/fin-banking-apps", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You urgently need a balance while travelling without your phone. What is the safest option?",
            options = listOf("Log in on a friend's phone in a private tab", "Call your bank's published phone line", "Ask a friend to log in for you", "Wait until you are home, whatever the urgency"),
            answerIndex = 1,
            rationale = "A phone call to your bank avoids entering credentials into an untrusted device.",
            id = "fin-q17", briefKey = "financial/fin-banking-apps", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does careful logout not make a borrowed-device login safe?",
            options = listOf("It does make it safe", "Sessions, saved credentials, and keylogging may persist after logout", "Logout takes too long", "Banks record logouts"),
            answerIndex = 1,
            rationale = "Logout does not undo credential or session exposure on a device you do not control.",
            id = "fin-q18", briefKey = "financial/fin-banking-apps", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A friend offers to hold your crypto wallet keys for you. What should you do?",
            options = listOf("Accept; they know more than you", "Never give anyone your keys — keys are ownership", "Accept for a small amount", "Share them temporarily"),
            answerIndex = 1,
            rationale = "Whoever holds the keys holds the funds; there is no temporary or partial sharing.",
            id = "fin-q19", briefKey = "financial/fin-crypto", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does this app's crypto brief state about its content?",
            options = listOf("It is investment advice", "It is general information, not professional or investment advice", "It guarantees returns", "It recommends specific coins"),
            answerIndex = 1,
            rationale = "The brief states plainly it is general information, not professional advice.",
            id = "fin-q20", briefKey = "financial/fin-crypto", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is urgency in a crypto tip a warning sign, not evidence?",
            options = listOf("Urgent tips are always true", "Urgency is a pressure tactic used to bypass careful judgement", "Crypto moves fast", "Tips expire quickly"),
            answerIndex = 1,
            rationale = "Pressure to act now prevents verification, which is exactly what a scam needs.",
            id = "fin-q21", briefKey = "financial/fin-crypto", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should tax documents be sent to an accountant?",
            options = listOf("By ordinary email, for speed", "Through a secure channel, from a trusted device, with receipt confirmed", "By splitting them across emails", "By email, then deleting the sent copy"),
            answerIndex = 1,
            rationale = "Tax documents are identity documents; they need secure channels, not ordinary email.",
            id = "fin-q22", briefKey = "financial/fin-tax-records", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does deleting a sent email not protect tax documents?",
            options = listOf("It does protect them", "Copies already exist on servers, devices, and backups", "Deletion is not allowed", "Accountants keep copies anyway"),
            answerIndex = 1,
            rationale = "Sending creates copies beyond your control; deletion only removes your copy.",
            id = "fin-q23", briefKey = "financial/fin-tax-records", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "An accountant says ordinary email is fine because everyone uses it. What is the sound response?",
            options = listOf("Accept it; professionals know best", "Insist on the secure channel; common practice is not safe practice", "Send half by email", "Find a new accountant immediately"),
            answerIndex = 1,
            rationale = "Common practice does not make an insecure channel secure for identity documents.",
            id = "fin-q24", briefKey = "financial/fin-tax-records", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A caller claiming to be your bank's fraud team asks you to read out a code. What should you do?",
            options = listOf("Read it out; they need to verify you", "Hang up and call your bank on its published number", "Ask them to prove who they are", "Read only part of the code"),
            answerIndex = 1,
            rationale = "Banks never ask for codes by phone; hang up and verify independently.",
            id = "fin-q25", briefKey = "financial/fin-scams", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A caller asks you to move money to a 'safe account'. What is this?",
            options = listOf("Standard fraud protection", "A scam: the safe account belongs to the scammer", "A new banking feature", "A test of your account"),
            answerIndex = 1,
            rationale = "Legitimate banks never ask customers to move money to a safe account by phone.",
            id = "fin-q26", briefKey = "financial/fin-scams", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "After confirming a scam call, what should you do beyond protecting yourself?",
            options = listOf("Nothing", "Report it to your bank so it can warn others", "Call the scammer back", "Post the number publicly"),
            answerIndex = 1,
            rationale = "Reporting lets the bank warn others and block the number; silence leaves the scam running.",
            id = "fin-q27", briefKey = "financial/fin-scams", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does a monthly financial review cover?",
            options = listOf("Only the main balance", "Statements, subscriptions, account access, and alerts", "Only spending totals", "Only new accounts"),
            answerIndex = 1,
            rationale = "A review checks statements, subscriptions, connected access, and alerts — not just a balance.",
            id = "fin-q28", briefKey = "financial/fin-routine", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You find an unknown small charge in a review. What should you do?",
            options = listOf("Watch it for another month", "Dispute it and investigate it now", "Ignore small amounts", "Change your card immediately"),
            answerIndex = 1,
            rationale = "Small unknown charges are often tests for larger fraud; dispute and investigate promptly.",
            id = "fin-q29", briefKey = "financial/fin-routine", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is 'everything seems fine' not a substitute for a review?",
            options = listOf("It is a substitute", "Without a review, small exposures persist unnoticed for months", "Reviews are only for businesses", "Seems fine means it is fine"),
            answerIndex = 1,
            rationale = "Silence hides drift: unknown charges and forgotten access persist without a review.",
            id = "fin-q30", briefKey = "financial/fin-routine", difficulty = "Advanced"
        )
    )
}
