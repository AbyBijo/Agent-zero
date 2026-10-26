package com.abybijo.agent0.data

/**
 * CHAPTER 10 — FINANCIAL PRIVACY AND TRANSACTIONS (Specialisation)
 *
 * Money as an information trail, and lawful, practical ways to reduce it.
 * No investment advice, no tax advice, and no instructions for evading
 * lawful obligations. Where a brief touches law or tax, it says plainly
 * that it is general information, not professional advice.
 */
fun chapter10() = Chapter(
    id = "financial",
    index = 10,
    code = "CH-10",
    title = "Financial Privacy and Transactions",
    glyph = "\u00A4",
    tier = Tier.ADVANCED,
    tagline = "Money leaves a trail. Learn what it says, and how to shorten it lawfully.",
    briefs = listOf(
        Brief(
            id = "fin-footprint",
            title = "Money Leaves a Trail: Mapping Your Financial Footprint",
            glyph = "\u25A3",
            summary = "Every payment, account, and subscription is a record. Map yours before you try to shorten it.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Your financial footprint is not just your bank balance. It is every " +
                        "account you hold, every card you use, every subscription, every " +
                        "purchase, and every loyalty programme — each one a record held " +
                        "by someone else, linking you to places, times, people, and habits."
                ),
                Block.Heading("Map it", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "List every account, card, payment app, and subscription you use.",
                        "For each, note what it records: amount, merchant, location, and time.",
                        "Note which records are shared, sold, or combined with other data.",
                        "Rank the footprint by what it would reveal to someone who obtained it."
                    )
                ),
                Block.Field(
                    "The footprint is the point",
                    "Financial data is valuable precisely because it is hard to fake and " +
                        "easy to combine. A purchase history is a biography with timestamps."
                ),
                Block.Para(
                    "You cannot shorten a footprint you have not mapped. The map is the " +
                        "first, unglamorous step, and everything in this chapter builds on it."
                )
            ),
            outcomes = listOf(
                "List your accounts, cards, payment apps, and subscriptions.",
                "Describe what each one records about you.",
                "Rank your financial exposures by what they would reveal."
            ),
            howTo = listOf(
                "Write down every account, card, app, and subscription you use.",
                "For each, note amount, merchant, location, and time records.",
                "Check each provider's data-sharing and retention statements.",
                "Rank the list by harm if the records were obtained together."
            ),
            bestPractices = listOf(
                "Map before you act; shortening blindly usually shortens the wrong thing.",
                "Revisit the map when you open an account or start a subscription."
            ),
            cautions = listOf(
                "Forgotten accounts and old subscriptions are still records.",
                "A single combined view — such as a budgeting app — creates a new, richer record."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to financial and payment privacy.")
            )
        ),
        Brief(
            id = "fin-separation",
            title = "Accounts, Cards, and Separation",
            glyph = "\u25C8",
            summary = "Compartmentation applied to money: separate purposes, separate instruments.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "One card for everything links everything: work, home, travel, health, " +
                        "and habits, all in a single record held by a single provider. " +
                        "Separation breaks that link. It does not hide transactions from " +
                        "the provider of each instrument — it stops one provider, or one " +
                        "breach, from seeing your whole life."
                ),
                Block.Heading("Separate by purpose", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Use different cards or accounts for everyday spending, online purchases, travel, and sensitive purchases.",
                        "Keep work spending on a work instrument, and personal spending off it.",
                        "Use a dedicated account for subscriptions, so cancelling one does not disturb the others.",
                        "Do not link every account to a single budgeting or payment app unless you accept the combined record."
                    )
                ),
                Block.Field(
                    "Separation is not invisibility",
                    "Each provider still sees its own transactions fully. Separation limits " +
                        "the blast radius of a breach and the completeness of any single record."
                ),
                Block.Para(
                    "Keep the system simple enough to maintain. Three well-used " +
                        "instruments beat six that you mix up and cross-use."
                )
            ),
            outcomes = listOf(
                "Separate payment instruments by purpose.",
                "Explain what separation does and does not hide.",
                "Keep a separation system simple enough to maintain."
            ),
            howTo = listOf(
                "Assign each spending purpose its own card or account.",
                "Move work spending off personal instruments, and vice versa.",
                "Give subscriptions their own account.",
                "Review whether a single app linking everything is worth its combined record."
            ),
            bestPractices = listOf(
                "Separation limits blast radius; it does not make transactions invisible.",
                "A system you maintain beats a perfect system you abandon."
            ),
            cautions = listOf(
                "Cross-using instruments by accident quietly undoes the separation.",
                "Too many instruments create confusion, which creates cross-use."
            ),
            references = listOf(
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Recommendations for accounts and payments.")
            )
        ),
        Brief(
            id = "fin-payments",
            title = "Payments: What Each Method Reveals",
            glyph = "\u21C4",
            summary = "Card, transfer, cash, and digital payment, compared honestly — each reveals something different.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "No payment method is private in every dimension. A card reveals " +
                        "merchant, amount, and time to the issuer and the network. A bank " +
                        "transfer reveals both parties. Cash reveals little to a distant " +
                        "observer but leaves you carrying it, and still leaves camera and " +
                        "receipt trails. A digital payment app reveals the transaction to " +
                        "the app provider, and often to a social graph as well."
                ),
                Block.Heading("Compare honestly", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Card: convenient, widely accepted, fully recorded by issuer and network.",
                        "Bank transfer: direct, recorded by both banks, with both parties named.",
                        "Cash: minimal distant record, but physical risk, and no recourse if lost.",
                        "Digital payment app: convenient, but the provider sees the transaction and may share or combine it."
                    )
                ),
                Block.Field(
                    "Choose by the risk, not by habit",
                    "For ordinary purchases, convenience may be worth the record. For " +
                        "sensitive purchases, choose the method whose record you can accept " +
                        "being kept, and by whom."
                ),
                Block.Para(
                    "There is no method that is best for everything. The OPSEC skill is " +
                        "choosing deliberately, purchase by purchase, rather than defaulting " +
                        "to the same method for all of them."
                )
            ),
            outcomes = listOf(
                "Compare card, transfer, cash, and digital payment by what each reveals.",
                "Choose a payment method by the risk of that purchase, not by habit.",
                "Explain what a digital payment app's provider sees."
            ),
            howTo = listOf(
                "For a sensitive purchase, ask who will hold a record of it, and for how long.",
                "Choose cash or a separated instrument where the record matters most.",
                "Check a payment app's privacy settings and sharing defaults before using it for sensitive purchases.",
                "Keep receipts only where you need them, and dispose of them securely."
            ),
            bestPractices = listOf(
                "Match the method to the purchase, not the purchase to your default method.",
                "A record you accept knowingly is a decision; a record you never considered is an accident."
            ),
            cautions = listOf(
                "Cash is not traceless: cameras, receipts, and withdrawal records still exist.",
                "Digital payment apps may share data with partners and display activity to contacts."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to payment privacy.")
            )
        ),
        Brief(
            id = "fin-cash-prepaid",
            title = "Cash, Prepaid, and Privacy Trade-offs",
            glyph = "\u25A1",
            summary = "Benefits, limits, and risks of cash and prepaid methods, without romanticising any of them.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Cash and prepaid instruments reduce the distant financial record, " +
                        "but they introduce other risks: loss, theft, fees, and limits on " +
                        "recourse. Prepaid cards also come with their own records — " +
                        "purchase, activation, and reloading can all be logged, and some " +
                        "prepaid products require identification."
                ),
                Block.Heading("Use them where they fit", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Use cash for small, everyday purchases where the record matters more than the convenience.",
                        "Check a prepaid product's terms: what identification, fees, and records does it involve?",
                        "Do not carry large amounts of cash; the physical risk quickly outweighs the privacy gain.",
                        "Keep cash and prepaid use lawful and ordinary; unusual patterns attract attention of their own."
                    )
                ),
                Block.Warning(
                    "No method is magic",
                    "Cash does not make a purchase invisible, and prepaid does not make it " +
                        "anonymous. Both change who holds the record and how complete it is."
                ),
                Block.Para(
                    "The honest question is always the same: whose record, how complete, " +
                        "and what happens if it is obtained? Answer it for cash and prepaid " +
                        "just as you would for a card."
                )
            ),
            outcomes = listOf(
                "Explain the trade-offs of cash and prepaid methods honestly.",
                "Check a prepaid product's identification, fee, and record terms.",
                "Avoid carrying amounts where physical risk outweighs privacy gain."
            ),
            howTo = listOf(
                "Read a prepaid product's terms before buying it, including identification and records.",
                "Use cash for small purchases where the record matters most.",
                "Limit cash carried to what the day actually needs.",
                "Keep cash and prepaid use ordinary and lawful."
            ),
            bestPractices = listOf(
                "Judge every method by whose record it creates, not by its reputation.",
                "Ordinary, lawful use attracts less attention than elaborate avoidance."
            ),
            cautions = listOf(
                "Prepaid cards can require identification and log activation and reloading.",
                "Large or unusual cash patterns attract attention of their own."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to payment privacy.")
            )
        ),
        Brief(
            id = "fin-subscriptions",
            title = "Subscriptions, Loyalty, and Purchase Data",
            glyph = "\u221E",
            summary = "The quiet trail of everyday spending — and how to prune it without losing what you value.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Subscriptions and loyalty programmes are continuous records: what " +
                        "you buy, how often, where, and in what combinations, over months " +
                        "and years. Individually trivial, together they describe your " +
                        "routines, your health, your household, and your interests in " +
                        "detail — and they are routinely shared, sold, or combined with " +
                        "other data."
                ),
                Block.Heading("Prune the trail", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "List every subscription and loyalty programme, and cancel what you no longer use.",
                        "For programmes you keep, check what data they collect and whether you can limit it.",
                        "Use a separate email address for subscriptions, so the trail is not linked to your main identity by default.",
                        "Decline loyalty tracking where the discount is not worth the record."
                    )
                ),
                Block.Field(
                    "The discount is the price",
                    "A loyalty discount is rarely free. You are paying with purchase data. " +
                        "Sometimes that is a fair trade; often it is not, and the choice " +
                        "should be conscious either way."
                ),
                Block.Para(
                    "Pruning is maintenance, not a one-time purge. New subscriptions " +
                        "arrive quietly; review them on a schedule."
                )
            ),
            outcomes = listOf(
                "List your subscriptions and loyalty programmes and their data.",
                "Cancel unused subscriptions and limit data on the ones you keep.",
                "Separate subscription identities from your main identity."
            ),
            howTo = listOf(
                "List every subscription and loyalty programme you hold.",
                "Cancel what you have not used in the last few months.",
                "Check data collection and sharing settings on the programmes you keep.",
                "Use a separate email address for subscriptions."
            ),
            bestPractices = listOf(
                "A discount paid for with data is a purchase, not a gift; judge it as one.",
                "Review subscriptions on a schedule, because they accumulate quietly."
            ),
            cautions = listOf(
                "Purchase histories over years describe routines, health, and household in detail.",
                "Cancelling a subscription does not always delete its historical data; check the policy."
            ),
            references = listOf(
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Recommendations for accounts and data.")
            )
        ),
        Brief(
            id = "fin-banking-apps",
            title = "Banking Apps, Devices, and Session Safety",
            glyph = "\u25A3",
            summary = "The device and session side of money: your banking app is only as safe as the phone it runs on.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Banking on a phone concentrates risk: the app, the device, the " +
                        "network, and the session all have to hold. A compromised phone, " +
                        "an observed session, or a session left open on a shared device " +
                        "can expose more than any single transaction."
                ),
                Block.Heading("Keep sessions safe", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Use a device with automatic updates, a strong lock, and no sideloaded apps for banking.",
                        "Do not bank on public Wi-Fi without a trusted VPN, and prefer your mobile network for sensitive actions.",
                        "Log out fully, and do not save banking credentials in a shared browser.",
                        "Turn on transaction alerts, so an unauthorised transaction reaches you quickly."
                    )
                ),
                Block.Warning(
                    "Shared devices, shared risk",
                    "Banking from a shared or borrowed device leaves credentials, sessions, " +
                        "and cached data behind. If you must, log out, clear the session, " +
                        "and change the password from your own device afterwards."
                ),
                Block.Para(
                    "Alerts are your early warning system. A transaction you notice " +
                        "within minutes is a problem you can contain; one you notice in " +
                        "a monthly statement is a problem that has already spread."
                )
            ),
            outcomes = listOf(
                "Bank only from an updated, locked device you control.",
                "Avoid sensitive banking on untrusted networks and shared devices.",
                "Use transaction alerts as an early warning system."
            ),
            howTo = listOf(
                "Turn on automatic updates and a strong lock on your banking device.",
                "Turn on transaction alerts for every account you use.",
                "Log out fully after banking, especially on any device you do not own.",
                "Prefer your mobile network over public Wi-Fi for sensitive banking actions."
            ),
            bestPractices = listOf(
                "Alerts turn a monthly surprise into a minutes-old problem you can contain.",
                "A banking device should be boring: updated, locked, and free of sideloaded apps."
            ),
            cautions = listOf(
                "Public Wi-Fi and shared devices expose sessions, not only passwords.",
                "Saved credentials in a shared browser outlive the session you meant to end."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to device and session safety.")
            )
        ),
        Brief(
            id = "fin-crypto",
            title = "Crypto Basics for Privacy",
            glyph = "\u20BF",
            summary = "What cryptocurrency does and does not hide, in plain terms. General information only — not investment advice.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "This brief is general information about privacy, not investment " +
                        "advice, and not a recommendation to buy, hold, or use any " +
                        "cryptocurrency. The privacy point is simple and often " +
                        "misunderstood: most public blockchains are public ledgers. " +
                        "Transactions are visible to anyone, forever, and linked by " +
                        "addresses — pseudonymous, not anonymous."
                ),
                Block.Heading("What it hides, and what it does not", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "A public blockchain hides your legal name, but not the transaction graph: amounts, times, and address links are visible.",
                        "Exchanges that require identification link your identity to your addresses when you buy or sell.",
                        "Reusing one address for many transactions links them all together.",
                        "Privacy-focused designs exist, but they have their own trade-offs, limits, and legal considerations."
                    )
                ),
                Block.Warning(
                    "Permanent and public",
                    "A transaction on a public ledger cannot be deleted. An address linked " +
                        "to you today links your past transactions too, and any future " +
                        "linking can expose them retroactively."
                ),
                Block.Para(
                    "If you use cryptocurrency, understand the ledger you are writing " +
                        "to before you write to it. Privacy in this area rewards study " +
                        "and punishes assumption."
                )
            ),
            outcomes = listOf(
                "Explain why public blockchains are pseudonymous, not anonymous.",
                "Explain how exchanges and address reuse link transactions to identity.",
                "State that this brief is general information, not investment advice."
            ),
            howTo = listOf(
                "Before using any cryptocurrency, read how its ledger records transactions.",
                "Avoid reusing addresses across unrelated transactions.",
                "Understand what identification an exchange requires and what it links.",
                "Assume anything written to a public ledger is permanent and public."
            ),
            bestPractices = listOf(
                "Study the ledger before you use it; privacy here punishes assumption.",
                "Separate identities and addresses by purpose, as with any other financial instrument."
            ),
            cautions = listOf(
                "Public does not mean private just because no name is attached.",
                "A future link can retroactively expose past transactions on a permanent ledger."
            ),
            references = listOf(
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Recommendations for cryptocurrency and privacy.")
            )
        ),
        Brief(
            id = "fin-tax-records",
            title = "Tax, Records, and Secure Storage",
            glyph = "\u25A4",
            summary = "Keep the records you must keep, safely — and know what must be kept. General information, not tax or legal advice.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "This brief is general information, not tax or legal advice, and " +
                        "it does not replace a qualified professional for your situation. " +
                        "The OPSEC point is narrower: financial records must be kept, " +
                        "often for years, and kept records are a target. Keeping them " +
                        "safely — encrypted, backed up, and access-controlled — is as " +
                        "important as keeping them at all."
                ),
                Block.Heading("Keep records safely", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Find out, from a qualified source for your jurisdiction, what records you must keep and for how long.",
                        "Store records encrypted, with backups, and with access limited to people who need it.",
                        "Keep a simple index of what is stored where, so you can find and produce records when required.",
                        "Dispose of records securely once their required retention period has genuinely ended."
                    )
                ),
                Block.Field(
                    "Keeping and hiding are different",
                    "Secure storage is not concealment from lawful obligations. Records " +
                        "kept for tax or legal purposes must remain producible when " +
                        "lawfully required."
                ),
                Block.Para(
                    "When in doubt about what to keep or for how long, ask a qualified " +
                        "professional in your jurisdiction. Guessing wrong in either " +
                        "direction — discarding too early or keeping insecurely — creates risk."
                )
            ),
            outcomes = listOf(
                "Explain why financial records need secure, backed-up, access-controlled storage.",
                "Find the retention rules for your jurisdiction from a qualified source.",
                "Distinguish secure storage from concealment."
            ),
            howTo = listOf(
                "Ask a qualified professional what records you must keep and for how long.",
                "Store records encrypted, backed up, and with limited access.",
                "Keep a simple index of what is stored where.",
                "Dispose of records securely only after their retention period has ended."
            ),
            bestPractices = listOf(
                "Encrypted, backed up, and access-controlled is the baseline for financial records.",
                "An index you can use under pressure is part of the storage, not an extra."
            ),
            cautions = listOf(
                "Discarding records too early and keeping them insecurely are both risks.",
                "Secure storage must not become concealment from lawful obligations."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to secure storage and backups.")
            )
        ),
        Brief(
            id = "fin-scams",
            title = "Financial Scams and Recovery Pressure",
            glyph = "\u26A0",
            summary = "Urgency, authority, and 'recover your money' traps — including the scam that follows a scam.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Financial scams follow a pattern: urgency, authority, and secrecy. " +
                        "A message claims your account is at risk, an investment is " +
                        "closing, or a payment is overdue, and it demands immediate " +
                        "action through a channel the scammer controls. A second scam " +
                        "often follows the first: someone offering, for a fee, to recover " +
                        "the money you just lost."
                ),
                Block.Heading("Break the pattern", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Stop, and verify through a channel you trust, not the message.",
                        "Never pay a recovery fee to someone who contacted you after a loss.",
                        "Report the scam to your bank, the platform, and the relevant authority.",
                        "Tell people who might be targeted next, especially older relatives and colleagues."
                    )
                ),
                Block.Warning(
                    "Recovery scams",
                    "Anyone who contacts you offering to recover lost money, for an " +
                        "upfront fee, is almost certainly running a second scam. Legitimate " +
                        "recovery does not arrive unsolicited, and does not charge upfront."
                ),
                Block.Para(
                    "Shame keeps scams alive. Reporting quickly, without embarrassment, " +
                        "protects your money and the next person the scammer would have tried."
                )
            ),
            outcomes = listOf(
                "Recognise urgency, authority, and secrecy as the scam pattern.",
                "Refuse upfront-fee recovery offers.",
                "Report a scam quickly to bank, platform, and authority."
            ),
            howTo = listOf(
                "Pause any urgent financial request and verify through a trusted channel.",
                "Refuse any unsolicited recovery offer that charges upfront.",
                "Report to your bank, the platform, and the relevant authority promptly.",
                "Warn people likely to be targeted next."
            ),
            bestPractices = listOf(
                "Verification through a separate channel breaks every version of this scam.",
                "Reporting quickly protects both your money and the next target."
            ),
            cautions = listOf(
                "Shame about falling for a scam stops reporting, which helps the scammer.",
                "A recovery offer that arrives unsolicited is itself a scam until proven otherwise."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to scams and reporting.")
            )
        ),
        Brief(
            id = "fin-routine",
            title = "Building a Financial Privacy Routine",
            glyph = "\u25C8",
            summary = "A weekly and monthly routine that survives real life — the chapter's lessons, made habitual.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Financial privacy fails when it depends on remembering to do it. " +
                        "A routine survives because it is scheduled, short, and tied to " +
                        "something you already do. This brief turns the chapter into " +
                        "that routine."
                ),
                Block.Heading("Weekly, in ten minutes", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Review transactions and alerts for anything you do not recognise.",
                        "Check that separation is holding: no cross-use of instruments by accident.",
                        "Clear or file receipts you no longer need."
                    )
                ),
                Block.Heading("Monthly, in thirty minutes", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Review subscriptions and loyalty programmes; cancel what is unused.",
                        "Review granted access: payment apps, linked accounts, and budgeting tools.",
                        "Back up financial records, and check that the backup restores.",
                        "Revisit your financial footprint map, and update it for new accounts."
                    )
                ),
                Block.Para(
                    "Put the routine on a calendar, not in your head. A routine that " +
                        "lives in your head lives nowhere after a busy month."
                )
            ),
            outcomes = listOf(
                "Run a weekly ten-minute financial privacy check.",
                "Run a monthly thirty-minute review of subscriptions, access, and backups.",
                "Keep your financial footprint map current."
            ),
            howTo = listOf(
                "Schedule a weekly ten-minute transaction and alert review.",
                "Schedule a monthly thirty-minute subscription, access, and backup review.",
                "Put both on a calendar, tied to an existing habit.",
                "Update your footprint map whenever you open an account or start a subscription."
            ),
            bestPractices = listOf(
                "Scheduled routines survive busy months; remembered intentions do not.",
                "Short and regular beats long and rare, for privacy as for everything else."
            ),
            cautions = listOf(
                "A routine that takes an hour will be skipped; keep it short enough to keep.",
                "Skipping the backup check turns a backup into a hope."
            ),
            references = listOf(
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Recommendations for routine privacy practice.")
            )
        )
    )
)
