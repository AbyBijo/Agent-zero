package com.abybijo.agent0.data

/**
 * Final exam bank — v2.0 Phase 5d.
 *
 * A DEDICATED questionnaire, separate from the practice bank: 100 MCQs,
 * every one linked to a curriculum brief, spanning all 16 chapters.
 * At least half are marked Advanced — scenario judgements and tricky
 * distinctions, not just definitions. The exam screen shuffles both
 * question order and option order on every attempt, so no two takes
 * look alike. Pass mark is 70/100, in the exam screen.
 */
object QuizBankFinal {
    val all: List<QuizQuestion> = listOf(
        // ── CH-00 Orientation (5) ──────────────────────────────────
        QuizQuestion(
            prompt = "Rule 1 says: if a person is in danger, what comes first?",
            options = listOf("Finish the lesson first", "Get real-world help first", "Wipe your devices first", "Stay silent until it passes"),
            answerIndex = 1,
            rationale = "Rule 1 never means do not report or do not help. Real danger outranks every lesson.",
            id = "final-q001", briefKey = "orientation/rules", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "A new learner asks where to start. Which is the honest first-week advice?",
            options = listOf("Buy new hardware immediately", "One small habit, repeated daily", "Memorise every threat actor", "Go fully anonymous on day one"),
            answerIndex = 1,
            rationale = "Posture is built by one repeatable habit at a time, not by a single dramatic overhaul.",
            id = "final-q002", briefKey = "orientation/first-week", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Which statement about how to use this course is correct?",
            options = listOf("Skip ahead to the advanced chapters first", "Follow the sequence; each brief builds on the last", "Read only the chapters that sound interesting", "Complete the exam before any brief"),
            answerIndex = 1,
            rationale = "Briefs unlock in sequence because later material assumes earlier habits are in place.",
            id = "final-q003", briefKey = "orientation/howto", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "A friend says OPSEC means never being found by anyone. What is wrong with that?",
            options = listOf("Nothing; that is the definition", "It promises perfection, which OPSEC never does", "It is too modest a goal", "It only applies to governments"),
            answerIndex = 1,
            rationale = "OPSEC reduces risk to an acceptable level against a named adversary. Absolute invisibility is not on offer.",
            id = "final-q004", briefKey = "orientation/rules", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You missed a week of practice. What does the course expect you to do?",
            options = listOf("Restart from the first brief", "Record the miss without judgement and resume", "Pretend the week happened", "Double the next week to compensate"),
            answerIndex = 1,
            rationale = "Missed practice is recorded, not punished. The posture survives a gap; guilt does not help it.",
            id = "final-q005", briefKey = "orientation/first-week", difficulty = "Intermediate"
        ),
        // ── CH-01 Doctrine (6) ─────────────────────────────────────
        QuizQuestion(
            prompt = "What is the FIRST step of the five-step OPSEC process?",
            options = listOf("Analyse threats", "Identify critical information", "Apply countermeasures", "Assess risk"),
            answerIndex = 1,
            rationale = "You cannot protect what you have not identified as critical.",
            id = "final-q006", briefKey = "doctrine/step1", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "A journalist and a shopkeeper face different risks. What does that prove about step 2?",
            options = listOf("Threat analysis is optional for ordinary people", "Adversaries and their capabilities differ by person", "Only journalists need OPSEC", "Risk is the same for everyone"),
            answerIndex = 1,
            rationale = "Threat analysis is personal: who wants what you have, and what can they actually do?",
            id = "final-q007", briefKey = "doctrine/step2", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "You discover your home address is in a leaked database. Which step does this belong to?",
            options = listOf("Identifying critical information", "Analysing vulnerabilities", "Applying countermeasures", "Assessing risk"),
            answerIndex = 1,
            rationale = "A leak is a vulnerability: a weakness in how your information was exposed.",
            id = "final-q008", briefKey = "doctrine/step3", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Two countermeasures cost the same. One blocks a likely attack, the other blocks a rare one. Which do you pick?",
            options = listOf("The rare one, because it is more exotic", "The likely one; risk is likelihood times impact", "Neither; wait for a perfect option", "Both, regardless of effort"),
            answerIndex = 1,
            rationale = "Step 5 weighs likelihood and impact. A likely attack outranks a cinematic one.",
            id = "final-q009", briefKey = "doctrine/step5", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A ten-minute threat model must answer one question before any other. Which?",
            options = listOf("What tools should I buy?", "What am I actually protecting, from whom?", "How do I disappear completely?", "What did other people do?"),
            answerIndex = 1,
            rationale = "Everything else in the model hangs off what matters and who threatens it.",
            id = "final-q010", briefKey = "doctrine/threat-model-ten", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "NSDD 298 is best described as what?",
            options = listOf("A hacking toolkit", "The US national OPSEC doctrine that frames the five steps", "A password standard", "A social media policy"),
            answerIndex = 1,
            rationale = "The five-step spine of this course comes from NSDD 298, the national OPSEC programme document.",
            id = "final-q011", briefKey = "doctrine/origins", difficulty = "Intermediate"
        ),
        // ── CH-02 Digital (8) ──────────────────────────────────────
        QuizQuestion(
            prompt = "Which password practice actually survives a database breach?",
            options = listOf("One strong password reused everywhere", "A unique, randomly generated password per service", "Changing one password monthly", "A clever phrase with your birth year"),
            answerIndex = 1,
            rationale = "Uniqueness is what limits a breach to one service. Strength without uniqueness fails everywhere at once.",
            id = "final-q012", briefKey = "digital/passwords", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "An attacker SIM-swaps your number. Which second factor still protects you?",
            options = listOf("SMS code", "Email link", "FIDO2 hardware key", "Security question about your pet"),
            answerIndex = 2,
            rationale = "FIDO2 keys are bound to the real site and cannot be intercepted by taking over a phone number.",
            id = "final-q013", briefKey = "digital/twofactor", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You encrypt a file with a strong cipher but store the key beside it. What failed?",
            options = listOf("Nothing; encryption is enough", "Key management — the cipher is only as safe as its key", "The file format", "The operating system"),
            answerIndex = 1,
            rationale = "Encryption moves the secret into the key. A key stored with the data is no protection at all.",
            id = "final-q014", briefKey = "digital/encryption", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A messenger claims end-to-end encryption but keeps your contact graph on its servers. What leaks?",
            options = listOf("Nothing important", "Metadata: who you talk to, when, and how often", "Only your profile photo", "Only deleted messages"),
            answerIndex = 1,
            rationale = "Metadata is content-adjacent evidence. Who and when often reveals more than the words.",
            id = "final-q015", briefKey = "digital/comms", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Your phone is seized while unlocked. Which protection mattered most in that moment?",
            options = listOf("A VPN", "A short auto-lock and a strong passcode", "A privacy screen", "Deleting social apps"),
            answerIndex = 1,
            rationale = "An unlocked device bypasses most software defences. Lock behaviour is the last line.",
            id = "final-q016", briefKey = "digital/devices", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A hotel Wi-Fi page asks you to install a certificate to connect. What should you do?",
            options = listOf("Install it; hotels are trusted", "Refuse — it enables traffic inspection", "Install it only for one hour", "Use it only for video"),
            answerIndex = 1,
            rationale = "A foreign root certificate lets the network decrypt your TLS traffic. Never install one casually.",
            id = "final-q017", briefKey = "digital/network", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You receive a password-reset email you did not request. What is the safe response?",
            options = listOf("Click to see who sent it", "Ignore it and check the account directly via its own app", "Reply asking for details", "Forward it to friends"),
            answerIndex = 1,
            rationale = "Never act through the suspicious message. Go to the service yourself, through a route you trust.",
            id = "final-q018", briefKey = "digital/email", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Your backup has never been restore-tested. What do you actually have?",
            options = listOf("A backup", "A hope, not a backup", "A partial backup", "An encrypted backup"),
            answerIndex = 1,
            rationale = "An untested restore is a claim, not a capability. Backups are proven only by restoring.",
            id = "final-q019", briefKey = "digital/backups-restore", difficulty = "Advanced"
        ),
        // ── CH-03 Physical (7) ─────────────────────────────────────
        QuizQuestion(
            prompt = "Someone follows you through a secured door without badging in. What is this called?",
            options = listOf("Phishing", "Tailgating", "Shoulder surfing", "Dumpster diving"),
            answerIndex = 1,
            rationale = "Tailgating exploits politeness: the door, not the person, was authorised.",
            id = "final-q020", briefKey = "physical/access", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "You leave a whiteboard full of client names visible through a glass wall. Which practice failed?",
            options = listOf("Encryption", "Clean desk and clean screen", "Two-factor authentication", "Backup policy"),
            answerIndex = 1,
            rationale = "Visible work is exposed work. Clean desk covers whiteboards, printouts, and screens alike.",
            id = "final-q021", briefKey = "physical/cleandesk", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Before a trip, what is the single most effective device step?",
            options = listOf("Buy a new phone case", "Travel with a clean device carrying only what the trip needs", "Turn off Bluetooth at the airport", "Charge fully before departure"),
            answerIndex = 1,
            rationale = "A device cannot leak what it does not carry. Minimise first, harden second.",
            id = "final-q022", briefKey = "physical/travel", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You notice the same stranger at three unrelated places in one day. What is the disciplined response?",
            options = listOf("Confront them immediately", "Note times and places, vary your route, do not confirm you noticed", "Post about it publicly", "Assume coincidence and ignore it"),
            answerIndex = 1,
            rationale = "Surveillance is confirmed by pattern, not by one sighting. Record, vary, and stay calm.",
            id = "final-q023", briefKey = "physical/surveillance", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Which disposal method reliably destroys data on a modern SSD?",
            options = listOf("Deleting the files", "Formatting the drive", "Cryptographic erase or physical destruction", "Emptying the recycle bin"),
            answerIndex = 2,
            rationale = "SSDs remap cells, so overwrite-based wiping misses data. Crypto-erase or destruction is reliable.",
            id = "final-q024", briefKey = "physical/assets", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Your home router still uses the factory admin password. What is the risk?",
            options = listOf("Only slower Wi-Fi", "Anyone on the network path can reconfigure your home network", "Only neighbours can see it", "No risk if Wi-Fi is password-protected"),
            answerIndex = 1,
            rationale = "The admin password is public knowledge. Home base security starts with changing it.",
            id = "final-q025", briefKey = "physical/home-base", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A cleaner asks to hold your office key overnight for convenience. What do you do?",
            options = listOf("Agree; it is only one night", "Refuse — keys are never lent, and access is logged", "Agree if they seem trustworthy", "Lend a copy instead"),
            answerIndex = 1,
            rationale = "Access control fails the moment keys circulate informally. No exceptions for convenience.",
            id = "final-q026", briefKey = "physical/access", difficulty = "Advanced"
        ),
        // ── CH-04 Human (6) ────────────────────────────────────────
        QuizQuestion(
            prompt = "A caller creates urgency, authority, and secrecy in one conversation. What is happening?",
            options = listOf("Good customer service", "A social-engineering vector stacking influence levers", "A routine verification", "A coincidence"),
            answerIndex = 1,
            rationale = "Urgency plus authority plus secrecy is the classic stack. Each lever alone is plausible; together they are a signal.",
            id = "final-q027", briefKey = "human/vectors", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "An email from your bank has perfect branding but the link domain is one letter off. What is it?",
            options = listOf("A genuine rebrand", "A typo-squat phishing attempt", "A harmless mirror", "A test message"),
            answerIndex = 1,
            rationale = "Brands are easy to copy; domains are the check. One letter off is the whole attack.",
            id = "final-q028", briefKey = "human/redflags", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A stranger online knows your workplace and asks you to confirm a project name. What is the safe move?",
            options = listOf("Confirm it; they already seem to know", "Refuse and verify through a separate, trusted channel", "Ask them for more details first", "Confirm only part of it"),
            answerIndex = 1,
            rationale = "Partial knowledge is a lure. Verification never travels through the channel making the claim.",
            id = "final-q029", briefKey = "human/verification", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Which Cialdini principle is at work when a requester says everyone on your team already agreed?",
            options = listOf("Reciprocity", "Social proof", "Scarcity", "Liking"),
            answerIndex = 1,
            rationale = "Social proof pressures compliance by inventing consensus. Check the consensus, not the claim.",
            id = "final-q030", briefKey = "human/influence", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Someone you just met online asks for a small favour, then a larger one. What pattern is this?",
            options = listOf("Friendship", "Foot-in-the-door escalation", "Random kindness", "Networking"),
            answerIndex = 1,
            rationale = "Small yeses are engineered to make the big yes feel consistent. Notice the staircase.",
            id = "final-q031", briefKey = "human/verifying-strangers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A voice message sounds exactly like your manager asking for gift cards. What do you check first?",
            options = listOf("The tone of voice", "Whether the request arrived through a verified, separate channel", "The background noise", "How urgent it sounds"),
            answerIndex = 1,
            rationale = "Voice can now be cloned. The channel, not the voice, is the verification.",
            id = "final-q032", briefKey = "human/vectors", difficulty = "Advanced"
        ),
        // ── CH-05 Cognitive (6) ────────────────────────────────────
        QuizQuestion(
            prompt = "You feel safe because nothing bad has happened to you yet. Which bias is that?",
            options = listOf("Confirmation bias", "Optimism bias", "Anchoring", "Availability bias"),
            answerIndex = 1,
            rationale = "Optimism bias quietly downgrades your own risk while leaving everyone else's intact.",
            id = "final-q033", briefKey = "cognitive/biases", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Under sudden pressure you default to the first option that feels familiar. What should training change?",
            options = listOf("Your feelings", "Your default — rehearsed responses replace panic responses", "Your memory", "Your job"),
            answerIndex = 1,
            rationale = "Pressure does not create behaviour; it reveals the rehearsed one. Train the default.",
            id = "final-q034", briefKey = "cognitive/calm-pressure", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You keep noticing evidence that supports your existing tool choice and ignore the rest. What is it?",
            options = listOf("Good research", "Confirmation bias", "Risk assessment", "Threat modelling"),
            answerIndex = 1,
            rationale = "Confirmation bias curates the evidence. Deliberately seek the case against your choice.",
            id = "final-q035", briefKey = "cognitive/biases", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What does defence in depth actually mean?",
            options = listOf("One perfect defence", "Several independent layers so one failure is not fatal", "More passwords", "Hiding everything"),
            answerIndex = 1,
            rationale = "Layers are independent by design. If one falls, the next still holds.",
            id = "final-q036", briefKey = "cognitive/models", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "An emotional message demands an immediate decision. What is the disciplined first move?",
            options = listOf("Decide fast to end the discomfort", "Pause: emotion is the lever, delay breaks it", "Forward it for a second opinion", "Delete it unread"),
            answerIndex = 1,
            rationale = "Emotion compresses judgement on purpose. A pause restores the time the attacker tried to steal.",
            id = "final-q037", briefKey = "cognitive/emotion", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Which mindset survives contact with a real adversary best?",
            options = listOf("Assume nothing can go wrong", "Assume breach and verify", "Assume tools solve it", "Assume you are uninteresting"),
            answerIndex = 1,
            rationale = "Assume breach plans for failure instead of denying it. Verification replaces hope.",
            id = "final-q038", briefKey = "cognitive/mindset", difficulty = "Advanced"
        ),
        // ── CH-06 Identity (7) ─────────────────────────────────────
        QuizQuestion(
            prompt = "You use one identity for work, activism, and family. What breaks first?",
            options = listOf("Nothing, if passwords differ", "Compartmentation — one compromise links all three lives", "Battery life", "App performance"),
            answerIndex = 1,
            rationale = "Compartments exist so one breach stays in one life. A single identity merges the blast radius.",
            id = "final-q039", briefKey = "identity/compartments", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A photo you posted contains GPS coordinates. What leaked?",
            options = listOf("Only the image", "EXIF metadata: location, device, and time", "Only the caption", "Nothing, if the account is private"),
            answerIndex = 1,
            rationale = "Metadata travels inside the file. Strip it before anything is posted anywhere.",
            id = "final-q040", briefKey = "identity/photo-metadata", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A data broker lists your old addresses. What is the correct first step?",
            options = listOf("Ignore it; old data is harmless", "Self-audit what is exposed, then request removal", "Create a new identity", "Delete your accounts"),
            answerIndex = 1,
            rationale = "Removal starts with an audit: you cannot retract what you have not inventoried.",
            id = "final-q041", briefKey = "identity/osint", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Your persona account and your real account follow the same ten people. What is the flaw?",
            options = listOf("None; follows are public anyway", "Behavioural linkage — patterns identify you across personas", "Too few follows", "The algorithm"),
            answerIndex = 1,
            rationale = "Personas fail on behaviour, not just names. Overlapping patterns are fingerprints.",
            id = "final-q042", briefKey = "identity/personas", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Which metadata field most often betrays a whistleblower document?",
            options = listOf("File size", "Author name and editing history in the file properties", "Font choice", "Page count"),
            answerIndex = 1,
            rationale = "Documents carry author and revision history by default. Scrub before sharing, always.",
            id = "final-q043", briefKey = "identity/metadata", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You keep a separate browser profile for sensitive research. What does it protect?",
            options = listOf("Your passwords", "Cross-session linkage via cookies and history", "Your hardware", "Your network speed"),
            answerIndex = 1,
            rationale = "Profiles separate state. Without separation, one login links every session together.",
            id = "final-q044", briefKey = "identity/compartments", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A reverse image search finds your anonymous avatar on your real profile. What failed?",
            options = listOf("The search engine", "Image reuse across identities", "Password strength", "Two-factor authentication"),
            answerIndex = 1,
            rationale = "Never reuse images across identities. Pixels are identifiers too.",
            id = "final-q045", briefKey = "identity/personas", difficulty = "Advanced"
        ),
        // ── CH-07 Tradecraft (6) ───────────────────────────────────
        QuizQuestion(
            prompt = "You suspect your account is compromised. What is the first-hour priority?",
            options = listOf("Find out who did it", "Contain: revoke sessions, rotate credentials, preserve evidence", "Delete the account", "Warn the media"),
            answerIndex = 1,
            rationale = "Containment comes before attribution. Every minute of access is more damage.",
            id = "final-q046", briefKey = "tradecraft/first-hour", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does a threat model expire?",
            options = listOf("It does not", "Adversaries, assets, and habits all change over time", "The document format ages", "Tools update"),
            answerIndex = 1,
            rationale = "A model is a snapshot. Lives change, so models must be revisited on a schedule.",
            id = "final-q047", briefKey = "tradecraft/threatmodel", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "After an incident, what is the after-action review actually for?",
            options = listOf("Assigning blame", "Finding what failed so the next incident goes better", "Filing paperwork", "Closing the ticket"),
            answerIndex = 1,
            rationale = "Reviews convert incidents into improvements. Blame converts them into silence.",
            id = "final-q048", briefKey = "tradecraft/incident", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Your security posture decayed over six quiet months. What is the most likely cause?",
            options = listOf("Hackers got smarter", "Habits drifted without review or practice", "The tools expired", "The threat vanished"),
            answerIndex = 1,
            rationale = "Posture decays by drift, not by attack. Reviews and drills are the maintenance.",
            id = "final-q049", briefKey = "tradecraft/sustaining", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "An incident response plan that nobody has rehearsed is best described as what?",
            options = listOf("Complete", "A draft, not a capability", "Sufficient for small incidents", "Better than nothing in all cases"),
            answerIndex = 1,
            rationale = "Unrehearsed plans fail at the first decision under stress. Rehearsal is the plan.",
            id = "final-q050", briefKey = "tradecraft/incident", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You find a suspicious login from another country. Before panicking, what do you verify?",
            options = listOf("Your feelings", "Whether you, a VPN, or a travelling device explain it", "The news", "Your horoscope"),
            answerIndex = 1,
            rationale = "Verify the benign explanation first, through evidence, then escalate if none fits.",
            id = "final-q051", briefKey = "tradecraft/threatmodel", difficulty = "Intermediate"
        ),
        // ── CH-08 Fieldcraft (6) ───────────────────────────────────
        QuizQuestion(
            prompt = "What is a clean device for border crossing?",
            options = listOf("A wiped phone with no personal data", "A device carrying only what the trip needs, with the rest left behind", "A brand-new phone", "Any phone with a VPN"),
            answerIndex = 1,
            rationale = "Clean means minimal and replaceable, not merely new. What stays home cannot be seized.",
            id = "final-q052", briefKey = "fieldcraft/border-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Which channel is safest for coordinating sensitive field work?",
            options = listOf("Group chat on a mainstream app", "A pre-agreed secure channel with verified keys, used only for that work", "Email with a clever subject", "Public social posts in code"),
            answerIndex = 1,
            rationale = "Secure comms are agreed and verified before the work, not improvised during it.",
            id = "final-q053", briefKey = "fieldcraft/secure-comms", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "You are under surveillance at work. What is the best first step?",
            options = listOf("Confront the watcher", "Stay calm, note patterns, and protect the work without signalling awareness", "Quit immediately", "Discuss it on the office network"),
            answerIndex = 1,
            rationale = "Signalling awareness changes the watcher's behaviour and burns your advantage. Observe first.",
            id = "final-q054", briefKey = "fieldcraft/under-surveillance", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A teammate keeps work files on a personal cloud drive for convenience. What is the risk?",
            options = listOf("None, if the drive is password-protected", "Loss of control: the material now lives outside the agreed boundary", "Slower access", "Extra cost"),
            answerIndex = 1,
            rationale = "Convenience moves material outside the boundary the team agreed. The boundary is the protection.",
            id = "final-q055", briefKey = "fieldcraft/team-opsec", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Which financial habit best limits the damage of a merchant breach?",
            options = listOf("One card for everything", "Separate cards and accounts so one breach cannot drain everything", "Paying only in cash", "Checking statements yearly"),
            answerIndex = 1,
            rationale = "Separation contains financial blast radius the same way compartments contain identity risk.",
            id = "final-q056", briefKey = "fieldcraft/financial-privacy", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What sustains fieldcraft after the initial training fades?",
            options = listOf("Willpower", "Drills, reviews, and a routine that survives boredom", "Better gadgets", "Fear"),
            answerIndex = 1,
            rationale = "Routine outlasts motivation. Drills keep responses ready when nothing has happened lately.",
            id = "final-q057", briefKey = "fieldcraft/sustain", difficulty = "Intermediate"
        ),
        // ── CH-09 AI Era (7) ───────────────────────────────────────
        QuizQuestion(
            prompt = "An AI assistant remembers your project details across sessions. What is the exposure?",
            options = listOf("None; memory is private by default", "Persistent memory can leak across contexts and later prompts", "Only slower answers", "Only cost"),
            answerIndex = 1,
            rationale = "AI memory is a store that can resurface. Treat what you tell it as retained, not forgotten.",
            id = "final-q058", briefKey = "ai-era/ai-memory", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A video shows a public figure saying something shocking. What do you verify before sharing?",
            options = listOf("How many views it has", "Provenance: source, context, and independent corroboration", "The comments", "Your feelings about the figure"),
            answerIndex = 1,
            rationale = "Deepfakes attack provenance, not pixels. Check where it came from before what it shows.",
            id = "final-q059", briefKey = "ai-era/ai-deepfake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "An AI phishing email is perfectly written with no typos. What still gives it away?",
            options = listOf("Nothing; perfect means genuine", "The request and the channel — verify outside the message", "The greeting", "The length"),
            answerIndex = 1,
            rationale = "AI removed the old tells. Verification moved from spotting errors to checking the request itself.",
            id = "final-q060", briefKey = "ai-era/ai-phishing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You paste sensitive code into a public AI tool for debugging. What just happened?",
            options = listOf("Nothing, if you delete the chat", "You shared the material with a third-party service under its terms", "You improved security", "You encrypted it"),
            answerIndex = 1,
            rationale = "Pasting is publishing to that service. Deleting the chat does not unshare the data.",
            id = "final-q061", briefKey = "ai-era/ai-research-code", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "An AI agent offers to act across your email and files on your behalf. What must you set first?",
            options = listOf("A faster model", "Strict boundaries: what it may touch, and what it must never do alone", "A nicer voice", "More plugins"),
            answerIndex = 1,
            rationale = "Agents amplify access. Boundaries come before capability, or the agent becomes the breach.",
            id = "final-q062", briefKey = "ai-era/ai-agents", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Your feed keeps showing content that confirms your views. What is the OPSEC cost?",
            options = listOf("None; feeds are entertainment", "A narrowed picture of reality that degrades judgement", "Battery drain", "Slower internet"),
            answerIndex = 1,
            rationale = "A curated feed is a curated reality. Judgement trained on one view fails on the others.",
            id = "final-q063", briefKey = "ai-era/ai-feed", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "AI output looks authoritative and cites sources. Why must you still verify it?",
            options = listOf("You must not; citations prove it", "Models can fabricate citations and confident-sounding errors", "It is too slow to check", "Verification is rude"),
            answerIndex = 1,
            rationale = "Fluency is not truth. Citations from a model are claims to check, not evidence.",
            id = "final-q064", briefKey = "ai-era/ai-verify-output", difficulty = "Intermediate"
        ),
        // ── CH-10 Financial Privacy (6) ────────────────────────────
        QuizQuestion(
            prompt = "Your payment app, loyalty cards, and bank app all feed one profile of you. What is that profile called?",
            options = listOf("A credit score", "A financial footprint", "A budget", "A receipt"),
            answerIndex = 1,
            rationale = "Every transaction is a data point. The footprint is the picture they form together.",
            id = "final-q065", briefKey = "financial/fin-footprint", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "Why separate everyday spending from sensitive spending?",
            options = listOf("For accounting neatness", "So one breach or statement cannot expose the whole picture", "To earn more rewards", "Banks require it"),
            answerIndex = 1,
            rationale = "Separation is compartmentation for money: each account reveals only its own slice.",
            id = "final-q066", briefKey = "financial/fin-separation", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A prepaid card for online purchases mainly protects you from what?",
            options = listOf("Overspending", "A merchant breach draining your main funds", "Forgetting passwords", "Currency fees"),
            answerIndex = 1,
            rationale = "Prepaid caps the loss at the loaded amount. The main account never meets the merchant.",
            id = "final-q067", briefKey = "financial/fin-cash-prepaid", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "An investment tip arrives with guaranteed returns and a deadline. What is it most likely?",
            options = listOf("A rare opportunity", "A scam — guarantees plus urgency are the signature", "Insider information", "A test of loyalty"),
            answerIndex = 1,
            rationale = "Guaranteed returns do not exist in real markets. Urgency exists to stop you checking.",
            id = "final-q068", briefKey = "financial/fin-scams", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Crypto transactions are often called anonymous. What is the accurate word?",
            options = listOf("Anonymous", "Pseudonymous — addresses are traceable and linkable", "Invisible", "Untraceable"),
            answerIndex = 1,
            rationale = "Chains are public ledgers. Pseudonyms link up, and exchanges link them to names.",
            id = "final-q069", briefKey = "financial/fin-crypto", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "You keep tax records in a single unencrypted folder. What is the exposure if it leaks?",
            options = listOf("Only money details", "Identity, income, addresses, and dependants in one package", "Only the current year", "Nothing, if the folder is old"),
            answerIndex = 1,
            rationale = "Tax records are identity dossiers. Encrypt and minimise them like any sensitive archive.",
            id = "final-q070", briefKey = "financial/fin-tax-records", difficulty = "Intermediate"
        ),
        // ── CH-11 Team OPSEC (6) ───────────────────────────────────
        QuizQuestion(
            prompt = "A new team member needs access on day one. What comes before the password?",
            options = listOf("A welcome lunch", "Need-to-know briefing: what they may access, and what they must not", "A team photo", "A faster laptop"),
            answerIndex = 1,
            rationale = "Onboarding is a security event. Access follows the briefing, never precedes it.",
            id = "final-q071", briefKey = "team/team-onboarding", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A vendor asks for internal documents to prepare a quote. What governs the answer?",
            options = listOf("Politeness", "Need-to-know and a defined boundary for what vendors may see", "The size of the quote", "How long they have worked with you"),
            answerIndex = 1,
            rationale = "Vendors get the minimum for the task. Familiarity is not authorisation.",
            id = "final-q072", briefKey = "team/team-vendors", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "In a meeting, someone shares sensitive detail that half the room does not need. What do you do?",
            options = listOf("Let it pass to avoid awkwardness", "Redirect: note the boundary and move detail to the right channel", "Share more to balance it", "Record the meeting"),
            answerIndex = 1,
            rationale = "Meetings leak by drift. Naming the boundary in the moment protects everyone present.",
            id = "final-q073", briefKey = "team/team-meetings", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A teammate makes a security mistake and hides it. What does the team lose?",
            options = listOf("Nothing, if nothing leaked", "The chance to contain it early — silence is the real damage", "A scapegoat", "A policy update"),
            answerIndex = 1,
            rationale = "Mistakes are containable; hidden mistakes are not. Teams that punish honesty get silence.",
            id = "final-q074", briefKey = "team/team-mistake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Remote work expands the team's attack surface mainly through what?",
            options = listOf("Time zones", "Home networks and personal devices outside the team's control", "Video fatigue", "Chatty channels"),
            answerIndex = 1,
            rationale = "Remote moves work onto networks and devices the team does not govern. That is the surface.",
            id = "final-q075", briefKey = "team/team-remote", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "What is the manager's first OPSEC duty?",
            options = listOf("Buying tools", "Modelling the discipline and protecting the team's boundaries", "Monitoring staff", "Writing reports"),
            answerIndex = 1,
            rationale = "Teams copy their manager. A manager who cuts corners authorises everyone to do the same.",
            id = "final-q076", briefKey = "team/team-managers", difficulty = "Intermediate"
        ),
        // ── CH-12 Incident Response (6) ────────────────────────────
        QuizQuestion(
            prompt = "You discover a breach at 2 a.m. What is the first-hour sequence?",
            options = listOf("Investigate quietly, then decide", "Contain, preserve evidence, escalate through the agreed channel", "Delete everything and reinstall", "Post a warning publicly"),
            answerIndex = 1,
            rationale = "Contain first, preserve evidence second, escalate third. Investigation without containment spreads damage.",
            id = "final-q077", briefKey = "incident/ir-first-hour", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why preserve evidence before wiping a compromised device?",
            options = listOf("For curiosity", "To understand scope, find the entry point, and support reporting", "To slow the response", "It is optional"),
            answerIndex = 1,
            rationale = "Wiping destroys the map of the attack. Preserve first, then rebuild.",
            id = "final-q078", briefKey = "incident/ir-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Your identity documents were stolen. What do you do besides changing passwords?",
            options = listOf("Wait and watch", "Start identity-theft recovery: freeze credit, notify issuers, log everything", "Change your name", "Delete social accounts only"),
            answerIndex = 1,
            rationale = "Stolen identity needs a recovery process, not just new passwords. Freeze, notify, document.",
            id = "final-q079", briefKey = "incident/ir-identity-theft", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "When reporting an incident, what makes the report actually useful?",
            options = listOf("Length", "Timeline, scope, evidence, and what you have already contained", "Blame", "Emotion"),
            answerIndex = 1,
            rationale = "Responders need facts in order: when, what, how far, what is already done.",
            id = "final-q080", briefKey = "incident/ir-reporting", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A colleague asks what happened during an ongoing incident. What do you share?",
            options = listOf("Everything, for transparency", "Only what they need to know, through the agreed channel", "Nothing ever", "Rumours to keep them alert"),
            answerIndex = 1,
            rationale = "Talking about incidents follows need-to-know too. Loose talk becomes a second incident.",
            id = "final-q081", briefKey = "incident/ir-talking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Recovery is declared complete. What proves it?",
            options = listOf("The announcement", "A checklist: access rotated, entry closed, monitoring confirmed, review scheduled", "A week without alerts", "A new password"),
            answerIndex = 1,
            rationale = "Recovery is a verified state, not a feeling. The checklist is the proof.",
            id = "final-q082", briefKey = "incident/ir-recovery-checklist", difficulty = "Advanced"
        ),
        // ── CH-13 OSINT / Counter-OSINT (6) ────────────────────────
        QuizQuestion(
            prompt = "What is the purpose of a self-audit, in one sentence?",
            options = listOf("To spy on others", "To see yourself as an adversary would, before they do", "To delete the internet", "To build a profile"),
            answerIndex = 1,
            rationale = "Self-audit is defensive: find your exposure through the same public sources an adversary uses.",
            id = "final-q083", briefKey = "osint/osint-self-audit", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "You are about to speak publicly. What do you check first?",
            options = listOf("Your slides", "What the audience can already find about you, and what you will newly reveal", "The venue Wi-Fi", "Ticket sales"),
            answerIndex = 1,
            rationale = "Public speaking adds new exposure to existing exposure. Audit both before the talk.",
            id = "final-q084", briefKey = "osint/osint-public-speaking", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A broker removal service promises to erase you from the internet. What is true?",
            options = listOf("It fully works", "It reduces exposure but cannot erase public records or re-listings", "It is a scam by definition", "It works once, permanently"),
            answerIndex = 1,
            rationale = "Removal is reduction and maintenance, not erasure. Data reappears; audits repeat.",
            id = "final-q085", briefKey = "osint/osint-brokers", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Your household shares one streaming account, one address book, one photo cloud. What is the exposure?",
            options = listOf("None; families share", "Household linkage — one member's exposure maps the whole household", "Cost only", "Slower devices"),
            answerIndex = 1,
            rationale = "Households leak as units. Shared accounts link members whether they chose it or not.",
            id = "final-q086", briefKey = "osint/osint-household", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Which of these techniques must NEVER be turned on another person?",
            options = listOf("Checking your own exposure", "Doxxing-style investigation of someone else", "Removing your own listings", "Reviewing your own posts"),
            answerIndex = 1,
            rationale = "These techniques are for self-defence only. Turning them on others is harassment, not OPSEC.",
            id = "final-q087", briefKey = "osint/osint-shadow", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "You hold a public role and a private life. What keeps them apart?",
            options = listOf("Good intentions", "A hard boundary: separate identities, accounts, and circles, maintained daily", "A pseudonym alone", "Privacy settings"),
            answerIndex = 1,
            rationale = "A pseudonym without separation is a label, not a boundary. The daily maintenance is the protection.",
            id = "final-q088", briefKey = "osint/osint-private-core", difficulty = "Advanced"
        ),
        // ── CH-14 Travel (6) ───────────────────────────────────────
        QuizQuestion(
            prompt = "At a border, officials ask you to unlock your device. What is the honest general position?",
            options = listOf("Refusal is always safe", "Law varies by country; a clean device limits what refusal or compliance exposes", "Compliance is always required", "Encryption makes the question moot"),
            answerIndex = 1,
            rationale = "Border powers differ by jurisdiction — this is general information, not legal advice. Minimise before you arrive.",
            id = "final-q089", briefKey = "travel/travel-border", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Your hotel room has a safe. What do you NOT put in it?",
            options = listOf("Your passport copy", "The only copy of sensitive material with no backup elsewhere", "Spare cash", "A spare key"),
            answerIndex = 1,
            rationale = "A hotel safe is a delay, not a vault, and staff access exists. Never make it the sole copy of anything vital.",
            id = "final-q090", briefKey = "travel/travel-hotels", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "You must hold a sensitive meeting while travelling. What do you arrange first?",
            options = listOf("A quiet cafe", "A private space, a clean channel, and a check for listeners — before the meeting", "Good coffee", "A scenic view"),
            answerIndex = 1,
            rationale = "Meeting security is arranged before the meeting, not improvised in it.",
            id = "final-q091", briefKey = "travel/travel-meetings", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Your device is taken at a border and returned hours later. What do you assume?",
            options = listOf("Nothing happened", "It may have been imaged — treat it as untrusted until checked and, if needed, replaced", "It was only charged", "The case was inspected"),
            answerIndex = 1,
            rationale = "Out-of-sight time is enough for imaging. Returned does not mean untouched.",
            id = "final-q092", briefKey = "travel/travel-device-taken", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Back home after a high-risk trip, what is the first routine step?",
            options = listOf("Post photos immediately", "Debrief: what was exposed, what changed, what to rotate or retire", "Forget the trip", "Buy souvenirs"),
            answerIndex = 1,
            rationale = "Return-home review closes the trip's exposure window instead of carrying it forward.",
            id = "final-q093", briefKey = "travel/travel-return-home", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "A travel network requires an app install to connect. What is the safe choice?",
            options = listOf("Install it; you need Wi-Fi", "Use your own connectivity instead and skip the network", "Install then delete it", "Install on your main device only"),
            answerIndex = 1,
            rationale = "An unknown app is deeper access than a network login. Your own connection costs less than the risk.",
            id = "final-q094", briefKey = "travel/travel-networks", difficulty = "Advanced"
        ),
        // ── CH-15 Capstone (6) ─────────────────────────────────────
        QuizQuestion(
            prompt = "What makes a daily OPSEC routine actually stick?",
            options = listOf("Complexity", "Smallness: tiny, repeatable, tied to something you already do", "Strictness", "Novelty"),
            answerIndex = 1,
            rationale = "Routines survive by being small and anchored. Grand routines die in week two.",
            id = "final-q095", briefKey = "capstone/cap-daily", difficulty = "Foundational"
        ),
        QuizQuestion(
            prompt = "You are burned out on security habits. What is the correct response?",
            options = listOf("Quit everything", "Shrink to the minimum viable routine and rebuild from there", "Push harder", "Buy new tools"),
            answerIndex = 1,
            rationale = "Burnout is a signal to simplify, not to stop. The minimum routine keeps the posture alive.",
            id = "final-q096", briefKey = "capstone/cap-burnout", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When should you update your threat model?",
            options = listOf("Never; it was done once", "When life changes: new job, move, relationship, visibility, or incident", "Every New Year only", "When tools update"),
            answerIndex = 1,
            rationale = "Models track lives. Life changes are the update triggers.",
            id = "final-q097", briefKey = "capstone/cap-updating", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Teaching someone else OPSEC works best when you do what first?",
            options = listOf("Hand them this course", "Start from their actual risks, not your favourite tools", "Scare them", "Test them"),
            answerIndex = 1,
            rationale = "Teaching starts at the learner's threat model. Tools without context do not transfer.",
            id = "final-q098", briefKey = "capstone/cap-teaching", difficulty = "Intermediate"
        ),
        QuizQuestion(
            prompt = "Under stress, your plan falls apart. What was missing from the plan?",
            options = listOf("More detail", "Rehearsal under realistic pressure", "More tools", "A longer document"),
            answerIndex = 1,
            rationale = "Plans are proven in rehearsal, not in writing. Stress tests the rehearsed version.",
            id = "final-q099", briefKey = "capstone/cap-scenario", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does completing this course actually certify?",
            options = listOf("Professional accreditation", "A self-paced, on-device completion record — not an accredited qualification", "Employment readiness", "Legal authority"),
            answerIndex = 1,
            rationale = "Honesty about the certificate is part of the course. It records completion, nothing more.",
            id = "final-q100", briefKey = "capstone/cap-completion", difficulty = "Foundational"
        )
    )
}
