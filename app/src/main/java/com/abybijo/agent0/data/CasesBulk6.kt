package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk cases, batch 6 (final bulk batch): 29 general cases, real incidents, public sources named. */
object CasesBulk6 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "careem-breach-2020",
            title = "Careem Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "Ride Hailing"),
            summary = "Careem suffered a breach in 2020 exposing names, emails, phone numbers, and trip data of millions of riders and drivers across the Middle East.",
            details = "Careem disclosed the breach after attackers accessed its systems and took customer and driver data. The case shows that ride-hailing platforms hold location and trip histories, making their breaches sensitive beyond contact details.",
            lessons = listOf("Ride-hailing data includes trip histories. Treat it as location data.", "Regional platforms hold the same sensitive data as global ones."),
            source = "Careem (2020)"
        ),
        CaseStudy(
            id = "paytm-mall-2020",
            title = "Paytm Mall Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "E-commerce"),
            summary = "Paytm Mall faced an alleged breach in 2020 in which a group claimed to hold personal data of millions of users and demanded payment.",
            details = "Paytm Mall said its data was safe and that it was investigating the claims. The case shows that alleged breaches still require user caution, and that e-commerce data is a ransomware target.",
            lessons = listOf("Alleged breaches still warrant caution. Change passwords and monitor accounts.", "E-commerce data is a ransomware target. Protect customer databases strictly."),
            source = "Paytm Mall (2020)"
        ),
        CaseStudy(
            id = "zee5-breach-2020",
            title = "ZEE5 Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "Streaming"),
            summary = "ZEE5 suffered a breach in 2020 exposing names, emails, and phone numbers of millions of subscribers, after attackers accessed its systems.",
            details = "The data appeared for sale in 2020. ZEE5 said it was investigating. The case shows that streaming accounts hold contact data used for phishing, and that subscriber databases are targets.",
            lessons = listOf("Streaming accounts hold contact data used for phishing.", "Subscriber databases are targets. Protect them like payment systems."),
            source = "ZEE5 (2020)"
        ),
        CaseStudy(
            id = "bsnl-breach-2024",
            title = "BSNL Breach (2024)",
            year = "2024",
            tags = listOf("Breach", "Telecom"),
            summary = "BSNL faced an alleged breach in 2024 in which a seller claimed to hold personal data of millions of subscribers, including identity details.",
            details = "BSNL said it was investigating the claims. The case shows that state telecom subscriber data is a prized target, and that alleged breaches still require user caution.",
            lessons = listOf("Telecom subscriber data is a prized target. Protect carrier accounts with PINs.", "Alleged breaches still warrant caution. Monitor accounts after them."),
            source = "BSNL (2024)"
        ),
        CaseStudy(
            id = "star-health-2024",
            title = "Star Health Breach (2024)",
            year = "2024",
            tags = listOf("Breach", "Insurance"),
            summary = "Star Health suffered a breach in 2024 in which attackers claimed to hold personal and medical data of millions of customers, after accessing its systems.",
            details = "The insurer said it was investigating with authorities and that operations were unaffected. The case shows that health insurance data is sensitive medical identity, and that insurer breaches have long fraud tails.",
            lessons = listOf("Health insurance data is sensitive medical identity.", "Insurer breaches have long fraud tails. Monitor identity after them."),
            source = "Star Health and Allied Insurance (2024)"
        ),
        CaseStudy(
            id = "policybazaar-2022",
            title = "PolicyBazaar Breach (2022)",
            year = "2022",
            tags = listOf("Breach", "Insurance"),
            summary = "PolicyBazaar suffered a breach in 2022 in which attackers accessed its IT systems and took personal data of customers, after exploiting a vulnerability.",
            details = "PolicyBazaar said it had notified authorities and was strengthening security. The case shows that insurance aggregators hold data across many insurers, making them single points of failure.",
            lessons = listOf("Insurance aggregators hold data across many insurers. They are single points of failure.", "Aggregator breaches affect customers of many insurers at once."),
            source = "PolicyBazaar (2022)"
        ),
        CaseStudy(
            id = "coffee-meets-bagel-2019",
            title = "Coffee Meets Bagel Breach (2019)",
            year = "2019",
            tags = listOf("Breach", "Dating"),
            summary = "Coffee Meets Bagel suffered a breach in 2019 exposing names and emails of millions of users, after attackers accessed its systems.",
            details = "The dating app disclosed the breach and advised password changes. The case shows that dating apps hold sensitive social data, and that email exposure enables phishing and embarrassment.",
            lessons = listOf("Dating apps hold sensitive social data. Protect them accordingly.", "Email exposure enables phishing. Verify unexpected messages after breaches."),
            source = "Coffee Meets Bagel (2019)"
        ),
        CaseStudy(
            id = "line-yahoo-2023",
            title = "LINE Yahoo Breach (2023)",
            year = "2023",
            tags = listOf("Breach", "Messaging"),
            summary = "LY Corporation, operator of LINE, suffered a breach in 2023 in which attackers accessed personal data of hundreds of thousands of users, after compromising a business partner's systems.",
            details = "The breach began with a partner's compromised account and spread to LINE systems. Japan's government ordered security improvements. The case shows that partner compromise becomes platform compromise.",
            lessons = listOf("Partner compromise becomes platform compromise. Vet partner access.", "Messaging platforms hold personal data at national scale."),
            source = "LY Corporation (2023)"
        ),
        CaseStudy(
            id = "lazada-redmart-2020",
            title = "Lazada RedMart Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "E-commerce"),
            summary = "Lazada's RedMart grocery service suffered a breach in 2020 exposing names, emails, addresses, and phone numbers of more than a million customers in Singapore.",
            details = "Lazada said the breach affected RedMart customers and that it had notified them. The case shows that grocery delivery accounts hold addresses and phone numbers useful for phishing and fraud.",
            lessons = listOf("Grocery delivery accounts hold addresses and phone numbers.", "Regional grocery services are breached like global ones."),
            source = "Lazada / RedMart (2020)"
        ),
        CaseStudy(
            id = "ikea-phishing-2021",
            title = "IKEA Phishing Attack (2021)",
            year = "2021",
            tags = listOf("Phishing", "Retail"),
            summary = "In 2021, IKEA suffered an internal phishing attack in which attackers used compromised employee mailboxes to send phishing emails to other employees, after a reply-chain attack.",
            details = "IKEA warned staff about reply-chain phishing emails that appeared to come from colleagues. The case shows that internal phishing defeats trust in colleagues' emails, and that reply-chain attacks are convincing.",
            lessons = listOf("Reply-chain phishing defeats trust in colleagues' emails. Verify unexpected attachments.", "Internal phishing is a real threat. Train staff to verify, not only to spot outsiders."),
            source = "IKEA (2021)"
        ),
        CaseStudy(
            id = "hubspot-breach-2022",
            title = "HubSpot Breach (2022)",
            year = "2022",
            tags = listOf("Breach", "Marketing"),
            summary = "HubSpot suffered a breach in 2022 in which attackers compromised an employee account and accessed customer data for a set of accounts, including cryptocurrency firms.",
            details = "HubSpot said the breach affected fewer than thirty accounts and that it had revoked access. The case shows that marketing platforms hold customer data worth stealing for phishing, and that employee accounts are attack paths.",
            lessons = listOf("Marketing platforms hold customer data worth stealing for phishing.", "Employee accounts are attack paths. Protect them with hardware factors."),
            source = "HubSpot (2022)"
        ),
        CaseStudy(
            id = "zendesk-breach-2016",
            title = "Zendesk Breach (2016)",
            year = "2016",
            tags = listOf("Breach", "Support"),
            summary = "Zendesk suffered a breach in 2016 in which attackers accessed a system holding agent emails and hashed passwords, after exploiting a vulnerability.",
            details = "Zendesk disclosed the breach and reset passwords for affected agents. The case shows that support platforms hold agent credentials, and that support tool breaches affect many companies' customers.",
            lessons = listOf("Support platforms hold agent credentials. Protect them strictly.", "Support tool breaches affect many companies' customers at once."),
            source = "Zendesk (2016)"
        ),
        CaseStudy(
            id = "atlassian-confluence-2023",
            title = "Atlassian Confluence Attacks (2023)",
            year = "2023",
            tags = listOf("Exploit", "Collaboration"),
            summary = "In 2023, attackers exploited a vulnerability in Atlassian Confluence servers to gain access and deploy ransomware, targeting internet-facing collaboration systems.",
            details = "Atlassian and CISA warned of active exploitation of a privilege escalation flaw. The case shows that collaboration servers are high-value targets, and that internet-facing systems need immediate patching.",
            lessons = listOf("Internet-facing collaboration servers need immediate patching.", "Privilege escalation flaws are exploited rapidly. Patch on disclosure."),
            source = "Atlassian / CISA (2023)"
        ),
        CaseStudy(
            id = "trello-breach-2024",
            title = "Trello Breach (2024)",
            year = "2024",
            tags = listOf("Breach", "Productivity"),
            summary = "Trello suffered a breach in 2024 in which attackers collected email addresses of millions of users by abusing its API, after enumerating accounts.",
            details = "Atlassian said the data came from publicly available information combined through an API. The case shows that APIs enabling enumeration expose user data, and that public profile data becomes sensitive in bulk.",
            lessons = listOf("APIs enabling enumeration expose user data. Rate-limit and restrict them.", "Public profile data becomes sensitive in bulk."),
            source = "Atlassian / Trello (2024)"
        ),
        CaseStudy(
            id = "ua-parser-js-2021",
            title = "ua-parser-js Hijack (2021)",
            year = "2021",
            tags = listOf("Supply Chain", "Malware"),
            summary = "In 2021, attackers hijacked the popular npm package ua-parser-js and published malicious versions that installed malware on systems using it.",
            details = "The hijack used a compromised maintainer account to publish trojanised versions. npm removed the versions and advised users to update. The case shows that package maintainer accounts are supply-chain targets.",
            lessons = listOf("Package maintainer accounts are supply-chain targets. Protect them with two-factor authentication.", "Popular packages are distribution channels. Pin versions and audit updates."),
            source = "npm (2021)"
        ),
        CaseStudy(
            id = "drupalgeddon-2018",
            title = "Drupalgeddon2 Exploitation (2018)",
            year = "2018",
            tags = listOf("Exploit", "CMS"),
            summary = "In 2018, attackers mass-exploited a critical vulnerability in Drupal, dubbed Drupalgeddon2, to install backdoors and cryptocurrency miners on vulnerable sites.",
            details = "Drupal issued a patch and warned that exploitation began within hours of disclosure. The case shows that CMS vulnerabilities are exploited at internet scale within hours, and that patching speed is the defence.",
            lessons = listOf("CMS vulnerabilities are exploited within hours of disclosure. Patch immediately.", "Internet-scale exploitation punishes slow patching. Automate updates where possible."),
            source = "Drupal (2018)"
        ),
        CaseStudy(
            id = "magento-magecart-2019",
            title = "Magento Magecart Campaign (2019)",
            year = "2019",
            tags = listOf("Magecart", "E-commerce"),
            summary = "In 2019, Magecart groups compromised thousands of Magento-based stores to skim payment card data from checkout pages, in one of the largest skimming campaigns.",
            details = "Attackers injected skimming code into checkout pages, stealing card data as customers typed it. The case shows that e-commerce platforms are skimming targets at scale, and that checkout page integrity must be monitored.",
            lessons = listOf("Checkout page integrity must be monitored. Skimmers steal as customers type.", "E-commerce platforms are skimming targets at scale. Audit third-party scripts."),
            source = "Magecart / Magento (2019)"
        ),
        CaseStudy(
            id = "squarespace-hijack-2024",
            title = "Squarespace Domain Hijacks (2024)",
            year = "2024",
            tags = listOf("Hijacking", "Domains"),
            summary = "In 2024, attackers hijacked domains managed through Squarespace, after the Google Domains migration left accounts vulnerable to takeover, and used them for scams.",
            details = "Cryptocurrency-related domains were targeted and redirected to scam sites. Squarespace said it was working with owners to restore domains. The case shows that domain migrations are takeover risks, and that domain security is website security.",
            lessons = listOf("Domain migrations are takeover risks. Secure accounts during transitions.", "Domain security is website security. Hijacked domains become scam sites."),
            source = "Squarespace (2024)"
        ),
        CaseStudy(
            id = "weebly-breach-2016",
            title = "Weebly Breach (2016)",
            year = "2016",
            tags = listOf("Breach", "Website Builder"),
            summary = "Weebly suffered a breach in 2016 exposing usernames, emails, and hashed passwords of tens of millions of users, disclosed in 2016.",
            details = "Weebly disclosed the breach and reset passwords. The case shows that website builders hold credentials for millions of sites, and that builder breaches affect site owners broadly.",
            lessons = listOf("Website builders hold credentials for millions of sites.", "Builder breaches affect site owners broadly. Use unique passwords everywhere."),
            source = "Weebly (2016)"
        ),
        CaseStudy(
            id = "cloudflare-okta-2023",
            title = "Cloudflare Okta Breach (2023)",
            year = "2023",
            tags = listOf("Breach", "Identity"),
            summary = "Cloudflare suffered a breach in 2023 in which attackers used stolen Okta credentials to access its internal systems, in an attack linked to the Okta support breach.",
            details = "Cloudflare detected the intrusion and said no customer data was accessed. The case shows that identity breaches cascade to customers of identity providers, and that detection speed limits harm.",
            lessons = listOf("Identity breaches cascade to customers of identity providers.", "Detection speed limits harm. Monitor identity systems continuously."),
            source = "Cloudflare (2024)"
        ),
        CaseStudy(
            id = "hpe-midnight-blizzard-2024",
            title = "HPE Midnight Blizzard Breach (2024)",
            year = "2024",
            tags = listOf("Breach", "Nation-State"),
            summary = "Hewlett Packard Enterprise suffered a breach in 2024 in which the Midnight Blizzard group accessed its cloud email environment and took data.",
            details = "HPE disclosed the breach in early 2024 and said it was investigating with authorities. The case shows that technology vendors are nation-state targets, and that cloud email is a high-value target.",
            lessons = listOf("Technology vendors are nation-state targets.", "Cloud email is a high-value target. Protect it with hardware factors."),
            source = "Hewlett Packard Enterprise (2024)"
        ),
        CaseStudy(
            id = "microsoft-midnight-blizzard-2024",
            title = "Microsoft Midnight Blizzard Breach (2024)",
            year = "2024",
            tags = listOf("Breach", "Nation-State"),
            summary = "Microsoft suffered a breach in 2024 in which the Midnight Blizzard group accessed corporate email accounts of senior leaders and security teams, after a password spray attack.",
            details = "Microsoft said the group used password spraying against a legacy test account, then accessed emails. The case shows that legacy test accounts are attack paths, and that password spraying defeats weak passwords.",
            lessons = listOf("Legacy test accounts are attack paths. Remove or protect them.", "Password spraying defeats weak passwords. Enforce strong passwords and two-factor authentication."),
            source = "Microsoft (2024)"
        ),
        CaseStudy(
            id = "cisco-yanluowang-2022",
            title = "Cisco Yanluowang Attack (2022)",
            year = "2022",
            tags = listOf("Ransomware", "Technology"),
            summary = "Cisco suffered an attack in 2022 in which the Yanluowang group accessed its network through an employee's compromised Google account and stole data.",
            details = "Cisco said the attackers used voice phishing to trick an employee into accepting multi-factor prompts. The case shows that MFA fatigue defeats push-based authentication, and that personal accounts are paths to corporate networks.",
            lessons = listOf("MFA fatigue defeats push-based authentication. Use number matching and hardware keys.", "Personal accounts are paths to corporate networks. Separate them."),
            source = "Cisco (2022)"
        ),
        CaseStudy(
            id = "gigabyte-ran-som-2021",
            title = "Gigabyte Ransomware Attack (2021)",
            year = "2021",
            tags = listOf("Ransomware", "Hardware"),
            summary = "Gigabyte suffered a ransomware attack in 2021 in which the RansomEXX group stole data and threatened publication, after accessing internal systems.",
            details = "Gigabyte said it had isolated affected systems and was restoring operations. The case shows that hardware firms are ransomware targets, and that isolation is a containment choice.",
            lessons = listOf("Hardware firms are ransomware targets. Isolate affected systems quickly.", "Ransomware publication threats follow refusal. Prevention matters more."),
            source = "Gigabyte (2021)"
        ),
        CaseStudy(
            id = "intel-leak-2020",
            title = "Intel Data Leak (2020)",
            year = "2020",
            tags = listOf("Leak", "Technology"),
            summary = "Intel suffered a data leak in 2020 in which tens of gigabytes of confidential documents and source code were published online, after being taken from a resource centre.",
            details = "Intel said the data came from its Resource and Design Center. The case shows that partner resource centres hold confidential data, and that leaks of chip design data threaten product trust.",
            lessons = listOf("Partner resource centres hold confidential data. Protect them like internal systems.", "Chip design leaks threaten product trust, not only secrecy."),
            source = "Intel (2020)"
        ),
        CaseStudy(
            id = "nxp-breach-2025",
            title = "NXP Breach (2025)",
            year = "2025",
            tags = listOf("Breach", "Semiconductors"),
            summary = "NXP suffered a breach disclosed in 2025 in which attackers had long-term access to its network, in an intrusion linked to Chinese actors.",
            details = "NXP said the intrusion lasted years and that it had improved security after detection. The case shows that semiconductor firms face long-term espionage, and that long dwell times indicate weak detection.",
            lessons = listOf("Semiconductor firms face long-term espionage. Monitor for long dwell times.", "Long intrusions indicate weak detection. Invest in hunting, not only prevention."),
            source = "NXP Semiconductors (2025)"
        ),
        CaseStudy(
            id = "microchip-ransomware-2024",
            title = "Microchip Ransomware Attack (2024)",
            year = "2024",
            tags = listOf("Ransomware", "Semiconductors"),
            summary = "Microchip Technology suffered a ransomware attack in 2024 in which the Play group disrupted its manufacturing operations, after accessing internal systems.",
            details = "Microchip said the attack affected its ability to fulfil orders and that it was restoring systems. The case shows that chip makers are ransomware targets, and that manufacturing disruption affects supply chains.",
            lessons = listOf("Chip makers are ransomware targets. Their disruption affects supply chains.", "Manufacturing ransomware halts fulfilment. Segment operational systems."),
            source = "Microchip Technology (2024)"
        ),
        CaseStudy(
            id = "toshiba-darkside-2021",
            title = "Toshiba DarkSide Attack (2021)",
            year = "2021",
            tags = listOf("Ransomware", "Manufacturing"),
            summary = "Toshiba suffered a ransomware attack in 2021 in which the DarkSide group stole data from its European operations and threatened publication.",
            details = "Toshiba said a small amount of data was taken and that it was investigating. The case shows that Japanese manufacturers' European operations are ransomware targets, and that small data theft still warrants disclosure.",
            lessons = listOf("European operations of global manufacturers are ransomware targets.", "Small data theft still warrants disclosure and investigation."),
            source = "Toshiba (2021)"
        ),
        CaseStudy(
            id = "mitsubishi-electric-2020",
            title = "Mitsubishi Electric Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "Defence"),
            summary = "Mitsubishi Electric suffered a breach in 2020 in which attackers accessed its network and took defence-related information, in an intrusion linked to Chinese actors.",
            details = "The company said personal data of thousands of people was also exposed. The case shows that defence contractors are espionage targets, and that defence data theft has national security consequences.",
            lessons = listOf("Defence contractors are espionage targets. Their breaches have national consequences.", "Defence data theft accompanies personal data theft. Protect both."),
            source = "Mitsubishi Electric (2020)"
        )
    )
}
