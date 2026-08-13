package com.abybijo.agent0.data

/**
 * Branching decision drills — 38 scenarios. Every terminal node carries a
 * lesson so failure is instructive rather than punitive.
 */
object Scenarios {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "phishing",
            title = "The Phishing Email",
            intro = "You receive an email from \"IT-Support@yourcompany-help.com\" with subject: \"URGENT: Your password expires in 1 hour — click here to reset.\" The email has your company logo and a button labeled \"Reset Now\".",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Click the button — it looks official", "bad1"),
                        ScenarioChoice("Hover over the button to inspect the URL", "step2"),
                        ScenarioChoice("Reply asking if it's legitimate", "bad2"),
                        ScenarioChoice("Forward to the real IT security team", "good1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The URL resolves to \"http://yourcompany-reset-login.xyz/auth\" — what now?",
                    choices = listOf(
                        ScenarioChoice("Click anyway — maybe IT uses a third party", "bad1"),
                        ScenarioChoice("Close the email and report it to IT security", "good1"),
                        ScenarioChoice("Open it in an incognito window", "bad1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You click the link. A pixel-perfect login page appears. You enter your credentials. Within minutes, attackers have your password and bypass 2FA using a real-time proxy (EvilProxy). They access your email, reset other passwords, and begin sending phishing from your account.",
                    outcome = Outcome.BAD,
                    lesson = "Phishing pages can proxy 2FA in real time. Always verify URLs out-of-band and report suspicious emails instead of clicking."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You reply to the email. The attacker, posing as IT, asks you to \"verify\" by clicking the link and entering an MFA code they will send. You comply, handing over a valid session.",
                    outcome = Outcome.BAD,
                    lesson = "Never reply to verify — attackers control the reply channel. Use a known-good channel to verify requests."
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You forward the email to security@yourcompany.com using the \"Report Phish\" button. The security team confirms it's a phishing campaign targeting the finance team. Your report helps them block the domain company-wide and warn colleagues.",
                    outcome = Outcome.GOOD,
                    lesson = "Reporting phishing is the correct response. Security teams depend on user reports to identify campaigns early."
                )
            )
        ),
        Scenario(
            id = "spearphish",
            title = "The Spear Phishing Attack",
            intro = "You receive a highly personalized email from someone claiming to be your colleague Mark. The email references a project you both worked on last month and asks you to review an attached document urgently.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Open the attachment — it looks legitimate", "bad1"),
                        ScenarioChoice("Check the sender email address carefully", "step2"),
                        ScenarioChoice("Call Mark on his known phone number to verify", "good1"),
                        ScenarioChoice("Forward to IT security for analysis", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The email address is mark.johnson@c0mpany.com (note the zero instead of o). What now?",
                    choices = listOf(
                        ScenarioChoice("Open it anyway — probably just a typo", "bad1"),
                        ScenarioChoice("Report it immediately to IT security", "good2"),
                        ScenarioChoice("Reply asking if they meant to use a different address", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The attachment contains a macro that executes malware when opened. The malware installs a RAT (Remote Access Trojan) and begins exfiltrating your documents and credentials.",
                    outcome = Outcome.BAD,
                    lesson = "Spear phishing uses personalization to increase success rates. Always verify unexpected attachments out-of-band."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You reply to the attacker, who then engages you in conversation and eventually convinces you to enable macros \"to view the document properly.\"",
                    outcome = Outcome.BAD,
                    lesson = "Never engage with suspected attackers — they are skilled social engineers."
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Mark confirms he didn't send the email. IT security analyzes it and finds it's part of a targeted campaign against your department. The domain is blocked company-wide.",
                    outcome = Outcome.GOOD,
                    lesson = "Out-of-band verification defeats spear phishing. Your vigilance protected the organization."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "IT security confirms it's a spear phishing attack. They extract indicators of compromise (IOCs) and block the sender domain, protecting all employees.",
                    outcome = Outcome.GOOD,
                    lesson = "Reporting suspicious emails helps security teams identify and block attacks early."
                )
            )
        ),
        Scenario(
            id = "wifihotspot",
            title = "The Public Wi-Fi Hotspot",
            intro = "You're at a coffee shop working remotely. You see a Wi-Fi network called \"CoffeeShop_Guest_Free\" with good signal strength. Your cellular connection is weak.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Connect to the Wi-Fi — it looks official", "bad1"),
                        ScenarioChoice("Ask the barista to confirm the network name", "step2"),
                        ScenarioChoice("Use your phone as a mobile hotspot instead", "good1"),
                        ScenarioChoice("Connect but only browse non-sensitive sites", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The barista says the real network is \"CoffeeShop_Customer\" with a password on your receipt. The \"Guest_Free\" network is unknown.",
                    choices = listOf(
                        ScenarioChoice("Connect to the unknown network anyway", "bad1"),
                        ScenarioChoice("Use the verified network with the password", "good2"),
                        ScenarioChoice("Use your mobile hotspot instead", "good1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The \"Guest_Free\" network is an evil twin — a rogue access point set up by an attacker. They perform a man-in-the-middle attack and capture your login credentials when you access company resources.",
                    outcome = Outcome.BAD,
                    lesson = "Evil twin attacks are common. Always verify network names with staff and use VPNs on public Wi-Fi."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Even \"non-sensitive\" browsing can leak information. The attacker uses DNS hijacking to redirect you to a fake login page when you check your email.",
                    outcome = Outcome.BAD,
                    lesson = "On untrusted networks, attackers can manipulate any traffic. Assume everything is monitored."
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Your mobile hotspot provides a secure, encrypted connection. You work safely without exposing your traffic to potential attackers on the public network.",
                    outcome = Outcome.GOOD,
                    lesson = "Mobile hotspots are more secure than public Wi-Fi. Use them when security matters."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You connect to the verified network and use your VPN for all work traffic. Even if the network is compromised, your VPN encrypts everything.",
                    outcome = Outcome.GOOD,
                    lesson = "Verified networks plus VPN provide defense in depth for remote work."
                )
            )
        ),
        Scenario(
            id = "shouldersurf",
            title = "The Shoulder Surfer",
            intro = "You're working on sensitive financial data in a crowded airport lounge. You notice someone sitting behind you seems to be glancing at your screen repeatedly.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Ignore it — they're probably just bored", "bad1"),
                        ScenarioChoice("Move to a more private location or angle your screen", "good1"),
                        ScenarioChoice("Confront them directly and ask them to stop", "bad2"),
                        ScenarioChoice("Apply a privacy screen filter to your laptop", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The person is conducting surveillance. They photograph your screen with a hidden camera and later use the visible account numbers and balances for social engineering attacks against your company.",
                    outcome = Outcome.BAD,
                    lesson = "Shoulder surfing is a real threat in public spaces. Always assume someone is watching."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "The confrontation escalates. The person claims to be a security researcher and threatens to report you for working on sensitive data in public. The situation becomes uncomfortable.",
                    outcome = Outcome.BAD,
                    lesson = "Avoid confrontations. Move to a secure location instead."
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You relocate to a corner with your back to the wall. The potential observer loses interest and moves on. Your sensitive work remains private.",
                    outcome = Outcome.GOOD,
                    lesson = "Situational awareness and positioning are key to preventing visual eavesdropping."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You apply a privacy filter that makes your screen visible only from directly in front. Even if someone tries to look, they see a dark screen.",
                    outcome = Outcome.GOOD,
                    lesson = "Privacy screens are effective countermeasures for working in public spaces."
                )
            )
        ),
        Scenario(
            id = "updateprompt",
            title = "The Fake Update Prompt",
            intro = "While browsing a legitimate-looking website, a pop-up appears claiming your Flash Player is out of date and needs immediate updating. It looks official with Adobe branding.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Click update — Flash is needed for some sites", "bad1"),
                        ScenarioChoice("Close the pop-up and check for updates through official channels", "good1"),
                        ScenarioChoice("Download the update but scan it first", "bad2"),
                        ScenarioChoice("Ignore it — Flash is deprecated anyway", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The \"update\" installs a fake Flash Player that's actually adware bundled with a cryptocurrency miner. Your system slows down and displays unwanted ads.",
                    outcome = Outcome.BAD,
                    lesson = "Fake update prompts are common malware delivery vectors. Never update software from pop-ups."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "The scanner doesn't detect the sophisticated malware, which uses packers to evade detection. You install it and compromise your system.",
                    outcome = Outcome.BAD,
                    lesson = "Antivirus isn't foolproof. Only download updates from official vendor sites or package managers."
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You close the pop-up and visit adobe.com directly. You learn Flash was discontinued in 2020. The pop-up was fake. You clear your browser cache to remove any tracking.",
                    outcome = Outcome.GOOD,
                    lesson = "Always verify updates through official channels. Pop-up updates are almost always malicious."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You recognize that Flash is obsolete and the prompt is fake. You close the tab and run a malware scan just to be safe. No threats are found.",
                    outcome = Outcome.GOOD,
                    lesson = "Knowing that outdated technologies are attack targets helps you recognize fake prompts."
                )
            )
        ),
        Scenario(
            id = "socialproof",
            title = "The Social Proof Attack",
            intro = "You receive a LinkedIn message from a recruiter at a prestigious company. They mention that 5 of your connections also work there and ask you to complete a \"candidate assessment\" on their portal.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Click the link — it looks legitimate with social proof", "bad1"),
                        ScenarioChoice("Verify the recruiter's profile and company independently", "step2"),
                        ScenarioChoice("Ask your connections if they know this recruiter", "good1"),
                        ScenarioChoice("Ignore it — unsolicited job offers are suspicious", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The recruiter's profile was created last week with minimal history, but has 500+ connections. The company website looks slightly off.",
                    choices = listOf(
                        ScenarioChoice("Proceed anyway — new recruiters exist", "bad1"),
                        ScenarioChoice("Report the profile to LinkedIn and warn your connections", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The portal asks for extensive personal information including SSN, bank details for \"direct deposit setup,\" and uploads of your ID. This is an identity theft operation targeting job seekers.",
                    outcome = Outcome.BAD,
                    lesson = "Social proof (fake connections, endorsements) is used to build false trust. Verify independently."
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Your connections confirm they don't know this recruiter. You report the suspicious profile to LinkedIn, which removes it. Others are protected.",
                    outcome = Outcome.GOOD,
                    lesson = "Your network can help verify legitimacy. Crowdsourced verification is powerful."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You report the profile. LinkedIn confirms it's a fake recruiting scam that harvested personal data from 200+ victims before being removed.",
                    outcome = Outcome.GOOD,
                    lesson = "Reporting suspicious profiles protects the entire community from social engineering attacks."
                )
            )
        ),
        Scenario(
            id = "ransomware",
            title = "The Ransomware Infection",
            intro = "You open an email attachment from an unknown sender. Suddenly, your files start being encrypted and a ransom note appears demanding \$5,000 in Bitcoin to decrypt your data.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is your immediate response?",
                    choices = listOf(
                        ScenarioChoice("Pay the ransom — you need your files back", "bad1"),
                        ScenarioChoice("Disconnect from the network immediately", "good1"),
                        ScenarioChoice("Try to find a decryptor tool online", "bad2"),
                        ScenarioChoice("Call IT security immediately", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You disconnect from Wi-Fi and unplug the Ethernet cable. This prevents the ransomware from spreading to network shares and other devices. You then call IT security.",
                    outcome = Outcome.GOOD,
                    lesson = "Isolation is the first step in ransomware response. Containment prevents widespread damage."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "IT security helps you isolate the device, determines the ransomware variant, and restores your files from backups. No ransom is paid. The incident is contained.",
                    outcome = Outcome.GOOD,
                    lesson = "Fast reporting to IT enables professional incident response and backup restoration."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You pay the ransom. The attackers take your money but don't provide a working decryptor. Or they provide one but also sell your data on the dark web. You've been double-extorted.",
                    outcome = Outcome.BAD,
                    lesson = "Paying ransoms doesn't guarantee recovery and funds criminal operations. Always try backups first."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "The \"decryptor\" you download is actually more malware. You now have ransomware plus additional spyware stealing your credentials.",
                    outcome = Outcome.BAD,
                    lesson = "Only use decryptors from trusted sources like No More Ransom project, and verify with IT first."
                )
            )
        ),
        Scenario(
            id = "insiderthreat",
            title = "The Suspicious Colleague",
            intro = "You notice a colleague downloading large amounts of data to external drives after hours. They seem nervous when you walk by and quickly minimize windows.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Mind your own business — it's not your concern", "bad1"),
                        ScenarioChoice("Report your observations to your manager or security team", "good1"),
                        ScenarioChoice("Confront them directly and ask what they're doing", "bad2"),
                        ScenarioChoice("Document what you observed and monitor the situation", "step2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "Over the next week, you see the behavior continue and notice they're accessing systems outside their normal job role.",
                    choices = listOf(
                        ScenarioChoice("Report it now with your documentation", "good1"),
                        ScenarioChoice("Still mind your own business", "bad1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Security investigates and discovers the colleague has been exfiltrating proprietary data to sell to a competitor. Your report enabled early detection before major damage occurred.",
                    outcome = Outcome.GOOD,
                    lesson = "Insider threats are serious. Reporting suspicious behavior is a responsibility, not betrayal."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The colleague continues stealing data for months, causing significant financial and competitive damage. An investigation reveals multiple people noticed but didn't report it.",
                    outcome = Outcome.BAD,
                    lesson = "Failing to report insider threats enables prolonged damage. Security is everyone's responsibility."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "The confrontation alerts the insider that they're being watched. They accelerate their data theft and cover their tracks, making investigation harder.",
                    outcome = Outcome.BAD,
                    lesson = "Never confront suspected insiders directly. Let security professionals handle investigations."
                )
            )
        ),
        Scenario(
            id = "cloudconfig",
            title = "The Misconfigured Cloud Storage",
            intro = "A developer on your team accidentally makes an S3 bucket public containing customer data backups. A security researcher finds it and contacts your company.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What should be the immediate response?",
                    choices = listOf(
                        ScenarioChoice("Thank the researcher and ignore it — no one probably saw it", "bad1"),
                        ScenarioChoice("Immediately make the bucket private and assess exposure", "good1"),
                        ScenarioChoice("Delete the bucket entirely to hide the mistake", "bad2"),
                        ScenarioChoice("Threaten the researcher with legal action", "bad3")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You secure the bucket, assess what data was exposed, check access logs for unauthorized downloads, notify affected customers if required, and thank the researcher. You then implement automated checks to prevent recurrence.",
                    outcome = Outcome.GOOD,
                    lesson = "Fast response, transparency, and learning from mistakes are key to handling security incidents professionally."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Attackers had already scraped the data and use it for targeted phishing attacks against your customers. The breach becomes public, damaging your reputation.",
                    outcome = Outcome.BAD,
                    lesson = "Assume exposed data was accessed. Transparency and customer notification are often legally required."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Deleting the bucket destroys evidence needed for the investigation. You can't determine what was accessed or who accessed it.",
                    outcome = Outcome.BAD,
                    lesson = "Preserve evidence during incidents. Secure first, then investigate, then remediate."
                ),
                "bad3" to ScenarioStep(
                    id = "bad3",
                    text = "The researcher publicly discloses your poor security practices and unprofessional response. The story goes viral, causing major reputational damage.",
                    outcome = Outcome.BAD,
                    lesson = "Security researchers are allies. Bug bounty programs and professional responses build goodwill."
                )
            )
        ),
        Scenario(
            id = "mfarequest",
            title = "The Unexpected MFA Request",
            intro = "You receive an MFA push notification on your phone, but you're not trying to log in anywhere. The request keeps appearing repeatedly.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Approve it to make it stop", "bad1"),
                        ScenarioChoice("Deny the request and change your password immediately", "good1"),
                        ScenarioChoice("Ignore it — probably just a glitch", "bad2"),
                        ScenarioChoice("Report it to IT security", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You deny the request and change your password. You discover attackers had your password from a previous breach and were trying to bypass MFA. Changing the password stops them.",
                    outcome = Outcome.GOOD,
                    lesson = "Unexpected MFA requests indicate someone has your password. Deny and change immediately."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "IT security confirms this is an MFA fatigue attack. They help you change your password, enable number matching on MFA prompts, and monitor for suspicious activity.",
                    outcome = Outcome.GOOD,
                    lesson = "MFA fatigue attacks rely on user frustration. Reporting helps IT implement better protections."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You approve the request out of annoyance. Attackers gain access to your account and begin stealing data or sending phishing emails from your account.",
                    outcome = Outcome.BAD,
                    lesson = "Never approve MFA requests you didn't initiate. MFA fatigue attacks exploit user frustration."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "The requests continue for days. Eventually, you accidentally approve one while distracted, giving attackers access.",
                    outcome = Outcome.BAD,
                    lesson = "Persistent MFA requests are attacks, not glitches. Take immediate action."
                )
            )
        ),
        Scenario(
            id = "vendoraccess",
            title = "The Vendor Security Breach",
            intro = "You learn that a software vendor your company uses has been breached. Attackers may have accessed customer data, including yours.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What should you do?",
                    choices = listOf(
                        ScenarioChoice("Wait for the vendor to notify you officially", "bad1"),
                        ScenarioChoice("Immediately change passwords and review access for that vendor", "good1"),
                        ScenarioChoice("Stop using the vendor immediately", "step2"),
                        ScenarioChoice("Assume your data is compromised and notify customers", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You research and find the breach affected their authentication system, potentially exposing API keys and credentials.",
                    choices = listOf(
                        ScenarioChoice("Rotate all credentials and API keys immediately", "good1"),
                        ScenarioChoice("Wait to see if your specific account was affected", "bad1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You proactively rotate credentials, enable additional monitoring, and implement stricter access controls. When the vendor finally discloses details, you're already protected.",
                    outcome = Outcome.GOOD,
                    lesson = "Proactive response to vendor breaches reduces your exposure window significantly."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Attackers use stolen credentials to access your account before the vendor notifies you. They exfiltrate data for weeks before detection.",
                    outcome = Outcome.BAD,
                    lesson = "Don't wait for official notification. Act immediately when you learn of vendor breaches."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You notify customers prematurely without confirming exposure, causing unnecessary panic and reputational damage when it turns out your data wasn't affected.",
                    outcome = Outcome.BAD,
                    lesson = "Verify your exposure before notifying customers. Hasty responses can cause unnecessary harm."
                )
            )
        ),
        Scenario(
            id = "devicenotfound",
            title = "The Unattended Device",
            intro = "You find an unlocked smartphone in a conference room. It has no password and appears to belong to another attendee.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Look through it to identify the owner", "bad1"),
                        ScenarioChoice("Turn it in to conference security or lost and found", "good1"),
                        ScenarioChoice("Leave it where it is — not your problem", "bad2"),
                        ScenarioChoice("Try to contact the owner using the phone", "step2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You find a contact labeled \"ICE\" (In Case of Emergency) or a recent call to \"Home\".",
                    choices = listOf(
                        ScenarioChoice("Call that number to return the phone", "good2"),
                        ScenarioChoice("Browse more contacts to find the owner", "bad1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You turn it in to security. The owner retrieves it later and is grateful. You respected their privacy and followed proper procedure.",
                    outcome = Outcome.GOOD,
                    lesson = "Turn found devices in to authorities. Don't access others' devices without permission."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You call the emergency contact, who arranges to meet you and retrieve the phone. The owner is thankful and offers a reward, which you decline.",
                    outcome = Outcome.GOOD,
                    lesson = "Using emergency contacts is appropriate for returning lost devices while respecting privacy."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "While browsing the phone, you accidentally access sensitive personal information. The owner later discovers this and accuses you of privacy violation.",
                    outcome = Outcome.BAD,
                    lesson = "Never browse found devices. You have no right to access others' private information."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Someone else finds the phone later and maliciously accesses it, stealing data or making unauthorized purchases. You could have prevented this.",
                    outcome = Outcome.BAD,
                    lesson = "Leaving found devices unattended enables theft and misuse. Take responsible action."
                )
            )
        ),
        Scenario(
            id = "apikey",
            title = "The Exposed API Key",
            intro = "While reviewing code on a public GitHub repository, you discover an API key for a payment processor hardcoded in the source code.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Ignore it — not your problem", "bad1"),
                        ScenarioChoice("Use the key to test if it works", "bad2"),
                        ScenarioChoice("Report it to the repository owner privately", "good1"),
                        ScenarioChoice("Post publicly that they have an exposed key", "bad3")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You privately message the repository owner. They thank you, immediately rotate the key, and remove it from the code history. You've prevented potential financial fraud.",
                    outcome = Outcome.GOOD,
                    lesson = "Responsible disclosure helps organizations fix vulnerabilities without public embarrassment."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Attackers find the key and use it to make fraudulent transactions, costing the company thousands. The breach becomes public and damages their reputation.",
                    outcome = Outcome.BAD,
                    lesson = "Ignoring exposed credentials enables attacks. Responsible disclosure is an ethical obligation."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Using the key, even to test, is unauthorized access. You could face legal consequences, and your test transactions might trigger fraud alerts.",
                    outcome = Outcome.BAD,
                    lesson = "Never use exposed credentials, even to test. Report them instead."
                ),
                "bad3" to ScenarioStep(
                    id = "bad3",
                    text = "Public disclosure before the owner can fix it allows attackers to exploit the key. The owner is angry and threatens legal action for reckless disclosure.",
                    outcome = Outcome.BAD,
                    lesson = "Always disclose privately first. Public disclosure should only happen after reasonable time for remediation."
                )
            )
        ),
        Scenario(
            id = "socialmedia",
            title = "The Oversharing Employee",
            intro = "An employee posts photos from the office on Instagram, inadvertently showing sensitive information on whiteboards and computer screens in the background.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "As a colleague who sees this, what do you do?",
                    choices = listOf(
                        ScenarioChoice("Ignore it — it's their personal account", "bad1"),
                        ScenarioChoice("Privately message them to point out the issue", "good1"),
                        ScenarioChoice("Report them to management immediately", "step2"),
                        ScenarioChoice("Comment publicly asking them to delete it", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You're unsure if this is a one-time mistake or a pattern of oversharing.",
                    choices = listOf(
                        ScenarioChoice("Talk to them first to understand the situation", "good1"),
                        ScenarioChoice("Report to security to investigate further", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You privately explain that background details in photos can leak sensitive information. They're embarrassed but grateful, delete the post, and become more careful.",
                    outcome = Outcome.GOOD,
                    lesson = "Private, respectful feedback helps colleagues improve without public embarrassment."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "Security reviews and finds multiple employees making similar mistakes. They provide company-wide training on social media OPSEC, preventing future leaks.",
                    outcome = Outcome.GOOD,
                    lesson = "Systemic issues require organizational responses. Reporting helps improve overall security culture."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Competitors see the photos and use the visible information to gain insights into your projects and strategies, causing competitive harm.",
                    outcome = Outcome.BAD,
                    lesson = "Ignoring security issues enables harm. Everyone shares responsibility for OPSEC."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "The public comment embarrasses the employee and creates workplace tension. They become defensive rather than receptive to feedback.",
                    outcome = Outcome.BAD,
                    lesson = "Public criticism damages relationships and reduces security cooperation."
                )
            )
        ),
        Scenario(
            id = "backupfailure",
            title = "The Backup Failure",
            intro = "Your system crashes and you try to restore from backups, only to discover the backups are corrupted or incomplete. You haven't tested them in months.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do now?",
                    choices = listOf(
                        ScenarioChoice("Try to manually reconstruct lost data", "bad1"),
                        ScenarioChoice("Contact IT support for emergency recovery options", "good1"),
                        ScenarioChoice("Accept the data loss and move on", "bad2"),
                        ScenarioChoice("Blame IT for not maintaining backups", "bad3")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "IT works with you to recover what they can from various sources (older backups, email archives, other systems). They also fix the backup system and implement regular testing.",
                    outcome = Outcome.GOOD,
                    lesson = "Professional help and learning from failures improve future resilience."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Manual reconstruction takes weeks and is incomplete. Critical data is permanently lost, affecting business operations and customer trust.",
                    outcome = Outcome.BAD,
                    lesson = "Prevention through tested backups is far better than emergency reconstruction."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Accepting data loss without trying recovery options means losing work that could have been saved. It also doesn't fix the underlying backup problem.",
                    outcome = Outcome.BAD,
                    lesson = "Explore all recovery options. Also use the incident to drive backup improvements."
                ),
                "bad3" to ScenarioStep(
                    id = "bad3",
                    text = "Blaming others creates conflict without solving the problem. The backup issues persist and cause more failures later.",
                    outcome = Outcome.BAD,
                    lesson = "Focus on solutions, not blame. Collaborative problem-solving is more effective."
                )
            )
        ),
        Scenario(
            id = "contractor",
            title = "The Overprivileged Contractor",
            intro = "A temporary contractor has been given admin access to production systems \"to get work done quickly\" and has had this access for 6 months beyond their contract end date.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "As a security-conscious employee, what do you do?",
                    choices = listOf(
                        ScenarioChoice("Nothing — access management isn't your job", "bad1"),
                        ScenarioChoice("Report it to IT security or your manager", "good1"),
                        ScenarioChoice("Confront the contractor directly", "bad2"),
                        ScenarioChoice("Document it and monitor for suspicious activity", "step2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You notice the contractor is still actively using the account to access systems.",
                    choices = listOf(
                        ScenarioChoice("Report it immediately with your evidence", "good1"),
                        ScenarioChoice("Continue monitoring to gather more evidence", "bad3")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "IT security revokes the access immediately, audits what the contractor accessed, and implements automated access reviews to prevent recurrence.",
                    outcome = Outcome.GOOD,
                    lesson = "Reporting overprivileged access prevents potential insider threats and improves access governance."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The contractor's account is later compromised, and attackers use the excessive privileges to cause major damage that could have been prevented.",
                    outcome = Outcome.BAD,
                    lesson = "Security is everyone's responsibility. Ignoring access issues enables attacks."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "The confrontation creates workplace conflict and alerts the contractor, who may cover their tracks before security can investigate properly.",
                    outcome = Outcome.BAD,
                    lesson = "Let security professionals handle access issues. Direct confrontation can backfire."
                ),
                "bad3" to ScenarioStep(
                    id = "bad3",
                    text = "While monitoring, the contractor notices and reports you for unauthorized surveillance. You face disciplinary action.",
                    outcome = Outcome.BAD,
                    lesson = "Don't conduct unauthorized investigations. Report concerns through proper channels."
                )
            )
        ),
        Scenario(
            id = "phishingtraining",
            title = "The Phishing Test",
            intro = "You receive an email that looks suspicious. Later, IT announces it was a phishing simulation test. You clicked the link.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "How should you respond?",
                    choices = listOf(
                        ScenarioChoice("Feel embarrassed and try to hide that you clicked", "bad1"),
                        ScenarioChoice("Acknowledge the mistake and complete the required training", "good1"),
                        ScenarioChoice("Argue that the test was too realistic and unfair", "bad2"),
                        ScenarioChoice("Ask for additional security awareness resources", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You complete the training, learn from the experience, and become more vigilant. Your honesty helps IT understand which phishing techniques are most effective.",
                    outcome = Outcome.GOOD,
                    lesson = "Phishing tests are learning opportunities. Honesty and engagement improve organizational security."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You proactively seek additional training and share what you learned with colleagues. Your positive attitude improves the security culture.",
                    outcome = Outcome.GOOD,
                    lesson = "Proactive learning and knowledge sharing strengthen the entire organization."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Hiding your mistake means IT doesn't know the test succeeded. You miss the learning opportunity and remain vulnerable to real attacks.",
                    outcome = Outcome.BAD,
                    lesson = "Transparency about mistakes enables learning. Hiding them perpetuates vulnerabilities."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Complaining creates a negative attitude toward security training. You miss the learning opportunity and colleagues follow your negative example.",
                    outcome = Outcome.BAD,
                    lesson = "Constructive engagement with security training is more productive than complaints."
                )
            )
        ),
        Scenario(
            id = "zeroday",
            title = "The Zero-Day Vulnerability",
            intro = "News breaks about a critical zero-day vulnerability in software your company uses extensively. There's no patch available yet, and exploits are already in the wild.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What should be the immediate response?",
                    choices = listOf(
                        ScenarioChoice("Wait for the vendor to release a patch", "bad1"),
                        ScenarioChoice("Implement compensating controls and workarounds", "good1"),
                        ScenarioChoice("Panic and shut down all affected systems", "bad2"),
                        ScenarioChoice("Ignore it until it affects you directly", "bad3")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You implement network segmentation, disable non-essential features, increase monitoring, and prepare incident response plans. When the patch arrives, you deploy it safely.",
                    outcome = Outcome.GOOD,
                    lesson = "Compensating controls provide defense while waiting for patches. Proactive response reduces risk."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "While waiting for the patch, attackers exploit the vulnerability and breach your systems, causing significant damage.",
                    outcome = Outcome.BAD,
                    lesson = "Don't wait passively for patches on zero-days. Implement interim protections immediately."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Shutting down systems without planning causes major business disruption without necessarily improving security. Customers and operations suffer.",
                    outcome = Outcome.BAD,
                    lesson = "Emergency responses should balance security with business continuity. Plan before acting."
                ),
                "bad3" to ScenarioStep(
                    id = "bad3",
                    text = "Ignoring the vulnerability allows attackers to exploit it at their leisure. When they finally attack your systems, you're completely unprepared.",
                    outcome = Outcome.BAD,
                    lesson = "Proactive threat monitoring and response are essential security practices."
                )
            )
        ),
        Scenario(
            id = "passwordreset",
            title = "The Password Reset Scam",
            intro = "You receive a call from someone claiming to be from IT, saying they need to reset your password due to a security incident. They ask for your current password to \"verify your identity.\"",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Give them your password — they're from IT", "bad1"),
                        ScenarioChoice("Hang up and call IT on the official number", "good1"),
                        ScenarioChoice("Ask for their employee ID and callback number", "step2"),
                        ScenarioChoice("Say you'll reset it yourself through the portal", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "They provide information but seem evasive when you ask detailed questions.",
                    choices = listOf(
                        ScenarioChoice("Trust them — they gave you details", "bad1"),
                        ScenarioChoice("Hang up and verify through official channels", "good1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You hang up and call the official IT number. The real IT confirms no one was calling you. This was a vishing attack attempting to steal credentials.",
                    outcome = Outcome.GOOD,
                    lesson = "Legitimate IT will never ask for your password over the phone. Always verify independently."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You politely decline and say you'll use the self-service portal. The caller hangs up. You report the incident to IT, who confirms it was a scam.",
                    outcome = Outcome.GOOD,
                    lesson = "Self-service password resets are secure and don't require sharing credentials with anyone."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You give your password. The attacker now has full access to your account and can steal data, send phishing emails, or perform other malicious actions.",
                    outcome = Outcome.BAD,
                    lesson = "Never share passwords with anyone claiming to be IT. Legitimate IT never needs your password."
                )
            )
        ),
        Scenario(
            id = "privacyscreen",
            title = "The Privacy Screen Bypass",
            intro = "You're working on sensitive data in a public space with a privacy screen. Someone sits very close behind you and uses a camera to photograph your screen from an angle.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Nothing — privacy screens protect you", "bad1"),
                        ScenarioChoice("Move to a more private location immediately", "good1"),
                        ScenarioChoice("Confront the person taking photos", "bad2"),
                        ScenarioChoice("Cover your screen with your body", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You relocate to a private area where you can work safely. The potential surveillance is thwarted.",
                    outcome = Outcome.GOOD,
                    lesson = "Privacy screens have limitations. Physical security and location awareness are primary defenses."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You shield your screen and move to a better position. The person loses their angle and leaves.",
                    outcome = Outcome.GOOD,
                    lesson = "Active awareness and adaptive positioning complement technical controls."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The attacker successfully photographs your screen despite the privacy filter. Sensitive information is compromised.",
                    outcome = Outcome.BAD,
                    lesson = "Privacy screens aren't perfect. Multiple angles, cameras, and close proximity can defeat them."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "The confrontation escalates. The person claims to be a security researcher and the situation becomes uncomfortable or dangerous.",
                    outcome = Outcome.BAD,
                    lesson = "Avoid confrontations. Remove yourself from the situation instead."
                )
            )
        ),
        Scenario(
            id = "emailforward",
            title = "The Email Forward Attack",
            intro = "You notice that emails sent to your account are being automatically forwarded to an unknown external address. Your account settings have been changed without your knowledge.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is your immediate response?",
                    choices = listOf(
                        ScenarioChoice("Delete the forwarding rule and change your password", "good1"),
                        ScenarioChoice("Ignore it — probably just a glitch", "bad1"),
                        ScenarioChoice("Forward some test emails to see where they go", "bad2"),
                        ScenarioChoice("Contact IT security immediately", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You remove the forwarding rule, change your password, enable 2FA, and review all account settings. You then report the incident to IT for investigation.",
                    outcome = Outcome.GOOD,
                    lesson = "Fast response to account compromise limits damage. Comprehensive remediation is essential."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "IT security helps you secure the account, investigates how it was compromised, and checks for other malicious changes. They also monitor for data exfiltration.",
                    outcome = Outcome.GOOD,
                    lesson = "Professional incident response ensures thorough remediation and investigation."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Attackers continue receiving copies of all your emails, including sensitive information, for weeks before anyone notices.",
                    outcome = Outcome.BAD,
                    lesson = "Email forwarding rules are a common persistence mechanism. Always investigate unexpected changes."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Your test emails alert the attacker that you've discovered them. They quickly cover their tracks, making investigation harder.",
                    outcome = Outcome.BAD,
                    lesson = "Don't tip off attackers. Secure your account first, then investigate."
                )
            )
        ),
        Scenario(
            id = "meetingroom",
            title = "The Bugged Meeting Room",
            intro = "Before a sensitive meeting, you notice a small, unusual device plugged into a power outlet that wasn't there before. It could be a listening device.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Ignore it — probably just a phone charger", "bad1"),
                        ScenarioChoice("Unplug it and examine it", "step2"),
                        ScenarioChoice("Move the meeting to a different location", "good1"),
                        ScenarioChoice("Report it to security before proceeding", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The device has no markings and transmits wirelessly when powered.",
                    choices = listOf(
                        ScenarioChoice("Put it back and proceed with the meeting", "bad1"),
                        ScenarioChoice("Secure the device and contact security", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You relocate to a secure room. The meeting proceeds safely. Security later confirms the device was a bug planted by a competitor.",
                    outcome = Outcome.GOOD,
                    lesson = "When in doubt, move to a secure location. Don't risk sensitive discussions."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "Security secures the device, sweeps the room for other bugs, and investigates. The meeting is delayed but remains secure.",
                    outcome = Outcome.GOOD,
                    lesson = "Professional security response ensures thorough investigation and remediation."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The meeting proceeds with the bug active. Competitors listen to your sensitive discussions and gain strategic advantage.",
                    outcome = Outcome.BAD,
                    lesson = "Suspicious devices in meeting rooms should always be investigated. Never ignore potential surveillance."
                )
            )
        ),
        Scenario(
            id = "dataclassification",
            title = "The Misclassified Data",
            intro = "You discover that highly sensitive customer data has been stored in a system classified as \"public\" and is accessible to many employees who don't need it.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What should you do?",
                    choices = listOf(
                        ScenarioChoice("Ignore it — classification isn't your responsibility", "bad1"),
                        ScenarioChoice("Immediately restrict access and reclassify the data", "good1"),
                        ScenarioChoice("Ask around to see if others know about it", "bad2"),
                        ScenarioChoice("Report it to the data owner and security team", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You restrict access immediately, then work with the data owner to properly classify and protect the data. You also audit who accessed it.",
                    outcome = Outcome.GOOD,
                    lesson = "Fast action to protect misclassified data prevents potential breaches and unauthorized access."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "The data owner and security team work together to properly classify, secure, and audit access to the data. Systemic improvements prevent recurrence.",
                    outcome = Outcome.GOOD,
                    lesson = "Proper data governance requires collaboration between technical teams and data owners."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The misclassified data is eventually leaked or misused by someone with inappropriate access, causing a major breach.",
                    outcome = Outcome.BAD,
                    lesson = "Everyone shares responsibility for data protection. Ignoring classification issues enables breaches."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Asking around spreads awareness of the sensitive data to more people than necessary, increasing the risk of mishandling.",
                    outcome = Outcome.BAD,
                    lesson = "Don't unnecessarily spread knowledge of sensitive data issues. Report through proper channels."
                )
            )
        ),
        Scenario(
            id = "traveldevice",
            title = "The Border Inspection",
            intro = "You're traveling internationally with a laptop containing sensitive work data. A border agent asks you to unlock your device for inspection.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Comply immediately — they have authority", "bad1"),
                        ScenarioChoice("Politely explain you have sensitive data and request a supervisor", "good1"),
                        ScenarioChoice("Refuse and accept the consequences", "step2"),
                        ScenarioChoice("Provide the password but monitor the inspection closely", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The agent insists and threatens to deny you entry or confiscate the device.",
                    choices = listOf(
                        ScenarioChoice("Comply under protest and document the incident", "good2"),
                        ScenarioChoice("Continue refusing", "bad3")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The supervisor arrives. You explain the sensitivity of the data. They may allow inspection in a private area or with limitations. You document everything.",
                    outcome = Outcome.GOOD,
                    lesson = "Polite escalation and documentation protect your rights while respecting authority."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You comply under protest, carefully document what was accessed, and report the incident to your company. They take steps to mitigate any exposure.",
                    outcome = Outcome.GOOD,
                    lesson = "Sometimes compliance is necessary. Documentation and reporting enable proper response."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The agent copies all your data or installs monitoring software. Sensitive information is compromised without your knowledge.",
                    outcome = Outcome.BAD,
                    lesson = "Blind compliance with device inspections can lead to data compromise. Know your rights."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Even while monitoring, the agent quickly accesses sensitive data you didn't notice. The inspection is faster than your ability to track it.",
                    outcome = Outcome.BAD,
                    lesson = "Monitoring inspections isn't foolproof. Minimize sensitive data on travel devices."
                ),
                "bad3" to ScenarioStep(
                    id = "bad3",
                    text = "You're denied entry or detained. The device is confiscated. Your travel and work are severely disrupted.",
                    outcome = Outcome.BAD,
                    lesson = "Absolute refusal can have serious consequences. Balance principles with practical realities."
                )
            )
        ),
        Scenario(
            id = "codeleak",
            title = "The Source Code Leak",
            intro = "You discover that proprietary source code has been accidentally pushed to a public GitHub repository. It contains secrets and intellectual property.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is the immediate response?",
                    choices = listOf(
                        ScenarioChoice("Delete the repository immediately", "bad1"),
                        ScenarioChoice("Make the repository private first, then assess exposure", "good1"),
                        ScenarioChoice("Contact GitHub support to remove it from history", "good2"),
                        ScenarioChoice("Ignore it — probably no one saw it", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You make it private, audit what was exposed, rotate all secrets found in the code, check if anyone forked or cloned it, and work with GitHub to remove it from history.",
                    outcome = Outcome.GOOD,
                    lesson = "Comprehensive response to code leaks includes making private, rotating secrets, and removing from history."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "GitHub support helps remove the repository and its history. You also rotate all exposed secrets and implement pre-commit hooks to prevent future leaks.",
                    outcome = Outcome.GOOD,
                    lesson = "Professional support and preventive measures address both immediate and future risks."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Deleting the repository doesn't remove it from forks, clones, or GitHub's history. The code remains accessible and secrets remain compromised.",
                    outcome = Outcome.BAD,
                    lesson = "Simply deleting repositories doesn't fully remediate code leaks. Comprehensive cleanup is needed."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Attackers find the code, use the exposed secrets, and gain access to your systems. The breach becomes public and damages your reputation.",
                    outcome = Outcome.BAD,
                    lesson = "Assume exposed code was seen. Fast, comprehensive response is essential."
                )
            )
        ),
        Scenario(
            id = "socialaccount",
            title = "The Compromised Social Account",
            intro = "A colleague's social media account is hacked and starts sending phishing messages to all their contacts, including you. The message contains a malicious link.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Click the link — it's from someone you know", "bad1"),
                        ScenarioChoice("Contact your colleague through another channel to alert them", "good1"),
                        ScenarioChoice("Report the account to the social media platform", "good2"),
                        ScenarioChoice("Ignore it — probably just spam", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You call your colleague on the phone. They had no idea their account was compromised. They secure it and warn other contacts. You prevent others from being victimized.",
                    outcome = Outcome.GOOD,
                    lesson = "Out-of-band notification helps victims secure compromised accounts quickly."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You report the account to the platform, which suspends it. You also alert your colleague, who secures their account and warns others.",
                    outcome = Outcome.GOOD,
                    lesson = "Reporting compromised accounts protects the entire community from ongoing attacks."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The link installs malware on your device or steals your credentials. The attack spreads further through your contacts.",
                    outcome = Outcome.BAD,
                    lesson = "Compromised accounts are used to attack contacts. Never trust links from compromised accounts."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Other contacts click the link and are victimized. The attack continues spreading because no one alerted the victim or reported the account.",
                    outcome = Outcome.BAD,
                    lesson = "Ignoring compromised accounts enables attacks to spread. Take action to protect others."
                )
            )
        ),
        Scenario(
            id = "supplychain",
            title = "The Compromised Package",
            intro = "A popular open-source library your project depends on has been compromised. The maintainer's account was hacked and malicious code was added to a new release.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What should you do?",
                    choices = listOf(
                        ScenarioChoice("Immediately update to the latest version", "bad1"),
                        ScenarioChoice("Pin to the last known-good version and investigate", "good1"),
                        ScenarioChoice("Fork the library and remove the malicious code", "good2"),
                        ScenarioChoice("Wait for the community to respond", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You pin dependencies to known-good versions, audit your dependency tree, and monitor the situation. When a clean version is released, you carefully update.",
                    outcome = Outcome.GOOD,
                    lesson = "Dependency pinning and auditing protect against supply chain attacks while maintaining security."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You fork the library, remove malicious code, and use your forked version while contributing fixes upstream. You also notify other users.",
                    outcome = Outcome.GOOD,
                    lesson = "Proactive community response helps protect the entire ecosystem from supply chain attacks."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You automatically update and introduce the malicious code into your project. It steals secrets or installs backdoors in your application.",
                    outcome = Outcome.BAD,
                    lesson = "Blind trust in dependencies is dangerous. Always verify updates, especially after security incidents."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "While waiting, your automated systems update to the compromised version. The malicious code is deployed to production.",
                    outcome = Outcome.BAD,
                    lesson = "Passive waiting allows automated systems to introduce vulnerabilities. Proactive response is essential."
                )
            )
        ),
        Scenario(
            id = "incidentresponse",
            title = "The Security Incident",
            intro = "Your monitoring system detects unusual outbound traffic from a server, suggesting a possible data breach. You're the first to notice.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is your first action?",
                    choices = listOf(
                        ScenarioChoice("Investigate thoroughly before alerting anyone", "bad1"),
                        ScenarioChoice("Immediately alert the incident response team", "good1"),
                        ScenarioChoice("Shut down the server to stop the breach", "step2"),
                        ScenarioChoice("Check if it's a false alarm first", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You're unsure if shutting down the server will destroy evidence or if the traffic is legitimate.",
                    choices = listOf(
                        ScenarioChoice("Alert the incident response team for guidance", "good1"),
                        ScenarioChoice("Shut it down anyway to be safe", "bad3")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The incident response team takes over, properly investigates, contains the breach, and coordinates the response. Your quick alert enabled professional handling.",
                    outcome = Outcome.GOOD,
                    lesson = "Fast escalation to incident response teams enables professional, coordinated responses."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "While you investigate alone, the breach continues and expands. By the time you alert others, the damage is much worse.",
                    outcome = Outcome.BAD,
                    lesson = "Solo investigation delays professional response and allows incidents to grow. Escalate quickly."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You spend too long checking for false alarms. The breach continues unchecked while you investigate alone.",
                    outcome = Outcome.BAD,
                    lesson = "Time is critical during incidents. Err on the side of caution and escalate quickly."
                ),
                "bad3" to ScenarioStep(
                    id = "bad3",
                    text = "Shutting down the server destroys volatile evidence needed for the investigation. The team can't determine what happened or how to prevent it.",
                    outcome = Outcome.BAD,
                    lesson = "Hasty actions can destroy evidence. Let incident response teams make containment decisions."
                )
            )
        ),
        Scenario(
            id = "privacypolicy",
            title = "The Privacy Policy Change",
            intro = "A service you use for sensitive data quietly updates its privacy policy to allow sharing data with third parties. You only notice when reading tech news.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Continue using the service — you already trust them", "bad1"),
                        ScenarioChoice("Immediately stop using the service and migrate data", "good1"),
                        ScenarioChoice("Contact the company to express concern", "step2"),
                        ScenarioChoice("Read the new policy carefully to understand the impact", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The company responds that the change is necessary for business and won't affect your data.",
                    choices = listOf(
                        ScenarioChoice("Trust their reassurance and continue", "bad1"),
                        ScenarioChoice("Still migrate to a more privacy-respecting service", "good1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You migrate to a service with stronger privacy commitments. Your data remains protected according to your values and requirements.",
                    outcome = Outcome.GOOD,
                    lesson = "Privacy policy changes can fundamentally alter trust relationships. Voting with your usage is powerful."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You carefully analyze the policy, determine the actual impact, and make an informed decision about whether to continue or migrate.",
                    outcome = Outcome.GOOD,
                    lesson = "Informed decisions require understanding actual impacts, not just reacting to headlines."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The company later shares your data with advertisers or government agencies as allowed by the new policy. Your privacy is violated.",
                    outcome = Outcome.BAD,
                    lesson = "Privacy policy changes have real consequences. Don't ignore them based on past trust."
                )
            )
        ),
        Scenario(
            id = "emergencyaccess",
            title = "The Emergency Access Request",
            intro = "It's 2 AM and you receive an urgent call from someone claiming to be your CEO. They say they're traveling and need immediate access to a critical system but forgot their 2FA device.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Give them access — it's the CEO and it's urgent", "bad1"),
                        ScenarioChoice("Verify their identity through multiple channels", "good1"),
                        ScenarioChoice("Tell them to contact IT support instead", "step2"),
                        ScenarioChoice("Refuse — no exceptions to security policy", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "They insist they can't wait for IT and pressure you to help personally.",
                    choices = listOf(
                        ScenarioChoice("Give in to the pressure and help", "bad1"),
                        ScenarioChoice("Stand firm and insist on proper verification", "good1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You verify through multiple channels (call their known number, check with their assistant, use video call). If legitimate, you follow emergency procedures with proper documentation.",
                    outcome = Outcome.GOOD,
                    lesson = "Emergency access requires strong verification. Pressure and urgency are social engineering tactics."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The \"CEO\" was an attacker using voice spoofing. They gain access and cause major damage. You face serious consequences for bypassing security.",
                    outcome = Outcome.BAD,
                    lesson = "Voice can be spoofed. Never bypass security procedures without strong, multi-channel verification."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "If it was actually the CEO with a legitimate emergency, your rigid refusal causes business harm and damages your relationship with leadership.",
                    outcome = Outcome.BAD,
                    lesson = "Security must balance with business needs. Proper emergency procedures allow safe exceptions."
                )
            )
        ),
        Scenario(
            id = "dataloss",
            title = "The Accidental Data Deletion",
            intro = "You accidentally delete an important production database. There are backups, but you're not sure how recent they are or if they include this data.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is your immediate response?",
                    choices = listOf(
                        ScenarioChoice("Try to hide the mistake and fix it yourself", "bad1"),
                        ScenarioChoice("Immediately alert your team and IT operations", "good1"),
                        ScenarioChoice("Check the backups before saying anything", "step2"),
                        ScenarioChoice("Panic and do nothing", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The backups are from yesterday and might not include recent critical data.",
                    choices = listOf(
                        ScenarioChoice("Alert the team immediately with what you know", "good1"),
                        ScenarioChoice("Keep trying to fix it yourself to avoid blame", "bad1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The team responds quickly, restores from backup, and works to recover any lost data. They also implement better safeguards and training to prevent recurrence.",
                    outcome = Outcome.GOOD,
                    lesson = "Fast, honest reporting enables quick recovery and systemic improvements. Everyone makes mistakes."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Your solo attempts make the problem worse or destroy evidence needed for recovery. The issue is eventually discovered and takes much longer to fix.",
                    outcome = Outcome.BAD,
                    lesson = "Hiding mistakes makes them worse. Professional response is faster and more effective."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "The longer you wait, the more data is lost and the harder recovery becomes. The eventual discovery leads to loss of trust.",
                    outcome = Outcome.BAD,
                    lesson = "Paralysis during incidents increases damage. Take action and escalate quickly."
                )
            )
        ),
        Scenario(
            id = "newemployee",
            title = "The Overeager New Employee",
            intro = "A new team member is sharing sensitive documents in public Slack channels and asking detailed questions about security architecture in open forums.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Ignore it — they're new and will learn", "bad1"),
                        ScenarioChoice("Privately message them to explain security practices", "good1"),
                        ScenarioChoice("Report them to their manager immediately", "step2"),
                        ScenarioChoice("Publicly correct them in the channel", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You're not sure if this is a training issue or a willful disregard for security.",
                    choices = listOf(
                        ScenarioChoice("Talk to them first to understand their perspective", "good1"),
                        ScenarioChoice("Report to security to investigate further", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You privately explain security practices and share resources. They're grateful for the guidance and quickly improve their security awareness.",
                    outcome = Outcome.GOOD,
                    lesson = "Mentoring new employees on security culture is more effective than punishment. Education prevents issues."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "Security reviews and finds multiple new employees making similar mistakes. They implement better onboarding security training for all new hires.",
                    outcome = Outcome.GOOD,
                    lesson = "Systemic issues require organizational responses. Better onboarding prevents future problems."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The new employee continues oversharing. Sensitive information leaks and causes security incidents that could have been prevented.",
                    outcome = Outcome.BAD,
                    lesson = "Ignoring security issues enables harm. Proactive guidance prevents incidents."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Public correction embarrasses the new employee and damages their relationship with the team. They become defensive rather than receptive to learning.",
                    outcome = Outcome.BAD,
                    lesson = "Public criticism damages relationships and reduces security cooperation. Private guidance is more effective."
                )
            )
        ),
        Scenario(
            id = "tailgate",
            title = "The Tailgater",
            intro = "You're entering your office building. As you badge in, a person behind you — hands full of coffee and a laptop bag — asks you to hold the door. They have no visible badge.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Hold the door — they look like an employee", "bad1"),
                        ScenarioChoice("Politely say \"please badge in, policy requires it\"", "step2"),
                        ScenarioChoice("Let them in but escort them to reception", "good1"),
                        ScenarioChoice("Ignore them and walk away", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "They insist they \"forgot their badge\" and seem annoyed. What now?",
                    choices = listOf(
                        ScenarioChoice("Let them in to avoid conflict", "bad1"),
                        ScenarioChoice("Direct them to reception for a visitor badge", "good1"),
                        ScenarioChoice("Ask for their name and badge number to verify", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You hold the door. The person is a penetration tester (or real attacker). They walk in, plug a rogue device into an Ethernet port in a conference room, and gain a foothold on the internal network.",
                    outcome = Outcome.BAD,
                    lesson = "Tailgating is a classic physical attack. Politeness should never override access control."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You walk away. The person waits for someone else and gets in anyway. You missed an opportunity to improve security culture.",
                    outcome = Outcome.BAD,
                    lesson = "Ignoring the situation is still a failure — engage politely or escalate."
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You direct them to reception, where they must show ID and sign in. The visitor is logged and escorted. If legitimate, they're issued a badge. If not, they're turned away.",
                    outcome = Outcome.GOOD,
                    lesson = "Visitor procedures exist for a reason. Politely enforcing them protects everyone."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You ask their name and verify via the internal directory, then escort them to reception. They turn out to be a new hire whose badge wasn't activated. You helped without compromising security.",
                    outcome = Outcome.GOOD,
                    lesson = "Verify first, help second. Escorted access is the correct middle ground."
                )
            )
        ),
        Scenario(
            id = "lostdevice",
            title = "The Lost Laptop",
            intro = "You arrive at the office and realize you left your work laptop on the subway. It contains client data, email access, and VPN credentials. You don't know if it's still on the train.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is your first action?",
                    choices = listOf(
                        ScenarioChoice("Wait a day and hope someone turns it in", "bad1"),
                        ScenarioChoice("Immediately call IT security to trigger a remote wipe", "good1"),
                        ScenarioChoice("Log in remotely and download the files before wiping", "bad2"),
                        ScenarioChoice("Post a reward on social media", "bad3")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "IT triggers a remote wipe within minutes. The laptop is encrypted (BitLocker + pre-boot PIN), so even if the wipe fails, data is protected. IT also revokes your VPN certificate, MFA tokens, and SSO sessions. You file an incident report.",
                    outcome = Outcome.GOOD,
                    lesson = "Fast reporting minimizes blast radius. Encryption at rest is your last line of defense."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You wait. Someone finds the laptop, boots it, and attempts password guessing. Since it was not encrypted with pre-boot auth, they eventually boot from USB and extract the disk. Client data is exfiltrated and appears on a dark web forum.",
                    outcome = Outcome.BAD,
                    lesson = "Every minute of delay increases the attacker's opportunity. Report immediately."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You try to log in remotely, but the laptop is offline. Your attempt creates a window where the attacker might also access it. Meanwhile, IT isn't aware and cannot revoke credentials.",
                    outcome = Outcome.BAD,
                    lesson = "Remote access attempts can backfire. Trust IT to handle the incident."
                ),
                "bad3" to ScenarioStep(
                    id = "bad3",
                    text = "You post publicly. The finder now knows the laptop is valuable and may sell it. Attackers monitor such posts to target victims. No remote wipe is triggered.",
                    outcome = Outcome.BAD,
                    lesson = "Public appeals can worsen the situation. Handle lost-device incidents via official channels."
                )
            )
        ),
        Scenario(
            id = "vishing",
            title = "The Vishing Call",
            intro = "Your phone rings. Caller ID shows \"IT Helpdesk\". A polite voice says: \"Hi, this is Sarah from IT. We're seeing malware alerts from your workstation. I need you to install a remote-access tool so I can fix it. Please go to this URL...\"",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Install the tool — they seem legitimate", "bad1"),
                        ScenarioChoice("Hang up and call IT back on the official number", "good1"),
                        ScenarioChoice("Ask for their employee ID and manager name", "step2"),
                        ScenarioChoice("Say you're busy and hang up without reporting", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "They provide an ID and name, but you can't independently verify it. They grow impatient.",
                    choices = listOf(
                        ScenarioChoice("Proceed — they gave you details", "bad1"),
                        ScenarioChoice("Hang up and call IT on the official number", "good1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You hang up and call the official IT number from the company intranet. The real IT confirms no one was calling you. They log the incident and alert the company. The scam is blocked.",
                    outcome = Outcome.GOOD,
                    lesson = "Out-of-band verification defeats vishing. Always call back on a known-good number."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You install the tool. The attacker takes control, installs ransomware, and exfiltrates files. They also capture your credentials from the browser.",
                    outcome = Outcome.BAD,
                    lesson = "Socially-engineered remote access is a leading ransomware vector. Never install tools at unsolicited request."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You hang up but don't report. The attacker calls other employees, and one complies. A breach occurs that your report could have prevented.",
                    outcome = Outcome.BAD,
                    lesson = "Reporting is a responsibility. Your call could protect the entire organization."
                )
            )
        ),
        Scenario(
            id = "usb",
            title = "The Mystery USB",
            intro = "You find a USB drive labeled \"PAYROLL Q4 — CONFIDENTIAL\" in the parking lot. You're curious.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Plug it in to see what's on it", "bad1"),
                        ScenarioChoice("Plug it into an isolated sandbox machine", "step2"),
                        ScenarioChoice("Turn it in to IT security without plugging it in", "good1"),
                        ScenarioChoice("Throw it in the trash", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The sandbox shows the drive has an autorun script and a .lnk file exploiting CVE-2017-8464.",
                    choices = listOf(
                        ScenarioChoice("Report the finding to IT as an attempted attack", "good1"),
                        ScenarioChoice("Copy files to your main machine anyway", "bad1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "IT confirms this was a deliberate USB drop — either a penetration test or an attacker probing your organization. The drive is destroyed and an alert is sent company-wide.",
                    outcome = Outcome.GOOD,
                    lesson = "Unknown media is a classic attack vector. Turn it in — never plug it in."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "The USB contained a LNK file exploit that executed on insertion, installing a backdoor. Attackers gain access to the network.",
                    outcome = Outcome.BAD,
                    lesson = "USB drops exploit both curiosity and autorun/LNK vulnerabilities. Never trust unknown media."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You throw it away. A colleague finds it later and plugs it in, causing a breach. You also lost evidence that could help identify the attacker.",
                    outcome = Outcome.BAD,
                    lesson = "Always escalate unknown media to security — disposal destroys evidence."
                )
            )
        ),
        Scenario(
            id = "ceo",
            title = "The CEO's Urgent Request",
            intro = "An email from the CEO (ceo@yourcompany.com) arrives: \"I'm in a meeting with the board. I need you to wire \$87,000 to this account immediately — don't tell anyone, this is a confidential acquisition. I'll explain later.\"",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Wire the money — the CEO asked", "bad1"),
                        ScenarioChoice("Call the CEO on their known direct number to verify", "good1"),
                        ScenarioChoice("Reply to the email asking for confirmation", "bad2"),
                        ScenarioChoice("Forward to your manager", "step2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "Your manager says \"it must be real, go ahead\".",
                    choices = listOf(
                        ScenarioChoice("Wire the money", "bad1"),
                        ScenarioChoice("Insist on calling the CEO directly first", "good1")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You call the CEO on the number in the company directory. The real CEO is in a meeting but confirms they sent no such email. The email was a Business Email Compromise (BEC) scam.",
                    outcome = Outcome.GOOD,
                    lesson = "Out-of-band verification is mandatory for financial requests, regardless of apparent sender."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You wire the money. It goes to an overseas account controlled by criminals. The loss is irreversible. This was a BEC scam.",
                    outcome = Outcome.BAD,
                    lesson = "BEC scams cause billions in losses annually. Always verify via a known-good channel."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "You reply. The attacker, impersonating the CEO, reinforces urgency and asks for a 2FA code to \"approve\" the wire. You comply and lose the money.",
                    outcome = Outcome.BAD,
                    lesson = "Replying within the compromised channel only confirms you're a willing victim."
                )
            )
        ),
        Scenario(
            id = "social",
            title = "The Friendly Stranger at a Conference",
            intro = "At a security conference, a friendly person sits next to you at lunch. They compliment your talk, ask about your employer, and mention they \"used to work with your CTO\". They ask if you can share an internal architecture diagram for \"a book I'm writing\".",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Share the diagram — they seem legit", "bad1"),
                        ScenarioChoice("Politely decline and explain it's internal", "good1"),
                        ScenarioChoice("Ask for their LinkedIn and verify independently before sharing", "step2"),
                        ScenarioChoice("Share a redacted version", "bad2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "They can't produce credible verification. They press harder, mentioning a \"mutual friend\".",
                    choices = listOf(
                        ScenarioChoice("Share anyway", "bad1"),
                        ScenarioChoice("Decline and report the interaction to your security team", "good2")
                    ),
                    outcome = null,
                    lesson = null
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You politely decline. The person moves on. Later you learn they were collecting intel on multiple companies for competitive intelligence.",
                    outcome = Outcome.GOOD,
                    lesson = "Conferences are prime hunting grounds. Friendly strangers may be elicitation experts."
                ),
                "good2" to ScenarioStep(
                    id = "good2",
                    text = "You decline and report. Security correlates reports from multiple employees — the person is identified as a corporate intelligence operative. Company-wide guidance is issued.",
                    outcome = Outcome.GOOD,
                    lesson = "Reporting suspicious elicitation protects the entire organization."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "You share the diagram. It appears in a competitor's sales materials a month later, revealing your architecture and weaknesses.",
                    outcome = Outcome.BAD,
                    lesson = "Elicitation exploits flattery and the desire to be helpful. Verify before sharing internal information."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "The redacted version still reveals enough about your architecture and tooling for an attacker to plan a targeted attack.",
                    outcome = Outcome.BAD,
                    lesson = "Partial information can still be valuable to an adversary. When in doubt, share nothing."
                )
            )
        ),
    )

    fun byId(id: String): Scenario? = all.firstOrNull { it.id == id }
}
