package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk cases, batch 5: 50 general cases, real incidents, public sources named. */
object CasesBulk5 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "rockyou2021-compilation",
            title = "RockYou2021 Compilation (2021)",
            year = "2021",
            tags = listOf("Credentials", "Compilation"),
            summary = "In 2021, a compilation of billions of passwords, dubbed RockYou2021, circulated online, aggregating passwords from many earlier breaches into one archive.",
            details = "The archive combined passwords from many breaches, making credential stuffing easier at scale. Researchers noted it was largely a compilation of older data, not a single new breach. The case shows that password compilations make reuse dangerous long after the original breaches.",
            lessons = listOf("Password compilations make reuse dangerous long after original breaches.", "Unique passwords and two-factor authentication defeat credential stuffing."),
            source = "CyberNews (2021)"
        ),
        CaseStudy(
            id = "collection-2-5-2019",
            title = "Collection #2–#5 (2019)",
            year = "2019",
            tags = listOf("Credentials", "Compilation"),
            summary = "In 2019, following Collection #1, researchers reported Collections #2 through #5, further massive aggregations of breached credentials circulating online.",
            details = "The collections together contained billions of records from many breaches. Troy Hunt's Have I Been Pwned service expanded to help users check exposure. The case shows that breach data is traded in collections, and that checking exposure is a routine hygiene step.",
            lessons = listOf("Breach data circulates in collections. Check exposure routinely.", "Credential stuffing uses collections. Unique passwords and two-factor authentication are the defence."),
            source = "Troy Hunt / Have I Been Pwned (2019)"
        ),
        CaseStudy(
            id = "discord-breach-2023",
            title = "Discord Breach (2023)",
            year = "2023",
            tags = listOf("Breach", "Support"),
            summary = "Discord suffered a breach in 2023 in which attackers compromised a third-party support agent's account and accessed user data, including email addresses and support messages.",
            details = "Discord said the breach affected a small number of users and that it had disabled the compromised account. The case shows that support agents are attack paths, and that support messages can contain sensitive data.",
            lessons = listOf("Support agents are attack paths. Protect support tooling strictly.", "Support messages can contain sensitive data. Minimise what support stores."),
            source = "Discord (2023)"
        ),
        CaseStudy(
            id = "ea-breach-2021",
            title = "EA Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Source Code"),
            summary = "Electronic Arts suffered a breach in 2021 in which attackers stole source code and tools, after using social engineering and stolen Slack cookies to access internal systems.",
            details = "The attackers, linked to Lapsus, tricked an employee into granting access, then stole FIFA source code and tools. EA said player data was not affected. The case shows that Slack cookies are credentials, and that social engineering defeats technical controls.",
            lessons = listOf("Slack cookies are credentials. Protect session tokens like passwords.", "Social engineering on employees defeats technical controls. Verify identities."),
            source = "Electronic Arts (2021)"
        ),
        CaseStudy(
            id = "riot-breach-2023",
            title = "Riot Games Breach (2023)",
            year = "2023",
            tags = listOf("Ransomware", "Gaming"),
            summary = "Riot Games suffered a breach in 2023 in which attackers stole source code for League of Legends and Teamfight Tactics, after a social engineering attack.",
            details = "Riot refused to pay the ransom, and the attackers published some source code. Riot said player data was not affected. The case shows that game source code is a ransomware target, and that refusing ransom has publication consequences.",
            lessons = listOf("Game source code is a ransomware target. Protect it like customer data.", "Refusing ransom has publication consequences. Prevention matters more."),
            source = "Riot Games (2023)"
        ),
        CaseStudy(
            id = "capcom-ransomware-2020",
            title = "Capcom Ransomware Attack (2020)",
            year = "2020",
            tags = listOf("Ransomware", "Gaming"),
            summary = "Capcom suffered a ransomware attack in 2020 in which the Ragnar Locker group stole data and disrupted systems, after accessing internal networks.",
            details = "Capcom said personal data of customers and employees was exposed, and that game development was affected. The case shows that game publishers hold employee and customer data worth stealing, and that ransomware disrupts development.",
            lessons = listOf("Game publishers hold employee and customer data worth stealing.", "Ransomware disrupts development. Segment development networks from office networks."),
            source = "Capcom (2020)"
        ),
        CaseStudy(
            id = "cdpr-ransomware-2021",
            title = "CD Projekt Red Ransomware Attack (2021)",
            year = "2021",
            tags = listOf("Ransomware", "Gaming"),
            summary = "CD Projekt Red suffered a ransomware attack in 2021 in which the HelloKitty group stole source code for Cyberpunk 2077 and The Witcher 3, and threatened publication.",
            details = "The studio refused to pay, and source code was later auctioned and published. The case shows that unreleased and released game code are both targets, and that refusal has publication costs.",
            lessons = listOf("Game source code is a high-value target for ransomware groups.", "Refusing ransom has publication costs. Protect code repositories strictly."),
            source = "CD Projekt Red (2021)"
        ),
        CaseStudy(
            id = "bandai-namco-2022",
            title = "Bandai Namco Breach (2022)",
            year = "2022",
            tags = listOf("Ransomware", "Gaming"),
            summary = "Bandai Namco suffered a breach in 2022 in which the BlackByte group claimed to have stolen data, after accessing internal systems.",
            details = "The publisher confirmed a breach and said it was investigating. The case shows that game publishers are ransomware targets regardless of size, and that disclosure timing matters for customers.",
            lessons = listOf("Game publishers of all sizes are ransomware targets.", "Breach disclosure timing matters. Notify customers when scope is understood."),
            source = "Bandai Namco (2022)"
        ),
        CaseStudy(
            id = "2k-support-2022",
            title = "2K Support Hack (2022)",
            year = "2022",
            tags = listOf("Breach", "Support"),
            summary = "2K suffered a hack in 2022 in which attackers compromised its support tool and sent malicious emails to customers, after accessing a third-party vendor account.",
            details = "2K warned customers not to click links in support emails and reset passwords. The case shows that support tools are attack paths, and that vendor accounts are part of the attack surface.",
            lessons = listOf("Support tools are attack paths. Protect vendor accounts strictly.", "Vendor compromise becomes customer phishing. Warn customers quickly."),
            source = "2K Games (2022)"
        ),
        CaseStudy(
            id = "activision-phishing-2023",
            title = "Activision Phishing Attack (2023)",
            year = "2023",
            tags = listOf("Phishing", "Gaming"),
            summary = "Activision suffered a phishing attack in 2023 in which attackers tricked an employee and accessed internal systems, stealing employee data and game schedules.",
            details = "The attack used SMS phishing to steal credentials and two-factor codes. Activision said player data was not affected. The case shows that SMS phishing defeats SMS two-factor authentication, and that employee data is a target.",
            lessons = listOf("SMS phishing defeats SMS two-factor authentication. Use app-based or hardware factors.", "Employee data is a target. Protect staff accounts like customer accounts."),
            source = "Activision (2023)"
        ),
        CaseStudy(
            id = "roblox-leak-2023",
            title = "Roblox Leak (2023)",
            year = "2023",
            tags = listOf("Breach", "Gaming"),
            summary = "Roblox suffered a leak in 2023 in which personal data of creator conference attendees, including names and emails, was published online.",
            details = "The data came from a 2020 conference attendee list and surfaced in 2023. Roblox said it was investigating. The case shows that event attendee lists are personal data, and that old lists resurface years later.",
            lessons = listOf("Event attendee lists are personal data. Protect them long-term.", "Old lists resurface years later. Minimise retention of event data."),
            source = "Roblox (2023)"
        ),
        CaseStudy(
            id = "decathlon-exposure-2020",
            title = "Decathlon Exposure (2020)",
            year = "2020",
            tags = listOf("Exposure", "Retail"),
            summary = "In 2020, Decathlon left a database exposed online, revealing personal data of millions of customers and employees, after a server misconfiguration.",
            details = "Researchers found an Elasticsearch database containing names, emails, and addresses. Decathlon secured it after disclosure. The case shows that retail databases are exposure risks, and that cloud misconfiguration is a recurring cause.",
            lessons = listOf("Cloud misconfiguration is a recurring exposure cause. Audit database permissions.", "Retail databases hold customer and employee data. Protect both."),
            source = "Decathlon (2020)"
        ),
        CaseStudy(
            id = "uniqlo-stuffing-2019",
            title = "Uniqlo Credential Stuffing (2019)",
            year = "2019",
            tags = listOf("Credential Stuffing", "Retail"),
            summary = "In 2019, Uniqlo's Japanese online store suffered credential stuffing attacks in which attackers used reused passwords to access hundreds of thousands of customer accounts.",
            details = "Fast Retailing said attackers accessed accounts and placed fraudulent orders. The case shows that retail accounts are credential stuffing targets, and that reuse is the root cause.",
            lessons = listOf("Retail accounts are credential stuffing targets. Use unique passwords.", "Fraudulent orders follow account takeover. Monitor accounts for unknown orders."),
            source = "Fast Retailing / Uniqlo (2019)"
        ),
        CaseStudy(
            id = "coop-cyberattack-2025",
            title = "Co-op Cyberattack (2025)",
            year = "2025",
            tags = listOf("Ransomware", "Retail"),
            summary = "The Co-op suffered a cyberattack in 2025 that disrupted food supplies to its UK stores, after attackers accessed its systems and the company shut down parts of its IT.",
            details = "The attack, linked to the DragonForce group, caused shortages in some stores. The Co-op said customer data was taken. The case shows that grocery supply chains are cyber targets, and that shutdown is a containment cost.",
            lessons = listOf("Grocery supply chains are cyber targets. Their disruption reaches shelves.", "System shutdown is a containment cost. Plan for it in incident response."),
            source = "Co-operative Group (2025)"
        ),
        CaseStudy(
            id = "harrods-cyberattack-2025",
            title = "Harrods Cyberattack (2025)",
            year = "2025",
            tags = listOf("Cyberattack", "Retail"),
            summary = "Harrods suffered a cyberattack in 2025 in which attackers attempted to access its systems, prompting the retailer to restrict internet access at its sites.",
            details = "Harrods said it had taken proactive steps and that stores remained open. The case followed attacks on other UK retailers that year, showing that retail is targeted in waves.",
            lessons = listOf("Retail is targeted in waves. One retailer's attack warns the sector.", "Proactive restriction is a containment choice. Plan for it."),
            source = "Harrods (2025)"
        ),
        CaseStudy(
            id = "kroger-accellion-2021",
            title = "Kroger Accellion Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Third Party"),
            summary = "Kroger suffered a breach in 2021 in which attackers exploited its Accellion file transfer appliance and accessed personal data of pharmacy and clinic customers.",
            details = "Kroger said the breach affected a small number of customers and that it had notified them. The case shows that file transfer appliances are attack surface, and that pharmacy data is sensitive health data.",
            lessons = listOf("File transfer appliances are attack surface. Patch and monitor them.", "Pharmacy data is health data. Protect it accordingly."),
            source = "Kroger (2021)"
        ),
        CaseStudy(
            id = "american-airlines-2022",
            title = "American Airlines Breach (2022)",
            year = "2022",
            tags = listOf("Breach", "Aviation"),
            summary = "American Airlines suffered a breach in 2022 in which attackers accessed personal data of customers and employees, after compromising employee email accounts.",
            details = "The airline said the breach affected a small number of people and that it had secured the accounts. The case shows that airline employee email is an attack path to customer data.",
            lessons = listOf("Employee email compromise exposes customer data. Protect staff accounts.", "Airline breaches expose travel data. Monitor accounts after them."),
            source = "American Airlines (2022)"
        ),
        CaseStudy(
            id = "airasia-ransomware-2022",
            title = "AirAsia Ransomware Attack (2022)",
            year = "2022",
            tags = listOf("Ransomware", "Aviation"),
            summary = "AirAsia suffered a ransomware attack in 2022 in which the Daixin group claimed to have stolen personal data of millions of passengers and employees.",
            details = "AirAsia said it was investigating and that operations were not affected. The case shows that airlines are ransomware targets for passenger data, and that operations can continue while data is stolen.",
            lessons = listOf("Airlines are ransomware targets for passenger data.", "Operations continuing does not mean data is safe. Investigate data theft separately."),
            source = "AirAsia (2022)"
        ),
        CaseStudy(
            id = "cash-app-2022",
            title = "Cash App Breach (2022)",
            year = "2022",
            tags = listOf("Breach", "Finance"),
            summary = "Cash App suffered a breach in 2022 in which a former employee accessed reports containing personal data of millions of US customers.",
            details = "Block disclosed that a former employee downloaded reports after leaving the company. The case shows that former employee access is a risk, and that access must be revoked promptly on departure.",
            lessons = listOf("Former employee access is a risk. Revoke access promptly on departure.", "Reports containing customer data need access controls and download monitoring."),
            source = "Block / Cash App (2022)"
        ),
        CaseStudy(
            id = "mercado-libre-2022",
            title = "Mercado Libre Breach (2022)",
            year = "2022",
            tags = listOf("Breach", "E-commerce"),
            summary = "Mercado Libre suffered a breach in 2022 in which the Lapsus group accessed source code and personal data of hundreds of thousands of users.",
            details = "The company said the breach affected a small portion of users and that operations were not affected. The case shows that Latin American e-commerce giants are Lapsus targets, and that source code theft accompanies data theft.",
            lessons = listOf("E-commerce giants are targeted for source code as well as data.", "Lapsus-style groups target large firms systematically."),
            source = "Mercado Libre (2022)"
        ),
        CaseStudy(
            id = "virgin-media-2020",
            title = "Virgin Media Exposure (2020)",
            year = "2020",
            tags = listOf("Exposure", "Telecom"),
            summary = "In 2020, Virgin Media left a database exposed online, revealing personal data of hundreds of thousands of customers, after a database was left unprotected.",
            details = "Virgin Media said the database was used for marketing and was not hacked, but was accessible. The case shows that marketing databases are exposure risks, and that 'not hacked' does not mean 'not exposed'.",
            lessons = listOf("'Not hacked' does not mean 'not exposed'. Unprotected databases expose data.", "Marketing databases hold customer data. Protect them like production systems."),
            source = "Virgin Media (2020)"
        ),
        CaseStudy(
            id = "visible-stuffing-2021",
            title = "Visible Credential Stuffing (2021)",
            year = "2021",
            tags = listOf("Credential Stuffing", "Telecom"),
            summary = "In 2021, Visible, Verizon's digital carrier, suffered credential stuffing attacks in which attackers used reused passwords to access customer accounts and change addresses.",
            details = "Visible said attackers used credentials from other breaches. Customers reported unauthorised orders. The case shows that telecom accounts are credential stuffing targets, and that address changes enable further fraud.",
            lessons = listOf("Telecom accounts are credential stuffing targets. Use unique passwords.", "Address changes on telecom accounts enable further fraud. Monitor them."),
            source = "Visible (2021)"
        ),
        CaseStudy(
            id = "fujitsu-breach-2021",
            title = "Fujitsu Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Technology"),
            summary = "Fujitsu suffered a breach in 2021 in which attackers accessed its ProjectWEB tool and stole data, including Japanese government information.",
            details = "Fujitsu suspended the tool and said it was investigating. The case shows that collaboration tools holding government data are targets, and that tool suspension is a containment cost.",
            lessons = listOf("Collaboration tools holding government data are targets.", "Tool suspension is a containment cost. Plan for it."),
            source = "Fujitsu (2021)"
        ),
        CaseStudy(
            id = "panasonic-breach-2021",
            title = "Panasonic Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Manufacturing"),
            summary = "Panasonic suffered a breach in 2021 in which attackers accessed internal servers and stole data, after exploiting a vulnerability.",
            details = "Panasonic said the breach affected a subsidiary and that it was strengthening security. The case shows that manufacturing giants are breached through subsidiaries, and that subsidiary security is group security.",
            lessons = listOf("Subsidiary security is group security. Breaches enter through subsidiaries.", "Manufacturing giants are breached through vulnerabilities. Patch promptly."),
            source = "Panasonic (2021)"
        ),
        CaseStudy(
            id = "geisinger-2024",
            title = "Geisinger Breach (2024)",
            year = "2024",
            tags = listOf("Breach", "Healthcare"),
            summary = "Geisinger suffered a breach in 2024 in which a former employee of a vendor accessed personal data of more than a million patients.",
            details = "Geisinger said a former Nuance employee accessed patient data after leaving. The case shows that vendor former employees are a risk, and that vendor access must be revoked on departure.",
            lessons = listOf("Vendor former employees are a risk. Revoke vendor access on departure.", "Health systems must audit vendor access, not only employee access."),
            source = "Geisinger (2024)"
        ),
        CaseStudy(
            id = "lurie-childrens-2024",
            title = "Lurie Children's Ransomware Attack (2024)",
            year = "2024",
            tags = listOf("Ransomware", "Healthcare"),
            summary = "Lurie Children's Hospital suffered a ransomware attack in 2024 that shut down its network for weeks, forcing a return to manual processes and delaying care.",
            details = "The Rhysida group claimed the attack. The hospital took systems offline and restored them over weeks. The case shows that children's hospitals are ransomware targets, and that paediatric care disruption is especially serious.",
            lessons = listOf("Children's hospitals are ransomware targets. Their disruption delays paediatric care.", "Hospital network shutdowns last weeks. Manual fallbacks must sustain care."),
            source = "Lurie Children's Hospital (2024)"
        ),
        CaseStudy(
            id = "deviantart-breach-2016",
            title = "DeviantArt Breach (2016)",
            year = "2016",
            tags = listOf("Breach", "Credentials"),
            summary = "DeviantArt suffered a breach in 2016 exposing usernames, emails, and hashed passwords of millions of users, after attackers accessed its systems.",
            details = "DeviantArt disclosed the breach and reset passwords. The case shows that art communities hold credentials reused elsewhere, and that breach disclosure and resets are the standard response.",
            lessons = listOf("Art communities hold reused credentials. Protect them like any account.", "After a breach, change the password and any reused copies elsewhere."),
            source = "DeviantArt (2016)"
        ),
        CaseStudy(
            id = "spotify-stuffing-2020",
            title = "Spotify Credential Stuffing (2020)",
            year = "2020",
            tags = listOf("Credential Stuffing", "Music"),
            summary = "In 2020, Spotify accounts were accessed through credential stuffing, with attackers using reused passwords from other breaches to take over accounts and change details.",
            details = "Spotify said its systems were not breached, but that attackers used credentials from other breaches. The case shows that music accounts are stuffing targets, and that reuse is the root cause.",
            lessons = listOf("Music accounts are stuffing targets. Use unique passwords.", "Credential stuffing harms users without breaching the target."),
            source = "Spotify (2020)"
        ),
        CaseStudy(
            id = "disney-plus-stuffing-2019",
            title = "Disney+ Credential Stuffing (2019)",
            year = "2019",
            tags = listOf("Credential Stuffing", "Streaming"),
            summary = "In 2019, Disney+ accounts were accessed through credential stuffing shortly after launch, with attackers using reused passwords to take over accounts and sell access.",
            details = "Disney said its systems were not breached, but that attackers used credentials from other breaches. The case shows that streaming launches attract stuffing, and that reuse is the root cause.",
            lessons = listOf("Streaming launches attract credential stuffing. Use unique passwords.", "Account takeover enables resale. Monitor accounts for unknown devices."),
            source = "Disney+ (2019)"
        ),
        CaseStudy(
            id = "gettr-breach-2021",
            title = "Gettr Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Social Media"),
            summary = "Gettr suffered a breach in 2021 shortly after launch, in which attackers accessed user data, including emails and locations, through an API vulnerability.",
            details = "The social platform said it was investigating and fixing the issue. The case shows that new platforms launch with API vulnerabilities, and that early users face early breaches.",
            lessons = listOf("New platforms launch with API vulnerabilities. Early users face early breaches.", "API security is platform security. Test APIs before launch."),
            source = "Gettr (2021)"
        ),
        CaseStudy(
            id = "paypal-stuffing-2022",
            title = "PayPal Credential Stuffing (2022)",
            year = "2022",
            tags = listOf("Credential Stuffing", "Finance"),
            summary = "In 2022, PayPal suffered credential stuffing attacks in which attackers used reused passwords to access tens of thousands of accounts and view personal data.",
            details = "PayPal said the attacks occurred over two days and that it had reset passwords and notified users. The case shows that payment accounts are stuffing targets, and that two-factor authentication is essential for money accounts.",
            lessons = listOf("Payment accounts are stuffing targets. Use unique passwords and two-factor authentication.", "Credential stuffing on payment accounts enables fraud. Monitor transactions."),
            source = "PayPal (2022)"
        ),
        CaseStudy(
            id = "klarna-incident-2021",
            title = "Klarna Incident (2021)",
            year = "2021",
            tags = listOf("Exposure", "Finance"),
            summary = "In 2021, Klarna suffered an incident in which users logging in saw other users' account details, after a bug in its app exposed session data.",
            details = "Klarna took the app offline briefly and said the issue was a bug, not a breach. The case shows that session bugs expose data like breaches, and that taking systems offline is a containment choice.",
            lessons = listOf("Session bugs expose data like breaches. Test session handling rigorously.", "Taking systems offline is a containment choice. Plan for it."),
            source = "Klarna (2021)"
        ),
        CaseStudy(
            id = "sega-pass-2011",
            title = "Sega Pass Breach (2011)",
            year = "2011",
            tags = listOf("Breach", "Gaming"),
            summary = "Sega suffered a breach in 2011 in which attackers accessed its Sega Pass system and stole personal data of millions of users, after the LulzSec group targeted the company.",
            details = "Sega took the service offline and reset passwords. The case shows that gaming account systems were early hacktivist targets, and that service shutdown is a containment cost.",
            lessons = listOf("Gaming account systems are hacktivist targets. Protect them accordingly.", "Service shutdown is a containment cost. Plan for it."),
            source = "Sega (2011)"
        ),
        CaseStudy(
            id = "livejournal-breach-2017",
            title = "LiveJournal Breach (2017)",
            year = "2017",
            tags = listOf("Breach", "Credentials"),
            summary = "LiveJournal suffered a breach in 2017 exposing usernames, emails, and hashed passwords of tens of millions of users, disclosed years later.",
            details = "The data surfaced for sale and was later added to breach databases. LiveJournal said it had no evidence of the breach at the time. The case shows that old blogging accounts hold reused credentials, and that disclosure delays leave users exposed.",
            lessons = listOf("Old blogging accounts hold reused credentials. Close or secure them.", "Disclosure delays leave users exposed. Disclose when scope is understood."),
            source = "LiveJournal (2017)"
        ),
        CaseStudy(
            id = "neopets-breach-2022",
            title = "Neopets Breach (2022)",
            year = "2022",
            tags = listOf("Breach", "Gaming"),
            summary = "Neopets suffered a breach in 2022 exposing names, emails, and hashed passwords of tens of millions of users, after attackers accessed its systems.",
            details = "Neopets disclosed the breach and reset passwords. The case shows that nostalgic gaming accounts hold credentials reused on important accounts, and that old games are still targets.",
            lessons = listOf("Nostalgic gaming accounts hold reused credentials. Protect them.", "Old games are still targets. Their breaches affect current accounts through reuse."),
            source = "Neopets (2022)"
        ),
        CaseStudy(
            id = "armor-games-2019",
            title = "Armor Games Breach (2019)",
            year = "2019",
            tags = listOf("Breach", "Gaming"),
            summary = "Armor Games suffered a breach in 2019 exposing usernames, emails, and hashed passwords of millions of users, as part of a larger set of breaches from the same period.",
            details = "The data appeared for sale in 2019. Armor Games reset passwords. The case shows that flash game sites hold credentials, and that breaches cluster by period and actor.",
            lessons = listOf("Flash game sites hold credentials. Protect them like any account.", "Breaches cluster by period and actor. One period's breaches affect many accounts."),
            source = "Armor Games (2019)"
        ),
        CaseStudy(
            id = "battlenet-breach-2012",
            title = "Battle.net Breach (2012)",
            year = "2012",
            tags = listOf("Breach", "Gaming"),
            summary = "Blizzard suffered a breach in 2012 in which attackers accessed its Battle.net system and stole emails, encrypted passwords, and security question answers.",
            details = "Blizzard said no financial data was accessed and that passwords were encrypted. The case shows that gaming account systems hold security answers, which are weak secrets, and that encryption is not a substitute for strong hashing.",
            lessons = listOf("Security answers are weak secrets. Do not rely on them.", "Encrypted passwords are not hashed passwords. Use strong, salted hashing."),
            source = "Blizzard Entertainment (2012)"
        ),
        CaseStudy(
            id = "onepassword-okta-2023",
            title = "1Password Okta Incident (2023)",
            year = "2023",
            tags = listOf("Breach", "Identity"),
            summary = "In 2023, 1Password detected suspicious activity on its Okta instance, after attackers used a compromised administrator account to access its identity system.",
            details = "1Password said the activity was blocked and that no customer data was accessed. The case shows that identity providers are targets, and that administrator accounts need the strongest protection.",
            lessons = listOf("Identity providers are targets. Protect administrator accounts above all.", "Suspicious activity detection must trigger immediate containment."),
            source = "1Password (2023)"
        ),
        CaseStudy(
            id = "slack-breach-2022",
            title = "Slack Breach (2022)",
            year = "2022",
            tags = listOf("Breach", "Workplace"),
            summary = "Slack suffered a breach in 2022 in which attackers used stolen employee tokens to access private code repositories, after compromising an employee's account.",
            details = "Slack said the breach did not affect customer data and that it had rotated credentials. The case shows that workplace chat tools hold code access, and that employee tokens are credentials.",
            lessons = listOf("Employee tokens are credentials. Rotate them after any compromise.", "Workplace tools hold code access. Protect them like production systems."),
            source = "Slack (2022)"
        ),
        CaseStudy(
            id = "docker-hub-2019",
            title = "Docker Hub Breach (2019)",
            year = "2019",
            tags = listOf("Breach", "Developer Tools"),
            summary = "Docker Hub suffered a breach in 2019 in which attackers accessed a database containing usernames, hashed passwords, and GitHub tokens for a small portion of users.",
            details = "Docker said the breach affected a small subset and that it had reset passwords and tokens. The case shows that container registries hold tokens that grant code access, and that token rotation is essential after breaches.",
            lessons = listOf("Container registries hold tokens granting code access. Rotate them after breaches.", "Developer platforms are targets. Protect their credentials strictly."),
            source = "Docker (2019)"
        ),
        CaseStudy(
            id = "mimecast-2021",
            title = "Mimecast Breach (2021)",
            year = "2021",
            tags = listOf("Breach", "Email Security"),
            summary = "Mimecast suffered a breach in 2021 in which attackers compromised a certificate used to authenticate its products to Microsoft 365, after a SolarWinds-related intrusion.",
            details = "Mimecast said a sophisticated actor had compromised the certificate and that it had replaced it. The case shows that email security vendors are targets, and that certificates are credentials.",
            lessons = listOf("Certificates are credentials. Compromise requires replacement, not only investigation.", "Email security vendors are targets. Their compromise affects customers."),
            source = "Mimecast (2021)"
        ),
        CaseStudy(
            id = "fireeye-redteam-2020",
            title = "FireEye Red Team Tools Theft (2020)",
            year = "2020",
            tags = listOf("Breach", "Security Vendor"),
            summary = "FireEye suffered a breach in 2020 in which attackers, later linked to the SolarWinds campaign, stole its Red Team assessment tools.",
            details = "FireEye disclosed the theft and published countermeasures for the tools. The disclosure led to discovery of the SolarWinds campaign. The case shows that security vendors are targets, and that disclosure can uncover larger campaigns.",
            lessons = listOf("Security vendors are targets. Their tools are worth stealing.", "Disclosure of one breach can uncover larger campaigns. Disclose promptly."),
            source = "FireEye (2020)"
        ),
        CaseStudy(
            id = "avast-breach-2019",
            title = "Avast Breach (2019)",
            year = "2019",
            tags = listOf("Breach", "Security Vendor"),
            summary = "Avast suffered a breach in 2019 in which attackers accessed its internal network through a compromised VPN profile, targeting its CCleaner development systems.",
            details = "Avast said the attackers attempted to compromise CCleaner again, after the 2017 incident. The case shows that security vendors are repeatedly targeted, and that VPN profiles are credentials.",
            lessons = listOf("VPN profiles are credentials. Protect and monitor them.", "Security vendors are repeatedly targeted. Assume persistence."),
            source = "Avast (2019)"
        ),
        CaseStudy(
            id = "ccleaner-supply-2017",
            title = "CCleaner Supply-Chain Attack (2017)",
            year = "2017",
            tags = listOf("Supply Chain", "Malware"),
            summary = "In 2017, attackers compromised CCleaner's build system and distributed a backdoored version of the popular cleaning tool to millions of users.",
            details = "The backdoor collected system information and targeted specific companies for a second stage. Avast, which owned CCleaner, disclosed the attack and issued a clean version. The case shows that build systems are supply-chain targets.",
            lessons = listOf("Build systems are supply-chain targets. Protect them like production.", "Popular tools are distribution channels. Verify software sources."),
            source = "Avast / CCleaner (2017)"
        ),
        CaseStudy(
            id = "asus-shadowhammer-2019",
            title = "ASUS ShadowHammer Attack (2019)",
            year = "2019",
            tags = listOf("Supply Chain", "Malware"),
            summary = "In 2019, attackers compromised ASUS's Live Update tool and distributed backdoored updates to a subset of users, targeting specific MAC addresses.",
            details = "Kaspersky Lab discovered the attack, which used a valid ASUS certificate to sign malicious updates. ASUS issued a fix and a detection tool. The case shows that update tools are supply-chain targets, and that valid certificates can sign malware.",
            lessons = listOf("Update tools are supply-chain targets. Monitor update channels.", "Valid certificates can sign malware. Certificate trust is not code trust."),
            source = "Kaspersky Lab / ASUS (2019)"
        ),
        CaseStudy(
            id = "kaspersky-duqu2-2015",
            title = "Kaspersky Duqu 2.0 Attack (2015)",
            year = "2015",
            tags = listOf("Malware", "Espionage"),
            summary = "In 2015, Kaspersky Lab revealed that it had been targeted by Duqu 2.0, a sophisticated espionage toolkit that exploited zero-day vulnerabilities to spy on the security firm.",
            details = "The attack used zero-days in Windows to gain persistence and steal information about Kaspersky's research. Kaspersky published technical details. The case shows that security firms are espionage targets, and that zero-days are used against defenders.",
            lessons = listOf("Security firms are espionage targets. Defenders are attacked too.", "Zero-days are used against defenders. Patch promptly and monitor deeply."),
            source = "Kaspersky Lab (2015)"
        ),
        CaseStudy(
            id = "f5-breach-2020",
            title = "F5 Breach (2020)",
            year = "2020",
            tags = listOf("Breach", "Technology"),
            summary = "F5 suffered a breach in 2020 in which a nation-state actor accessed its development network and stole source code for its BIG-IP products.",
            details = "F5 said the actor had long-term access and that it had not found evidence of customer data theft. The case shows that network product vendors are targets, and that source code theft threatens product trust.",
            lessons = listOf("Network product vendors are targets. Their source code is worth stealing.", "Long-term access indicates weak detection. Monitor development networks."),
            source = "F5 Networks (2020)"
        ),
        CaseStudy(
            id = "teamcity-attacks-2023",
            title = "TeamCity Attacks (2023)",
            year = "2023",
            tags = listOf("Exploit", "Developer Tools"),
            summary = "In 2023, attackers exploited vulnerabilities in JetBrains TeamCity servers to gain access and deploy malware, targeting build servers used by many organisations.",
            details = "Mandiant and JetBrains disclosed active exploitation of TeamCity vulnerabilities. The case shows that build servers are high-value targets, and that CI/CD vulnerabilities are exploited rapidly.",
            lessons = listOf("Build servers are high-value targets. Patch CI/CD vulnerabilities immediately.", "CI/CD exploitation is rapid. Monitor build servers for intrusion."),
            source = "JetBrains / Mandiant (2023)"
        ),
        CaseStudy(
            id = "goanywhere-2023",
            title = "GoAnywhere Breach (2023)",
            year = "2023",
            tags = listOf("Ransomware", "File Transfer"),
            summary = "In 2023, the Clop group exploited a vulnerability in Fortra's GoAnywhere file transfer tool to steal data from more than a hundred organisations.",
            details = "The zero-day vulnerability allowed attackers to access files without authentication. Fortra issued a patch and advised customers to review logs. The case shows that file transfer tools are mass-exploitation targets.",
            lessons = listOf("File transfer tools are mass-exploitation targets. Patch zero-days immediately.", "Zero-days in file transfer tools affect hundreds of organisations at once."),
            source = "Fortra (2023)"
        ),
        CaseStudy(
            id = "cleo-2024",
            title = "Cleo Breach (2024)",
            year = "2024",
            tags = listOf("Ransomware", "File Transfer"),
            summary = "In 2024, the Clop group exploited vulnerabilities in Cleo's file transfer products to steal data from dozens of organisations.",
            details = "Cleo issued patches and advised customers to mitigate. The case shows that file transfer products are repeatedly targeted by the same groups, and that patching must be immediate.",
            lessons = listOf("File transfer products are repeatedly targeted. Patch immediately on disclosure.", "The same groups return to file transfer tools. Assume repeated targeting."),
            source = "Cleo (2024)"
        )
    )
}
