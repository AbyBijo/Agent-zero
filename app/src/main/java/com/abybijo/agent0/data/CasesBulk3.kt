package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk cases, batch 3: 50 general cases, real incidents, public sources named. */
object CasesBulk3 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "jpmorgan-breach-2014",
            title = "JPMorgan Chase Breach (2014)",
            year = "2014",
            tags = listOf("Breach", "Credentials"),
            summary = "Attackers accessed JPMorgan Chase systems in 2014 and exposed contact information for a very large number of households and small businesses, after exploiting a server lacking two-factor authentication.",
            details = "The intrusion was discovered after the bank's security team noticed unusual activity. Investigators found the attackers had entered through a server without two-factor protection. The bank later invested heavily in security staffing and controls. The case is a textbook example of a single unprotected entry point.",
            lessons = listOf("Two-factor authentication must cover every entry point, not only the main ones. One gap is enough.", "Large institutions are attacked through ordinary weaknesses, not exotic ones."),
            source = "JPMorgan Chase (2014)"
        ),
        CaseStudy(
            id = "singhealth-breach-2018",
            title = "SingHealth Breach (2018)",
            year = "2018",
            tags = listOf("Breach", "Healthcare"),
            summary = "SingHealth, Singapore's largest healthcare group, suffered a breach in 2018 exposing personal data of millions of patients, including the Prime Minister's records, in a targeted attack.",
            details = "Attackers accessed the patient database through a compromised workstation and queried records repeatedly. A government inquiry found security lapses and slow response. The case shows that healthcare databases are targeted for high-value individuals as well as bulk data.",
            lessons = listOf("Healthcare databases attract targeted attackers. Monitor database queries, not only logins.", "Slow incident response multiplies breach harm. Escalate and contain quickly."),
            source = "Singapore Committee of Inquiry (2019)"
        ),
        CaseStudy(
            id = "epsilon-breach-2011",
            title = "Epsilon Breach (2011)",
            year = "2011",
            tags = listOf("Breach", "Email Marketing"),
            summary = "Epsilon, an email marketing firm, suffered a breach in 2011 exposing names and email addresses of customers of many major brands, enabling targeted phishing.",
            details = "Attackers accessed Epsilon's systems and took email addresses belonging to clients including banks and retailers. No financial data was taken, but the addresses enabled convincing phishing. The case shows that marketing vendors hold data worth stealing for phishing.",
            lessons = listOf("Email addresses in breaches enable phishing. Treat breach notices as phishing warnings.", "Marketing vendors hold customer data. Vet their security like any processor."),
            source = "Epsilon (2011)"
        ),
        CaseStudy(
            id = "ucla-health-breach-2015",
            title = "UCLA Health Breach (2015)",
            year = "2015",
            tags = listOf("Breach", "Healthcare"),
            summary = "UCLA Health suffered a breach in 2015 exposing personal and medical data of millions of patients, after attackers accessed its network over a long period.",
            details = "The health system disclosed the breach in 2015 and offered identity protection. The case was one of several large US healthcare breaches that year, showing that medical records are valuable for identity theft and fraud.",
            lessons = listOf("Medical records are valuable for identity theft. Protect health systems like financial systems.", "Long attacker dwell time in health networks indicates weak internal monitoring."),
            source = "UCLA Health (2015)"
        ),
        CaseStudy(
            id = "shamoon-aramco-2012",
            title = "Shamoon Attack on Saudi Aramco (2012)",
            year = "2012",
            tags = listOf("Malware", "Energy"),
            summary = "In 2012, the Shamoon malware attacked Saudi Aramco, wiping data on tens of thousands of computers and disrupting the oil company's operations for weeks.",
            details = "Shamoon overwrote hard drives, forcing Aramco to rebuild systems and temporarily return to manual processes. The attack is attributed to actors linked to Iran. The case shows that wiper malware is a distinct threat from ransomware: its goal is destruction, not payment.",
            lessons = listOf("Wiper malware destroys rather than ransoms. Backups must be offline and tested.", "Energy companies are geopolitical targets. Segment operational networks from office networks."),
            source = "Saudi Aramco (2012)"
        ),
        CaseStudy(
            id = "duqu-malware-2011",
            title = "Duqu Malware (2011)",
            year = "2011",
            tags = listOf("Malware", "Espionage"),
            summary = "In 2011, researchers discovered Duqu, a malware toolkit related to Stuxnet that collected intelligence from industrial organisations, apparently as preparation for further attacks.",
            details = "Duqu shared code with Stuxnet but focused on reconnaissance: keylogging and document theft from industrial firms. It was discovered by CrySyS Lab in Hungary. The case shows that reconnaissance malware precedes destructive attacks, and that industrial targets face staged campaigns.",
            lessons = listOf("Reconnaissance malware precedes destructive attacks. Detect and respond to the first stage.", "Industrial organisations face staged campaigns. Monitor for intelligence-collection behaviour."),
            source = "CrySyS Lab (2011)"
        ),
        CaseStudy(
            id = "myspace-breach-2013",
            title = "Myspace Breach (2013)",
            year = "2013",
            tags = listOf("Breach", "Credentials"),
            summary = "Myspace suffered a breach in 2013 exposing emails, usernames, and weakly hashed passwords of hundreds of millions of accounts, disclosed in 2016.",
            details = "The data surfaced for sale in 2016, revealing the scale of the 2013 incident. Old accounts users had forgotten became live risks, because reused passwords still worked elsewhere. The case shows that forgotten accounts are still attack surface.",
            lessons = listOf("Forgotten accounts are still attack surface. Close or secure old accounts.", "Old breaches resurface years later. Unique passwords limit the damage."),
            source = "Myspace / Time Inc. (2016)"
        ),
        CaseStudy(
            id = "collection-one-2019",
            title = "Collection #1 Data Dump (2019)",
            year = "2019",
            tags = listOf("Breach", "Credentials"),
            summary = "In 2019, researcher Troy Hunt reported Collection #1, a massive aggregation of breached credentials from many earlier incidents, circulating as a single archive.",
            details = "Collection #1 combined billions of records from many breaches into one searchable set, making credential stuffing far easier. Hunt's Have I Been Pwned service let users check exposure. The case shows that breaches compound: old data gains new value when aggregated.",
            lessons = listOf("Breached data gains value when aggregated. Check exposure and change reused credentials.", "Old breaches do not expire. Aggregation makes them newly dangerous."),
            source = "Troy Hunt / Have I Been Pwned (2019)"
        ),
        CaseStudy(
            id = "dubsmash-breach-2018",
            title = "Dubsmash Breach (2018)",
            year = "2018",
            tags = listOf("Breach", "Credentials"),
            summary = "Dubsmash suffered a breach in 2018 exposing usernames, emails, and hashed passwords of tens of millions of users, disclosed in 2019.",
            details = "The data appeared for sale in 2019 as part of a larger set of breaches from the same period. Dubsmash reset passwords and improved security. The case is a reminder that smaller apps hold the same credential risks as large ones, and that reuse is the real multiplier.",
            lessons = listOf("Smaller apps carry the same credential risk as large ones.", "Reuse turns a small app's breach into access to your important accounts."),
            source = "Dubsmash (2019)"
        ),
        CaseStudy(
            id = "500px-breach-2018",
            title = "500px Breach (2018)",
            year = "2018",
            tags = listOf("Breach", "Credentials"),
            summary = "500px suffered a breach in 2018 exposing names, emails, and hashed passwords of millions of users, disclosed in 2019.",
            details = "The photography community disclosed the breach after learning of it in 2019, and forced password resets. The case shows that niche communities are breached too, and that disclosure timing and password resets are the standard response.",
            lessons = listOf("Niche communities are breached too. Protect every account, not only the famous ones.", "After a breach, change the password and any reused copies elsewhere."),
            source = "500px (2019)"
        ),
        CaseStudy(
            id = "wattpad-breach-2020",
            title = "Wattpad Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "Credentials"),
            summary = "Wattpad suffered a breach in 2020 exposing emails, usernames, and hashed passwords of tens of millions of users, with the data later appearing for sale.",
            details = "The writing platform disclosed the breach after reports that user data was being sold. Wattpad reset passwords and advised users to change reused passwords elsewhere. The case is a standard example of a large content platform breach with credential-stuffing consequences.",
            lessons = listOf("Content platforms hold credentials worth stealing. Protect them like any account.", "After any breach, assume reuse is the attacker's next step and change reused passwords."),
            source = "Wattpad (2020)"
        ),
        CaseStudy(
            id = "zynga-breach-2019",
            title = "Zynga Breach (2019)",
            year = "2019",
            tags = listOf("Breach", "Credentials"),
            summary = "Zynga suffered a breach in 2019 exposing names, emails, and hashed passwords of hundreds of millions of players of games such as Words With Friends.",
            details = "The gaming company disclosed the breach after a hacker claimed to have accessed player data. Zynga reset passwords for affected accounts. The case shows that gaming accounts, often treated as low-value, hold credentials reused on high-value accounts.",
            lessons = listOf("Gaming accounts hold reused credentials. Treat them as seriously as email.", "Breach notices deserve action even for 'low-value' accounts."),
            source = "Zynga (2019)"
        ),
        CaseStudy(
            id = "tokopedia-breach-2020",
            title = "Tokopedia Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "E-commerce"),
            summary = "Tokopedia, Indonesia's large e-commerce platform, suffered a breach in 2020 exposing names, emails, and hashed passwords of tens of millions of users.",
            details = "The data appeared for sale in 2020. Tokopedia said passwords were hashed and payment data was not affected, and advised password changes. The case shows that e-commerce breaches in large markets receive global attention and that payment separation limits harm.",
            lessons = listOf("Separate payment data from account data. Separation limits breach harm.", "E-commerce accounts deserve unique passwords and two-factor authentication."),
            source = "Tokopedia (2020)"
        ),
        CaseStudy(
            id = "bigbasket-breach-2020",
            title = "BigBasket Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "E-commerce"),
            summary = "BigBasket, India's online grocer, suffered a breach in 2020 exposing names, emails, addresses, and hashed passwords of tens of millions of users.",
            details = "The data was reported for sale in late 2020. BigBasket said it was investigating with authorities. The case shows that grocery and delivery accounts hold full addresses and phone numbers, making them useful for phishing and identity fraud.",
            lessons = listOf("Delivery accounts hold addresses and phone numbers. Protect them against phishing use.", "Addresses in breaches enable targeted phishing. Verify unexpected messages."),
            source = "BigBasket (2020)"
        ),
        CaseStudy(
            id = "juspay-breach-2020",
            title = "Juspay Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "Payments"),
            summary = "Juspay, an Indian payment processor, suffered a breach in 2020 exposing masked card data and personal details of millions of users, after an unrecycled server was compromised.",
            details = "The company said full card numbers were not exposed, but masked card data and contact details were. Juspay disclosed the incident in early 2021. The case shows that payment processors are high-value targets and that masked data still aids phishing.",
            lessons = listOf("Masked card data still aids phishing. Treat partial payment data as sensitive.", "Payment processors must protect every server, including old and unrecycled ones."),
            source = "Juspay (2021)"
        ),
        CaseStudy(
            id = "upstox-breach-2021",
            title = "Upstox Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Finance"),
            summary = "Upstox, an Indian brokerage, suffered a breach in 2021 exposing contact details and account data of millions of users, after a third-party data warehouse was compromised.",
            details = "Upstox said funds and securities were safe and that it had enhanced security. The case shows that financial apps are targeted for identity data as much as money, and that third-party warehouses are part of the attack surface.",
            lessons = listOf("Financial accounts are targeted for identity data, not only money.", "Third-party data stores are part of your attack surface. Vet them."),
            source = "Upstox (2021)"
        ),
        CaseStudy(
            id = "mobikwik-breach-2021",
            title = "MobiKwik Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Finance"),
            summary = "MobiKwik, an Indian wallet company, suffered an alleged breach in 2021 exposing personal and financial details of millions of users, which the company initially denied.",
            details = "A researcher published a database sample and the data circulated for sale. MobiKwik initially denied a breach, then investigated. The case shows the damage of denial: users cannot protect themselves from a breach the company will not acknowledge.",
            lessons = listOf("Denial does not protect users. Acknowledgement lets users act.", "Wallet apps hold financial identity. Protect them with two-factor authentication."),
            source = "MobiKwik (2021)"
        ),
        CaseStudy(
            id = "dominos-india-breach-2021",
            title = "Domino's India Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Food Delivery"),
            summary = "Domino's India suffered a breach in 2021 exposing names, emails, phone numbers, and order details of millions of customers.",
            details = "The data appeared for sale in 2021. The company said financial data was not affected. The case shows that food delivery accounts hold phone numbers and addresses that enable phishing and SIM-swap targeting.",
            lessons = listOf("Food delivery accounts hold phone numbers and addresses. Treat them as identity data.", "Phone numbers in breaches enable SIM-swap attempts. Protect carrier accounts."),
            source = "Jubilant FoodWorks / Domino's India (2021)"
        ),
        CaseStudy(
            id = "spicejet-ransomware-2023",
            title = "SpiceJet Ransomware Attack (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Aviation"),
            summary = "SpiceJet suffered a ransomware attack in 2023 that disrupted flight operations and delayed departures, after attackers accessed its systems.",
            details = "The airline said the attack affected some systems and caused delays, while flights continued with manual processes. The case shows that ransomware harm is operational, not only data theft, and that aviation operations need manual fallbacks.",
            lessons = listOf("Ransomware harm is operational: delays and disruption, not only data theft.", "Critical operations need manual fallbacks for system outages."),
            source = "SpiceJet (2023)"
        ),
        CaseStudy(
            id = "aiims-ransomware-2022",
            title = "AIIMS Ransomware Attack (2022)",
            year = "2022",
            tags = listOf("Ransomware", "Healthcare"),
            summary = "AIIMS New Delhi suffered a ransomware attack in 2022 that crippled hospital servers for weeks, forcing a return to manual patient registration and record-keeping.",
            details = "The attack affected the hospital's primary servers and patient data systems. Services continued manually while systems were restored from backups. The case shows that healthcare ransomware endangers care itself, and that backups and manual processes are safety measures.",
            lessons = listOf("Healthcare ransomware endangers care, not only data. Backups are patient safety.", "Hospitals need tested manual fallbacks for system outages."),
            source = "AIIMS New Delhi (2022)"
        ),
        CaseStudy(
            id = "jbs-ransomware-2021",
            title = "JBS Ransomware Attack (2021)",
            year = "2021",
            tags = listOf("Ransomware", "Supply Chain"),
            summary = "JBS, the world's largest meat processor, suffered a ransomware attack in 2021 that shut plants in several countries and threatened food supply chains.",
            details = "The attack, attributed to a Russian-linked group, disrupted slaughter operations. JBS said it paid a ransom to prevent further disruption. The case shows that food supply chains are critical infrastructure and that ransomware can have physical consequences.",
            lessons = listOf("Food supply chains are critical infrastructure. Ransomware there has physical consequences.", "Ransom payment decisions are made under operational pressure, which is why prevention matters."),
            source = "JBS (2021)"
        ),
        CaseStudy(
            id = "kaseya-vsa-2021",
            title = "Kaseya VSA Supply-Chain Attack (2021)",
            year = "2021",
            tags = listOf("Ransomware", "Supply Chain"),
            summary = "In 2021, attackers exploited Kaseya's VSA remote-management software to push ransomware to managed service providers and their customers in many countries.",
            details = "The REvil group used Kaseya's trusted update channel to distribute ransomware to downstream businesses, including shops and clinics. Kaseya later issued a patch and a decryptor became available. The case is the classic managed-service-provider supply-chain attack.",
            lessons = listOf("Trusted update channels are attack channels. Vet and monitor management tools.", "One provider's compromise becomes thousands of customers' incidents."),
            source = "Kaseya (2021)"
        ),
        CaseStudy(
            id = "caesars-ransomware-2023",
            title = "Caesars Ransomware Attack (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Hospitality"),
            summary = "Caesars Entertainment suffered a ransomware attack in 2023 in which attackers used social engineering on an IT support vendor to gain access, then stole loyalty-program data.",
            details = "Caesars disclosed that it had paid a ransom. The attack began with a social-engineering call to an outsourced IT vendor. The case shows that vendor support staff are an attack path, and that social engineering defeats technical controls.",
            lessons = listOf("Vendor support staff are an attack path. Verify identity through known channels.", "Social engineering defeats technical controls. Train vendors, not only employees."),
            source = "Caesars Entertainment (2023)"
        ),
        CaseStudy(
            id = "mgm-resorts-ransomware-2023",
            title = "MGM Resorts Ransomware Attack (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Hospitality"),
            summary = "MGM Resorts suffered a ransomware attack in 2023 that shut down hotel systems, slot machines, and websites for days, after attackers used social engineering to gain access.",
            details = "The Scattered Spider group was linked to the attack, which began with a call to the IT help desk. MGM refused to pay and restored systems over days at large cost. The case shows the operational cost of refusing ransom, and the help desk as an attack path.",
            lessons = listOf("Help desks are attack paths. Identity verification there is a security control.", "Refusing ransom has operational cost. Prevention is cheaper than either choice."),
            source = "MGM Resorts (2023)"
        ),
        CaseStudy(
            id = "santander-breach-2024",
            title = "Santander Breach (2024)",
            year = "2024",
            tags = listOf("Breach", "Finance"),
            summary = "Santander suffered a breach in 2024 exposing customer and employee data in several countries, after attackers accessed a third-party database.",
            details = "The bank said the breach affected customers in Spain, Chile, and Uruguay, and that transactional data was not affected. The case shows that banks' third-party databases are part of the attack surface, and that geographic scope complicates notification.",
            lessons = listOf("Third-party databases holding bank data are bank attack surface.", "Breach scope across countries complicates notification. Plan for it."),
            source = "Banco Santander (2024)"
        ),
        CaseStudy(
            id = "snowflake-customer-breaches-2024",
            title = "Snowflake Customer Breaches (2024)",
            year = "2024",
            tags = listOf("Breach", "Cloud"),
            summary = "In 2024, attackers accessed customer instances of Snowflake's cloud data platform using stolen credentials, affecting companies including Ticketmaster and Santander.",
            details = "Snowflake said the accesses used stolen credentials and that customers had not enabled multi-factor authentication on affected accounts. The case shows that cloud platforms are only as secure as customer credential practices, and that MFA on cloud consoles is essential.",
            lessons = listOf("Cloud consoles need multi-factor authentication. Stolen passwords alone must not suffice.", "Cloud security is shared: the platform and the customer both hold responsibility."),
            source = "Snowflake (2024)"
        ),
        CaseStudy(
            id = "national-public-data-breach-2024",
            title = "National Public Data Breach (2024)",
            year = "2024",
            tags = listOf("Breach", "Data Broker"),
            summary = "National Public Data, a background-check data broker, suffered a breach in 2024 exposing Social Security numbers and personal details of a very large number of Americans.",
            details = "The data appeared for sale in 2024 and the company later confirmed the breach in a filing. The case shows that data brokers hold sensitive data on people who never chose them as a provider, and that breach harm is magnified for Social Security numbers.",
            lessons = listOf("Data brokers hold your data without your choice. Freeze credit and monitor identity.", "Social Security numbers in breaches enable long-term identity theft. Protect them accordingly."),
            source = "National Public Data (2024)"
        ),
        CaseStudy(
            id = "att-breach-2024",
            title = "AT&T Breach (2024)",
            year = "2024",
            tags = listOf("Breach", "Telecom"),
            summary = "AT&T suffered a breach in 2024 exposing call and text metadata of nearly all its cellular customers, after attackers accessed a third-party cloud platform.",
            details = "AT&T said the data, from a third-party cloud workspace, included numbers called and texted but not message content. The case shows that metadata alone is revealing, and that telecom metadata is sensitive even without content.",
            lessons = listOf("Metadata is revealing even without content. Who you contact is sensitive.", "Third-party cloud workspaces holding telecom data need strict access controls."),
            source = "AT&T (2024)"
        ),
        CaseStudy(
            id = "ascension-ransomware-2024",
            title = "Ascension Ransomware Attack (2024)",
            year = "2024",
            tags = listOf("Ransomware", "Healthcare"),
            summary = "Ascension, a large US hospital system, suffered a ransomware attack in 2024 that disrupted clinical operations for weeks, forcing diversions and manual processes.",
            details = "The Black Basta group was linked to the attack. Hospitals diverted ambulances and used paper records while systems were restored. The case shows that healthcare ransomware disrupts care across whole systems, not single hospitals.",
            lessons = listOf("Healthcare ransomware disrupts care across whole systems. Manual fallbacks must be tested.", "Hospital systems need segmented networks so one compromise does not spread system-wide."),
            source = "Ascension (2024)"
        ),
        CaseStudy(
            id = "flame-malware-2012",
            title = "Flame Malware (2012)",
            year = "2012",
            tags = listOf("Malware", "Espionage"),
            summary = "In 2012, researchers revealed Flame, a sophisticated espionage toolkit that had operated undetected for years, collecting documents, audio, and screenshots from infected machines.",
            details = "Flame was discovered by Kaspersky Lab during an investigation into another malware family. It used forged Microsoft certificates to spread via Windows Update. The case shows that state-level toolkits can hide for years and that certificate trust is a critical control.",
            lessons = listOf("Sophisticated malware can hide for years. Assume long dwell times in targeted attacks.", "Certificate trust underpins updates. Protect update channels rigorously."),
            source = "Kaspersky Lab (2012)"
        ),
        CaseStudy(
            id = "rockstar-leak-2022",
            title = "Rockstar Games Leak (2022)",
            year = "2022",
            tags = listOf("Leak", "Insider Access"),
            summary = "Rockstar Games suffered a leak in 2022 in which early footage of the unreleased Grand Theft Auto VI was published online, after an attacker accessed internal systems.",
            details = "The leaker, later linked to the Lapsus group, published dozens of development videos. Rockstar confirmed the intrusion and said development was not derailed. The case shows that unreleased creative work is a target, and that internal access controls matter for studios.",
            lessons = listOf("Unreleased work is a target. Internal access needs the same controls as customer data.", "Leaks of unfinished work cause real commercial and creative harm."),
            source = "Rockstar Games (2022)"
        ),
        CaseStudy(
            id = "samsung-lapsus-2022",
            title = "Samsung Lapsus Breach (2022)",
            year = "2022",
            tags = listOf("Breach", "Source Code"),
            summary = "Samsung suffered a breach in 2022 in which the Lapsus group stole source code and published it, after accessing internal systems.",
            details = "Samsung confirmed that source code relating to Galaxy devices was taken, but said customer data was not affected. The case shows that source code theft is a distinct harm from customer data theft, and that extortion groups target large technology firms systematically.",
            lessons = listOf("Source code theft is a distinct harm. Protect code repositories like customer data.", "Extortion groups target large firms systematically. Assume you are in scope."),
            source = "Samsung (2022)"
        ),
        CaseStudy(
            id = "pegasus-project-2021",
            title = "Pegasus Project (2021)",
            year = "2021",
            tags = listOf("Spyware", "Surveillance"),
            summary = "In 2021, the Pegasus Project investigation revealed that NSO Group's Pegasus spyware had been used against journalists, activists, and officials in many countries.",
            details = "The investigation, based on a leaked list of phone numbers, found forensic evidence of Pegasus on devices of targets. NSO said its tools were for lawful use against crime and terrorism. The case shows that commercial spyware is a real threat model for high-risk individuals.",
            lessons = listOf("Commercial spyware is a real threat model for journalists and activists.", "High-risk individuals need device hygiene and forensic support, not only passwords."),
            source = "Pegasus Project / Forbidden Stories (2021)"
        ),
        CaseStudy(
            id = "whatsapp-spyware-2019",
            title = "WhatsApp Spyware Attack (2019)",
            year = "2019",
            tags = listOf("Spyware", "Messaging"),
            summary = "In 2019, WhatsApp revealed that attackers had exploited a vulnerability to install spyware on phones through missed calls, targeting a small number of high-risk users.",
            details = "The attack used a buffer overflow in WhatsApp's calling feature, requiring no user interaction. WhatsApp sued NSO Group over the attack. The case shows that missed calls can be attack vectors, and that zero-click attacks defeat user vigilance.",
            lessons = listOf("Zero-click attacks defeat vigilance. Keep messaging apps updated promptly.", "Missed calls can be attack vectors. Update, do not only avoid answering."),
            source = "WhatsApp / Meta (2019)"
        ),
        CaseStudy(
            id = "zoom-security-2020",
            title = "Zoom Security Issues (2020)",
            year = "2020",
            tags = listOf("Privacy", "Video Conferencing"),
            summary = "In 2020, Zoom faced scrutiny over security and privacy issues, including uninvited guests joining meetings and misleading claims about encryption, as usage surged during the pandemic.",
            details = "Zoom-bombing incidents disrupted meetings, and researchers found encryption claims overstated. Zoom responded with security improvements, waiting rooms, and passwords by default. The case shows that rapid growth exposes security debt, and that default settings matter.",
            lessons = listOf("Default settings matter. Waiting rooms and passwords should be defaults, not options.", "Rapid growth exposes security debt. Scale security with scale."),
            source = "Zoom (2020)"
        ),
        CaseStudy(
            id = "lastpass-breach-2022",
            title = "LastPass Breach (2022)",
            year = "2022",
            tags = listOf("Breach", "Password Manager"),
            summary = "LastPass suffered a breach in 2022 in which attackers accessed encrypted vault data after compromising a developer's home computer, raising fears about vault decryption.",
            details = "Attackers used information from an earlier incident to target a developer, then accessed cloud storage containing vault backups. LastPass said vaults were encrypted with users' master passwords. The case shows that password managers are high-value targets and that master password strength matters.",
            lessons = listOf("Password managers are high-value targets. Use a strong, unique master password.", "Developer machines are attack paths to cloud data. Protect them accordingly."),
            source = "LastPass (2022)"
        ),
        CaseStudy(
            id = "dropbox-sign-breach-2024",
            title = "Dropbox Sign Breach (2024)",
            year = "2024",
            tags = listOf("Breach", "Credentials"),
            summary = "Dropbox Sign suffered a breach in 2024 exposing names, emails, and hashed passwords of users of the electronic signature service, after attackers accessed its production environment.",
            details = "Dropbox said the breach affected Dropbox Sign users, not the main Dropbox service, and reset passwords and API keys. The case shows that acquired products carry their own attack surface, and that API keys must be rotated after breaches.",
            lessons = listOf("Acquired products carry their own attack surface. Vet them separately.", "After a breach, rotate API keys as well as passwords."),
            source = "Dropbox (2024)"
        ),
        CaseStudy(
            id = "loandepot-ransomware-2024",
            title = "loanDepot Ransomware Attack (2024)",
            year = "2024",
            tags = listOf("Ransomware", "Finance"),
            summary = "loanDepot, a US mortgage lender, suffered a ransomware attack in 2024 that exposed personal data of millions of customers and disrupted loan processing.",
            details = "The company disclosed the attack and later confirmed data exposure. Mortgage processing was disrupted while systems were restored. The case shows that mortgage data is sensitive financial identity, and that ransomware disrupts transactions, not only data.",
            lessons = listOf("Mortgage data is sensitive financial identity. Protect it accordingly.", "Ransomware disrupts transactions. Business continuity plans must cover it."),
            source = "loanDepot (2024)"
        ),
        CaseStudy(
            id = "tmobile-breach-2023",
            title = "T-Mobile Breach (2023)",
            year = "2023",
            tags = listOf("Breach", "Telecom"),
            summary = "T-Mobile suffered a breach in 2023 exposing personal data of tens of millions of customers, after attackers accessed systems through an application vulnerability.",
            details = "T-Mobile disclosed the breach in early 2023 and said it had addressed the vulnerability. The case followed several earlier T-Mobile breaches, showing that repeated incidents indicate systemic issues, not bad luck.",
            lessons = listOf("Repeated breaches indicate systemic issues. Fix root causes, not only incidents.", "Telecom accounts hold identity data. Protect them with account PINs and two-factor authentication."),
            source = "T-Mobile (2023)"
        ),
        CaseStudy(
            id = "synnovis-ransomware-2024",
            title = "Synnovis Ransomware Attack (2024)",
            year = "2024",
            tags = listOf("Ransomware", "Healthcare"),
            summary = "Synnovis, a pathology provider for London hospitals, suffered a ransomware attack in 2024 that disrupted blood testing and delayed thousands of operations and appointments.",
            details = "The Qilin group was linked to the attack. Hospitals cancelled procedures and appealed for blood donations as testing capacity fell. The case shows that pathology and laboratory providers are critical to hospital operations.",
            lessons = listOf("Laboratory providers are critical to hospitals. Their outages cancel care.", "Healthcare supply chains need continuity plans for provider outages."),
            source = "Synnovis / NHS England (2024)"
        ),
        CaseStudy(
            id = "boeing-ransomware-2023",
            title = "Boeing Ransomware Attack (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Aviation"),
            summary = "Boeing suffered a ransomware attack in 2023 in which the LockBit group published stolen data after Boeing's parts and distribution business was affected.",
            details = "Boeing said the attack affected its parts business and that flight safety was not affected. The case shows that even defence and aviation giants are ransomware targets, and that parts supply chains are vulnerable.",
            lessons = listOf("Aviation parts supply chains are ransomware targets. Segment them from flight systems.", "Flight safety separation from business systems is a control worth maintaining."),
            source = "Boeing (2023)"
        ),
        CaseStudy(
            id = "clorox-ransomware-2023",
            title = "Clorox Ransomware Attack (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Manufacturing"),
            summary = "Clorox suffered a ransomware attack in 2023 that disrupted production and distribution, causing product shortages and large financial losses.",
            details = "The attack forced Clorox to take systems offline and revert to manual processes. The company reported major financial impact over several quarters. The case shows that manufacturing ransomware has shelf-level consequences.",
            lessons = listOf("Manufacturing ransomware reaches store shelves. Operational resilience is financial resilience.", "Manual production fallbacks must be planned before an attack, not improvised during one."),
            source = "Clorox (2023)"
        ),
        CaseStudy(
            id = "johnson-controls-ransomware-2023",
            title = "Johnson Controls Ransomware Attack (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Building Systems"),
            summary = "Johnson Controls suffered a ransomware attack in 2023 that disrupted its building systems and security products business, after attackers accessed internal systems.",
            details = "The company disclosed the attack and said it was restoring systems. The case shows that building automation and security product vendors are themselves targets, and that their compromise affects customers' physical security.",
            lessons = listOf("Building system vendors are targets. Their compromise affects customers' physical security.", "Security product vendors must hold themselves to higher security standards."),
            source = "Johnson Controls (2023)"
        ),
        CaseStudy(
            id = "insomniac-ransomware-2023",
            title = "Insomniac Games Ransomware Attack (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Gaming"),
            summary = "Insomniac Games suffered a ransomware attack in 2023 in which the Rhysida group published stolen data, including unreleased game details and employee personal information.",
            details = "The studio refused to pay, and the group published the data, including Wolverine game materials and employee passports. The case shows that ransomware harm includes employee personal data, not only company secrets.",
            lessons = listOf("Ransomware exposes employee personal data, not only company secrets.", "Refusing ransom has publication consequences. Prevention and segmentation matter more."),
            source = "Insomniac Games / Sony (2023)"
        ),
        CaseStudy(
            id = "fidelity-national-ransomware-2023",
            title = "Fidelity National Financial Ransomware Attack (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Finance"),
            summary = "Fidelity National Financial suffered a ransomware attack in 2023 that disrupted title insurance and escrow services, delaying real estate closings.",
            details = "The attack forced the company to take systems offline, and home buyers faced delayed closings. The case shows that title and escrow services are critical to real estate transactions, and that ransomware there has housing consequences.",
            lessons = listOf("Title and escrow services are critical to housing transactions. Their outages delay homes.", "Financial transaction providers need continuity plans for ransomware outages."),
            source = "Fidelity National Financial (2023)"
        ),
        CaseStudy(
            id = "mr-cooper-breach-2023",
            title = "Mr. Cooper Breach (2023)",
            year = "2023",
            tags = listOf("Breach", "Finance"),
            summary = "Mr. Cooper, a US mortgage servicer, suffered a breach in 2023 exposing personal data of millions of customers, after attackers accessed its systems.",
            details = "The company disclosed the breach and said it was notifying affected customers. Mortgage servicers hold full financial identity, making their breaches especially sensitive. The case shows that servicers, not only lenders, are targets.",
            lessons = listOf("Mortgage servicers hold full financial identity. Protect them like lenders.", "Servicer breaches expose customers who did not choose the servicer."),
            source = "Mr. Cooper Group (2023)"
        ),
        CaseStudy(
            id = "circleci-breach-2022",
            title = "CircleCI Breach (2022)",
            year = "2022",
            tags = listOf("Breach", "Developer Tools"),
            summary = "CircleCI suffered a breach in 2022 in which attackers accessed customer environment data, including secrets and tokens, after compromising an employee's laptop.",
            details = "CircleCI advised all customers to rotate secrets stored in the platform. The case shows that CI/CD platforms hold the keys to production, and that a single employee laptop compromise can expose many customers' secrets.",
            lessons = listOf("CI/CD platforms hold production secrets. Rotate them after any platform breach.", "Employee laptops are paths to customer secrets. Protect them with endpoint controls."),
            source = "CircleCI (2023)"
        ),
        CaseStudy(
            id = "mailchimp-breach-2023",
            title = "Mailchimp Breach (2023)",
            year = "2023",
            tags = listOf("Breach", "Social Engineering"),
            summary = "Mailchimp suffered a breach in 2023 in which attackers used social engineering on employees to access an internal tool, then targeted cryptocurrency companies' mailing lists.",
            details = "Attackers accessed audience data for a set of accounts, including crypto firms, and used it for phishing. Mailchimp said it had notified affected users. The case shows that mailing platforms are phishing launchpads when compromised.",
            lessons = listOf("Mailing platforms are phishing launchpads. Protect their internal tools strictly.", "Social engineering on employees defeats technical controls. Train and verify."),
            source = "Mailchimp / Intuit (2023)"
        ),
        CaseStudy(
            id = "western-digital-breach-2023",
            title = "Western Digital Breach (2023)",
            year = "2023",
            tags = listOf("Breach", "Storage"),
            summary = "Western Digital suffered a breach in 2023 in which attackers accessed systems and stole data, disrupting its My Cloud services for weeks.",
            details = "The company took My Cloud services offline while investigating, leaving customers unable to access their own stored data. The case shows that cloud storage outages lock users out of their own files, and that local backups matter.",
            lessons = listOf("Cloud storage outages lock you out of your own files. Keep local backups.", "Storage vendors are targets. Encrypt sensitive data before uploading."),
            source = "Western Digital (2023)"
        ),
        CaseStudy(
            id = "dish-network-ransomware-2023",
            title = "Dish Network Ransomware Attack (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Telecom"),
            summary = "Dish Network suffered a ransomware attack in 2023 that disrupted television, wireless, and customer service systems for weeks, and exposed employee data.",
            details = "The Black Basta group was linked to the attack. Customers faced outages and long support waits while systems were restored. The case shows that telecom and media ransomware disrupts service at scale, not only data.",
            lessons = listOf("Telecom ransomware disrupts service at scale. Continuity plans must cover weeks, not days.", "Employee data in breaches needs the same notification care as customer data."),
            source = "Dish Network (2023)"
        )
    )
}
