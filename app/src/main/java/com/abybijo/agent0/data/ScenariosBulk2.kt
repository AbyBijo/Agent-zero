package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk drills, batch 2: 32 drills, two per brief, for CH-03 to CH-05. */
object ScenariosBulk2 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "bulk-d037", title = "Tailgater at the Door",
            intro = "You badge into a secured office. A stranger with a coffee walks close behind you, expecting you to hold the door.",
            start = "step1", briefKey = "physical/access",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Hold the door politely", "bad1"),
                        ScenarioChoice("Let the door close, and ask them to badge in or check with reception", "step2"),
                        ScenarioChoice("Walk through quickly and hope", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "They say they forgot their badge. What then?",
                    choices = listOf(
                        ScenarioChoice("Let them in; it happens", "bad1"),
                        ScenarioChoice("Direct them to reception to be verified and signed in", "good1"),
                        ScenarioChoice("Follow them to see where they go", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You direct them to reception, where they are verified and signed in properly.",
                    outcome = Outcome.GOOD, lesson = "Politeness is not access control. A polite challenge protects everyone inside."),
                "bad1" to ScenarioStep(id = "bad1", text = "You hold the door, and an unverified stranger enters a secured space.",
                    outcome = Outcome.BAD, lesson = "Tailgating bypasses every lock, badge, and alarm by exploiting politeness."),
                "bad2" to ScenarioStep(id = "bad2", text = "You hope the problem resolves itself, and it does not.",
                    outcome = Outcome.BAD, lesson = "Hoping is not a control. Challenge, or alert security.")
            )
        ),
        Scenario(
            id = "bulk-d038", title = "The Badge You Kept",
            intro = "You leave a role, but keep the access badge 'as a souvenir'. A month later you realise it may still work.",
            start = "step1", briefKey = "physical/access",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Keep it; you will not use it", "bad1"),
                        ScenarioChoice("Return it and confirm access is revoked", "step2"),
                        ScenarioChoice("Throw it away", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why confirm revocation, not just return the badge?",
                    choices = listOf(
                        ScenarioChoice("Because badges are expensive", "bad1"),
                        ScenarioChoice("Because access lives in the system, not the plastic; returning the badge alone may leave access live", "good1"),
                        ScenarioChoice("Because it is polite", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You return the badge and confirm the system access is revoked.",
                    outcome = Outcome.GOOD, lesson = "Access lives in systems, not plastic. Return the badge and confirm revocation."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep a live badge, and it works — for you, or for anyone who finds it.",
                    outcome = Outcome.BAD, lesson = "A kept badge is an open door, whether or not you use it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You throw the badge away, but the system access stays live.",
                    outcome = Outcome.BAD, lesson = "Destroying the token does not revoke the access.")
            )
        ),
        Scenario(
            id = "bulk-d039", title = "Papers on the Desk",
            intro = "You leave sensitive papers on your desk overnight. Cleaners, visitors, and early colleagues all pass through.",
            start = "step1", briefKey = "physical/cleandesk",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What should have happened?",
                    choices = listOf(
                        ScenarioChoice("Nothing; the office is trusted", "bad1"),
                        ScenarioChoice("Papers locked away, or shredded if no longer needed", "step2"),
                        ScenarioChoice("Papers turned face down", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is the clean-desk rule really protecting?",
                    choices = listOf(
                        ScenarioChoice("Tidiness", "bad1"),
                        ScenarioChoice("Sensitive material from anyone who passes: visitors, cleaners, colleagues", "good1"),
                        ScenarioChoice("Productivity", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You lock papers away and shred what you no longer need.",
                    outcome = Outcome.GOOD, lesson = "Lock what you keep, shred what you don't. A desk is a display, not storage."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust the office, and sensitive papers sit visible all night.",
                    outcome = Outcome.BAD, lesson = "Trusting a space is not securing it. Many legitimate people pass through."),
                "bad2" to ScenarioStep(id = "bad2", text = "You turn papers face down, which hides nothing from anyone who picks them up.",
                    outcome = Outcome.BAD, lesson = "Face down is not locked away. It is still there.")
            )
        ),
        Scenario(
            id = "bulk-d040", title = "The Old Device Drawer",
            intro = "You find an old phone in a drawer, still logged into accounts, with years of photos and messages.",
            start = "step1", briefKey = "physical/cleandesk",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do before disposing of it?",
                    choices = listOf(
                        ScenarioChoice("Delete files normally and give it away", "bad1"),
                        ScenarioChoice("Sign out, securely wipe it, and verify the wipe", "step2"),
                        ScenarioChoice("Remove the battery", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why verify the wipe?",
                    choices = listOf(
                        ScenarioChoice("Because wiping is slow", "bad1"),
                        ScenarioChoice("Because normal deletion does not remove data, and a failed wipe leaves it recoverable", "good1"),
                        ScenarioChoice("Because it is good practice", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You sign out, wipe securely, verify, and only then dispose of the device.",
                    outcome = Outcome.GOOD, lesson = "Normal deletion does not remove data. Secure wiping, verified, does."),
                "bad1" to ScenarioStep(id = "bad1", text = "You delete files normally and give the phone away, with data recoverable.",
                    outcome = Outcome.BAD, lesson = "Deleted files are recoverable. 'Deleted' is not 'gone'."),
                "bad2" to ScenarioStep(id = "bad2", text = "You remove the battery and give the phone away, storage intact.",
                    outcome = Outcome.BAD, lesson = "A battery is not storage. The data is on the storage, not the battery.")
            )
        ),
        Scenario(
            id = "bulk-d041", title = "Hotel Room, Open Door",
            intro = "You leave your laptop in a hotel room, unlocked, while you go to dinner. Housekeeping has a master key.",
            start = "step1", briefKey = "physical/travel",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What was wrong?",
                    choices = listOf(
                        ScenarioChoice("Nothing; the room was locked", "bad1"),
                        ScenarioChoice("A hotel room is a shared space: staff and previous guests may have access", "step2"),
                        ScenarioChoice("You went to dinner", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Hide the laptop under the bed", "bad1"),
                        ScenarioChoice("Lock the device, take sensitive items with you, and use the room safe or carry valuables", "good1"),
                        ScenarioChoice("Turn the laptop off", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You lock devices and carry sensitive items, treating the room as shared.",
                    outcome = Outcome.GOOD, lesson = "A hotel room is shared space. Lock devices and carry what matters."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust a locked hotel room, and housekeeping access makes that trust misplaced.",
                    outcome = Outcome.BAD, lesson = "A room lock controls guests, not staff or previous key holders."),
                "bad2" to ScenarioStep(id = "bad2", text = "You hide the laptop, which any search finds in seconds.",
                    outcome = Outcome.BAD, lesson = "Hiding is not securing. Locks and custody are.")
            )
        ),
        Scenario(
            id = "bulk-d042", title = "Border, Device in Hand",
            intro = "At a border, an officer asks to inspect your phone. You have not prepared for this.",
            start = "step1", briefKey = "physical/travel",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What should you have done before travel?",
                    choices = listOf(
                        ScenarioChoice("Charged the phone", "bad1"),
                        ScenarioChoice("Minimised its data, backed up the rest, and decided in advance what to do if inspected", "step2"),
                        ScenarioChoice("Turned off Wi-Fi", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "In the moment, what do you do?",
                    choices = listOf(
                        ScenarioChoice("Panic and argue", "bad1"),
                        ScenarioChoice("Stay calm, follow your advance plan, and note what happens", "good1"),
                        ScenarioChoice("Hand over all passwords immediately", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You follow your advance plan calmly, with minimised data and a backup at home.",
                    outcome = Outcome.GOOD, lesson = "Border preparation is done before travel: minimise, back up, decide in advance."),
                "bad1" to ScenarioStep(id = "bad1", text = "You arrive unprepared, with your whole life on the device, and improvise under pressure.",
                    outcome = Outcome.BAD, lesson = "Deciding under pressure at a border is unreliable. Prepare in advance."),
                "bad2" to ScenarioStep(id = "bad2", text = "You surrender everything immediately, without any plan or record.",
                    outcome = Outcome.BAD, lesson = "An advance plan is what stands between you and panic compliance.")
            )
        ),
        Scenario(
            id = "bulk-d043", title = "Same Car, Three Days",
            intro = "For three days, the same car appears behind you on different routes at different times. You are not sure.",
            start = "step1", briefKey = "physical/surveillance",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Go home and check", "bad1"),
                        ScenarioChoice("Stay calm, vary your route, and note specifics: car, plate, times, places", "step2"),
                        ScenarioChoice("Confront the driver", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "The car appears again. What then?",
                    choices = listOf(
                        ScenarioChoice("Drive to your meeting", "bad1"),
                        ScenarioChoice("Go to a public place and contact a trusted person", "good1"),
                        ScenarioChoice("Speed away", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You go public, contact a trusted person, and keep specific notes.",
                    outcome = Outcome.GOOD, lesson = "Calm, specific, public: vary routes, note specifics, go public, contact help."),
                "bad1" to ScenarioStep(id = "bad1", text = "You lead a possible follower to your home, confirming your address.",
                    outcome = Outcome.BAD, lesson = "Never lead a follower to a sensitive location."),
                "bad2" to ScenarioStep(id = "bad2", text = "You confront a possible follower, escalating an uncertain situation.",
                    outcome = Outcome.BAD, lesson = "Confrontation turns uncertainty into conflict. Go public instead.")
            )
        ),
        Scenario(
            id = "bulk-d044", title = "Vague Feeling, No Notes",
            intro = "You feel watched for a week, but you wrote nothing down. Now you cannot say when, where, or by whom.",
            start = "step1", briefKey = "physical/surveillance",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the problem?",
                    choices = listOf(
                        ScenarioChoice("You imagined it", "bad1"),
                        ScenarioChoice("Without specific, dated notes, a pattern cannot be recognised or acted on", "step2"),
                        ScenarioChoice("You did not tell anyone", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you start doing?",
                    choices = listOf(
                        ScenarioChoice("Posting about it publicly", "bad1"),
                        ScenarioChoice("Recording specifics privately: who, what, where, when, what was unusual", "good1"),
                        ScenarioChoice("Ignoring it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You start specific, dated, private notes, and patterns begin to emerge.",
                    outcome = Outcome.GOOD, lesson = "Specific, factual notes are useful. Feelings and impressions are not evidence."),
                "bad1" to ScenarioStep(id = "bad1", text = "You dismiss a real pattern because you cannot evidence it.",
                    outcome = Outcome.BAD, lesson = "Without notes, real patterns look like imagination."),
                "bad2" to ScenarioStep(id = "bad2", text = "You post publicly, alerting any watcher and exposing yourself further.",
                    outcome = Outcome.BAD, lesson = "Public posts about surveillance help the watcher, not you.")
            )
        ),
        Scenario(
            id = "bulk-d045", title = "Labelled Keys",
            intro = "Your keyring has a label on every key: 'Office', 'Server room', 'Safe'. You drop it in a public place.",
            start = "step1", briefKey = "physical/assets",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the risk?",
                    choices = listOf(
                        ScenarioChoice("Losing the keys", "bad1"),
                        ScenarioChoice("A finder knows exactly what each key opens", "step2"),
                        ScenarioChoice("Embarrassment", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Use a bigger keyring", "bad1"),
                        ScenarioChoice("Keep keys unlabelled, separate, and accounted for", "good1"),
                        ScenarioChoice("Label them in code only you know", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You remove labels, separate keys, and keep an inventory of what you hold.",
                    outcome = Outcome.GOOD, lesson = "Labelled keys tell a finder what they open. Keep keys unlabelled, separate, counted."),
                "bad1" to ScenarioStep(id = "bad1", text = "You focus on the loss, not on what the labels reveal to a finder.",
                    outcome = Outcome.BAD, lesson = "Loss plus labels equals access. The labels are the bigger problem."),
                "bad2" to ScenarioStep(id = "bad2", text = "You code the labels, but any code you can remember, a finder can guess or crack.",
                    outcome = Outcome.BAD, lesson = "Coded labels are still labels. Unlabelled is the standard.")
            )
        ),
        Scenario(
            id = "bulk-d046", title = "The Missing Inventory",
            intro = "An asset goes missing — a drive, a document, a key — and you cannot say when you last saw it, because you keep no inventory.",
            start = "step1", briefKey = "physical/assets",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the problem?",
                    choices = listOf(
                        ScenarioChoice("The missing item", "bad1"),
                        ScenarioChoice("Without an inventory, you cannot know what is missing, when, or who had access", "step2"),
                        ScenarioChoice("Bad luck", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you start?",
                    choices = listOf(
                        ScenarioChoice("Buying replacements", "bad1"),
                        ScenarioChoice("An inventory: what you have, where it is, and who can access it", "good1"),
                        ScenarioChoice("Locking everything", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You start an inventory, and future losses become detectable and traceable.",
                    outcome = Outcome.GOOD, lesson = "You cannot protect what you cannot account for. Inventory is the foundation."),
                "bad1" to ScenarioStep(id = "bad1", text = "You replace the item without knowing how it was lost, and it happens again.",
                    outcome = Outcome.BAD, lesson = "Replacing without understanding repeats the loss."),
                "bad2" to ScenarioStep(id = "bad2", text = "You lock everything without knowing what you have, which is security theatre.",
                    outcome = Outcome.BAD, lesson = "Locks without inventory protect unknown things in unknown ways.")
            )
        ),
        Scenario(
            id = "bulk-d047", title = "New Home, Old Keys",
            intro = "You move into a new home. The previous occupants, their cleaners, and their friends may all hold keys.",
            start = "step1", briefKey = "physical/home-base",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Unpack", "bad1"),
                        ScenarioChoice("Change the locks, and check who else could have access", "step2"),
                        ScenarioChoice("Meet the neighbours", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What else do you check?",
                    choices = listOf(
                        ScenarioChoice("The décor", "bad1"),
                        ScenarioChoice("Visibility from outside, and which windows and doors are observable or accessible", "good1"),
                        ScenarioChoice("The Wi-Fi speed", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You change locks and check visibility, making the home yours in fact, not just on paper.",
                    outcome = Outcome.GOOD, lesson = "A new home inherits its previous occupants' access. Change locks, check visibility."),
                "bad1" to ScenarioStep(id = "bad1", text = "You unpack in a home whose keys are held by strangers.",
                    outcome = Outcome.BAD, lesson = "Moving in without changing locks means moving in with the previous occupants' access."),
                "bad2" to ScenarioStep(id = "bad2", text = "You meet neighbours before securing the home, and your address and routine spread.",
                    outcome = Outcome.BAD, lesson = "Security first, socialising second. A new home's exposure starts on day one.")
            )
        ),
        Scenario(
            id = "bulk-d048", title = "Mail Piling Up",
            intro = "You travel for two weeks. Mail piles up visibly at your home, signalling absence.",
            start = "step1", briefKey = "physical/home-base",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What does piled mail signal?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Absence, and a home worth targeting", "step2"),
                        ScenarioChoice("Popularity", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you arrange before travel?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Mail held, collected by a trusted person, or diverted, plus lights and presence cues", "good1"),
                        ScenarioChoice("A 'do not disturb' sign", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You arrange mail handling and presence cues, so absence is not advertised.",
                    outcome = Outcome.GOOD, lesson = "Mail, lights, and routines signal absence. Manage them before travel."),
                "bad1" to ScenarioStep(id = "bad1", text = "You leave mail to pile up, advertising an empty home for two weeks.",
                    outcome = Outcome.BAD, lesson = "Visible absence invites targeting. Mail is the most obvious signal."),
                "bad2" to ScenarioStep(id = "bad2", text = "You post a sign announcing absence, which is worse than the mail.",
                    outcome = Outcome.BAD, lesson = "Never announce absence. Manage signals, don't broadcast them.")
            )
        ),
        Scenario(
            id = "bulk-d049", title = "The Helpful Stranger",
            intro = "A stranger at a conference is friendly, knowledgeable, and gradually asks about your work, your team, and your projects.",
            start = "step1", briefKey = "human/vectors",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is happening?",
                    choices = listOf(
                        ScenarioChoice("Networking", "bad1"),
                        ScenarioChoice("Possibly elicitation: gradual extraction through friendly conversation", "step2"),
                        ScenarioChoice("A job offer", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Answer fully; they seem friendly", "bad1"),
                        ScenarioChoice("Share only public information, and note the pattern of questions", "good1"),
                        ScenarioChoice("Walk away rudely", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You share only public information and notice the pattern of questions.",
                    outcome = Outcome.GOOD, lesson = "Elicitation extracts slowly, through friendliness. Share only what is public, and watch the pattern."),
                "bad1" to ScenarioStep(id = "bad1", text = "You answer fully, and a friendly stranger leaves with your work's details.",
                    outcome = Outcome.BAD, lesson = "Friendliness is not vetting. No single question seemed sensitive; together they were."),
                "bad2" to ScenarioStep(id = "bad2", text = "You walk away rudely from a genuine contact, and learn nothing about the pattern.",
                    outcome = Outcome.BAD, lesson = "Rudeness is not a control either. Polite boundaries plus observation are.")
            )
        ),
        Scenario(
            id = "bulk-d050", title = "The USB on the Floor",
            intro = "You find a USB drive on the office floor, labelled 'Q3 Salaries — Confidential'. Curiosity pulls at you.",
            start = "step1", briefKey = "human/vectors",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Plug it in to see whose it is", "bad1"),
                        ScenarioChoice("Do not plug it in; hand it to security or IT", "step2"),
                        ScenarioChoice("Plug it into a spare machine", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why not a spare machine?",
                    choices = listOf(
                        ScenarioChoice("Because it is slow", "bad1"),
                        ScenarioChoice("Because bait devices can infect any machine, and then spread from it", "good1"),
                        ScenarioChoice("Because it wastes time", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You hand the drive to security without plugging it in anywhere.",
                    outcome = Outcome.GOOD, lesson = "Baiting plants tempting devices that compromise whoever uses them. Never plug in a found device."),
                "bad1" to ScenarioStep(id = "bad1", text = "You plug in the drive, and malware installs before you read a single file.",
                    outcome = Outcome.BAD, lesson = "Curiosity is the bait's mechanism. A labelled drive is the lure, not the prize."),
                "bad2" to ScenarioStep(id = "bad2", text = "You plug it into a spare machine, which is then compromised and spreads the infection.",
                    outcome = Outcome.BAD, lesson = "A spare machine is still a machine on your network. Bait spreads.")
            )
        ),
        Scenario(
            id = "bulk-d051", title = "Urgency Plus Secrecy",
            intro = "A message claims your manager needs an urgent transfer, and says: 'Do not tell anyone; it is confidential.'",
            start = "step1", briefKey = "human/redflags",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What pattern do you recognise?",
                    choices = listOf(
                        ScenarioChoice("Normal management", "bad1"),
                        ScenarioChoice("Urgency plus secrecy — the classic social engineering pattern", "step2"),
                        ScenarioChoice("Efficiency", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Transfer quickly; it is urgent", "bad1"),
                        ScenarioChoice("Pause, and verify through a separate channel you already trust", "good1"),
                        ScenarioChoice("Ask the sender for confirmation", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You pause and verify separately, and learn the manager sent nothing.",
                    outcome = Outcome.GOOD, lesson = "Urgency plus secrecy is the pattern. Pause and verify through a separate channel."),
                "bad1" to ScenarioStep(id = "bad1", text = "You transfer urgently and secretly, exactly as the attacker designed.",
                    outcome = Outcome.BAD, lesson = "Urgency and secrecy are designed to bypass your judgement. That is why they are red flags."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ask the sender — the attacker — for confirmation, and they confirm.",
                    outcome = Outcome.BAD, lesson = "Never verify through the channel that brought the request.")
            )
        ),
        Scenario(
            id = "bulk-d052", title = "IT Needs Your Password",
            intro = "A caller claims to be IT support, sounds professional, and asks for your password to 'fix an urgent issue'.",
            start = "step1", briefKey = "human/redflags",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you know?",
                    choices = listOf(
                        ScenarioChoice("IT sometimes needs passwords", "bad1"),
                        ScenarioChoice("Legitimate IT never asks for your password", "step2"),
                        ScenarioChoice("Urgent issues are exceptions", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Give a temporary password", "bad1"),
                        ScenarioChoice("Refuse, hang up, and contact IT through a known channel", "good1"),
                        ScenarioChoice("Ask for their employee number", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You refuse, hang up, and verify through a known channel.",
                    outcome = Outcome.GOOD, lesson = "Legitimate IT never asks for your password. Refuse, hang up, verify separately."),
                "bad1" to ScenarioStep(id = "bad1", text = "You give a temporary password, and the attacker makes it permanent.",
                    outcome = Outcome.BAD, lesson = "A temporary password in attacker hands is a permanent compromise."),
                "bad2" to ScenarioStep(id = "bad2", text = "You accept an employee number as proof, which anyone can invent.",
                    outcome = Outcome.BAD, lesson = "Self-supplied credentials prove nothing. Verify through a channel you choose.")
            )
        ),
        Scenario(
            id = "bulk-d053", title = "Changed Bank Details",
            intro = "A supplier emails new bank details. The email looks right, the logo is right, and the tone is familiar.",
            start = "step1", briefKey = "human/verification",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Update and pay", "bad1"),
                        ScenarioChoice("Verify by calling a number you already have, not one in the email", "step2"),
                        ScenarioChoice("Reply asking for confirmation", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "The known number says no change was made. What was the email?",
                    choices = listOf(
                        ScenarioChoice("A mistake", "bad1"),
                        ScenarioChoice("A payment-redirection fraud attempt", "good1"),
                        ScenarioChoice("A test", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You verify out-of-band and stop a payment redirection.",
                    outcome = Outcome.GOOD, lesson = "Bank detail changes are a classic fraud vector. Verify by a known number, never one in the message."),
                "bad1" to ScenarioStep(id = "bad1", text = "You update and pay the attacker's account.",
                    outcome = Outcome.BAD, lesson = "A familiar email is cheap to fake. Payment changes demand out-of-band verification."),
                "bad2" to ScenarioStep(id = "bad2", text = "You reply to the fraudster asking for confirmation, and they confirm.",
                    outcome = Outcome.BAD, lesson = "Never verify through the channel that brought the request.")
            )
        ),
        Scenario(
            id = "bulk-d054", title = "The Voice on the Phone",
            intro = "A caller sounds exactly like your colleague and asks you to approve an urgent access request.",
            start = "step1", briefKey = "human/verification",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you trust?",
                    choices = listOf(
                        ScenarioChoice("The voice; it is unmistakable", "bad1"),
                        ScenarioChoice("Nothing yet; voices can be cloned, and urgency is a red flag", "step2"),
                        ScenarioChoice("The urgency", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you verify?",
                    choices = listOf(
                        ScenarioChoice("Ask them a personal question", "bad1"),
                        ScenarioChoice("Hang up and call your colleague on a number you already have", "good1"),
                        ScenarioChoice("Approve, then check", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You hang up, call back on a known number, and learn your colleague made no such request.",
                    outcome = Outcome.GOOD, lesson = "Voices can be cloned. Verification means a separate channel you choose, not the call itself."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust an unmistakable voice, which was cloned, and approve attacker access.",
                    outcome = Outcome.BAD, lesson = "Familiarity is forgeable. A voice is not verification."),
                "bad2" to ScenarioStep(id = "bad2", text = "You approve first and check later, and later is too late.",
                    outcome = Outcome.BAD, lesson = "Approve-then-check reverses the order security requires.")
            )
        ),
        Scenario(
            id = "bulk-d055", title = "The Small Favour",
            intro = "A new contact asks a tiny favour: 'Just tell me what floor your team is on.' It seems harmless.",
            start = "step1", briefKey = "human/influence",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What technique is this?",
                    choices = listOf(
                        ScenarioChoice("Friendliness", "bad1"),
                        ScenarioChoice("Foot-in-the-door: a small request leading to larger ones", "step2"),
                        ScenarioChoice("Networking", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Answer; it is trivial", "bad1"),
                        ScenarioChoice("Decline politely, and note that small requests are how larger ones begin", "good1"),
                        ScenarioChoice("Answer, but vaguely", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You decline politely and note the pattern, before larger requests arrive.",
                    outcome = Outcome.GOOD, lesson = "Foot-in-the-door starts small. Recognising the first step stops the staircase."),
                "bad1" to ScenarioStep(id = "bad1", text = "You answer a trivial question, and larger questions follow all week.",
                    outcome = Outcome.BAD, lesson = "Trivial answers build the relationship that larger requests ride on."),
                "bad2" to ScenarioStep(id = "bad2", text = "You answer vaguely, which still confirms information and encourages the next question.",
                    outcome = Outcome.BAD, lesson = "Vague answers still answer. Decline cleanly instead.")
            )
        ),
        Scenario(
            id = "bulk-d056", title = "The Uniform",
            intro = "A person in a convincing uniform, with a badge and a clipboard, asks you to hold a door and look away while they work.",
            start = "step1", briefKey = "human/influence",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What technique is this?",
                    choices = listOf(
                        ScenarioChoice("Professionalism", "bad1"),
                        ScenarioChoice("Authority: a uniform, title, and official tone discouraging questions", "step2"),
                        ScenarioChoice("Helpfulness", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Comply; they look official", "bad1"),
                        ScenarioChoice("Verify their authorisation through a known channel, regardless of appearance", "good1"),
                        ScenarioChoice("Ask for their name", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You verify authorisation independently, and the uniform turns out to be a costume.",
                    outcome = Outcome.GOOD, lesson = "Authority is a costume anyone can wear. Verify authorisation, not appearance."),
                "bad1" to ScenarioStep(id = "bad1", text = "You comply with a uniform, and an impostor gains access.",
                    outcome = Outcome.BAD, lesson = "Uniforms, badges, and clipboards are props. Authorisation is verified, not worn."),
                "bad2" to ScenarioStep(id = "bad2", text = "You accept a name as proof, which anyone can give.",
                    outcome = Outcome.BAD, lesson = "A name is not authorisation. Verify through a channel you trust.")
            )
        ),
        Scenario(
            id = "bulk-d057", title = "The New Online Friend",
            intro = "A new online contact is warm, interesting, and gradually asks about your work, your schedule, and your colleagues.",
            start = "step1", briefKey = "human/verifying-strangers",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you notice?",
                    choices = listOf(
                        ScenarioChoice("A new friend", "bad1"),
                        ScenarioChoice("A pattern of gradual, personal questions — possible elicitation", "step2"),
                        ScenarioChoice("Networking", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Answer; they are friendly", "bad1"),
                        ScenarioChoice("Share only public information, and check their identity through independent evidence", "good1"),
                        ScenarioChoice("Block them immediately", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You share only public information and verify identity independently.",
                    outcome = Outcome.GOOD, lesson = "Gradual personal questions are elicitation's shape. Share public only, verify independently."),
                "bad1" to ScenarioStep(id = "bad1", text = "You answer a friendly stranger, and your work details accumulate in their hands.",
                    outcome = Outcome.BAD, lesson = "Friendliness is elicitation's cover. No single answer seemed sensitive."),
                "bad2" to ScenarioStep(id = "bad2", text = "You block a genuine contact without learning anything, and repeat the error next time.",
                    outcome = Outcome.BAD, lesson = "Blocking without observation teaches nothing. Observe, bound, verify.")
            )
        ),
        Scenario(
            id = "bulk-d058", title = "The Impressive Profile",
            intro = "A contact has a polished profile, thousands of followers, and a prestigious job title. They ask for an introduction to your team.",
            start = "step1", briefKey = "human/verifying-strangers",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you trust?",
                    choices = listOf(
                        ScenarioChoice("The profile; it is polished", "bad1"),
                        ScenarioChoice("Nothing yet; profiles, followers, and titles are all forgeable", "step2"),
                        ScenarioChoice("The follower count", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What verifies them?",
                    choices = listOf(
                        ScenarioChoice("Their photo", "bad1"),
                        ScenarioChoice("Independent evidence: known channels, mutual contacts, verifiable history", "good1"),
                        ScenarioChoice("Their title", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You verify through independent evidence before any introduction.",
                    outcome = Outcome.GOOD, lesson = "Profiles, followers, and titles are forgeable. Independent evidence verifies."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust a polished profile and introduce a fabricated person to your team.",
                    outcome = Outcome.BAD, lesson = "Polish is cheap. A profile is a claim, not evidence."),
                "bad2" to ScenarioStep(id = "bad2", text = "You trust a follower count, which can be bought by the thousand.",
                    outcome = Outcome.BAD, lesson = "Follower counts are purchasable. They verify nothing.")
            )
        ),
        Scenario(
            id = "bulk-d059", title = "Evidence That Fits",
            intro = "You read an article that perfectly confirms what you already believe about a security topic. You feel vindicated.",
            start = "step1", briefKey = "cognitive/biases",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What should you suspect?",
                    choices = listOf(
                        ScenarioChoice("Nothing; it confirms your view", "bad1"),
                        ScenarioChoice("Confirmation bias: you may be accepting it because it fits, not because it is sound", "step2"),
                        ScenarioChoice("The article's author", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Share it immediately", "bad1"),
                        ScenarioChoice("Seek disconfirming evidence and check the article's sources before trusting it", "good1"),
                        ScenarioChoice("Ignore it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You check sources and seek counter-evidence, and find the article cherry-picked its data.",
                    outcome = Outcome.GOOD, lesson = "Confirmation bias filters evidence to fit beliefs. Seek disconfirming evidence deliberately."),
                "bad1" to ScenarioStep(id = "bad1", text = "You share an article because it fits, spreading cherry-picked data as fact.",
                    outcome = Outcome.BAD, lesson = "Sharing what fits, unchecked, spreads misinformation with your endorsement."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ignore all confirming evidence, which is the opposite bias, not a cure.",
                    outcome = Outcome.BAD, lesson = "Ignoring confirming evidence is not scepticism; it is bias in the other direction.")
            )
        ),
        Scenario(
            id = "bulk-d060", title = "The Confident Expert",
            intro = "A confident speaker dismisses your concern with jargon and certainty. You feel small and stop questioning.",
            start = "step1", briefKey = "cognitive/biases",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is happening?",
                    choices = listOf(
                        ScenarioChoice("You are wrong", "bad1"),
                        ScenarioChoice("Authority and confidence are suppressing your judgement", "step2"),
                        ScenarioChoice("The speaker is right", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Accept their view", "bad1"),
                        ScenarioChoice("Separate confidence from evidence: ask for sources and reasoning, calmly", "good1"),
                        ScenarioChoice("Argue louder", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You ask for sources and reasoning, and the confident claim collapses without them.",
                    outcome = Outcome.GOOD, lesson = "Confidence is not evidence. Ask for sources and reasoning, whatever the speaker's certainty."),
                "bad1" to ScenarioStep(id = "bad1", text = "You accept a confident claim without evidence, and a bad decision follows.",
                    outcome = Outcome.BAD, lesson = "Certainty suppresses questions. Questions are the defence."),
                "bad2" to ScenarioStep(id = "bad2", text = "You argue louder instead of asking for evidence, and the discussion becomes a contest.",
                    outcome = Outcome.BAD, lesson = "Volume is not evidence either. Ask for sources, not dominance.")
            )
        ),
        Scenario(
            id = "bulk-d061", title = "Angry Message, Fast Reply",
            intro = "A message angers you and demands an immediate reply. Your fingers are already typing.",
            start = "step1", briefKey = "cognitive/emotion",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Send the reply now", "bad1"),
                        ScenarioChoice("Pause, let the anger pass, then decide", "step2"),
                        ScenarioChoice("Delete the message", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "After pausing, what do you see?",
                    choices = listOf(
                        ScenarioChoice("The same urgency", "bad1"),
                        ScenarioChoice("That the message was designed to provoke a fast, careless response", "good1"),
                        ScenarioChoice("Nothing new", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You pause, see the manipulation, and reply calmly — or not at all.",
                    outcome = Outcome.GOOD, lesson = "Strong emotion narrows attention and speeds compliance. Pausing restores judgement."),
                "bad1" to ScenarioStep(id = "bad1", text = "You reply in anger, revealing information and escalating a provocation.",
                    outcome = Outcome.BAD, lesson = "Anger-driven replies serve the provoker, not you."),
                "bad2" to ScenarioStep(id = "bad2", text = "You delete the message, losing evidence of a manipulation attempt.",
                    outcome = Outcome.BAD, lesson = "Deleting destroys evidence. Pause and preserve, then decide.")
            )
        ),
        Scenario(
            id = "bulk-d062", title = "Too Good to Check",
            intro = "An offer excites you: exclusive access, limited time, huge benefit. You want to click now.",
            start = "step1", briefKey = "cognitive/emotion",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What emotion is being used?",
                    choices = listOf(
                        ScenarioChoice("Joy", "bad1"),
                        ScenarioChoice("Excitement and greed, paired with scarcity and urgency", "step2"),
                        ScenarioChoice("Curiosity", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Click now before it expires", "bad1"),
                        ScenarioChoice("Pause, verify the offer through an independent channel, and check for the scam pattern", "good1"),
                        ScenarioChoice("Share it with friends", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You pause and verify, and the exclusive offer turns out to be a scam.",
                    outcome = Outcome.GOOD, lesson = "Excitement, scarcity, and urgency are a scam pattern. Pause and verify independently."),
                "bad1" to ScenarioStep(id = "bad1", text = "You click in excitement and hand over credentials to a fake offer.",
                    outcome = Outcome.BAD, lesson = "Excitement bypasses verification. That is why offers manufacture it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You share the scam with friends, multiplying its victims.",
                    outcome = Outcome.BAD, lesson = "Sharing an unverified offer spreads the scam with your endorsement.")
            )
        ),
        Scenario(
            id = "bulk-d063", title = "The Wrong Model",
            intro = "You model a system as 'secure because it is encrypted', and plan accordingly. A colleague points out metadata and access risks.",
            start = "step1", briefKey = "cognitive/models",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Defend your model", "bad1"),
                        ScenarioChoice("Update the model with the new evidence", "step2"),
                        ScenarioChoice("Ignore the colleague", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What does the updated model change?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Your plan: metadata controls and access controls join encryption", "good1"),
                        ScenarioChoice("Your confidence only", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You update the model, and your plan now covers metadata and access too.",
                    outcome = Outcome.GOOD, lesson = "Models are tools, not identities. Update them when evidence contradicts them."),
                "bad1" to ScenarioStep(id = "bad1", text = "You defend a wrong model, and your plan protects only encryption while metadata leaks.",
                    outcome = Outcome.BAD, lesson = "Defending a wrong model is defending a hole in your plan."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ignore correction, and the same error shapes every future plan.",
                    outcome = Outcome.BAD, lesson = "Ignoring correction compounds the error across every plan that uses the model.")
            )
        ),
        Scenario(
            id = "bulk-d064", title = "Passwords Are Identity",
            intro = "You treat a password as proof of identity: 'If they have the password, they must be the user.'",
            start = "step1", briefKey = "cognitive/models",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is wrong with this model?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Passwords are stealable secrets, not identity; anyone with the password appears to be the user", "step2"),
                        ScenarioChoice("Passwords are too short", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What does the corrected model demand?",
                    choices = listOf(
                        ScenarioChoice("Longer passwords", "bad1"),
                        ScenarioChoice("Second factors, and treating logins as claims to verify, not identities proven", "good1"),
                        ScenarioChoice("Biometrics only", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You correct the model, add second factors, and treat logins as claims.",
                    outcome = Outcome.GOOD, lesson = "Passwords are secrets that can be stolen, not identity itself. Model them that way."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep equating passwords with identity, and every stolen password becomes a stolen identity.",
                    outcome = Outcome.BAD, lesson = "A model that equates secrets with identity hands identity to thieves."),
                "bad2" to ScenarioStep(id = "bad2", text = "You lengthen passwords, which does not fix a model error.",
                    outcome = Outcome.BAD, lesson = "Longer secrets in a wrong model are still wrongly modelled.")
            )
        ),
        Scenario(
            id = "bulk-d065", title = "Trust, But Verify",
            intro = "A trusted colleague vouches for a new contact. You are inclined to trust the contact fully.",
            start = "step1", briefKey = "cognitive/mindset",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What mindset applies?",
                    choices = listOf(
                        ScenarioChoice("Blind trust in colleagues' judgement", "bad1"),
                        ScenarioChoice("Calm scepticism: verify what matters, trust what checks out", "step2"),
                        ScenarioChoice("Distrust everyone", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you verify?",
                    choices = listOf(
                        ScenarioChoice("Nothing; the colleague vouched", "bad1"),
                        ScenarioChoice("What matters for this contact's access: identity, need, and boundaries", "good1"),
                        ScenarioChoice("Everything, exhaustively", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You verify proportionately, and trust what checks out.",
                    outcome = Outcome.GOOD, lesson = "Calm scepticism verifies proportionately and trusts verified things. Blind trust and total distrust both fail."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust blindly on a colleague's word, and a vouched contact proves untrustworthy.",
                    outcome = Outcome.BAD, lesson = "A vouch is a claim, not verification. Verify what matters yourself."),
                "bad2" to ScenarioStep(id = "bad2", text = "You distrust everyone exhaustively, and verification consumes the work itself.",
                    outcome = Outcome.BAD, lesson = "Total distrust is as unworkable as blind trust. Verify proportionately.")
            )
        ),
        Scenario(
            id = "bulk-d066", title = "Caution or Paranoia?",
            intro = "You check every message, every link, every caller, exhaustively. You are exhausted, and starting to skip checks.",
            start = "step1", briefKey = "cognitive/mindset",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is happening?",
                    choices = listOf(
                        ScenarioChoice("Good security", "bad1"),
                        ScenarioChoice("Paranoia: constant, unfocused checking that exhausts attention and then collapses", "step2"),
                        ScenarioChoice("Diligence", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Check even more", "bad1"),
                        ScenarioChoice("Check proportionately: what matters, by evidence and stakes, and let the rest go", "good1"),
                        ScenarioChoice("Stop checking", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You check proportionately, and your attention lasts for what matters.",
                    outcome = Outcome.GOOD, lesson = "Caution scales with evidence and stakes. Paranoia treats everything equally and protects nothing well."),
                "bad1" to ScenarioStep(id = "bad1", text = "You check everything, exhaust yourself, and start skipping checks — including important ones.",
                    outcome = Outcome.BAD, lesson = "Exhausted attention skips checks. Proportionate checking preserves it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You stop checking entirely, swinging from paranoia to blindness.",
                    outcome = Outcome.BAD, lesson = "Abandoning checks is not the cure for over-checking. Proportion is.")
            )
        ),
        Scenario(
            id = "bulk-d067", title = "Pressure Decision",
            intro = "Under time pressure, you must approve or reject a sensitive request. Your heart is racing, and the requester is waiting.",
            start = "step1", briefKey = "cognitive/calm-pressure",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Decide fast to end the pressure", "bad1"),
                        ScenarioChoice("Follow a pre-decided procedure: pause, check, verify", "step2"),
                        ScenarioChoice("Delegate the decision", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "The procedure says the request is unverified. What then?",
                    choices = listOf(
                        ScenarioChoice("Approve anyway; the requester is waiting", "bad1"),
                        ScenarioChoice("Delay approval until verification, and say so plainly", "good1"),
                        ScenarioChoice("Reject permanently", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You follow procedure under pressure, delay unverified approval, and stay calm.",
                    outcome = Outcome.GOOD, lesson = "Pre-decided procedures replace panicked improvisation: pause, check, verify."),
                "bad1" to ScenarioStep(id = "bad1", text = "You decide fast to end pressure, and approve an unverified request.",
                    outcome = Outcome.BAD, lesson = "Deciding fast to end pressure is pressure deciding for you."),
                "bad2" to ScenarioStep(id = "bad2", text = "You delegate under pressure, passing an unverified decision to someone else.",
                    outcome = Outcome.BAD, lesson = "Delegating a decision you have not verified just moves the risk.")
            )
        ),
        Scenario(
            id = "bulk-d068", title = "After the Incident",
            intro = "A high-pressure incident just ended. The team is shaken, and everyone wants to move on and forget it.",
            start = "step1", briefKey = "cognitive/calm-pressure",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What does the team need?",
                    choices = listOf(
                        ScenarioChoice("To move on quickly", "bad1"),
                        ScenarioChoice("A calm debrief: what happened, what worked, what failed, what changes", "step2"),
                        ScenarioChoice("Blame for the failure", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What does the debrief produce?",
                    choices = listOf(
                        ScenarioChoice("A report", "bad1"),
                        ScenarioChoice("Concrete changes to procedures, controls, and training", "good1"),
                        ScenarioChoice("Reassurance", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "The team debriefs calmly and changes procedures, turning pressure into learning.",
                    outcome = Outcome.GOOD, lesson = "After pressure, debrief calmly and change concretely. Moving on without learning repeats the incident."),
                "bad1" to ScenarioStep(id = "bad1", text = "The team moves on without debriefing, and the same failure recurs.",
                    outcome = Outcome.BAD, lesson = "Undebriefed incidents repeat. Pressure without learning is just pressure."),
                "bad2" to ScenarioStep(id = "bad2", text = "The team blames one member, and future incidents go unreported.",
                    outcome = Outcome.BAD, lesson = "Blame drives incidents underground. Learning requires safety.")
            )
        )
    )
}
