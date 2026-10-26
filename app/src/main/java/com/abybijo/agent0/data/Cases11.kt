package com.abybijo.agent0.data

/** v2.0 Phase 4c: cases linked to CH-11 Team OPSEC briefs. Real incidents, public sources named. */
object Cases11 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "reality-winner-2017",
            title = "Reality Winner and the Printed Document (2017)",
            year = "2017",
            tags = listOf("Team", "Insider", "Discipline"),
            summary = "NSA contractor Reality Winner printed a classified document and mailed it to a news outlet, and was identified quickly, in part because the printed copy carried microdot markings identifying the printer.",
            details = "Winner, a contractor with access to classified reporting, removed a document from a secure environment and shared it. Investigators traced the leak through printer identification dots and access records. The case shows that insider discipline failures are not abstract: every handling step leaves a record.",
            lessons = listOf(
                "Insider discipline is a team control, not a personal virtue. Access, printing, and removal must all be controlled.",
                "Every handling step leaves a trace. Act as if it does, because it does.",
                "A team that cannot explain who accessed what, when, cannot investigate a leak."
            ),
            briefKey = "team/team-discipline",
            source = "US Department of Justice (2017)"
        ),
        CaseStudy(
            id = "harold-martin-2016",
            title = "Harold Martin and Hoarded Documents (2016)",
            year = "2016",
            tags = listOf("Team", "Insider", "Need to Know"),
            summary = "NSA contractor Harold Martin was found to have hoarded a vast quantity of classified material at home over many years, far beyond anything his work required.",
            details = "Martin, who worked for Booz Allen Hamilton, removed highly classified documents and stored them at home and in his car. The material accumulated over two decades without detection, because access controls did not enforce need-to-know: access granted was never reviewed against actual work.",
            lessons = listOf(
                "Need-to-know must be reviewed, not only granted. Access that is never re-checked accumulates.",
                "Hoarding is a warning sign. Unusual retention should trigger a review, not silence.",
                "Contractors need the same access discipline as employees, with the same auditing."
            ),
            briefKey = "team/team-need-to-know",
            source = "US Department of Justice (2016)"
        ),
        CaseStudy(
            id = "uber-github-credentials-2016",
            title = "Uber's GitHub Credentials (2016)",
            year = "2016",
            tags = listOf("Team", "Shared Credentials", "Cloud"),
            summary = "Attackers accessed Uber's cloud storage in 2016 using credentials that engineers had left in a private GitHub repository, exposing data of tens of millions of riders and drivers.",
            details = "Engineers had stored cloud credentials in code hosted on GitHub, where attackers found them and used them to access an Amazon S3 bucket. Uber then paid the attackers and concealed the breach for a year. The root failure was shared, hard-coded credentials in a place built for sharing code.",
            lessons = listOf(
                "Never put credentials in code, shared documents, or chat. Use a secrets manager, and rotate anything that leaks.",
                "Shared credentials cannot be revoked for one person. Give each person and system their own credentials.",
                "Concealing a breach compounds it. Disclosure, however painful, is part of the response."
            ),
            briefKey = "team/team-shared",
            source = "US Federal Trade Commission (2018)"
        ),
        CaseStudy(
            id = "panama-papers-2016",
            title = "The Panama Papers (2016)",
            year = "2016",
            tags = listOf("Team", "Insider", "Access"),
            summary = "An anonymous source leaked 11.5 million documents from the law firm Mossack Fonseca to journalists, exposing the offshore financial arrangements of wealthy clients worldwide.",
            details = "The leak, investigated by the International Consortium of Investigative Journalists, came from inside the firm's systems. A single insider, or a small group, could access and remove the firm's entire document archive. The firm's access controls had not contemplated that scale of internal removal.",
            lessons = listOf(
                "Onboarding must include access limits: new joiners should not inherit broad access by default.",
                "A single person should never be able to remove an entire archive unnoticed. Segment access and monitor bulk removal.",
                "Insider risk is highest where access is broadest and auditing is weakest."
            ),
            briefKey = "team/team-onboarding",
            source = "International Consortium of Investigative Journalists (2016)"
        ),
        CaseStudy(
            id = "zoom-bombing-fbi-2020",
            title = "Zoom-Bombing and Meeting Security (2020)",
            year = "2020",
            tags = listOf("Team", "Meetings", "Remote"),
            summary = "As meetings moved online in 2020, unprotected video meetings were hijacked by intruders, and the FBI warned schools and organisations about 'Zoom-bombing'.",
            details = "Meetings shared by public link, without passwords or waiting rooms, were joined by strangers who disrupted them with abusive content. The meetings were not hacked in a technical sense; they were simply open. Organisations that had never run remote meetings had no meeting discipline to fall back on.",
            lessons = listOf(
                "A meeting link is an invitation. Protect it with passwords, waiting rooms, and host controls.",
                "Sensitive meetings need a named host, an attendee list, and a plan for removing intruders.",
                "Meeting discipline is a team skill: everyone must know the controls, not only the organiser."
            ),
            briefKey = "team/team-meetings",
            source = "US Federal Bureau of Investigation (2020)"
        ),
        CaseStudy(
            id = "accellion-fta-2021",
            title = "Accellion File Transfer Breach (2021)",
            year = "2021",
            tags = listOf("Team", "Vendors", "Supply Chain"),
            summary = "Attackers exploited vulnerabilities in Accellion's legacy file-transfer appliance, used by many organisations to share large files, and stole data from multiple victims through their vendor's product.",
            details = "The appliance sat at the boundary between organisations and their partners, and its vulnerabilities gave attackers a path into victim data without attacking the victims directly. Victims included universities, government agencies, and companies that had trusted the vendor's product with sensitive transfers.",
            lessons = listOf(
                "Vendor products are part of your attack surface. Audit them, patch them, and retire legacy tools.",
                "Ask vendors how they handle vulnerabilities, and what happens when their product is breached.",
                "Data shared through a vendor is data exposed through that vendor. Minimise what flows through it."
            ),
            briefKey = "team/team-vendors",
            source = "Accellion and FireEye reporting (2021)"
        ),
        CaseStudy(
            id = "deloitte-admin-no-mfa-2017",
            title = "Deloitte Email Breach (2017)",
            year = "2017",
            tags = listOf("Team", "Remote", "Authentication"),
            summary = "Deloitte suffered a breach in 2017 in which attackers accessed an administrator account that lacked multi-factor authentication, exposing client emails.",
            details = "The administrator account, which could access email across the firm, was protected by a password alone. Attackers used it to access systems for months before detection. The firm, which advised clients on cybersecurity, had left its own most powerful remote account without its most basic additional control.",
            lessons = listOf(
                "Administrator and remote accounts need multi-factor authentication without exception.",
                "The most powerful accounts need the strongest controls, not the most convenient ones.",
                "Remote access is a privilege to be hardened, audited, and reviewed, not a default."
            ),
            briefKey = "team/team-remote",
            source = "The Guardian and Deloitte reporting (2017)"
        ),
        CaseStudy(
            id = "waymo-uber-levandowski-2017",
            title = "Waymo v. Uber and the Departing Engineer (2017)",
            year = "2017",
            tags = listOf("Team", "Managers", "Trade Secrets"),
            summary = "Waymo sued Uber in 2017, alleging that engineer Anthony Levandowski had taken thousands of confidential files about self-driving technology when leaving Google for Uber's self-driving programme.",
            details = "Levandowski, a senior engineer, allegedly downloaded files before departing and then led a competing effort at Uber. The case settled, and Levandowski was later prosecuted. The dispute showed that a departing senior person can carry an organisation's most valuable knowledge out the door, legally or not, unless offboarding controls exist.",
            lessons = listOf(
                "Offboarding is a security control: revoke access promptly, and review what a departing person accessed.",
                "Senior people hold the most sensitive knowledge. Their departures need the most careful handling.",
                "Managers must treat a departure as a risk event, not only as an HR event."
            ),
            briefKey = "team/team-managers",
            source = "US District Court, Northern District of California (2017)"
        ),
        CaseStudy(
            id = "verizon-s3-misconfiguration-2017",
            title = "Verizon Data Exposed by Misconfigured Storage (2017)",
            year = "2017",
            tags = listOf("Team", "Mistake", "Cloud"),
            summary = "Customer data of millions of Verizon subscribers was exposed in 2017 through a misconfigured Amazon S3 storage bucket operated by a Verizon vendor.",
            details = "Researchers at UpGuard found the bucket publicly accessible, containing call records and personal details. The exposure was not caused by a sophisticated attacker; it was caused by a configuration mistake by a vendor employee, left unnoticed. The vendor's mistake became Verizon's breach.",
            lessons = listOf(
                "Mistakes, not attackers, cause many exposures. Check configurations before assuming they are safe.",
                "Vendor mistakes are your mistakes. Audit vendor configurations, not only your own.",
                "A public storage bucket is a publication. Verify access settings on every shared store."
            ),
            briefKey = "team/team-mistake",
            source = "UpGuard research (2017)"
        ),
        CaseStudy(
            id = "hawaii-missile-alert-2018",
            title = "Hawaii False Missile Alert (2018)",
            year = "2018",
            tags = listOf("Team", "Drills", "Human Error"),
            summary = "In 2018, a false ballistic missile alert was sent to the whole of Hawaii after a drill was confused with a real event, causing widespread panic before it was corrected.",
            details = "An employee, during a shift-change drill, selected the live alert option instead of the test option, and the system had no adequate safeguard or quick correction path. The Federal Communications Commission later found failures in drill design, interface safeguards, and correction procedures.",
            lessons = listOf(
                "Drills must be unmistakably distinct from real events, in interface, wording, and procedure.",
                "A drill that can trigger a real alert is a design failure, not only a human error.",
                "Every drill needs a correction plan: how a mistake is caught, announced, and undone, fast."
            ),
            briefKey = "team/team-drills",
            source = "US Federal Communications Commission report (2018)"
        )
    )
}
