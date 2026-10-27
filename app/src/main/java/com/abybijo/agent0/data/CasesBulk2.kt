package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk cases, batch 2: 50 general cases, real incidents, public sources named. */
object CasesBulk2 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "sonic-breach-2017",
            title = "Sonic Drive-In Breach (2017)",
            year = "2017",
            tags = listOf("Retail", "POS", "Breach"),
            summary = "Sonic Drive-In suffered a point-of-sale breach in 2017 exposing payment card data from many of its restaurants, after malware was installed on payment systems.",
            details = "Attackers installed malware on POS systems that captured card data as customers paid. Sonic disclosed the breach after banks reported fraudulent activity on cards used at its restaurants. The case followed the familiar restaurant POS pattern, showing it had not been stopped industry-wide.",
            lessons = listOf("POS malware is a persistent pattern. Monitor payment systems continuously.", "Banks often detect breaches before merchants do. Listen to fraud signals from card issuers."),
            source = "Sonic and reporting (2017)"
        ),
        CaseStudy(
            id = "macys-breach-2019",
            title = "Macy's Magecart Breach (2019)",
            year = "2019",
            tags = listOf("Retail", "Web Skimming"),
            summary = "In 2019, Macy's suffered a web-skimming attack in which malicious code on its website captured payment card data entered by online shoppers.",
            details = "Attackers injected skimming code into Macy's checkout pages, harvesting card details as customers typed them. Macy's disclosed the breach and notified affected customers. The attack showed that online checkout pages, like physical terminals, are payment capture points that need protection.",
            lessons = listOf("Online checkout pages need script monitoring. Third-party and injected scripts can skim card data.", "Audit scripts on payment pages regularly. A new script is a risk until verified."),
            source = "Macy's (2019)"
        ),
        CaseStudy(
            id = "three-uk-2016",
            title = "Three UK Breach (2016)",
            year = "2016",
            tags = listOf("Telecom", "Breach"),
            summary = "UK mobile operator Three suffered a breach in 2016 in which attackers accessed customer upgrade systems and stole personal data.",
            details = "Attackers used employee logins to access Three's upgrade database, exposing names, addresses, and dates of birth of customers. Three said financial data was not accessed, but the personal data alone enabled identity fraud. The case showed that internal upgrade and support systems are targets.",
            lessons = listOf("Internal support and upgrade systems hold customer data. Protect them as carefully as customer-facing systems.", "Employee logins need monitoring. Unusual bulk access should trigger alerts."),
            source = "Three UK (2016)"
        ),
        CaseStudy(
            id = "myfitnesspal-2018",
            title = "MyFitnessPal Breach (2018)",
            year = "2018",
            tags = listOf("Health", "Breach"),
            summary = "Under Armour's MyFitnessPal suffered a breach in 2018 exposing data of about 150 million users, including usernames, email addresses, and hashed passwords.",
            details = "Attackers accessed MyFitnessPal's user database, stealing credentials and profile data. Under Armour notified users and forced password resets. The breach showed that health and fitness apps hold data worth stealing at scale, even when they hold no payment data.",
            lessons = listOf("Fitness apps hold identifying data at scale. Their security matters as much as any platform's.", "Use unique passwords for fitness and health apps, not only for banking."),
            source = "Under Armour (2018)"
        ),
        CaseStudy(
            id = "mgm-leak-2020",
            title = "MGM Data Leak (2020)",
            year = "2020",
            tags = listOf("Hospitality", "Exposure"),
            summary = "In 2020, personal data of more than 140 million MGM hotel guests was published online, after a 2019 breach that MGM had initially downplayed.",
            details = "The data, including names, addresses, phone numbers, and passport details for some guests, was posted on a hacking forum. MGM said the data came from a 2019 cloud server incident. The case showed that hospitality data, including passport details, is high-value, and that downplaying a breach worsens its consequences.",
            lessons = listOf("Hotel guest data, including passport details, is high-value. Protect cloud servers holding it.", "Do not downplay a breach. Accurate disclosure preserves trust; minimisation destroys it."),
            source = "MGM Resorts and reporting (2020)"
        ),
        CaseStudy(
            id = "parkmobile-2021",
            title = "ParkMobile Breach (2021)",
            year = "2021",
            tags = listOf("Transport", "Breach"),
            summary = "Parking app ParkMobile suffered a breach in 2021 exposing data of about 21 million users, including email addresses, phone numbers, and vehicle details.",
            details = "Attackers accessed ParkMobile's systems through a third-party vulnerability, stealing user data including licence plate numbers. ParkMobile notified users and offered identity protection. The case showed that even parking apps hold location-linked personal data worth stealing.",
            lessons = listOf("Apps that know your vehicle and location hold sensitive data. Treat them accordingly.", "Third-party vulnerabilities become your breach. Patch and audit third-party software."),
            source = "ParkMobile (2021)"
        ),
        CaseStudy(
            id = "plex-breach-2022",
            title = "Plex Breach (2022)",
            year = "2022",
            tags = listOf("Media", "Breach"),
            summary = "Media platform Plex suffered a breach in 2022 exposing user data including email addresses and encrypted passwords, after attackers accessed a database.",
            details = "Plex discovered unauthorised access to a database and forced all users to reset passwords. The company said payment data was not accessed, but the credential data alone enabled stuffing attacks elsewhere. Plex's prompt forced reset limited harm.",
            lessons = listOf("Force password resets promptly after a credential breach. Delay enables stuffing attacks.", "Media accounts linked to payment methods need unique passwords and two-factor authentication."),
            source = "Plex (2022)"
        ),
        CaseStudy(
            id = "evernote-breach-2013",
            title = "Evernote Breach (2013)",
            year = "2013",
            tags = listOf("Productivity", "Breach"),
            summary = "Note-taking service Evernote suffered a breach in 2013 exposing usernames, email addresses, and encrypted passwords of about 50 million users.",
            details = "Attackers accessed Evernote's systems and stole user credentials. Evernote forced password resets for all users and expanded security measures. The case showed that productivity apps, holding users' notes and ideas, are targets, and that their credential data enables attacks elsewhere.",
            lessons = listOf("Productivity apps hold personal thoughts and work. Their security matters.", "Use unique passwords for productivity services, and enable two-factor authentication where available."),
            source = "Evernote (2013)"
        ),
        CaseStudy(
            id = "livingsocial-breach-2013",
            title = "LivingSocial Breach (2013)",
            year = "2013",
            tags = listOf("E-commerce", "Breach"),
            summary = "Daily deals site LivingSocial suffered a breach in 2013 exposing data of about 50 million users, including names, email addresses, and encrypted passwords.",
            details = "Attackers accessed LivingSocial's servers and stole user data. The company notified users and forced password resets. The breach, one of the largest of its year, showed that e-commerce sites holding customer data at scale are persistent targets.",
            lessons = listOf("E-commerce sites hold customer data at scale. Their breach affects millions at once.", "Use unique passwords for shopping sites, and monitor accounts after a breach."),
            source = "LivingSocial (2013)"
        ),
        CaseStudy(
            id = "community-health-2014",
            title = "Community Health Systems Breach (2014)",
            year = "2014",
            tags = listOf("Health", "Nation-State"),
            summary = "In 2014, hospital operator Community Health Systems suffered a breach, attributed to China, exposing personal data of about 4.5 million patients.",
            details = "Attackers used malware to access hospital systems and steal patient names, addresses, birth dates, and Social Security numbers. The breach, one of the largest health breaches of its time, showed that hospital systems are targets for state-linked data theft, not only for ransomware.",
            lessons = listOf("Health systems hold identity data, not only medical data. Their breach enables identity theft.", "Hospital networks need segmentation and monitoring, not only perimeter defences."),
            source = "Community Health Systems and FBI (2014)"
        ),
        CaseStudy(
            id = "excellus-2015",
            title = "Excellus BlueCross Breach (2015)",
            year = "2015",
            tags = listOf("Health", "Breach"),
            summary = "Health insurer Excellus BlueCross BlueShield suffered a breach in 2015 exposing data of about 10 million members, discovered after more than a year of undetected access.",
            details = "Attackers accessed Excellus systems in late 2013 and remained undetected until 2015, stealing names, addresses, and financial and medical details. The long dwell time showed that health insurers, like hospitals, were targets for persistent intrusion, and that detection lag multiplies harm.",
            lessons = listOf("Long undetected access multiplies harm. Monitor for persistent intrusion, not only for noisy attacks.", "Health insurer data combines identity and medical details. Its breach is doubly harmful."),
            source = "Excellus (2015)"
        ),
        CaseStudy(
            id = "banner-health-2016",
            title = "Banner Health Breach (2016)",
            year = "2016",
            tags = listOf("Health", "Breach"),
            summary = "Banner Health suffered a breach in 2016 exposing data of about 3.7 million patients and employees, after attackers accessed payment and health systems.",
            details = "Attackers accessed Banner's payment processing systems, then moved to health records, stealing patient and employee data including Social Security numbers. Banner notified affected individuals and offered identity protection. The case showed that payment systems can be a path to health records when networks are not segmented.",
            lessons = listOf("Segment payment systems from health records. A path from one to the other is a design failure.", "Employee data needs the same protection as patient data."),
            source = "Banner Health (2016)"
        ),
        CaseStudy(
            id = "deep-root-2017",
            title = "Deep Root Analytics Exposure (2017)",
            year = "2017",
            tags = listOf("Exposure", "Voter Data"),
            summary = "In 2017, a researcher found that political data firm Deep Root Analytics had exposed voter records of nearly 200 million Americans through a misconfigured cloud server.",
            details = "The exposed database, hosted on Amazon S3 without a password, contained voter registration data and modelled political profiles. No hacking was required; the data was simply public. The case showed that misconfigured cloud storage is a recurring cause of massive exposures, and that voter data is sensitive.",
            lessons = listOf("A public cloud bucket is a publication. Verify access settings on every shared store.", "Voter and political data are sensitive. Their exposure enables targeting and manipulation."),
            source = "UpGuard research (2017)"
        ),
        CaseStudy(
            id = "exactis-2018",
            title = "Exactis Exposure (2018)",
            year = "2018",
            tags = listOf("Data Broker", "Exposure"),
            summary = "In 2018, a researcher found that data broker Exactis had exposed a database containing personal details of about 340 million people through a public server.",
            details = "The database, containing names, addresses, phone numbers, and detailed personal characteristics, was accessible without a password. Exactis, a marketing data firm, had collected the data from many sources. The exposure showed the scale of data-broker collection: hundreds of millions of profiles, held insecurely.",
            lessons = listOf("Data brokers collect profiles at massive scale. Their insecurity is your exposure.", "Check whether brokers hold your data, and request removal where available."),
            source = "Security researcher Troy Hunt reporting (2018)"
        ),
        CaseStudy(
            id = "hacking-team-2015",
            title = "Hacking Team Breach (2015)",
            year = "2015",
            tags = listOf("Surveillance", "Breach"),
            summary = "In 2015, Italian surveillance company Hacking Team was itself hacked, and its internal emails, source code, and client lists were published online.",
            details = "Attackers breached Hacking Team, which sold surveillance tools to governments, and leaked 400 gigabytes of data revealing its customers, including governments with poor human rights records. The case showed that surveillance vendors are targets, and that their breach exposes both their tools and their clients.",
            lessons = listOf("Surveillance tools, once leaked, spread to actors beyond their original buyers.", "A vendor's breach exposes its clients. Vet vendors' security, not only their products."),
            source = "Hacking Team leak reporting (2015)"
        ),
        CaseStudy(
            id = "vault7-2017",
            title = "Vault 7 CIA Tools Leak (2017)",
            year = "2017",
            tags = listOf("Nation-State", "Tools Leak"),
            summary = "In 2017, WikiLeaks began publishing Vault 7, a collection of CIA hacking tools and documents, revealing the agency's cyber capabilities.",
            details = "The leak exposed tools for compromising phones, computers, and televisions, and the CIA's methods for developing them. The tools' publication meant that capabilities developed for intelligence use became available to study and reuse. The case, like Shadow Brokers, showed that secret tools escape.",
            lessons = listOf("Secret tools escape. Capabilities developed in secret become public capabilities once leaked.", "Patch vulnerabilities in consumer devices, even those disclosed through leaks."),
            source = "WikiLeaks Vault 7 (2017)"
        ),
        CaseStudy(
            id = "korea-credit-2014",
            title = "South Korea Credit Card Breach (2014)",
            year = "2014",
            tags = listOf("Banking", "Insider"),
            summary = "In 2014, South Korea suffered a massive credit card data breach in which an insider stole personal data of tens of millions of cardholders from three card companies.",
            details = "A contractor working for a credit ratings firm copied data from KB Kookmin, Lotte, and NH Nonghyup cards, affecting more than 100 million accounts in a country of about 50 million people. The insider sold the data, and the breach led to resignations, fines, and reforms. The case showed insider risk at national scale.",
            lessons = listOf("Insider access to bulk customer data needs monitoring and limits. A contractor should not be able to copy millions of records unnoticed.", "Bulk data access should require approval, logging, and review."),
            source = "South Korean regulators (2014)"
        ),
        CaseStudy(
            id = "carphone-2015",
            title = "Carphone Warehouse Breach (2015)",
            year = "2015",
            tags = listOf("Retail", "Breach"),
            summary = "UK retailer Carphone Warehouse suffered a breach in 2015 exposing personal data of about 2.4 million customers, after attackers accessed its systems.",
            details = "Attackers accessed Carphone Warehouse's systems and stole customer names, addresses, dates of birth, and bank details for some customers. The company was later fined 400,000 pounds by the UK regulator for failing to apply basic protections. The case showed that retail systems holding customer data need the same care as financial systems.",
            lessons = listOf("Retail customer data, including bank details, needs financial-grade protection.", "Basic protections — patching, access controls, monitoring — are not optional."),
            source = "UK ICO (2018)"
        ),
        CaseStudy(
            id = "tesco-bank-2016",
            title = "Tesco Bank Fraud (2016)",
            year = "2016",
            tags = listOf("Banking", "Fraud"),
            summary = "In 2016, Tesco Bank suffered a fraud attack in which criminals stole about 2.5 million pounds from about 9,000 customer accounts over a weekend.",
            details = "Attackers exploited a vulnerability in Tesco Bank's systems to make fraudulent transactions from customer accounts. The bank suspended online transactions, refunded affected customers, and faced regulatory action. The case showed that online banking systems are targets for direct financial theft, not only for data theft.",
            lessons = listOf("Online banking systems need fraud monitoring that catches unusual transaction patterns fast.", "Suspending a service during an attack, while disruptive, can limit losses."),
            source = "Tesco Bank and FCA (2016)"
        ),
        CaseStudy(
            id = "dixons-2018",
            title = "Dixons Carphone Breach (2018)",
            year = "2018",
            tags = listOf("Retail", "Breach"),
            summary = "Dixons Carphone suffered a breach in 2018 exposing personal data of about 10 million customers, after attackers accessed its systems over nearly a year.",
            details = "Attackers accessed Dixons Carphone's processing systems and stole customer names, addresses, and card details. The company was fined 500,000 pounds by the UK regulator for failing to protect data and for delaying disclosure. The long dwell time and delayed disclosure compounded the breach.",
            lessons = listOf("Long undetected access multiplies harm. Monitor for persistent intrusion.", "Delayed disclosure draws regulatory action. Disclose when scope is understood."),
            source = "UK ICO (2020)"
        ),
        CaseStudy(
            id = "justdial-2019",
            title = "JustDial Data Leak (2019)",
            year = "2019",
            tags = listOf("Exposure", "API"),
            summary = "In 2019, Indian local search service JustDial was found to expose personal data of about 100 million users through an unprotected API.",
            details = "A security researcher found that JustDial's API allowed anyone to access user names, email addresses, phone numbers, and locations without authentication. The company fixed the flaw after disclosure. The case showed that APIs are a common leak vector, especially when they lack authentication.",
            lessons = listOf("APIs need authentication. An unauthenticated API exposing user data is a breach.", "Test your own APIs as an outsider would, before researchers do."),
            source = "Security researcher reporting (2019)"
        ),
        CaseStudy(
            id = "unacademy-2020",
            title = "Unacademy Breach (2020)",
            year = "2020",
            tags = listOf("Education", "Breach"),
            summary = "Indian education platform Unacademy suffered a breach in 2020 exposing data of about 22 million users, including email addresses and hashed passwords.",
            details = "The stolen data was offered for sale online, revealing that Unacademy had been breached. The company notified users and forced password resets. The case showed that education platforms, holding data of millions of students, are targets, and that breach discovery often comes from criminal markets.",
            lessons = listOf("Education platforms hold student data at scale. Their security matters.", "Monitor for your data appearing for sale. Criminal markets often reveal breaches first."),
            source = "Unacademy and reporting (2020)"
        ),
        CaseStudy(
            id = "air-india-2021",
            title = "Air India Breach (2021)",
            year = "2021",
            tags = listOf("Airline", "Breach"),
            summary = "Air India suffered a breach in 2021 exposing personal data of about 4.5 million passengers, after attackers accessed a third-party passenger service system.",
            details = "Attackers accessed SITA, a passenger service system used by airlines worldwide, and stole Air India passenger data including names, passport details, and ticket information. The case showed that airline data flows through shared third-party systems, making one provider's breach many airlines' breach.",
            lessons = listOf("Shared third-party systems are shared risk. One provider's breach is many customers' breach.", "Passport and ticket data are high-value. Protect them across every system that touches them."),
            source = "Air India and SITA (2021)"
        ),
        CaseStudy(
            id = "toyota-cloud-2023",
            title = "Toyota Cloud Misconfiguration (2023)",
            year = "2023",
            tags = listOf("Automotive", "Exposure"),
            summary = "In 2023, Toyota revealed that a cloud misconfiguration had exposed vehicle location and customer data of more than 2 million customers in Japan for about a decade.",
            details = "A cloud database holding vehicle data was set to public access, exposing customer names, vehicle identification numbers, and location data. Toyota apologised and fixed the configuration. The case showed that cloud misconfigurations can persist for years, and that vehicle data is location data.",
            lessons = listOf("Audit cloud configurations regularly. A misconfiguration can persist for years undetected.", "Vehicle data is location data. Treat it as sensitive personal data."),
            source = "Toyota (2023)"
        ),
        CaseStudy(
            id = "roku-2024",
            title = "Roku Credential Stuffing (2024)",
            year = "2024",
            tags = listOf("Streaming", "Credential Stuffing"),
            summary = "In 2024, Roku revealed that attackers had accessed about 576,000 accounts through credential stuffing, using passwords leaked from other services.",
            details = "Attackers used leaked credentials to log into Roku accounts, then changed account details and, in a small number of cases, made unauthorised purchases. Roku forced password resets and expanded two-factor authentication. The attack did not breach Roku's systems; it breached users' password reuse.",
            lessons = listOf("Credential stuffing works because passwords are reused. Unique passwords defeat it.", "Enable two-factor authentication on streaming accounts linked to payment methods."),
            source = "Roku (2024)"
        ),
        CaseStudy(
            id = "staples-breach-2014",
            title = "Staples Breach (2014)",
            year = "2014",
            tags = listOf("Retail", "POS", "Breach"),
            summary = "Office retailer Staples suffered a point-of-sale breach in 2014 exposing payment card data from more than 100 stores, after malware was installed on payment systems.",
            details = "Attackers installed malware on Staples' POS systems that captured card data as customers paid. Staples disclosed the breach and offered identity protection. The case, following Target and Home Depot, showed that POS malware was an industry-wide pattern affecting retailers of all kinds.",
            lessons = listOf("POS malware affects all retail, not only large chains. Monitor payment systems continuously.", "Segment payment systems from other networks, and encrypt card data end to end."),
            source = "Staples (2014)"
        ),
        CaseStudy(
            id = "imgur-breach-2017",
            title = "Imgur Breach (2017)",
            year = "2017",
            tags = listOf("Social", "Breach"),
            summary = "Image-sharing site Imgur suffered a breach, disclosed in 2017, exposing email addresses and hashed passwords of about 1.7 million users from a 2014 intrusion.",
            details = "The stolen data surfaced years after the intrusion, revealing that Imgur had been breached in 2014 without detection. Imgur notified users and forced password resets. The case showed that breach discovery can lag intrusion by years, and that old credential data remains valuable.",
            lessons = listOf("Old credential data remains valuable. Change passwords after a breach, even years later.", "Monitor for your data appearing in breach collections, not only for new breaches."),
            source = "Imgur (2017)"
        ),
        CaseStudy(
            id = "reddit-breach-2018",
            title = "Reddit Breach (2018)",
            year = "2018",
            tags = listOf("Social", "Breach"),
            summary = "Reddit suffered a breach in 2018 exposing user data including email addresses and hashed passwords, after attackers bypassed SMS-based two-factor authentication.",
            details = "Attackers compromised employee accounts by intercepting SMS two-factor codes, then accessed Reddit's systems and stole user data and internal logs. Reddit disclosed the breach and urged users to switch to app-based authentication. The case showed that SMS two-factor authentication can be bypassed.",
            lessons = listOf("SMS two-factor authentication is the weakest second factor. Use app-based or hardware authentication.", "Employee accounts with broad access need the strongest authentication available."),
            source = "Reddit (2018)"
        ),
        CaseStudy(
            id = "shopify-breach-2020",
            title = "Shopify Rogue Employees (2020)",
            year = "2020",
            tags = listOf("E-commerce", "Insider"),
            summary = "In 2020, Shopify revealed that two rogue support employees had accessed customer transaction data of merchants, in an insider breach.",
            details = "The employees accessed transaction records of merchants using Shopify's platform, violating company policy and customer trust. Shopify terminated the employees, notified affected merchants, and referred the matter to law enforcement. The case showed that support staff with broad data access are an insider risk.",
            lessons = listOf("Support staff access to customer data needs limits, logging, and review.", "Insider breaches need prompt notification to affected customers, not only internal discipline."),
            source = "Shopify (2020)"
        ),
        CaseStudy(
            id = "robinhood-breach-2021",
            title = "Robinhood Breach (2021)",
            year = "2021",
            tags = listOf("Finance", "Social Engineering"),
            summary = "Trading app Robinhood suffered a breach in 2021 exposing personal data of about 7 million users, after an attacker socially engineered a support employee.",
            details = "The attacker called a support employee, impersonated an authorised person, and obtained access to customer support systems, stealing names, email addresses, and partial account details. Robinhood notified users and regulators. The case showed that support staff are targets for social engineering, and that their access is valuable.",
            lessons = listOf("Support staff are targets for social engineering. Train them and verify identities rigorously.", "Limit support access to what the job requires, and log it."),
            source = "Robinhood (2021)"
        ),
        CaseStudy(
            id = "kickstarter-breach-2013",
            title = "Kickstarter Breach (2013)",
            year = "2013",
            tags = listOf("Crowdfunding", "Breach"),
            summary = "Crowdfunding platform Kickstarter suffered a breach in 2013 exposing user data including usernames, email addresses, and encrypted passwords.",
            details = "Attackers accessed Kickstarter's systems and stole user credentials. Kickstarter notified users and forced password resets, and said payment data was not accessed. The case showed that crowdfunding platforms, holding data of creators and backers, are targets like any other platform.",
            lessons = listOf("Crowdfunding platforms hold creator and backer data. Their security matters.", "Use unique passwords for crowdfunding sites, and enable two-factor authentication where available."),
            source = "Kickstarter (2014)"
        ),
        CaseStudy(
            id = "lastpass-breach-2015",
            title = "LastPass Breach (2015)",
            year = "2015",
            tags = listOf("Password Manager", "Breach"),
            summary = "Password manager LastPass suffered a breach in 2015 exposing user email addresses, password reminders, and encrypted master password hashes.",
            details = "Attackers accessed LastPass's network and stole account data, though encrypted vaults were not directly exposed. LastPass forced master password changes and expanded protections. The case showed that password managers are high-value targets, and that their security architecture — encrypted vaults — limits breach impact.",
            lessons = listOf("Password managers are high-value targets. Choose one with strong encryption and a good security record.", "A strong, unique master password is critical. It protects every other password."),
            source = "LastPass (2015)"
        ),
        CaseStudy(
            id = "zomato-breach-2017",
            title = "Zomato Breach (2017)",
            year = "2017",
            tags = listOf("Food", "Breach"),
            summary = "Food delivery platform Zomato suffered a breach in 2017 exposing data of about 17 million users, including email addresses and hashed passwords.",
            details = "Attackers accessed Zomato's database and stole user credentials, later offering the data for sale. Zomato notified users and forced password resets. The case showed that food delivery platforms hold data of millions, and that their breach enables credential stuffing elsewhere.",
            lessons = listOf("Food delivery apps hold personal data at scale. Their security matters.", "Use unique passwords for delivery apps, and monitor accounts after a breach."),
            source = "Zomato (2017)"
        ),
        CaseStudy(
            id = "wishbone-breach-2020",
            title = "Wishbone Breach (2020)",
            year = "2020",
            tags = listOf("Social", "Breach"),
            summary = "Comparison app Wishbone suffered a breach in 2020 exposing data of about 40 million users, including names, email addresses, and phone numbers.",
            details = "The stolen data was offered for sale online, revealing that Wishbone had been breached. The app, popular with teenagers, held data of young users, making the breach particularly sensitive. Wishbone notified users and forced password resets.",
            lessons = listOf("Apps popular with young users hold sensitive data. Their security needs particular care.", "Monitor for your data appearing for sale. Criminal markets often reveal breaches first."),
            source = "Wishbone and reporting (2020)"
        ),
        CaseStudy(
            id = "clubhouse-scrape-2021",
            title = "Clubhouse Data Scrape (2021)",
            year = "2021",
            tags = listOf("Social", "Scraping"),
            summary = "In 2021, data of about 1.3 million Clubhouse users was published online, after being scraped from the platform's API.",
            details = "The scraped data included names, social media handles, and follower counts, published on a hacking forum. Clubhouse said no sensitive data was exposed, but the data enabled social engineering and impersonation. The case showed that even 'public' profile data, collected at scale, is valuable.",
            lessons = listOf("Public profile data, collected at scale, enables impersonation and social engineering.", "Limit what your public profile reveals, even on platforms that feel private."),
            source = "Clubhouse and reporting (2021)"
        ),
        CaseStudy(
            id = "duolingo-scrape-2023",
            title = "Duolingo Data Scrape (2023)",
            year = "2023",
            tags = listOf("Education", "Scraping"),
            summary = "In 2023, data of about 2.6 million Duolingo users was published online, after being scraped from the platform's API.",
            details = "Attackers used Duolingo's API to match email addresses to public profile data, then published the results. Duolingo said the data was public, but the matching of emails to profiles made it useful for phishing. The case showed that APIs that match identifiers to profiles are a leak vector.",
            lessons = listOf("An API that matches email addresses to profiles enables phishing at scale.", "Limit what your public profile reveals, and use a dedicated email for learning platforms."),
            source = "Duolingo and reporting (2023)"
        ),
        CaseStudy(
            id = "dell-breach-2024",
            title = "Dell Breach (2024)",
            year = "2024",
            tags = listOf("Technology", "Breach"),
            summary = "Dell suffered a breach in 2024 exposing data of about 49 million customers, after attackers accessed a partner portal.",
            details = "Attackers accessed a Dell partner portal and stole customer names, addresses, and hardware details. Dell notified customers and said payment data was not accessed. The case showed that partner portals, holding customer data for support and sales, are targets.",
            lessons = listOf("Partner portals holding customer data need strong access controls and monitoring.", "Hardware details linked to customers are personal data. Treat them as such."),
            source = "Dell (2024)"
        ),
        CaseStudy(
            id = "adidas-breach-2025",
            title = "Adidas Breach (2025)",
            year = "2025",
            tags = listOf("Retail", "Third Party"),
            summary = "In 2025, Adidas revealed that attackers had accessed customer data through a third-party customer service provider.",
            details = "The attackers accessed contact details of customers who had contacted Adidas support, through a provider's systems. Adidas notified affected customers and regulators. The case reinforced that third-party support providers holding customer contact data are part of a brand's security boundary.",
            lessons = listOf("Third-party support providers hold customer contact data. Their security is your security.", "Customers who contact support expect their details to be protected. Vet providers accordingly."),
            source = "Adidas (2025)"
        ),
        CaseStudy(
            id = "tumblr-breach-2013",
            title = "Tumblr Breach (2013)",
            year = "2013",
            tags = listOf("Social", "Breach"),
            summary = "Blogging platform Tumblr suffered a breach in 2013, disclosed in 2016, exposing email addresses and hashed passwords of about 65 million users.",
            details = "The stolen data surfaced years after the intrusion, in breach collections used for credential stuffing. Tumblr notified users and forced password resets. The case showed that old breaches remain dangerous, because credential data does not expire.",
            lessons = listOf("Old credential data remains valuable. Change passwords after a breach, even years later.", "Monitor breach collections for your data, not only for new breach announcements."),
            source = "Tumblr (2016)"
        ),
        CaseStudy(
            id = "dailymotion-breach-2016",
            title = "Dailymotion Breach (2016)",
            year = "2016",
            tags = listOf("Video", "Breach"),
            summary = "Video platform Dailymotion suffered a breach in 2016 exposing data of about 85 million users, including email addresses and hashed passwords.",
            details = "Attackers accessed Dailymotion's systems and stole user credentials, later offered for sale online. Dailymotion notified users and forced password resets. The case showed that video platforms, like social platforms, hold credential data worth stealing at scale.",
            lessons = listOf("Video platforms hold credential data at scale. Use unique passwords for them.", "Monitor for your data appearing for sale. Criminal markets often reveal breaches first."),
            source = "Dailymotion (2016)"
        ),
        CaseStudy(
            id = "disqus-breach-2017",
            title = "Disqus Breach (2017)",
            year = "2017",
            tags = listOf("Comments", "Breach"),
            summary = "Comment platform Disqus suffered a breach, disclosed in 2017, exposing data of about 17.5 million users from a 2012 intrusion.",
            details = "Attackers accessed Disqus's database in 2012 and stole email addresses and hashed passwords, which surfaced years later. Disqus notified users and forced password resets. The case showed that comment platforms, embedded on many sites, hold credential data that remains valuable for years.",
            lessons = listOf("Comment platforms hold credentials used across many sites. Their breach affects everywhere you commented.", "Use unique passwords for comment and forum accounts, not only for major services."),
            source = "Disqus (2017)"
        ),
        CaseStudy(
            id = "houzz-breach-2019",
            title = "Houzz Breach (2019)",
            year = "2019",
            tags = listOf("Home", "Breach"),
            summary = "Home design platform Houzz suffered a breach in 2019 exposing data of about 57 million users, including names, email addresses, and encrypted passwords.",
            details = "Attackers accessed Houzz's systems and stole user data, later offered for sale online. Houzz notified users and forced password resets. The case showed that home platforms, holding data about users' homes and projects, are targets like any other platform.",
            lessons = listOf("Home platforms hold data about your home. Their security matters.", "Use unique passwords for home and design platforms, and monitor accounts after a breach."),
            source = "Houzz (2019)"
        ),
        CaseStudy(
            id = "linkedin-scrape-2021",
            title = "LinkedIn Data Scraping (2021)",
            year = "2021",
            tags = listOf("Professional", "Scraping"),
            summary = "In 2021, data scraped from LinkedIn profiles of about 700 million users was offered for sale online, after being collected from public profiles.",
            details = "The scraped data included names, email addresses, phone numbers, and employment details, collected from public profiles at scale. LinkedIn said no private data was exposed, but the aggregated data enabled phishing and impersonation. The case showed that professional profiles, designed to be public, are scraped at scale.",
            lessons = listOf("Professional profiles are scraped at scale. Limit what your public profile reveals.", "Aggregated public data enables phishing. Verify unexpected professional contacts independently."),
            source = "LinkedIn and reporting (2021)"
        ),
        CaseStudy(
            id = "twitter-api-leak-2023",
            title = "Twitter API Data Leak (2023)",
            year = "2023",
            tags = listOf("Social", "API"),
            summary = "In 2023, data of more than 200 million Twitter users was published online, after being collected through an API vulnerability in 2021.",
            details = "Attackers exploited a Twitter API flaw that let them match email addresses and phone numbers to accounts, then published the resulting dataset. Twitter said no passwords were exposed, but the matched identifiers enabled phishing and account takeover attempts. The case showed that API flaws matching identifiers to accounts are critical.",
            lessons = listOf("An API that matches identifiers to accounts is a critical vulnerability. Fix it promptly.", "Matched email addresses and phone numbers enable phishing. Verify unexpected messages independently."),
            source = "Twitter and reporting (2023)"
        ),
        CaseStudy(
            id = "reddit-blackcat-2023",
            title = "Reddit BlackCat Breach (2023)",
            year = "2023",
            tags = listOf("Social", "Phishing"),
            summary = "In 2023, Reddit suffered a breach in which attackers used phishing to access an employee's credentials and steal internal data, then demanded a ransom.",
            details = "The attackers sent a sophisticated phishing message to a Reddit employee, obtained credentials and two-factor codes, and accessed internal systems. Reddit refused to pay the ransom demand. The case showed that even companies with strong security cultures are vulnerable to targeted phishing of employees.",
            lessons = listOf("Targeted phishing of employees bypasses technical controls. Train staff and verify identities.", "Refusing to pay a ransom is viable with preparation: backups, communication, and incident response."),
            source = "Reddit (2023)"
        ),
        CaseStudy(
            id = "clixsense-breach-2016",
            title = "ClixSense Breach (2016)",
            year = "2016",
            tags = listOf("Survey", "Breach"),
            summary = "Paid survey site ClixSense suffered a breach in 2016 exposing data of about 2.2 million users, including names, email addresses, and hashed passwords.",
            details = "Attackers accessed ClixSense's database and stole user credentials, later offered for sale online. The site, which paid users for surveys, held payment-related data as well. ClixSense notified users and forced password resets. The case showed that small survey and rewards sites hold valuable data.",
            lessons = listOf("Small rewards and survey sites hold payment-linked data. Their security matters.", "Use unique passwords for small sites, not only for major services."),
            source = "ClixSense and reporting (2016)"
        ),
        CaseStudy(
            id = "gearbest-leak-2019",
            title = "Gearbest Data Leak (2019)",
            year = "2019",
            tags = listOf("E-commerce", "Exposure"),
            summary = "In 2019, Chinese e-commerce site Gearbest was found to expose customer data, including names, addresses, and payment details, through an unprotected database.",
            details = "A security researcher found that Gearbest's database was publicly accessible without a password, exposing millions of customer records. The company fixed the flaw after disclosure. The case showed that e-commerce databases, especially those holding payment details, need access controls, not only storage.",
            lessons = listOf("A public database is a publication. Verify access settings on every customer database.", "Payment details in a database need encryption and access controls, not only storage."),
            source = "Security researcher reporting (2019)"
        ),
        CaseStudy(
            id = "revolut-breach-2022",
            title = "Revolut Breach (2022)",
            year = "2022",
            tags = listOf("Fintech", "Breach"),
            summary = "Fintech company Revolut suffered a breach in 2022 exposing personal data of about 50,000 customers, after attackers accessed its systems through social engineering.",
            details = "Attackers used social engineering to access Revolut's systems and steal customer names, addresses, and partial account details. Revolut notified affected customers and regulators. The case showed that fintech companies, holding financial data, are targets for social engineering, not only for technical attacks.",
            lessons = listOf("Fintech support staff are targets for social engineering. Train them and verify identities.", "Partial account details still identify. Treat them as sensitive data."),
            source = "Revolut (2022)"
        ),
        CaseStudy(
            id = "casio-ransomware-2023",
            title = "Casio Ransomware Attack (2023)",
            year = "2023",
            tags = listOf("Manufacturing", "Ransomware"),
            summary = "In 2023, Casio suffered a ransomware attack that disrupted its systems and exposed personal data of employees and customers.",
            details = "Attackers encrypted Casio's systems and stole data, disrupting operations and forcing the company to restore from backups. Casio notified affected individuals and regulators. The case showed that manufacturers, like retailers, depend on IT for operations, and that ransomware disrupts both.",
            lessons = listOf("Manufacturing depends on IT. A ransomware attack is an operations shutdown.", "Backups and recovery plans must be tested before an attack, not during one."),
            source = "Casio (2023)"
        ),
        CaseStudy(
            id = "cleartrip-breach-2022",
            title = "Cleartrip Breach (2022)",
            year = "2022",
            tags = listOf("Travel", "Breach"),
            summary = "Indian travel platform Cleartrip suffered a breach in 2022 exposing customer data, after attackers accessed its systems.",
            details = "Cleartrip notified customers that some personal data had been accessed, and advised them to change passwords. The breach, affecting a travel platform, exposed travel-linked personal data. The case showed that travel platforms, holding itineraries and personal details, are targets.",
            lessons = listOf("Travel platforms hold itineraries and personal details. Their security matters.", "Change passwords promptly after a travel platform breach, and monitor accounts."),
            source = "Cleartrip (2022)"
        )
    )
}
