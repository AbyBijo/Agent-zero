package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk questions, batch 2: 100 questions for CH-06 to CH-10 briefs. */
object QuizBankBulk2 {
    val all: List<QuizQuestion> = listOf(
        QuizQuestion(
            prompt = "What is compartmentation?",
            options = listOf("Using many devices", "Separating activities, identities, and data so one compromise does not expose everything", "Hiding files", "Using aliases only"),
            answerIndex = 1,
            rationale = "Compartmentation limits blast radius: one compromised compartment does not expose the others.",
            id = "bulk-q101", briefKey = "identity/compartments", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the cost of poor compartmentation?",
            options = listOf("Slower devices", "A single breach links every part of your life together", "More passwords to remember", "Higher data usage"),
            answerIndex = 1,
            rationale = "Without compartments, one breach connects work, personal life, and sensitive activity into one picture.",
            id = "bulk-q102", briefKey = "identity/compartments", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a good compartment boundary?",
            options = listOf("A different wallpaper", "Separate accounts, devices or profiles, and no shared identifiers between them", "A different browser", "A nickname"),
            answerIndex = 1,
            rationale = "Boundaries must be real: separate accounts and no shared identifiers, not cosmetic differences.",
            id = "bulk-q103", briefKey = "identity/compartments", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is metadata?",
            options = listOf("Data about data: when, where, by whom, and with what a file or message was created", "Encrypted data", "Deleted data", "Large data"),
            answerIndex = 1,
            rationale = "Metadata describes a file or message — time, place, author, device — and often reveals more than the content.",
            id = "bulk-q104", briefKey = "identity/metadata", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is metadata dangerous even when content is encrypted?",
            options = listOf("It is not dangerous", "It reveals who talked to whom, when, where, and how often", "It slows encryption", "It breaks encryption"),
            answerIndex = 1,
            rationale = "Metadata survives encryption. Patterns of contact, timing, and location are often enough to identify and harm.",
            id = "bulk-q105", briefKey = "identity/metadata", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do before sharing a file publicly?",
            options = listOf("Rename it", "Strip metadata, or share a clean copy made from the content alone", "Compress it", "Change its extension"),
            answerIndex = 1,
            rationale = "Renaming and compressing leave metadata intact. Strip it, or rebuild the file from content alone.",
            id = "bulk-q106", briefKey = "identity/metadata", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is OSINT?",
            options = listOf("Secret intelligence", "Open-source intelligence: information gathered from public sources", "Hacking", "Surveillance hardware"),
            answerIndex = 1,
            rationale = "OSINT is intelligence from public sources: posts, records, maps, and databases anyone can access.",
            id = "bulk-q107", briefKey = "identity/osint", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why should you audit your own OSINT footprint?",
            options = listOf("To find old photos", "To see what an adversary can assemble about you from public sources, and reduce it", "To improve search ranking", "To delete accounts"),
            answerIndex = 1,
            rationale = "A self-audit shows you what an adversary sees. You cannot reduce exposure you have not mapped.",
            id = "bulk-q108", briefKey = "identity/osint", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the first step of a self-audit?",
            options = listOf("Deleting everything", "Searching for yourself as a stranger would: name, email, phone, username", "Changing passwords", "Buying a VPN"),
            answerIndex = 1,
            rationale = "Search for yourself as a stranger would. That is the adversary's view, and it is where the audit starts.",
            id = "bulk-q109", briefKey = "identity/osint", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a persona?",
            options = listOf("A fake name", "A consistent, separated identity used for a specific context, with its own accounts and habits", "A profile photo", "A password"),
            answerIndex = 1,
            rationale = "A persona is a full, consistent identity for one context — accounts, habits, and boundaries included.",
            id = "bulk-q110", briefKey = "identity/personas", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What breaks a persona?",
            options = listOf("Using it rarely", "Cross-contamination: shared identifiers, devices, or habits linking it to your real identity", "A long password", "A private profile"),
            answerIndex = 1,
            rationale = "One shared identifier — a reused email, phone, device, or habit — links a persona back to you.",
            id = "bulk-q111", briefKey = "identity/personas", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When is a persona justified?",
            options = listOf("For deception", "When a context requires separation for safety or professional reasons, used lawfully", "For entertainment", "Always"),
            answerIndex = 1,
            rationale = "Personas are justified for lawful separation — safety, professional boundaries — not for deception or fraud.",
            id = "bulk-q112", briefKey = "identity/personas", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does photo metadata commonly reveal?",
            options = listOf("Only the file size", "Location, time, device, and sometimes the photographer's identity", "Only the image dimensions", "Nothing"),
            answerIndex = 1,
            rationale = "Photos carry EXIF data: location, time, device model, and sometimes owner details.",
            id = "bulk-q113", briefKey = "identity/photo-metadata", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do before posting a photo publicly?",
            options = listOf("Add a filter", "Strip metadata and check the background for identifying details", "Crop it", "Reduce its resolution"),
            answerIndex = 1,
            rationale = "Filters and crops leave metadata and background details intact. Strip metadata and check what the image shows.",
            id = "bulk-q114", briefKey = "identity/photo-metadata", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Can a photo's background identify you?",
            options = listOf("No", "Yes: landmarks, signs, reflections, and documents in the background reveal location and context", "Only if it is a selfie", "Only at night"),
            answerIndex = 1,
            rationale = "Backgrounds reveal location and context: street signs, landmarks, reflections, even documents on a desk.",
            id = "bulk-q115", briefKey = "identity/photo-metadata", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a threat model?",
            options = listOf("A guess about attackers", "A structured statement of what you protect, from whom, and how they might get it", "A list of tools", "A risk score"),
            answerIndex = 1,
            rationale = "A threat model names critical information, adversaries, vulnerabilities, and risks — structured, not guessed.",
            id = "bulk-q116", briefKey = "tradecraft/threatmodel", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When should you update a threat model?",
            options = listOf("Never", "When your situation, adversaries, or activities change", "Once a year only", "When a tool updates"),
            answerIndex = 1,
            rationale = "Threat models decay as situations change. New work, travel, or adversaries demand a fresh model.",
            id = "bulk-q117", briefKey = "tradecraft/threatmodel", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the most common threat modelling mistake?",
            options = listOf("Overestimating threats", "Modelling a generic adversary instead of your actual adversaries", "Writing it down", "Sharing it"),
            answerIndex = 1,
            rationale = "Generic adversaries produce generic controls. Your actual adversaries — their capability and intent — are what matter.",
            id = "bulk-q118", briefKey = "tradecraft/threatmodel", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the first step after discovering an incident?",
            options = listOf("Delete everything", "Contain: stop the spread, preserve evidence, and get help if anyone is in danger", "Investigate publicly", "Reinstall everything"),
            answerIndex = 1,
            rationale = "Contain first, investigate second. Deleting evidence destroys the investigation and may worsen the harm.",
            id = "bulk-q119", briefKey = "tradecraft/incident", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why preserve evidence during an incident?",
            options = listOf("For insurance", "Because investigation, reporting, and recovery all depend on knowing what happened", "For legal compliance only", "For curiosity"),
            answerIndex = 1,
            rationale = "Evidence tells you what was taken, how, and whether it is still happening — the basis for every later decision.",
            id = "bulk-q120", briefKey = "tradecraft/incident", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do with a compromised account first?",
            options = listOf("Delete it", "Lock it down: change credentials from a clean device, revoke sessions, enable stronger authentication", "Ignore it", "Warn friends only"),
            answerIndex = 1,
            rationale = "Lock down first: new credentials from a clean device, revoked sessions, and stronger authentication.",
            id = "bulk-q121", briefKey = "tradecraft/incident", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What sustains a security posture over time?",
            options = listOf("Strong tools", "Habits and reviews: routine checks, updated models, and maintained controls", "A single training course", "Good intentions"),
            answerIndex = 1,
            rationale = "Postures decay without habits and reviews. Tools alone do not sustain anything.",
            id = "bulk-q122", briefKey = "tradecraft/sustaining", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How often should you review your posture?",
            options = listOf("Never", "Regularly, and whenever your situation changes", "Only after an incident", "Every five years"),
            answerIndex = 1,
            rationale = "Regular reviews, plus reviews on change, catch decay before an incident does.",
            id = "bulk-q123", briefKey = "tradecraft/sustaining", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the biggest threat to a sustained posture?",
            options = listOf("New attackers", "Fatigue: controls that are too burdensome get abandoned", "Old devices", "Cost"),
            answerIndex = 1,
            rationale = "Burdensome controls get abandoned. A sustainable posture is one you can actually keep doing.",
            id = "bulk-q124", briefKey = "tradecraft/sustaining", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the first hour of an incident for?",
            options = listOf("Blame", "Containment and safety: stop the spread, protect people, preserve evidence", "Full investigation", "Public statements"),
            answerIndex = 1,
            rationale = "The first hour is for containment and safety. Full investigation comes after the spread stops.",
            id = "bulk-q125", briefKey = "tradecraft/first-hour", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you NOT do in the first hour?",
            options = listOf("Contact help", "Delete logs and evidence in a panic", "Isolate a device", "Note what happened"),
            answerIndex = 1,
            rationale = "Panic deletion destroys evidence and may hide ongoing compromise. Preserve, then investigate.",
            id = "bulk-q126", briefKey = "tradecraft/first-hour", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Who should you contact first in a serious incident?",
            options = listOf("The media", "A trusted helper or, if anyone is in danger, emergency services", "The attacker", "Everyone"),
            answerIndex = 1,
            rationale = "Trusted help first; emergency services if anyone is in danger. The media and the attacker are not first calls.",
            id = "bulk-q127", briefKey = "tradecraft/first-hour", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is fieldcraft in this programme?",
            options = listOf("Camping skills", "Practical, applied OPSEC: doing the basics well under real conditions", "Military training", "Surveillance skills"),
            answerIndex = 1,
            rationale = "Fieldcraft is applied OPSEC: the basics, done well, under real conditions, not in theory.",
            id = "bulk-q128", briefKey = "fieldcraft/fieldcraft", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What distinguishes fieldcraft from theory?",
            options = listOf("More jargon", "Testing under real conditions, including failure and fatigue", "More tools", "More rules"),
            answerIndex = 1,
            rationale = "Fieldcraft is tested under real conditions — fatigue, pressure, and failure included. Theory is not tested at all.",
            id = "bulk-q129", briefKey = "fieldcraft/fieldcraft", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the most useful fieldcraft habit?",
            options = listOf("Carrying many tools", "Rehearsing procedures before you need them", "Memorising checklists", "Avoiding all risk"),
            answerIndex = 1,
            rationale = "Rehearsed procedures work under pressure. Unrehearsed knowledge does not.",
            id = "bulk-q130", briefKey = "fieldcraft/fieldcraft", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the safest way to arrange a sensitive conversation?",
            options = listOf("By email", "In person, in a place you control, with devices managed in advance", "By phone from anywhere", "By group chat"),
            answerIndex = 1,
            rationale = "In person, in a controlled place, with devices managed in advance, removes most remote and recording risks.",
            id = "bulk-q131", briefKey = "fieldcraft/secure-comms", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do with phones during a sensitive meeting?",
            options = listOf("Put them face down", "Agree in advance: leave them elsewhere, or in a shielded container", "Mute them", "Turn off Wi-Fi"),
            answerIndex = 1,
            rationale = "Face-down and muted phones still record. Agree in advance to leave them elsewhere or shield them.",
            id = "bulk-q132", briefKey = "fieldcraft/secure-comms", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the risk of a sensitive call on speakerphone?",
            options = listOf("None", "Anyone nearby, and anyone near the other party, can hear both sides", "Echo", "Battery drain"),
            answerIndex = 1,
            rationale = "Speakerphone exposes both sides to everyone nearby — at your end and at the other party's end.",
            id = "bulk-q133", briefKey = "fieldcraft/secure-comms", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the main risk of a device at a border?",
            options = listOf("Battery inspection", "Search, copying, and retention of the device and its data", "Roaming charges", "Damage"),
            answerIndex = 1,
            rationale = "Border searches can copy and retain device data. The risk is data exposure, not hardware damage.",
            id = "bulk-q134", briefKey = "fieldcraft/border-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a clean travel device?",
            options = listOf("A new phone", "A device carrying only what the trip needs, with the rest backed up and removed", "A wiped phone", "A phone without apps"),
            answerIndex = 1,
            rationale = "A clean travel device carries only trip essentials. Everything else is backed up and removed before travel.",
            id = "bulk-q135", briefKey = "fieldcraft/border-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you decide before a border crossing?",
            options = listOf("What to wear", "What you will do if a device is searched, detained, or copied — in advance, calmly", "What to eat", "Which queue to join"),
            answerIndex = 1,
            rationale = "Deciding under pressure at a border is unreliable. Decide in advance, calmly, what you will do.",
            id = "bulk-q136", briefKey = "fieldcraft/border-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is financial privacy?",
            options = listOf("Hiding wealth", "Controlling what your transactions reveal about your life, habits, and contacts", "Avoiding banks", "Using cash only"),
            answerIndex = 1,
            rationale = "Financial privacy is control over what transactions reveal — habits, contacts, locations — not hiding wealth.",
            id = "bulk-q137", briefKey = "fieldcraft/financial-privacy", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What do transaction records reveal?",
            options = listOf("Only amounts", "Habits, locations, contacts, and routines, assembled over time", "Only merchant names", "Nothing useful"),
            answerIndex = 1,
            rationale = "Transaction records, assembled over time, reveal habits, locations, contacts, and routines.",
            id = "bulk-q138", briefKey = "fieldcraft/financial-privacy", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the simplest financial privacy step?",
            options = listOf("Close all accounts", "Separate accounts for separate purposes, so no single record shows everything", "Use one account", "Pay in cash always"),
            answerIndex = 1,
            rationale = "Separation means no single record shows everything. It is the financial equivalent of compartmentation.",
            id = "bulk-q139", briefKey = "fieldcraft/financial-privacy", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do if you believe you are under surveillance?",
            options = listOf("Confront the watcher", "Stay calm, go to a public place, and contact a trusted person", "Run", "Ignore it"),
            answerIndex = 1,
            rationale = "Calm, public, and connected: go public, contact a trusted person. Confrontation and flight both escalate risk.",
            id = "bulk-q140", briefKey = "fieldcraft/under-surveillance", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you NOT do under surveillance?",
            options = listOf("Vary your routine", "Lead the watcher to sensitive people or places", "Keep notes", "Contact help"),
            answerIndex = 1,
            rationale = "Under surveillance, never lead watchers to sensitive people or places. Go public first.",
            id = "bulk-q141", briefKey = "fieldcraft/under-surveillance", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the best record of suspected surveillance?",
            options = listOf("A vague feeling", "Specific, dated notes: who, what, where, when", "A photo of the watcher", "A social media post"),
            answerIndex = 1,
            rationale = "Specific, dated notes are useful evidence. Vague feelings and public posts are not.",
            id = "bulk-q142", briefKey = "fieldcraft/under-surveillance", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the core team OPSEC rule?",
            options = listOf("Trust everyone", "Need to know: each person knows only what their role requires", "Share everything", "Keep secrets from managers"),
            answerIndex = 1,
            rationale = "Need to know limits every person's exposure, so one compromise does not expose the whole team.",
            id = "bulk-q143", briefKey = "fieldcraft/team-opsec", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should a team do when a member leaves?",
            options = listOf("Nothing", "Revoke access promptly, and review what they knew", "Change all passwords", "Delete their files"),
            answerIndex = 1,
            rationale = "Prompt revocation plus a review of what the departing member knew closes the most likely gaps.",
            id = "bulk-q144", briefKey = "fieldcraft/team-opsec", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What makes a team briefing secure?",
            options = listOf("Its length", "Clear need-to-know boundaries, and no sensitive detail beyond them", "Its secrecy", "Its location"),
            answerIndex = 1,
            rationale = "A secure briefing shares exactly what each role needs — no more, no less.",
            id = "bulk-q145", briefKey = "fieldcraft/team-opsec", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What sustains a personal OPSEC posture long-term?",
            options = listOf("Willpower", "Routines and reviews built into ordinary life", "Fear", "New tools"),
            answerIndex = 1,
            rationale = "Routines and reviews sustain a posture. Willpower and fear both fade.",
            id = "bulk-q146", briefKey = "fieldcraft/sustain", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do after a lapse?",
            options = listOf("Give up", "Record it without judgement, fix what you can, and continue", "Hide it", "Restart from the beginning"),
            answerIndex = 1,
            rationale = "Lapses are recorded without judgement, fixed where possible, and the posture continues. Giving up is the only fatal lapse.",
            id = "bulk-q147", briefKey = "fieldcraft/sustain", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the best review cadence for a personal posture?",
            options = listOf("Daily", "Regular and light, with deeper reviews when situations change", "Never", "Annually only"),
            answerIndex = 1,
            rationale = "Regular, light reviews plus deeper reviews on change keep a posture current without exhausting it.",
            id = "bulk-q148", briefKey = "fieldcraft/sustain", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the main risk of an AI feed?",
            options = listOf("Bad recommendations", "It learns from, and reveals, your interests, habits, and attention over time", "Slow loading", "Ads"),
            answerIndex = 1,
            rationale = "A feed is a profile: your attention, interests, and habits, assembled over time and visible to the provider.",
            id = "bulk-q149", briefKey = "ai-era/ai-feed", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do with AI feed personalisation?",
            options = listOf("Accept all defaults", "Review and limit it: fewer signals, less history, more control", "Delete the app", "Ignore it"),
            answerIndex = 1,
            rationale = "Limit signals and history where you can. Personalisation is a trade: convenience for profile depth.",
            id = "bulk-q150", briefKey = "ai-era/ai-feed", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Can an AI feed reveal sensitive information?",
            options = listOf("No", "Yes: interests, routines, and vulnerabilities can be inferred from engagement patterns", "Only if you post", "Only to advertisers"),
            answerIndex = 1,
            rationale = "Engagement patterns infer interests, routines, and vulnerabilities — even without posts.",
            id = "bulk-q151", briefKey = "ai-era/ai-feed", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is AI memory in a chatbot?",
            options = listOf("Its training data", "Stored information about you across sessions, used to personalise replies", "Its context window", "Its logs"),
            answerIndex = 1,
            rationale = "AI memory stores information about you across sessions. It is your data, held by the provider, and it persists.",
            id = "bulk-q152", briefKey = "ai-era/ai-memory", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you avoid telling an AI assistant with memory?",
            options = listOf("General questions", "Sensitive personal, work, or health information you would not want stored", "Opinions", "Jokes"),
            answerIndex = 1,
            rationale = "Anything you tell a memory-enabled assistant is stored. Treat it as a record, not a conversation.",
            id = "bulk-q153", briefKey = "ai-era/ai-memory", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you check in an AI assistant's settings?",
            options = listOf("Its theme", "Memory controls, data retention, and whether conversations train models", "Its voice", "Its speed"),
            answerIndex = 1,
            rationale = "Memory controls, retention, and training use determine what happens to your words after you send them.",
            id = "bulk-q154", briefKey = "ai-era/ai-memory", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the main work-from-home OPSEC risk?",
            options = listOf("Distraction", "Blurred boundaries: work data, personal devices, and household access mixing", "Slow internet", "Comfort"),
            answerIndex = 1,
            rationale = "Working from home mixes work data, personal devices, and household access — three compartments in one room.",
            id = "bulk-q155", briefKey = "ai-era/ai-work-home", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a good work-home boundary?",
            options = listOf("Different rooms only", "Separate devices or profiles for work, and no work data on personal devices", "A closed door", "Different hours"),
            answerIndex = 1,
            rationale = "Separate devices or profiles, with no work data on personal devices, is a boundary that survives fatigue.",
            id = "bulk-q156", briefKey = "ai-era/ai-work-home", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Who else can access your home workspace?",
            options = listOf("No one", "Household members, visitors, and anyone who can see or hear the room", "Only family", "Only you"),
            answerIndex = 1,
            rationale = "A home workspace is observed by household members and visitors. Screen, voice, and documents all leak.",
            id = "bulk-q157", briefKey = "ai-era/ai-work-home", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a deepfake?",
            options = listOf("A blurry photo", "Synthetic media that convincingly impersonates a real person", "A cartoon", "A filter"),
            answerIndex = 1,
            rationale = "Deepfakes are synthetic audio, video, or images that impersonate real people convincingly.",
            id = "bulk-q158", briefKey = "ai-era/ai-deepfake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How do you verify a surprising video or audio clip?",
            options = listOf("Trust it if it looks real", "Check the source, seek independent confirmation, and look for corroboration", "Share it and ask others", "Check the comments"),
            answerIndex = 1,
            rationale = "Realism is no longer evidence. Source, independent confirmation, and corroboration are.",
            id = "bulk-q159", briefKey = "ai-era/ai-deepfake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do if someone impersonates you with synthetic media?",
            options = listOf("Ignore it", "Document it, report it to platforms, and warn contacts through trusted channels", "Respond in kind", "Delete your accounts"),
            answerIndex = 1,
            rationale = "Document, report, and warn through trusted channels. Responding in kind escalates, and silence lets it spread.",
            id = "bulk-q160", briefKey = "ai-era/ai-deepfake", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How has AI changed phishing?",
            options = listOf("It has not", "It makes phishing personalised, fluent, and scalable — at any scale", "It made it rarer", "It made it easier to spot"),
            answerIndex = 1,
            rationale = "AI generates fluent, personalised phishing at scale. Grammar errors are no longer a reliable signal.",
            id = "bulk-q161", briefKey = "ai-era/ai-phishing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the best defence against AI phishing?",
            options = listOf("Spotting bad grammar", "Verification through a separate channel, regardless of how convincing the message is", "Spam filters", "Antivirus"),
            answerIndex = 1,
            rationale = "When messages are perfectly written, only independent verification defends you.",
            id = "bulk-q162", briefKey = "ai-era/ai-phishing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A voice call from your manager asks for an urgent transfer. What do you do?",
            options = listOf("Transfer immediately", "Verify through a separate channel before acting, whatever the voice sounds like", "Ask for a callback", "Transfer a small amount first"),
            answerIndex = 1,
            rationale = "Voice cloning makes voices unreliable. Verify through a separate channel before any transfer.",
            id = "bulk-q163", briefKey = "ai-era/ai-phishing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Can AI-generated media be used as evidence?",
            options = listOf("Always", "Only with verification: provenance, corroboration, and chain of custody matter more than ever", "Never", "Only video"),
            answerIndex = 1,
            rationale = "Synthetic media can be fabricated. Provenance, corroboration, and custody now matter more than appearance.",
            id = "bulk-q164", briefKey = "ai-era/ai-media-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do before sharing a dramatic clip as evidence?",
            options = listOf("Share quickly", "Verify its source and corroboration first, or do not share it", "Add a disclaimer", "Crop it"),
            answerIndex = 1,
            rationale = "Sharing unverified media spreads potential fabrication. Verify first, or do not share.",
            id = "bulk-q165", briefKey = "ai-era/ai-media-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is provenance for media?",
            options = listOf("Its resolution", "Its origin and chain of custody: where it came from, and how it reached you", "Its file size", "Its format"),
            answerIndex = 1,
            rationale = "Provenance is origin and custody: where media came from, and every hand it passed through.",
            id = "bulk-q166", briefKey = "ai-era/ai-media-evidence", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is an AI agent in this context?",
            options = listOf("A robot", "Software that acts on your behalf, with access to your accounts, data, and tools", "A chatbot", "A virus"),
            answerIndex = 1,
            rationale = "AI agents act for you, with your access. Their permissions are your exposure.",
            id = "bulk-q167", briefKey = "ai-era/ai-agents", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you limit for an AI agent?",
            options = listOf("Its speed", "Its permissions: least access, for the shortest time, with review", "Its cost", "Its memory"),
            answerIndex = 1,
            rationale = "Least access, shortest time, with review — the same principle as any delegation of trust.",
            id = "bulk-q168", briefKey = "ai-era/ai-agents", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you check after an AI agent acts for you?",
            options = listOf("Nothing", "What it did, what it accessed, and whether that matches what you asked", "Its speed", "Its cost"),
            answerIndex = 1,
            rationale = "Review what an agent did and accessed. Unreviewed delegation is unaccountable delegation.",
            id = "bulk-q169", briefKey = "ai-era/ai-agents", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the main risk of AI-generated output?",
            options = listOf("It is slow", "It can be confident and wrong: fluent text is not verified text", "It is expensive", "It is boring"),
            answerIndex = 1,
            rationale = "AI output is fluent by design, not accurate by design. Confidence is not correctness.",
            id = "bulk-q170", briefKey = "ai-era/ai-verify-output", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How do you verify AI output?",
            options = listOf("Trust it if it is detailed", "Check claims against independent, trusted sources, especially for consequential decisions", "Ask the AI again", "Check its grammar"),
            answerIndex = 1,
            rationale = "Verify against independent sources, especially when decisions are consequential. Asking the same AI again verifies nothing.",
            id = "bulk-q171", briefKey = "ai-era/ai-verify-output", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When must you never rely on AI output alone?",
            options = listOf("For trivia", "For consequential decisions: legal, medical, financial, or safety matters", "For drafts", "For summaries"),
            answerIndex = 1,
            rationale = "Consequential decisions — legal, medical, financial, safety — demand independent verification, not AI fluency.",
            id = "bulk-q172", briefKey = "ai-era/ai-verify-output", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you avoid pasting into an AI research tool?",
            options = listOf("Public documents", "Confidential, proprietary, or sensitive material you do not want stored", "Questions", "Summaries"),
            answerIndex = 1,
            rationale = "Pasted material may be stored or used for training. Treat AI tools as external recipients, not private notebooks.",
            id = "bulk-q173", briefKey = "ai-era/ai-research-code", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you check in AI-generated code before using it?",
            options = listOf("That it runs", "That it is secure, correct, and licensed appropriately — running is not enough", "That it is short", "That it is commented"),
            answerIndex = 1,
            rationale = "Code that runs can still be insecure, incorrect, or improperly licensed. Review all three.",
            id = "bulk-q174", briefKey = "ai-era/ai-research-code", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the risk of AI-generated code with hidden flaws?",
            options = listOf("None if it runs", "It can introduce vulnerabilities that are hard to spot because the code looks plausible", "It is slower", "It is longer"),
            answerIndex = 1,
            rationale = "Plausible-looking code hides flaws well. Review generated code as carefully as code from a stranger.",
            id = "bulk-q175", briefKey = "ai-era/ai-research-code", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a personal AI rule?",
            options = listOf("A law", "A rule you set for yourself about what you will and will not share with AI tools", "A platform policy", "A password"),
            answerIndex = 1,
            rationale = "Personal AI rules are your own boundaries: what you share, with which tools, and for what purposes.",
            id = "bulk-q176", briefKey = "ai-era/ai-personal-rules", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a good first personal AI rule?",
            options = listOf("Share everything", "Never paste sensitive personal or work material into AI tools", "Use only one tool", "Never use AI"),
            answerIndex = 1,
            rationale = "A simple first rule — no sensitive material into AI tools — covers most exposure with little effort.",
            id = "bulk-q177", briefKey = "ai-era/ai-personal-rules", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should personal AI rules be maintained?",
            options = listOf("Set once, forget", "Reviewed as tools and your situation change", "Enforced by the platform", "Shared publicly"),
            answerIndex = 1,
            rationale = "Tools change fast. Rules reviewed as tools and situations change stay relevant; forgotten rules do not.",
            id = "bulk-q178", briefKey = "ai-era/ai-personal-rules", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a financial footprint?",
            options = listOf("Your net worth", "The trail of accounts, transactions, and records that reveals your financial life", "Your credit score", "Your tax return"),
            answerIndex = 1,
            rationale = "A financial footprint is the trail — accounts, transactions, records — that reveals your financial life.",
            id = "bulk-q179", briefKey = "financial/fin-footprint", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do to map your financial footprint?",
            options = listOf("Check your balance", "List every account, subscription, and service that holds or moves your money", "Close old accounts", "Check your credit score"),
            answerIndex = 1,
            rationale = "Mapping means listing everything: accounts, subscriptions, services. You cannot reduce what you have not listed.",
            id = "bulk-q180", briefKey = "financial/fin-footprint", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why do old, unused financial accounts matter?",
            options = listOf("They do not", "They still hold data, may still be breached, and may still be used for fraud", "They cost money", "They lower credit scores"),
            answerIndex = 1,
            rationale = "Unused accounts still hold data and access. They are breached and abused like active ones.",
            id = "bulk-q181", briefKey = "financial/fin-footprint", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why separate financial accounts by purpose?",
            options = listOf("For interest rates", "So no single breach or record exposes your whole financial life", "For tax reasons", "For convenience"),
            answerIndex = 1,
            rationale = "Separation limits exposure: one breached account does not reveal or endanger the rest.",
            id = "bulk-q182", briefKey = "financial/fin-separation", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a good separation for spending?",
            options = listOf("One account for everything", "Separate accounts for bills, daily spending, and sensitive purchases", "Cash only", "Many credit cards"),
            answerIndex = 1,
            rationale = "Bills, daily spending, and sensitive purchases in separate accounts keep any one record partial.",
            id = "bulk-q183", briefKey = "financial/fin-separation", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the risk of linking every service to one account?",
            options = listOf("None", "One compromise exposes every linked service, and one record links them all", "Fees", "Slower payments"),
            answerIndex = 1,
            rationale = "One linked account is a single point of failure and a single record linking everything.",
            id = "bulk-q184", briefKey = "financial/fin-separation", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What payment method reveals least about you?",
            options = listOf("Credit card", "Cash, for in-person purchases, within legal limits", "Debit card", "Bank transfer"),
            answerIndex = 1,
            rationale = "Cash leaves no transaction record. Cards and transfers create records linking you, merchant, time, and amount.",
            id = "bulk-q185", briefKey = "financial/fin-payments", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What do card payments reveal?",
            options = listOf("Only the amount", "Merchant, time, location, amount, and patterns over time", "Only the merchant", "Nothing"),
            answerIndex = 1,
            rationale = "Card records reveal merchant, time, location, and amount — and patterns assembled over time.",
            id = "bulk-q186", briefKey = "financial/fin-payments", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you check before using a new payment app?",
            options = listOf("Its design", "What data it collects, stores, and shares, and its security practices", "Its popularity", "Its fees only"),
            answerIndex = 1,
            rationale = "Data collection, storage, sharing, and security practices matter more than design or popularity.",
            id = "bulk-q187", briefKey = "financial/fin-payments", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "When is cash a good choice?",
            options = listOf("Always", "For sensitive in-person purchases where no record is needed, within legal limits", "Never", "Only abroad"),
            answerIndex = 1,
            rationale = "Cash suits sensitive in-person purchases where no record is needed, within legal limits. It is not a universal solution.",
            id = "bulk-q188", briefKey = "financial/fin-cash-prepaid", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the risk of prepaid cards?",
            options = listOf("None", "They can still be linked to you by purchase records, activation, and use patterns", "Fees", "Expiry"),
            answerIndex = 1,
            rationale = "Prepaid cards reduce, but do not eliminate, linkage: purchase, activation, and use patterns can still identify you.",
            id = "bulk-q189", briefKey = "financial/fin-cash-prepaid", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do with prepaid card receipts?",
            options = listOf("Keep them forever", "Dispose of them securely; they link the card to a time, place, and purchase", "Share them", "Ignore them"),
            answerIndex = 1,
            rationale = "Receipts link a card to time, place, and purchase. Dispose of them securely.",
            id = "bulk-q190", briefKey = "financial/fin-cash-prepaid", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why audit subscriptions regularly?",
            options = listOf("To save money only", "Forgotten subscriptions keep charging, keep data, and keep access", "To find new services", "For tax records"),
            answerIndex = 1,
            rationale = "Forgotten subscriptions keep charging, keep your data, and keep access — all without benefit.",
            id = "bulk-q191", briefKey = "financial/fin-subscriptions", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do with a subscription you no longer use?",
            options = listOf("Ignore it", "Cancel it, confirm cancellation, and request data deletion where possible", "Pause it", "Change its password"),
            answerIndex = 1,
            rationale = "Cancel, confirm, and request deletion. Pausing keeps data and access alive.",
            id = "bulk-q192", briefKey = "financial/fin-subscriptions", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the main banking app risk?",
            options = listOf("Slow loading", "A compromised phone gives access to money, not just messages", "Notifications", "Battery use"),
            answerIndex = 1,
            rationale = "Banking apps turn a phone compromise into a money compromise. Protect the device accordingly.",
            id = "bulk-q193", briefKey = "financial/fin-banking-apps", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you enable on a banking app?",
            options = listOf("Biometrics only", "The strongest available authentication, plus transaction alerts", "Notifications only", "Auto-login"),
            answerIndex = 1,
            rationale = "Strongest authentication plus transaction alerts: one prevents, the other detects.",
            id = "bulk-q194", briefKey = "financial/fin-banking-apps", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the main crypto privacy risk?",
            options = listOf("Price volatility", "Public ledgers: transactions are visible, and addresses can be linked to people", "Fees", "Slow confirmations"),
            answerIndex = 1,
            rationale = "Public ledgers make transactions visible. Addresses linked to a person expose that person's transaction history.",
            id = "bulk-q195", briefKey = "financial/fin-crypto", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Is crypto anonymous?",
            options = listOf("Yes", "No: most cryptocurrencies are pseudonymous, and linkage is often possible", "Only Bitcoin", "Only with a VPN"),
            answerIndex = 1,
            rationale = "Crypto is pseudonymous, not anonymous. Address linkage, exchanges, and metadata often identify holders.",
            id = "bulk-q196", briefKey = "financial/fin-crypto", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you keep for tax records?",
            options = listOf("Nothing", "Complete, organised records of income, expenses, and transactions, kept securely", "Only receipts", "Only bank statements"),
            answerIndex = 1,
            rationale = "Complete, organised, securely kept records are both a legal duty and protection in any dispute.",
            id = "bulk-q197", briefKey = "financial/fin-tax-records", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should tax records be stored?",
            options = listOf("In plain text anywhere", "Encrypted, backed up, and access-controlled, like any sensitive data", "On paper only", "In email"),
            answerIndex = 1,
            rationale = "Tax records are sensitive data: encrypt, back up, and control access to them.",
            id = "bulk-q198", briefKey = "financial/fin-tax-records", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the classic financial scam pattern?",
            options = listOf("A detailed contract", "Urgency plus secrecy: act now, tell no one, use an unusual payment method", "A slow process", "A public offer"),
            answerIndex = 1,
            rationale = "Urgency, secrecy, and unusual payment methods are the classic scam pattern, whatever the story.",
            id = "bulk-q199", briefKey = "financial/fin-scams", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What routine best protects financial privacy?",
            options = listOf("Checking balances daily", "Regular reviews: statements, subscriptions, permissions, and linked services", "Changing passwords weekly", "Avoiding online banking"),
            answerIndex = 1,
            rationale = "Regular reviews of statements, subscriptions, permissions, and linked services catch problems early.",
            id = "bulk-q200", briefKey = "financial/fin-routine", difficulty = "Advanced"
        )
    )
}
