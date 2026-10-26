package com.abybijo.agent0.data

/** v2.0 Phase 4c: cases linked to CH-15 Capstone briefs. Real incidents, public sources named. */
object Cases15 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "google-location-history-2018",
            title = "Google Location History (2018)",
            year = "2018",
            tags = listOf("Capstone", "Daily", "Location"),
            summary = "In 2018, the Associated Press found that Google continued to track users' locations even after they had turned off Location History, through other settings and services.",
            details = "Google's Location History setting, when off, did not stop all location tracking: web and app activity, and other services, continued to record where users went. Users who believed they had switched tracking off had not. The finding showed that a daily posture must include checking settings, not only setting them once.",
            lessons = listOf(
                "A setting switched off once is not a setting verified. Check privacy settings on a schedule.",
                "Location tracking hides in many settings, not one. Review them all, not only the obvious one.",
                "A daily routine that includes a settings check catches drift before it becomes exposure."
            ),
            briefKey = "capstone/cap-daily",
            source = "Associated Press (2018)"
        ),
        CaseStudy(
            id = "google-plus-breach-2018",
            title = "Google+ Breach and Shutdown (2018)",
            year = "2018",
            tags = listOf("Capstone", "Reviews", "Disclosure"),
            summary = "In 2018, the Wall Street Journal revealed that a Google+ API bug had exposed private data of hundreds of thousands of users, and that Google had delayed disclosure before shutting the service down.",
            details = "The bug, in Google's social network, allowed third-party developers to access private profile data. Google found and fixed it in March 2018 but did not disclose it until October, citing fears of regulatory scrutiny. The service was then shut down for consumers. A periodic review that had caught the bug earlier, or a disclosure policy that had acted sooner, would have changed the outcome.",
            lessons = listOf(
                "Periodic reviews catch what daily habits miss. Review access, permissions, and APIs on a schedule.",
                "Delayed disclosure compounds a breach. Disclose when scope is understood, not when convenient.",
                "A service you no longer use still holds your data. Close accounts, don't only abandon them."
            ),
            briefKey = "capstone/cap-reviews",
            source = "Wall Street Journal and Google (2018)"
        ),
        CaseStudy(
            id = "uk-ceo-voice-fraud-2019",
            title = "UK Insurer CEO Voice Fraud (2019)",
            year = "2019",
            tags = listOf("Capstone", "Stress", "Voice Fraud"),
            summary = "In 2019, criminals used AI-cloned voice technology to impersonate the CEO of a UK insurance firm and trick a subordinate into transferring a large sum to a fraudulent account.",
            details = "The subordinate received a call that sounded exactly like his boss, instructing an urgent transfer. Under pressure and trusting the familiar voice, he complied. The funds were moved through several accounts and never recovered. The attack succeeded not through technology alone, but through urgency and a trusted voice, under stress.",
            lessons = listOf(
                "Urgency is an attacker's tool. An urgent, unusual instruction deserves a pause, not compliance.",
                "A familiar voice is no longer proof of identity. Verify unusual transfers through a separate channel.",
                "Stress-tested habits — pause, check, verify — must be practised before the stressful moment arrives."
            ),
            briefKey = "capstone/cap-stress",
            source = "Europol and insurance reporting (2019)"
        ),
        CaseStudy(
            id = "facebook-moderators-2020",
            title = "Facebook Content Moderators (2020)",
            year = "2020",
            tags = listOf("Capstone", "Burnout", "Vigilance"),
            summary = "In 2020, Facebook settled a lawsuit with content moderators who had suffered psychological harm from constant exposure to disturbing content, after years of high-volume, high-alert work.",
            details = "Moderators reviewed thousands of disturbing posts daily, under strict productivity targets, with limited support. Many developed post-traumatic stress. The settlement, worth 52 million dollars, acknowledged the harm. The case shows what constant vigilance without rest does to people, whether they are moderators or anyone maintaining a security posture.",
            lessons = listOf(
                "Constant alertness without rest causes harm, and harmed attention notices less, not more.",
                "Sustainable vigilance is selective: fewer controls, better chosen, with deliberate rest.",
                "Burnout is a system failure, not a personal failure. Fix the workload, not only the worker."
            ),
            briefKey = "capstone/cap-burnout",
            source = "The Verge and Facebook settlement (2020)"
        ),
        CaseStudy(
            id = "cisa-vpn-warnings-2020",
            title = "CISA VPN Warnings in Remote Work Shift (2020)",
            year = "2020",
            tags = listOf("Capstone", "Updating", "Remote Work"),
            summary = "In 2020, as organisations shifted to remote work, the US Cybersecurity and Infrastructure Security Agency warned that attackers were exploiting VPN vulnerabilities at scale, because threat models had changed overnight.",
            details = "Organisations that had designed their security for office networks suddenly depended on VPNs, home networks, and personal devices. Attackers exploited known VPN flaws, and CISA issued urgent guidance. The shift showed that when life changes — for a person or an organisation — the threat model must be rebuilt, not patched.",
            lessons = listOf(
                "When life changes, rebuild the threat model. A model built for the old life answers the wrong questions.",
                "New dependencies — VPNs, home networks, personal devices — are new attack surfaces. Assess them as such.",
                "Update triggers matter: a life change should trigger a review, automatically, not eventually."
            ),
            briefKey = "capstone/cap-updating",
            source = "US CISA (2020)"
        ),
        CaseStudy(
            id = "wylie-cambridge-disclosure-2018",
            title = "Christopher Wylie and Cambridge Analytica Disclosure (2018)",
            year = "2018",
            tags = listOf("Capstone", "Teaching", "Disclosure"),
            summary = "In 2018, Christopher Wylie, a former Cambridge Analytica employee, disclosed to journalists how the firm had harvested Facebook data, teaching the public about data misuse without revealing his own private setup.",
            details = "Wylie, who had helped build the firm's data operation, worked with The Guardian and The New York Times to explain, in detail, how data was collected and used. His disclosure informed regulators and the public, and led to investigations and fines. He taught through evidence and explanation, not through exposing his own systems.",
            lessons = listOf(
                "Teaching works through evidence and principles, not through exposing your own setup.",
                "Responsible disclosure protects others without leaking your own posture.",
                "When you teach, use generic examples and the learner's situation, not your own."
            ),
            briefKey = "capstone/cap-teaching",
            source = "The Guardian (2018)"
        ),
        CaseStudy(
            id = "equifax-unpatched-2017-plan",
            title = "Equifax and the Unpatched Vulnerability (2017)",
            year = "2017",
            tags = listOf("Capstone", "Critical Information", "Patching"),
            summary = "Equifax, holding the most sensitive financial identifiers of about 147 million Americans, failed to patch a known vulnerability, and attackers used it to steal that critical information.",
            details = "The vulnerability, in a web framework, had a patch available for months. Equifax did not apply it, and attackers exploited it to access names, Social Security numbers, and birth dates. The case is a lesson in critical information: when you hold data whose loss harms millions, that data's protection is the plan, not one item in it.",
            lessons = listOf(
                "Identify your critical information first: the data whose loss harms you most. Protect that first.",
                "A known, unpatched vulnerability on a system holding critical data is not a minor oversight; it is the plan failing.",
                "Prioritisation is the plan. Without it, everything is equally protected, which means nothing is protected well."
            ),
            briefKey = "capstone/cap-plan1",
            source = "US House Oversight Committee report (2018)"
        ),
        CaseStudy(
            id = "whatsapp-nso-2019",
            title = "WhatsApp NSO Exploit (2019)",
            year = "2019",
            tags = listOf("Capstone", "Threats", "Countermeasures"),
            summary = "In 2019, WhatsApp revealed that NSO Group had exploited a vulnerability in its calling feature to install spyware on targeted phones, and WhatsApp patched the flaw and sued NSO.",
            details = "The exploit used a missed call to install spyware, without the victim answering. WhatsApp identified about 1,400 targeted users, including journalists and activists, notified them, patched the vulnerability, and filed a lawsuit. The response followed the OPSEC order: threat identified, risk assessed, countermeasures applied — patch, notification, legal action — in that order.",
            lessons = listOf(
                "Countermeasures follow threats and risks, in that order. WhatsApp's response — patch, notify, sue — answered a named threat.",
                "A missed call can be an attack. Update messaging apps promptly; patches close the exact holes attackers use.",
                "Notification is a countermeasure. Telling targeted users lets them protect themselves."
            ),
            briefKey = "capstone/cap-plan2",
            source = "WhatsApp and Citizen Lab (2019)"
        ),
        CaseStudy(
            id = "storm-0558-2023",
            title = "Storm-0558 and Stolen Signing Keys (2023)",
            year = "2023",
            tags = listOf("Capstone", "Scenario", "Cloud"),
            summary = "In 2023, Microsoft revealed that a China-linked group, Storm-0558, had stolen a signing key and used it to forge access tokens, reading emails of US government officials and others.",
            details = "The attackers obtained a consumer signing key, then forged tokens that gave them access to enterprise mailboxes — a chain of small failures compounding into a major breach. Microsoft and CISA published detailed timelines, and the incident became a case study in how cloud trust, key management, and token validation compound across a whole day of decisions.",
            lessons = listOf(
                "Small failures compound: a stolen key, a validation gap, and broad access became a major breach together.",
                "Cloud trust is a chain. Every link — keys, tokens, validation — must hold, or the chain fails.",
                "A full-day scenario tests whether discipline holds across decisions, not only in one moment."
            ),
            briefKey = "capstone/cap-scenario",
            source = "Microsoft and US CISA (2023)"
        ),
        CaseStudy(
            id = "twilio-phishing-2022",
            title = "Twilio SMS Phishing (2022)",
            year = "2022",
            tags = listOf("Capstone", "Completion", "Phishing"),
            summary = "In 2022, Twilio, a company whose business is messaging, was breached after employees were tricked by SMS phishing messages impersonating its IT department.",
            details = "Attackers sent employees text messages claiming their passwords had expired, linking to a fake login page. Employees who entered credentials gave attackers access to internal systems and customer data. Twilio disclosed the breach, rotated credentials, and changed its processes. The case shows that learning never ends: even a security-aware company, with trained staff, can be phished.",
            lessons = listOf(
                "Completion of a course is not completion of learning. Phishing evolves, and so must vigilance.",
                "SMS phishing works because it arrives on a trusted channel. Verify IT requests through a separate channel.",
                "After any incident, change processes, not only passwords. The process that allowed the phish must change."
            ),
            briefKey = "capstone/cap-completion",
            source = "Twilio (2022)"
        )
    )
}
