package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk cases, batch 1: 50 general cases, real incidents, public sources named. */
object CasesBulk1 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "ebay-breach-2014",
            title = "eBay Breach (2014)",
            year = "2014",
            tags = listOf("Breach", "Credentials"),
            summary = "eBay suffered a breach in 2014 exposing names, addresses, and encrypted passwords of a very large number of users, after attackers compromised employee credentials.",
            details = "Attackers obtained employee logins and accessed eBay's corporate network for months before detection. eBay asked all users to change passwords. The breach showed that employee credentials are a path to customer data, and that long dwell time multiplies harm.",
            lessons = listOf("Employee credentials need multi-factor authentication and monitoring, not only passwords.", "Long undetected access turns a breach into a large breach. Detect faster."),
            source = "eBay (2014)"
        ),
        CaseStudy(
            id = "google-aurora-2010",
            title = "Operation Aurora Against Google (2010)",
            year = "2010",
            tags = listOf("Nation-State", "Spear Phishing"),
            summary = "In 2010, Google revealed that it and other companies had been targeted by a sophisticated attack, later attributed to China, using spear phishing and a browser vulnerability.",
            details = "The attackers used targeted emails and a zero-day vulnerability to access corporate systems and steal intellectual property, including source code. Google's response included a public disclosure and a change to its China operations. The attack defined the modern targeted-intrusion model.",
            lessons = listOf("Targeted attacks begin with targeted messages. Verify unexpected links and attachments, even from known senders.", "Public disclosure of a major intrusion can be a security decision, not only a PR one."),
            source = "Google (2010)"
        ),
        CaseStudy(
            id = "dropbox-breach-2012",
            title = "Dropbox Breach (2012)",
            year = "2012",
            tags = listOf("Breach", "Credentials"),
            summary = "Dropbox suffered a breach in 2012 exposing email addresses and hashed passwords of tens of millions of users, disclosed years later.",
            details = "The stolen data surfaced in 2016, revealing that the 2012 incident had been far larger than initially understood. Dropbox then forced password resets and expanded two-factor authentication. The delay between breach and disclosure left users exposed for years.",
            lessons = listOf("Reuse of passwords across services turns one breach into many. Use unique passwords everywhere.", "Disclose breaches when scope is understood. Delayed disclosure leaves users unprotected."),
            source = "Dropbox (2016)"
        ),
        CaseStudy(
            id = "choicepoint-breach-2005",
            title = "ChoicePoint Breach (2005)",
            year = "2005",
            tags = listOf("Data Broker", "Identity Theft"),
            summary = "Data broker ChoicePoint sold personal data of more than 160,000 people to criminals posing as legitimate businesses in 2005, in one of the first major data-broker breaches.",
            details = "The criminals created fake companies and bought access to ChoicePoint's databases, then used the data for identity theft. The US Federal Trade Commission fined ChoicePoint and required security reforms. The case introduced the public to the data-broker problem: companies holding your data that you never dealt with.",
            lessons = listOf("Data brokers hold your data without your consent. Their security is your risk.", "Verify customers before selling sensitive data. Identity checks protect the data subjects, not only the seller."),
            source = "US FTC (2006)"
        ),
        CaseStudy(
            id = "aol-search-leak-2006",
            title = "AOL Search Data Leak (2006)",
            year = "2006",
            tags = listOf("Privacy", "Anonymisation"),
            summary = "In 2006, AOL released search logs of hundreds of thousands of users for research, believing them anonymised, but users were quickly identified from their searches alone.",
            details = "AOL replaced usernames with numbers, but search histories themselves identified people: one user's searches revealed her name, location, and life. Journalists identified her within days, and AOL apologised and withdrew the data. The case became the classic proof that anonymisation by removing names does not work.",
            lessons = listOf("Search history is identifying data. Treat it as personal data, not anonymous data.", "Removing names does not anonymise data. Patterns identify people."),
            source = "New York Times (2006)"
        ),
        CaseStudy(
            id = "mirai-dyn-2016",
            title = "Mirai Botnet and Dyn Attack (2016)",
            year = "2016",
            tags = listOf("IoT", "Botnet", "DDoS"),
            summary = "In 2016, the Mirai botnet, built from compromised internet-connected cameras and routers, launched a massive denial-of-service attack against DNS provider Dyn, disrupting major websites.",
            details = "Mirai infected devices that still used factory default passwords, then used them to flood Dyn with traffic. Twitter, Netflix, and other sites became unreachable for hours. The attack showed that insecure consumer devices are not only a risk to their owners, but to the internet itself.",
            lessons = listOf("Change default passwords on every connected device. Factory defaults are public knowledge.", "An insecure device you own can attack others. Securing it is a shared responsibility."),
            source = "Dyn and FBI reporting (2016)"
        ),
        CaseStudy(
            id = "shadow-brokers-2017",
            title = "Shadow Brokers NSA Tools Leak (2017)",
            year = "2017",
            tags = listOf("Nation-State", "Tools Leak"),
            summary = "Beginning in 2016, a group calling itself the Shadow Brokers leaked hacking tools stolen from the NSA, including the EternalBlue exploit later used in WannaCry.",
            details = "The leaked tools, developed at great expense for intelligence use, became available to criminals worldwide. EternalBlue powered WannaCry and NotPetya, causing billions in damage. The leak showed that even the most secret tools can escape, and that stockpiled vulnerabilities endanger everyone once leaked.",
            lessons = listOf("Stockpiled vulnerabilities are a shared risk: a flaw kept secret for offence can be leaked and used against anyone.", "Patch known vulnerabilities promptly, especially those with public exploits."),
            source = "Microsoft and security reporting (2017)"
        ),
        CaseStudy(
            id = "icloud-celebgate-2014",
            title = "iCloud Celebrity Photo Leak (2014)",
            year = "2014",
            tags = listOf("Cloud", "Phishing", "Privacy"),
            summary = "In 2014, private photos of celebrities were leaked after attackers used phishing and password guessing to access their iCloud accounts.",
            details = "The attacker sent phishing messages to obtain passwords and security answers, then accessed cloud backups containing photos. Apple said its systems were not breached; individual accounts were. The distinction mattered little to the victims, whose private photos became public.",
            lessons = listOf("Cloud backups contain your most private material. Protect them with strong, unique passwords and two-factor authentication.", "Security questions are weak authentication. Use answers that cannot be guessed from public information."),
            source = "FBI and Apple reporting (2014)"
        ),
        CaseStudy(
            id = "talktalk-breach-2015",
            title = "TalkTalk Breach (2015)",
            year = "2015",
            tags = listOf("Breach", "Telecom"),
            summary = "UK telecom TalkTalk suffered a breach in 2015 exposing personal data of more than 150,000 customers, after attackers exploited a website vulnerability.",
            details = "The attackers, including teenagers, used a known SQL injection vulnerability to access customer data. TalkTalk was fined 400,000 pounds by the UK regulator for failing to apply basic protections. The company's handling of the breach, including confusing customer communication, was also criticised.",
            lessons = listOf("Known web vulnerabilities must be patched. An unpatched SQL injection flaw is an open door.", "Breach communication must be clear and accurate. Confusion compounds harm."),
            source = "UK ICO (2016)"
        ),
        CaseStudy(
            id = "vtech-breach-2015",
            title = "VTech Children's Data Breach (2015)",
            year = "2015",
            tags = listOf("Children", "Breach"),
            summary = "In 2015, toy maker VTech suffered a breach exposing data of millions of parents and children, including children's names, birth dates, and photos.",
            details = "Attackers accessed VTech's databases through a poorly secured website, and the data included children's profiles from connected toys. The US Federal Trade Commission later fined VTech for failing to protect children's data. The case showed that children's data, collected by toys, needs the strongest protection.",
            lessons = listOf("Children's data needs the strongest protection, because children cannot consent or protect themselves.", "Connected toys are data collectors. Check what they collect and how it is stored before buying."),
            source = "US FTC (2018)"
        ),
        CaseStudy(
            id = "neiman-marcus-2014",
            title = "Neiman Marcus Breach (2014)",
            year = "2014",
            tags = listOf("Retail", "POS", "Breach"),
            summary = "Luxury retailer Neiman Marcus suffered a breach in 2013-2014 exposing payment card data of hundreds of thousands of customers through compromised point-of-sale systems.",
            details = "Attackers installed malware on point-of-sale terminals that captured card data as it was processed. The breach, discovered around the same time as Target's, showed that retail card breaches were an industry-wide pattern, not isolated incidents. Neiman Marcus later faced lawsuits and regulatory scrutiny.",
            lessons = listOf("Payment card data in transit is a target. Encrypt it end to end, and segment payment systems from other networks.", "Monitor point-of-sale systems for unusual software. Malware on terminals is a pattern, not an exception."),
            source = "Neiman Marcus and reporting (2014)"
        ),
        CaseStudy(
            id = "wendys-pos-2016",
            title = "Wendy's POS Breach (2016)",
            year = "2016",
            tags = listOf("Retail", "POS", "Franchise"),
            summary = "Wendy's suffered a point-of-sale breach in 2015-2016 exposing payment card data from franchised restaurants, after attackers compromised franchise systems.",
            details = "Attackers targeted franchised locations, whose systems were less centrally controlled than company-owned stores. Card data was stolen from more than 1,000 locations. The case showed that franchise and partner systems are part of a brand's attack surface, even when the brand does not run them directly.",
            lessons = listOf("Franchise and partner systems are your attack surface. Set security standards for them and audit compliance.", "Payment systems in distributed locations need central monitoring, not only local controls."),
            source = "Wendy's and reporting (2016)"
        ),
        CaseStudy(
            id = "chipotle-pos-2017",
            title = "Chipotle POS Breach (2017)",
            year = "2017",
            tags = listOf("Retail", "POS", "Breach"),
            summary = "Chipotle suffered a point-of-sale breach in 2017 exposing payment card data from most of its restaurants, after malware was installed on payment systems.",
            details = "Attackers installed malware that captured card data as customers paid, over several weeks. Chipotle disclosed the breach and offered identity protection, but the incident followed a pattern of restaurant POS breaches that had already been widely documented. The controls that would have prevented it were known.",
            lessons = listOf("Known attack patterns demand known controls. A documented POS malware pattern should trigger prevention, not surprise.", "Segment payment systems from other networks, and monitor them continuously."),
            source = "Chipotle (2017)"
        ),
        CaseStudy(
            id = "panera-leak-2018",
            title = "Panera Bread Data Leak (2018)",
            year = "2018",
            tags = listOf("Exposure", "Website"),
            summary = "In 2018, Panera Bread's website was found to leak customer data, including names, addresses, and partial card details, to anyone who knew how to ask.",
            details = "Security researcher Brian Krebs reported that Panera's website exposed customer records through an unauthenticated API, and that the company initially dismissed the report. The data had been exposed for months. The case became an example of how companies handle vulnerability reports badly.",
            lessons = listOf("Treat vulnerability reports seriously, even when they are inconvenient. Dismissing a researcher does not fix the flaw.", "Test your own APIs as an outsider would. Unauthenticated access to customer records is a breach."),
            source = "Krebs on Security (2018)"
        ),
        CaseStudy(
            id = "wawa-breach-2019",
            title = "Wawa Breach (2019)",
            year = "2019",
            tags = listOf("Retail", "POS", "Breach"),
            summary = "Convenience chain Wawa suffered a breach in 2019 exposing payment card data from all of its stores, after malware was installed on payment processing systems.",
            details = "Attackers installed malware on Wawa's payment systems that captured card data for months before discovery. The breach affected potentially all 850 stores. Wawa faced lawsuits and regulatory action, and the case reinforced that POS malware remains a persistent retail threat.",
            lessons = listOf("Payment malware can run for months undetected. Monitor payment systems continuously, not only after incidents.", "A breach affecting all locations is a systemic failure, not a local one. Fix the system, not only the store."),
            source = "Wawa (2019)"
        ),
        CaseStudy(
            id = "saks-breach-2018",
            title = "Saks and Lord and Taylor Breach (2018)",
            year = "2018",
            tags = listOf("Retail", "POS", "Breach"),
            summary = "Hudson's Bay Company, owner of Saks and Lord and Taylor, suffered a breach in 2018 exposing payment card data of millions of customers through compromised point-of-sale systems.",
            details = "Attackers installed malware on in-store payment systems and stole card data over nearly a year. The stolen data was later offered for sale online. The breach showed that even luxury retailers, with significant resources, remained vulnerable to the same POS malware pattern.",
            lessons = listOf("Resources do not guarantee security. Controls must be implemented, not only funded.", "Long dwell time multiplies harm. Detect and contain faster."),
            source = "Hudson's Bay Company (2018)"
        ),
        CaseStudy(
            id = "canva-breach-2019",
            title = "Canva Breach (2019)",
            year = "2019",
            tags = listOf("Breach", "Credentials"),
            summary = "Design platform Canva suffered a breach in 2019 exposing data of 139 million users, including names, email addresses, and encrypted passwords.",
            details = "Attackers accessed a database containing user records, and Canva forced password resets and notified users. The breach was notable for its scale relative to the company's size, and for Canva's relatively prompt disclosure. The stolen data later appeared in credential-stuffing lists.",
            lessons = listOf("A breach of email addresses and passwords enables credential stuffing elsewhere. Use unique passwords everywhere.", "Prompt disclosure and forced resets limit harm. Delay does the opposite."),
            source = "Canva (2019)"
        ),
        CaseStudy(
            id = "evite-breach-2019",
            title = "Evite Breach (2019)",
            year = "2019",
            tags = listOf("Breach", "Credentials"),
            summary = "Invitation platform Evite suffered a breach in 2019 exposing data of about 10 million users, including names, email addresses, and encrypted passwords.",
            details = "The breach was discovered when the stolen data was offered for sale online. Evite notified users and forced password resets, but the data had already circulated. The case showed that even small, familiar services hold data worth stealing, and that breach discovery often comes from criminals, not from internal monitoring.",
            lessons = listOf("Small services hold valuable data. Their security matters as much as large platforms'.", "Monitor for your data appearing for sale. Criminal markets often reveal breaches before internal detection does."),
            source = "Evite (2019)"
        ),
        CaseStudy(
            id = "easyjet-breach-2020",
            title = "EasyJet Breach (2020)",
            year = "2020",
            tags = listOf("Airline", "Breach"),
            summary = "EasyJet suffered a breach in 2020 exposing personal data of 9 million customers, including travel details and, for a smaller number, payment card data.",
            details = "Attackers accessed EasyJet's systems and stole customer email addresses, travel itineraries, and card details for about 2,200 customers. The airline notified affected customers and the UK regulator, and faced lawsuits. The breach showed that travel data — where you go, when — is sensitive personal data.",
            lessons = listOf("Travel itineraries are sensitive data. They reveal where you are and where you will be.", "Notify affected customers promptly and specifically. Vague notification helps no one."),
            source = "EasyJet (2020)"
        ),
        CaseStudy(
            id = "nintendo-breach-2020",
            title = "Nintendo Account Breaches (2020)",
            year = "2020",
            tags = listOf("Gaming", "Credential Stuffing"),
            summary = "In 2020, Nintendo revealed that about 300,000 accounts had been accessed through credential stuffing, using passwords leaked from other services.",
            details = "Attackers used email addresses and passwords from other breaches to log into Nintendo accounts, then made unauthorised purchases and accessed linked payment methods. Nintendo reset passwords and expanded two-factor authentication. The attack did not breach Nintendo's systems; it breached users' password reuse.",
            lessons = listOf("Credential stuffing works because passwords are reused. Unique passwords defeat it.", "Enable two-factor authentication on gaming and entertainment accounts, not only on banking."),
            source = "Nintendo (2020)"
        ),
        CaseStudy(
            id = "twitch-leak-2021",
            title = "Twitch Data Leak (2021)",
            year = "2021",
            tags = listOf("Streaming", "Exposure"),
            summary = "In 2021, Twitch suffered a leak exposing its source code, creator payout data, and internal tools, after a server configuration error.",
            details = "An anonymous poster published 125 gigabytes of Twitch data, including source code and how much top streamers were paid. Twitch attributed the leak to a server misconfiguration. The payout data, in particular, revealed private financial information about creators who had never agreed to publish it.",
            lessons = listOf("Server misconfiguration is a breach vector. Audit configurations, especially for public-facing servers.", "Financial data about individuals is sensitive, even when the individuals are public figures."),
            source = "Twitch (2021)"
        ),
        CaseStudy(
            id = "epik-breach-2021",
            title = "Epik Breach (2021)",
            year = "2021",
            tags = listOf("Hosting", "Breach"),
            summary = "In 2021, domain registrar and host Epik suffered a breach exposing data of its customers, including personal details and internal emails, after hacktivists targeted the company.",
            details = "The hacktivist group Anonymous claimed the breach, publishing 180 gigabytes of data including customer records and internal communications. Epik initially denied the breach, then confirmed it. The case showed that hosting providers hold data about many people's online identities, making them high-value targets.",
            lessons = listOf("Hosting and registrar data is identity data. Its breach exposes many people's online presence at once.", "Denying a confirmed breach destroys trust. Confirm and disclose when evidence is clear."),
            source = "Epik and reporting (2021)"
        ),
        CaseStudy(
            id = "medibank-breach-2022",
            title = "Medibank Breach (2022)",
            year = "2022",
            tags = listOf("Health", "Ransomware"),
            summary = "Australian health insurer Medibank suffered a breach in 2022 exposing sensitive health data of nearly 10 million customers, after attackers accessed its systems through stolen credentials.",
            details = "Attackers stole health claims data, including sensitive medical information, and released it after Medibank refused to pay a ransom. The Australian government and regulators responded with reviews and law changes. Health data, once leaked, cannot be changed like a password.",
            lessons = listOf("Health data is among the most sensitive data held. Its breach causes lasting harm.", "Refusing to pay a ransom is a principled decision, but it requires preparation: backups, communication, and support for victims."),
            source = "Medibank and Australian Government (2022)"
        ),
        CaseStudy(
            id = "comcast-xfinity-2023",
            title = "Comcast Xfinity Breach (2023)",
            year = "2023",
            tags = listOf("Telecom", "Breach"),
            summary = "Comcast's Xfinity suffered a breach in 2023 exposing personal data of about 36 million customers, after attackers exploited a vulnerability in third-party software.",
            details = "Attackers exploited a critical vulnerability in Citrix software used by Xfinity, accessing customer data including usernames, hashed passwords, and partial Social Security numbers. The breach showed that third-party software vulnerabilities become your breach, and that patching windows matter.",
            lessons = listOf("Third-party software vulnerabilities are your vulnerabilities. Patch critical flaws promptly.", "Partial identifiers still identify. Treat partial Social Security numbers as sensitive data."),
            source = "Comcast (2023)"
        ),
        CaseStudy(
            id = "ticketmaster-2024",
            title = "Ticketmaster Breach (2024)",
            year = "2024",
            tags = listOf("Entertainment", "Breach"),
            summary = "In 2024, Ticketmaster's parent Live Nation disclosed a breach exposing personal data of customers, after stolen data was offered for sale by a hacking group.",
            details = "The group ShinyHunters claimed to have stolen data of 560 million Ticketmaster customers, including names, email addresses, and partial payment details, through a third-party cloud database. Live Nation confirmed unauthorised activity and notified regulators. The case reinforced that cloud databases holding customer data are high-value targets.",
            lessons = listOf("Cloud databases holding customer data need access controls, monitoring, and audit, not only storage.", "Third-party cloud providers are part of your security boundary. Audit them."),
            source = "Live Nation (2024)"
        ),
        CaseStudy(
            id = "coinbase-breach-2025",
            title = "Coinbase Insider Bribery (2025)",
            year = "2025",
            tags = listOf("Crypto", "Insider"),
            summary = "In 2025, Coinbase revealed that criminals had bribed overseas support agents to access customer data, then attempted to extort the company.",
            details = "The bribed agents accessed names, addresses, and partial account details for a small percentage of customers. Coinbase refused to pay the extortion demand and instead offered a reward for information. The case showed that insider bribery, not only hacking, is a path to customer data.",
            lessons = listOf("Support agents with broad data access are targets for bribery. Limit access and monitor it.", "Refusing extortion, and rewarding information instead, is a defensible response — if preparation supports it."),
            source = "Coinbase (2025)"
        ),
        CaseStudy(
            id = "marks-spencer-2025",
            title = "Marks and Spencer Cyberattack (2025)",
            year = "2025",
            tags = listOf("Retail", "Ransomware"),
            summary = "In 2025, UK retailer Marks and Spencer suffered a cyberattack that disrupted online orders and store systems for weeks, attributed to a ransomware group.",
            details = "The attack, linked to the Scattered Spider group, forced M&S to suspend online ordering and disrupted supply chains. The company later estimated significant financial impact. The case showed that a cyberattack on a retailer is also a logistics attack, affecting shelves, deliveries, and customers.",
            lessons = listOf("A cyberattack on a retailer disrupts operations, not only data. Recovery plans must cover operations.", "Social engineering of help desks is a path to major breaches. Harden identity verification for support staff."),
            source = "Marks and Spencer and reporting (2025)"
        ),
        CaseStudy(
            id = "jaguar-land-rover-2025",
            title = "Jaguar Land Rover Cyberattack (2025)",
            year = "2025",
            tags = listOf("Manufacturing", "Ransomware"),
            summary = "In 2025, Jaguar Land Rover suffered a cyberattack that halted production for weeks, disrupting manufacturing and supply chains.",
            details = "The attack forced JLR to shut down production systems, affecting factories and suppliers. The company later resumed production gradually, with significant financial impact. The case showed that manufacturing, with its just-in-time supply chains, is highly vulnerable to IT disruption.",
            lessons = listOf("Manufacturing depends on IT. A cyberattack on IT is a production shutdown.", "Supply chain disruption spreads: a halt at one manufacturer affects suppliers and dealers."),
            source = "Jaguar Land Rover and reporting (2025)"
        ),
        CaseStudy(
            id = "qantas-breach-2025",
            title = "Qantas Breach (2025)",
            year = "2025",
            tags = listOf("Airline", "Breach"),
            summary = "In 2025, Qantas suffered a breach exposing personal data of millions of customers, after attackers accessed a third-party customer service platform.",
            details = "Attackers accessed a third-party platform used by a Qantas contact centre, exposing names, email addresses, phone numbers, and frequent flyer details. Qantas notified customers and regulators, and the case reinforced that third-party platforms holding customer data are part of an airline's security boundary.",
            lessons = listOf("Third-party contact centre platforms hold customer data. Their security is your security.", "Frequent flyer and travel data reveal travel patterns. Treat them as sensitive."),
            source = "Qantas (2025)"
        ),
        CaseStudy(
            id = "crypto-com-hack-2022",
            title = "Crypto.com Hack (2022)",
            year = "2022",
            tags = listOf("Crypto", "Exchange"),
            summary = "In 2022, Crypto.com suffered a hack in which attackers bypassed two-factor authentication and stole cryptocurrency worth tens of millions of dollars from hundreds of accounts.",
            details = "Attackers bypassed two-factor controls and withdrew funds from 483 accounts. Crypto.com reimbursed affected customers and strengthened controls. The case showed that even two-factor authentication can be bypassed when its implementation has flaws, and that exchange hot wallets are high-value targets.",
            lessons = listOf("Two-factor authentication must be implemented correctly, not only enabled. Audit its bypass paths.", "Exchange accounts holding funds need the strongest available protections, including withdrawal allowlists."),
            source = "Crypto.com (2022)"
        ),
        CaseStudy(
            id = "wormhole-hack-2022",
            title = "Wormhole Bridge Hack (2022)",
            year = "2022",
            tags = listOf("Crypto", "Bridge"),
            summary = "In 2022, the Wormhole cross-chain bridge was hacked for about 320 million dollars in cryptocurrency, after attackers exploited a signature verification flaw.",
            details = "Attackers forged a signature that let them mint wrapped ether without depositing collateral, then withdrew the funds. The bridge's operator later replenished the funds. The case showed that cross-chain bridges, which lock assets on one chain and mint equivalents on another, are complex and high-risk.",
            lessons = listOf("Complexity is risk. Cross-chain bridges combine the risks of two systems.", "Signature verification flaws are critical. Audit cryptographic checks with particular care."),
            source = "Wormhole and reporting (2022)"
        ),
        CaseStudy(
            id = "nomad-bridge-2022",
            title = "Nomad Bridge Hack (2022)",
            year = "2022",
            tags = listOf("Crypto", "Bridge"),
            summary = "In 2022, the Nomad bridge was drained of about 190 million dollars after a routine upgrade introduced a flaw that let anyone withdraw funds.",
            details = "A configuration error in an upgrade marked a zero hash as valid, letting anyone forge messages to withdraw funds. Once the flaw was public, many copycat attackers joined in. The case showed that a single configuration error in a bridge can be catastrophic, and that public flaws attract immediate exploitation.",
            lessons = listOf("Test upgrades thoroughly before deployment, especially for financial systems.", "A flaw in a bridge is a flaw for everyone. Once public, exploitation is immediate."),
            source = "Nomad and reporting (2022)"
        ),
        CaseStudy(
            id = "binance-hack-2019",
            title = "Binance Hack (2019)",
            year = "2019",
            tags = listOf("Crypto", "Exchange"),
            summary = "In 2019, Binance suffered a hack in which attackers stole about 7,000 bitcoins from its hot wallet, using phishing and viruses to obtain employee credentials.",
            details = "Attackers used phishing and malware over months to obtain employee credentials and two-factor codes, then bypassed security checks to withdraw funds. Binance covered the loss from its insurance fund and strengthened controls. The case showed that exchange security depends on employee security, not only on system security.",
            lessons = listOf("Employee phishing is an exchange's risk, not only a user's risk. Train and protect staff.", "Hot wallets holding large funds need withdrawal controls, delays, and monitoring."),
            source = "Binance (2019)"
        ),
        CaseStudy(
            id = "kucoin-hack-2020",
            title = "KuCoin Hack (2020)",
            year = "2020",
            tags = listOf("Crypto", "Exchange"),
            summary = "In 2020, KuCoin suffered a hack in which attackers stole cryptocurrency worth about 280 million dollars, after obtaining private keys to its hot wallets.",
            details = "Attackers accessed hot wallet keys and withdrew funds across many cryptocurrencies. KuCoin later recovered much of the funds through exchange cooperation and law enforcement, and covered remaining losses. The case showed that hot wallet key management is critical, and that recovery depends on cooperation across exchanges.",
            lessons = listOf("Hot wallet keys must be protected with the strongest controls available. Their compromise is total.", "Recovery after a crypto theft depends on exchanges cooperating to freeze funds. Act fast."),
            source = "KuCoin (2020)"
        ),
        CaseStudy(
            id = "bitmart-hack-2021",
            title = "BitMart Hack (2021)",
            year = "2021",
            tags = listOf("Crypto", "Exchange"),
            summary = "In 2021, BitMart suffered a hack in which attackers stole about 196 million dollars in cryptocurrency, after compromising hot wallets on two blockchains.",
            details = "Attackers stole private keys and withdrew funds from Ethereum and Binance Smart Chain hot wallets. BitMart promised to reimburse affected users from its own funds. The case reinforced that hot wallets across multiple chains multiply exposure when keys are compromised.",
            lessons = listOf("Hot wallets on multiple chains multiply exposure. Segment keys and wallets by chain and purpose.", "An exchange's promise to reimburse depends on its solvency. Understand counterparty risk."),
            source = "BitMart (2021)"
        ),
        CaseStudy(
            id = "bitfinex-hack-2016",
            title = "Bitfinex Hack (2016)",
            year = "2016",
            tags = listOf("Crypto", "Exchange"),
            summary = "In 2016, Bitfinex suffered a hack in which attackers stole about 120,000 bitcoins, worth tens of millions of dollars at the time, from customer wallets.",
            details = "Attackers exploited a vulnerability in Bitfinex's multi-signature wallet arrangement with BitGo to withdraw funds. Bitfinex socialised the loss across all customers, reducing balances by about 36 percent. The case showed that novel wallet arrangements need thorough security review, and that loss-sharing policies matter.",
            lessons = listOf("Novel custody arrangements need thorough review before holding customer funds.", "Understand an exchange's loss policy before depositing. Socialised losses affect all customers."),
            source = "Bitfinex (2016)"
        ),
        CaseStudy(
            id = "microsoft-exchange-hafnium-2021",
            title = "Microsoft Exchange Hafnium Exploits (2021)",
            year = "2021",
            tags = listOf("Nation-State", "Patching"),
            summary = "In 2021, Microsoft revealed that a China-linked group, Hafnium, had exploited zero-day vulnerabilities in Exchange Server to access email of organisations worldwide.",
            details = "The vulnerabilities allowed attackers to access on-premises Exchange servers without authentication, then install web shells for persistent access. Microsoft released emergency patches, and tens of thousands of servers were affected. The case showed that on-premises email servers are high-value targets, and that patching windows matter enormously.",
            lessons = listOf("Patch critical vulnerabilities immediately, especially for internet-facing servers.", "On-premises email servers need the same attention as cloud services. Unpatched servers are open doors."),
            source = "Microsoft (2021)"
        ),
        CaseStudy(
            id = "verkada-breach-2021",
            title = "Verkada Camera Breach (2021)",
            year = "2021",
            tags = listOf("Cameras", "Exposure"),
            summary = "In 2021, Verkada, a security camera company, suffered a breach in which attackers accessed live feeds from about 150,000 cameras in hospitals, schools, and companies.",
            details = "Attackers obtained administrator credentials for Verkada's systems, reportedly through a publicly exposed credential, and accessed cameras in Tesla factories, hospitals, and prisons. Verkada disabled the accounts and improved controls. The case showed that security cameras themselves need security, and that their footage is sensitive.",
            lessons = listOf("Security cameras are network devices. Their credentials and access need the strongest protection.", "Camera footage of hospitals, schools, and workplaces is sensitive data. Treat it as such."),
            source = "Verkada and reporting (2021)"
        ),
        CaseStudy(
            id = "nvidia-lapsus-2022",
            title = "Nvidia Lapsus Breach (2022)",
            year = "2022",
            tags = listOf("Extortion", "Insider"),
            summary = "In 2022, the Lapsus group breached chipmaker Nvidia, stealing source code and employee credentials, and attempted to extort the company.",
            details = "Lapsus, a group known for social engineering and extortion, accessed Nvidia's systems and leaked employee passwords and source code, including for graphics drivers. Nvidia said it hardened systems and did not pay. The case showed that even the most technically sophisticated companies are vulnerable to social engineering and credential theft.",
            lessons = listOf("Technical sophistication does not prevent social engineering. Train staff and harden identity verification.", "Employee credentials, once leaked, enable further attacks. Rotate them immediately after a breach."),
            source = "Nvidia and reporting (2022)"
        ),
        CaseStudy(
            id = "costa-rica-conti-2022",
            title = "Costa Rica Conti Ransomware (2022)",
            year = "2022",
            tags = listOf("Ransomware", "Government"),
            summary = "In 2022, the Conti ransomware group attacked Costa Rica's government systems, disrupting tax, customs, and health services, and the country declared a national emergency.",
            details = "Conti encrypted government systems and demanded a ransom, which Costa Rica refused to pay. The disruption lasted weeks, affecting public services and trade. The case showed that ransomware against governments is also an attack on public services, and that refusal to pay requires recovery capacity.",
            lessons = listOf("Ransomware against governments disrupts public services, not only data. Recovery plans must cover services.", "Refusing to pay requires backups and recovery capacity prepared in advance."),
            source = "Costa Rica Government (2022)"
        ),
        CaseStudy(
            id = "royal-mail-lockbit-2023",
            title = "Royal Mail LockBit Attack (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Postal"),
            summary = "In 2023, Royal Mail suffered a ransomware attack by the LockBit group that disrupted international mail services for weeks.",
            details = "LockBit encrypted systems supporting international exports, forcing Royal Mail to advise customers not to post international items. The disruption affected businesses and individuals relying on international mail. Royal Mail refused to pay the ransom, and services were restored gradually.",
            lessons = listOf("Ransomware disrupts physical services, not only digital ones. Postal, logistics, and manufacturing all depend on IT.", "Refusal to pay is viable only with recovery capacity. Build it before an attack."),
            source = "Royal Mail (2023)"
        ),
        CaseStudy(
            id = "snapchat-breach-2013",
            title = "Snapchat Breach (2013)",
            year = "2013",
            tags = listOf("Social", "Exposure"),
            summary = "In 2013, Snapchat suffered a breach exposing phone numbers and usernames of 4.6 million users, after researchers had warned about its API vulnerability.",
            details = "Attackers exploited Snapchat's Find Friends feature to match phone numbers to usernames at scale, then published the data. Snapchat had been warned by security researchers about the vulnerability but had dismissed the concern. The case became an example of ignoring vulnerability reports.",
            lessons = listOf("Take vulnerability reports seriously, especially from researchers who demonstrate the flaw.", "Phone numbers are identifiers. An API that maps them to usernames at scale is a leak."),
            source = "Snapchat (2014)"
        ),
        CaseStudy(
            id = "quora-breach-2018",
            title = "Quora Breach (2018)",
            year = "2018",
            tags = listOf("Social", "Breach"),
            summary = "Quora suffered a breach in 2018 exposing data of about 100 million users, including names, email addresses, and encrypted passwords.",
            details = "Attackers accessed Quora's systems and stole user data, including content and actions of users who had written anonymously. Quora notified users and forced password resets. The case showed that even question-and-answer platforms hold sensitive data, including anonymous content linked to accounts.",
            lessons = listOf("Anonymous content linked to an account is not anonymous if the account is breached.", "Use unique passwords for every service, including ones that seem low-risk."),
            source = "Quora (2018)"
        ),
        CaseStudy(
            id = "adult-friendfinder-2016",
            title = "Adult FriendFinder Breach (2016)",
            year = "2016",
            tags = listOf("Breach", "Sensitive"),
            summary = "In 2016, Adult FriendFinder suffered a breach exposing data of more than 400 million accounts, including highly sensitive personal details.",
            details = "Attackers accessed databases of FriendFinder Networks, including Adult FriendFinder, exposing email addresses, passwords, and sexual preferences. The breach was one of the largest ever, and its data was particularly sensitive because of the nature of the service. Many accounts belonged to users who had believed their data deleted.",
            lessons = listOf("Sensitive services hold sensitive data. Their breach causes disproportionate harm.", "Deleted accounts may not mean deleted data. Check retention policies before trusting deletion."),
            source = "FriendFinder Networks reporting (2016)"
        ),
        CaseStudy(
            id = "cafepress-breach-2019",
            title = "CafePress Breach (2019)",
            year = "2019",
            tags = listOf("Retail", "Breach"),
            summary = "CafePress suffered a breach in 2019 exposing data of about 23 million users, including names, email addresses, and encrypted passwords.",
            details = "The breach was discovered when the data appeared for sale online. CafePress notified users and the US Federal Trade Commission later fined the company for failing to protect data and for covering up the breach. The case showed that breach cover-ups compound legal and trust consequences.",
            lessons = listOf("Covering up a breach compounds consequences. Disclose when scope is understood.", "Monitor for your data appearing for sale. Criminal markets often reveal breaches first."),
            source = "US FTC (2022)"
        ),
        CaseStudy(
            id = "cathay-pacific-2018",
            title = "Cathay Pacific Breach (2018)",
            year = "2018",
            tags = listOf("Airline", "Breach"),
            summary = "Cathay Pacific suffered a breach in 2018 exposing personal data of about 9.4 million passengers, including passport details, discovered months after the intrusion.",
            details = "Attackers accessed Cathay's systems and stole passenger data including names, passport numbers, and travel histories. The airline disclosed the breach months after discovering unauthorised access, drawing criticism and a fine from the UK regulator. The case showed that airline data, including passport details, is high-value.",
            lessons = listOf("Passport and travel data are high-value targets. Airlines must protect them with the strongest controls.", "Delayed disclosure draws regulatory action. Disclose promptly when scope is understood."),
            source = "Cathay Pacific and UK ICO (2018)"
        ),
        CaseStudy(
            id = "doordash-breach-2019",
            title = "DoorDash Breach (2019)",
            year = "2019",
            tags = listOf("Delivery", "Breach"),
            summary = "DoorDash suffered a breach in 2019 exposing data of about 4.9 million customers, drivers, and merchants, including names, addresses, and partial payment details.",
            details = "Attackers accessed DoorDash's systems through a third-party service provider, stealing customer and driver data. DoorDash notified affected users and offered identity protection. The case showed that delivery platforms hold data about customers, drivers, and merchants, all of whom are affected by a breach.",
            lessons = listOf("Third-party providers are part of your security boundary. Audit them.", "Delivery data reveals where people live and work. Treat addresses as sensitive."),
            source = "DoorDash (2019)"
        ),
        CaseStudy(
            id = "stockx-breach-2019",
            title = "StockX Breach (2019)",
            year = "2019",
            tags = listOf("Retail", "Breach"),
            summary = "Sneaker marketplace StockX suffered a breach in 2019 exposing data of about 6.8 million users, after initially denying that a breach had occurred.",
            details = "The breach was revealed when stolen data appeared for sale online. StockX initially told users that a system update, not a breach, explained password resets, then later confirmed the breach. The case showed that misleading breach communication destroys trust, even when the breach itself is contained.",
            lessons = listOf("Be honest about breaches. Misleading explanations destroy trust faster than the breach itself.", "Monitor for your data appearing for sale. Criminal markets often reveal breaches first."),
            source = "StockX and reporting (2019)"
        ),
        CaseStudy(
            id = "bundestag-hack-2015",
            title = "German Bundestag Hack (2015)",
            year = "2015",
            tags = listOf("Nation-State", "Government"),
            summary = "In 2015, the German Bundestag suffered a hacking attack, later attributed to Russia, that compromised parliamentary systems and stole data.",
            details = "Attackers used spear phishing to access Bundestag systems, installing malware and stealing data over weeks. The German government later attributed the attack to Russian intelligence and issued an arrest warrant. The case showed that parliaments and legislatures are targets for state-linked espionage.",
            lessons = listOf("Government and parliamentary systems are espionage targets. Spear phishing is the common entry point.", "Attribution takes time and evidence. Do not rush to attribute an intrusion."),
            source = "German Government (2015)"
        ),
        CaseStudy(
            id = "banco-chile-swift-2018",
            title = "Banco de Chile SWIFT Attack (2018)",
            year = "2018",
            tags = listOf("Banking", "SWIFT", "Distraction"),
            summary = "In 2018, Banco de Chile suffered an attack in which criminals used a destructive virus as a distraction while stealing funds through the SWIFT messaging system.",
            details = "Attackers deployed wiper malware across thousands of workstations, distracting security teams while fraudulent SWIFT transfers moved about 10 million dollars. The bank later recovered much of the funds. The case showed that destructive attacks can be distractions for financial theft, not only ends in themselves.",
            lessons = listOf("A loud, destructive attack may be a distraction. Maintain financial controls during any incident.", "SWIFT transfers need verification and monitoring, especially during unrelated incidents."),
            source = "Banco de Chile and reporting (2018)"
        )
    )
}
