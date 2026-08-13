package com.abybijo.agent0.data

/**
 * Case archive — 57 documented OPSEC failures, each reduced to
 * what a defender should actually change tomorrow morning.
 */
object Cases {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "edward-snowden-nsa-leaks-2013",
            title = "Edward Snowden & NSA Leaks (2013)",
            year = "2013",
            tags = listOf("Insider Threat", "Classification", "Whistleblowing"),
            summary = "Edward Snowden, a contractor for the NSA, copied and released approximately 1.7 million classified documents revealing global mass surveillance programs (PRISM, XKeyscore, MUSCULAR).",
            details = "Snowden used relatively simple techniques: he asked colleagues for their passwords under the pretext of helping with IT tasks, and he downloaded documents onto a small SD card hidden in a Rubik's Cube. The NSA's internal controls assumed employees would not abuse privileged access.",
            lessons = listOf(
                "Insider threats are the hardest to detect; implement least privilege aggressively.",
                "Do not rely on trust alone — use technical controls (DLP, access logs, anomaly detection).",
                "Two-person integrity rules for access to sensitive datasets.",
                "Culture of security matters as much as technology."
            )
        ),
        CaseStudy(
            id = "opm-breach-2015",
            title = "OPM Breach (2015)",
            year = "2015",
            tags = listOf("Nation-State", "PII", "Legacy Systems"),
            summary = "Chinese state-sponsored hackers compromised the U.S. Office of Personnel Management, exfiltrating 21.5 million records of federal employees, including SF-86 security clearance forms with fingerprints and deeply personal information.",
            details = "Attackers gained access via stolen contractor credentials and moved laterally for months. The systems contained legacy databases with minimal encryption. SF-86 data included mental health disclosures, drug use, financial issues, and foreign contacts — perfect material for future espionage recruitment.",
            lessons = listOf(
                "Legacy systems holding PII must be retired or encrypted in transit AND at rest.",
                "Contractor access must be treated as insider access.",
                "Anomaly detection on lateral movement is critical.",
                "Data you collect is data you must defend — minimize collection."
            )
        ),
        CaseStudy(
            id = "solarwinds-supply-chain-attack-2020",
            title = "SolarWinds Supply-Chain Attack (2020)",
            year = "2020",
            tags = listOf("Supply-Chain", "APT", "Nation-State"),
            summary = "Russian APT29 (\"Cozy Bear\") compromised SolarWinds' build system and inserted a backdoor (SUNBURST) into legitimate Orion updates, distributed to 18,000+ organizations including US government agencies.",
            details = "Attackers operated undetected for approximately 9 months. They leveraged trusted update channels, valid code-signing certificates, and living-off-the-land techniques. Compromised organizations included DHS, Treasury, State, and major tech companies. The attack demonstrated how a single software vendor can become a catastrophic single point of failure.",
            lessons = listOf(
                "Software supply chain is a critical attack surface — audit your vendors.",
                "Code signing alone is not a security guarantee.",
                "Network egress filtering and behavioral monitoring are essential.",
                "Trust but verify — even signed, trusted updates."
            )
        ),
        CaseStudy(
            id = "facebook-cambridge-analytica-2018",
            title = "Facebook–Cambridge Analytica (2018)",
            year = "2018",
            tags = listOf("Privacy", "Third-Party Risk", "Data Brokers"),
            summary = "A Cambridge University researcher built a quiz app that harvested data not only from its ~270,000 users but also from their Facebook friends — affecting up to 87 million people. The data was sold to Cambridge Analytica for political targeting.",
            details = "The app exploited Facebook's Graph API permissions at the time, which allowed apps to read friend lists and their data. This was \"legal\" under Facebook's then-terms but violated user trust and later FTC consent decrees. Facebook paid a \$5 billion fine.",
            lessons = listOf(
                "Third-party API access must be reviewed continuously — permissions drift.",
                "\"Consent\" is not enough — users don't understand what they're agreeing to.",
                "Data minimization reduces blast radius of partner compromises.",
                "Transparency reports and audits are not optional."
            )
        ),
        CaseStudy(
            id = "ashley-madison-breach-2015",
            title = "Ashley Madison Breach (2015)",
            year = "2015",
            tags = listOf("Authentication", "Privacy", "Reputational"),
            summary = "The \"Impact Team\" hackers breached Ashley Madison, a dating site for extramarital affairs, and published 37 million user records including names, emails, and partial credit card data. Two victims later died by suicide.",
            details = "The breach revealed catastrophic OPSEC failures: passwords stored with weak bcrypt (cost factor 5 — far too low), plaintext email addresses, retention of data the company promised to delete, and fake female \"bot\" profiles that constituted fraud. The attackers demanded the site shut down; the company refused.",
            lessons = listOf(
                "If you promise to delete data, actually delete it.",
                "Passwords must use modern, well-tuned hashing (bcrypt/argon2 with high cost).",
                "Collecting PII creates existential liability.",
                "Business models built on secrecy require extraordinary security investment."
            )
        ),
        CaseStudy(
            id = "equifax-breach-2017",
            title = "Equifax Breach (2017)",
            year = "2017",
            tags = listOf("Patch Management", "PII", "Apache Struts"),
            summary = "Equifax failed to patch a known Apache Struts vulnerability (CVE-2017-5638) for months, allowing attackers to steal 147 million Social Security numbers, birth dates, and addresses — the PII of roughly half the US population.",
            details = "The patch had been available for two months. Equifax also had an expired certificate on an intrusion detection system, so the exfiltration went unnoticed for 76 days. They also stored dispute portal passwords in plaintext and had SSNs in unencrypted form in some databases.",
            lessons = listOf(
                "Patch management is a first-class security function.",
                "Security tooling itself must be maintained (IDS certs).",
                "PII in plaintext is unacceptable.",
                "Incident detection is as important as prevention."
            )
        ),
        CaseStudy(
            id = "stuxnet-2010",
            title = "Stuxnet (2010)",
            year = "2010",
            tags = listOf("ICS", "Nation-State", "Air-Gap Bypass"),
            summary = "A joint US-Israeli cyber weapon, Stuxnet, infected Iran's Natanz nuclear enrichment facility via infected USB drives. It reprogrammed centrifuge PLCs to destroy themselves while reporting normal operations.",
            details = "Stuxnet was the first known cyber weapon to cause physical damage. It used four zero-day Windows exploits, stole legitimate digital certificates, and propagated across air-gapped networks via USB. It was reportedly deployed because conventional military options were deemed too risky.",
            lessons = listOf(
                "Air gaps can be defeated by determined attackers with physical access.",
                "Industrial control systems need dedicated security programs.",
                "Supply chain and removable media are viable attack vectors.",
                "Cyber weapons have consequences as real as kinetic weapons."
            )
        ),
        CaseStudy(
            id = "target-hvac-breach-2013",
            title = "Target HVAC Breach (2013)",
            year = "2013",
            tags = listOf("Supply-Chain", "Third-Party Risk", "POS"),
            summary = "Attackers compromised Target's network via Fazio Mechanical Services, a small HVAC vendor, ultimately stealing 40 million credit card numbers and 70 million PII records.",
            details = "The HVAC vendor had remote access to Target's network for billing. Attackers stole the vendor's credentials via phishing, entered Target's network, and laterally moved to the Point of Sale (POS) system to install RAM-scraping malware.",
            lessons = listOf(
                "Third-party vendors must have strictly segmented network access (no path from billing to POS).",
                "Monitor lateral movement aggressively.",
                "Small vendors are high-value targets for supply-chain attacks."
            )
        ),
        CaseStudy(
            id = "sony-pictures-hack-2014",
            title = "Sony Pictures Hack (2014)",
            year = "2014",
            tags = listOf("Nation-State", "Destructive Malware", "Insider"),
            summary = "The \"Guardians of Peace\" (linked to North Korea) breached Sony Pictures, leaking unreleased films, executive emails, and deploying wiper malware that destroyed 70% of Sony's IT infrastructure.",
            details = "Attackers likely gained initial access via spear-phishing or a compromised external partner. They operated silently for months, mapping the network before deploying Shamoon-like wiper malware and exfiltrating 100TB of data.",
            lessons = listOf(
                "Insider threats and compromised partners can bypass perimeter defenses.",
                "Wiper malware requires robust, isolated, and tested offline backups.",
                "Executive communications must be compartmentalized and encrypted."
            )
        ),
        CaseStudy(
            id = "home-depot-pos-breach-2014",
            title = "Home Depot POS Breach (2014)",
            year = "2014",
            tags = listOf("Retail", "Malware", "Third-Party"),
            summary = "Attackers stole 56 million credit card numbers and 53 million email addresses from Home Depot by installing custom RAM-scraping malware on their self-checkout POS systems.",
            details = "Similar to Target, attackers used stolen third-party vendor credentials to access the network. They exploited a lack of network segmentation to jump from a vendor portal to the corporate network and deploy malware on POS registers.",
            lessons = listOf(
                "Network segmentation must prevent vendor portals from reaching critical internal systems.",
                "Endpoint detection on POS systems is mandatory.",
                "RAM-scraping malware defeats encryption in transit if data is scraped while in use."
            )
        ),
        CaseStudy(
            id = "jpmorgan-chase-breach-2014",
            title = "JPMorgan Chase Breach (2014)",
            year = "2014",
            tags = listOf("Financial", "Credential Theft", "APT"),
            summary = "Hackers compromised JPMorgan Chase, stealing contact information for 76 million households and 7 million small businesses, though no financial data or passwords were taken.",
            details = "Attackers exploited a missing two-factor authentication control on a single legacy web server. From there, they gained a foothold and moved laterally, compromising over 90 servers over several months before detection.",
            lessons = listOf(
                "A single missing MFA control on a legacy system can compromise the entire enterprise.",
                "Continuous monitoring for lateral movement is critical in massive networks.",
                "Legacy systems must be audited and retired or brought up to modern security standards."
            )
        ),
        CaseStudy(
            id = "anthem-health-breach-2015",
            title = "Anthem Health Breach (2015)",
            year = "2015",
            tags = listOf("Healthcare", "Phishing", "PII"),
            summary = "Anthem Inc. suffered a massive breach exposing 78.8 million records, including names, SSNs, dates of birth, and employment data, due to a highly targeted spear-phishing attack.",
            details = "An executive clicked a malicious link in a spear-phishing email, giving attackers their credentials. The attackers used this access to query a massive data warehouse containing unencrypted PII of patients and employees.",
            lessons = listOf(
                "Spear-phishing remains highly effective against executives.",
                "Data at rest in warehouses must be encrypted, not just data in transit.",
                "Healthcare PII is highly lucrative on the dark web and requires maximum protection."
            )
        ),
        CaseStudy(
            id = "dnc-hack-2016",
            title = "DNC Hack (2016)",
            year = "2016",
            tags = listOf("Nation-State", "Phishing", "Political"),
            summary = "Russian APT28 (Fancy Bear) and APT29 (Cozy Bear) breached the Democratic National Committee, stealing and leaking internal emails to influence the US presidential election.",
            details = "Attackers sent spear-phishing emails to DNC staff, spoofing Google security alerts. Once credentials were harvested, they accessed Gmail accounts and installed malware on the DNC network, remaining undetected for nearly a year.",
            lessons = listOf(
                "Email spoofing and credential harvesting are primary vectors for APTs.",
                "Political and high-profile organizations are prime targets for geopolitical espionage.",
                "Standard IT support practices (like sending password reset links) can be weaponized."
            )
        ),
        CaseStudy(
            id = "maersk-notpetya-2017",
            title = "Maersk & NotPetya (2017)",
            year = "2017",
            tags = listOf("Destructive Malware", "Supply-Chain", "Geopolitical"),
            summary = "The NotPetya wiper malware, deployed by Russian military intelligence, crippled Maersk's global shipping operations, destroying 45,000 PCs and 4,000 servers in minutes.",
            details = "Maersk was infected via a compromised Ukrainian tax software update (M.E.Doc). The malware used EternalBlue to spread laterally at unprecedented speed. Maersk only survived because a single domain controller in Ghana was offline during a power outage, allowing them to rebuild Active Directory.",
            lessons = listOf(
                "Supply chain attacks via trusted regional software can bypass global defenses.",
                "Offline, immutable backups and isolated domain controllers are critical for disaster recovery.",
                "Geopolitical collateral damage can destroy uninvolved multinational corporations."
            )
        ),
        CaseStudy(
            id = "wannacry-nhs-2017",
            title = "WannaCry & NHS (2017)",
            year = "2017",
            tags = listOf("Ransomware", "Patch Management", "Critical Infrastructure"),
            summary = "The WannaCry ransomware worm exploited the EternalBlue SMB vulnerability, infecting 200,000+ computers globally. The UK National Health Service (NHS) was severely impacted, forcing hospital closures.",
            details = "WannaCry used a stolen NSA exploit (EternalBlue) to spread automatically across networks without user interaction. Many NHS trusts were running unpatched Windows 7 and XP systems, making them highly vulnerable.",
            lessons = listOf(
                "Patch management is a critical, time-sensitive security function.",
                "Legacy operating systems must be isolated or replaced.",
                "Ransomware can cause life-threatening disruptions to critical infrastructure."
            )
        ),
        CaseStudy(
            id = "marriott-starwood-breach-2018",
            title = "Marriott Starwood Breach (2018)",
            year = "2018",
            tags = listOf("M&A", "Encryption", "APT"),
            summary = "Marriott discovered a breach in the Starwood guest reservation database, exposing up to 500 million records. The breach originated in 2014, before Marriott acquired Starwood.",
            details = "Attackers compromised Starwood's network and maintained access for four years. When Marriott acquired Starwood, they inherited the compromised network. Passport numbers were encrypted, but the encryption keys were stored on the same server.",
            lessons = listOf(
                "Mergers and Acquisitions (M&A) require rigorous cybersecurity due diligence.",
                "Encryption keys must never be stored on the same server as the encrypted data.",
                "Long-term persistent threats can hide in legacy systems for years."
            )
        ),
        CaseStudy(
            id = "capital-one-breach-2019",
            title = "Capital One Breach (2019)",
            year = "2019",
            tags = listOf("Cloud", "SSRF", "Misconfiguration"),
            summary = "A former AWS employee exploited a Server-Side Request Forgery (SSRF) vulnerability in Capital One's web application firewall to access 100 million credit card applications stored in AWS S3 buckets.",
            details = "The attacker sent a crafted request to a misconfigured WAF, which then fetched an IAM role's temporary credentials from the AWS metadata service. These credentials allowed her to list and download massive amounts of data from S3.",
            lessons = listOf(
                "Cloud metadata services (like IMDSv1) must be secured or upgraded to IMDSv2.",
                "WAFs and firewalls must be rigorously tested for SSRF vulnerabilities.",
                "Overly permissive IAM roles in cloud environments create massive blast radiuses."
            )
        ),
        CaseStudy(
            id = "twitter-vip-account-takeover-2020",
            title = "Twitter VIP Account Takeover (2020)",
            year = "2020",
            tags = listOf("Social Engineering", "Insider", "Crypto"),
            summary = "Teenage hackers used vishing (voice phishing) to trick Twitter employees into resetting 2FA and handing over access to internal admin tools, hijacking accounts of Elon Musk, Barack Obama, and Apple.",
            details = "The attackers called Twitter IT support, impersonating employees working from home, and convinced them to reset credentials. They used the compromised high-profile accounts to tweet Bitcoin scams, netting over \$100,000.",
            lessons = listOf(
                "IT helpdesks are prime targets for social engineering; strict verification protocols are required.",
                "Internal admin tools must require hardware security keys, not just passwords and SMS.",
                "Insider access must be heavily restricted and monitored."
            )
        ),
        CaseStudy(
            id = "garmin-ransomware-2020",
            title = "Garmin Ransomware (2020)",
            year = "2020",
            tags = listOf("Ransomware", "WastedLocker", "IoT"),
            summary = "Garmin's global operations, including its call centers and fitness tracking sync services, were shut down by WastedLocker ransomware, allegedly deployed via a malicious update.",
            details = "Attackers reportedly used a fake software update to deliver the ransomware. Garmin was forced to pay a multi-million dollar ransom to restore services and regain access to their encrypted data.",
            lessons = listOf(
                "Software update mechanisms must be cryptographically signed and verified.",
                "Ransomware can disrupt consumer-facing IoT and cloud services, not just internal IT.",
                "Paying ransoms is risky and does not guarantee full recovery."
            )
        ),
        CaseStudy(
            id = "colonial-pipeline-2021",
            title = "Colonial Pipeline (2021)",
            year = "2021",
            tags = listOf("Ransomware", "Critical Infrastructure", "Legacy"),
            summary = "DarkSide ransomware affiliates compromised Colonial Pipeline via a single compromised legacy VPN password, forcing the shutdown of the largest US fuel pipeline and causing national gas shortages.",
            details = "The password was found in a dark web dump. The legacy VPN account did not require MFA and provided direct access to the corporate IT network. Colonial shut down the OT (Operational Technology) network preemptively because they lost billing visibility.",
            lessons = listOf(
                "Legacy systems without MFA are critical vulnerabilities and must be retired.",
                "IT/OT network segmentation is essential; an IT breach should not force an OT shutdown.",
                "Monitor dark web credential dumps for your organization's domains."
            )
        ),
        CaseStudy(
            id = "kaseya-vsa-supply-chain-attack-2021",
            title = "Kaseya VSA Supply Chain Attack (2021)",
            year = "2021",
            tags = listOf("Supply-Chain", "Ransomware", "MSP"),
            summary = "The REvil ransomware gang exploited a zero-day vulnerability in Kaseya VSA software, pushing a fake software update to Managed Service Providers (MSPs), which then infected up to 1,500 downstream businesses.",
            details = "By compromising the MSP management tool, attackers bypassed the security of all the MSP's clients simultaneously. REvil demanded \$70 million for a universal decryptor.",
            lessons = listOf(
                "MSPs are high-value targets because they hold the keys to hundreds of client networks.",
                "Automated software update mechanisms can be weaponized for mass distribution of malware.",
                "Supply chain security requires vetting your software vendors' security postures."
            )
        ),
        CaseStudy(
            id = "codecov-supply-chain-attack-2021",
            title = "Codecov Supply Chain Attack (2021)",
            year = "2021",
            tags = listOf("Supply-Chain", "CI/CD", "Espionage"),
            summary = "Attackers compromised Codecov's bash uploader script, allowing them to steal environment variables, credentials, and secrets from thousands of CI/CD pipelines globally.",
            details = "Attackers gained access to Codecov's GCP infrastructure and modified the bash uploader script. When developers ran the script in their CI/CD pipelines, it exfiltrated secrets to an attacker-controlled server.",
            lessons = listOf(
                "CI/CD pipelines contain highly sensitive secrets and must be heavily monitored.",
                "Supply chain attacks can target developer tools, not just end-user software.",
                "Verify the integrity of third-party scripts used in build processes."
            )
        ),
        CaseStudy(
            id = "ubiquiti-insider-extortion-2021",
            title = "Ubiquiti Insider Extortion (2021)",
            year = "2021",
            tags = listOf("Insider Threat", "Extortion", "Cloud"),
            summary = "A senior developer at Ubiquiti abused his administrative access to download sensitive data from the company's AWS and GitHub repositories, then attempted to extort the company for \$2 million in Bitcoin.",
            details = "The attacker used his legitimate credentials to access data, then tried to cover his tracks by deleting logs and planting false evidence to mislead the investigation. He was eventually caught via digital forensics.",
            lessons = listOf(
                "Insider threats with high-level access are extremely difficult to detect.",
                "Data Loss Prevention (DLP) and strict access controls apply to employees, not just outsiders.",
                "Forensic readiness and immutable logging are critical for investigating insider attacks."
            )
        ),
        CaseStudy(
            id = "ronin-bridge-crypto-heist-2022",
            title = "Ronin Bridge Crypto Heist (2022)",
            year = "2022",
            tags = listOf("Crypto", "Social Engineering", "Insider"),
            summary = "North Korea's Lazarus Group stole \$625 million from the Ronin Network (Axie Infinity) by compromising 5 out of 9 validator nodes, including 4 Sky Mavis nodes and 1 Axie DAO node.",
            details = "Lazarus used a sophisticated social engineering campaign, posing as recruiters offering high-paying jobs. They sent a malicious PDF disguised as a job offer to a senior engineer, which installed a backdoor and stole private keys.",
            lessons = listOf(
                "Social engineering via fake job offers is a primary vector for state-sponsored crypto theft.",
                "Private keys for financial infrastructure must be stored in HSMs, not on developer workstations.",
                "Multi-sig wallets require strict, decentralized governance to prevent single points of failure."
            )
        ),
        CaseStudy(
            id = "lastpass-breaches-2022",
            title = "LastPass Breaches (2022)",
            year = "2022",
            tags = listOf("Password Manager", "Cloud", "Encryption"),
            summary = "LastPass suffered two breaches where attackers stole customer vault data. While master passwords were not compromised, encrypted vaults and metadata (URLs, account names) were exfiltrated.",
            details = "Attackers compromised a developer's home computer via a keylogger, stole cloud storage credentials, and accessed a backup of customer vaults. Offline brute-force attacks against weak master passwords became possible.",
            lessons = listOf(
                "Password manager vendors are high-value targets; their internal security must be flawless.",
                "Developer endpoints are a critical attack surface; MDM and endpoint protection are mandatory.",
                "Users must use extremely strong, high-entropy master passphrases to resist offline brute-forcing."
            )
        ),
        CaseStudy(
            id = "uber-mfa-fatigue-attack-2022",
            title = "Uber MFA Fatigue Attack (2022)",
            year = "2022",
            tags = listOf("Social Engineering", "MFA Fatigue", "Privilege Escalation"),
            summary = "An 18-year-old hacker breached Uber by spamming an employee with MFA push notifications (MFA fatigue) and then messaging them on WhatsApp, posing as IT support, to get them to approve the login.",
            details = "Once inside, the attacker found a PowerShell script on a network share containing hard-coded admin credentials for Uber's cloud infrastructure, granting them full access to internal systems.",
            lessons = listOf(
                "MFA fatigue is a real attack; use number-matching or hardware keys to prevent it.",
                "Hard-coded credentials in scripts are catastrophic security failures.",
                "IT support must never communicate with users via personal messaging apps like WhatsApp."
            )
        ),
        CaseStudy(
            id = "lapsus-okta-microsoft-2022",
            title = "Lapsus\$ / Okta & Microsoft (2022)",
            year = "2022",
            tags = listOf("Identity", "Social Engineering", "Cloud"),
            summary = "The Lapsus\$ extortion group compromised major tech companies (Okta, Microsoft, Nvidia) by bribing or socially engineering helpdesk staff and stealing session tokens from compromised developer machines.",
            details = "Lapsus\$ bypassed MFA by stealing active session cookies from infected devices or convincing helpdesk staff to reset passwords. They then accessed internal communication channels like Slack and Jira.",
            lessons = listOf(
                "Session tokens are as valuable as passwords; protect devices against token theft.",
                "Helpdesk staff must have rigorous, multi-channel verification protocols for password resets.",
                "Identity is the new perimeter; monitoring for impossible travel and anomalous sessions is critical."
            )
        ),
        CaseStudy(
            id = "mgm-resorts-vishing-attack-2023",
            title = "MGM Resorts Vishing Attack (2023)",
            year = "2023",
            tags = listOf("Vishing", "Ransomware", "Identity"),
            summary = "Scattered Spider (a social engineering group) breached MGM Resorts by calling the IT helpdesk and impersonating an employee, leading to a ransomware attack that cost the company \$100 million.",
            details = "The attackers found an employee's information on LinkedIn, called the helpdesk, and convinced them to reset the employee's MFA. They used this access to deploy BlackCat ransomware, shutting down slot machines and hotel room keys.",
            lessons = listOf(
                "Vishing (voice phishing) IT helpdesks is a top threat; implement strict identity verification.",
                "MFA resets must require manager approval or secondary out-of-band verification.",
                "Ransomware can cause massive physical and financial disruption in the hospitality sector."
            )
        ),
        CaseStudy(
            id = "moveit-transfer-ransomware-2023",
            title = "MOVEit Transfer Ransomware (2023)",
            year = "2023",
            tags = listOf("Zero-Day", "Supply-Chain", "Data Extortion"),
            summary = "The Cl0p ransomware gang exploited a zero-day SQL injection vulnerability in Progress Software's MOVEit Transfer tool, stealing data from over 2,000 organizations and 60 million individuals.",
            details = "MOVEit is a managed file transfer tool used by thousands of enterprises. The zero-day allowed unauthenticated remote code execution. Cl0p used it to mass-exfiltrate data and extort victims without deploying encryption.",
            lessons = listOf(
                "Managed file transfer tools are critical infrastructure and must be aggressively patched.",
                "Zero-day exploits in widely used software can cause mass, simultaneous breaches.",
                "Data extortion (stealing without encrypting) is the new ransomware model."
            )
        ),
        CaseStudy(
            id = "change-healthcare-ransomware-2024",
            title = "Change Healthcare Ransomware (2024)",
            year = "2024",
            tags = listOf("Healthcare", "Ransomware", "Monopoly Risk"),
            summary = "BlackCat/ALPHV ransomware compromised Change Healthcare via a compromised Citrix portal lacking MFA, crippling US pharmacy and medical billing systems for weeks.",
            details = "Change Healthcare processes claims for a massive portion of the US healthcare system. The breach halted payments to hospitals and pharmacies. UnitedHealth paid a \$22 million ransom, but the affiliate allegedly kept the data.",
            lessons = listOf(
                "Single points of failure in critical infrastructure can paralyze a national sector.",
                "Legacy remote access tools (like Citrix) without MFA are unacceptable risks.",
                "Paying ransoms does not guarantee the affiliate will honor the deletion of stolen data."
            )
        ),
        CaseStudy(
            id = "snowflake-customer-extortion-2024",
            title = "Snowflake Customer Extortion (2024)",
            year = "2024",
            tags = listOf("Identity", "Cloud", "Credential Stuffing"),
            summary = "Attackers targeted Snowflake customers (including Ticketmaster and Santander) using stolen credentials from third-party breaches. They bypassed MFA by exploiting accounts that did not have it enabled.",
            details = "The attackers did not breach Snowflake itself. Instead, they used credentials stolen from infostealer malware logs to log into customer accounts that lacked MFA, exfiltrating massive datasets and demanding ransoms.",
            lessons = listOf(
                "If your SaaS vendor allows accounts without MFA, your data is at risk.",
                "Infostealer malware logs are a primary source of initial access for modern attackers.",
                "Cloud tenants must enforce MFA and monitor for anomalous data downloads."
            )
        ),
        CaseStudy(
            id = "yahoo-breaches-2013-2014",
            title = "Yahoo Breaches (2013-2014)",
            year = "2013",
            tags = listOf("Authentication", "Scale", "M&A"),
            summary = "Yahoo suffered two massive breaches affecting all 3 billion user accounts. Attackers stole names, email addresses, phone numbers, and security questions, though passwords were hashed.",
            details = "The 2013 breach used forged cookies to bypass password authentication entirely. The 2014 breach was linked to Russian FSB agents. Verizon later reduced its acquisition price of Yahoo by \$350 million due to the breaches.",
            lessons = listOf(
                "Forged session cookies can bypass authentication entirely; secure cookie generation is vital.",
                "Security incidents can materially alter M&A valuations and deal structures.",
                "Security questions are inherently weak and should be deprecated in favor of MFA."
            )
        ),
        CaseStudy(
            id = "linkedin-breach-2012",
            title = "LinkedIn Breach (2012)",
            year = "2012",
            tags = listOf("Hashing", "Authentication", "Scale"),
            summary = "Hackers breached LinkedIn, stealing 117 million user email addresses and passwords. The passwords were hashed using unsalted SHA-1, making them trivial to crack.",
            details = "Because the SHA-1 hashes were not salted, attackers used rainbow tables to quickly crack millions of passwords. These cracked credentials were later used in massive credential stuffing campaigns against other sites.",
            lessons = listOf(
                "Passwords must be hashed with modern, slow algorithms (Argon2, bcrypt) and unique salts.",
                "Unsated hashes provide almost no protection against modern cracking hardware.",
                "A breach at one site endangers all sites where users reuse passwords."
            )
        ),
        CaseStudy(
            id = "adobe-breach-2013",
            title = "Adobe Breach (2013)",
            year = "2013",
            tags = listOf("Encryption", "Source Code", "PII"),
            summary = "Adobe announced a breach affecting 38 million users. Attackers stole encrypted customer credit card data, login credentials, and the source code for Adobe Acrobat and ColdFusion.",
            details = "Adobe used a flawed implementation of 3DES encryption where the same key and initialization vector (IV) were used for many passwords, allowing attackers to guess passwords by matching ciphertext patterns. They also left \"password hints\" in plaintext.",
            lessons = listOf(
                "Cryptographic implementation is hard; use established, audited libraries.",
                "Never store password hints in plaintext.",
                "Source code theft allows attackers to find zero-day vulnerabilities in your products."
            )
        ),
        CaseStudy(
            id = "rsa-securid-breach-2011",
            title = "RSA SecurID Breach (2011)",
            year = "2011",
            tags = listOf("Supply-Chain", "APT", "Authentication"),
            summary = "Chinese state-sponsored hackers breached RSA Security, stealing \"seed\" values used to generate SecurID two-factor authentication tokens, compromising a foundational security product.",
            details = "Attackers sent a spear-phishing email with a malicious Excel attachment to a low-level RSA employee. Once inside, they extracted the seed values, which were later used in an attempt to breach Lockheed Martin.",
            lessons = listOf(
                "A single compromised low-level employee can yield access to crown-jewel data.",
                "Security vendors are high-value targets for nation-states.",
                "Hardware tokens are only as secure as the seed values used to generate them."
            )
        ),
        CaseStudy(
            id = "tjx-companies-breach-2007",
            title = "TJX Companies Breach (2007)",
            year = "2007",
            tags = listOf("Retail", "Wi-Fi", "Encryption"),
            summary = "Hacker Albert Gonzalez and his gang stole over 90 million credit and debit card numbers from TJX (TJ Maxx, Marshalls) by exploiting weak WEP Wi-Fi encryption at a retail store.",
            details = "The attackers parked outside a Miami store, cracked the WEP Wi-Fi key in minutes, and gained access to the corporate network. They then installed sniffers on the payment processing network to capture unencrypted card data.",
            lessons = listOf(
                "WEP Wi-Fi is fundamentally broken; WPA2/WPA3 is mandatory.",
                "Network segmentation must prevent retail store Wi-Fi from accessing corporate payment networks.",
                "Data in transit must be encrypted end-to-end."
            )
        ),
        CaseStudy(
            id = "heartland-payment-systems-2008",
            title = "Heartland Payment Systems (2008)",
            year = "2008",
            tags = listOf("Financial", "SQL Injection", "POS"),
            summary = "Albert Gonzalez breached Heartland Payment Systems via a SQL injection vulnerability in a web application, eventually installing sniffers that captured 130 million card numbers.",
            details = "After exploiting the SQLi flaw, Gonzalez moved laterally into the payment processing network. Because credit card data was transmitted in cleartext internally, his sniffers captured massive volumes of data.",
            lessons = listOf(
                "SQL injection remains a critical threat if input validation is ignored.",
                "Internal network traffic, especially payment data, must be encrypted.",
                "Web application firewalls (WAFs) and regular code audits are essential."
            )
        ),
        CaseStudy(
            id = "sony-playstation-network-2011",
            title = "Sony PlayStation Network (2011)",
            year = "2011",
            tags = listOf("Gaming", "PII", "Legacy"),
            summary = "Hackers breached the Sony PlayStation Network, compromising 77 million user accounts, including names, addresses, and potentially credit card data, forcing a 23-day network shutdown.",
            details = "Attackers exploited a known, unpatched vulnerability in an application server. Sony was running an outdated version of Apache web server software that had not been patched, allowing the initial compromise.",
            lessons = listOf(
                "Patch management is non-negotiable for public-facing infrastructure.",
                "Incident response must include rapid user notification; Sony was criticized for delaying disclosure.",
                "Network outages cost millions in revenue and destroy customer trust."
            )
        ),
        CaseStudy(
            id = "bangladesh-bank-heist-2016",
            title = "Bangladesh Bank Heist (2016)",
            year = "2016",
            tags = listOf("SWIFT", "Nation-State", "Physical"),
            summary = "North Korea's Lazarus Group hacked the Bangladesh Bank, stealing \$81 million by sending fraudulent SWIFT transfer requests to the Federal Reserve Bank of New York.",
            details = "Attackers compromised the bank's network via spear-phishing, stole SWIFT credentials, and sent 35 transfer requests. They also hacked the bank's physical printer to hide the confirmation messages of the fraudulent transfers.",
            lessons = listOf(
                "Financial messaging systems (SWIFT) require strict network isolation and hardware MFA.",
                "Attackers will manipulate physical systems (like printers) to hide their tracks.",
                "Anomalous transaction monitoring must be implemented at both the sending and receiving banks."
            )
        ),
        CaseStudy(
            id = "mt-gox-collapse-2014",
            title = "Mt. Gox Collapse (2014)",
            year = "2014",
            tags = listOf("Crypto", "Insider/Incompetence", "Audit"),
            summary = "Mt. Gox, then the world's largest Bitcoin exchange, filed for bankruptcy after announcing the loss of 850,000 Bitcoins (worth ~\$450M at the time) due to a prolonged, undetected hack.",
            details = "Attackers exploited a transaction malleability bug to trick the exchange into thinking transactions failed, allowing them to withdraw funds repeatedly. The CEO admitted they had not audited their reserves in years.",
            lessons = listOf(
                "Cryptocurrency exchanges must undergo regular, public proof-of-reserves audits.",
                "Financial reconciliation systems must be rigorously tested for edge cases.",
                "Lack of transparency and poor internal controls lead to catastrophic failures."
            )
        ),
        CaseStudy(
            id = "coincheck-nem-hack-2018",
            title = "Coincheck NEM Hack (2018)",
            year = "2018",
            tags = listOf("Crypto", "Hot Wallet", "Private Keys"),
            summary = "Japanese exchange Coincheck lost \$530 million worth of NEM tokens when hackers compromised a single hot wallet server containing the private keys.",
            details = "The private keys for the hot wallet were stored on an internet-connected server without multi-signature protection. Attackers likely gained access via a phishing email or malware on an employee's machine.",
            lessons = listOf(
                "Hot wallets must never hold the majority of exchange funds; use cold storage.",
                "Multi-signature wallets require multiple compromised keys to authorize a transfer.",
                "Private keys on internet-connected servers are inherently insecure."
            )
        ),
        CaseStudy(
            id = "poly-network-crypto-hack-2021",
            title = "Poly Network Crypto Hack (2021)",
            year = "2021",
            tags = listOf("Crypto", "Smart Contract", "DeFi"),
            summary = "A hacker exploited a vulnerability in Poly Network's smart contracts, stealing \$611 million in various cryptocurrencies across Ethereum, Binance Smart Chain, and Polygon.",
            details = "The attacker found a flaw in the cross-chain bridge contract that allowed them to override the administrator keys and transfer funds to their own wallets. The hacker later returned the funds, claiming they were a \"white hat\".",
            lessons = listOf(
                "Smart contracts handling millions must undergo multiple independent security audits.",
                "Cross-chain bridges are high-risk targets due to complex logic and large liquidity pools.",
                "Code is law, but flawed code leads to catastrophic financial loss."
            )
        ),
        CaseStudy(
            id = "ftx-alameda-research-collapse-2022",
            title = "FTX / Alameda Research Collapse (2022)",
            year = "2022",
            tags = listOf("Insider Fraud", "Corporate Governance", "Crypto"),
            summary = "FTX, the second-largest crypto exchange, collapsed after it was revealed that customer funds were secretly funneled to its affiliated trading firm, Alameda Research, to cover massive losses.",
            details = "CEO Sam Bankman-Fried and insiders bypassed internal risk controls using a \"backdoor\" in the code. There was no board oversight, poor accounting, and commingling of customer and corporate funds.",
            lessons = listOf(
                "Corporate governance and independent audits are as critical as technical security.",
                "Backdoors in code, even for \"convenience,\" destroy trust and enable fraud.",
                "Customer funds must be strictly segregated from corporate trading funds."
            )
        ),
        CaseStudy(
            id = "macron-campaign-hack-2017",
            title = "Macron Campaign Hack (2017)",
            year = "2017",
            tags = listOf("Phishing", "Political", "Resilience"),
            summary = "Russian APT28 targeted French presidential candidate Emmanuel Macron's campaign with a massive spear-phishing campaign just weeks before the election.",
            details = "The campaign's IT team anticipated the attack, created fake email accounts with bogus documents (honeypots), and fed them to the attackers. This wasted the attackers' time and allowed the campaign to identify the intrusion early.",
            lessons = listOf(
                "Anticipating attacks and setting up honeypots can waste attacker resources.",
                "Political campaigns are high-value targets for disinformation and espionage.",
                "Proactive threat hunting is superior to passive defense."
            )
        ),
        CaseStudy(
            id = "premera-blue-cross-2015",
            title = "Premera Blue Cross (2015)",
            year = "2015",
            tags = listOf("Healthcare", "Spear-Phishing", "Legacy"),
            summary = "Premera Blue Cross suffered a breach exposing 11 million records, including SSNs and bank accounts, after attackers gained access via a spear-phishing email and remained undetected for 10 months.",
            details = "Attackers used stolen credentials to move laterally through the network. Premera's lack of network segmentation and poor logging allowed the attackers to operate freely and exfiltrate massive amounts of data.",
            lessons = listOf(
                "Dwell time (time undetected) must be minimized via aggressive logging and alerting.",
                "Network segmentation prevents attackers from reaching sensitive databases.",
                "Healthcare records are highly targeted for identity theft and medical fraud."
            )
        ),
        CaseStudy(
            id = "foxconn-ransomware-2020",
            title = "Foxconn Ransomware (2020)",
            year = "2020",
            tags = listOf("Ransomware", "Manufacturing", "Extortion"),
            summary = "The DollarPawn ransomware gang encrypted 1,200 servers at Foxconn's Mexican facility, demanding \$34 million in Bitcoin and threatening to leak stolen data.",
            details = "The attackers targeted the manufacturing giant's IT infrastructure, disrupting operations. Foxconn refused to pay the ransom and restored systems from backups, though some data was leaked.",
            lessons = listOf(
                "Global manufacturing networks are highly vulnerable to localized ransomware attacks.",
                "Refusing to pay ransoms is viable if robust, tested backups exist.",
                "Data extortion is used as leverage when encryption fails to force payment."
            )
        ),
        CaseStudy(
            id = "acer-ransomware-2021",
            title = "Acer Ransomware (2021)",
            year = "2021",
            tags = listOf("Ransomware", "REvil", "Hardware"),
            summary = "The REvil ransomware gang hit PC giant Acer, demanding a record \$50 million ransom and leaking financial documents and product designs.",
            details = "REvil likely gained initial access via an unpatched Microsoft Exchange server vulnerability (ProxyLogon). They exfiltrated sensitive data before encrypting systems to ensure maximum extortion pressure.",
            lessons = listOf(
                "Unpatched public-facing servers (like Exchange) are prime entry points for ransomware gangs.",
                "Product designs and financial data are highly sensitive and must be isolated.",
                "Double extortion (steal + encrypt) is the standard operating procedure for modern ransomware."
            )
        ),
        CaseStudy(
            id = "jbs-meats-ransomware-2021",
            title = "JBS Meats Ransomware (2021)",
            year = "2021",
            tags = listOf("Ransomware", "Food Supply", "REvil"),
            summary = "The world's largest meat processor, JBS, was forced to shut down plants across North America and Australia after a REvil ransomware attack, disrupting the global food supply chain.",
            details = "JBS paid an \$11 million ransom to prevent further disruption and data leakage. The attack highlighted the vulnerability of the food and agriculture sector to cyber extortion.",
            lessons = listOf(
                "The food and agriculture sector is critical infrastructure and a prime target for disruption.",
                "Paying ransoms funds future attacks, but operational pressure often forces compliance.",
                "Supply chain resilience requires decentralized operations to prevent single-point failures."
            )
        ),
        CaseStudy(
            id = "caesars-entertainment-ransomware-2023",
            title = "Caesars Entertainment Ransomware (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Vishing", "Extortion"),
            summary = "Scattered Spider breached Caesars Entertainment using vishing against the IT helpdesk, stealing driver's licenses and SSNs, and extorting the company for \$15 million.",
            details = "Unlike MGM (which refused to pay and suffered massive outages), Caesars chose to pay the \$15 million ransom quickly to avoid operational disruption, though the attackers still leaked some data.",
            lessons = listOf(
                "Vishing IT helpdesks remains a highly effective initial access vector.",
                "Paying ransoms does not guarantee data deletion, as seen when Caesars' data was still leaked.",
                "The decision to pay or not pay involves complex risk, legal, and operational calculations."
            )
        ),
        CaseStudy(
            id = "cdk-global-ransomware-2024",
            title = "CDK Global Ransomware (2024)",
            year = "2024",
            tags = listOf("Ransomware", "Automotive", "Supply Chain"),
            summary = "BlackSuit ransomware crippled CDK Global, a software provider for 15,000 car dealerships in North America, halting sales, financing, and repairs for weeks.",
            details = "CDK's centralized SaaS platform meant that when it went down, thousands of independent dealerships were forced to use pen and paper, causing billions in lost revenue across the auto industry.",
            lessons = listOf(
                "Centralized SaaS providers create massive single points of failure for entire industries.",
                "Dealerships and businesses must have offline continuity plans for when cloud providers fail.",
                "Ransomware targeting B2B SaaS providers maximizes downstream economic damage."
            )
        ),
        CaseStudy(
            id = "dropbox-sign-hellosign-breach-2024",
            title = "Dropbox Sign (HelloSign) Breach (2024)",
            year = "2024",
            tags = listOf("Cloud", "API", "Third-Party"),
            summary = "A threat actor compromised Dropbox Sign's automated system configurator, gaining access to customer metadata, API keys, and authentication tokens.",
            details = "The attacker gained access to a service account with elevated privileges. While document contents were reportedly not accessed, the theft of API keys and tokens posed a severe risk for downstream account takeovers.",
            lessons = listOf(
                "Service accounts and automated configurators must have strict least-privilege access.",
                "API keys and authentication tokens are crown jewels and must be rotated immediately upon suspicion of breach.",
                "Third-party SaaS breaches require immediate customer notification to rotate local credentials."
            )
        ),
        CaseStudy(
            id = "23andme-data-scraping-2023",
            title = "23andMe Data Scraping (2023)",
            year = "2023",
            tags = listOf("Credential Stuffing", "Privacy", "Genetic Data"),
            summary = "Attackers used credential stuffing to access 23andMe accounts, exploiting the \"DNA Relatives\" feature to scrape the genetic data and profiles of 6.9 million users.",
            details = "The attackers did not breach 23andMe's servers directly. They used recycled passwords to log in, then used the genealogy matching feature to view and scrape data of the victims' relatives.",
            lessons = listOf(
                "Credential stuffing is devastating when accounts lack mandatory MFA.",
                "Features that share data with third parties (like relatives) can be abused for mass scraping.",
                "Genetic data is immutable; once leaked, it cannot be changed, creating permanent privacy risks."
            )
        ),
        CaseStudy(
            id = "mr-cooper-mortgage-breach-2023",
            title = "Mr. Cooper Mortgage Breach (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Financial", "PII"),
            summary = "One of the largest US mortgage servicers, Mr. Cooper, suffered a massive data breach exposing the personal information of 14.6 million customers, including SSNs and bank account details.",
            details = "The breach was linked to a ransomware attack (likely BlackCat) that disrupted the company's operations. The sheer volume of highly sensitive financial PII made it one of the largest breaches of the year.",
            lessons = listOf(
                "Mortgage and financial institutions hold the most sensitive PII and are prime targets.",
                "Operational disruption in financial services directly impacts consumers' ability to pay mortgages.",
                "Data minimization is critical; do not retain SSNs and bank details longer than legally required."
            )
        ),
        CaseStudy(
            id = "boeing-citrixbleed-2023",
            title = "Boeing & Citrixbleed (2023)",
            year = "2023",
            tags = listOf("Zero-Day", "Ransomware", "Aviation"),
            summary = "The LockBit ransomware gang breached Boeing's parts and distribution business by exploiting the Citrixbleed zero-day vulnerability, stealing massive amounts of data.",
            details = "Citrixbleed (CVE-2023-4966) allowed attackers to hijack active user sessions without needing passwords. Boeing refused to pay the ransom, and LockBit leaked the data on their dark web leak site.",
            lessons = listOf(
                "Zero-day vulnerabilities in remote access tools (Citrix, VPNs) require immediate emergency patching.",
                "Session hijacking bypasses MFA entirely; behavioral analytics are needed to detect anomalous sessions.",
                "Refusing to pay ransoms is a strong stance, but organizations must prepare for the resulting data leak."
            )
        ),
        CaseStudy(
            id = "pegasus-nso-group-2021",
            title = "Pegasus / NSO Group (2021)",
            year = "2021",
            tags = listOf("Zero-Click", "Spyware", "Mobile"),
            summary = "The Pegasus spyware, developed by NSO Group, was used by governments to infect the iPhones of journalists, activists, and politicians via zero-click exploits in iMessage and WhatsApp.",
            details = "Pegasus required no user interaction; simply receiving a specially crafted message was enough to jailbreak the phone and install the spyware, granting full access to cameras, microphones, and encrypted messages.",
            lessons = listOf(
                "Zero-click exploits on mobile devices are a reality for high-risk targets.",
                "End-to-end encryption does not protect against malware installed directly on the endpoint.",
                "High-risk individuals must use specialized threat models and consider burner devices."
            )
        ),
        CaseStudy(
            id = "mailchimp-data-breaches-2022",
            title = "Mailchimp Data Breaches (2022)",
            year = "2022",
            tags = listOf("Social Engineering", "SaaS", "Phishing"),
            summary = "Mailchimp suffered multiple breaches where attackers used social engineering and vishing to compromise Mailchimp employees and contractors, gaining access to customer accounts.",
            details = "The attackers used the stolen access to target Mailchimp customers (like crypto firms) with highly convincing phishing emails, attempting to steal cryptocurrency wallets.",
            lessons = listOf(
                "SaaS vendors are targeted to reach their downstream customers.",
                "Vishing employees remains a highly effective way to bypass technical controls.",
                "Customers must be educated to recognize phishing emails even when they appear to come from trusted vendors."
            )
        ),
        CaseStudy(
            id = "okta-support-system-hack-2023",
            title = "Okta Support System Hack (2023)",
            year = "2023",
            tags = listOf("Supply-Chain", "Identity", "Support"),
            summary = "Scattered Spider breached Okta's customer support system, stealing session cookies and HAR files that allowed them to bypass MFA and access downstream customers like MGM and Caesars.",
            details = "The attackers compromised a support engineer's personal device, which was logged into Okta's support portal. They used the stolen session data to hijack active sessions of Okta administrators at client companies.",
            lessons = listOf(
                "Customer support portals are critical attack surfaces; they must require hardware MFA and strict monitoring.",
                "Session cookies and HAR files are highly sensitive and must be protected on employee devices.",
                "Identity providers are the ultimate high-value target; their internal security must be flawless."
            )
        ),
    )

    val years: List<String> = all.map { it.year }.distinct().sortedDescending()
    val tags: List<String> = all.flatMap { it.tags }.distinct().sorted()

    fun search(query: String, tag: String? = null): List<CaseStudy> {
        val q = query.trim().lowercase()
        return all.filter { c ->
            (tag == null || c.tags.contains(tag)) &&
                (q.isBlank() || c.title.lowercase().contains(q) ||
                    c.summary.lowercase().contains(q) ||
                    c.tags.any { it.lowercase().contains(q) })
        }
    }
}
