package com.abybijo.agent0.data

/**
 * CHAPTER 14 — TRAVEL, BORDERS, AND HIGH-RISK ENVIRONMENTS (Specialisation)
 *
 * Travelling with devices and data, crossing borders, and operating in
 * unfamiliar places. This expands the border brief in CH-08 into a
 * complete travel sequence. General information only: border and device
 * law varies by country, and this chapter says so and does not present
 * itself as legal advice.
 */
fun chapter14() = Chapter(
    id = "travel",
    index = 14,
    code = "CH-14",
    title = "Travel, Borders, and High-Risk Environments",
    glyph = "\u2708",
    tier = Tier.ADVANCED,
    tagline = "Devices, data, and borders — prepared before you leave, and cleaned up after you return.",
    briefs = listOf(
        Brief(
            id = "travel-threat-model",
            title = "Travel Threat Model: Before You Leave",
            glyph = "\u25CE",
            summary = "Destination, purpose, and adversary, in that order — before packing a single device.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "A travel threat model answers three questions, in order: " +
                        "where are you going, why are you going, and who might " +
                        "care? A tourist in a low-risk country and a journalist in " +
                        "a high-risk one do not need the same preparation, and " +
                        "preparing for the wrong one wastes effort on the wrong " +
                        "risks."
                ),
                Block.Heading("Destination, purpose, adversary", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Destination: what are the local risks — crime, surveillance, border inspection, network control?",
                        "Purpose: what will you do, who will you meet, and what information will you carry?",
                        "Adversary: who might target you, and what would they want — your data, your contacts, or you?",
                        "Duration and route: longer trips and multiple borders multiply every risk."
                    )
                ),
                Block.Field(
                    "General information, not legal advice",
                    "Border and device law varies by country, and it changes. " +
                        "This chapter gives general information only. Check the " +
                        "current law and guidance for your destination before you " +
                        "travel, and do not rely on this app as legal advice."
                ),
                Block.Para(
                    "Write the threat model down, briefly, before you pack. It " +
                        "decides everything that follows: what travels, what stays " +
                        "home, and what gets backed up first."
                )
            ),
            outcomes = listOf(
                "Build a travel threat model from destination, purpose, and adversary, in that order.",
                "Explain why border and device law must be checked per destination.",
                "Use the threat model to decide what travels and what stays home."
            ),
            howTo = listOf(
                "Write down your destination, its local risks, and its border practices.",
                "Write down your purpose, your meetings, and the information you will carry.",
                "Identify who might target you and what they would want.",
                "Let that model decide your packing, not habit."
            ),
            bestPractices = listOf(
                "Destination, purpose, adversary — in that order, written down.",
                "Check current destination law and guidance before travelling."
            ),
            cautions = listOf(
                "This chapter is general information, not legal advice.",
                "Preparing for the wrong threat model wastes effort on the wrong risks."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to travelling with devices.")
            )
        ),
        Brief(
            id = "travel-packing",
            title = "Packing: Devices, Data, and Separation",
            glyph = "\u25A3",
            summary = "What travels, what stays home, and what is backed up first.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Packing for a trip is a security decision: everything you " +
                        "carry can be lost, stolen, or inspected, and everything " +
                        "you leave behind cannot. The rule is separation: travel " +
                        "with the least data that lets you do the trip, and leave " +
                        "the rest at home, backed up."
                ),
                Block.Heading("Travel light, in data", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Back up everything before you leave, and verify the backup restores.",
                        "Remove data you will not need on the trip, especially sensitive files and old messages.",
                        "Separate work and personal devices and accounts, as at home, and more strictly on the road.",
                        "Carry credentials and recovery information separately from the devices they unlock."
                    )
                ),
                Block.Field(
                    "Backed up first",
                    "A backup made after you return is too late for a device lost " +
                        "on the trip. Back up before you leave, and test that the " +
                        "backup actually restores."
                ),
                Block.Para(
                    "If a device is lost or taken on the trip, the damage should " +
                        "be limited to what was on that device — not everything " +
                        "you own."
                )
            ),
            outcomes = listOf(
                "Pack by separation: least data needed travels, the rest stays home, backed up.",
                "Back up and verify a restore before leaving.",
                "Carry credentials separately from the devices they unlock."
            ),
            howTo = listOf(
                "Back up all devices before leaving, and test a restore.",
                "Remove data you will not need on the trip.",
                "Keep work and personal devices and accounts separate.",
                "Store credentials and recovery information separately from their devices."
            ),
            bestPractices = listOf(
                "Travel light in data, not only in luggage.",
                "A backup you have not tested is a hope, not a backup."
            ),
            cautions = listOf(
                "Everything carried can be lost, stolen, or inspected.",
                "Credentials carried with their device are credentials already given away."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to travelling with devices.")
            )
        ),
        Brief(
            id = "travel-border",
            title = "At the Border: Devices, Passwords, and Consent",
            glyph = "\u25A3",
            summary = "General information about what can be asked, and how to prepare — without legal advice.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "At some borders, officials may ask to inspect devices, and " +
                        "may ask for passwords. What they may lawfully ask, and " +
                        "what happens if you refuse, varies by country, and it " +
                        "changes. This brief gives general information only, and " +
                        "is not legal advice: check the current position for your " +
                        "destination before you travel."
                ),
                Block.Heading("Prepare, in general terms", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Travel with the least data that lets you do the trip, so an inspection reveals the least.",
                        "Know, before you arrive, what you will do if asked for a password, and what the consequences may be.",
                        "Do not lie to border officials, and do not obstruct them; deception creates a separate, often worse, problem.",
                        "If a device is inspected, note what was asked, what was done, and when, for the return-home sequence."
                    )
                ),
                Block.Warning(
                    "Not legal advice",
                    "Border powers, refusal consequences, and device law differ by " +
                        "country and change over time. This app cannot tell you what " +
                        "the law is at your border on your day of travel. Check " +
                        "current, authoritative guidance before you go."
                ),
                Block.Para(
                    "Preparation is the point: a traveller who has already " +
                        "decided what to do, and has already minimised what is on " +
                        "their devices, faces a border inspection with far less at stake."
                )
            ),
            outcomes = listOf(
                "Explain, in general terms, that border device powers vary by country.",
                "Prepare for a possible inspection by minimising data and deciding in advance.",
                "Record what happens at an inspection for the return-home sequence."
            ),
            howTo = listOf(
                "Before travelling, check current border and device guidance for your destination.",
                "Minimise data on travelling devices before you arrive.",
                "Decide in advance what you will do if asked for a password.",
                "If inspected, note what was asked, what was done, and when."
            ),
            bestPractices = listOf(
                "Preparation before the border beats improvisation at it.",
                "Minimised data means minimised exposure in any inspection."
            ),
            cautions = listOf(
                "This is general information, not legal advice, and law varies by country.",
                "Lying to or obstructing border officials creates a separate, often worse, problem."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to border crossings.")
            )
        ),
        Brief(
            id = "travel-clean-device",
            title = "Crossing With a Clean Device",
            glyph = "\u25A3",
            summary = "The clean-device approach, its benefits, and its limits.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "A clean device is a device prepared for a trip with only " +
                        "what the trip requires: a fresh or reset device, with " +
                        "minimal accounts, minimal data, and no history. If it is " +
                        "inspected, lost, or taken, the exposure is limited to what " +
                        "was on it — which is, by design, very little."
                ),
                Block.Heading("Benefits and limits", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Benefit: inspection, loss, or theft exposes only trip data, not your life.",
                        "Benefit: a clean device is easier to wipe and restore afterwards.",
                        "Limit: a clean device does not hide that you travel, or who you meet, from network and location observation.",
                        "Limit: a device that looks too clean can itself attract attention at some borders."
                    )
                ),
                Block.Field(
                    "Clean is a spectrum",
                    "Clean does not have to mean empty. It means proportionate: " +
                        "only what the trip requires, with everything else left " +
                        "behind, backed up, and accessible later."
                ),
                Block.Para(
                    "For most travellers, a cleaned everyday device — data " +
                        "removed, accounts minimised, backup verified — is more " +
                        "practical than a separate device, and achieves most of " +
                        "the benefit."
                )
            ),
            outcomes = listOf(
                "Explain the clean-device approach and its benefits.",
                "State its limits: it does not hide travel or meetings from observation.",
                "Choose a proportionate clean level for a trip."
            ),
            howTo = listOf(
                "Decide what the trip actually requires, and prepare a device with only that.",
                "Back up everything else, and verify the backup, before leaving.",
                "Remove accounts and data you will not need on the trip.",
                "After returning, wipe or restore the travelling device before normal use."
            ),
            bestPractices = listOf(
                "Clean means proportionate to the trip, not necessarily empty.",
                "A cleaned everyday device achieves most of the benefit for most travellers."
            ),
            cautions = listOf(
                "A clean device does not hide travel itself from observation.",
                "A device that looks too clean can attract attention at some borders."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to clean devices.")
            )
        ),
        Brief(
            id = "travel-hotels",
            title = "Hotels, Rentals, and Temporary Spaces",
            glyph = "\u2302",
            summary = "Physical security away from home — where you do not control who has a key.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "A hotel room or rental is a space you do not control: staff, " +
                        "cleaners, and previous guests may all have access, and you " +
                        "cannot verify its locks, its network, or whether anything " +
                        "has been left behind. Treat it as a shared space, not a " +
                        "private one."
                ),
                Block.Heading("Treat it as shared", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Lock devices when you leave the room, and take sensitive items with you where practical.",
                        "Do not leave devices unattended and unlocked, even for a short time.",
                        "Treat the room's network as untrusted, like any public network.",
                        "Check for and remove personal items and papers before checkout, every time."
                    )
                ),
                Block.Field(
                    "You do not control who has a key",
                    "Hotel staff, cleaners, and maintenance all have legitimate " +
                        "access to your room. Plan as if someone will enter it " +
                        "while you are out, because someone may."
                ),
                Block.Para(
                    "Temporary spaces also include offices, conference rooms, and " +
                        "shared workspaces. The same rule applies: if you do not " +
                        "control the space, do not treat it as private."
                )
            ),
            outcomes = listOf(
                "Treat hotels and rentals as shared spaces, not private ones.",
                "Lock devices and take sensitive items when leaving a room.",
                "Treat a room's network as untrusted."
            ),
            howTo = listOf(
                "Lock every device before leaving a room, and take sensitive items with you.",
                "Use team-provided protections on the room's network, or avoid it for sensitive work.",
                "Before checkout, check for personal items and papers, every time.",
                "Treat conference rooms and shared workspaces the same way."
            ),
            bestPractices = listOf(
                "Plan as if someone will enter your room while you are out.",
                "Checkout checks, every time, catch what tired travellers forget."
            ),
            cautions = listOf(
                "An unlocked device left in a room is an unattended device, whatever the lock on the door.",
                "Room networks are public networks with better furniture."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to physical security while travelling.")
            )
        ),
        Brief(
            id = "travel-networks",
            title = "Public Wi-Fi, SIMs, and Local Networks Abroad",
            glyph = "\u21C4",
            summary = "Networks you do not control — and how to use them without handing them your work.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Abroad, you will use networks you do not control: hotel Wi-Fi, " +
                        "airport Wi-Fi, café Wi-Fi, and local SIMs. Any of them " +
                        "can observe, record, or interfere with your traffic, and " +
                        "some are operated, legally, by providers who must cooperate " +
                        "with local authorities. Treat every one of them as " +
                        "untrusted, and use the protections your team provides."
                ),
                Block.Heading("Untrusted, every time", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Use team-provided protections on every network, every time, without exception.",
                        "Avoid sensitive work on networks you cannot verify, and delay it until you can.",
                        "Prefer a local SIM from a reputable provider over an unknown open network, and still treat it as untrusted.",
                        "Turn off automatic connection to open networks, so your device does not join them silently."
                    )
                ),
                Block.Field(
                    "Local law follows local networks",
                    "A network in another country operates under that country's law, " +
                        "including any lawful interception. That is a property of " +
                        "the network, not a judgement on the country."
                ),
                Block.Para(
                    "If you must do sensitive work abroad, do it on a network " +
                        "you trust, with protections on, and with the minimum " +
                        "data the task requires."
                )
            ),
            outcomes = listOf(
                "Treat every foreign network, including local SIMs, as untrusted.",
                "Use team-provided protections on every network, every time.",
                "Turn off automatic connection to open networks."
            ),
            howTo = listOf(
                "Use team-provided network protections on every network abroad.",
                "Delay sensitive work until you are on a network you can trust.",
                "Prefer a reputable local SIM over an unknown open network, and still treat it as untrusted.",
                "Disable automatic connection to open networks."
            ),
            bestPractices = listOf(
                "Untrusted, every time, without exception, is the only rule that survives travel.",
                "Delaying sensitive work is a valid security decision."
            ),
            cautions = listOf(
                "Local SIMs operate under local law, including lawful interception.",
                "Automatic connection joins networks silently, before you can decide."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to networks abroad.")
            )
        ),
        Brief(
            id = "travel-meetings",
            title = "Meetings and Sources While Travelling",
            glyph = "\u25C9",
            summary = "Meeting safely, and Rule 1 on the move — because a meeting away from home is a meeting with new risks.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Meetings while travelling carry risks that meetings at home " +
                        "do not: unfamiliar locations, unfamiliar surveillance, and " +
                        "contacts whose own security you cannot verify. Rule 1 " +
                        "applies on the move exactly as it applies at home: do not " +
                        "talk about this, except to the people who need to know, " +
                        "and do not carry meeting details where they can be found."
                ),
                Block.Heading("Meet safely", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Choose meeting locations you can assess: public, but not exposed, and with an exit you control.",
                        "Carry only what the meeting requires, and leave meeting notes and devices elsewhere where possible.",
                        "Agree, in advance, how you will contact each other if plans change, without leaving a trail in advance.",
                        "After the meeting, do not discuss it where you can be overheard, and do not post about it."
                    )
                ),
                Block.Warning(
                    "Sources are at risk too",
                    "A contact who meets you while you travel takes a risk by " +
                        "meeting you. Protect their identity, their information, " +
                        "and the fact of the meeting itself, with at least the " +
                        "care you protect your own."
                ),
                Block.Para(
                    "If a meeting feels wrong — the location, the timing, the " +
                        "people — leave. A missed meeting costs less than a " +
                        "compromised one."
                )
            ),
            outcomes = listOf(
                "Choose meeting locations you can assess, with an exit you control.",
                "Carry only what a meeting requires, and leave notes and extra devices elsewhere.",
                "Protect contacts and the fact of a meeting, not only its content."
            ),
            howTo = listOf(
                "Assess a meeting location in advance: public, not exposed, exit you control.",
                "Carry only what the meeting requires.",
                "Agree a contact plan for changes, without leaving a trail in advance.",
                "Afterwards, do not discuss or post about the meeting where you can be overheard or seen."
            ),
            bestPractices = listOf(
                "Rule 1 on the move is Rule 1 at home: need-to-know, nothing more.",
                "A missed meeting costs less than a compromised one."
            ),
            cautions = listOf(
                "A contact who meets you takes a risk; protect them accordingly.",
                "Discussing a meeting afterwards, where you can be overheard, undoes its precautions."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to meeting safely.")
            )
        ),
        Brief(
            id = "travel-surveillance",
            title = "Surveillance Awareness on the Move",
            glyph = "\u25CE",
            summary = "Noticing, without paranoia, and what to do if you notice something.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Surveillance awareness on the move means noticing what is " +
                        "around you, without paranoia. Most of what you notice " +
                        "will be ordinary life. The skill is noticing the " +
                        "exception — the same person in two places, the same " +
                        "vehicle on two routes, the same face in two crowds — " +
                        "and knowing what to do about it."
                ),
                Block.Heading("Notice, then decide", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Vary your routes and routines while travelling, so patterns are harder to follow.",
                        "Notice the baseline: what is normal for this place, at this time?",
                        "If you notice an exception, change your plan: enter a public place, change direction, or abandon the meeting.",
                        "Do not confront anyone you suspect of following you, and do not try to investigate them yourself."
                    )
                ),
                Block.Field(
                    "Paranoia is not awareness",
                    "Awareness is calm, specific, and actionable. Paranoia is " +
                        "constant, vague, and exhausting — and it makes you " +
                        "notice nothing, because you notice everything."
                ),
                Block.Para(
                    "If you believe you are being followed or watched, get to " +
                        "a public, populated place, and contact your team or " +
                        "your trusted contact. Do not go to your hotel, your " +
                        "meeting, or your home while being followed."
                )
            ),
            outcomes = listOf(
                "Distinguish surveillance awareness from paranoia.",
                "Vary routes and routines while travelling.",
                "Respond to a suspected follow by changing plan and reaching a public place."
            ),
            howTo = listOf(
                "Learn the baseline for each place you visit.",
                "Vary routes and routines.",
                "If you notice an exception, change direction or enter a public place.",
                "If followed, do not go to your hotel, meeting, or home; contact your team or trusted contact."
            ),
            bestPractices = listOf(
                "Calm, specific, and actionable beats constant and vague.",
                "Changing plan is the response; confrontation is not."
            ),
            cautions = listOf(
                "Do not confront or investigate a suspected follower yourself.",
                "Going to your hotel while followed leads the follower to your hotel."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to surveillance awareness.")
            )
        ),
        Brief(
            id = "travel-device-taken",
            title = "If a Device Is Taken or Inspected",
            glyph = "\u26A0",
            summary = "The immediate sequence, and what to do afterwards — calm, recorded, and in order.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "If a device is taken or inspected, the immediate sequence is " +
                        "simple: stay calm, comply with lawful instructions, do not " +
                        "obstruct, and record everything you can, as soon as you " +
                        "can. What happens afterwards — the return-home sequence " +
                        "in the next brief — depends on what you record now."
                ),
                Block.Heading("Now, and afterwards", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Stay calm, comply with lawful instructions, and do not obstruct or deceive.",
                        "Note who took or inspected the device, where, when, and for how long.",
                        "Note what was asked, what you provided, and what was done to the device, as far as you could observe.",
                        "As soon as you can, write it all down, and tell your team or trusted contact."
                    )
                ),
                Block.Warning(
                    "A returned device is not a trusted device",
                    "A device that was out of your control, for any length of " +
                        "time, cannot be trusted as before. Treat it as compromised " +
                        "until the return-home sequence says otherwise."
                ),
                Block.Para(
                    "If a device is not returned, follow the same sequence: " +
                        "record, report, and begin recovery from your backup, " +
                        "using a clean device."
                )
            ),
            outcomes = listOf(
                "Respond to a device being taken or inspected calmly, without obstruction or deception.",
                "Record who, where, when, and what was done, as soon as possible.",
                "Treat a returned device as untrusted until the return-home sequence clears it."
            ),
            howTo = listOf(
                "Stay calm and comply with lawful instructions.",
                "Note who, where, when, how long, and what was asked and done.",
                "Write it down as soon as you can, and tell your team or trusted contact.",
                "Treat the device as untrusted until the return-home sequence is complete."
            ),
            bestPractices = listOf(
                "Record now, decide later: your notes are what the return-home sequence runs on.",
                "Calm compliance beats confrontation in every jurisdiction."
            ),
            cautions = listOf(
                "A device out of your control, for any time, is not a trusted device.",
                "Obstruction or deception creates a separate, often worse, problem."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to device inspection.")
            )
        ),
        Brief(
            id = "travel-return-home",
            title = "Returning Home: Decontaminating Devices and Accounts",
            glyph = "\u21C4",
            summary = "Sessions, passwords, and data, in order — so the trip does not follow you home.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Returning home is a decontamination sequence, not a sigh of " +
                        "relief. Devices were on untrusted networks, in shared " +
                        "spaces, and possibly out of your control. Accounts were " +
                        "used from unfamiliar places. The trip's exposure ends " +
                        "only when you deliberately close it."
                ),
                Block.Heading("In order", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Review your inspection notes: was any device taken, inspected, or out of your control?",
                        "For any such device, wipe and reinstall from known-good media, or replace it, before normal use.",
                        "Revoke sessions created during the trip, and change passwords used on untrusted networks, from a clean device.",
                        "Restore only data you trust, and verify your backup before relying on it."
                    )
                ),
                Block.Field(
                    "The trip ends when you close it",
                    "Exposure from a trip does not expire on its own. Sessions " +
                        "stay active, passwords stay used, and devices stay " +
                        "compromised until you deliberately close each one."
                ),
                Block.Para(
                    "After decontamination, review the trip: what worked, what " +
                        "did not, and what will change next time. That review is " +
                        "the beginning of the travel routine in the final brief."
                )
            ),
            outcomes = listOf(
                "Run the return-home decontamination sequence in order.",
                "Wipe or replace any device that was out of your control.",
                "Revoke trip sessions and change passwords used on untrusted networks, from a clean device."
            ),
            howTo = listOf(
                "Review inspection notes from the trip.",
                "Wipe or replace any device taken, inspected, or out of your control.",
                "Revoke trip sessions and change affected passwords from a clean device.",
                "Restore only trusted data, and verify your backup."
            ),
            bestPractices = listOf(
                "Close the trip deliberately; exposure does not expire on its own.",
                "Review the trip afterwards, and record what will change next time."
            ),
            cautions = listOf(
                "Returning to normal use of an inspected device without wiping it invites the trip's exposure home.",
                "Sessions left active after a trip stay active indefinitely."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to returning from travel.")
            )
        ),
        Brief(
            id = "travel-routine",
            title = "Travel Routine: A Reusable Checklist",
            glyph = "\u2713",
            summary = "A single checklist that turns this chapter into a habit — before, during, and after every trip.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "This chapter becomes a habit only as a checklist: one list, " +
                        "used before, during, and after every trip, until it is " +
                        "automatic. Copy it, adapt it to your trips, and use it " +
                        "even for short, low-risk travel — because habits formed " +
                        "on easy trips are the ones that hold on hard ones."
                ),
                Block.Heading("Before, during, after", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Before: threat model written, backup verified, data minimised, destination guidance checked.",
                        "During: networks treated as untrusted, devices locked, meetings chosen carefully, notes kept.",
                        "After: devices decontaminated, sessions revoked, passwords changed where needed, trip reviewed.",
                        "Always: Rule 1, on the move as at home."
                    )
                ),
                Block.Field(
                    "Use it on easy trips",
                    "A checklist used only on hard trips is a checklist you have " +
                        "never practised. Use it on every trip, and it will be " +
                        "there when the trip is hard."
                ),
                Block.Para(
                    "Adapt the checklist to your trips, and keep it with your " +
                        "travel documents — not on the device that might be taken."
                )
            ),
            outcomes = listOf(
                "Use a single before-during-after travel checklist on every trip.",
                "Adapt the checklist to your own trips and keep it accessible.",
                "Practise the routine on easy trips so it holds on hard ones."
            ),
            howTo = listOf(
                "Before a trip: write the threat model, verify the backup, minimise data, check destination guidance.",
                "During a trip: treat networks as untrusted, lock devices, choose meetings carefully, keep notes.",
                "After a trip: decontaminate devices, revoke sessions, change affected passwords, review the trip.",
                "Keep the checklist with your travel documents, not only on a device."
            ),
            bestPractices = listOf(
                "A habit is a checklist used on every trip, not only hard ones.",
                "Review and adapt the checklist after every trip."
            ),
            cautions = listOf(
                "A checklist kept only on a device that might be taken is a checklist you may lose when you need it.",
                "Skipping the after-trip sequence leaves the trip's exposure open."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to travel security.")
            )
        )
    )
)
