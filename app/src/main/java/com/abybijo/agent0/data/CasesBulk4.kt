package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk cases, batch 4: 50 general cases, real incidents, public sources named. */
object CasesBulk4 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "ledger-breach-2020",
            title = "Ledger Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "Crypto"),
            summary = "Ledger, maker of hardware cryptocurrency wallets, suffered a breach in 2020 exposing names, addresses, and phone numbers of customers, leading to phishing and physical threats.",
            details = "Attackers accessed Ledger's e-commerce database through a third-party tool. No wallet funds were taken, but customers faced phishing and even physical threats, because the breach revealed who owned crypto hardware and where they lived. The case shows that customer lists for security products are themselves sensitive.",
            lessons = listOf("Customer lists for security products are sensitive. Their exposure enables targeted attacks.", "Hardware wallets protect funds, not customer data. Separate the two risks."),
            source = "Ledger (2020)"
        ),
        CaseStudy(
            id = "twitter-bitcoin-scam-2020",
            title = "Twitter Bitcoin Scam Hack (2020)",
            year = "2020",
            tags = listOf("Social Engineering", "Account Takeover"),
            summary = "In 2020, attackers used social engineering on Twitter employees to take over high-profile accounts and post a Bitcoin scam, reaching millions of followers.",
            details = "The attackers, including teenagers, called Twitter employees and gained access to internal tools. They took over accounts of public figures and companies, posting a doubling scam. Twitter locked verified accounts temporarily. The case shows that internal tools are the crown jewels of platforms.",
            lessons = listOf("Internal admin tools are crown jewels. Protect them with strict access and verification.", "Even verified accounts can be compromised. Verify surprising requests independently."),
            source = "Twitter (2020)"
        ),
        CaseStudy(
            id = "gab-breach-2021",
            title = "Gab Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Hacktivism"),
            summary = "Gab suffered a breach in 2021 in which hacktivists exposed user data, passwords, and private messages, publishing them as a leak.",
            details = "The group calling itself DDoSecrets published the data, which included private messages and passwords. Gab said the breach resulted from a vulnerability. The case shows that platforms holding private messages are leak targets, and that hacktivist leaks publish data regardless of the platform's politics.",
            lessons = listOf("Private messages on platforms can leak. Treat platform messages as semi-public.", "Hacktivist leaks publish data indiscriminately. Do not rely on a platform's politics for safety."),
            source = "DDoSecrets / Gab (2021)"
        ),
        CaseStudy(
            id = "givesendgo-breach-2021",
            title = "GiveSendGo Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Hacktivism"),
            summary = "GiveSendGo suffered a breach in 2021 in which hacktivists exposed donor data, including names and emails, for controversial fundraisers.",
            details = "The leak, also published via DDoSecrets, exposed donors to a fundraiser for the Ottawa trucker convoy. Donors faced harassment and professional consequences. The case shows that donation platforms hold politically sensitive data, and that donor privacy is a safety issue.",
            lessons = listOf("Donation data is politically sensitive. Donor privacy is a safety issue.", "Crowdfunding platforms hold data that can expose donors to harassment."),
            source = "DDoSecrets / GiveSendGo (2021)"
        ),
        CaseStudy(
            id = "patreon-breach-2015",
            title = "Patreon Breach (2015)",
            year = "2015",
            tags = listOf("Breach", "Credentials"),
            summary = "Patreon suffered a breach in 2015 exposing names, emails, and hashed passwords of users, plus some donor data, after attackers accessed its development server.",
            details = "Patreon disclosed the breach and forced password resets. The case shows that development servers are production risks, and that creator platforms hold financial relationships worth exposing.",
            lessons = listOf("Development servers are production risks. Secure them like production.", "Creator platforms hold financial relationships. Protect them accordingly."),
            source = "Patreon (2015)"
        ),
        CaseStudy(
            id = "myheritage-breach-2018",
            title = "MyHeritage Breach (2018)",
            year = "2018",
            tags = listOf("Breach", "Genealogy"),
            summary = "MyHeritage suffered a breach in 2018 exposing emails and hashed passwords of tens of millions of users, discovered when a researcher found the data on a private server.",
            details = "The genealogy company said DNA data was stored separately and was not affected. MyHeritage reset passwords and added two-factor authentication. The case shows that genealogy accounts are identity accounts, and that DNA separation is a meaningful control.",
            lessons = listOf("Genealogy accounts are identity accounts. Protect them with two-factor authentication.", "Separate DNA data from account data. Separation limits breach harm."),
            source = "MyHeritage (2018)"
        ),
        CaseStudy(
            id = "gedmatch-breach-2020",
            title = "GEDmatch Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "Genealogy"),
            summary = "GEDmatch suffered a breach in 2020 in which attackers accessed user data and changed privacy settings, making DNA profiles visible to law enforcement searches.",
            details = "The genealogy site said attackers accessed data through a phishing attack on an employee. Privacy settings for millions of profiles were changed. The case shows that genealogy privacy settings are safety-critical, and that phishing on employees defeats platform controls.",
            lessons = listOf("Genealogy privacy settings are safety-critical. Check them after any incident.", "Employee phishing defeats platform controls. Protect staff accounts strictly."),
            source = "GEDmatch / Verogen (2020)"
        ),
        CaseStudy(
            id = "verifications-io-2019",
            title = "Verifications.io Exposure (2019)",
            year = "2019",
            tags = listOf("Exposure", "Data Broker"),
            summary = "In 2019, researchers found Verifications.io's database exposed online, containing hundreds of millions of email addresses and personal details collected for email verification.",
            details = "The email verification firm left a MongoDB database unprotected. The data included emails, phone numbers, and business details. The case shows that verification firms aggregate data worth exposing, and that unprotected databases are a recurring failure.",
            lessons = listOf("Unprotected databases are a recurring failure. Audit cloud storage permissions.", "Verification firms aggregate personal data. Their exposure is your exposure."),
            source = "Verifications.io (2019)"
        ),
        CaseStudy(
            id = "people-data-labs-2019",
            title = "People Data Labs Exposure (2019)",
            year = "2019",
            tags = listOf("Exposure", "Data Broker"),
            summary = "In 2019, researchers found a database from People Data Labs exposed online, containing personal and professional details on hundreds of millions of people.",
            details = "The data broker's data was found on an unprotected server. It included emails, phone numbers, and employment histories. The case shows that data brokers hold dossiers on people who never gave them data, and that exposure of broker data is mass doxxing.",
            lessons = listOf("Data brokers hold dossiers on people who never gave them data.", "Broker exposures are mass doxxing. Monitor your exposure and opt out where possible."),
            source = "People Data Labs (2019)"
        ),
        CaseStudy(
            id = "apollo-exposure-2018",
            title = "Apollo Exposure (2018)",
            year = "2018",
            tags = listOf("Exposure", "Data Broker"),
            summary = "In 2018, Apollo, a sales intelligence firm, left a database exposed online containing contact details for hundreds of millions of people and companies.",
            details = "The database was found by researchers and secured after disclosure. Apollo said the data came from public sources. The case shows that aggregated public data becomes sensitive in bulk, and that sales intelligence firms are data brokers by another name.",
            lessons = listOf("Aggregated public data becomes sensitive in bulk.", "Sales intelligence firms are data brokers. Treat their exposures accordingly."),
            source = "Apollo (2018)"
        ),
        CaseStudy(
            id = "eatstreet-breach-2019",
            title = "EatStreet Breach (2019)",
            year = "2019",
            tags = listOf("Breach", "Food Delivery"),
            summary = "EatStreet suffered a breach in 2019 exposing names, emails, phone numbers, and card data of customers and restaurant partners, after attackers accessed its systems.",
            details = "The food delivery company disclosed the breach and said it was working with authorities. The case shows that smaller delivery platforms hold the same payment and address data as large ones, and are attacked accordingly.",
            lessons = listOf("Smaller delivery platforms hold the same payment and address data as large ones.", "Food delivery accounts need unique passwords and monitoring for fraud."),
            source = "EatStreet (2019)"
        ),
        CaseStudy(
            id = "checkers-breach-2019",
            title = "Checkers and Rally's Breach (2019)",
            year = "2019",
            tags = listOf("Breach", "POS"),
            summary = "Checkers and Rally's suffered a breach in 2019 in which malware on point-of-sale systems stole payment card data from restaurants over months.",
            details = "The malware was installed at more than a hundred locations and collected card data for months before detection. The case shows that restaurant POS malware has long dwell times, and that franchise systems are attacked at scale.",
            lessons = listOf("Restaurant POS malware has long dwell times. Monitor POS systems continuously.", "Franchise systems are attacked at scale. Central security standards matter."),
            source = "Checkers Drive-In Restaurants (2019)"
        ),
        CaseStudy(
            id = "forever21-breach-2017",
            title = "Forever 21 Breach (2017)",
            year = "2017",
            tags = listOf("Breach", "POS"),
            summary = "Forever 21 suffered a breach in 2017 in which malware on point-of-sale systems stole payment card data for months, after encryption was not enabled on some systems.",
            details = "The retailer disclosed the breach in late 2017 and said some POS systems lacked encryption. The case shows that unencrypted POS systems are easy targets, and that retail breaches often span months before detection.",
            lessons = listOf("Unencrypted POS systems are easy targets. Encrypt card data end to end.", "Retail breaches span months. Monitor for long dwell times."),
            source = "Forever 21 (2017)"
        ),
        CaseStudy(
            id = "shein-breach-2018",
            title = "SHEIN Breach (2018)",
            year = "2018",
            tags = listOf("Breach", "E-commerce"),
            summary = "SHEIN suffered a breach in 2018 exposing emails and hashed passwords of millions of customers, disclosed later and resulting in a regulatory fine.",
            details = "The fast-fashion retailer disclosed the breach after an investigation, and New York later fined its parent company for failing to handle it properly. The case shows that breach handling, not only breach prevention, carries legal consequences.",
            lessons = listOf("Breach handling carries legal consequences. Disclose and remediate properly.", "Fast-fashion accounts hold payment and address data. Protect them like any shop."),
            source = "SHEIN / Zoetop (2018)"
        ),
        CaseStudy(
            id = "jd-sports-breach-2023",
            title = "JD Sports Breach (2023)",
            year = "2023",
            tags = listOf("Breach", "Retail"),
            summary = "JD Sports suffered a breach in 2023 exposing names, addresses, and order details of millions of online customers, after attackers accessed a system holding historic order data.",
            details = "The retailer said payment data was not affected and that it was notifying customers. The case shows that historic order data is retained far longer than customers expect, and that old data is still breach data.",
            lessons = listOf("Historic order data is retained longer than customers expect. Old data is still breach data.", "Retailers should minimise retention of old customer order data."),
            source = "JD Sports Fashion (2023)"
        ),
        CaseStudy(
            id = "honda-cyberattack-2020",
            title = "Honda Cyberattack (2020)",
            year = "2020",
            tags = listOf("Ransomware", "Manufacturing"),
            summary = "Honda suffered a cyberattack in 2020 that disrupted production at plants in several countries, after ransomware affected internal servers.",
            details = "The attack, linked to Snake ransomware, forced Honda to suspend production and take systems offline. The case shows that car manufacturers are ransomware targets, and that production networks need segmentation from office networks.",
            lessons = listOf("Car production networks need segmentation from office networks.", "Manufacturing ransomware halts production. Segment and back up operational systems."),
            source = "Honda (2020)"
        ),
        CaseStudy(
            id = "fujifilm-ransomware-2021",
            title = "Fujifilm Ransomware Attack (2021)",
            year = "2021",
            tags = listOf("Ransomware", "Manufacturing"),
            summary = "Fujifilm suffered a ransomware attack in 2021 that disrupted its network and forced it to take systems offline, affecting operations in several countries.",
            details = "The company said it was investigating with a possible ransomware infection and shut down parts of its network. The case shows that imaging and manufacturing firms are ransomware targets, and that network shutdown is a containment cost.",
            lessons = listOf("Network shutdown is a containment cost. Plan for it in incident response.", "Manufacturing firms are ransomware targets regardless of industry profile."),
            source = "Fujifilm (2021)"
        ),
        CaseStudy(
            id = "heroku-oauth-2022",
            title = "Heroku OAuth Incident (2022)",
            year = "2022",
            tags = listOf("Breach", "Developer Tools"),
            summary = "In 2022, Salesforce disclosed that attackers had accessed Heroku customer data and GitHub integration tokens, after compromising OAuth tokens issued to Heroku and Travis CI.",
            details = "Attackers used stolen OAuth tokens to access private repositories and customer data. Salesforce revoked tokens and advised rotation. The case shows that OAuth tokens are powerful credentials, and that integration tokens need the same protection as passwords.",
            lessons = listOf("OAuth tokens are powerful credentials. Rotate them after any integration incident.", "Integration tokens need the same protection as passwords."),
            source = "Salesforce / Heroku (2022)"
        ),
        CaseStudy(
            id = "hca-breach-2023",
            title = "HCA Healthcare Breach (2023)",
            year = "2023",
            tags = listOf("Breach", "Healthcare"),
            summary = "HCA Healthcare suffered a breach in 2023 exposing names, addresses, and appointment details of millions of patients, after data was taken from an external storage location.",
            details = "HCA said the data appeared on an online forum and that clinical systems were not affected. The case shows that external storage locations holding patient data are part of the attack surface, and that appointment data is sensitive.",
            lessons = listOf("External storage holding patient data is attack surface. Secure it like internal systems.", "Appointment data is sensitive. It reveals health conditions and locations."),
            source = "HCA Healthcare (2023)"
        ),
        CaseStudy(
            id = "tenet-breach-2022",
            title = "Tenet Healthcare Breach (2022)",
            year = "2022",
            tags = listOf("Breach", "Healthcare"),
            summary = "Tenet Healthcare suffered a breach in 2022 exposing personal and health data of millions of patients, after attackers accessed its systems.",
            details = "The hospital operator disclosed the breach and said it was notifying patients. The case shows that large hospital operators are repeated targets, and that health data breaches have long identity-theft tails.",
            lessons = listOf("Health data breaches have long identity-theft tails. Monitor identity after them.", "Large hospital operators are repeated targets. Invest in detection, not only prevention."),
            source = "Tenet Healthcare (2022)"
        ),
        CaseStudy(
            id = "commonspirit-ransomware-2022",
            title = "CommonSpirit Ransomware Attack (2022)",
            year = "2022",
            tags = listOf("Ransomware", "Healthcare"),
            summary = "CommonSpirit Health suffered a ransomware attack in 2022 that disrupted hospitals across many states, forcing diversions and manual processes for weeks.",
            details = "The attack affected electronic health records and scheduling across the system. Hospitals diverted patients and used paper records. The case shows that multi-state hospital systems are single targets with system-wide impact.",
            lessons = listOf("Multi-state hospital systems are single targets with system-wide impact.", "Paper fallbacks must be rehearsed, not improvised, for system-wide outages."),
            source = "CommonSpirit Health (2022)"
        ),
        CaseStudy(
            id = "hollywood-presbyterian-2016",
            title = "Hollywood Presbyterian Ransomware (2016)",
            year = "2016",
            tags = listOf("Ransomware", "Healthcare"),
            summary = "Hollywood Presbyterian Medical Center suffered a ransomware attack in 2016 that locked systems for days, forcing a return to paper records and fax machines.",
            details = "The hospital paid a ransom to regain access, in one of the first widely reported hospital ransomware cases. The case showed that hospitals would pay under care pressure, and that ransomware had found healthcare.",
            lessons = listOf("Hospitals pay under care pressure. Prevention is the only reliable defence.", "Paper fallbacks are hospital safety measures, not inconveniences."),
            source = "Hollywood Presbyterian Medical Center (2016)"
        ),
        CaseStudy(
            id = "allscripts-ransomware-2018",
            title = "Allscripts Ransomware Attack (2018)",
            year = "2018",
            tags = listOf("Ransomware", "Healthcare"),
            summary = "Allscripts suffered a ransomware attack in 2018 that disrupted electronic health record services for thousands of medical practices, after the SamSam group targeted the company.",
            details = "The attack affected hosted EHR services, leaving practices unable to access patient records. Allscripts restored services over days. The case shows that EHR vendors are single points of failure for thousands of practices.",
            lessons = listOf("EHR vendors are single points of failure for thousands of practices.", "Hosted health services need tested restore plans, not only backups."),
            source = "Allscripts (2018)"
        ),
        CaseStudy(
            id = "us-marshals-ransomware-2023",
            title = "US Marshals Ransomware Attack (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Government"),
            summary = "The US Marshals Service suffered a ransomware attack in 2023 that compromised a system holding sensitive law enforcement data, including personal details of investigation targets.",
            details = "The agency disclosed the attack and said it had contained the system. The case shows that law enforcement systems are ransomware targets, and that their data is exceptionally sensitive.",
            lessons = listOf("Law enforcement systems hold exceptionally sensitive data. Segment and monitor them strictly.", "Government agencies are ransomware targets like any organisation."),
            source = "US Marshals Service (2023)"
        ),
        CaseStudy(
            id = "dc-health-link-2023",
            title = "DC Health Link Breach (2023)",
            year = "2023",
            tags = listOf("Breach", "Government"),
            summary = "DC Health Link, Washington's health insurance marketplace, suffered a breach in 2023 exposing personal data of members of Congress, staff, and their families.",
            details = "The breach was disclosed after data appeared for sale. The marketplace serves lawmakers and staff, making the exposure politically sensitive. The case shows that government marketplaces hold high-profile personal data.",
            lessons = listOf("Government marketplaces hold high-profile personal data. Protect them accordingly.", "Breach data on public officials enables targeting. Treat it as high-risk data."),
            source = "DC Health Benefit Exchange Authority (2023)"
        ),
        CaseStudy(
            id = "fbi-infragard-2022",
            title = "FBI InfraGard Hack (2022)",
            year = "2022",
            tags = listOf("Breach", "Government"),
            summary = "In 2022, an attacker compromised the FBI's InfraGard portal, which shares security information with the private sector, and offered its member database for sale.",
            details = "The attacker used social engineering to gain an account, then accessed the portal's member data. The FBI took the portal offline. The case shows that information-sharing portals are themselves targets, and that social engineering defeats vetting.",
            lessons = listOf("Information-sharing portals are targets. Vet members and monitor access.", "Social engineering defeats vetting. Verify identities through separate channels."),
            source = "FBI (2022)"
        ),
        CaseStudy(
            id = "sec-edgar-2017",
            title = "SEC EDGAR Hack (2017)",
            year = "2017",
            tags = listOf("Breach", "Finance"),
            summary = "The SEC disclosed in 2017 that attackers had accessed its EDGAR filing system in 2016 and may have used nonpublic information for illicit trading.",
            details = "The breach exploited a software vulnerability in EDGAR's test filing component. The SEC said the incident was detected in 2016 but its trading implications were understood later. The case shows that regulatory filing systems hold market-moving secrets.",
            lessons = listOf("Filing systems hold market-moving secrets. Test components need production security.", "Delayed understanding of breach impact is common. Reassess scope as evidence grows."),
            source = "US Securities and Exchange Commission (2017)"
        ),
        CaseStudy(
            id = "irs-transcript-2015",
            title = "IRS Get Transcript Fraud (2015)",
            year = "2015",
            tags = listOf("Fraud", "Government"),
            summary = "In 2015, the IRS revealed that criminals had used its Get Transcript service to access tax records of hundreds of thousands of taxpayers, using stolen personal data to pass authentication.",
            details = "Attackers used personal data from other breaches to answer knowledge-based questions and download transcripts, which enabled tax refund fraud. The IRS suspended the service and strengthened authentication. The case ended reliance on knowledge-based authentication for tax data.",
            lessons = listOf("Knowledge-based authentication fails when personal data is breached. It is not authentication.", "Tax transcripts enable refund fraud. Protect tax accounts with strong authentication."),
            source = "Internal Revenue Service (2015)"
        ),
        CaseStudy(
            id = "atomic-wallet-2023",
            title = "Atomic Wallet Hack (2023)",
            year = "2023",
            tags = listOf("Crypto", "Theft"),
            summary = "Atomic Wallet suffered a hack in 2023 in which attackers stole cryptocurrency from thousands of user wallets, in an attack linked to North Korean actors.",
            details = "Users reported funds drained from wallets. Atomic Wallet said it was investigating with analysts. The case shows that non-custodial wallets are still attacked through software supply chains and user devices.",
            lessons = listOf("Non-custodial wallets are attacked through software and devices. Verify wallet software sources.", "Large crypto thefts are often state-linked. Treat wallet security as high-stakes."),
            source = "Atomic Wallet (2023)"
        ),
        CaseStudy(
            id = "harmony-horizon-2022",
            title = "Harmony Horizon Bridge Hack (2022)",
            year = "2022",
            tags = listOf("Crypto", "Bridge"),
            summary = "Harmony's Horizon bridge suffered a hack in 2022 in which attackers stole a large sum of cryptocurrency by compromising validator keys.",
            details = "The bridge used a small validator set, and attackers compromised two of the keys needed to approve transfers. The case shows that bridges with few validators are centralised risks, and that key management is bridge security.",
            lessons = listOf("Bridges with few validators are centralised risks.", "Validator key management is bridge security. Compromise two keys and the bridge falls."),
            source = "Harmony (2022)"
        ),
        CaseStudy(
            id = "badgerdao-2021",
            title = "BadgerDAO Hack (2021)",
            year = "2021",
            tags = listOf("Crypto", "Web Exploit"),
            summary = "BadgerDAO suffered a hack in 2021 in which attackers compromised its website interface and tricked users into approving malicious transactions, stealing a large sum of cryptocurrency.",
            details = "Attackers injected malicious code into the front-end, so users approving normal-looking transactions actually approved theft. The case shows that DeFi front-ends are attack surface, and that transaction approval needs careful reading.",
            lessons = listOf("DeFi front-ends are attack surface. A compromised website steals through approvals.", "Read transaction approvals carefully. Approving blindly is the exploit."),
            source = "BadgerDAO (2021)"
        ),
        CaseStudy(
            id = "wintermute-2022",
            title = "Wintermute Hack (2022)",
            year = "2022",
            tags = listOf("Crypto", "Theft"),
            summary = "Wintermute, a crypto market maker, suffered a hack in 2022 in which attackers stole a large sum of cryptocurrency by exploiting a vanity address tool.",
            details = "The firm said the theft resulted from a vulnerability in a tool used to generate vanity wallet addresses. Wintermute remained solvent. The case shows that vanity address tools can weaken key generation, and that operational wallets need strict controls.",
            lessons = listOf("Vanity address tools can weaken key generation. Do not trade security for aesthetics.", "Operational wallets need strict controls and limits on exposed funds."),
            source = "Wintermute (2022)"
        ),
        CaseStudy(
            id = "mango-markets-2022",
            title = "Mango Markets Exploit (2022)",
            year = "2022",
            tags = listOf("Crypto", "Market Manipulation"),
            summary = "Mango Markets suffered an exploit in 2022 in which a trader manipulated oracle prices to drain a large sum from the decentralised trading platform.",
            details = "The trader, later charged by US authorities, inflated the price of a token through large trades, then borrowed against the inflated value. The case shows that oracle manipulation is a DeFi attack, and that thin markets are manipulable.",
            lessons = listOf("Oracle prices in thin markets are manipulable. Design against manipulation.", "Market manipulation on DeFi platforms is still fraud, whatever the code allows."),
            source = "Mango Markets (2022)"
        ),
        CaseStudy(
            id = "bybit-2025",
            title = "Bybit Hack (2025)",
            year = "2025",
            tags = listOf("Crypto", "Theft"),
            summary = "Bybit suffered a hack in 2025 in which attackers stole a very large sum of cryptocurrency from a cold wallet, in an attack linked to North Korean actors.",
            details = "Attackers manipulated the signing interface during a routine transfer, making signers approve a different transaction than they saw. Bybit said customer funds were covered and operations continued. The case shows that signing interfaces are attack surface, and that cold wallets are not immune.",
            lessons = listOf("Signing interfaces are attack surface. Verify what you sign, not only that you sign.", "Cold wallets are not immune. Interface manipulation defeats cold storage."),
            source = "Bybit (2025)"
        ),
        CaseStudy(
            id = "wazirx-2024",
            title = "WazirX Hack (2024)",
            year = "2024",
            tags = listOf("Crypto", "Theft"),
            summary = "WazirX, India's large crypto exchange, suffered a hack in 2024 in which attackers stole a large sum of cryptocurrency from a multisignature wallet.",
            details = "Attackers exploited a multisig wallet managed with a custody provider, after a discrepancy between displayed and actual transaction data. WazirX paused withdrawals and pursued restructuring. The case shows that multisig is only as safe as its signing display.",
            lessons = listOf("Multisig is only as safe as its signing display. Verify transaction data independently.", "Exchange hacks freeze withdrawals. Custody risk is real for exchange users."),
            source = "WazirX (2024)"
        ),
        CaseStudy(
            id = "dmm-bitcoin-2024",
            title = "DMM Bitcoin Hack (2024)",
            year = "2024",
            tags = listOf("Crypto", "Theft"),
            summary = "DMM Bitcoin, a Japanese crypto exchange, suffered a hack in 2024 in which attackers stole a large sum of Bitcoin, leading the exchange to close.",
            details = "The exchange said it would compensate customers and later announced it would cease operations. The case shows that exchange hacks can end exchanges, and that customer compensation depends on the firm's survival.",
            lessons = listOf("Exchange hacks can end exchanges. Do not hold more on exchanges than needed.", "Compensation promises depend on the firm's survival. Self-custody reduces that risk."),
            source = "DMM Bitcoin (2024)"
        ),
        CaseStudy(
            id = "poloniex-2023",
            title = "Poloniex Hack (2023)",
            year = "2023",
            tags = listOf("Crypto", "Theft"),
            summary = "Poloniex suffered a hack in 2023 in which attackers stole a large sum of cryptocurrency from hot wallets, after compromising private keys.",
            details = "The exchange confirmed the hack and offered a bounty for return of funds. The case shows that hot wallet key compromise is a recurring exchange failure, and that bounty offers rarely recover full sums.",
            lessons = listOf("Hot wallet keys are recurring targets. Limit hot wallet balances.", "Bounty offers rarely recover full sums. Prevention beats negotiation."),
            source = "Poloniex (2023)"
        ),
        CaseStudy(
            id = "coinex-2023",
            title = "CoinEx Hack (2023)",
            year = "2023",
            tags = listOf("Crypto", "Theft"),
            summary = "CoinEx suffered a hack in 2023 in which attackers stole a large sum of cryptocurrency from hot wallets, in an attack linked to North Korean actors.",
            details = "The exchange suspended deposits and withdrawals, then resumed after securing systems. The case shows that North Korean actors systematically target exchanges, and that hot wallet security is existential for exchanges.",
            lessons = listOf("North Korean actors systematically target exchanges. Assume exchange hot wallets are in scope.", "Hot wallet security is existential for exchanges. Segment and limit exposure."),
            source = "CoinEx (2023)"
        ),
        CaseStudy(
            id = "stake-2023",
            title = "Stake.com Hack (2023)",
            year = "2023",
            tags = listOf("Crypto", "Theft"),
            summary = "Stake.com, a crypto casino, suffered a hack in 2023 in which attackers stole a large sum of cryptocurrency from hot wallets, in an attack linked to North Korean actors.",
            details = "The platform said user funds were safe and operations continued. The case shows that gambling platforms holding crypto are targeted like exchanges, and that hot wallet compromise is the common path.",
            lessons = listOf("Crypto gambling platforms are targeted like exchanges.", "Hot wallet compromise is the common path. Limit hot wallet exposure."),
            source = "Stake.com (2023)"
        ),
        CaseStudy(
            id = "godaddy-breach-2021",
            title = "GoDaddy Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Hosting"),
            summary = "GoDaddy suffered a breach in 2021 in which attackers accessed its managed WordPress hosting environment, exposing data and credentials of millions of customers.",
            details = "Attackers used a compromised password to access the hosting environment and remained for months. GoDaddy reset passwords and sFTP keys. The case shows that hosting providers are high-value targets, and that a single compromised password can expose millions.",
            lessons = listOf("A single compromised hosting password can expose millions of customers.", "Hosting providers are high-value targets. Protect their credentials strictly."),
            source = "GoDaddy (2021)"
        ),
        CaseStudy(
            id = "instacart-2020",
            title = "Instacart Credential Stuffing (2020)",
            year = "2020",
            tags = listOf("Credential Stuffing", "Food Delivery"),
            summary = "In 2020, Instacart accounts were accessed through credential stuffing, with attackers using reused passwords from other breaches to place fraudulent orders.",
            details = "Instacart said its systems were not breached, but that attackers used credentials from other breaches. The case shows that credential stuffing is not a breach of the target, yet harms its users, and that reuse is the root cause.",
            lessons = listOf("Credential stuffing harms users without breaching the target. Reuse is the root cause.", "Delivery accounts need unique passwords and two-factor authentication."),
            source = "Instacart (2020)"
        ),
        CaseStudy(
            id = "reddoorz-2020",
            title = "RedDoorz Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "Hospitality"),
            summary = "RedDoorz, a Southeast Asian hotel chain, suffered a breach in 2020 exposing names, emails, and phone numbers of millions of customers.",
            details = "The data appeared for sale in 2020. The case shows that regional hotel chains hold the same guest data as global ones, and that guest data is useful for phishing and travel fraud.",
            lessons = listOf("Regional hotel chains hold the same guest data as global ones.", "Guest data enables travel phishing. Verify unexpected travel messages."),
            source = "RedDoorz (2020)"
        ),
        CaseStudy(
            id = "huazhu-2018",
            title = "Huazhu Hotels Breach (2018)",
            year = "2018",
            tags = listOf("Breach", "Hospitality"),
            summary = "Huazhu Hotels Group suffered a breach in 2018 exposing personal data, including identity card numbers, of millions of guests across its Chinese hotel brands.",
            details = "The data appeared for sale in 2018. Huazhu said it was investigating with police. The case shows that hotel breaches in markets with national ID numbers expose identity documents, not only contact details.",
            lessons = listOf("Hotel breaches can expose identity documents, not only contact details.", "Identity numbers in breaches enable long-term fraud. Monitor identity after them."),
            source = "Huazhu Hotels Group (2018)"
        ),
        CaseStudy(
            id = "stubhub-fraud-2014",
            title = "StubHub Fraud (2014)",
            year = "2014",
            tags = listOf("Fraud", "Ticketing"),
            summary = "In 2014, StubHub suffered fraud in which criminals used stolen credit cards and compromised accounts to buy tickets, reselling them for profit.",
            details = "The fraud ring used stolen cards and account credentials to purchase high-value tickets. StubHub improved fraud detection and account security. The case shows that ticketing platforms are fraud targets, and that account takeover enables resale fraud.",
            lessons = listOf("Ticketing platforms are fraud targets. Account takeover enables resale fraud.", "Protect ticketing accounts with unique passwords and two-factor authentication."),
            source = "StubHub (2014)"
        ),
        CaseStudy(
            id = "ticketfly-2018",
            title = "Ticketfly Breach (2018)",
            year = "2018",
            tags = listOf("Breach", "Ticketing"),
            summary = "Ticketfly suffered a breach in 2018 in which attackers defaced its website and stole customer data, taking the ticketing platform offline for days.",
            details = "The attacker demanded a ransom and published some data when it was not paid. Ticketfly restored services and notified customers. The case shows that ticketing platforms are extortion targets, and that defacement is often paired with data theft.",
            lessons = listOf("Defacement is often paired with data theft. Treat it as a breach, not vandalism.", "Ticketing platforms are extortion targets. Back up and segment customer data."),
            source = "Ticketfly (2018)"
        ),
        CaseStudy(
            id = "razer-2020",
            title = "Razer Data Leak (2020)",
            year = "2020",
            tags = listOf("Exposure", "Gaming"),
            summary = "In 2020, Razer left a database exposed online, revealing names, emails, addresses, and order details of customers, after a server misconfiguration.",
            details = "A researcher found the Elasticsearch cluster unprotected. Razer secured it after disclosure. The case shows that gaming hardware firms hold customer order data, and that cloud misconfiguration is a recurring exposure cause.",
            lessons = listOf("Cloud misconfiguration is a recurring exposure cause. Audit database permissions.", "Gaming hardware firms hold order and address data. Protect them accordingly."),
            source = "Razer (2020)"
        ),
        CaseStudy(
            id = "msi-2023",
            title = "MSI Breach (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Hardware"),
            summary = "MSI suffered a breach in 2023 in which the Money Message ransomware group stole source code and demanded payment, threatening to publish firmware signing keys.",
            details = "The group claimed to have taken source code and firmware data. MSI said it was restoring systems. The case shows that hardware firms' source code and signing keys are high-value targets, and that firmware trust depends on key protection.",
            lessons = listOf("Firmware signing keys are high-value targets. Protect them above all.", "Hardware source code theft threatens product trust, not only secrecy."),
            source = "MSI (2023)"
        ),
        CaseStudy(
            id = "canon-ransomware-2020",
            title = "Canon Ransomware Attack (2020)",
            year = "2020",
            tags = listOf("Ransomware", "Imaging"),
            summary = "Canon suffered a ransomware attack in 2020 in which the Maze group disrupted its image cloud service and stole data, publishing some of it.",
            details = "Canon's image.canon service was disrupted for days, and users could not access stored photos. The case shows that cloud photo services are ransomware targets, and that cloud-only photo storage is a single point of failure.",
            lessons = listOf("Cloud-only photo storage is a single point of failure. Keep local copies.", "Imaging firms are ransomware targets. Segment cloud services from corporate networks."),
            source = "Canon (2020)"
        ),
        CaseStudy(
            id = "airtel-breach-2021",
            title = "Airtel Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Telecom"),
            summary = "Airtel, India's large telecom operator, faced an alleged breach in 2021 in which a seller claimed to hold personal data of millions of subscribers.",
            details = "Airtel denied a breach of its systems, while researchers examined the claimed data. The case shows that telecom subscriber data is a prized target, and that disputed breach claims still require user caution.",
            lessons = listOf("Telecom subscriber data is a prized target. Protect carrier accounts with PINs.", "Disputed breach claims still warrant caution. Change passwords and monitor accounts."),
            source = "Bharti Airtel (2021)"
        ),
        CaseStudy(
            id = "olympus-ransomware-2021",
            title = "Olympus Ransomware Attack (2021)",
            year = "2021",
            tags = listOf("Ransomware", "Medical Devices"),
            summary = "Olympus suffered a ransomware attack in 2021 that affected its medical device business in the Americas, after the BlackMatter group targeted the company.",
            details = "Olympus said it was investigating and restoring systems, and that patient safety was prioritised. The case shows that medical device firms are ransomware targets, and that device supply chains are vulnerable.",
            lessons = listOf("Medical device firms are ransomware targets. Their outages affect care supply.", "Device supply chains need continuity plans for vendor outages."),
            source = "Olympus (2021)"
        )
    )
}
