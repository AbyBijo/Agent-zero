package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk drills, batch 6b: 22 drills, two more per brief, for CH-03 to CH-04. */
object ScenariosBulk6b {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "bulk-d208", title = "Tailgating, Polite Edition",
            intro = "Someone with a coffee in both hands asks you to hold the door to a restricted area. They smile and thank you.",
            start = "step1", briefKey = "physical/access",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Hold the door; they look legitimate", "bad1"),
                        ScenarioChoice("Politely decline and direct them to the badge reader or reception", "step2"),
                        ScenarioChoice("Hold it but watch them", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why is politeness not a credential?",
                    choices = listOf(
                        ScenarioChoice("It is, usually", "bad1"),
                        ScenarioChoice("Because tailgating exploits courtesy; credentials, not manners, authorise entry", "good1"),
                        ScenarioChoice("Because they had coffee", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You decline politely, direct them to reception, and access control holds.",
                    outcome = Outcome.GOOD, lesson = "Tailgating exploits courtesy. Credentials authorise entry, not manners."),
                "bad1" to ScenarioStep(id = "bad1", text = "You hold the door, and an unauthorised person enters on your credential.",
                    outcome = Outcome.BAD, lesson = "Your credential, your responsibility. Holding the door transfers it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You hold the door but watch, which does not revoke the entry you granted.",
                    outcome = Outcome.BAD, lesson = "Watching after granting entry is not control. Refusal is.")
            )
        ),
        Scenario(
            id = "bulk-d209", title = "Badge Left on Desk",
            intro = "You leave your access badge on your desk overnight, 'inside a locked office'.",
            start = "step1", briefKey = "physical/access",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the risk?",
                    choices = listOf(
                        ScenarioChoice("None; the office is locked", "bad1"),
                        ScenarioChoice("Cleaners, colleagues, and visitors all pass through; a badge left out is a badge borrowed", "step2"),
                        ScenarioChoice("Losing it", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is the habit?",
                    choices = listOf(
                        ScenarioChoice("Hide it in a drawer", "bad1"),
                        ScenarioChoice("Keep it on your person or in a secured store, always", "good1"),
                        ScenarioChoice("Report it only if lost", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You keep the badge on your person, and borrowing becomes impossible.",
                    outcome = Outcome.GOOD, lesson = "Badges stay on the person or in secured storage. Desks are not storage."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust a locked office, and a badge left out is borrowed overnight.",
                    outcome = Outcome.BAD, lesson = "Locked offices have many keyholders. 'Inside' is not 'secured'."),
                "bad2" to ScenarioStep(id = "bad2", text = "You hide it in a drawer, which any office visitor can open.",
                    outcome = Outcome.BAD, lesson = "Drawers are not safes. Hiding is not securing.")
            )
        ),
        Scenario(
            id = "bulk-d210", title = "Whiteboard After the Meeting",
            intro = "After a sensitive meeting, the whiteboard still shows strategy, names, and numbers. The room is booked by another team next.",
            start = "step1", briefKey = "physical/cleandesk",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Leave it; the next team won't care", "bad1"),
                        ScenarioChoice("Erase it before leaving, and check for notes and printouts", "step2"),
                        ScenarioChoice("Photograph it for your records", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why check for printouts too?",
                    choices = listOf(
                        ScenarioChoice("To tidy up", "bad1"),
                        ScenarioChoice("Because sensitive material migrates: boards, notes, printouts, all of it leaks", "good1"),
                        ScenarioChoice("Because it is policy", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You erase the board and clear printouts, leaving nothing for the next team.",
                    outcome = Outcome.GOOD, lesson = "Clean rooms, not just clean desks. Boards and printouts leak too."),
                "bad1" to ScenarioStep(id = "bad1", text = "You leave strategy on the board for the next team to photograph.",
                    outcome = Outcome.BAD, lesson = "A whiteboard is a publication. Erase before leaving."),
                "bad2" to ScenarioStep(id = "bad2", text = "You photograph the board, creating a permanent copy of sensitive material on your phone.",
                    outcome = Outcome.BAD, lesson = "Photographing sensitive boards multiplies exposure. Erase, don't copy.")
            )
        ),
        Scenario(
            id = "bulk-d211", title = "Shred Bin, Overflowing",
            intro = "The shred bin is full, so sensitive printouts sit on top of it, in plain sight, awaiting collection.",
            start = "step1", briefKey = "physical/cleandesk",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the failure?",
                    choices = listOf(
                        ScenarioChoice("The bin's capacity", "bad1"),
                        ScenarioChoice("Sensitive material left unsecured while awaiting destruction", "step2"),
                        ScenarioChoice("Too many printouts", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Wait for collection", "bad1"),
                        ScenarioChoice("Secure the material in a locked cabinet and call for collection now", "good1"),
                        ScenarioChoice("Shred it yourself later", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You secure the material and call for collection, closing the gap.",
                    outcome = Outcome.GOOD, lesson = "Material awaiting destruction must stay secured. A full bin is not an excuse for exposure."),
                "bad1" to ScenarioStep(id = "bad1", text = "You leave sensitive printouts on a full bin, in plain sight, for anyone passing.",
                    outcome = Outcome.BAD, lesson = "'Awaiting shredding' is not 'secured'. Unsecured is unsecured."),
                "bad2" to ScenarioStep(id = "bad2", text = "You promise to shred later, and later never comes.",
                    outcome = Outcome.BAD, lesson = "Later is not a control. Secure now, destroy promptly.")
            )
        ),
        Scenario(
            id = "bulk-d212", title = "Hotel Room, Room Service",
            intro = "Room service knocks while you are out. Your laptop is open on the desk, with sensitive documents visible.",
            start = "step1", briefKey = "physical/travel",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What should have happened before you left?",
                    choices = listOf(
                        ScenarioChoice("Nothing; hotels are safe", "bad1"),
                        ScenarioChoice("Laptop locked or secured, documents closed, valuables in the safe", "step2"),
                        ScenarioChoice("Do Not Disturb sign", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why is a Do Not Disturb sign not enough?",
                    choices = listOf(
                        ScenarioChoice("It is enough", "bad1"),
                        ScenarioChoice("Because staff enter anyway for emergencies, maintenance, and mistakes", "good1"),
                        ScenarioChoice("Because it is rude", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You secure devices and documents before leaving, so any entry finds nothing.",
                    outcome = Outcome.GOOD, lesson = "Hotel rooms are entered by staff regardless of signs. Secure before leaving, always."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust the hotel, and room service sees everything on your desk.",
                    outcome = Outcome.BAD, lesson = "Hotels are semi-public. Staff entry is routine, not exceptional."),
                "bad2" to ScenarioStep(id = "bad2", text = "You rely on a sign, which staff override for emergencies and mistakes.",
                    outcome = Outcome.BAD, lesson = "Signs request, they do not enforce. Securing enforces.")
            )
        ),
        Scenario(
            id = "bulk-d213", title = "Laptop in Checked Luggage",
            intro = "You check your laptop in hold luggage, 'because cabin space is limited'.",
            start = "step1", briefKey = "physical/travel",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the risk?",
                    choices = listOf(
                        ScenarioChoice("Damage only", "bad1"),
                        ScenarioChoice("Theft, tampering, and loss: hold luggage is outside your control for hours", "step2"),
                        ScenarioChoice("Weight limits", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is the rule?",
                    choices = listOf(
                        ScenarioChoice("Check it if convenient", "bad1"),
                        ScenarioChoice("Devices with sensitive data stay in cabin baggage, on your person, always", "good1"),
                        ScenarioChoice("Encrypt and check", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You carry devices in cabin baggage, keeping them under your control.",
                    outcome = Outcome.GOOD, lesson = "Sensitive devices never go in hold luggage. Cabin baggage keeps them under your control."),
                "bad1" to ScenarioStep(id = "bad1", text = "You check the laptop, and it is stolen, tampered with, or lost in transit.",
                    outcome = Outcome.BAD, lesson = "Hold luggage is outside your control for hours. That is the risk."),
                "bad2" to ScenarioStep(id = "bad2", text = "You encrypt and check, but theft and tampering still defeat availability and integrity.",
                    outcome = Outcome.BAD, lesson = "Encryption protects data, not the device. Theft and tampering remain.")
            )
        ),
        Scenario(
            id = "bulk-d214", title = "Camera in the Café",
            intro = "You notice the same person in three different cafés today, always with a newspaper, never ordering.",
            start = "step1", briefKey = "physical/surveillance",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Confront them", "bad1"),
                        ScenarioChoice("Note it, vary your route, and avoid sensitive activity until you understand", "step2"),
                        ScenarioChoice("Ignore it; coincidence", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why not confront?",
                    choices = listOf(
                        ScenarioChoice("Because you are shy", "bad1"),
                        ScenarioChoice("Because confrontation reveals your awareness and escalates without evidence", "good1"),
                        ScenarioChoice("Because it is rude", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You note the pattern, vary your routine, and stay alert without revealing awareness.",
                    outcome = Outcome.GOOD, lesson = "Repeated presence across locations is a pattern, not coincidence. Note it, vary routine, do not confront."),
                "bad1" to ScenarioStep(id = "bad1", text = "You confront a stranger, revealing awareness and escalating without evidence.",
                    outcome = Outcome.BAD, lesson = "Confrontation reveals awareness and escalates. Note and vary instead."),
                "bad2" to ScenarioStep(id = "bad2", text = "You dismiss a repeated pattern as coincidence, and surveillance continues unnoticed.",
                    outcome = Outcome.BAD, lesson = "Three locations is not coincidence. Patterns deserve attention.")
            )
        ),
        Scenario(
            id = "bulk-d215", title = "Drone Over the Garden",
            intro = "A drone hovers over your garden for several minutes, then leaves. You assume it is a neighbour's toy.",
            start = "step1", briefKey = "physical/surveillance",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you consider?",
                    choices = listOf(
                        ScenarioChoice("Only the toy explanation", "bad1"),
                        ScenarioChoice("That drones photograph, record, and map: observe, note, and protect privacy", "step2"),
                        ScenarioChoice("Nothing", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Shoot it down", "bad1"),
                        ScenarioChoice("Note time, direction, and appearance; avoid sensitive outdoor activity; report if it recurs", "good1"),
                        ScenarioChoice("Wave at it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You note details, protect privacy, and report recurrence, without illegal escalation.",
                    outcome = Outcome.GOOD, lesson = "Drones observe. Note, protect, report recurrence — do not escalate illegally."),
                "bad1" to ScenarioStep(id = "bad1", text = "You assume a toy, and a surveillance drone maps your property unnoticed.",
                    outcome = Outcome.BAD, lesson = "Assuming benign intent is not assessment. Drones observe regardless of intent."),
                "bad2" to ScenarioStep(id = "bad2", text = "You shoot it down, breaking the law and creating a confrontation.",
                    outcome = Outcome.BAD, lesson = "Illegal escalation creates legal risk without removing the observation.")
            )
        ),
        Scenario(
            id = "bulk-d216", title = "USB Drive Found",
            intro = "You find a USB drive in the office car park, labelled 'Q3 Bonuses'.",
            start = "step1", briefKey = "physical/assets",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Plug it in to see whose it is", "bad1"),
                        ScenarioChoice("Hand it to security without plugging it in", "step2"),
                        ScenarioChoice("Keep it", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why not plug it in?",
                    choices = listOf(
                        ScenarioChoice("Because it might be empty", "bad1"),
                        ScenarioChoice("Because found media is a classic attack vector: it can auto-run malware", "good1"),
                        ScenarioChoice("Because it is not yours", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You hand the drive to security unplugged, and a planted device is neutralised.",
                    outcome = Outcome.GOOD, lesson = "Found media is an attack vector. Never plug in unknown devices; hand them to security."),
                "bad1" to ScenarioStep(id = "bad1", text = "You plug it in, and malware runs on your machine.",
                    outcome = Outcome.BAD, lesson = "Curiosity is the attack vector's trigger. Found media is never safe to test."),
                "bad2" to ScenarioStep(id = "bad2", text = "You keep the drive, and its malware or tracking travels with you.",
                    outcome = Outcome.BAD, lesson = "Keeping found media keeps its risk. Hand it to security.")
            )
        ),
        Scenario(
            id = "bulk-d217", title = "Old Phone, Sold",
            intro = "You sell your old phone after a factory reset, confident the data is gone.",
            start = "step1", briefKey = "physical/assets",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "Is a factory reset enough?",
                    choices = listOf(
                        ScenarioChoice("Yes, always", "bad1"),
                        ScenarioChoice("Usually on modern encrypted devices, but verify encryption and remove accounts first", "step2"),
                        ScenarioChoice("No, never", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do before selling?",
                    choices = listOf(
                        ScenarioChoice("Reset and sell", "bad1"),
                        ScenarioChoice("Remove accounts, verify encryption, reset, and confirm the device boots clean", "good1"),
                        ScenarioChoice("Sell it as-is", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You remove accounts, verify encryption, reset, and confirm a clean boot before selling.",
                    outcome = Outcome.GOOD, lesson = "Disposal needs verification: accounts removed, encryption confirmed, reset, clean boot."),
                "bad1" to ScenarioStep(id = "bad1", text = "You reset without removing accounts, and activation lock or residual data causes problems.",
                    outcome = Outcome.BAD, lesson = "Reset alone is not disposal. Accounts and encryption must be handled first."),
                "bad2" to ScenarioStep(id = "bad2", text = "You sell as-is, handing your data to a stranger.",
                    outcome = Outcome.BAD, lesson = "Selling as-is is giving away your data. Disposal is a process, not a reset button.")
            )
        ),
        Scenario(
            id = "bulk-d218", title = "Home Office, Visible Screen",
            intro = "Your home office faces a window. Passers-by and neighbours can read your screen.",
            start = "step1", briefKey = "physical/home-base",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the exposure?",
                    choices = listOf(
                        ScenarioChoice("None; home is private", "bad1"),
                        ScenarioChoice("Visual exposure through windows: screens are readable from outside", "step2"),
                        ScenarioChoice("Only at night", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Close the curtains at night", "bad1"),
                        ScenarioChoice("Reposition the desk, use a privacy filter, and close curtains during sensitive work", "good1"),
                        ScenarioChoice("Work elsewhere", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You reposition, filter, and curtain, closing the visual channel.",
                    outcome = Outcome.GOOD, lesson = "Windows are visual channels. Position, filter, and curtain during sensitive work."),
                "bad1" to ScenarioStep(id = "bad1", text = "You assume home is private, while neighbours read your screen daily.",
                    outcome = Outcome.BAD, lesson = "Home is not private to windows. Screens face outward are screens published."),
                "bad2" to ScenarioStep(id = "bad2", text = "You curtain only at night, while daytime screens stay readable.",
                    outcome = Outcome.BAD, lesson = "Daylight screens are readable too. Curtain during sensitive work, day and night.")
            )
        ),
        Scenario(
            id = "bulk-d219", title = "Smart Speaker, Always Listening",
            intro = "A smart speaker sits in your home office, always listening for its wake word — and recording snippets.",
            start = "step1", briefKey = "physical/home-base",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the risk?",
                    choices = listOf(
                        ScenarioChoice("None; it only listens for the wake word", "bad1"),
                        ScenarioChoice("Always-on microphones in sensitive spaces: false triggers, recordings, and cloud storage", "step2"),
                        ScenarioChoice("Only if hacked", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Keep it; it is convenient", "bad1"),
                        ScenarioChoice("Remove always-on microphones from sensitive spaces, or mute them during sensitive work", "good1"),
                        ScenarioChoice("Lower the volume", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You remove or mute always-on microphones in sensitive spaces.",
                    outcome = Outcome.GOOD, lesson = "Always-on microphones do not belong in sensitive spaces. Remove or mute them."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep a listening device in your office, and sensitive talk is recorded.",
                    outcome = Outcome.BAD, lesson = "Convenience microphones are surveillance microphones. Sensitive spaces exclude them."),
                "bad2" to ScenarioStep(id = "bad2", text = "You lower the volume, which changes nothing about recording.",
                    outcome = Outcome.BAD, lesson = "Volume is not muting. Recording continues regardless of loudness.")
            )
        ),
        Scenario(
            id = "bulk-d220", title = "Pretext Call, Helpful Colleague",
            intro = "A caller claims to be from IT, needs your login 'to fix a problem', and knows your manager's name.",
            start = "step1", briefKey = "human/vectors",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Give the login; they know your manager", "bad1"),
                        ScenarioChoice("Refuse, hang up, and verify through IT's known channel", "step2"),
                        ScenarioChoice("Give a temporary password", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why is knowing your manager's name not verification?",
                    choices = listOf(
                        ScenarioChoice("It is verification", "bad1"),
                        ScenarioChoice("Because public and social sources reveal managers' names; real verification uses a separate, known channel", "good1"),
                        ScenarioChoice("Because managers change", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You refuse, verify separately, and report the pretext attempt.",
                    outcome = Outcome.GOOD, lesson = "Pretext uses public details to feel verified. Verify through a separate, known channel."),
                "bad1" to ScenarioStep(id = "bad1", text = "You give your login to a pretext caller, and your account is compromised.",
                    outcome = Outcome.BAD, lesson = "Knowing a manager's name is not identity. It is public information."),
                "bad2" to ScenarioStep(id = "bad2", text = "You give a temporary password, which is still access.",
                    outcome = Outcome.BAD, lesson = "Temporary access is access. Never give credentials to unverified callers.")
            )
        ),
        Scenario(
            id = "bulk-d221", title = "Survey, Free Gift",
            intro = "A survey offers a free gift for answering personal questions: routines, workplace, travel plans.",
            start = "step1", briefKey = "human/vectors",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the survey?",
                    choices = listOf(
                        ScenarioChoice("A harmless survey", "bad1"),
                        ScenarioChoice("Elicitation: personal data collected under a gift pretext", "step2"),
                        ScenarioChoice("Market research", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Answer; the gift is free", "bad1"),
                        ScenarioChoice("Decline, and consider what the questions were really collecting", "good1"),
                        ScenarioChoice("Answer partially", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You decline and note the elicitation pattern for future reference.",
                    outcome = Outcome.GOOD, lesson = "Free-gift surveys are elicitation. Personal routines and plans are the real price."),
                "bad1" to ScenarioStep(id = "bad1", text = "You answer for a gift, handing routines and plans to an unknown collector.",
                    outcome = Outcome.BAD, lesson = "Free gifts are the cheapest way to buy personal data."),
                "bad2" to ScenarioStep(id = "bad2", text = "You answer partially, still handing over usable personal data.",
                    outcome = Outcome.BAD, lesson = "Partial disclosure is still disclosure. Elicitation works in parts.")
            )
        ),
        Scenario(
            id = "bulk-d222", title = "Too Good to Be True",
            intro = "A job offer promises double your salary, remote work, and no interview — just a 'processing fee'.",
            start = "step1", briefKey = "human/redflags",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the red flag?",
                    choices = listOf(
                        ScenarioChoice("None; great offers exist", "bad1"),
                        ScenarioChoice("Urgency, no interview, and a fee: the classic advance-fee pattern", "step2"),
                        ScenarioChoice("Remote work", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Pay the fee; the salary covers it", "bad1"),
                        ScenarioChoice("Stop, verify the employer independently, and report the offer", "good1"),
                        ScenarioChoice("Negotiate the fee", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You stop, verify independently, and report the advance-fee scam.",
                    outcome = Outcome.GOOD, lesson = "No interview plus a fee is an advance-fee scam, whatever the promised salary."),
                "bad1" to ScenarioStep(id = "bad1", text = "You pay the fee, and the 'employer' disappears with it.",
                    outcome = Outcome.BAD, lesson = "Fees for jobs are scams. Legitimate employers do not charge to hire you."),
                "bad2" to ScenarioStep(id = "bad2", text = "You negotiate the fee, treating a scam as a legitimate offer.",
                    outcome = Outcome.BAD, lesson = "Negotiating a scam legitimises it. Stop and verify instead.")
            )
        ),
        Scenario(
            id = "bulk-d223", title = "Pressure to Decide Now",
            intro = "A caller pressures you to decide now: 'This offer expires in ten minutes, and you will lose everything.'",
            start = "step1", briefKey = "human/redflags",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the pressure?",
                    choices = listOf(
                        ScenarioChoice("Normal sales urgency", "bad1"),
                        ScenarioChoice("Artificial urgency: a manipulation technique to bypass your judgement", "step2"),
                        ScenarioChoice("A real deadline", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What defeats artificial urgency?",
                    choices = listOf(
                        ScenarioChoice("Deciding faster", "bad1"),
                        ScenarioChoice("Pausing, hanging up, and deciding on your own timeline", "good1"),
                        ScenarioChoice("Asking for more time", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You pause, hang up, and decide on your own timeline — and the 'expiring' offer is still there later.",
                    outcome = Outcome.GOOD, lesson = "Artificial urgency bypasses judgement. Pausing restores it. Real deadlines survive a pause."),
                "bad1" to ScenarioStep(id = "bad1", text = "You decide under pressure, and the rushed decision is the wrong one.",
                    outcome = Outcome.BAD, lesson = "Pressure is a technique, not a deadline. Rushed decisions are manipulated decisions."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ask the manipulator for more time, keeping them in control of the timeline.",
                    outcome = Outcome.BAD, lesson = "Do not negotiate timelines with manipulators. Hang up and decide yourself.")
            )
        ),
        Scenario(
            id = "bulk-d224", title = "Verify the Verifier",
            intro = "Someone calls claiming to verify your identity, and asks for your full date of birth and mother's maiden name 'for security'.",
            start = "step1", briefKey = "human/verification",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is wrong?",
                    choices = listOf(
                        ScenarioChoice("Nothing; verification is normal", "bad1"),
                        ScenarioChoice("An unverified caller demanding identifiers is the attack, not the verification", "step2"),
                        ScenarioChoice("The questions are outdated", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you verify a verifier?",
                    choices = listOf(
                        ScenarioChoice("Answer and see if they accept", "bad1"),
                        ScenarioChoice("Hang up, call the organisation on its published number, and ask if they contacted you", "good1"),
                        ScenarioChoice("Ask for their employee ID", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You hang up, call the published number, and learn no verification was requested.",
                    outcome = Outcome.GOOD, lesson = "Verify verifiers through published channels. An unverified caller demanding identifiers is the attack."),
                "bad1" to ScenarioStep(id = "bad1", text = "You give identifiers to a caller who then impersonates you.",
                    outcome = Outcome.BAD, lesson = "Identifiers given to attackers become impersonation. Never verify to an unverified caller."),
                "bad2" to ScenarioStep(id = "bad2", text = "You accept an employee ID, which attackers can invent.",
                    outcome = Outcome.BAD, lesson = "Employee IDs are claims, not verification. Published channels verify.")
            )
        ),
        Scenario(
            id = "bulk-d225", title = "Callback to a Number They Gave",
            intro = "A caller gives you a number to call back 'to verify'. You call it, and they confirm themselves.",
            start = "step1", briefKey = "human/verification",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the trick?",
                    choices = listOf(
                        ScenarioChoice("None; you verified", "bad1"),
                        ScenarioChoice("Callback to an attacker-supplied number verifies the attacker, not the organisation", "step2"),
                        ScenarioChoice("The call quality", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is a real callback?",
                    choices = listOf(
                        ScenarioChoice("Any number they give", "bad1"),
                        ScenarioChoice("A number you find independently: published, official, or on your card", "good1"),
                        ScenarioChoice("A number from search results", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You call the independently found number and expose the impersonation.",
                    outcome = Outcome.GOOD, lesson = "Callbacks must use independently found numbers. Attacker-supplied numbers verify attackers."),
                "bad1" to ScenarioStep(id = "bad1", text = "You call their number, and they confirm themselves as the organisation.",
                    outcome = Outcome.BAD, lesson = "Calling an attacker-supplied number is asking the attacker to vouch for themselves."),
                "bad2" to ScenarioStep(id = "bad2", text = "You trust a search result number, which attackers can plant via ads and spoofed listings.",
                    outcome = Outcome.BAD, lesson = "Search results can be planted. Use published numbers from official sources you already trust.")
            )
        ),
        Scenario(
            id = "bulk-d226", title = "Flattery Opens Doors",
            intro = "A stranger flatters your expertise, asks for your opinion on a sensitive project, and listens intently.",
            start = "step1", briefKey = "human/influence",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is happening?",
                    choices = listOf(
                        ScenarioChoice("A genuine compliment", "bad1"),
                        ScenarioChoice("Influence: flattery lowering your guard to elicit sensitive opinion", "step2"),
                        ScenarioChoice("Networking", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you respond?",
                    choices = listOf(
                        ScenarioChoice("Share your opinion; they appreciate it", "bad1"),
                        ScenarioChoice("Enjoy the compliment, share only what is public, and note the elicitation", "good1"),
                        ScenarioChoice("Insult them", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You accept the compliment, share only public material, and note the pattern.",
                    outcome = Outcome.GOOD, lesson = "Flattery is an influence technique. Enjoy it, but share only what is public."),
                "bad1" to ScenarioStep(id = "bad1", text = "You share sensitive opinion under flattery, and it travels further than you intended.",
                    outcome = Outcome.BAD, lesson = "Flattered disclosure is still disclosure. Opinions on sensitive work are sensitive."),
                "bad2" to ScenarioStep(id = "bad2", text = "You insult a stranger, creating conflict without addressing the elicitation.",
                    outcome = Outcome.BAD, lesson = "Hostility is not a countermeasure. Boundaries are.")
            )
        ),
        Scenario(
            id = "bulk-d227", title = "Reciprocity Trap",
            intro = "Someone does you a large favour, then asks for a small one: 'just a quick look at that document'.",
            start = "step1", briefKey = "human/influence",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the technique?",
                    choices = listOf(
                        ScenarioChoice("Kindness", "bad1"),
                        ScenarioChoice("Reciprocity: a favour creating an obligation to repay, exploited for access", "step2"),
                        ScenarioChoice("Friendship", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you handle it?",
                    choices = listOf(
                        ScenarioChoice("Repay by showing the document", "bad1"),
                        ScenarioChoice("Thank them, and judge the request on its own merits: need-to-know, not obligation", "good1"),
                        ScenarioChoice("Refuse all future favours", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You thank them and judge the request by need-to-know, not by obligation.",
                    outcome = Outcome.GOOD, lesson = "Reciprocity creates obligation, but obligation does not override need-to-know. Judge requests on merits."),
                "bad1" to ScenarioStep(id = "bad1", text = "You repay with document access, and a favour becomes a breach.",
                    outcome = Outcome.BAD, lesson = "Favour-for-access is the reciprocity trap. Access is judged by need-to-know, not gratitude."),
                "bad2" to ScenarioStep(id = "bad2", text = "You refuse all future favours, destroying normal social exchange.",
                    outcome = Outcome.BAD, lesson = "Total refusal is not a countermeasure. Judging requests on merits is.")
            )
        ),
        Scenario(
            id = "bulk-d228", title = "New Friend, Fast Intimacy",
            intro = "A new acquaintance shares deep personal stories quickly, and asks for yours in return.",
            start = "step1", briefKey = "human/verifying-strangers",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is fast intimacy?",
                    choices = listOf(
                        ScenarioChoice("Genuine connection", "bad1"),
                        ScenarioChoice("A technique: accelerated trust-building to elicit personal disclosure", "step2"),
                        ScenarioChoice("Openness", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you respond?",
                    choices = listOf(
                        ScenarioChoice("Match their openness", "bad1"),
                        ScenarioChoice("Be warm but measured: let trust build over time and verified behaviour, not stories", "good1"),
                        ScenarioChoice("Become cold and distant", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You stay warm but measured, and trust builds on time and behaviour, not stories.",
                    outcome = Outcome.GOOD, lesson = "Fast intimacy is a technique. Trust builds over time and verified behaviour."),
                "bad1" to ScenarioStep(id = "bad1", text = "You match their openness, disclosing personal details to a stranger.",
                    outcome = Outcome.BAD, lesson = "Matched openness to a stranger is disclosure without verification."),
                "bad2" to ScenarioStep(id = "bad2", text = "You become cold, destroying a potentially genuine connection.",
                    outcome = Outcome.BAD, lesson = "Coldness is not verification. Measured warmth with time is.")
            )
        ),
        Scenario(
            id = "bulk-d229", title = "Stranger Knows Your Details",
            intro = "A stranger greets you by name, mentions your workplace, and claims you met at a conference.",
            start = "step1", briefKey = "human/verifying-strangers",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What might this be?",
                    choices = listOf(
                        ScenarioChoice("A genuine meeting you forgot", "bad1"),
                        ScenarioChoice("Social engineering: public details used to fabricate familiarity", "step2"),
                        ScenarioChoice("A coincidence", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you verify?",
                    choices = listOf(
                        ScenarioChoice("Play along to avoid embarrassment", "bad1"),
                        ScenarioChoice("Ask specific, non-public details, and verify through independent channels before trusting", "good1"),
                        ScenarioChoice("Accuse them", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You ask specific questions and verify independently, exposing the fabrication.",
                    outcome = Outcome.GOOD, lesson = "Public details fabricate familiarity. Verify strangers through specifics and independent channels."),
                "bad1" to ScenarioStep(id = "bad1", text = "You play along to avoid embarrassment, and a stranger gains your trust.",
                    outcome = Outcome.BAD, lesson = "Embarrassment avoidance is an attacker's ally. Verify, even awkwardly."),
                "bad2" to ScenarioStep(id = "bad2", text = "You accuse a possibly genuine person, creating conflict without verification.",
                    outcome = Outcome.BAD, lesson = "Accusation is not verification. Specific questions are.")
            )
        )
    )
}
