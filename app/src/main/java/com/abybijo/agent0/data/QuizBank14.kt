package com.abybijo.agent0.data

/** v2.0 Phase 4c: questions linked to CH-14 Travel briefs, three per brief. */
object QuizBank14 {
    val all: List<QuizQuestion> = listOf(
        QuizQuestion(
            prompt = "In what order should a travel threat model answer its questions?",
            options = listOf("Adversary, purpose, destination", "Destination, purpose, adversary", "Purpose, destination, adversary", "Any order"),
            answerIndex = 1,
            rationale = "Destination, purpose, adversary — in that order — builds the model correctly.",
            id = "travel-q01", briefKey = "travel/travel-threat-model", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why do a tourist and a journalist need different plans for the same country?",
            options = listOf("They do not", "Because purpose and adversary differ, even when destination is shared", "Because journalists travel more", "Because tourists are safer"),
            answerIndex = 1,
            rationale = "Threat models are personal: purpose and adversary complete the destination.",
            id = "travel-q02", briefKey = "travel/travel-threat-model", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does this chapter state about border and device law?",
            options = listOf("It is the same everywhere", "It varies by country, and the chapter is general information, not legal advice", "It never applies to tourists", "It is settled and unchanging"),
            answerIndex = 1,
            rationale = "Border and device law varies by country and changes; check current guidance per destination.",
            id = "travel-q03", briefKey = "travel/travel-threat-model", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the packing rule for a trip?",
            options = listOf("Pack everything; you might need it", "Least data that lets you do the trip travels; the rest stays home, backed up", "Pack nothing", "Pack only work data"),
            answerIndex = 1,
            rationale = "Separation limits what a lost, stolen, or inspected device can expose.",
            id = "travel-q04", briefKey = "travel/travel-packing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Before leaving, what must you do with your backup?",
            options = listOf("Make it", "Make it and verify that it restores", "Make it after returning", "Store it on the travelling device"),
            answerIndex = 1,
            rationale = "An untested backup is a hope, not a backup.",
            id = "travel-q05", briefKey = "travel/travel-packing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Where should credentials and recovery information travel?",
            options = listOf("On the device they unlock", "Separately from the devices they unlock", "In your email", "On paper in your luggage with the device"),
            answerIndex = 1,
            rationale = "Credentials carried with their device are credentials already given away.",
            id = "travel-q06", briefKey = "travel/travel-packing", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "At a border, what should you never do when asked for a device password?",
            options = listOf("Comply calmly", "Lie to or obstruct officials", "Note what happened", "Follow your advance decision"),
            answerIndex = 1,
            rationale = "Deception and obstruction create a separate, often worse, problem.",
            id = "travel-q07", briefKey = "travel/travel-border", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why decide in advance what to do if asked for a password at a border?",
            options = listOf("Because decisions under pressure are worse", "Because officials expect it", "Because it is required", "Because it speeds crossing"),
            answerIndex = 1,
            rationale = "Preparation before the border beats improvisation at it, under pressure.",
            id = "travel-q08", briefKey = "travel/travel-border", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "After a border inspection, what should you record?",
            options = listOf("Nothing", "What was asked, what was done, and when, for the return-home sequence", "Only your feelings", "Only the official's name"),
            answerIndex = 1,
            rationale = "Your notes are what the return-home sequence runs on.",
            id = "travel-q09", briefKey = "travel/travel-border", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What does 'clean' mean for a travelling device?",
            options = listOf("Completely empty", "Proportionate to the trip: only what it requires", "Loaded with plausible fake data", "Factory reset with no accounts"),
            answerIndex = 1,
            rationale = "Clean is a spectrum: proportionate to the trip, not necessarily empty.",
            id = "travel-q10", briefKey = "travel/travel-clean-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is a limit of a clean device?",
            options = listOf("It does not work abroad", "It does not hide that you travel, or who you meet, from observation", "It cannot be restored", "It attracts no attention"),
            answerIndex = 1,
            rationale = "Clean devices limit data exposure, not travel or meeting observation.",
            id = "travel-q11", briefKey = "travel/travel-clean-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why not load a clean device with plausible fake personal data?",
            options = listOf("It is illegal everywhere", "Fabrication creates a lie to maintain under questioning, and fake data can be investigated", "It takes too long", "Fake data is easy to spot"),
            answerIndex = 1,
            rationale = "A fabricated device life is a new risk, not a protection.",
            id = "travel-q12", briefKey = "travel/travel-clean-device", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why is a hotel room not a private space?",
            options = listOf("Rooms are small", "Staff, cleaners, and previous guests may all have access", "Hotels record guests", "Rooms have cameras"),
            answerIndex = 1,
            rationale = "You do not control who has a key, so the room is a shared space.",
            id = "travel-q13", briefKey = "travel/travel-hotels", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you do with devices when leaving a hotel room?",
            options = listOf("Leave them unlocked; the room is locked", "Lock them, and take sensitive items with you", "Hide them under the bed", "Turn them off"),
            answerIndex = 1,
            rationale = "An unlocked device in a room you do not control is an unattended device.",
            id = "travel-q14", briefKey = "travel/travel-hotels", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should a hotel room's network be treated?",
            options = listOf("As trusted, since you paid for it", "As untrusted, like any public network", "As safe for non-sensitive work only", "As monitored, so avoid it entirely"),
            answerIndex = 1,
            rationale = "Room networks are public networks with better furniture.",
            id = "travel-q15", briefKey = "travel/travel-hotels", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "How should every network abroad be treated?",
            options = listOf("Trusted if reputable", "Untrusted, every time, including local SIMs", "Trusted if paid", "Untrusted only if open"),
            answerIndex = 1,
            rationale = "Local SIMs operate under local law, including lawful interception; every foreign network is untrusted.",
            id = "travel-q16", briefKey = "travel/travel-networks", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why disable automatic connection to open networks?",
            options = listOf("To save battery", "So your device does not join untrusted networks silently, before you can decide", "To avoid roaming charges", "Because open networks are slow"),
            answerIndex = 1,
            rationale = "Automatic connection joins networks before you can assess them.",
            id = "travel-q17", briefKey = "travel/travel-networks", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "If sensitive work cannot wait on an untrusted network, what is the least-bad option?",
            options = listOf("Work without protections", "Work with protections on, doing only the minimum the task requires", "Ask staff if the network is secure", "Use a neighbour's hotspot"),
            answerIndex = 1,
            rationale = "Protections on, minimum data, is the least-bad option when work cannot wait.",
            id = "travel-q18", briefKey = "travel/travel-networks", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What makes a good meeting location while travelling?",
            options = listOf("Private and quiet", "Public, but not exposed, with an exit you control", "Your hotel room", "Anywhere the contact suggests"),
            answerIndex = 1,
            rationale = "Assessable, public, with a controlled exit — not private and unassessable.",
            id = "travel-q19", briefKey = "travel/travel-meetings", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you carry to a meeting while travelling?",
            options = listOf("Everything relevant", "Only what the meeting requires", "Nothing", "All your devices"),
            answerIndex = 1,
            rationale = "Minimum carried means minimum exposed if the meeting goes wrong.",
            id = "travel-q20", briefKey = "travel/travel-meetings", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why protect a contact as carefully as yourself?",
            options = listOf("Politeness", "Because a contact who meets you takes a risk by meeting you", "Because contacts are valuable", "Because it is required"),
            answerIndex = 1,
            rationale = "Meeting you endangers the contact too; their safety is part of your responsibility.",
            id = "travel-q21", briefKey = "travel/travel-meetings", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What distinguishes surveillance awareness from paranoia?",
            options = listOf("Nothing", "Awareness is calm, specific, and actionable; paranoia is constant, vague, and exhausting", "Awareness requires training", "Paranoia is more accurate"),
            answerIndex = 1,
            rationale = "Calm, specific, actionable noticing beats constant, vague noticing — which notices nothing.",
            id = "travel-q22", briefKey = "travel/travel-surveillance", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "If you believe you are being followed, what should you NOT do?",
            options = listOf("Enter a public place", "Go to your hotel, meeting, or home", "Change direction", "Contact your team"),
            answerIndex = 1,
            rationale = "Going to your hotel while followed leads the follower to your hotel.",
            id = "travel-q23", briefKey = "travel/travel-surveillance", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you never do with a suspected follower?",
            options = listOf("Change your plan", "Confront or investigate them yourself", "Vary your routes", "Contact your team"),
            answerIndex = 1,
            rationale = "Confrontation escalates danger without improving safety.",
            id = "travel-q24", briefKey = "travel/travel-surveillance", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "A device is returned after inspection. How should you treat it?",
            options = listOf("As trusted, since it looks unchanged", "As untrusted, until return-home decontamination clears it", "As broken", "As safe if it still works"),
            answerIndex = 1,
            rationale = "Out of your control, for any time, means untrusted — appearance proves nothing.",
            id = "travel-q25", briefKey = "travel/travel-device-taken", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Immediately after a device is taken or inspected, what should you do?",
            options = listOf("Argue with staff", "Stay calm, comply lawfully, record everything, tell your team or trusted contact", "Resume normal use", "Post publicly"),
            answerIndex = 1,
            rationale = "Calm compliance, notes, and notification — in that order — carry you through.",
            id = "travel-q26", briefKey = "travel/travel-device-taken", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "If a device is not returned after inspection, what should you do?",
            options = listOf("Wait for it", "Record, report, and begin recovery from your backup, using a clean device", "Buy an identical device", "Complain publicly"),
            answerIndex = 1,
            rationale = "The same sequence applies: record, report, recover from backup on a clean device.",
            id = "travel-q27", briefKey = "travel/travel-device-taken", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What is the return-home decontamination sequence, in order?",
            options = listOf("Change passwords, then wipe devices", "Review notes, wipe or replace inspected devices, revoke trip sessions, change affected passwords from a clean device, restore trusted data", "Restore everything, then check", "Delete trip data and move on"),
            answerIndex = 1,
            rationale = "Notes, devices, sessions, passwords, trusted data — in that order — close a trip.",
            id = "travel-q28", briefKey = "travel/travel-return-home", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why does a trip's exposure not end when the trip ends?",
            options = listOf("It does end", "Sessions stay active, passwords stay used, and devices stay compromised until deliberately closed", "Because memories persist", "Because backups persist"),
            answerIndex = 1,
            rationale = "Exposure does not expire on its own; only deliberate closure ends it.",
            id = "travel-q29", briefKey = "travel/travel-return-home", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What should you restore after decontamination?",
            options = listOf("Everything from the trip backup", "Only trusted data, with the backup verified", "Nothing", "Only photos"),
            answerIndex = 1,
            rationale = "Blind restoration can restore the compromise; only trusted, verified data returns.",
            id = "travel-q30", briefKey = "travel/travel-return-home", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Why run the travel checklist on easy trips too?",
            options = listOf("Because easy trips are riskiest", "Because habits formed on easy trips are the ones that hold on hard ones", "Because checklists are mandatory", "Because easy trips need more protection"),
            answerIndex = 1,
            rationale = "A checklist used only on hard trips is a checklist never practised.",
            id = "travel-q31", briefKey = "travel/travel-routine", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "What are the three parts of the travel routine checklist?",
            options = listOf("Pack, travel, unpack", "Before, during, after", "Plan, execute, review", "Depart, arrive, return"),
            answerIndex = 1,
            rationale = "Before, during, and after — one checklist for the whole trip.",
            id = "travel-q32", briefKey = "travel/travel-routine", difficulty = "Advanced"
        ),
        QuizQuestion(
            prompt = "Where should the travel checklist be kept?",
            options = listOf("Only on your phone", "With your travel documents, not only on a device that might be taken", "In your email", "Memorised only"),
            answerIndex = 1,
            rationale = "A checklist kept only on a device that might be taken is lost when you need it.",
            id = "travel-q33", briefKey = "travel/travel-routine", difficulty = "Advanced"
        )
    )
}
