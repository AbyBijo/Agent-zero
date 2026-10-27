package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk questions, batch 3: 90 questions for CH-11 to CH-15 briefs. */
object QuizBankBulk3 {
    val all: List<QuizQuestion> = listOf(
        QuizQuestion(
            prompt = "What is the core discipline for a team handling sensitive work?",
            options = listOf("Sharing everything for speed", "Need to know, consistently applied", "Trusting all members equally", "Keeping no records"),
            answerIndex = 1,
            rationale = "Need to know, consistently applied, limits every compromise to what one person knew.",
            id = "bulk-q201", briefKey = "team/team-discipline", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should a team do when a member makes a security mistake?",
            options = listOf("Punish them publicly", "Treat it as a learning event, fix the process, and share the lesson", "Hide it", "Remove them immediately"),
            answerIndex = 1,
            rationale = "Punishment drives mistakes underground. Learning events fix the process that allowed the mistake.",
            id = "bulk-q202", briefKey = "team/team-discipline", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is need to know hard to maintain?",
            options = listOf("It is unpopular", "Because convenience and curiosity constantly push against it", "Because it is expensive", "Because it needs software"),
            answerIndex = 1,
            rationale = "Convenience and curiosity push against need to know every day. It needs active maintenance, not just a policy.",
            id = "bulk-q203", briefKey = "team/team-need-to-know", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How do you decide what a role needs to know?",
            options = listOf("Ask the person", "Map the role's tasks to the information those tasks require, and nothing more", "Give them everything", "Copy another role"),
            answerIndex = 1,
            rationale = "Need follows tasks. Map tasks to information, and the boundary draws itself.",
            id = "bulk-q204", briefKey = "team/team-need-to-know", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the risk of a shared team account?",
            options = listOf("It is convenient", "No accountability: actions cannot be attributed, and revocation affects everyone", "It is slow", "It costs more"),
            answerIndex = 1,
            rationale = "Shared accounts destroy attribution and make revocation painful. Give each person their own account.",
            id = "bulk-q205", briefKey = "team/team-shared", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should a team do instead of sharing passwords?",
            options = listOf("Write them on a board", "Use individual accounts, or a shared vault with individual access", "Email them", "Use one strong password"),
            answerIndex = 1,
            rationale = "Individual accounts, or a vault with individual access, give both sharing and accountability.",
            id = "bulk-q206", briefKey = "team/team-shared", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should onboarding include for sensitive work?",
            options = listOf("A welcome lunch", "Security expectations, need-to-know boundaries, and reporting channels, before access is granted", "A tour", "A handbook only"),
            answerIndex = 1,
            rationale = "Onboarding must set expectations and boundaries before access is granted, not after.",
            id = "bulk-q207", briefKey = "team/team-onboarding", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When should a new member receive sensitive access?",
            options = listOf("On day one", "After onboarding and only for what their role requires", "When they ask", "After a month"),
            answerIndex = 1,
            rationale = "Access follows onboarding and role need. Day-one full access is a policy failure.",
            id = "bulk-q208", briefKey = "team/team-onboarding", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What makes a team meeting secure?",
            options = listOf("Its length", "Only the people who need to be there, and no sensitive detail beyond the agenda", "A locked room", "No notes"),
            answerIndex = 1,
            rationale = "Attendance by need, and detail limited to the agenda, make a meeting secure. A locked room alone does not.",
            id = "bulk-q209", briefKey = "team/team-meetings", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should meeting notes exclude?",
            options = listOf("Decisions", "Sensitive detail not needed by the note's readers", "Action items", "Dates"),
            answerIndex = 1,
            rationale = "Notes travel further than meetings. Exclude sensitive detail that the readers do not need.",
            id = "bulk-q210", briefKey = "team/team-meetings", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you check before giving a vendor access?",
            options = listOf("Their price", "What access they actually need, for how long, and how it is revoked", "Their logo", "Their references only"),
            answerIndex = 1,
            rationale = "Vendor access needs the same discipline as staff access: need, duration, and revocation.",
            id = "bulk-q211", briefKey = "team/team-vendors", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should happen when a vendor engagement ends?",
            options = listOf("Nothing", "Access revoked promptly, and data returned or deleted as agreed", "A thank-you note", "A review meeting"),
            answerIndex = 1,
            rationale = "Ended engagements with live access are open doors. Revoke promptly, and settle data as agreed.",
            id = "bulk-q212", briefKey = "team/team-vendors", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the main remote work security risk?",
            options = listOf("Slow internet", "Uncontrolled environments: other people, networks, and devices around the worker", "Distraction", "Time zones"),
            answerIndex = 1,
            rationale = "Remote work happens in uncontrolled environments — other people, networks, and devices all around.",
            id = "bulk-q213", briefKey = "team/team-remote", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should remote workers do about their workspace?",
            options = listOf("Nothing special", "Control who can see and hear it, and keep work data on work devices", "Work from cafés", "Use personal devices"),
            answerIndex = 1,
            rationale = "Control sight and sound, and keep work data on work devices. A café table is not a workspace.",
            id = "bulk-q214", briefKey = "team/team-remote", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a manager's OPSEC responsibility?",
            options = listOf("None", "Setting boundaries, modelling them, and enforcing them consistently", "Buying tools", "Writing policies"),
            answerIndex = 1,
            rationale = "Managers set, model, and enforce boundaries. A policy nobody models is nobody's policy.",
            id = "bulk-q215", briefKey = "team/team-managers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What happens when managers bypass security rules?",
            options = listOf("Nothing", "The rules lose authority for everyone", "Work speeds up", "Morale improves"),
            answerIndex = 1,
            rationale = "A bypassed rule is a dead rule. Managers who bypass teach the team that rules are optional.",
            id = "bulk-q216", briefKey = "team/team-managers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should a team handle a member's mistake?",
            options = listOf("Blame them", "Fix the process, support the member, and share the lesson", "Ignore it", "Report them"),
            answerIndex = 1,
            rationale = "Fix the process, support the member, share the lesson. Blame hides the next mistake.",
            id = "bulk-q217", briefKey = "team/team-mistake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should a team do after a mistake is fixed?",
            options = listOf("Move on", "Check whether the same process flaw affects other work", "Celebrate", "Write a report"),
            answerIndex = 1,
            rationale = "One mistake often signals a process flaw elsewhere. Check the whole process, not just the one incident.",
            id = "bulk-q218", briefKey = "team/team-mistake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why should teams drill security procedures?",
            options = listOf("For fun", "Because unrehearsed procedures fail under pressure", "For compliance", "For team building"),
            answerIndex = 1,
            rationale = "Procedures fail under pressure unless rehearsed. Drills turn knowledge into habit.",
            id = "bulk-q219", briefKey = "team/team-drills", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What makes a drill useful?",
            options = listOf("Its realism", "A debrief: what worked, what failed, and what changes", "Its length", "Its difficulty"),
            answerIndex = 1,
            rationale = "A drill without a debrief is theatre. What worked, what failed, and what changes — that is the value.",
            id = "bulk-q220", briefKey = "team/team-drills", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the first hour of an incident for?",
            options = listOf("Full investigation", "Containment and safety", "Public statements", "Blame"),
            answerIndex = 1,
            rationale = "The first hour is containment and safety. Investigation comes after the spread stops.",
            id = "bulk-q221", briefKey = "incident/ir-first-hour", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do first when you discover a breach?",
            options = listOf("Delete the evidence", "Contain it, preserve evidence, and get help if anyone is in danger", "Tell everyone", "Reinstall everything"),
            answerIndex = 1,
            rationale = "Contain, preserve, and get help. Deletion destroys the investigation.",
            id = "bulk-q222", briefKey = "incident/ir-first-hour", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What evidence should you preserve in an incident?",
            options = listOf("Only screenshots", "Logs, messages, files, and a timeline — anything showing what happened", "Only the attacker's identity", "Nothing"),
            answerIndex = 1,
            rationale = "Preserve logs, messages, files, and a timeline. Evidence is what turns an incident into understanding.",
            id = "bulk-q223", briefKey = "incident/ir-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should evidence be handled?",
            options = listOf("Shared freely", "Carefully: copied, dated, and kept intact, with access controlled", "Deleted after reading", "Posted publicly"),
            answerIndex = 1,
            rationale = "Evidence must stay intact and access-controlled, or it loses value for investigation and reporting.",
            id = "bulk-q224", briefKey = "incident/ir-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the first step for a compromised account?",
            options = listOf("Delete it", "Lock it down from a clean device: new credentials, revoked sessions, stronger authentication", "Warn friends", "Ignore it"),
            answerIndex = 1,
            rationale = "Lock down from a clean device first. Changing credentials on a compromised device may expose the new ones too.",
            id = "bulk-q225", briefKey = "incident/ir-account", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "After locking down a compromised account, what next?",
            options = listOf("Nothing", "Check what the attacker accessed, changed, or sent from it", "Delete all messages", "Change your name"),
            answerIndex = 1,
            rationale = "Lockdown stops the bleeding. Reviewing what was accessed tells you what else needs fixing.",
            id = "bulk-q226", briefKey = "incident/ir-account", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do with a compromised device?",
            options = listOf("Keep using it", "Isolate it from networks and accounts, then investigate or rebuild it", "Sell it", "Give it away"),
            answerIndex = 1,
            rationale = "Isolate first, then investigate or rebuild. A compromised device kept in use keeps compromising.",
            id = "bulk-q227", briefKey = "incident/ir-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When should you rebuild rather than clean a device?",
            options = listOf("Never", "When compromise is deep or uncertain — a clean rebuild is more trustworthy than a partial clean", "When it is slow", "When it is old"),
            answerIndex = 1,
            rationale = "Deep or uncertain compromise cannot be reliably cleaned. A rebuild from trusted media is more trustworthy.",
            id = "bulk-q228", briefKey = "incident/ir-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do after a data breach exposes your information?",
            options = listOf("Nothing", "Change affected credentials, enable stronger authentication, and watch for misuse", "Close all accounts", "Move house"),
            answerIndex = 1,
            rationale = "Change affected credentials, strengthen authentication, and watch for misuse. Panic measures help no one.",
            id = "bulk-q229", briefKey = "incident/ir-breach", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you watch for after a breach?",
            options = listOf("Nothing", "Unusual logins, messages, transactions, and impersonation attempts", "News coverage", "Other breaches"),
            answerIndex = 1,
            rationale = "Breached data is used over time: watch logins, messages, transactions, and impersonation.",
            id = "bulk-q230", briefKey = "incident/ir-breach", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is identity theft in OPSEC terms?",
            options = listOf("Stealing a wallet", "Using your identity — documents, accounts, credentials — to act as you", "Copying a photo", "Opening mail"),
            answerIndex = 1,
            rationale = "Identity theft is acting as you, using your documents, accounts, or credentials.",
            id = "bulk-q231", briefKey = "incident/ir-identity-theft", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do if you suspect identity theft?",
            options = listOf("Wait and see", "Act quickly: contact affected institutions, freeze credit where available, and document everything", "Change your name", "Ignore it"),
            answerIndex = 1,
            rationale = "Speed matters: contact institutions, freeze credit where available, and document everything.",
            id = "bulk-q232", briefKey = "incident/ir-identity-theft", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When should you report an incident to authorities?",
            options = listOf("Never", "When a crime, danger, or serious harm is involved — Rule 1 never means do not report", "Only if asked", "After a month"),
            answerIndex = 1,
            rationale = "Crime, danger, or serious harm should be reported. Rule 1 never means do not report.",
            id = "bulk-q233", briefKey = "incident/ir-reporting", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should a report include?",
            options = listOf("Your opinions", "Facts: what happened, when, what evidence exists, and what harm resulted", "The attacker's name", "A solution"),
            answerIndex = 1,
            rationale = "Reports need facts: what, when, evidence, and harm. Opinions and guesses weaken them.",
            id = "bulk-q234", briefKey = "incident/ir-reporting", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you be careful about when talking about an incident?",
            options = listOf("Nothing", "Not revealing sensitive details, ongoing investigation, or other people's information", "Not boring listeners", "Not using jargon"),
            answerIndex = 1,
            rationale = "Talking about an incident can leak sensitive details, harm investigations, and expose others. Share carefully.",
            id = "bulk-q235", briefKey = "incident/ir-talking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Who needs to know about an incident?",
            options = listOf("Everyone", "Those affected, those who can help, and those who must act — on a need-to-know basis", "No one", "The media"),
            answerIndex = 1,
            rationale = "Need to know applies to incidents too: affected people, helpers, and decision-makers — not everyone.",
            id = "bulk-q236", briefKey = "incident/ir-talking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What belongs on a recovery checklist?",
            options = listOf("Only passwords", "Every compromised item: accounts, devices, data, and access, each with a fix and a verification step", "Only devices", "Only data"),
            answerIndex = 1,
            rationale = "A recovery checklist covers every compromised item, each with a fix and a verification step.",
            id = "bulk-q237", briefKey = "incident/ir-recovery-checklist", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When is recovery complete?",
            options = listOf("When fixes are applied", "When every item is fixed and verified, and monitoring is in place", "When you feel better", "After a week"),
            answerIndex = 1,
            rationale = "Recovery is complete when fixes are verified and monitoring is in place — not when fixes are merely applied.",
            id = "bulk-q238", briefKey = "incident/ir-recovery-checklist", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is an after-action review?",
            options = listOf("A blame session", "A structured review of what happened, what worked, what failed, and what changes", "A report to management", "A celebration"),
            answerIndex = 1,
            rationale = "An after-action review turns an incident into learning: what happened, what worked, what failed, what changes.",
            id = "bulk-q239", briefKey = "incident/ir-after-action", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should an after-action review produce?",
            options = listOf("A report only", "Concrete changes: updated procedures, controls, and training", "A new policy", "Nothing"),
            answerIndex = 1,
            rationale = "A review that produces no changes is a ritual. It must produce updated procedures, controls, and training.",
            id = "bulk-q240", briefKey = "incident/ir-after-action", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a digital shadow?",
            options = listOf("A backup", "The picture of you assembled from public data: posts, records, photos, and traces", "A dark web profile", "A VPN"),
            answerIndex = 1,
            rationale = "Your digital shadow is the picture assembled from public data — posts, records, photos, and traces.",
            id = "bulk-q241", briefKey = "osint/osint-shadow", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does your digital shadow matter?",
            options = listOf("It does not", "Because adversaries, employers, and strangers all read it, and it shapes what they believe about you", "For privacy only", "For advertising only"),
            answerIndex = 1,
            rationale = "Your shadow is read by adversaries, employers, and strangers, and it shapes their beliefs and actions toward you.",
            id = "bulk-q242", briefKey = "osint/osint-shadow", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the first step of a self-audit?",
            options = listOf("Deleting accounts", "Searching for yourself as a stranger would", "Changing passwords", "Buying tools"),
            answerIndex = 1,
            rationale = "Search for yourself as a stranger would. That is the adversary's view, and the audit starts there.",
            id = "bulk-q243", briefKey = "osint/osint-self-audit", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should a self-audit record?",
            options = listOf("Only embarrassing items", "Everything found: where it is, how sensitive it is, and what to do about it", "Only old accounts", "Only photos"),
            answerIndex = 1,
            rationale = "Record everything found, with location, sensitivity, and action. An audit that records only embarrassment is incomplete.",
            id = "bulk-q244", briefKey = "osint/osint-self-audit", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What social media habit most expands your shadow?",
            options = listOf("Liking posts", "Posting location, routines, contacts, and personal details over time", "Using a real name", "Following friends"),
            answerIndex = 1,
            rationale = "Location, routines, contacts, and personal details, accumulated over time, build the richest shadow.",
            id = "bulk-q245", briefKey = "osint/osint-social", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you check before posting?",
            options = listOf("Your grammar", "What the post reveals: location, people, documents, and patterns, now and in aggregate", "Your followers", "The time"),
            answerIndex = 1,
            rationale = "Check what a post reveals — location, people, documents, patterns — now and in aggregate with past posts.",
            id = "bulk-q246", briefKey = "osint/osint-social", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What are data brokers?",
            options = listOf("Hackers", "Companies that collect, aggregate, and sell personal information", "Banks", "Advertisers only"),
            answerIndex = 1,
            rationale = "Data brokers collect, aggregate, and sell personal information — often without your knowledge.",
            id = "bulk-q247", briefKey = "osint/osint-brokers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What can you do about data brokers?",
            options = listOf("Nothing", "Opt out where possible, and repeat: broker data reappears over time", "Sue them", "Ignore them"),
            answerIndex = 1,
            rationale = "Opt out where possible, and repeat. Broker data reappears over time, so removal is maintenance, not a one-time fix.",
            id = "bulk-q248", briefKey = "osint/osint-brokers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you expect from broker removal?",
            options = listOf("Complete removal", "Partial, temporary reduction — new brokers and new data keep appearing", "Instant results", "Legal protection"),
            answerIndex = 1,
            rationale = "Removal is partial and temporary. New brokers and new data keep appearing, so expect maintenance, not completion.",
            id = "bulk-q249", briefKey = "osint/osint-removal", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the most effective removal step?",
            options = listOf("Deleting one account", "Systematic removal: brokers, old accounts, and public records, repeated over time", "Changing your name", "Going offline"),
            answerIndex = 1,
            rationale = "Systematic, repeated removal across brokers, accounts, and records beats any single deletion.",
            id = "bulk-q250", briefKey = "osint/osint-removal", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the main risk of public speaking for your shadow?",
            options = listOf("Stage fright", "Recordings, photos, and attendee posts that persist and spread beyond the event", "Travel", "Cost"),
            answerIndex = 1,
            rationale = "Public speaking creates persistent records: recordings, photos, and attendee posts that spread beyond the event.",
            id = "bulk-q251", briefKey = "osint/osint-public-speaking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do before speaking publicly?",
            options = listOf("Nothing", "Decide what you are willing to have recorded and shared permanently", "Rehearse", "Dress well"),
            answerIndex = 1,
            rationale = "Decide in advance what you accept as permanently recorded and shared. After the event, it is too late.",
            id = "bulk-q252", briefKey = "osint/osint-public-speaking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What personal-life detail is most commonly overshared?",
            options = listOf("Hobbies", "Routines and locations: where you go, when, and with whom", "Opinions", "Food"),
            answerIndex = 1,
            rationale = "Routines and locations — where, when, with whom — are the most commonly overshared and most useful to adversaries.",
            id = "bulk-q253", briefKey = "osint/osint-personal-life", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you avoid sharing about family?",
            options = listOf("Nothing", "Details that identify or locate family members: schools, routines, addresses", "Photos", "Names"),
            answerIndex = 1,
            rationale = "Family details — schools, routines, addresses — identify and locate people who did not choose to be exposed.",
            id = "bulk-q254", briefKey = "osint/osint-personal-life", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What household information leaks through public sources?",
            options = listOf("Nothing", "Addresses, property records, deliveries, and household routines", "Only bills", "Only mail"),
            answerIndex = 1,
            rationale = "Addresses, property records, deliveries, and routines all leak through public sources and observation.",
            id = "bulk-q255", briefKey = "osint/osint-household", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do about property records?",
            options = listOf("Nothing", "Know what is public, and use lawful privacy options where available", "Hide ownership", "Move"),
            answerIndex = 1,
            rationale = "Know what property records are public, and use lawful privacy options where they exist.",
            id = "bulk-q256", briefKey = "osint/osint-household", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the tension of a public role?",
            options = listOf("None", "Visibility is required, but it expands your shadow and your exposure", "Cost", "Time"),
            answerIndex = 1,
            rationale = "Public roles require visibility, and visibility expands shadow and exposure. The tension must be managed, not denied.",
            id = "bulk-q257", briefKey = "osint/osint-public-roles", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How do you manage a public role's exposure?",
            options = listOf("Avoid all publicity", "Separate public and private: a public persona, with private life protected behind boundaries", "Share everything", "Use a fake name"),
            answerIndex = 1,
            rationale = "Separate public and private: a public persona for the role, with private life protected behind real boundaries.",
            id = "bulk-q258", briefKey = "osint/osint-public-roles", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a private core?",
            options = listOf("A secret", "The part of your life you keep fully private: people, places, and routines that never become public", "A password", "A vault"),
            answerIndex = 1,
            rationale = "A private core is the part of life kept fully private — people, places, routines that never become public.",
            id = "bulk-q259", briefKey = "osint/osint-private-core", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why keep a private core?",
            options = listOf("For secrecy", "Because a life with no private core has no fallback when public exposure grows", "For mystery", "For safety only"),
            answerIndex = 1,
            rationale = "A private core is a fallback: when public exposure grows, something remains untouched.",
            id = "bulk-q260", briefKey = "osint/osint-private-core", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a travel threat model?",
            options = listOf("A packing list", "A structured assessment of a trip's risks: destination, route, activities, and data carried", "A visa application", "An itinerary"),
            answerIndex = 1,
            rationale = "A travel threat model assesses destination, route, activities, and data carried — structured, not a packing list.",
            id = "bulk-q261", briefKey = "travel/travel-threat-model", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should a travel threat model include?",
            options = listOf("Only crime", "Crime, surveillance, border rules, health, and data exposure", "Only weather", "Only transport"),
            answerIndex = 1,
            rationale = "Travel risks span crime, surveillance, border rules, health, and data exposure. Model all of them.",
            id = "bulk-q262", briefKey = "travel/travel-threat-model", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you pack for device security?",
            options = listOf("Chargers", "Only the devices and data the trip needs, with the rest backed up at home", "All devices", "Spare batteries"),
            answerIndex = 1,
            rationale = "Pack only what the trip needs. Everything else stays backed up at home, out of travel risk.",
            id = "bulk-q263", briefKey = "travel/travel-packing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do with devices before travel?",
            options = listOf("Charge them", "Update, back up, minimise data, and enable encryption and remote wipe", "Turn them off", "Remove cases"),
            answerIndex = 1,
            rationale = "Update, back up, minimise, encrypt, and enable remote wipe — before you leave, not after.",
            id = "bulk-q264", briefKey = "travel/travel-packing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the main border risk?",
            options = listOf("Delays", "Device search, copying, and retention — and different rules in different countries", "Fees", "Queues"),
            answerIndex = 1,
            rationale = "Border device searches vary by country, and can include copying and retention. Plan for the destination's rules.",
            id = "bulk-q265", briefKey = "travel/travel-border", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you know before crossing a border with devices?",
            options = listOf("The weather", "The destination's border search rules, and your advance plan if searched", "The exchange rate", "The language"),
            answerIndex = 1,
            rationale = "Know the destination's rules and your advance plan. Deciding under pressure at a border is unreliable.",
            id = "bulk-q266", briefKey = "travel/travel-border", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a clean travel device?",
            options = listOf("A new device", "A device carrying only trip essentials, with the rest backed up and removed", "A wiped device", "A device without apps"),
            answerIndex = 1,
            rationale = "A clean travel device carries only trip essentials. The rest is backed up and removed.",
            id = "bulk-q267", briefKey = "travel/travel-clean-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do after returning with a travel device?",
            options = listOf("Keep using it", "Treat it as potentially compromised: check, update, and restore from backup if in doubt", "Sell it", "Ignore it"),
            answerIndex = 1,
            rationale = "A travelled device may have been accessed. Check, update, and restore from backup if in doubt.",
            id = "bulk-q268", briefKey = "travel/travel-clean-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the main hotel security risk?",
            options = listOf("Noise", "Uncontrolled access: staff, previous guests, and shared networks", "Cost", "Cleanliness"),
            answerIndex = 1,
            rationale = "Hotels have uncontrolled access: staff, previous guests, and shared networks all reach your room and data.",
            id = "bulk-q269", briefKey = "travel/travel-hotels", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do with devices in a hotel room?",
            options = listOf("Leave them unlocked", "Lock them, and take sensitive items with you when you leave", "Hide them", "Turn them off"),
            answerIndex = 1,
            rationale = "Lock devices and carry sensitive items. A locked hotel room is still a shared space.",
            id = "bulk-q270", briefKey = "travel/travel-hotels", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should you treat hotel Wi-Fi?",
            options = listOf("As trusted", "As untrusted, every time", "As safe with a password", "As safe in good hotels"),
            answerIndex = 1,
            rationale = "Hotel networks are untrusted regardless of passwords or hotel quality. Protect every connection.",
            id = "bulk-q271", briefKey = "travel/travel-networks", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you use on untrusted travel networks?",
            options = listOf("Nothing special", "Encryption everywhere, and a trusted VPN for sensitive traffic", "Only email", "Only browsing"),
            answerIndex = 1,
            rationale = "Encryption everywhere, plus a trusted VPN for sensitive traffic, protects on untrusted networks.",
            id = "bulk-q272", briefKey = "travel/travel-networks", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you consider for meetings while travelling?",
            options = listOf("Only the agenda", "Location control, device management, and who else can hear or see", "Only transport", "Only timing"),
            answerIndex = 1,
            rationale = "Travel meetings need location control, device management, and awareness of who else can hear or see.",
            id = "bulk-q273", briefKey = "travel/travel-meetings", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do with meeting materials while travelling?",
            options = listOf("Leave them in the room", "Carry them, or store them securely, and destroy what is no longer needed", "Share them", "Email them home"),
            answerIndex = 1,
            rationale = "Carry materials, store them securely, and destroy what is no longer needed. Hotel rooms are not safes.",
            id = "bulk-q274", briefKey = "travel/travel-meetings", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you watch for when travelling in a high-risk area?",
            options = listOf("Only crime", "Surveillance, followers, and unusual attention, as well as crime", "Only weather", "Only transport"),
            answerIndex = 1,
            rationale = "High-risk travel adds surveillance and followers to ordinary crime risk. Watch for both.",
            id = "bulk-q275", briefKey = "travel/travel-surveillance", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do if followed while travelling?",
            options = listOf("Go to your hotel", "Go to a public place and contact a trusted person", "Confront the follower", "Run"),
            answerIndex = 1,
            rationale = "Go public and contact a trusted person. Never lead a follower to your hotel or meeting.",
            id = "bulk-q276", briefKey = "travel/travel-surveillance", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do if a device is taken while travelling?",
            options = listOf("Nothing", "Treat it as compromised: revoke access, change credentials from a clean device, and assess exposure", "Buy a new one", "Report it only"),
            answerIndex = 1,
            rationale = "A taken device is a compromised device. Revoke access, change credentials from clean hardware, and assess exposure.",
            id = "bulk-q277", briefKey = "travel/travel-device-taken", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you check after returning from travel?",
            options = listOf("Only photos", "Devices, accounts, and data: signs of access, changes, or compromise", "Only luggage", "Only receipts"),
            answerIndex = 1,
            rationale = "Post-travel checks cover devices, accounts, and data for signs of access or compromise.",
            id = "bulk-q278", briefKey = "travel/travel-return-home", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What travel routine best protects you over time?",
            options = listOf("Packing light", "A repeatable routine: minimise, back up, check on return, and update the travel threat model", "Travelling rarely", "Using one device"),
            answerIndex = 1,
            rationale = "A repeatable routine — minimise, back up, check on return, update the model — protects every trip, not just one.",
            id = "bulk-q279", briefKey = "travel/travel-routine", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you review after every trip?",
            options = listOf("Nothing", "What worked, what failed, and what the next trip's threat model should change", "Expenses only", "Photos"),
            answerIndex = 1,
            rationale = "Every trip teaches something. Review what worked and failed, and update the next threat model.",
            id = "bulk-q280", briefKey = "travel/travel-routine", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a daily OPSEC habit?",
            options = listOf("Checking news", "A small, repeatable action: review exposures, lock devices, note anything unusual", "Changing passwords", "Reading a chapter"),
            answerIndex = 1,
            rationale = "Daily habits are small and repeatable: review exposures, lock devices, note anything unusual.",
            id = "bulk-q281", briefKey = "capstone/cap-daily", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should a regular review cover?",
            options = listOf("Only passwords", "Accounts, devices, permissions, subscriptions, and your threat model", "Only devices", "Only news"),
            answerIndex = 1,
            rationale = "Reviews cover accounts, devices, permissions, subscriptions, and the threat model — the whole posture.",
            id = "bulk-q282", briefKey = "capstone/cap-reviews", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How does stress affect OPSEC?",
            options = listOf("It does not", "Stress narrows attention and pushes shortcuts, which is when mistakes happen", "It improves focus", "It slows decisions"),
            answerIndex = 1,
            rationale = "Stress narrows attention and pushes shortcuts. Mistakes cluster under stress, not under calm.",
            id = "bulk-q283", briefKey = "capstone/cap-stress", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What protects OPSEC from burnout?",
            options = listOf("More effort", "Sustainable routines: proportionate controls you can keep doing", "New tools", "Fear"),
            answerIndex = 1,
            rationale = "Sustainable, proportionate routines survive burnout. Maximum effort does not.",
            id = "bulk-q284", briefKey = "capstone/cap-burnout", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When should you update your posture?",
            options = listOf("Never", "When tools, threats, or your situation change", "Annually", "After an incident only"),
            answerIndex = 1,
            rationale = "Update when tools, threats, or situations change. A static posture decays.",
            id = "bulk-q285", briefKey = "capstone/cap-updating", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the best way to teach OPSEC to others?",
            options = listOf("Lectures", "Practices and habits, demonstrated and rehearsed, not just explained", "Handouts", "Warnings"),
            answerIndex = 1,
            rationale = "Teaching is practices demonstrated and rehearsed. Lectures alone change nothing.",
            id = "bulk-q286", briefKey = "capstone/cap-teaching", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should a personal OPSEC plan include?",
            options = listOf("Only tools", "Critical information, threats, vulnerabilities, risks, countermeasures, and review dates", "Only risks", "Only habits"),
            answerIndex = 1,
            rationale = "A plan includes critical information, threats, vulnerabilities, risks, countermeasures, and review dates.",
            id = "bulk-q287", briefKey = "capstone/cap-plan1", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What makes a plan realistic?",
            options = listOf("Its length", "That it fits your life: controls you can actually maintain", "Its ambition", "Its tools"),
            answerIndex = 1,
            rationale = "A realistic plan fits your life. Controls you cannot maintain are not controls.",
            id = "bulk-q288", briefKey = "capstone/cap-plan2", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do in a scenario exercise?",
            options = listOf("Find the one right answer", "Practise deciding under uncertainty, then review what you missed", "Memorise the scenario", "Avoid mistakes"),
            answerIndex = 1,
            rationale = "Scenarios practise deciding under uncertainty. The review — what you missed — is the learning.",
            id = "bulk-q289", briefKey = "capstone/cap-scenario", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does completing all briefs certify?",
            options = listOf("An accredited qualification", "A self-paced, on-device completion record — not an accredited qualification", "Expertise", "Employment"),
            answerIndex = 1,
            rationale = "The certificate is a self-paced, on-device completion record, explicitly not an accredited qualification.",
            id = "bulk-q290", briefKey = "capstone/cap-completion", difficulty = "Advanced"
        )
    )
}
