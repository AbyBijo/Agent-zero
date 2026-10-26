package com.abybijo.agent0.data

/** v2.0 Phase 4c: cases linked to CH-10 Financial Privacy briefs. Real incidents, public sources named. */
object Cases10 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "venmo-public-transactions-2017",
            title = "Venmo's Public Transactions (2017)",
            year = "2017",
            tags = listOf("Finance", "Payments", "Exposure"),
            summary = "BuzzFeed News showed that Venmo's default public transaction feed revealed the private lives of its users, including public figures, from payment notes alone.",
            details = "Venmo transactions were public by default, and journalists reconstructed relationships, routines, and activities from payment descriptions and timestamps. Users had not chosen to publish this information; they had simply not changed a default. The exposure came from a payment app behaving like a social network.",
            lessons = listOf(
                "Payment apps have privacy settings. Check them before the first transaction, not after the first exposure.",
                "A payment note is a public statement if the default says so. Write notes as if strangers will read them.",
                "Defaults are decisions made for you. Review them on every financial app you use."
            ),
            briefKey = "financial/fin-footprint",
            source = "BuzzFeed News (2017)"
        ),
        CaseStudy(
            id = "ftx-commingled-funds-2022",
            title = "FTX and Commingled Customer Funds (2022)",
            year = "2022",
            tags = listOf("Finance", "Crypto", "Separation"),
            summary = "The FTX cryptocurrency exchange collapsed in 2022 after customer funds were found to have been mixed with the assets of its affiliated trading firm, Alameda Research.",
            details = "FTX presented itself as a safe place to hold customer assets, but customer funds were used in ways customers had not agreed to. When confidence collapsed, withdrawals could not be met. The failure was, at its core, a separation failure: money that should have been kept apart was not.",
            lessons = listOf(
                "Separation is a protection, not bookkeeping. Money held for others must stay apart from money used for trading.",
                "An exchange holding your assets is a counterparty, not a vault. Understand that risk before depositing.",
                "If a platform cannot explain, simply, how your funds are kept separate, do not trust it with them."
            ),
            briefKey = "financial/fin-separation",
            source = "FTX bankruptcy proceedings and reporting (2022)"
        ),
        CaseStudy(
            id = "zelle-fraud-senate-2023",
            title = "Zelle Fraud and Instant Payments (2023)",
            year = "2023",
            tags = listOf("Finance", "Payments", "Fraud"),
            summary = "A US Senate investigation found that fraud and scams on the Zelle instant-payment network had cost bank customers large sums, with reimbursement often refused because the payments were authorised by the victims themselves.",
            details = "Zelle payments are instant and generally irreversible, which makes them attractive to scammers who trick victims into sending money. Banks argued that authorised payments were not fraud under their rules, leaving victims with little recourse. The speed that makes instant payments convenient also makes them final.",
            lessons = listOf(
                "Instant means irreversible. Treat an instant payment like handing over cash, not like a card payment you can dispute.",
                "Authorised under deception is still lost money. Verify the recipient through a separate channel before sending.",
                "For large or first-time payments, use a slower, reversible method, even when instant is offered."
            ),
            briefKey = "financial/fin-payments",
            source = "US Senate Permanent Subcommittee on Investigations (2023)"
        ),
        CaseStudy(
            id = "gift-card-scams-ftc",
            title = "Gift Card Payment Scams (FTC Reports)",
            year = "2023",
            tags = listOf("Finance", "Scams", "Prepaid"),
            summary = "The US Federal Trade Commission has repeatedly reported gift cards as a leading payment method demanded by scammers, who instruct victims to buy cards and read out the codes.",
            details = "Scammers impersonating officials, tech support, or family members tell victims to pay with gift cards, because gift card codes are as good as cash and nearly untraceable once shared. Legitimate organisations do not demand payment in gift cards. The scam works because the payment method itself is designed to be anonymous and irreversible.",
            lessons = listOf(
                "No legitimate organisation demands payment in gift cards. That demand is itself the proof of fraud.",
                "Prepaid value, once the code is shared, is gone. There is no chargeback for a gift card code.",
                "If anyone pressures you to pay an unusual way, stop and verify through a separate, trusted channel."
            ),
            briefKey = "financial/fin-cash-prepaid",
            source = "US Federal Trade Commission (reports)"
        ),
        CaseStudy(
            id = "amazon-prime-ftc-2023",
            title = "Amazon Prime and Subscription Dark Patterns (2023)",
            year = "2023",
            tags = listOf("Finance", "Subscriptions", "Dark Patterns"),
            summary = "The US Federal Trade Commission sued Amazon in 2023, alleging it enrolled users in Prime through deceptive design and made cancellation deliberately difficult.",
            details = "The FTC alleged that Amazon used confusing checkout flows to enrol users who had not clearly agreed, and a multi-step cancellation process designed to discourage leaving. The case showed that subscription costs are not only about price: they are about how hard a service makes it to stop paying.",
            lessons = listOf(
                "Audit subscriptions regularly. A service you forgot is still charging you.",
                "If cancelling takes many steps, that difficulty is deliberate. Persist, and record the attempt.",
                "Before subscribing, check the cancellation path, not only the signup offer."
            ),
            briefKey = "financial/fin-subscriptions",
            source = "US Federal Trade Commission (2023)"
        ),
        CaseStudy(
            id = "sim-swap-fbi-2022",
            title = "SIM Swapping and Account Takeover (FBI Warnings)",
            year = "2022",
            tags = listOf("Finance", "Banking", "Account Takeover"),
            summary = "The FBI warned that SIM-swapping attacks, in which criminals transfer a victim's phone number to their own SIM, were being used to bypass SMS-based authentication and take over financial accounts.",
            details = "Attackers convince or bribe carrier staff to move a victim's number, then receive the victim's SMS codes and reset passwords, including for banking apps. The victim's phone goes dark, and by the time service is restored, accounts may already be drained. The weakness is not the banking app alone; it is SMS as an authentication method.",
            lessons = listOf(
                "SMS codes are the weakest second factor. Use app-based or hardware authentication for financial accounts where available.",
                "If your phone suddenly loses service, treat it as a possible attack, not a network fault, and contact your bank and carrier immediately.",
                "Set a carrier PIN or port-out protection, and keep recovery options that do not depend on SMS alone."
            ),
            briefKey = "financial/fin-banking-apps",
            source = "FBI Internet Crime Complaint Center (2022)"
        ),
        CaseStudy(
            id = "mt-gox-2014",
            title = "Mt. Gox Collapse (2014)",
            year = "2014",
            tags = listOf("Finance", "Crypto", "Exchange"),
            summary = "Mt. Gox, once the world's largest bitcoin exchange, collapsed in 2014 after hundreds of thousands of bitcoins belonging to customers went missing.",
            details = "The exchange, which handled most of the world's bitcoin trading, filed for bankruptcy after discovering the loss. Customers who had treated the exchange as a safe place to store bitcoin found their funds were gone, with recovery taking years through bankruptcy proceedings. The exchange was a single point of failure for its customers' assets.",
            lessons = listOf(
                "An exchange is not a wallet. Assets left on an exchange are exposed to the exchange's failure.",
                "Concentration is risk: a single platform holding most of an asset class is a single point of failure.",
                "Understand custody before depositing: who actually controls the assets, and what happens if the platform fails?"
            ),
            briefKey = "financial/fin-crypto",
            source = "Mt. Gox bankruptcy proceedings (2014)"
        ),
        CaseStudy(
            id = "propublica-secret-irs-files-2021",
            title = "ProPublica and the Secret IRS Files (2021)",
            year = "2021",
            tags = listOf("Finance", "Tax", "Data Leak"),
            summary = "ProPublica published reporting in 2021 based on a trove of confidential tax records of wealthy Americans, obtained from the Internal Revenue Service and never intended for publication.",
            details = "The records, covering more than a decade, revealed how the wealthiest Americans legally paid little income tax. The source of the leak was later prosecuted, but the publication itself showed that even the most sensitive financial records, held by a government agency, can leave that agency's control.",
            lessons = listOf(
                "Tax records are among the most sensitive financial data you have. Treat their storage and sharing accordingly.",
                "Data held by a trusted institution is still data that can leak. Minimise what is collected and retained.",
                "Financial privacy depends on every holder of your data, not only on your own precautions."
            ),
            briefKey = "financial/fin-tax-records",
            source = "ProPublica (2021)"
        ),
        CaseStudy(
            id = "pig-butchering-scams-fbi-2023",
            title = "Pig-Butchering Investment Scams (FBI, 2023)",
            year = "2023",
            tags = listOf("Finance", "Scams", "Crypto"),
            summary = "The FBI warned about 'pig-butchering' scams, in which criminals build a long-term relationship with a victim, often through a fake romantic or friendly contact, then persuade them to invest in fraudulent cryptocurrency platforms.",
            details = "Victims are shown fake profits on convincing platforms, encouraged to invest more, and then find withdrawals blocked. Reported losses ran into billions of dollars. The scam works because the relationship, built over weeks or months, makes the investment feel trusted — and because the platforms look professional.",
            lessons = listOf(
                "A long relationship is not due diligence. Verify any investment platform independently before sending money.",
                "Fake profits are bait. If withdrawals are blocked or require further payment, it is a scam.",
                "Investment advice from a new romantic or online contact, however kind, is a red flag, not a recommendation."
            ),
            briefKey = "financial/fin-scams",
            source = "FBI Internet Crime Complaint Center (2023)"
        ),
        CaseStudy(
            id = "equifax-2017",
            title = "Equifax Breach (2017)",
            year = "2017",
            tags = listOf("Finance", "Routine", "Patching"),
            summary = "Equifax, one of the largest US credit bureaus, suffered a breach in 2017 exposing the personal data of about 147 million people, after failing to patch a known vulnerability.",
            details = "Attackers exploited an unpatched vulnerability in a web application framework, then moved through Equifax's systems for months, exfiltrating names, Social Security numbers, birth dates, and addresses. A US House report later found that a single employee's failure to apply a patch, and a failure to renew a security certificate, contributed to the breach.",
            lessons = listOf(
                "Routine maintenance is security: an unpatched known vulnerability is an open door, not a minor oversight.",
                "Data collected about people who never chose to share it is still data that must be defended.",
                "After a breach of identity data, freeze credit and monitor accounts: identifiers like Social Security numbers cannot be changed easily."
            ),
            briefKey = "financial/fin-routine",
            source = "US House Oversight Committee report (2018)"
        )
    )
}
