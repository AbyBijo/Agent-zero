package com.abybijo.agent0.data

/**
 * v2.0 brief template data (SRS §6), Phase 3.
 *
 * One entry per existing brief, keyed by "chapterId/briefId". Each entry is
 * additive: it structures what the brief already teaches into Outcomes
 * (what you will be able to do), How To (concrete steps), Best Practices
 * (what holds up under pressure), and Cautions (what goes wrong).
 * It never replaces or shortens the brief's existing blocks.
 *
 * New chapters (Phase 4) may fill the Brief fields directly instead;
 * BriefScreen prefers a brief's own fields when they are non-empty and
 * falls back to this map.
 */
data class BriefTemplate(
    val outcomes: List<String> = emptyList(),
    val howTo: List<String> = emptyList(),
    val bestPractices: List<String> = emptyList(),
    val cautions: List<String> = emptyList()
)

object BriefTemplates {
    val all: Map<String, BriefTemplate> = mapOf(
        // ── Orientation ──────────────────────────────────────────────
        "orientation/rules" to BriefTemplate(
            outcomes = listOf(
                "State Rule 1 and explain why it comes first.",
                "Name the four practices that sit under Rule 1 and what each one protects.",
                "Spot a disclosure you would previously have made without thinking."
            ),
            howTo = listOf(
                "Before posting anything, ask: who could use this, and for what?",
                "Remove tool names, employer details, and real-time location from public posts.",
                "Treat defaults as decisions made for you, and review them deliberately.",
                "Plan for detection and recovery, not only for prevention."
            ),
            bestPractices = listOf(
                "Silence is free and reversible; disclosure is neither.",
                "Choose the strongest posture you will actually sustain, not the perfect one you will abandon."
            ),
            cautions = listOf(
                "Most compromises begin with information that was volunteered, not stolen.",
                "Automated sweeps do not care whether you feel important; hygiene still matters."
            )
        ),
        "orientation/howto" to BriefTemplate(
            outcomes = listOf(
                "Describe the read, drill, check, repeat loop.",
                "Plan a first week of training you can actually keep."
            ),
            howTo = listOf(
                "Read one brief at a time, in order, without skipping ahead.",
                "Drill each brief in Drills before moving on.",
                "Revisit a brief when a drill exposes a gap, rather than pushing on regardless."
            ),
            bestPractices = listOf(
                "Reading produces recognition; drilling produces recall under pressure.",
                "Short, regular sessions beat a single long binge."
            ),
            cautions = listOf(
                "Skipping drills turns the program into reading material, which fails under pressure.",
                "Do not mistake finishing a chapter for having the habit."
            )
        ),
        "orientation/first-week" to BriefTemplate(
            outcomes = listOf(
                "Set up a first week that covers passwords, two-factor, updates, and backups.",
                "Tell a secure setup from a merely new one."
            ),
            howTo = listOf(
                "Turn on two-factor authentication on your most important accounts first.",
                "Give every important account a unique password, stored in a password manager.",
                "Turn on automatic updates and check that a backup actually restores."
            ),
            bestPractices = listOf(
                "Fix the accounts that would hurt most if lost, before the nice-to-haves.",
                "Write down what you changed, so you can undo it if it breaks something."
            ),
            cautions = listOf(
                "Changing everything at once makes it hard to tell what broke.",
                "A backup you have never restored is a hope, not a backup."
            )
        ),
        // ── Doctrine: the NSDD 298 spine ─────────────────────────────
        "doctrine/origins" to BriefTemplate(
            outcomes = listOf(
                "Define operational security in one sentence.",
                "Explain why OPSEC is about deciding who gets to know what, not about tools alone."
            ),
            howTo = listOf(
                "Describe your own critical information before choosing any tool.",
                "Work through the five-step spine for one real situation of yours."
            ),
            bestPractices = listOf(
                "Start from what must be protected, not from what is fashionable to buy.",
                "Treat OPSEC as a habit, not a product you install once."
            ),
            cautions = listOf(
                "A tool bought before the threat is understood usually protects the wrong thing.",
                "Security theatre feels productive while leaving the real exposure open."
            )
        ),
        "doctrine/step1" to BriefTemplate(
            outcomes = listOf(
                "List your own critical information, ranked by harm if disclosed.",
                "Distinguish critical information from merely private information."
            ),
            howTo = listOf(
                "Write down what an adversary would need to hurt you, your work, or your people.",
                "Rank the list by harm, not by embarrassment.",
                "Revisit the list whenever your role, travel, or relationships change."
            ),
            bestPractices = listOf(
                "If it is not on the list, you cannot protect it deliberately.",
                "Keep the list short enough to act on; everything cannot be critical."
            ),
            cautions = listOf(
                "Protecting everything equally protects nothing well.",
                "Critical information changes with context; a stale list misleads."
            )
        ),
        "doctrine/step2" to BriefTemplate(
            outcomes = listOf(
                "Name plausible threat actors for a given situation, with their likely methods.",
                "Separate a capable adversary from a likely one."
            ),
            howTo = listOf(
                "For each piece of critical information, ask who would want it and why.",
                "Ask what methods that actor can actually use, not only what they might wish for.",
                "Note which threats are opportunistic and which are targeted."
            ),
            bestPractices = listOf(
                "Threat analysis is about likelihood and capability together, not fear alone.",
                "Revisit threats when the political, workplace, or travel context changes."
            ),
            cautions = listOf(
                "Imagining only the most dramatic adversary wastes effort on the wrong defences.",
                "Ignoring the boring, automated threat leaves the commonest attack open."
            )
        ),
        "doctrine/step3" to BriefTemplate(
            outcomes = listOf(
                "Find vulnerabilities in your own routines, devices, and disclosures.",
                "Explain how an adversary could turn a vulnerability into access."
            ),
            howTo = listOf(
                "Walk through a normal day and note every point where critical information leaks.",
                "Check devices, accounts, and physical routines separately.",
                "Ask a trusted person what they can find out about you from public sources."
            ),
            bestPractices = listOf(
                "Vulnerabilities hide in routines, not only in software.",
                "Write vulnerabilities down; memory smooths over the embarrassing ones."
            ),
            cautions = listOf(
                "A vulnerability you have not named is one you cannot counter.",
                "Blaming the tool hides the routine that exposed the data."
            )
        ),
        "doctrine/step4" to BriefTemplate(
            outcomes = listOf(
                "Assess risk as the combination of threat, vulnerability, and impact.",
                "Decide what level of risk is acceptable for a given situation."
            ),
            howTo = listOf(
                "For each threat-vulnerability pair, estimate likelihood and impact.",
                "Rank the pairs and protect the top ones first.",
                "Record what risk you are consciously accepting, and why."
            ),
            bestPractices = listOf(
                "Acceptable risk is a decision, not a feeling.",
                "Reassess when any of threat, vulnerability, or impact changes."
            ),
            cautions = listOf(
                "Chasing zero risk leads to controls you abandon, which is worse than a weaker control you keep.",
                "Risk you never wrote down gets accepted by accident."
            )
        ),
        "doctrine/step5" to BriefTemplate(
            outcomes = listOf(
                "Choose countermeasures that fit the risk, not the fear.",
                "Explain the cost of each countermeasure in money, time, or friction."
            ),
            howTo = listOf(
                "Match each top risk with one countermeasure you will actually use.",
                "Test the countermeasure before relying on it.",
                "Keep monitoring: a countermeasure that stops working silently is a trap."
            ),
            bestPractices = listOf(
                "The strongest posture you sustain beats the perfect posture you drop.",
                "Layer countermeasures so one failure is not fatal."
            ),
            cautions = listOf(
                "A countermeasure that breaks your workflow will be bypassed, by you.",
                "Countermeasures need maintenance; set-and-forget decays."
            )
        ),
        "doctrine/threat-model-ten" to BriefTemplate(
            outcomes = listOf(
                "Build a usable threat model in about ten minutes.",
                "Use that model to choose your next three actions."
            ),
            howTo = listOf(
                "List critical information, threats, vulnerabilities, and risks on one page.",
                "Pick the three highest risks and one countermeasure for each.",
                "Set a date to revisit the model."
            ),
            bestPractices = listOf(
                "A short model you use beats a long document you never open.",
                "Threat modelling is a loop, not a one-time report."
            ),
            cautions = listOf(
                "A threat model that never changes is a snapshot of a situation that has moved on.",
                "Do not let the model become an excuse to delay the obvious fixes."
            )
        ),
        // ── Digital ──────────────────────────────────────────────────
        "digital/passwords" to BriefTemplate(
            outcomes = listOf(
                "Explain why reuse is the main password risk, not password cleverness.",
                "Set up a password manager and unique passwords for important accounts."
            ),
            howTo = listOf(
                "Install a password manager and generate a unique password per important account.",
                "Change reused passwords, starting with email, banking, and work accounts.",
                "Store recovery codes somewhere other than the account they recover."
            ),
            bestPractices = listOf(
                "Length and uniqueness matter more than exotic characters you cannot remember.",
                "Your email account is a master key; protect it first."
            ),
            cautions = listOf(
                "One breach of a reused password opens every account that shares it.",
                "Writing passwords on paper near the device defeats the point."
            )
        ),
        "digital/twofactor" to BriefTemplate(
            outcomes = listOf(
                "Explain what two-factor authentication stops that a password alone does not.",
                "Choose the strongest second factor available for each important account."
            ),
            howTo = listOf(
                "Turn on two-factor on email, banking, and work accounts first.",
                "Prefer an authenticator app or hardware key over SMS where offered.",
                "Save backup codes offline, in a place you can reach when your phone is lost."
            ),
            bestPractices = listOf(
                "Any second factor beats none, even SMS.",
                "Test recovery before you need it: log out and log back in using the backup method."
            ),
            cautions = listOf(
                "SMS codes can be intercepted or SIM-swapped; do not rely on them for high-value accounts.",
                "Losing your only second factor locks you out of your own account."
            )
        ),
        "digital/encryption" to BriefTemplate(
            outcomes = listOf(
                "Explain, in plain language, what encryption does and does not hide.",
                "Turn on device and message encryption where it matters."
            ),
            howTo = listOf(
                "Turn on full-disk encryption on phone and laptop, with a strong unlock code.",
                "Use an end-to-end encrypted messenger for sensitive conversations.",
                "Check that backups are encrypted too, or they undo the protection."
            ),
            bestPractices = listOf(
                "Encryption protects data at rest and in transit, not metadata about who talked to whom.",
                "A strong unlock code is part of encryption; a weak one is a back door."
            ),
            cautions = listOf(
                "Encryption does not stop someone who already has your unlocked device.",
                "Claiming end-to-end encryption while backups are unencrypted is a common trap."
            )
        ),
        "digital/comms" to BriefTemplate(
            outcomes = listOf(
                "Choose a communication method that fits the sensitivity of the message.",
                "Explain what metadata a message reveals even when its content is encrypted."
            ),
            howTo = listOf(
                "Match the channel to the sensitivity: casual, sensitive, or must-not-leak.",
                "Verify a contact's identity out of band before discussing sensitive matters.",
                "Agree in advance how long messages are kept, and by whom."
            ),
            bestPractices = listOf(
                "Assume the channel, not just the message, can be observed.",
                "Fewer channels, used consistently, leak less than many half-used ones."
            ),
            cautions = listOf(
                "A secure app used carelessly (screenshots, cloud backup, unlocked phone) is not secure.",
                "Metadata — who, when, how often — often matters more than content."
            )
        ),
        "digital/devices" to BriefTemplate(
            outcomes = listOf(
                "Harden a phone and a laptop against common theft and malware risks.",
                "Decide what to do when a device is lost, stolen, or seized."
            ),
            howTo = listOf(
                "Turn on automatic updates, lock screen, and remote wipe where available.",
                "Remove apps you do not use, and review app permissions.",
                "Separate work and personal data where the device allows it."
            ),
            bestPractices = listOf(
                "Updates are the cheapest defence; delay is the commonest gap.",
                "A device you can wipe remotely hurts less when it is stolen."
            ),
            cautions = listOf(
                "Sideloaded apps and ignored update prompts are the usual entry points.",
                "A phone left unlocked on a table is an unlocked computer."
            )
        ),
        "digital/network" to BriefTemplate(
            outcomes = listOf(
                "Explain what a VPN hides, what Tor hides, and what neither hides.",
                "Choose between them for a given task, or choose neither."
            ),
            howTo = listOf(
                "Use a trusted VPN on untrusted networks for ordinary browsing.",
                "Use Tor when hiding who you are matters more than speed.",
                "Check for DNS and IP leaks after setting either up."
            ),
            bestPractices = listOf(
                "A VPN shifts trust to the provider; choose one you have reason to trust.",
                "Anonymity tools only work if your behaviour does not identify you anyway."
            ),
            cautions = listOf(
                "A VPN does not make you anonymous, and Tor does not make you invisible to the sites you log into.",
                "Free VPNs often pay for themselves with your data."
            )
        ),
        "digital/email" to BriefTemplate(
            outcomes = listOf(
                "Spot phishing and pretexting in email before acting on it.",
                "Handle attachments and links safely."
            ),
            howTo = listOf(
                "Check the sender address, not just the display name, before acting.",
                "For urgent requests, verify through a separate channel before sending money or data.",
                "Open unexpected attachments only after confirming with the sender."
            ),
            bestPractices = listOf(
                "Urgency is the tell: attackers rush you past your own checks.",
                "When in doubt, do not click; type the address yourself or call."
            ),
            cautions = listOf(
                "A familiar logo and a plausible story are cheap to fake.",
                "Replying to a phishing mail confirms your address is live."
            )
        ),
        "digital/backups-restore" to BriefTemplate(
            outcomes = listOf(
                "Build a backup routine that survives theft, ransomware, and your own mistakes.",
                "Prove a backup works by restoring from it."
            ),
            howTo = listOf(
                "Back up automatically, to at least two places, one of them offline or offsite.",
                "Encrypt backups, and keep the key somewhere recoverable.",
                "Restore a file from backup on a schedule, and fix what fails."
            ),
            bestPractices = listOf(
                "A backup that has never been restored is unproven.",
                "Automated backups beat heroic manual ones, because they actually happen."
            ),
            cautions = listOf(
                "A single backup in the same room as the original dies in the same fire or theft.",
                "Ransomware encrypts connected backups too; keep one copy disconnected."
            )
        ),
        // ── Physical ─────────────────────────────────────────────────
        "physical/access" to BriefTemplate(
            outcomes = listOf(
                "Control who can enter a space where sensitive work happens.",
                "Challenge tailgating and unknown visitors without creating conflict."
            ),
            howTo = listOf(
                "Keep sensitive work behind a door that closes and locks by itself.",
                "Do not hold doors for strangers; direct them to reception instead.",
                "Report lost badges immediately, and treat a found badge as suspect."
            ),
            bestPractices = listOf(
                "Politeness is not a security control; a friendly script for refusing entry helps.",
                "Access that is never reviewed quietly grows to include everyone."
            ),
            cautions = listOf(
                "Tailgating is the cheapest way into most buildings.",
                "A badge on a lanyard, worn outside, is a photograph waiting to happen."
            )
        ),
        "physical/cleandesk" to BriefTemplate(
            outcomes = listOf(
                "Leave a workspace that reveals nothing to a passer-by.",
                "Handle screens, papers, and whiteboards as information, not furniture."
            ),
            howTo = listOf(
                "Lock your screen whenever you stand up, without exception.",
                "File or shred sensitive papers at the end of the day, not at the end of the week.",
                "Clear whiteboards after meetings that discussed sensitive matters."
            ),
            bestPractices = listOf(
                "Shoulder surfing needs only a few seconds and a plausible excuse.",
                "The habit matters more than the policy; make locking automatic."
            ),
            cautions = listOf(
                "Sticky notes with passwords are credentials on display.",
                "Printers and bins are where sensitive paper quietly accumulates."
            )
        ),
        "physical/travel" to BriefTemplate(
            outcomes = listOf(
                "Travel with only the data and devices the trip actually needs.",
                "Handle border, hotel, and public-network risks calmly."
            ),
            howTo = listOf(
                "Before travelling, back up, then remove what the trip does not need.",
                "Use a clean device or profile for high-risk travel where that is an option.",
                "On arrival, assume hotel and public networks are observed."
            ),
            bestPractices = listOf(
                "Travel light in data, not only in luggage.",
                "Decide in advance what you will do if a device is inspected or taken."
            ),
            cautions = listOf(
                "Real-time travel posts tell an observer exactly where you are not.",
                "A device left in a hotel room is not a device under your control."
            )
        ),
        "physical/surveillance" to BriefTemplate(
            outcomes = listOf(
                "Notice when you are being followed or observed, without becoming paranoid.",
                "Respond to surveillance by changing the plan, not by confronting it."
            ),
            howTo = listOf(
                "Vary routes and times on a schedule, so a pattern is harder to read.",
                "Note the same person or vehicle appearing in unrelated places.",
                "If you confirm surveillance, do not lead it to a sensitive location."
            ),
            bestPractices = listOf(
                "Awareness is a routine, not a state of alarm.",
                "Write observations down promptly; memory edits them."
            ),
            cautions = listOf(
                "Seeing surveillance everywhere is as useless as seeing it nowhere.",
                "Confronting a follower escalates a situation you may not understand."
            )
        ),
        "physical/assets" to BriefTemplate(
            outcomes = listOf(
                "Protect physical media and devices as seriously as digital accounts.",
                "Dispose of media so its data cannot be recovered."
            ),
            howTo = listOf(
                "Encrypt portable drives, and label them without revealing their contents.",
                "Keep sensitive media in a locked place, not in a desk drawer.",
                "Destroy or wipe media before disposal, and verify the wipe."
            ),
            bestPractices = listOf(
                "Physical access usually defeats digital controls.",
                "Inventory what you own; lost media you never noticed is a breach you never reported."
            ),
            cautions = listOf(
                "Deleting a file does not erase it; formatting does not either.",
                "An unlabelled drive found by someone else is a curiosity, and curiosity opens files."
            )
        ),
        "physical/home-base" to BriefTemplate(
            outcomes = listOf(
                "Make a home or base that does not advertise what it contains.",
                "Handle visitors, deliveries, and neighbours with the same calm routine."
            ),
            howTo = listOf(
                "Keep sensitive work out of sight from windows and doorways.",
                "Use a consistent, low-key routine for visitors and deliveries.",
                "Check what your address, photos, and posts reveal about the base."
            ),
            bestPractices = listOf(
                "A base that looks ordinary is safer than one that looks fortified.",
                "Neighbours who know you only vaguely are a feature, not a failure."
            ),
            cautions = listOf(
                "Photos taken at home leak layout, valuables, and documents in the background.",
                "A predictable routine is a timetable for anyone watching."
            )
        ),
        // ── Human ────────────────────────────────────────────────────
        "human/vectors" to BriefTemplate(
            outcomes = listOf(
                "Name the main human attack vectors: phishing, pretexting, baiting, and tailgating.",
                "Match each vector to a defence that does not depend on spotting it perfectly."
            ),
            howTo = listOf(
                "For any unsolicited contact, slow down and verify through a separate channel.",
                "Treat unexpected gifts, files, and links as untrusted until checked.",
                "Report attempts, even failed ones, so others are warned."
            ),
            bestPractices = listOf(
                "Procedures protect you when recognition fails; use them even for familiar-seeming requests.",
                "Attackers reuse what worked; sharing reports breaks their reuse."
            ),
            cautions = listOf(
                "Everyone is vulnerable to a well-built pretext on a bad day.",
                "Shame about falling for an attempt stops reporting, which helps the attacker."
            )
        ),
        "human/redflags" to BriefTemplate(
            outcomes = listOf(
                "List red flags in a conversation: urgency, secrecy, flattery, and authority pressure.",
                "Pause a conversation that shows several flags at once."
            ),
            howTo = listOf(
                "Count the flags, do not argue with them: urgency plus secrecy is enough to stop.",
                "Say you will check and call back, then actually check.",
                "Write down what was asked and by whom, while it is fresh."
            ),
            bestPractices = listOf(
                "A single flag is a warning; several together are a pattern.",
                "A legitimate request survives a verification delay; a fraudulent one usually does not."
            ),
            cautions = listOf(
                "Flattery and authority lower your guard precisely because they feel good.",
                "Being polite is not a reason to comply with an unverified request."
            )
        ),
        "human/verification" to BriefTemplate(
            outcomes = listOf(
                "Verify a person's identity and authority before acting on their request.",
                "Use a channel the requester does not control for the verification."
            ),
            howTo = listOf(
                "Find the person's number or address from a source you trust, not from the message itself.",
                "Ask a question only the real person could answer, without revealing the answer yourself.",
                "For sensitive actions, require a second approver."
            ),
            bestPractices = listOf(
                "Verification through the same channel that delivered the request is not verification.",
                "Document who verified what, so the next person does not have to repeat it blindly."
            ),
            cautions = listOf(
                "Caller ID, display names, and familiar logos can all be spoofed.",
                "A requester who discourages verification is telling you something."
            )
        ),
        "human/influence" to BriefTemplate(
            outcomes = listOf(
                "Recognise influence techniques: reciprocity, scarcity, social proof, and commitment.",
                "Respond to influence without hostility and without compliance."
            ),
            howTo = listOf(
                "Name the technique silently to yourself when you feel pushed.",
                "Buy time: a delay breaks most influence scripts.",
                "Decide on the merits, ignoring who asked and how nicely."
            ),
            bestPractices = listOf(
                "Influence works best when you do not notice it; noticing is half the defence.",
                "A prepared refusal script is easier than an improvised one."
            ),
            cautions = listOf(
                "Small early commitments are used to extract larger later ones.",
                "Feeling indebted after a favour is a normal reaction, not an obligation."
            )
        ),
        "human/verifying-strangers" to BriefTemplate(
            outcomes = listOf(
                "Assess a stranger's claims without revealing your own sensitive information.",
                "End a conversation safely when verification fails."
            ),
            howTo = listOf(
                "Ask for verifiable details, and check them independently.",
                "Share as little as possible while checking; your questions should not answer theirs.",
                "If checks fail, stop the conversation politely and report it if appropriate."
            ),
            bestPractices = listOf(
                "Trust is earned in small, verifiable steps.",
                "A stranger who needs you to hurry is usually the one who benefits from haste."
            ),
            cautions = listOf(
                "Answering a stranger's questions to prove you are careful can leak exactly what they wanted.",
                "A convincing story is not evidence."
            )
        ),
        // ── Cognitive ────────────────────────────────────────────────
        "cognitive/biases" to BriefTemplate(
            outcomes = listOf(
                "Name biases that distort security decisions: confirmation, availability, and optimism bias.",
                "Check a decision against the bias most likely to be affecting it."
            ),
            howTo = listOf(
                "When a conclusion feels comfortable, ask what evidence would change it.",
                "When a recent event dominates your thinking, ask about base rates.",
                "Get a second view on high-stakes decisions, especially from someone unaffected."
            ),
            bestPractices = listOf(
                "Biases are normal; the defence is a process, not willpower.",
                "Checklists and written assessments catch what intuition misses."
            ),
            cautions = listOf(
                "Knowing about a bias does not make you immune to it.",
                "Confidence after a decision is not evidence the decision was right."
            )
        ),
        "cognitive/emotion" to BriefTemplate(
            outcomes = listOf(
                "Explain how fear, anger, and affection are used to bypass judgement.",
                "Recover judgement after an emotional trigger before deciding."
            ),
            howTo = listOf(
                "When you feel a sudden emotion during a request, pause and name it.",
                "Delay the decision until the emotion passes, and re-read the request cold.",
                "Talk it through with someone calm before acting on a high-stakes emotional appeal."
            ),
            bestPractices = listOf(
                "Emotion is information, not instruction.",
                "The most dangerous moment is not when you feel nothing, but when you feel certain."
            ),
            cautions = listOf(
                "Attackers design messages to trigger emotion first and reason second.",
                "Decisions made to end discomfort are usually the ones you regret."
            )
        ),
        "cognitive/models" to BriefTemplate(
            outcomes = listOf(
                "Use mental models to simplify a complex security situation without distorting it.",
                "Explain a situation using at least two different models before deciding."
            ),
            howTo = listOf(
                "Describe the situation in one sentence, then re-describe it from the adversary's view.",
                "Ask what would have to be true for the opposite conclusion to hold.",
                "Choose the model that predicts what you can test, not the one that flatters you."
            ),
            bestPractices = listOf(
                "A model is a tool, not a truth; discard one that stops fitting.",
                "Two models that disagree are a signal to gather more information."
            ),
            cautions = listOf(
                "Fitting every situation to one favourite model is a bias, not a method.",
                "A simple model that ignores the adversary is a story, not an analysis."
            )
        ),
        "cognitive/mindset" to BriefTemplate(
            outcomes = listOf(
                "Describe a defensive mindset: alert without anxious, sceptical without cynical.",
                "Sustain that mindset without burning out."
            ),
            howTo = listOf(
                "Build small daily habits — screen lock, verification pause, backup check — and let them carry the load.",
                "Schedule review time, so vigilance does not have to be constant.",
                "Rest deliberately; exhaustion degrades judgement more than ignorance does."
            ),
            bestPractices = listOf(
                "Mindset is what you do on an ordinary Tuesday, not what you believe in a crisis.",
                "Sustainable habits beat heroic vigilance."
            ),
            cautions = listOf(
                "Constant alertness is not sustainable and leads to missed signals.",
                "Cynicism feels like scepticism but stops you trusting the people you need."
            )
        ),
        "cognitive/calm-pressure" to BriefTemplate(
            outcomes = listOf(
                "Stay functional under pressure by falling back on rehearsed procedures.",
                "Recover after a high-pressure incident instead of replaying it endlessly."
            ),
            howTo = listOf(
                "Rehearse the procedures you will need under pressure, in drills, not only in reading.",
                "When pressure hits, slow your breathing, state the facts aloud, and follow the procedure step by step.",
                "Afterwards, write down what happened and what to change, then stop."
            ),
            bestPractices = listOf(
                "Pressure narrows attention; a written procedure widens it back.",
                "Drills are where mistakes are cheap; incidents are where they are not."
            ),
            cautions = listOf(
                "Improvising under pressure usually repeats the attacker's script.",
                "Skipping the debrief guarantees repeating the same failure."
            )
        ),
        // ── Identity ─────────────────────────────────────────────────
        "identity/compartments" to BriefTemplate(
            outcomes = listOf(
                "Separate identities, accounts, and devices so one compromise does not spread.",
                "Design compartments you can actually maintain."
            ),
            howTo = listOf(
                "List your roles and give each its own accounts and, where possible, devices or profiles.",
                "Never cross-post, cross-login, or reuse credentials between compartments.",
                "Decide in advance what may cross a boundary, and what may never."
            ),
            bestPractices = listOf(
                "Compartmentation limits blast radius; it does not make any single compartment invulnerable.",
                "Fewer, well-kept compartments beat many leaky ones."
            ),
            cautions = listOf(
                "One shared login, photo, or phone number can link compartments together.",
                "Compartments that are too hard to maintain will be merged by you, quietly."
            )
        ),
        "identity/metadata" to BriefTemplate(
            outcomes = listOf(
                "Explain what metadata and digital exhaust reveal, even when content is hidden.",
                "Reduce your exhaust in daily routines."
            ),
            howTo = listOf(
                "Review location, app, and account permissions, and turn off what you do not need.",
                "Strip metadata from files and photos before sharing them.",
                "Assume that patterns — times, places, contacts — are visible even when messages are not."
            ),
            bestPractices = listOf(
                "Metadata is data about data, and it is often more revealing than the data itself.",
                "Reduction is a habit: check permissions when you install, not once a year."
            ),
            cautions = listOf(
                "Deleting content does not delete the metadata trail it left.",
                "A single app with broad permissions can undo careful habits elsewhere."
            )
        ),
        "identity/osint" to BriefTemplate(
            outcomes = listOf(
                "Find what public sources already reveal about you.",
                "Remove or reduce the most revealing exposures."
            ),
            howTo = listOf(
                "Search for yourself by name, username, email, and phone number.",
                "Check data-broker and people-search sites, and request removal where offered.",
                "Tighten old accounts and posts, not only current ones."
            ),
            bestPractices = listOf(
                "Your OSINT shadow is what an adversary sees first; look at it yourself, regularly.",
                "Removal is partial and slow; prevention on new posts matters more than perfection on old ones."
            ),
            cautions = listOf(
                "Removal requests can confirm that data belongs to you; use them selectively.",
                "Old accounts you forgot are still public."
            )
        ),
        "identity/personas" to BriefTemplate(
            outcomes = listOf(
                "Explain when a persona or legend is appropriate, and when it is not.",
                "Maintain a persona consistently, or do not use one."
            ),
            howTo = listOf(
                "Define the persona's purpose, limits, and what it must never claim.",
                "Keep its accounts, devices, and language separate from your real identity.",
                "Rehearse its basic story before using it in a real situation."
            ),
            bestPractices = listOf(
                "A persona is a tool for a specific purpose, not a second life.",
                "Consistency is the whole defence; one slip links the persona to you."
            ),
            cautions = listOf(
                "Using a persona to deceive for unlawful purposes is not OPSEC, it is fraud.",
                "A persona you cannot maintain will collapse at the worst moment."
            )
        ),
        "identity/photo-metadata" to BriefTemplate(
            outcomes = listOf(
                "Strip location and device metadata from photos before sharing them.",
                "Check backgrounds in photos for information you did not intend to share."
            ),
            howTo = listOf(
                "Turn off camera location tagging, or strip metadata before posting.",
                "Review the background of every photo: screens, documents, badges, reflections, landmarks.",
                "Delay posting photos from sensitive locations until you have left."
            ),
            bestPractices = listOf(
                "A photo's metadata can place you precisely, even when the image looks harmless.",
                "Background review takes seconds and catches what metadata stripping cannot."
            ),
            cautions = listOf(
                "Screenshots carry metadata and visible details too, not only camera photos.",
                "Cropping a photo does not remove its metadata."
            )
        ),
        // ── Tradecraft ───────────────────────────────────────────────
        "tradecraft/threatmodel" to BriefTemplate(
            outcomes = listOf(
                "Build a full threat model for a real project, not only a textbook example.",
                "Turn the model into a prioritised action list."
            ),
            howTo = listOf(
                "Work the five steps in order, and write each one down.",
                "Involve the people whose information is at stake, not only yourself.",
                "Turn the top risks into dated actions, with an owner for each."
            ),
            bestPractices = listOf(
                "A threat model is only useful if it changes what you do next.",
                "Revisit the model when the project, people, or environment changes."
            ),
            cautions = listOf(
                "A model built alone misses the exposures other people can see.",
                "A model with no actions is a document, not a defence."
            )
        ),
        "tradecraft/incident" to BriefTemplate(
            outcomes = listOf(
                "Describe the incident response sequence: contain, assess, recover, learn.",
                "Prepare the contacts and tools you will need before an incident."
            ),
            howTo = listOf(
                "Contain first: disconnect, revoke, or isolate the affected account or device.",
                "Preserve evidence before wiping or rebuilding.",
                "Recover from a known-good backup, then change credentials that may have leaked."
            ),
            bestPractices = listOf(
                "Speed matters in containment; completeness matters in recovery. Do them in that order.",
                "Write the incident plan before you need it, when you can think clearly."
            ),
            cautions = listOf(
                "Wiping everything immediately destroys the evidence that explains what happened.",
                "Recovering to the same compromised state just repeats the incident."
            )
        ),
        "tradecraft/sustaining" to BriefTemplate(
            outcomes = listOf(
                "Sustain a security posture over months, not only during a crisis.",
                "Review and prune controls that no longer earn their friction."
            ),
            howTo = listOf(
                "Put reviews on a calendar: accounts, permissions, backups, and threat model.",
                "Drop controls you have abandoned in practice, and replace them with weaker ones you will keep.",
                "Teach the habits to the people who share your risk, or your posture depends on them anyway."
            ),
            bestPractices = listOf(
                "Sustaining is mostly maintenance, and maintenance is mostly scheduled.",
                "A posture that depends on one person fails when that person is unavailable."
            ),
            cautions = listOf(
                "Crisis habits fade; if a habit is not scheduled, it will lapse.",
                "Adding controls without removing dead ones creates friction that gets bypassed."
            )
        ),
        "tradecraft/first-hour" to BriefTemplate(
            outcomes = listOf(
                "Act correctly in the first hour after discovering a compromise.",
                "Avoid the common mistakes that make a bad hour worse."
            ),
            howTo = listOf(
                "Stop the bleeding: revoke sessions, change passwords from a clean device, isolate the affected device.",
                "Note times, symptoms, and actions taken, while they are fresh.",
                "Tell the people affected, plainly and early, with what you know and do not know."
            ),
            bestPractices = listOf(
                "The first hour is for containment and notes, not for blame or complete diagnosis.",
                "A clean device for recovery is worth preparing in advance."
            ),
            cautions = listOf(
                "Changing passwords from the compromised device hands the new password to the attacker.",
                "Waiting to be certain before warning others lets the damage spread."
            )
        ),
        // ── Fieldcraft ───────────────────────────────────────────────
        "fieldcraft/secure-comms" to BriefTemplate(
            outcomes = listOf(
                "Run a secure conversation in the field, including when conditions are poor.",
                "Agree codes, channels, and fallbacks before they are needed."
            ),
            howTo = listOf(
                "Agree the channel, the fallback channel, and the check-in times in advance.",
                "Keep messages short, factual, and free of unnecessary detail.",
                "Have a duress signal and a no-contact plan agreed before departure."
            ),
            bestPractices = listOf(
                "Field communications fail; plan for the failure, not only for the conversation.",
                "Brevity is a security control in the field."
            ),
            cautions = listOf(
                "Improvised channels in the field are usually the least secure ones available.",
                "A missed check-in is information; agree in advance what it triggers."
            )
        ),
        "fieldcraft/border-device" to BriefTemplate(
            outcomes = listOf(
                "Cross a border with devices in a way that limits what can be taken.",
                "Decide in advance how to respond to a device inspection."
            ),
            howTo = listOf(
                "Travel with the minimum device and data the trip needs, backed up beforehand.",
                "Know the local rules and your rights, and have a contact to call.",
                "After an inspection, treat the device as untrusted until it is checked or replaced."
            ),
            bestPractices = listOf(
                "What is not on the device cannot be inspected, copied, or seized.",
                "A calm, prepared response is safer than an improvised argument at a border."
            ),
            cautions = listOf(
                "Refusing an inspection can have legal consequences; decide your line before you travel, not at the desk.",
                "A device returned after inspection may have been altered."
            )
        ),
        "fieldcraft/financial-privacy" to BriefTemplate(
            outcomes = listOf(
                "Reduce the financial trail that links your activities together.",
                "Separate payment methods by purpose, where lawful."
            ),
            howTo = listOf(
                "Use separate payment methods for separate compartments of your life.",
                "Prefer cash or privacy-respecting methods where they are lawful and practical.",
                "Review statements for subscriptions and charges that reveal patterns."
            ),
            bestPractices = listOf(
                "Payment data links identities, locations, and habits together.",
                "Financial privacy is about separation and minimisation, not secrecy for its own sake."
            ),
            cautions = listOf(
                "Using financial privacy tools to evade lawful obligations is not OPSEC.",
                "A single shared card can link compartments you carefully separated elsewhere."
            )
        ),
        "fieldcraft/under-surveillance" to BriefTemplate(
            outcomes = listOf(
                "Work calmly when you know or suspect you are under surveillance.",
                "Protect people and information without escalating the situation."
            ),
            howTo = listOf(
                "Assume observation and act normally; do not lead surveillance to sensitive people or places.",
                "Use pre-agreed, low-profile communication and meeting routines.",
                "Record observations promptly and share them only through trusted channels."
            ),
            bestPractices = listOf(
                "Normal behaviour is camouflage; sudden changes in behaviour are signals.",
                "Protecting others matters more than proving you noticed."
            ),
            cautions = listOf(
                "Trying to lose surveillance without a plan often confirms you had something to hide.",
                "Discussing surveillance on an observed channel warns the observer."
            )
        ),
        "fieldcraft/team-opsec" to BriefTemplate(
            outcomes = listOf(
                "Build OPSEC habits in a team without turning it into surveillance of each other.",
                "Handle a team member's mistake as a system failure to fix, not a person to blame."
            ),
            howTo = listOf(
                "Agree the team's critical information, channels, and verification rules together.",
                "Give every member a simple, rehearsed way to report a mistake early.",
                "Review team practices regularly, and fix the system when a mistake recurs."
            ),
            bestPractices = listOf(
                "A team is only as secure as its least-informed member; train everyone, not only the keen ones.",
                "Blame-free reporting is what makes early reporting happen."
            ),
            cautions = listOf(
                "A rule the team does not understand will be worked around, quietly.",
                "One member's careless post can expose the whole team."
            )
        ),
        "fieldcraft/sustain" to BriefTemplate(
            outcomes = listOf(
                "Keep a field posture sustainable over a long operation.",
                "Recognise fatigue and rotate responsibilities before judgement fails."
            ),
            howTo = listOf(
                "Build rest, rotation, and review into the operation from the start.",
                "Simplify procedures as fatigue grows, rather than adding new ones.",
                "Debrief at the end, and write down what to change next time."
            ),
            bestPractices = listOf(
                "Endurance is a security control; exhausted people make the mistakes attackers wait for.",
                "A posture that survives the quiet weeks is the one that holds in the hard week."
            ),
            cautions = listOf(
                "Pushing through fatigue feels like dedication and acts like negligence.",
                "An operation that ends without a debrief repeats its mistakes next time."
            )
        )
    )

    fun forKey(key: String): BriefTemplate? = all[key]
}
