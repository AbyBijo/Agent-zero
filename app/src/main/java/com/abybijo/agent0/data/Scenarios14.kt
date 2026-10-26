package com.abybijo.agent0.data

/** v2.0 Phase 4c: drills linked to CH-14 Travel briefs, one per brief. */
object Scenarios14 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "travel-threat-model-drill",
            title = "Two Travellers, Two Plans",
            intro = "Two people travel to the same country: one is a tourist, the other a journalist meeting sources. They are offered the same 'travel security checklist'. You must advise each of them.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you tell them first?",
                    choices = listOf(
                        ScenarioChoice("The same checklist works for both; the country is the same", "bad1"),
                        ScenarioChoice("Their threat models differ: destination is shared, but purpose and adversary are not", "step2"),
                        ScenarioChoice("Only the journalist needs a plan", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What does each plan centre on?",
                    choices = listOf(
                        ScenarioChoice("Tourist: basic device and network hygiene. Journalist: source protection, meeting safety, and clean devices", "good1"),
                        ScenarioChoice("Both: clean devices and nothing else", "bad2"),
                        ScenarioChoice("Tourist: nothing. Journalist: everything", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Each traveller gets a plan matched to purpose and adversary. The tourist travels light and safe; the journalist travels with source protection and meeting discipline. Same country, different plans — because threat models are personal.",
                    outcome = Outcome.GOOD,
                    lesson = "Travel threat models are built from destination, purpose, and adversary — in that order, per traveller."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "One checklist for both either overburdens the tourist or under-protects the journalist. Both failures come from ignoring purpose and adversary.",
                    outcome = Outcome.BAD,
                    lesson = "Destination alone does not make a threat model. Purpose and adversary complete it."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Only planning for the journalist leaves the tourist unprepared for crime, border inspection, and untrusted networks — real risks for any traveller.",
                    outcome = Outcome.BAD,
                    lesson = "Every traveller needs a plan, scaled to their purpose and adversary — not only high-risk travellers."
                )
            ),
            briefKey = "travel/travel-threat-model"
        ),
        Scenario(
            id = "travel-packing-drill",
            title = "What Stays Home",
            intro = "You are packing for a two-week trip. Your laptop holds years of personal files, old messages, and work documents. You are about to pack it as-is, because you might need something.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do before packing?",
                    choices = listOf(
                        ScenarioChoice("Pack it as-is; you might need something", "bad1"),
                        ScenarioChoice("Back up everything, verify the restore, remove what the trip does not require", "step2"),
                        ScenarioChoice("Delete everything and start fresh", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "Where do credentials and recovery information travel?",
                    choices = listOf(
                        ScenarioChoice("On the laptop, with everything else", "bad1"),
                        ScenarioChoice("Separately from the devices they unlock", "good1"),
                        ScenarioChoice("In your email, for easy access", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You travel with only what the trip requires, backed up and verified, credentials separate. If the laptop is lost or inspected, the exposure is limited to trip data — not your life.",
                    outcome = Outcome.GOOD,
                    lesson = "Pack by separation: least data travels, the rest stays home backed up, credentials separate from devices."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Packing everything as-is means a lost or inspected device exposes years of files, messages, and work — all of it, at once.",
                    outcome = Outcome.BAD,
                    lesson = "'Might need it' is not a packing criterion. The trip's requirements are."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Deleting everything, or storing credentials in email, either destroys what you need or puts keys with the locks they open.",
                    outcome = Outcome.BAD,
                    lesson = "Back up first, then minimise — never delete blindly, and never carry credentials with their devices."
                )
            ),
            briefKey = "travel/travel-packing"
        ),
        Scenario(
            id = "travel-border-drill",
            title = "Asked for Your Password",
            intro = "At a border, an official asks for your device password. You have minimised your device's data, and you have decided in advance what you will do — but now, under pressure, you hesitate.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What guides you in this moment?",
                    choices = listOf(
                        ScenarioChoice("The decision you made in advance, and the minimised data on the device", "step2"),
                        ScenarioChoice("Lying, to protect your data", "bad1"),
                        ScenarioChoice("Refusing angrily, to assert your rights", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "After the inspection, whatever happened, what do you do?",
                    choices = listOf(
                        ScenarioChoice("Note what was asked, what was done, and when, for the return-home sequence", "good1"),
                        ScenarioChoice("Forget it; the trip continues", "bad1"),
                        ScenarioChoice("Post about it publicly immediately", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You follow your advance decision, stay calm and compliant, and record everything for the return-home sequence. Preparation carried you through pressure.",
                    outcome = Outcome.GOOD,
                    lesson = "Border preparation is decided in advance, not at the border — and every inspection is recorded for return-home decontamination."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Lying to, or obstructing, border officials creates a separate, often worse, problem — and forgetting the inspection leaves return-home decontamination blind.",
                    outcome = Outcome.BAD,
                    lesson = "Calm compliance beats deception or obstruction, and recording beats forgetting."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Angry refusal, or immediate public posting, escalates the encounter or exposes the inspection's details before you understand them.",
                    outcome = Outcome.BAD,
                    lesson = "Composure and notes first; public discussion, if any, comes later and deliberately."
                )
            ),
            briefKey = "travel/travel-border"
        ),
        Scenario(
            id = "travel-clean-device-drill",
            title = "Clean Enough?",
            intro = "For a high-risk trip, you prepare a clean device. A colleague says it looks 'too clean' and will attract attention, and suggests loading it with plausible personal data instead.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is the colleague's suggestion really proposing?",
                    choices = listOf(
                        ScenarioChoice("A better clean device", "bad1"),
                        ScenarioChoice("Fabricating a false life on the device — which creates new risks and new lies to maintain", "step2"),
                        ScenarioChoice("A standard practice", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What is the sound clean level?",
                    choices = listOf(
                        ScenarioChoice("Proportionate to the trip: only what it requires, with everything else left behind, backed up", "good1"),
                        ScenarioChoice("Completely empty", "bad2"),
                        ScenarioChoice("Loaded with plausible fake personal data", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You travel with a proportionate clean device: trip data only, everything else backed up at home. No fabrications to maintain, and inspection exposes only trip data.",
                    outcome = Outcome.GOOD,
                    lesson = "Clean means proportionate to the trip, not empty and not fabricated. Fabrication creates risks of its own."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "A fabricated device life is a lie that must be maintained under questioning, and its fake data can itself be investigated.",
                    outcome = Outcome.BAD,
                    lesson = "Do not fabricate a device life. Proportionate cleanliness is honest and defensible."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "A completely empty device, or a 'standard' fake life, either attracts the very attention you fear or creates a fabrication to defend.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Clean is a spectrum. Choose the level the trip actually requires."
                )
            ),
            briefKey = "travel/travel-clean-device"
        ),
        Scenario(
            id = "travel-hotels-drill",
            title = "The Room You Do Not Control",
            intro = "You leave your hotel room for dinner, leaving your laptop unlocked on the desk 'because the room is locked'. Housekeeping, maintenance, and previous guests may all have access.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is wrong with leaving the laptop unlocked?",
                    choices = listOf(
                        ScenarioChoice("Nothing; the room is locked", "bad1"),
                        ScenarioChoice("You do not control who has a key, so the room is a shared space, not a private one", "step2"),
                        ScenarioChoice("Only the laptop's value matters", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Lock devices, take sensitive items with you, treat the room network as untrusted, check before checkout", "good1"),
                        ScenarioChoice("Use the room safe for the laptop", "bad2"),
                        ScenarioChoice("Put a 'do not disturb' sign up", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Devices are locked, sensitive items travel with you, the network is treated as untrusted, and checkout checks catch forgotten items. A shared space is handled as a shared space.",
                    outcome = Outcome.GOOD,
                    lesson = "Hotels and rentals are shared spaces. Lock devices, take sensitive items, distrust the network, check before checkout."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "A locked room door, or a do-not-disturb sign, does not control who has a key — and staff access is legitimate, not a breach.",
                    outcome = Outcome.BAD,
                    lesson = "Plan as if someone will enter your room while you are out, because someone may."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "A room safe protects against casual theft, not against staff access, and does nothing for networks or forgotten items.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Safes are one control, not a posture. Lock, carry, distrust, and check."
                )
            ),
            briefKey = "travel/travel-hotels"
        ),
        Scenario(
            id = "travel-networks-drill",
            title = "The Café Wi-Fi",
            intro = "Abroad, you need to do sensitive work. The only network available is an open café Wi-Fi, and your device is set to connect automatically to open networks.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Connect and work; the café seems reputable", "bad1"),
                        ScenarioChoice("Disable automatic connection, use team-provided protections, or delay sensitive work", "step2"),
                        ScenarioChoice("Use a local SIM instead, and trust it fully", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "The work cannot wait. What is the least-bad option?",
                    choices = listOf(
                        ScenarioChoice("Work on the open network with protections on, doing only the minimum the task requires", "good1"),
                        ScenarioChoice("Work without protections, to save time", "bad1"),
                        ScenarioChoice("Ask the café staff if the network is secure", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Automatic connection is off, protections are on, and only the minimum task is done. The network stays untrusted, and your exposure stays minimal.",
                    outcome = Outcome.GOOD,
                    lesson = "Every foreign network is untrusted, including local SIMs. Protections on, every time, and minimum data for the task."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Working unprotected on an open network, or trusting a café's reputation, exposes your traffic to anyone on that network.",
                    outcome = Outcome.BAD,
                    lesson = "Reputation is not a network control. Protections are."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "A local SIM is still untrusted — it operates under local law, including lawful interception — and staff assurances do not verify a network.",
                    outcome = Outcome.BAD,
                    lesson = "Local SIMs are untrusted too. Treat every network abroad the same way."
                )
            ),
            briefKey = "travel/travel-networks"
        ),
        Scenario(
            id = "travel-meetings-drill",
            title = "The Meeting Abroad",
            intro = "While travelling, you must meet a contact in an unfamiliar city. The contact suggests a quiet, private location you cannot assess, and asks you to bring documents about the work.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do about the location?",
                    choices = listOf(
                        ScenarioChoice("Accept it; the contact knows the city", "bad1"),
                        ScenarioChoice("Choose a location you can assess: public, not exposed, with an exit you control", "step2"),
                        ScenarioChoice("Meet in your hotel room, for privacy", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you carry to the meeting?",
                    choices = listOf(
                        ScenarioChoice("Only what the meeting requires, leaving notes and extra devices elsewhere", "good1"),
                        ScenarioChoice("Everything relevant, to be prepared", "bad1"),
                        ScenarioChoice("Nothing, and improvise", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You meet in an assessable public place, carrying only what the meeting requires, and afterwards discuss nothing where you can be overheard. The contact's safety and yours are both protected.",
                    outcome = Outcome.GOOD,
                    lesson = "Meet safely: assessable location, minimum carried, no discussion afterwards where you can be overheard. Protect the contact as carefully as yourself."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "An unassessable private location, or carrying everything relevant, gives an adversary both the opportunity and the material.",
                    outcome = Outcome.BAD,
                    lesson = "Location and carried material are both risk decisions. Assess the first, minimise the second."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "A hotel room meeting, or arriving with nothing, either surrenders control of the space or makes the meeting useless.",
                    outcome = Outcome.BAD,
                    lesson = "Control the space you can control, and carry what the meeting actually requires."
                )
            ),
            briefKey = "travel/travel-meetings"
        ),
        Scenario(
            id = "travel-surveillance-drill",
            title = "The Same Face Twice",
            intro = "While travelling, you notice the same person in two different places, hours apart, and the same vehicle on two different routes. Most of what you have seen today is ordinary life — this is not.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Confront the person and ask why they are following you", "bad1"),
                        ScenarioChoice("Change your plan: enter a public place, change direction, do not go to your hotel or meeting", "step2"),
                        ScenarioChoice("Ignore it; you are probably imagining it", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "From a public place, what next?",
                    choices = listOf(
                        ScenarioChoice("Contact your team or trusted contact, and vary your routes and routines", "good1"),
                        ScenarioChoice("Investigate the follower yourself", "bad1"),
                        ScenarioChoice("Go to your hotel once you feel safe", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You change plan, reach a public place, contact your team, and vary your routines. The exception was noticed, calmly, and acted on — without paranoia and without confrontation.",
                    outcome = Outcome.GOOD,
                    lesson = "Surveillance awareness is calm, specific, and actionable: notice the exception, change plan, reach a public place, contact your team."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Confronting or investigating a suspected follower escalates danger and gives away that you noticed — without improving your safety.",
                    outcome = Outcome.BAD,
                    lesson = "Never confront or investigate a suspected follower yourself. Change plan instead."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Ignoring the exception, or going to your hotel once you feel safe, either dismisses real signal or leads a follower to where you sleep.",
                    outcome = Outcome.BAD,
                    lesson = "Do not dismiss exceptions, and never lead a follower to your hotel, meeting, or home."
                )
            ),
            briefKey = "travel/travel-surveillance"
        ),
        Scenario(
            id = "travel-device-taken-drill",
            title = "Taken at the Checkpoint",
            intro = "At a checkpoint, your device is taken for inspection and returned twenty minutes later. You do not know what was done to it. You need the device for the rest of the trip.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do immediately?",
                    choices = listOf(
                        ScenarioChoice("Resume normal use; it was returned, so it must be fine", "bad1"),
                        ScenarioChoice("Record who, where, when, how long, and what was asked and done, and tell your team or trusted contact", "step2"),
                        ScenarioChoice("Argue with the checkpoint staff about the inspection", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "How do you treat the returned device?",
                    choices = listOf(
                        ScenarioChoice("As untrusted, until the return-home sequence clears it", "good1"),
                        ScenarioChoice("As trusted, since nothing looks changed", "bad1"),
                        ScenarioChoice("As broken, and discard it immediately", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You record everything, tell your team, and treat the device as untrusted: no sensitive work on it until return-home decontamination. The trip continues, safely, on a clean device.",
                    outcome = Outcome.GOOD,
                    lesson = "A device out of your control, for any time, is untrusted until return-home decontamination clears it. Record now, decide later."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Resuming normal use, or trusting a device because nothing looks changed, lets any compromise installed during those twenty minutes work freely.",
                    outcome = Outcome.BAD,
                    lesson = "Looking unchanged proves nothing. Out of your control means untrusted."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Arguing at a checkpoint, or discarding a needed device without a plan, either escalates the encounter or strands you without a device.",
                    outcome = Outcome.BAD,
                    lesson = "Calm compliance and notes at the checkpoint; decontamination afterwards."
                )
            ),
            briefKey = "travel/travel-device-taken"
        ),
        Scenario(
            id = "travel-return-home-drill",
            title = "Home, But Not Clean",
            intro = "You return home from a trip during which a device was inspected and you used untrusted networks throughout. You are tired, and normal life is waiting. Decontamination feels like a chore.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Return to normal use; the trip is over", "bad1"),
                        ScenarioChoice("Run the return-home sequence: review notes, wipe or replace inspected devices, revoke trip sessions, change affected passwords from a clean device", "step2"),
                        ScenarioChoice("Change one password and call it done", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "After decontamination, what closes the trip?",
                    choices = listOf(
                        ScenarioChoice("Restoring only trusted data, verifying the backup, and reviewing what will change next time", "good1"),
                        ScenarioChoice("Restoring everything from the trip backup", "bad1"),
                        ScenarioChoice("Deleting all trip data", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "Devices are decontaminated, sessions revoked, passwords changed from a clean device, trusted data restored and verified, and the trip reviewed. The trip ends because you closed it.",
                    outcome = Outcome.GOOD,
                    lesson = "The trip ends when you close it: decontaminate devices, revoke sessions, change passwords, restore trusted data, review."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Returning to normal use, or restoring everything blindly, brings the trip's exposure home with you — inspected devices, live sessions, and used passwords included.",
                    outcome = Outcome.BAD,
                    lesson = "Exposure does not expire when the trip ends. Only deliberate closure ends it."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Changing one password, or deleting all trip data, either leaves most exposure open or destroys data you need.",
                    outcome = Outcome.BAD,
                    lesson = "Decontamination is a sequence, not a single action. Run it in order."
                )
            ),
            briefKey = "travel/travel-return-home"
        ),
        Scenario(
            id = "travel-routine-drill",
            title = "The Easy Trip",
            intro = "You are taking a short, low-risk trip — a weekend away, familiar place, no sensitive work. You are tempted to skip the travel checklist entirely, since this trip is easy.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Skip the checklist; this trip is easy", "bad1"),
                        ScenarioChoice("Run the same before-during-after checklist, briefly, as practice", "step2"),
                        ScenarioChoice("Run only the before part", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "Why does the easy trip matter?",
                    choices = listOf(
                        ScenarioChoice("Because habits formed on easy trips are the ones that hold on hard ones", "good1"),
                        ScenarioChoice("Because easy trips are actually the riskiest", "bad2"),
                        ScenarioChoice("Because checklists are mandatory", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You run the checklist briefly: threat model, backup, minimised data, untrusted networks, locked devices, return-home closure. The easy trip stays easy, and the habit stays sharp for the hard trip.",
                    outcome = Outcome.GOOD,
                    lesson = "A checklist used only on hard trips is a checklist never practised. Use it on every trip, and it will be there when the trip is hard."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Skipping the checklist on easy trips means the habit does not exist when a hard trip arrives — and hard trips do not announce themselves in advance.",
                    outcome = Outcome.BAD,
                    lesson = "Habits are built on easy days, not hard ones. Skip the easy trip's checklist, and you have no habit."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Running only part of the checklist, or claiming easy trips are riskiest, either leaves the trip unclosed or misleads about why practice matters.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Practice matters because habits need repetition, not because easy trips are dangerous."
                )
            ),
            briefKey = "travel/travel-routine"
        )
    )
}
