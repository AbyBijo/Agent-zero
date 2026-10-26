package com.abybijo.agent0.data

/** v2.0 Phase 4c: cases linked to CH-12 Incident Response briefs. Real incidents, public sources named. */
object Cases12 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "norsk-hydro-ransomware-2019",
            title = "Norsk Hydro Ransomware Response (2019)",
            year = "2019",
            tags = listOf("Incident", "First Hour", "Ransomware"),
            summary = "Aluminium producer Norsk Hydro was hit by ransomware in 2019 and responded by switching to manual operations, communicating openly, and refusing to pay.",
            details = "In the first hours, Hydro shut down affected systems, moved plants to manual control, and told employees, customers, and the public what had happened. The company later reported that recovery cost tens of millions, but operations continued and no ransom was paid. Its first-hour decisions — contain, communicate, go manual — shaped the whole recovery.",
            lessons = listOf(
                "The first hour is about containment and communication, not diagnosis. Shut down, go manual, tell people.",
                "Refusing to pay is a decision made easier by backups and manual fallbacks prepared in advance.",
                "Open communication during an incident builds trust; silence breeds rumour."
            ),
            briefKey = "incident/ir-first-hour",
            source = "Norsk Hydro (2019)"
        ),
        CaseStudy(
            id = "cloudflare-cloudbleed-2017",
            title = "Cloudflare Cloudbleed (2017)",
            year = "2017",
            tags = listOf("Incident", "Evidence", "Disclosure"),
            summary = "In 2017, Google's Project Zero found that a Cloudflare bug was leaking sensitive data from customer websites into search engine caches, and Cloudflare moved quickly to fix it and preserve evidence.",
            details = "The bug, in Cloudflare's HTML parser, caused memory contents — including passwords and tokens — to be returned in web responses. Project Zero's researcher worked with Cloudflare to understand the scope, and Cloudflare patched, purged caches, and disclosed the incident within days. The evidence trail, from discovery to disclosure, was preserved throughout.",
            lessons = listOf(
                "Preserve evidence from the first moment: logs, samples, and timelines, before systems are changed.",
                "Work with the finder, not against them. Coordinated disclosure protects users faster than denial.",
                "A bug's scope must be measured before it is announced, or the announcement will be wrong."
            ),
            briefKey = "incident/ir-evidence",
            source = "Google Project Zero and Cloudflare (2017)"
        ),
        CaseStudy(
            id = "jack-dorsey-sim-swap-2019",
            title = "Jack Dorsey's Twitter Account Hijacked (2019)",
            year = "2019",
            tags = listOf("Incident", "Account", "SIM Swap"),
            summary = "Twitter CEO Jack Dorsey's account was hijacked in 2019 after attackers used SIM swapping to take over his phone number and bypass account protections.",
            details = "Attackers transferred Dorsey's number to their own SIM, then used SMS-based recovery to post from his account. Twitter said the compromise came through the mobile provider, not through Twitter's own systems. The incident showed that even the most prominent accounts depend on the weakest link in their recovery chain.",
            lessons = listOf(
                "Account recovery is part of account security. A strong password with SMS recovery is only as strong as SMS.",
                "If an account is taken over, revoke sessions, reset credentials from a clean device, and check what was changed.",
                "High-profile accounts need hardware or app-based authentication, and carrier protections, not SMS alone."
            ),
            briefKey = "incident/ir-account",
            source = "Twitter (2019)"
        ),
        CaseStudy(
            id = "operation-triangulation-2023",
            title = "Operation Triangulation iPhone Spyware (2023)",
            year = "2023",
            tags = listOf("Incident", "Device", "Spyware"),
            summary = "Kaspersky researchers revealed in 2023 that iPhones had been infected with spyware through a zero-click iMessage exploit, in a campaign they called Operation Triangulation.",
            details = "The spyware infected devices without any user action, through a malicious iMessage attachment, and gave attackers broad access to the device. Kaspersky's researchers discovered it while investigating their own devices, and published detailed forensic analysis. Victims had no sign their device was compromised until forensic examination.",
            lessons = listOf(
                "A device that shows no symptoms can still be compromised. Forensic examination, not appearance, decides.",
                "Zero-click exploits mean that careful behaviour alone cannot prevent compromise. Keep devices updated.",
                "If a device is suspected, treat it as untrusted: preserve it for examination, and move sensitive work to a clean device."
            ),
            briefKey = "incident/ir-device",
            source = "Kaspersky (2023)"
        ),
        CaseStudy(
            id = "first-american-2019",
            title = "First American Financial Exposure (2019)",
            year = "2019",
            tags = listOf("Incident", "Breach", "Exposure"),
            summary = "First American Financial, a title insurance company, exposed hundreds of millions of sensitive documents in 2019 through a website flaw that let anyone access records by changing a number in a URL.",
            details = "Security researcher Brian Krebs reported that the company's website allowed access to mortgage and bank details, Social Security numbers, and other sensitive documents simply by incrementing a document ID. No hacking was required. The company fixed the flaw after disclosure, and was later fined by regulators.",
            lessons = listOf(
                "A breach does not require an attacker to break in. An open door is a breach, even if nobody forced it.",
                "Test access controls as an outsider would: can a document be reached by guessing its address?",
                "Sensitive documents need authentication and authorisation on every request, not only on the front door."
            ),
            briefKey = "incident/ir-breach",
            source = "Krebs on Security (2019)"
        ),
        CaseStudy(
            id = "tmobile-breach-2021",
            title = "T-Mobile Breach (2021)",
            year = "2021",
            tags = listOf("Incident", "Identity Theft", "Breach"),
            summary = "T-Mobile suffered a breach in 2021 exposing personal data of tens of millions of customers, including names, dates of birth, and Social Security numbers, creating long-term identity theft risk.",
            details = "Attackers accessed T-Mobile's systems through misconfigured routers and servers, then offered the stolen data for sale. T-Mobile confirmed the breach and offered identity protection services, but the exposed identifiers — unlike passwords — cannot be changed, leaving victims exposed for years.",
            lessons = listOf(
                "Identity data breaches have no expiry date. Identifiers that cannot be changed need the strongest protection.",
                "After an identity-data breach, freeze credit and monitor accounts, and expect the risk to persist.",
                "Misconfigured infrastructure is an open door. Audit routers, servers, and access points as carefully as applications."
            ),
            briefKey = "incident/ir-identity-theft",
            source = "T-Mobile and SEC filings (2021)"
        ),
        CaseStudy(
            id = "facebook-plaintext-passwords-2019",
            title = "Facebook Plaintext Passwords (2019)",
            year = "2019",
            tags = listOf("Incident", "Reporting", "Disclosure"),
            summary = "Facebook disclosed in 2019 that hundreds of millions of user passwords had been stored in plaintext, readable by employees, in its internal systems.",
            details = "The passwords were logged in plaintext in internal systems, accessible to thousands of employees, over several years. Facebook said it found no evidence of abuse, and disclosed the issue after an investigation prompted by a security researcher's report. The disclosure itself, and its timing, became part of the story.",
            lessons = listOf(
                "Report an incident when its scope is understood, not when it is convenient. Delay erodes trust faster than the incident itself.",
                "Passwords must never be stored in readable form. Hashing is a basic control, not an advanced one.",
                "Internal access to sensitive data needs auditing, even when no abuse is suspected."
            ),
            briefKey = "incident/ir-reporting",
            source = "Facebook and Krebs on Security (2019)"
        ),
        CaseStudy(
            id = "british-airways-2018",
            title = "British Airways Breach (2018)",
            year = "2018",
            tags = listOf("Incident", "Communication", "Breach"),
            summary = "British Airways suffered a breach in 2018 in which attackers skimmed payment card details from customers on its website and app, and the airline was later fined 20 million pounds by the UK regulator.",
            details = "Attackers injected malicious code into the airline's website, harvesting card details as customers entered them. British Airways disclosed the breach, but the UK Information Commissioner's Office found security failings and imposed one of its largest fines. The airline's public communication, and its security shortcomings, were both scrutinised.",
            lessons = listOf(
                "What you say during an incident matters as much as what you do. Be accurate, specific, and prompt.",
                "Third-party code on payment pages is a risk. Audit scripts that touch sensitive data.",
                "Regulatory fines follow security failings, not only breaches. Prevention is cheaper than disclosure."
            ),
            briefKey = "incident/ir-talking",
            source = "UK Information Commissioner's Office (2020)"
        ),
        CaseStudy(
            id = "sfmta-ransomware-2016",
            title = "San Francisco MTA Ransomware Recovery (2016)",
            year = "2016",
            tags = listOf("Incident", "Recovery", "Ransomware"),
            summary = "San Francisco's transit agency was hit by ransomware in 2016, and recovered by restoring systems from backups and refusing to pay, while keeping trains running and fares free during the disruption.",
            details = "Attackers encrypted the agency's ticketing and email systems and demanded a ransom. The agency, rather than paying, restored from backups and operated with free fares while systems were rebuilt. The recovery was slower than paying would have been, but it left the agency in control of its own systems.",
            lessons = listOf(
                "Backups are the recovery plan. Test them before an incident, not during one.",
                "Refusing to pay is viable only when restoration is possible. Make it possible in advance.",
                "A recovery checklist — restore, verify, reopen in order — beats improvisation under pressure."
            ),
            briefKey = "incident/ir-recovery-checklist",
            source = "San Francisco Municipal Transportation Agency (2016)"
        ),
        CaseStudy(
            id = "optus-breach-2022",
            title = "Optus Breach and Aftermath (2022)",
            year = "2022",
            tags = listOf("Incident", "After Action", "Breach"),
            summary = "Australian telecom Optus suffered a breach in 2022 exposing personal data of about 10 million customers, and the aftermath led to government reviews, law changes, and lasting scrutiny of telecom data practices.",
            details = "Attackers accessed customer data through an exposed API, and Optus's handling of the breach — including its communication and its claims about the attack's sophistication — was heavily criticised. The Australian government subsequently tightened breach reporting and data retention rules, and Optus faced class actions and regulatory action.",
            lessons = listOf(
                "After-action review must be honest about what failed, including communication, not only technology.",
                "An exposed API is an exposed system. Test APIs as attackers would, before they do.",
                "The aftermath of a breach lasts years. Changes made after it must be real, not only announced."
            ),
            briefKey = "incident/ir-after-action",
            source = "Australian Government and OAIC reporting (2022)"
        )
    )
}
