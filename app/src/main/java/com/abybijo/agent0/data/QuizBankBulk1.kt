package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk questions, batch 1: 100 questions for CH-00 to CH-05 briefs. */
object QuizBankBulk1 {
    val all: List<QuizQuestion> = listOf(
        QuizQuestion(
            prompt = "What is the one Rule in this programme?",
            options = listOf("Never use a phone", "Rule 1: protect critical information", "Never talk to strangers", "Encrypt everything"),
            answerIndex = 1,
            rationale = "Rule 1 is the only Rule. Everything else is a practice, checklist, or caution.",
            id = "bulk-q001", briefKey = "orientation/rules", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What are the numbered items after Rule 1 called in v2.0?",
            options = listOf("More rules", "Practices", "Laws", "Exceptions"),
            answerIndex = 1,
            rationale = "Other numbered items were demoted to practices, checklists, and cautions — not deleted, but no longer called Rules.",
            id = "bulk-q002", briefKey = "orientation/rules", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "If a person is in danger, what does Rule 1 say about reporting?",
            options = listOf("Never report, to protect information", "Get real-world help first; Rule 1 never means do not report", "Wait until the danger passes", "Report only after a review"),
            answerIndex = 1,
            rationale = "Rule 1 never means do not report. Safety comes first; information protection serves safety, not the reverse.",
            id = "bulk-q003", briefKey = "orientation/rules", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "How does a brief unlock in this programme?",
            options = listOf("By paying", "By completing the previous brief", "By passing a quiz with full marks", "By waiting a day"),
            answerIndex = 1,
            rationale = "Locking is sequential and completion-only: the next brief unlocks when you complete the previous one.",
            id = "bulk-q004", briefKey = "orientation/howto", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What can you see of a locked brief?",
            options = listOf("Nothing at all", "Its title, time, and outcomes, but no body text", "The full text, but no quiz", "Only its illustration"),
            answerIndex = 1,
            rationale = "Locked briefs show title, time, and outcomes so you know what is coming, without giving away the body text.",
            id = "bulk-q005", briefKey = "orientation/howto", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Can a completed brief ever re-lock?",
            options = listOf("Yes, after a month", "No, completed briefs never re-lock", "Yes, if you fail a quiz", "Only in Capstone"),
            answerIndex = 1,
            rationale = "Completed briefs never re-lock. Progress, once earned, stays earned.",
            id = "bulk-q006", briefKey = "orientation/howto", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is the best first-week habit in this programme?",
            options = listOf("Reading all chapters at once", "One brief at a time, in order, with notes", "Skipping to the advanced chapters", "Memorising the glossary"),
            answerIndex = 1,
            rationale = "Sequential, one-brief-at-a-time learning with notes builds a posture that lasts.",
            id = "bulk-q007", briefKey = "orientation/first-week", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What should you do with a personal note in this programme?",
            options = listOf("Share it with the certificate", "Keep it local; notes are excluded from sharing", "Post it publicly", "Delete it daily"),
            answerIndex = 1,
            rationale = "Notes are local only and excluded from any certificate or share payload.",
            id = "bulk-q008", briefKey = "orientation/first-week", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is the programme's stance on gamification?",
            options = listOf("Points and leaderboards throughout", "No gamification; progress is a record, not a competition", "Badges only for speed", "Streaks with penalties"),
            answerIndex = 1,
            rationale = "There is no gamification. Missed days are recorded without judgement, and progress is not a competition.",
            id = "bulk-q009", briefKey = "orientation/first-week", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Where does the five-step OPSEC process originate?",
            options = listOf("A 2020 tech blog", "US military doctrine, including NSDD 298", "A novel", "A corporate policy from 2015"),
            answerIndex = 1,
            rationale = "The five-step process comes from US military OPSEC doctrine, formalised in NSDD 298.",
            id = "bulk-q010", briefKey = "doctrine/origins", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What was the original purpose of OPSEC?",
            options = listOf("Protecting military operations from adversary observation", "Selling security software", "Hiding criminal activity", "Managing social media"),
            answerIndex = 1,
            rationale = "OPSEC began as a military discipline: denying adversaries the information that reveals intentions and capabilities.",
            id = "bulk-q011", briefKey = "doctrine/origins", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Why does a civilian programme use military OPSEC doctrine?",
            options = listOf("Because civilians face the same principles of observation and inference", "Because it sounds impressive", "Because the military requires it", "Because civilians face the same adversaries"),
            answerIndex = 1,
            rationale = "The principles — observation, inference, and denial — apply to anyone whose information can be observed and used.",
            id = "bulk-q012", briefKey = "doctrine/origins", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is step 1 of the five-step OPSEC process?",
            options = listOf("Analyse threats", "Identify critical information", "Assess vulnerabilities", "Apply countermeasures"),
            answerIndex = 1,
            rationale = "Step 1 is identifying critical information: what must be protected, and why it matters.",
            id = "bulk-q013", briefKey = "doctrine/step1", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Which question best identifies critical information?",
            options = listOf("What do I own?", "What could an adversary use to harm me?", "What is most expensive?", "What is most secret?"),
            answerIndex = 1,
            rationale = "Critical information is defined by adversary use and harm, not by ownership, price, or secrecy alone.",
            id = "bulk-q014", briefKey = "doctrine/step1", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "If everything is marked critical, what happens?",
            options = listOf("Everything is protected well", "Nothing is prioritised, so nothing is protected well", "The plan becomes stronger", "Adversaries are confused"),
            answerIndex = 1,
            rationale = "If everything is critical, nothing is. Prioritisation is what makes a plan workable.",
            id = "bulk-q015", briefKey = "doctrine/step1", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is step 2 of the five-step OPSEC process?",
            options = listOf("Analyse threats", "Identify critical information", "Assess risk", "Apply countermeasures"),
            answerIndex = 1,
            rationale = "Step 2 is threat analysis: who wants the information, and what are their capabilities and intentions?",
            id = "bulk-q016", briefKey = "doctrine/step2", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What does threat analysis include?",
            options = listOf("Only hackers", "Adversary, capability, and intent", "Only nation-states", "Only known attackers"),
            answerIndex = 1,
            rationale = "Threat analysis names the adversary, what they can do, and what they want — not only a category of attacker.",
            id = "bulk-q017", briefKey = "doctrine/step2", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Why consider intent as well as capability?",
            options = listOf("Because capability alone is flattering", "Because a capable adversary who does not care about you is not your threat", "Because intent is easier to measure", "Because capability changes daily"),
            answerIndex = 1,
            rationale = "Threat is capability plus intent. A capable adversary without intent toward you is not your current threat.",
            id = "bulk-q018", briefKey = "doctrine/step2", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is step 3 of the five-step OPSEC process?",
            options = listOf("Analyse vulnerabilities", "Apply countermeasures", "Assess risk", "Identify critical information"),
            answerIndex = 1,
            rationale = "Step 3 is vulnerability analysis: how could an adversary obtain the critical information?",
            id = "bulk-q019", briefKey = "doctrine/step3", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is a vulnerability in OPSEC terms?",
            options = listOf("A software bug only", "Any weakness through which critical information could be obtained", "A weak password only", "An unlocked door only"),
            answerIndex = 1,
            rationale = "A vulnerability is any weakness — technical, physical, human, or procedural — that exposes critical information.",
            id = "bulk-q020", briefKey = "doctrine/step3", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Which is a vulnerability?",
            options = listOf("A strong password", "A conversation in a public place about sensitive work", "An encrypted drive", "A locked filing cabinet"),
            answerIndex = 1,
            rationale = "Discussing sensitive work where it can be overheard is a vulnerability, even with no technology involved.",
            id = "bulk-q021", briefKey = "doctrine/step3", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is step 4 of the five-step OPSEC process?",
            options = listOf("Assess risk", "Apply countermeasures", "Analyse threats", "Identify critical information"),
            answerIndex = 1,
            rationale = "Step 4 is risk assessment: how likely is exploitation, and how severe would the harm be?",
            id = "bulk-q022", briefKey = "doctrine/step4", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "How is risk assessed in OPSEC?",
            options = listOf("By cost of the countermeasure", "By likelihood of exploitation combined with severity of harm", "By adversary's budget", "By how famous you are"),
            answerIndex = 1,
            rationale = "Risk combines likelihood and severity. High likelihood with low harm, or low likelihood with high harm, are different risks.",
            id = "bulk-q023", briefKey = "doctrine/step4", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "A risk is high likelihood but low harm. What should you do?",
            options = listOf("Ignore it", "Treat it proportionately, not as a top priority", "Apply the strongest countermeasure", "Accept it without noting it"),
            answerIndex = 1,
            rationale = "Risk assessment exists to prioritise. Low-harm risks get proportionate controls, not the strongest available.",
            id = "bulk-q024", briefKey = "doctrine/step4", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is step 5 of the five-step OPSEC process?",
            options = listOf("Apply countermeasures", "Assess risk", "Analyse threats", "Review the plan"),
            answerIndex = 1,
            rationale = "Step 5 is applying countermeasures: the controls that reduce risk to an acceptable level.",
            id = "bulk-q025", briefKey = "doctrine/step5", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What justifies a countermeasure?",
            options = listOf("That it is popular", "That it answers a named risk from steps 1 to 4", "That it is free", "That it is new"),
            answerIndex = 1,
            rationale = "Every countermeasure must answer a named risk, which answers a named vulnerability, threat, and critical information item.",
            id = "bulk-q026", briefKey = "doctrine/step5", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "When is a countermeasure complete?",
            options = listOf("When it is installed", "When it reduces risk to an acceptable level and is maintained", "When it is purchased", "When it is announced"),
            answerIndex = 1,
            rationale = "A countermeasure works only when it is maintained. An installed but unmaintained control decays.",
            id = "bulk-q027", briefKey = "doctrine/step5", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is a ten-minute threat model for?",
            options = listOf("Replacing the full process", "A quick, structured assessment when time is short", "Impressing others", "Avoiding step 1"),
            answerIndex = 1,
            rationale = "A short threat model is a compressed version of the same five steps, for when time is short — not a replacement for them.",
            id = "bulk-q028", briefKey = "doctrine/threat-model-ten", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What must a ten-minute threat model still include?",
            options = listOf("Only countermeasures", "Critical information, adversary, vulnerability, risk, and a countermeasure", "Only the adversary", "Only the risk"),
            answerIndex = 1,
            rationale = "Even compressed, the model must touch every step, or it is a guess, not a model.",
            id = "bulk-q029", briefKey = "doctrine/threat-model-ten", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "When should you do a full threat model instead of a ten-minute one?",
            options = listOf("Never", "When the stakes are high or the situation is new", "When you have free time", "Only once a year"),
            answerIndex = 1,
            rationale = "High stakes or new situations deserve the full process. Short models are for routine, low-stakes decisions.",
            id = "bulk-q030", briefKey = "doctrine/threat-model-ten", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What makes a password strong?",
            options = listOf("Length and unpredictability", "Special characters alone", "Changing it weekly", "Using your birth year"),
            answerIndex = 1,
            rationale = "Length and unpredictability matter most. A long, random passphrase beats a short, complex one.",
            id = "bulk-q031", briefKey = "digital/passwords", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is the best way to manage many unique passwords?",
            options = listOf("Memorise them all", "Write them on paper", "Use a reputable password manager with a strong master password", "Reuse one strong password"),
            answerIndex = 1,
            rationale = "A password manager lets you use a unique, random password everywhere, protected by one strong master password.",
            id = "bulk-q032", briefKey = "digital/passwords", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Why is password reuse dangerous?",
            options = listOf("It is hard to remember", "One breach then opens every account sharing that password", "It slows logins", "It violates terms of service"),
            answerIndex = 1,
            rationale = "Credential stuffing uses leaked passwords across services. Reuse turns one breach into many.",
            id = "bulk-q033", briefKey = "digital/passwords", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Which second factor is strongest?",
            options = listOf("SMS code", "Email link", "Authenticator app code", "Hardware security key"),
            answerIndex = 1,
            rationale = "Hardware keys are phishing-resistant: they verify the site, not only the user.",
            id = "bulk-q034", briefKey = "digital/twofactor", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Why is SMS the weakest second factor?",
            options = listOf("It is slow", "It can be intercepted via SIM swapping and SS7 attacks", "It costs money", "It needs signal"),
            answerIndex = 1,
            rationale = "SMS codes can be stolen by transferring your number to an attacker's SIM, or by intercepting signalling traffic.",
            id = "bulk-q035", briefKey = "digital/twofactor", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What should you do if a service offers only SMS two-factor?",
            options = listOf("Refuse the service", "Use SMS, and add carrier protections like a port-out PIN", "Use no second factor", "Use the same password everywhere"),
            answerIndex = 1,
            rationale = "SMS is better than nothing, especially with carrier protections. Use it, and harden the phone account too.",
            id = "bulk-q036", briefKey = "digital/twofactor", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What does end-to-end encryption guarantee?",
            options = listOf("That no one can see metadata", "That only the sender and recipient can read the message content", "That the service cannot store anything", "That messages cannot be deleted"),
            answerIndex = 1,
            rationale = "End-to-end encryption protects content in transit and at rest on the provider. Metadata is a separate question.",
            id = "bulk-q037", briefKey = "digital/encryption", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What does encryption not protect?",
            options = listOf("Message content", "Metadata: who talked to whom, when, and how much", "Stored files", "Passwords in transit"),
            answerIndex = 1,
            rationale = "Encryption protects content, not metadata. Who, when, and how much remain visible to providers and observers.",
            id = "bulk-q038", briefKey = "digital/encryption", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is the difference between encryption in transit and at rest?",
            options = listOf("There is none", "In transit protects data moving; at rest protects data stored", "In transit is stronger", "At rest is only for backups"),
            answerIndex = 1,
            rationale = "In transit protects data while it moves across networks; at rest protects it while stored on disk or in the cloud.",
            id = "bulk-q039", briefKey = "digital/encryption", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Which communication choice best protects content from the provider?",
            options = listOf("SMS", "Unencrypted email", "An end-to-end encrypted messenger", "A public post"),
            answerIndex = 1,
            rationale = "End-to-end encrypted messengers keep content from the provider. SMS and unencrypted email do not.",
            id = "bulk-q040", briefKey = "digital/comms", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What should you assume about a group chat's privacy?",
            options = listOf("It is as private as its most careful member", "It is as exposed as its least careful member", "It is private if encrypted", "It is private if small"),
            answerIndex = 1,
            rationale = "A group chat's privacy is set by its least careful member: screenshots, forwards, and new members expand exposure.",
            id = "bulk-q041", briefKey = "digital/comms", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is the safest assumption about a voice call on an encrypted app?",
            options = listOf("It cannot be recorded by the other party", "The other party can record it, whatever the app does", "It leaves no metadata", "It is legally protected"),
            answerIndex = 1,
            rationale = "Encryption protects a call from outsiders, not from the other participant, who can record it.",
            id = "bulk-q042", briefKey = "digital/comms", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is the first device security step?",
            options = listOf("Buy a new phone", "Lock the device with a strong passcode and enable encryption", "Install many apps", "Disable updates"),
            answerIndex = 1,
            rationale = "A strong passcode plus full-disk encryption protects a device if it is lost, stolen, or inspected.",
            id = "bulk-q043", briefKey = "digital/devices", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Why keep devices updated?",
            options = listOf("For new features", "Because updates patch known vulnerabilities that attackers exploit", "Because old versions are ugly", "Because updates are mandatory"),
            answerIndex = 1,
            rationale = "Updates close known holes. Attackers exploit unpatched devices first, because the flaws are public.",
            id = "bulk-q044", briefKey = "digital/devices", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What should you do with apps you no longer use?",
            options = listOf("Leave them installed", "Remove them, and revoke their permissions and access", "Hide them in a folder", "Log out only"),
            answerIndex = 1,
            rationale = "Unused apps still hold permissions and data. Removing them, and revoking access, closes that exposure.",
            id = "bulk-q045", briefKey = "digital/devices", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "How should you treat a public Wi-Fi network?",
            options = listOf("As trusted if it needs a password", "As untrusted, every time", "As safe for banking", "As safe if the café is reputable"),
            answerIndex = 1,
            rationale = "Public networks are untrusted regardless of passwords or reputation. Use protections on every connection.",
            id = "bulk-q046", briefKey = "digital/network", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What does a VPN protect you from on public Wi-Fi?",
            options = listOf("Malware", "Local network observers seeing your traffic", "Phishing", "Weak passwords"),
            answerIndex = 1,
            rationale = "A VPN encrypts traffic between your device and the VPN server, hiding it from local network observers. It does not stop malware or phishing.",
            id = "bulk-q047", briefKey = "digital/network", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What does a VPN not do?",
            options = listOf("Hide traffic from local observers", "Make you anonymous to the VPN provider or to websites you log into", "Encrypt traffic to the VPN server", "Protect on untrusted networks"),
            answerIndex = 1,
            rationale = "A VPN shifts trust to the provider. It does not make you anonymous to the provider or to services you log into.",
            id = "bulk-q048", briefKey = "digital/network", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is the main email risk for most people?",
            options = listOf("Spam", "Phishing: messages designed to steal credentials or trigger actions", "Large attachments", "Slow delivery"),
            answerIndex = 1,
            rationale = "Phishing is the dominant email risk: it bypasses technical controls by targeting the reader.",
            id = "bulk-q049", briefKey = "digital/email", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "An email asks you to log in urgently via a link. What do you do?",
            options = listOf("Click and log in quickly", "Go to the service directly, not via the link, and check there", "Reply asking if it is real", "Forward it to colleagues"),
            answerIndex = 1,
            rationale = "Never log in via an emailed link. Navigate to the service yourself and check for any real alert there.",
            id = "bulk-q050", briefKey = "digital/email", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What makes an email address a weak identifier?",
            options = listOf("It is long", "It is often public, guessable, and reused across services", "It contains numbers", "It is free"),
            answerIndex = 1,
            rationale = "Email addresses are often public and reused, so they identify you everywhere — and leak everywhere too.",
            id = "bulk-q051", briefKey = "digital/email", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is the 3-2-1 backup rule?",
            options = listOf("3 copies, 2 different media, 1 offsite", "3 passwords, 2 devices, 1 cloud", "3 days, 2 weeks, 1 month", "3 files, 2 folders, 1 drive"),
            answerIndex = 1,
            rationale = "3 copies of data, on 2 different media, with 1 offsite, protects against device failure, disaster, and ransomware.",
            id = "bulk-q052", briefKey = "digital/backups-restore", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What makes a backup trustworthy?",
            options = listOf("That it exists", "That it has been tested by restoring from it", "That it is in the cloud", "That it is encrypted"),
            answerIndex = 1,
            rationale = "An untested backup is a hope, not a backup. Restore tests prove it works.",
            id = "bulk-q053", briefKey = "digital/backups-restore", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Should backups be encrypted?",
            options = listOf("No, encryption slows restores", "Yes, backups contain the same sensitive data as the original", "Only for businesses", "Only offsite backups"),
            answerIndex = 1,
            rationale = "A backup is a copy of your data. If it is stolen unencrypted, the breach is total.",
            id = "bulk-q054", briefKey = "digital/backups-restore", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "What is the weakest point of physical access control?",
            options = listOf("The lock", "Tailgating: following someone through a secured door", "The camera", "The alarm"),
            answerIndex = 1,
            rationale = "Tailgating bypasses locks, badges, and alarms by exploiting politeness. Challenge unknown followers, politely but firmly.",
            id = "bulk-q055", briefKey = "physical/access", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Someone you do not recognise follows you through a secured door. What do you do?",
            options = listOf("Hold the door politely", "Ask who they are and whether they have access, or alert security", "Ignore them", "Follow them"),
            answerIndex = 1,
            rationale = "Politeness is not access control. A polite challenge, or a security alert, protects everyone inside.",
            id = "bulk-q056", briefKey = "physical/access", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What should you do with an access badge when you leave a job or role?",
            options = listOf("Keep it as a souvenir", "Return it and confirm access is revoked", "Give it to a colleague", "Throw it away"),
            answerIndex = 1,
            rationale = "Returned badges and revoked access close a door that would otherwise stay open. Confirm revocation, don't assume it.",
            id = "bulk-q057", briefKey = "physical/access", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What does a clean desk policy protect?",
            options = listOf("Tidiness", "Sensitive papers and devices left visible to visitors, cleaners, and colleagues", "Productivity", "Office appearance"),
            answerIndex = 1,
            rationale = "A clean desk keeps sensitive material out of sight of anyone who passes, including legitimate visitors.",
            id = "bulk-q058", briefKey = "physical/cleandesk", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Where should sensitive papers go when not in use?",
            options = listOf("In a drawer", "In a locked container, or shredded if no longer needed", "On the desk, face down", "In the recycling bin"),
            answerIndex = 1,
            rationale = "Lock what you keep, shred what you don't. A drawer that doesn't lock and a recycling bin are both open.",
            id = "bulk-q059", briefKey = "physical/cleandesk", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What should you do before disposing of a device?",
            options = listOf("Delete files normally", "Wipe it securely or destroy the storage, then verify", "Remove the battery", "Log out only"),
            answerIndex = 1,
            rationale = "Normal deletion does not remove data. Secure wiping or physical destruction, verified, does.",
            id = "bulk-q060", briefKey = "physical/cleandesk", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is the main physical risk when travelling with devices?",
            options = listOf("Battery life", "Loss, theft, and border inspection", "Weight", "Roaming charges"),
            answerIndex = 1,
            rationale = "Travelling devices face loss, theft, and inspection — all of which expose data if the device is not prepared.",
            id = "bulk-q061", briefKey = "physical/travel", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What should you do with devices in a hotel room when you leave?",
            options = listOf("Leave them unlocked; the room is locked", "Lock them, and take sensitive items with you", "Hide them under the bed", "Turn them off"),
            answerIndex = 1,
            rationale = "A hotel room is a shared space: staff and previous guests may have access. Lock devices and carry sensitive items.",
            id = "bulk-q062", briefKey = "physical/travel", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is the best preparation for a device crossing a border?",
            options = listOf("Charge it fully", "Minimise its data, back up the rest, and decide in advance what to do if inspected", "Turn off Wi-Fi", "Remove the case"),
            answerIndex = 1,
            rationale = "Minimised data, verified backup, and an advance decision are the three preparations that matter at a border.",
            id = "bulk-q063", briefKey = "physical/travel", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What distinguishes surveillance awareness from paranoia?",
            options = listOf("Nothing", "Awareness is calm, specific, and actionable; paranoia is constant, vague, and exhausting", "Awareness requires training", "Paranoia is more accurate"),
            answerIndex = 1,
            rationale = "Calm, specific, actionable noticing beats constant, vague noticing — which notices nothing.",
            id = "bulk-q064", briefKey = "physical/surveillance", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "If you believe you are being followed, what should you NOT do?",
            options = listOf("Enter a public place", "Go to your home, hotel, or meeting", "Change direction", "Contact a trusted person"),
            answerIndex = 1,
            rationale = "Going to a sensitive location while followed leads the follower there. Go public first, then contact help.",
            id = "bulk-q065", briefKey = "physical/surveillance", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is the most useful surveillance observation to record?",
            options = listOf("Your feelings", "Specifics: who, what, where, when, and what was unusual", "The weather", "General impressions"),
            answerIndex = 1,
            rationale = "Specific, factual notes — who, what, where, when — are useful. Feelings and impressions are not evidence.",
            id = "bulk-q066", briefKey = "physical/surveillance", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is an asset in physical OPSEC?",
            options = listOf("Only money", "Anything whose loss, theft, or exposure would harm you: devices, documents, keys, data", "Only property", "Only vehicles"),
            answerIndex = 1,
            rationale = "Assets include devices, documents, keys, and data — anything whose compromise harms you.",
            id = "bulk-q067", briefKey = "physical/assets", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What should you do with keys and access tokens?",
            options = listOf("Label them clearly", "Keep them unlabelled, separate, and accounted for", "Share them with colleagues", "Leave spares with neighbours"),
            answerIndex = 1,
            rationale = "Labelled keys tell a finder what they open. Keep keys unlabelled, separate, and counted.",
            id = "bulk-q068", briefKey = "physical/assets", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is the best inventory habit for physical assets?",
            options = listOf("Memorise them", "Keep a list of what you have, where it is, and who can access it", "Photograph them", "Insure them only"),
            answerIndex = 1,
            rationale = "You cannot protect what you cannot account for. An inventory — what, where, who — is the foundation.",
            id = "bulk-q069", briefKey = "physical/assets", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What makes a home a good base for OPSEC?",
            options = listOf("Its size", "Controlled access, good locks, and awareness of who can enter and observe", "Its location", "Its price"),
            answerIndex = 1,
            rationale = "A home base is secure through controlled access and observation awareness, not through size or price.",
            id = "bulk-q070", briefKey = "physical/home-base", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What should you check when moving to a new home?",
            options = listOf("Only the rent", "Locks, previous key holders, visibility from outside, and who has access", "Only the neighbours", "Only the Wi-Fi speed"),
            answerIndex = 1,
            rationale = "A new home inherits its previous occupants' access. Change locks, check visibility, and control who can enter.",
            id = "bulk-q071", briefKey = "physical/home-base", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What should you do with mail and deliveries at home?",
            options = listOf("Leave them outside", "Collect promptly, shred sensitive mail, and control what delivery labels reveal", "Let neighbours collect them", "Open everything immediately"),
            answerIndex = 1,
            rationale = "Mail reveals names, addresses, and habits. Collect promptly, shred sensitive items, and check labels.",
            id = "bulk-q072", briefKey = "physical/home-base", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is the most common social engineering vector?",
            options = listOf("Physical break-ins", "Phishing messages, calls, and impersonation", "Malware alone", "Insider theft alone"),
            answerIndex = 1,
            rationale = "Social engineering — phishing, pretexting, impersonation — is the most common way attackers bypass technical controls.",
            id = "bulk-q073", briefKey = "human/vectors", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is pretexting?",
            options = listOf("Sending malware", "Inventing a false scenario to obtain information or access", "Hacking a password", "Copying a badge"),
            answerIndex = 1,
            rationale = "Pretexting is a invented story — a technician, an official, a colleague — used to make a victim comply.",
            id = "bulk-q074", briefKey = "human/vectors", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is baiting?",
            options = listOf("Fishing with bait", "Leaving an infected device or file where a victim will find and use it", "Asking leading questions", "Offering a job"),
            answerIndex = 1,
            rationale = "Baiting plants something tempting — a USB drive, a free download — that compromises whoever uses it.",
            id = "bulk-q075", briefKey = "human/vectors", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is the strongest red flag in a message?",
            options = listOf("Bad grammar", "Urgency plus an unusual request: act now, outside normal channels", "A long message", "An attachment"),
            answerIndex = 1,
            rationale = "Urgency combined with an unusual request is the classic social engineering pattern, whatever the grammar or format.",
            id = "bulk-q076", briefKey = "human/redflags", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A caller claims to be IT support and asks for your password. What do you do?",
            options = listOf("Give it; IT needs it", "Refuse, hang up, and contact IT through a known channel", "Give a fake password", "Ask them to call back"),
            answerIndex = 1,
            rationale = "Legitimate IT never asks for your password. Refuse, hang up, and verify through a channel you trust.",
            id = "bulk-q077", briefKey = "human/redflags", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What should you do when a request feels slightly wrong but you cannot say why?",
            options = listOf("Comply; feelings are unreliable", "Pause and verify through a separate channel", "Comply quickly to avoid embarrassment", "Ignore it entirely"),
            answerIndex = 1,
            rationale = "A vague sense of wrongness is often pattern recognition. Pause and verify — the cost of checking is small.",
            id = "bulk-q078", briefKey = "human/redflags", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "How do you verify an unusual request from a colleague?",
            options = listOf("Reply to the same message", "Contact them through a separate, trusted channel you already use", "Ask a third colleague", "Check their profile photo"),
            answerIndex = 1,
            rationale = "Verification must use a channel the attacker does not control. Replying in the same thread verifies nothing.",
            id = "bulk-q079", briefKey = "human/verification", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is out-of-band verification?",
            options = listOf("Verification by email", "Verification through a different channel than the request arrived on", "Verification by a manager", "Verification after the fact"),
            answerIndex = 1,
            rationale = "Out-of-band means a different channel: a call to verify an email, a message to verify a call.",
            id = "bulk-q080", briefKey = "human/verification", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A supplier changes bank details by email. What do you do?",
            options = listOf("Update and pay", "Verify by calling a known number, not one in the email", "Reply asking for confirmation", "Pay a small test amount"),
            answerIndex = 1,
            rationale = "Bank detail changes are a classic fraud vector. Verify by a known number, never one supplied in the suspect message.",
            id = "bulk-q081", briefKey = "human/verification", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What influence technique relies on small commitments leading to larger ones?",
            options = listOf("Authority", "Foot-in-the-door", "Scarcity", "Social proof"),
            answerIndex = 1,
            rationale = "Foot-in-the-door starts with a small, reasonable request, then escalates to the real request.",
            id = "bulk-q082", briefKey = "human/influence", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What influence technique uses a figure of authority?",
            options = listOf("Liking", "Authority: a uniform, title, or official tone that discourages questioning", "Reciprocity", "Consistency"),
            answerIndex = 1,
            rationale = "Authority — a title, uniform, or official tone — makes people comply without checking. Verify anyway.",
            id = "bulk-q083", briefKey = "human/influence", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is the best defence against influence techniques?",
            options = listOf("Distrust everyone", "Recognise the technique, pause, and verify independently", "Comply slowly", "Ask for written proof only"),
            answerIndex = 1,
            rationale = "Recognising the technique breaks its spell. Pause, then verify through an independent channel.",
            id = "bulk-q084", briefKey = "human/influence", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A stranger online asks personal questions gradually over weeks. What is this?",
            options = listOf("Friendship", "Elicitation: gradual extraction of information through conversation", "Networking", "Research"),
            answerIndex = 1,
            rationale = "Elicitation extracts information slowly, through friendly conversation, so no single question seems sensitive.",
            id = "bulk-q085", briefKey = "human/verifying-strangers", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "How do you handle a new online contact who asks about your work?",
            options = listOf("Answer fully; they seem friendly", "Share only public information, and note what they ask", "Refuse all contact", "Ask them about their work first"),
            answerIndex = 1,
            rationale = "Share only what is already public, and watch the pattern of questions. Friendly strangers can be elicitors.",
            id = "bulk-q086", briefKey = "human/verifying-strangers", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What should you check before trusting a new contact's identity?",
            options = listOf("Their profile photo", "Independent evidence: known channels, mutual contacts, verifiable history", "Their follower count", "Their job title"),
            answerIndex = 1,
            rationale = "Photos, titles, and follower counts are forgeable. Independent evidence — known channels, real history — is what verifies.",
            id = "bulk-q087", briefKey = "human/verifying-strangers", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is confirmation bias?",
            options = listOf("Seeking information that confirms what you already believe, and discounting the rest", "Confirming a password", "Double-checking facts", "Trusting experts"),
            answerIndex = 1,
            rationale = "Confirmation bias filters evidence to fit existing beliefs, which is exactly how misinformation and manipulation work.",
            id = "bulk-q088", briefKey = "cognitive/biases", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "How does confirmation bias help an attacker?",
            options = listOf("It does not", "It makes a victim accept false evidence that fits their beliefs, and reject true warnings", "It slows decisions", "It causes forgetfulness"),
            answerIndex = 1,
            rationale = "An attacker who knows your beliefs can craft evidence that fits them, which you will accept uncritically.",
            id = "bulk-q089", briefKey = "cognitive/biases", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is the best counter to confirmation bias?",
            options = listOf("Stronger beliefs", "Actively seeking disconfirming evidence and alternative explanations", "Faster decisions", "Avoiding news"),
            answerIndex = 1,
            rationale = "Deliberately seeking evidence against your view, and considering alternatives, is the direct counter to confirmation bias.",
            id = "bulk-q090", briefKey = "cognitive/biases", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Why are emotional states a security risk?",
            options = listOf("They are not", "Strong emotion narrows attention and speeds compliance, which attackers exploit", "They cause tiredness", "They slow typing"),
            answerIndex = 1,
            rationale = "Fear, excitement, and anger narrow focus and push fast action — the conditions social engineering needs.",
            id = "bulk-q091", briefKey = "cognitive/emotion", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A message makes you angry and demands an immediate reply. What do you do?",
            options = listOf("Reply immediately", "Pause, let the emotion pass, then decide", "Delete it", "Forward it angrily"),
            answerIndex = 1,
            rationale = "Anger-driven urgency is a manipulation pattern. Pausing breaks it and restores judgement.",
            id = "bulk-q092", briefKey = "cognitive/emotion", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What emotion do most phishing messages exploit?",
            options = listOf("Joy", "Fear or urgency, sometimes paired with curiosity or greed", "Boredom", "Calm"),
            answerIndex = 1,
            rationale = "Fear and urgency — account closure, a fine, a missed opportunity — drive the fast clicks phishing needs.",
            id = "bulk-q093", briefKey = "cognitive/emotion", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is a mental model in OPSEC?",
            options = listOf("A diagram", "A simplified picture of how a system or adversary works, used to predict and decide", "A memory trick", "A checklist"),
            answerIndex = 1,
            rationale = "Mental models simplify complex systems into pictures you can reason with — and update when they prove wrong.",
            id = "bulk-q094", briefKey = "cognitive/models", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What should you do when a mental model proves wrong?",
            options = listOf("Defend it", "Update it with the new evidence", "Ignore the evidence", "Find a new model entirely"),
            answerIndex = 1,
            rationale = "Models are tools, not identities. Update them when evidence contradicts them, or they mislead you.",
            id = "bulk-q095", briefKey = "cognitive/models", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Which mental model helps with passwords?",
            options = listOf("Passwords as keys", "Passwords as secrets that can be stolen, guessed, or leaked — never as identity itself", "Passwords as names", "Passwords as locks that cannot be picked"),
            answerIndex = 1,
            rationale = "Treating passwords as stealable secrets, not as proof of identity, leads to second factors and unique passwords.",
            id = "bulk-q096", briefKey = "cognitive/models", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What mindset best supports OPSEC?",
            options = listOf("Suspicion of everyone", "Calm scepticism: verify what matters, trust what checks out", "Blind trust", "Constant fear"),
            answerIndex = 1,
            rationale = "Calm scepticism verifies proportionately and trusts verified things. Suspicion and fear both exhaust attention.",
            id = "bulk-q097", briefKey = "cognitive/mindset", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is the difference between caution and paranoia?",
            options = listOf("None", "Caution is proportionate and evidence-based; paranoia is constant and unfocused", "Caution is slower", "Paranoia is more accurate"),
            answerIndex = 1,
            rationale = "Caution scales with evidence and stakes. Paranoia treats everything as equally threatening, which protects nothing well.",
            id = "bulk-q098", briefKey = "cognitive/mindset", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "How do you stay calm under pressure in a security decision?",
            options = listOf("Decide faster", "Follow a pre-decided procedure: pause, check, verify", "Delegate immediately", "Ignore the pressure"),
            answerIndex = 1,
            rationale = "Pre-decided procedures replace panicked improvisation with practised steps: pause, check, verify.",
            id = "bulk-q099", briefKey = "cognitive/calm-pressure", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What should a team do before a high-pressure incident?",
            options = listOf("Nothing; pressure reveals character", "Agree procedures, roles, and verification steps in advance", "Assign blame in advance", "Hope it does not happen"),
            answerIndex = 1,
            rationale = "Procedures agreed in calm conditions are what hold in high-pressure ones. Improvisation under pressure fails.",
            id = "bulk-q100", briefKey = "cognitive/calm-pressure", difficulty = "Intermediate"
        )
    )
}
