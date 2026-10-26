package com.abybijo.agent0.data

/** v2.0 Phase 4c: cases linked to CH-13 OSINT briefs. Real incidents, public sources named. Defensive self-audit only. */
object Cases13 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "strava-heatmap-2018",
            title = "Strava Heatmap and Hidden Bases (2018)",
            year = "2018",
            tags = listOf("OSINT", "Fitness", "Exposure"),
            summary = "Strava's public heatmap, built from users' fitness tracking, revealed the locations and routines of military bases that were supposed to be secret.",
            details = "Soldiers tracking runs with Strava contributed their routes to a global heatmap. In remote areas, the glowing lines traced base perimeters, patrol routes, and supply paths. The data was shared willingly by individuals, and assembled publicly into something no individual intended to reveal.",
            lessons = listOf(
                "Data you share willingly can be assembled into a picture you never intended. Check what an app publishes, not only what it collects.",
                "Your shadow extends beyond your own posts: routines, routes, and timestamps are data too.",
                "Privacy settings on fitness and tracking apps are security settings. Review them before the first workout, not after."
            ),
            briefKey = "osint/osint-shadow",
            source = "Strava heatmap research (2018)"
        ),
        CaseStudy(
            id = "parler-gps-metadata-2021",
            title = "Parler Posts and GPS Metadata (2021)",
            year = "2021",
            tags = listOf("OSINT", "Metadata", "Self-Audit"),
            summary = "After Parler went offline in 2021, researchers found that archived videos from the platform contained GPS metadata revealing where and when they were recorded.",
            details = "Parler had not stripped location metadata from uploaded videos. Researchers and journalists used the archived metadata to place users at specific locations at specific times. The users had posted the videos themselves; the metadata did the rest.",
            lessons = listOf(
                "Audit your own exposure: check what metadata your posts actually carry, not what you think they carry.",
                "A platform that does not strip metadata publishes your location with your content.",
                "Strip metadata before posting, and check the posted result, not only the original file."
            ),
            briefKey = "osint/osint-self-audit",
            source = "Gizmodo (2021)"
        ),
        CaseStudy(
            id = "facebook-scraping-2021",
            title = "Facebook Data Scraped and Leaked (2021)",
            year = "2021",
            tags = listOf("OSINT", "Social", "Scraping"),
            summary = "In 2021, personal data of more than 500 million Facebook users, including phone numbers, was published online after being scraped from the platform.",
            details = "The data had been scraped years earlier through a contact-import feature, and was later offered for free. Facebook said the data was old and had been scraped, not hacked — but for the people in it, the distinction did not matter. Public-facing profile data, collected at scale, became a permanent leak.",
            lessons = listOf(
                "Social profile data is scrapable data. Limit what your profile shows to strangers, not only to friends.",
                "Old data does not expire. A phone number scraped years ago still identifies you today.",
                "Audit your social profiles as an outsider would see them, not as you see them logged in."
            ),
            briefKey = "osint/osint-social",
            source = "Business Insider (2021)"
        ),
        CaseStudy(
            id = "xmode-location-data-2020",
            title = "X-Mode and Location Data Sales (2020)",
            year = "2020",
            tags = listOf("OSINT", "Brokers", "Location"),
            summary = "Vice reported in 2020 that data broker X-Mode was selling location data collected from apps, including data that could track users to sensitive places.",
            details = "X-Mode paid app developers to include its tracking code, then sold the resulting location data to clients including government contractors. Apple and Google later banned the code from their stores. Users had not knowingly sold their location; they had simply used apps that contained a broker's tracker.",
            lessons = listOf(
                "Location data is brokered data. An app's permissions are a broker's supply chain.",
                "Check which apps track location in the background, and revoke what the app does not need.",
                "A broker you never heard of can hold your movements. Removal requests and permission hygiene are your controls."
            ),
            briefKey = "osint/osint-brokers",
            source = "Vice Motherboard (2020)"
        ),
        CaseStudy(
            id = "eu-right-to-be-forgotten-2014",
            title = "EU Right to Be Forgotten (2014)",
            year = "2014",
            tags = listOf("OSINT", "Removal", "Search"),
            summary = "In 2014, the EU's highest court ruled that search engines must remove links to outdated or irrelevant personal information when asked, establishing the 'right to be forgotten'.",
            details = "Mario Costeja Gonzalez, a Spanish citizen, asked Google to remove links to an old newspaper notice about a resolved debt. The Court of Justice of the European Union ruled in his favour, and Google built a removal request process. The ruling showed that removal is possible, but it is a process, not a switch — and it removes links, not the underlying pages.",
            lessons = listOf(
                "Removal is a process with limits: it can delist links, but the source page may remain.",
                "Use formal removal channels — search engines, brokers, platforms — and keep records of each request.",
                "Prevention beats removal. Information never published needs no removal request."
            ),
            briefKey = "osint/osint-removal",
            source = "Court of Justice of the European Union (2014)"
        ),
        CaseStudy(
            id = "leslie-jones-doxxing-2016",
            title = "Leslie Jones Doxxing (2016)",
            year = "2016",
            tags = listOf("OSINT", "Public Life", "Harassment"),
            summary = "In 2016, actress Leslie Jones was targeted by online harassers who hacked her website and published her personal information, including private photos and documents.",
            details = "Jones, a public figure, faced coordinated harassment that escalated from abusive messages to the publication of her personal data. The incident showed how public visibility, combined with exposed personal information, becomes a weapon — and how quickly a public role can turn private life into a target.",
            lessons = listOf(
                "Public visibility increases the value of your private information to others. Separate the two deliberately.",
                "Public figures need private cores: personal accounts, addresses, and contacts that are never public.",
                "When harassment escalates to doxxing, preserve evidence and report through platform and law enforcement channels."
            ),
            briefKey = "osint/osint-public-speaking",
            source = "News reports (2016)"
        ),
        CaseStudy(
            id = "cloudpets-leak-2017",
            title = "CloudPets Toy Data Leak (2017)",
            year = "2017",
            tags = listOf("OSINT", "Family", "Exposure"),
            summary = "In 2017, a security researcher found that CloudPets, an internet-connected children's toy, had exposed voice messages of children and parents through an open database.",
            details = "The toy recorded children's messages and stored them in a cloud database that required no password to access. Researcher Troy Hunt found more than 800,000 accounts exposed, including children's voice recordings. Parents had bought a toy; they had also bought a microphone connected to an unsecured database.",
            lessons = listOf(
                "Connected devices in a home are microphones and cameras with network connections. Check what they record and where it goes.",
                "Children's data needs the strongest protection, because children cannot consent to its collection.",
                "Before buying a connected device, check its security record, not only its features."
            ),
            briefKey = "osint/osint-personal-life",
            source = "Troy Hunt (2017)"
        ),
        CaseStudy(
            id = "ring-employee-access-2019",
            title = "Ring Employees and Customer Videos (2019)",
            year = "2019",
            tags = listOf("OSINT", "Household", "Cameras"),
            summary = "In 2019, reports revealed that Ring employees had accessed customer video feeds, and the company was later penalised by regulators for privacy failures.",
            details = "Vice reported that Ring employees in Ukraine could access customer videos, and the US Federal Trade Commission later alleged that Ring had failed to protect customer privacy, including by allowing employees and contractors broad access to videos. Customers had installed cameras for household safety; the cameras' own operators became part of the exposure.",
            lessons = listOf(
                "A household camera's footage is accessible to the company that runs it, not only to you.",
                "Check who can access your camera feeds, and what controls limit that access.",
                "Household devices need household rules: what is recorded, where, for how long, and who can see it."
            ),
            briefKey = "osint/osint-household",
            source = "Vice (2019) and US FTC (2023)"
        ),
        CaseStudy(
            id = "election-workers-doxxing-2021",
            title = "Election Workers Doxxed (2021)",
            year = "2021",
            tags = listOf("OSINT", "Public Roles", "Harassment"),
            summary = "After the 2020 US election, election workers were doxxed and threatened, with personal information published online by people who opposed the election's outcome.",
            details = "Reuters documented how election officials and workers, many of them ordinary public servants, faced threats after their names, addresses, and family details were published. The workers had taken public roles in running elections; their private lives became targets. Several left their jobs.",
            lessons = listOf(
                "A public role makes private information valuable to hostile strangers. Protect it before taking the role, not after.",
                "Public servants in contested roles need private cores and threat plans, not only public statements.",
                "Doxxing is a safety issue, not only a privacy issue. Treat it as a threat, and report it."
            ),
            briefKey = "osint/osint-public-roles",
            source = "Reuters (2021)"
        ),
        CaseStudy(
            id = "uber-god-view-2014",
            title = "Uber God View (2014)",
            year = "2014",
            tags = listOf("OSINT", "Private Core", "Location"),
            summary = "In 2014, reports revealed that Uber employees could access a tool called God View, which showed the real-time locations of riders, including journalists and public figures.",
            details = "Forbes reported that Uber staff had used God View to track individuals, including a journalist, without their knowledge. The tool existed for legitimate operational reasons, but its access was broad and its use was barely audited. Riders' most private core data — where they were, in real time — was visible to employees.",
            lessons = listOf(
                "Your most private data is location in real time. Treat apps that track it as high-risk, not routine.",
                "A company's internal tools are part of your exposure. Ask what employees can see, not only what other users can see.",
                "Keep a private core: the data that, if exposed, harms you most — and protect it most."
            ),
            briefKey = "osint/osint-private-core",
            source = "Forbes (2014)"
        )
    )
}
