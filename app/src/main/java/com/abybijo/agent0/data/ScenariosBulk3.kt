package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk drills, batch 3: 32 drills, two per brief, for CH-06 to CH-08. */
object ScenariosBulk3 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "bulk-d069", title = "One Account, Two Lives",
            intro = "You use the same account for personal posts and sensitive work. One post links the two worlds.",
            start = "step1", briefKey = "identity/compartments",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What broke?",
                    choices = listOf(
                        ScenarioChoice("Nothing; accounts are flexible", "bad1"),
                        ScenarioChoice("A compartment boundary: one account now links personal life and sensitive work", "step2"),
                        ScenarioChoice("Your privacy settings", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Delete the post", "bad1"),
                        ScenarioChoice("Separate the compartments properly: distinct accounts, no shared identifiers, and accept the link cannot be fully undone", "good1"),
                        ScenarioChoice("Make the account private", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You separate properly, and accept that the past link cannot be fully undone.",
                    outcome = Outcome.GOOD, lesson = "Compartment boundaries must be real: separate accounts, no shared identifiers. A broken boundary cannot be fully repaired."),
                "bad1" to ScenarioStep(id = "bad1", text = "You see no break, and keep mixing worlds in one account.",
                    outcome = Outcome.BAD, lesson = "One account for two lives is one compromise away from linking both."),
                "bad2" to ScenarioStep(id = "bad2", text = "You make the account private, but the link already exists in the provider's data.",
                    outcome = Outcome.BAD, lesson = "Privacy settings do not undo linkage. Separation must come first.")
            )
        ),
        Scenario(
            id = "bulk-d070", title = "The Shared Phone Number",
            intro = "You use the same phone number for a personal account and a sensitive-work account. A lookup links them.",
            start = "step1", briefKey = "identity/compartments",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What linked the accounts?",
                    choices = listOf(
                        ScenarioChoice("Your name", "bad1"),
                        ScenarioChoice("A shared identifier: the phone number", "step2"),
                        ScenarioChoice("Bad luck", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Change your name", "bad1"),
                        ScenarioChoice("Use separate identifiers per compartment: different numbers, emails, and recovery details", "good1"),
                        ScenarioChoice("Delete one account", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You separate identifiers per compartment, so no single lookup links them.",
                    outcome = Outcome.GOOD, lesson = "Shared identifiers are bridges between compartments. Separate them all: number, email, recovery."),
                "bad1" to ScenarioStep(id = "bad1", text = "You change your name, but the shared number still links the accounts.",
                    outcome = Outcome.BAD, lesson = "Names are the least of it. Shared identifiers — numbers, emails — are the bridges."),
                "bad2" to ScenarioStep(id = "bad2", text = "You delete one account, but the provider's records still link the history.",
                    outcome = Outcome.BAD, lesson = "Deletion does not erase provider-side linkage. Prevention beats deletion.")
            )
        ),
        Scenario(
            id = "bulk-d071", title = "The File That Talked",
            intro = "You share a document publicly. Its metadata reveals the author, the organisation, and the location where it was created.",
            start = "step1", briefKey = "identity/metadata",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What leaked?",
                    choices = listOf(
                        ScenarioChoice("The content", "bad1"),
                        ScenarioChoice("Metadata: author, organisation, location, and creation details", "step2"),
                        ScenarioChoice("Nothing", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do before sharing next time?",
                    choices = listOf(
                        ScenarioChoice("Rename the file", "bad1"),
                        ScenarioChoice("Strip metadata, or share a clean copy rebuilt from content alone", "good1"),
                        ScenarioChoice("Convert it to PDF", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You strip metadata and share a clean copy, so the file no longer talks about you.",
                    outcome = Outcome.GOOD, lesson = "Metadata describes a file — author, place, time, device. Strip it before sharing."),
                "bad1" to ScenarioStep(id = "bad1", text = "You focus on content, and metadata keeps leaking author and location.",
                    outcome = Outcome.BAD, lesson = "Content is only half the file. Metadata is the other half."),
                "bad2" to ScenarioStep(id = "bad2", text = "You convert to PDF, which preserves much of the metadata anyway.",
                    outcome = Outcome.BAD, lesson = "Format conversion is not metadata removal. Strip it deliberately.")
            )
        ),
        Scenario(
            id = "bulk-d072", title = "The Message Trail",
            intro = "Your encrypted messages are safe, but someone maps who you talk to, when, and how often — and reconstructs your network.",
            start = "step1", briefKey = "identity/metadata",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What was used?",
                    choices = listOf(
                        ScenarioChoice("Message content", "bad1"),
                        ScenarioChoice("Metadata: contact patterns, timing, and frequency", "step2"),
                        ScenarioChoice("A bug", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What reduces this exposure?",
                    choices = listOf(
                        ScenarioChoice("Stronger encryption", "bad1"),
                        ScenarioChoice("Fewer, less patterned contacts; varied timing; and awareness of what metadata reveals", "good1"),
                        ScenarioChoice("A different app", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You reduce patterned contact and metadata exposure, accepting encryption alone is not enough.",
                    outcome = Outcome.GOOD, lesson = "Metadata survives encryption. Patterns of contact, timing, and frequency reveal networks."),
                "bad1" to ScenarioStep(id = "bad1", text = "You strengthen encryption, which does nothing about metadata.",
                    outcome = Outcome.BAD, lesson = "Encryption protects content, not metadata. Stronger encryption does not hide patterns."),
                "bad2" to ScenarioStep(id = "bad2", text = "You switch apps, but every app generates metadata.",
                    outcome = Outcome.BAD, lesson = "No app eliminates metadata. Behaviour reduces it; apps do not.")
            )
        ),
        Scenario(
            id = "bulk-d073", title = "Search Yourself",
            intro = "You search for yourself as a stranger would — name, old usernames, email — and find far more than you expected.",
            start = "step1", briefKey = "identity/osint",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What have you found?",
                    choices = listOf(
                        ScenarioChoice("Nothing important", "bad1"),
                        ScenarioChoice("Your digital shadow: what any adversary can assemble from public sources", "step2"),
                        ScenarioChoice("Old photos", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do with it?",
                    choices = listOf(
                        ScenarioChoice("Delete everything at once", "bad1"),
                        ScenarioChoice("Record it: where, how sensitive, and what action each item needs, then work through it", "good1"),
                        ScenarioChoice("Ignore it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You record and prioritise, turning a shock into a plan.",
                    outcome = Outcome.GOOD, lesson = "A self-audit starts by seeing yourself as a stranger sees you, then recording and acting."),
                "bad1" to ScenarioStep(id = "bad1", text = "You delete in panic, destroying useful records and missing the worst items.",
                    outcome = Outcome.BAD, lesson = "Panic deletion is not an audit. Record first, act by priority."),
                "bad2" to ScenarioStep(id = "bad2", text = "You ignore the shadow, and it keeps growing while you look away.",
                    outcome = Outcome.BAD, lesson = "Ignoring a shadow does not shrink it. Only action does.")
            )
        ),
        Scenario(
            id = "bulk-d074", title = "The Old Forum Post",
            intro = "A forum post from fifteen years ago, under an old username, reveals details you would never share today. It is indexed everywhere.",
            start = "step1", briefKey = "identity/osint",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "Why does it matter now?",
                    choices = listOf(
                        ScenarioChoice("It does not; it is old", "bad1"),
                        ScenarioChoice("Because public data persists and is indexed; age does not erase it", "step2"),
                        ScenarioChoice("Because forums are public", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Nothing; it is too old", "bad1"),
                        ScenarioChoice("Request removal where possible, and reduce what links the old username to you now", "good1"),
                        ScenarioChoice("Post a correction", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You request removal and break current links to the old username.",
                    outcome = Outcome.GOOD, lesson = "Public data persists and is indexed. Old posts matter as much as new ones."),
                "bad1" to ScenarioStep(id = "bad1", text = "You dismiss old data, and it remains indexed and usable against you.",
                    outcome = Outcome.BAD, lesson = "Age does not erase public data. Indexing preserves it indefinitely."),
                "bad2" to ScenarioStep(id = "bad2", text = "You post a correction, drawing fresh attention to the old post.",
                    outcome = Outcome.BAD, lesson = "Correcting publicly amplifies what you wanted buried. Remove quietly, or not at all.")
            )
        ),
        Scenario(
            id = "bulk-d075", title = "Two Names, One Habit",
            intro = "You maintain a separate persona, but use the same distinctive writing style, posting times, and phrases in both identities.",
            start = "step1", briefKey = "identity/personas",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What links them?",
                    choices = listOf(
                        ScenarioChoice("Nothing; names differ", "bad1"),
                        ScenarioChoice("Behavioural fingerprints: style, timing, and phrases", "step2"),
                        ScenarioChoice("The platform", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Change the name again", "bad1"),
                        ScenarioChoice("Vary style, timing, and habits between personas, and keep identifiers fully separate", "good1"),
                        ScenarioChoice("Post less", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You vary behaviour as well as identifiers, making linkage genuinely hard.",
                    outcome = Outcome.GOOD, lesson = "Personas are linked by behaviour as much as by identifiers. Vary both."),
                "bad1" to ScenarioStep(id = "bad1", text = "You change names again, but style and timing still link the personas.",
                    outcome = Outcome.BAD, lesson = "A new name over the same behaviour is the same persona."),
                "bad2" to ScenarioStep(id = "bad2", text = "You post less, but what you post still carries the same fingerprint.",
                    outcome = Outcome.BAD, lesson = "Less of the same fingerprint is still the same fingerprint.")
            )
        ),
        Scenario(
            id = "bulk-d076", title = "Persona for the Wrong Reason",
            intro = "You consider a persona to deceive people about who you are and what you represent.",
            start = "step1", briefKey = "identity/personas",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is wrong?",
                    choices = listOf(
                        ScenarioChoice("Nothing; personas are tools", "bad1"),
                        ScenarioChoice("Personas are for lawful separation — safety or professional boundaries — not deception or fraud", "step2"),
                        ScenarioChoice("It is risky", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do instead?",
                    choices = listOf(
                        ScenarioChoice("Use it anyway, carefully", "bad1"),
                        ScenarioChoice("Decline the deceptive use, and use separation only where it is lawful and justified", "good1"),
                        ScenarioChoice("Use a vaguer persona", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You decline deception and keep separation lawful and justified.",
                    outcome = Outcome.GOOD, lesson = "Personas serve lawful separation — safety, professional boundaries — never deception or fraud."),
                "bad1" to ScenarioStep(id = "bad1", text = "You use a persona to deceive, crossing from separation into fraud.",
                    outcome = Outcome.BAD, lesson = "Deceptive personas are not OPSEC; they are fraud wearing OPSEC's clothes."),
                "bad2" to ScenarioStep(id = "bad2", text = "You make the deception vaguer, which is still deception.",
                    outcome = Outcome.BAD, lesson = "Vagueness does not launder deception into legitimacy.")
            )
        ),
        Scenario(
            id = "bulk-d077", title = "Photo With a Location",
            intro = "You post a photo from a sensitive location. Its metadata carries exact coordinates, and the background shows a street sign.",
            start = "step1", briefKey = "identity/photo-metadata",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What leaked?",
                    choices = listOf(
                        ScenarioChoice("Only the image", "bad1"),
                        ScenarioChoice("Location twice over: coordinates in metadata, and a street sign in the background", "step2"),
                        ScenarioChoice("Nothing; photos are safe", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do before posting next time?",
                    choices = listOf(
                        ScenarioChoice("Add a filter", "bad1"),
                        ScenarioChoice("Strip metadata, check the background for identifying details, and delay posting from sensitive places", "good1"),
                        ScenarioChoice("Crop the sign out", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You strip metadata, check backgrounds, and delay sensitive posts.",
                    outcome = Outcome.GOOD, lesson = "Photos leak location twice: metadata and background. Check both, and delay sensitive posts."),
                "bad1" to ScenarioStep(id = "bad1", text = "You filter the photo, leaving coordinates and the street sign intact.",
                    outcome = Outcome.BAD, lesson = "Filters change appearance, not metadata or backgrounds."),
                "bad2" to ScenarioStep(id = "bad2", text = "You crop the sign, but coordinates still give your exact location.",
                    outcome = Outcome.BAD, lesson = "Cropping fixes the background, not the metadata. Both must be handled.")
            )
        ),
        Scenario(
            id = "bulk-d078", title = "Reflection in the Photo",
            intro = "You post a photo of a document on your desk. A reflection in a nearby window shows your face and a whiteboard behind you.",
            start = "step1", briefKey = "identity/photo-metadata",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did you miss?",
                    choices = listOf(
                        ScenarioChoice("Nothing; the document was the subject", "bad1"),
                        ScenarioChoice("Reflections, backgrounds, and secondary details that reveal far more than the subject", "step2"),
                        ScenarioChoice("The lighting", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you check before posting?",
                    choices = listOf(
                        ScenarioChoice("The subject only", "bad1"),
                        ScenarioChoice("The whole frame: reflections, backgrounds, screens, and documents at the edges", "good1"),
                        ScenarioChoice("The caption", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You check the whole frame before posting, and catch reflections and background details.",
                    outcome = Outcome.GOOD, lesson = "A photo's subject is the least of it. Check the whole frame: reflections, screens, edges."),
                "bad1" to ScenarioStep(id = "bad1", text = "You check only the subject, and a reflection reveals you and your whiteboard.",
                    outcome = Outcome.BAD, lesson = "The frame is the photo. Subjects distract from reflections and backgrounds."),
                "bad2" to ScenarioStep(id = "bad2", text = "You polish the caption while the image leaks everything.",
                    outcome = Outcome.BAD, lesson = "Captions do not fix images. Check the image itself.")
            )
        ),
        Scenario(
            id = "bulk-d079", title = "Generic Adversary, Generic Plan",
            intro = "You write a threat model with 'hackers' as the adversary and 'be careful' as the countermeasure.",
            start = "step1", briefKey = "tradecraft/threatmodel",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is wrong?",
                    choices = listOf(
                        ScenarioChoice("Nothing; it is a start", "bad1"),
                        ScenarioChoice("Generic adversaries and vague countermeasures produce a plan that fits nobody and protects nothing", "step2"),
                        ScenarioChoice("It is too short", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you rewrite?",
                    choices = listOf(
                        ScenarioChoice("A longer version", "bad1"),
                        ScenarioChoice("Specific actors, their capability and intent, specific vulnerabilities, and concrete countermeasures", "good1"),
                        ScenarioChoice("A scarier version", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You rewrite with specifics, and the plan becomes actionable.",
                    outcome = Outcome.GOOD, lesson = "A threat model names specific actors, capability, intent, vulnerabilities, and concrete countermeasures."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep a generic plan, and it protects nothing in particular.",
                    outcome = Outcome.BAD, lesson = "Generic plans are decoration. Specificity is what makes a plan work."),
                "bad2" to ScenarioStep(id = "bad2", text = "You make the plan scarier, which changes emotion, not protection.",
                    outcome = Outcome.BAD, lesson = "Fear is not a countermeasure. Specificity is.")
            )
        ),
        Scenario(
            id = "bulk-d080", title = "Model Gone Stale",
            intro = "Your threat model is two years old. Since then you changed jobs, moved cities, and started public work.",
            start = "step1", briefKey = "tradecraft/threatmodel",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the problem?",
                    choices = listOf(
                        ScenarioChoice("Nothing; models are timeless", "bad1"),
                        ScenarioChoice("The model describes a life you no longer live; its adversaries, risks, and controls are stale", "step2"),
                        ScenarioChoice("It is too long", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Keep using it", "bad1"),
                        ScenarioChoice("Rebuild it for your current life, and schedule reviews on change", "good1"),
                        ScenarioChoice("Delete it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You rebuild the model for your current life and schedule reviews on change.",
                    outcome = Outcome.GOOD, lesson = "Threat models decay as situations change. Rebuild on change, and review regularly."),
                "bad1" to ScenarioStep(id = "bad1", text = "You defend a life you no longer live, while your real risks go unmodelled.",
                    outcome = Outcome.BAD, lesson = "A stale model is worse than none: it gives false confidence about the wrong risks."),
                "bad2" to ScenarioStep(id = "bad2", text = "You delete the model instead of rebuilding it, leaving no model at all.",
                    outcome = Outcome.BAD, lesson = "Rebuild, don't delete. No model is not an improvement on a stale one.")
            )
        ),
        Scenario(
            id = "bulk-d081", title = "Breach at Midnight",
            intro = "At midnight you learn a service holding your data was breached. You are tired and want to deal with it tomorrow.",
            start = "step1", briefKey = "tradecraft/incident",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do tonight?",
                    choices = listOf(
                        ScenarioChoice("Sleep; tomorrow is fine", "bad1"),
                        ScenarioChoice("Contain quickly: change affected credentials from a clean device, enable stronger authentication, note what was exposed", "step2"),
                        ScenarioChoice("Delete the account", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do tomorrow?",
                    choices = listOf(
                        ScenarioChoice("Forget it", "bad1"),
                        ScenarioChoice("Review what was accessed, watch for misuse, and complete the recovery checklist", "good1"),
                        ScenarioChoice("Tell everyone", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You contain tonight and complete recovery tomorrow, with monitoring in place.",
                    outcome = Outcome.GOOD, lesson = "Contain first, even tired; complete recovery deliberately. Delay multiplies breach damage."),
                "bad1" to ScenarioStep(id = "bad1", text = "You sleep on a live breach, and attackers use the night.",
                    outcome = Outcome.BAD, lesson = "Breaches do not wait for morning. Contain quickly, even tired."),
                "bad2" to ScenarioStep(id = "bad2", text = "You delete the account, destroying evidence and losing the ability to see what was taken.",
                    outcome = Outcome.BAD, lesson = "Deletion destroys evidence. Contain, preserve, then decide.")
            )
        ),
        Scenario(
            id = "bulk-d082", title = "Who Else Is Affected?",
            intro = "Your account is compromised. You focus on your own recovery and forget the contacts the attacker can now reach through you.",
            start = "step1", briefKey = "tradecraft/incident",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did you miss?",
                    choices = listOf(
                        ScenarioChoice("Nothing; your account is yours", "bad1"),
                        ScenarioChoice("That a compromised account endangers contacts, who may receive phishing from 'you'", "step2"),
                        ScenarioChoice("The password", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Recover quietly", "bad1"),
                        ScenarioChoice("Warn contacts through a separate channel that your account was compromised", "good1"),
                        ScenarioChoice("Post publicly", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You warn contacts separately, so phishing from 'you' fails.",
                    outcome = Outcome.GOOD, lesson = "A compromised account endangers contacts. Warn them through a separate channel."),
                "bad1" to ScenarioStep(id = "bad1", text = "You recover quietly while contacts fall for phishing sent from your account.",
                    outcome = Outcome.BAD, lesson = "Quiet recovery leaves contacts exposed to your compromised identity."),
                "bad2" to ScenarioStep(id = "bad2", text = "You post publicly, revealing details that help the attacker and embarrass contacts.",
                    outcome = Outcome.BAD, lesson = "Warnings need a separate, private channel — not a public post.")
            )
        ),
        Scenario(
            id = "bulk-d083", title = "The Fading Habit",
            intro = "Six months after learning OPSEC, your habits have faded: passwords reused, updates delayed, reviews skipped.",
            start = "step1", briefKey = "tradecraft/sustaining",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What happened?",
                    choices = listOf(
                        ScenarioChoice("You got lazy", "bad1"),
                        ScenarioChoice("Your controls were too burdensome to sustain, so they decayed", "step2"),
                        ScenarioChoice("Threats decreased", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Try harder", "bad1"),
                        ScenarioChoice("Simplify to sustainable routines: proportionate controls built into ordinary life", "good1"),
                        ScenarioChoice("Buy new tools", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You simplify to routines you can actually keep, and the posture returns.",
                    outcome = Outcome.GOOD, lesson = "Sustainable routines beat maximum effort. A posture you can keep beats one you abandon."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame laziness and try harder, and the same burdensome controls decay again.",
                    outcome = Outcome.BAD, lesson = "Blaming willpower repeats the failure. Design controls you can sustain."),
                "bad2" to ScenarioStep(id = "bad2", text = "You buy new tools, which add burden without fixing sustainability.",
                    outcome = Outcome.BAD, lesson = "Tools do not sustain postures. Routines do.")
            )
        ),
        Scenario(
            id = "bulk-d084", title = "Review Day",
            intro = "Your scheduled review day arrives. Nothing has gone wrong lately, and skipping it is tempting.",
            start = "step1", briefKey = "tradecraft/sustaining",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Skip it; nothing is wrong", "bad1"),
                        ScenarioChoice("Do the review: accounts, devices, permissions, subscriptions, threat model", "step2"),
                        ScenarioChoice("Do a quick glance", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "The review finds a forgotten app with broad permissions. What does that prove?",
                    choices = listOf(
                        ScenarioChoice("Reviews are luck", "bad1"),
                        ScenarioChoice("That quiet periods are when decay accumulates, and reviews catch it", "good1"),
                        ScenarioChoice("That apps are dangerous", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You review, find decay, and fix it before an incident finds it for you.",
                    outcome = Outcome.GOOD, lesson = "Reviews catch decay in quiet periods, before incidents do. Skipping them is how decay wins."),
                "bad1" to ScenarioStep(id = "bad1", text = "You skip the review, and the forgotten app's permissions stay live until breached.",
                    outcome = Outcome.BAD, lesson = "'Nothing is wrong' is exactly when decay accumulates unseen."),
                "bad2" to ScenarioStep(id = "bad2", text = "You glance quickly, miss the forgotten app, and call the review done.",
                    outcome = Outcome.BAD, lesson = "A glance is not a review. Reviews have a checklist, or they are theatre.")
            )
        ),
        Scenario(
            id = "bulk-d085", title = "First Hour Panic",
            intro = "You discover a compromise. Panic rises, and your first impulse is to delete everything and reinstall.",
            start = "step1", briefKey = "tradecraft/first-hour",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Delete everything", "bad1"),
                        ScenarioChoice("Pause, contain, preserve evidence, and get help if anyone is in danger", "step2"),
                        ScenarioChoice("Reinstall immediately", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why preserve evidence before rebuilding?",
                    choices = listOf(
                        ScenarioChoice("For insurance", "bad1"),
                        ScenarioChoice("Because investigation, reporting, and recovery all depend on knowing what happened", "good1"),
                        ScenarioChoice("Because it is procedure", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You contain, preserve, and then rebuild with understanding.",
                    outcome = Outcome.GOOD, lesson = "The first hour is containment and safety, not deletion. Evidence guides everything after."),
                "bad1" to ScenarioStep(id = "bad1", text = "You delete everything in panic, destroying evidence and possibly leaving compromise in place.",
                    outcome = Outcome.BAD, lesson = "Panic deletion destroys the investigation and may hide ongoing compromise."),
                "bad2" to ScenarioStep(id = "bad2", text = "You reinstall immediately, rebuilding on top of an unknown compromise.",
                    outcome = Outcome.BAD, lesson = "Rebuilding without understanding rebuilds the vulnerability too.")
            )
        ),
        Scenario(
            id = "bulk-d086", title = "Who Do You Call?",
            intro = "A serious incident is unfolding. You do not know who to call, and you waste the first hour deciding.",
            start = "step1", briefKey = "tradecraft/first-hour",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What should you have prepared?",
                    choices = listOf(
                        ScenarioChoice("Nothing; incidents are rare", "bad1"),
                        ScenarioChoice("A contact plan: trusted helpers, and emergency services if anyone is in danger, decided in advance", "step2"),
                        ScenarioChoice("A lawyer", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "In the moment, what do you do?",
                    choices = listOf(
                        ScenarioChoice("Keep deciding alone", "bad1"),
                        ScenarioChoice("Use the plan: contact trusted help now, emergency services if danger is involved", "good1"),
                        ScenarioChoice("Post for help publicly", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You use a pre-decided contact plan and get help in the first hour.",
                    outcome = Outcome.GOOD, lesson = "First-hour contacts are decided in advance, not improvised. Danger means emergency services."),
                "bad1" to ScenarioStep(id = "bad1", text = "You spend the first hour deciding who to call, while the incident spreads.",
                    outcome = Outcome.BAD, lesson = "Improvising contacts under pressure wastes the hour that matters most."),
                "bad2" to ScenarioStep(id = "bad2", text = "You post publicly for help, exposing the incident and yourself.",
                    outcome = Outcome.BAD, lesson = "Public pleas expose incidents. Trusted, private channels are the plan.")
            )
        ),
        Scenario(
            id = "bulk-d087", title = "Theory Meets Rain",
            intro = "You planned a secure meeting perfectly — on paper. In reality it rains, the venue changes, and devices get wet and shared.",
            start = "step1", briefKey = "fieldcraft/fieldcraft",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What failed?",
                    choices = listOf(
                        ScenarioChoice("The weather", "bad1"),
                        ScenarioChoice("The plan was never tested under real conditions, including disruption", "step2"),
                        ScenarioChoice("The venue", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Plan harder", "bad1"),
                        ScenarioChoice("Rehearse under realistic conditions, including failure and disruption", "good1"),
                        ScenarioChoice("Avoid meetings", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You rehearse realistically, and the next disruption is handled, not improvised.",
                    outcome = Outcome.GOOD, lesson = "Fieldcraft is tested under real conditions — fatigue, pressure, failure included."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame weather for a plan that was never tested.",
                    outcome = Outcome.BAD, lesson = "Untested plans fail at the first disruption. Testing is the plan's proof."),
                "bad2" to ScenarioStep(id = "bad2", text = "You avoid meetings, which avoids the work, not the risk.",
                    outcome = Outcome.BAD, lesson = "Avoidance is not fieldcraft. Rehearsed adaptation is.")
            )
        ),
        Scenario(
            id = "bulk-d088", title = "The Checklist You Skipped",
            intro = "You skip a rehearsed checklist because 'you know it by heart'. Under pressure, you miss a step.",
            start = "step1", briefKey = "fieldcraft/fieldcraft",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What went wrong?",
                    choices = listOf(
                        ScenarioChoice("Memory failed", "bad1"),
                        ScenarioChoice("You abandoned the checklist that exists precisely because memory fails under pressure", "step2"),
                        ScenarioChoice("The checklist was too long", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you reinstate?",
                    choices = listOf(
                        ScenarioChoice("Better memory training", "bad1"),
                        ScenarioChoice("The checklist, used every time, especially under pressure", "good1"),
                        ScenarioChoice("A shorter checklist", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You reinstate the checklist for every run, especially under pressure.",
                    outcome = Outcome.GOOD, lesson = "Checklists exist because memory fails under pressure. Use them every time, especially then."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame memory, which is exactly what checklists are for.",
                    outcome = Outcome.BAD, lesson = "Memory is not a checklist. Blaming it misses the control that was skipped."),
                "bad2" to ScenarioStep(id = "bad2", text = "You shorten the checklist, removing the step you missed.",
                    outcome = Outcome.BAD, lesson = "Shortening a checklist to remove missed steps is not improvement; it is surrender.")
            )
        ),
        Scenario(
            id = "bulk-d089", title = "Phones on the Table",
            intro = "A sensitive meeting begins. Everyone places phones face down on the table, muted.",
            start = "step1", briefKey = "fieldcraft/secure-comms",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "Are the phones safe there?",
                    choices = listOf(
                        ScenarioChoice("Yes; they are muted", "bad1"),
                        ScenarioChoice("No: muted, face-down phones can still record", "step2"),
                        ScenarioChoice("Yes; the meeting is private", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What should have been agreed?",
                    choices = listOf(
                        ScenarioChoice("Muting", "bad1"),
                        ScenarioChoice("Phones left elsewhere, or in a shielded container, agreed in advance", "good1"),
                        ScenarioChoice("Airplane mode", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You agree in advance: phones elsewhere or shielded, not merely muted.",
                    outcome = Outcome.GOOD, lesson = "Muted phones still record. Agree in advance: elsewhere, or shielded."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust muted phones, and the meeting is recorded by a device on the table.",
                    outcome = Outcome.BAD, lesson = "Muted is not off, and face down is not shielded."),
                "bad2" to ScenarioStep(id = "bad2", text = "You trust airplane mode, which stops transmission, not local recording.",
                    outcome = Outcome.BAD, lesson = "Airplane mode stops radios, not microphones. Recording is local.")
            )
        ),
        Scenario(
            id = "bulk-d090", title = "Speakerphone Surprise",
            intro = "You discuss sensitive matters on a call, unaware the other party has you on speakerphone in a busy office.",
            start = "step1", briefKey = "fieldcraft/secure-comms",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What was exposed?",
                    choices = listOf(
                        ScenarioChoice("Nothing; the call was encrypted", "bad1"),
                        ScenarioChoice("Your words, to everyone near the other party, not just the other party", "step2"),
                        ScenarioChoice("Your number", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you establish for sensitive calls?",
                    choices = listOf(
                        ScenarioChoice("Nothing; trust the other party", "bad1"),
                        ScenarioChoice("Ground rules in advance: private setting, no speakerphone, no extra listeners", "good1"),
                        ScenarioChoice("Shorter calls", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You set ground rules in advance for sensitive calls.",
                    outcome = Outcome.GOOD, lesson = "Speakerphone exposes both sides to everyone nearby. Set ground rules before sensitive calls."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust encryption, which protects against outsiders, not against the other party's room.",
                    outcome = Outcome.BAD, lesson = "Encryption does not cover the other party's surroundings."),
                "bad2" to ScenarioStep(id = "bad2", text = "You shorten calls, but even a short call on speakerphone is fully exposed.",
                    outcome = Outcome.BAD, lesson = "Brevity does not fix speakerphone exposure. Ground rules do.")
            )
        ),
        Scenario(
            id = "bulk-d091", title = "The Whole Life Device",
            intro = "You travel with your everyday phone, holding your whole life: messages, photos, accounts, work.",
            start = "step1", briefKey = "fieldcraft/border-device",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the risk?",
                    choices = listOf(
                        ScenarioChoice("Losing the phone", "bad1"),
                        ScenarioChoice("Border search, copying, or retention exposing your whole life at once", "step2"),
                        ScenarioChoice("Roaming charges", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you travel with instead?",
                    choices = listOf(
                        ScenarioChoice("The same phone, but locked", "bad1"),
                        ScenarioChoice("A clean travel device carrying only trip essentials, with the rest backed up at home", "good1"),
                        ScenarioChoice("No phone", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You travel clean, so a search exposes trip essentials, not your whole life.",
                    outcome = Outcome.GOOD, lesson = "Travel clean: only trip essentials on the device, the rest backed up at home."),
                "bad1" to ScenarioStep(id = "bad1", text = "You travel with your whole life, and a search copies all of it.",
                    outcome = Outcome.BAD, lesson = "A lock does not stop a border search. Minimisation does."),
                "bad2" to ScenarioStep(id = "bad2", text = "You travel with no phone, which is impractical and unnecessary when a clean device works.",
                    outcome = Outcome.BAD, lesson = "Clean travel, not no travel, is the proportionate answer.")
            )
        ),
        Scenario(
            id = "bulk-d092", title = "After the Search",
            intro = "Your device was inspected at a border and returned. You resume using it normally.",
            start = "step1", briefKey = "fieldcraft/border-device",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What should you assume?",
                    choices = listOf(
                        ScenarioChoice("It is fine; it was returned", "bad1"),
                        ScenarioChoice("It may have been copied, modified, or implanted; treat it as potentially compromised", "step2"),
                        ScenarioChoice("It was only looked at", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Keep using it", "bad1"),
                        ScenarioChoice("Check it, update it, and restore from a trusted backup if in doubt", "good1"),
                        ScenarioChoice("Throw it away", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You treat the inspected device as potentially compromised and verify or restore it.",
                    outcome = Outcome.GOOD, lesson = "A returned device is not a clean device. Inspect, update, restore if in doubt."),
                "bad1" to ScenarioStep(id = "bad1", text = "You resume normal use of a device that may have been modified.",
                    outcome = Outcome.BAD, lesson = "Return does not mean untouched. Inspection can include copying or implantation."),
                "bad2" to ScenarioStep(id = "bad2", text = "You discard a usable device without checking whether it needed discarding.",
                    outcome = Outcome.BAD, lesson = "Verify first, discard on evidence — not on fear alone.")
            )
        ),
        Scenario(
            id = "bulk-d093", title = "One Record Shows All",
            intro = "A single bank statement shows your rent, your donations, your travel, and your medical payments — your life in one document.",
            start = "step1", briefKey = "fieldcraft/financial-privacy",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the problem?",
                    choices = listOf(
                        ScenarioChoice("Nothing; statements are private", "bad1"),
                        ScenarioChoice("One record assembling your whole life, available to anyone who obtains it", "step2"),
                        ScenarioChoice("The bank's fees", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What reduces this?",
                    choices = listOf(
                        ScenarioChoice("Paperless statements", "bad1"),
                        ScenarioChoice("Separation: different accounts for different purposes, so no single record shows everything", "good1"),
                        ScenarioChoice("A different bank", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You separate accounts by purpose, so no single record shows your whole life.",
                    outcome = Outcome.GOOD, lesson = "Separation means no single record shows everything. It is compartmentation for money."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust statements to stay private, though they are shared, breached, and requested routinely.",
                    outcome = Outcome.BAD, lesson = "Statements are shared with many parties and breached often. Privacy cannot rely on their secrecy."),
                "bad2" to ScenarioStep(id = "bad2", text = "You switch banks, but one account still shows everything.",
                    outcome = Outcome.BAD, lesson = "The bank is not the problem; the single record is. Separate.")
            )
        ),
        Scenario(
            id = "bulk-d094", title = "The Donation Trail",
            intro = "Your donations, visible in transaction records, reveal your causes, affiliations, and beliefs to anyone who sees them.",
            start = "step1", briefKey = "fieldcraft/financial-privacy",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do transactions reveal?",
                    choices = listOf(
                        ScenarioChoice("Only amounts", "bad1"),
                        ScenarioChoice("Causes, affiliations, beliefs, and patterns, assembled over time", "step2"),
                        ScenarioChoice("Nothing personal", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do for sensitive giving?",
                    choices = listOf(
                        ScenarioChoice("Stop giving", "bad1"),
                        ScenarioChoice("Use a separated account or method that does not link giving to your main financial identity", "good1"),
                        ScenarioChoice("Give in cash only", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You separate sensitive giving, so it does not ride on your main financial identity.",
                    outcome = Outcome.GOOD, lesson = "Transactions reveal beliefs and affiliations. Separate sensitive flows from your main identity."),
                "bad1" to ScenarioStep(id = "bad1", text = "You see only amounts, and miss that recipients reveal beliefs.",
                    outcome = Outcome.BAD, lesson = "Recipients are information. Amounts are the least of what transactions reveal."),
                "bad2" to ScenarioStep(id = "bad2", text = "You give only in cash, which is impractical and unnecessary when separation works.",
                    outcome = Outcome.BAD, lesson = "Cash is one tool, not the only tool. Separation covers more cases.")
            )
        ),
        Scenario(
            id = "bulk-d095", title = "Followed in a New City",
            intro = "In an unfamiliar city, you notice the same person at three different places. You are unsure whether you are followed.",
            start = "step1", briefKey = "fieldcraft/under-surveillance",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Go to your hotel", "bad1"),
                        ScenarioChoice("Stay calm, go to a busy public place, and contact a trusted person", "step2"),
                        ScenarioChoice("Confront them", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you note?",
                    choices = listOf(
                        ScenarioChoice("Your fear", "bad1"),
                        ScenarioChoice("Specifics: appearance, clothing, times, places, direction", "good1"),
                        ScenarioChoice("Nothing; it may be coincidence", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You go public, contact help, and note specifics for later assessment.",
                    outcome = Outcome.GOOD, lesson = "Calm, public, connected, specific: the response to possible surveillance."),
                "bad1" to ScenarioStep(id = "bad1", text = "You lead a possible follower to your hotel, confirming where you stay.",
                    outcome = Outcome.BAD, lesson = "Never lead a follower to where you sleep or meet."),
                "bad2" to ScenarioStep(id = "bad2", text = "You confront a stranger in an unfamiliar city, escalating an uncertain situation.",
                    outcome = Outcome.BAD, lesson = "Confrontation in unfamiliar territory is the riskiest response to uncertainty.")
            )
        ),
        Scenario(
            id = "bulk-d096", title = "Routine as a Tell",
            intro = "Under possible surveillance, you keep your exact daily routine: same café, same time, same route.",
            start = "step1", briefKey = "fieldcraft/under-surveillance",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What does routine give a watcher?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Predictability: where you will be, when, and with whom", "step2"),
                        ScenarioChoice("Comfort", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you vary?",
                    choices = listOf(
                        ScenarioChoice("Nothing; routine is efficient", "bad1"),
                        ScenarioChoice("Times, routes, and places, unpredictably", "good1"),
                        ScenarioChoice("Only the café", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You vary times, routes, and places, breaking the predictability a watcher needs.",
                    outcome = Outcome.GOOD, lesson = "Routine is predictability, and predictability is a watcher's best tool. Vary it."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep an exact routine, and a watcher needs no effort to find you.",
                    outcome = Outcome.BAD, lesson = "An exact routine is a schedule published to anyone watching."),
                "bad2" to ScenarioStep(id = "bad2", text = "You vary only the café, leaving times and routes predictable.",
                    outcome = Outcome.BAD, lesson = "Partial variation leaves the pattern intact. Vary times, routes, and places.")
            )
        ),
        Scenario(
            id = "bulk-d097", title = "The Leaver's Access",
            intro = "A team member leaves, but their access stays live for weeks because nobody owned revocation.",
            start = "step1", briefKey = "fieldcraft/team-opsec",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What failed?",
                    choices = listOf(
                        ScenarioChoice("The member", "bad1"),
                        ScenarioChoice("The process: no owner, no checklist, no deadline for revocation", "step2"),
                        ScenarioChoice("The technology", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you fix?",
                    choices = listOf(
                        ScenarioChoice("Trust leavers more", "bad1"),
                        ScenarioChoice("A departure checklist with an owner and a deadline, plus a review of what the leaver knew", "good1"),
                        ScenarioChoice("Stronger passwords", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You fix the process: owner, checklist, deadline, and a knowledge review.",
                    outcome = Outcome.GOOD, lesson = "Revocation needs an owner, a checklist, and a deadline — or it does not happen."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame the leaver, while the process that left access live stays broken.",
                    outcome = Outcome.BAD, lesson = "Blaming people for process failures leaves the process broken for the next leaver."),
                "bad2" to ScenarioStep(id = "bad2", text = "You strengthen passwords, which does nothing about live access for a departed member.",
                    outcome = Outcome.BAD, lesson = "Password strength is irrelevant when access itself should have been revoked.")
            )
        ),
        Scenario(
            id = "bulk-d098", title = "Briefing the Whole Team",
            intro = "You brief the whole team on a sensitive matter, though only three members need to know.",
            start = "step1", briefKey = "fieldcraft/team-opsec",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did you expand?",
                    choices = listOf(
                        ScenarioChoice("Trust", "bad1"),
                        ScenarioChoice("Exposure: every additional person is another point of compromise", "step2"),
                        ScenarioChoice("Morale", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do next time?",
                    choices = listOf(
                        ScenarioChoice("Brief everyone; transparency matters", "bad1"),
                        ScenarioChoice("Brief by need: only those whose roles require it, with detail limited to the agenda", "good1"),
                        ScenarioChoice("Brief nobody", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You brief by need, limiting both audience and detail.",
                    outcome = Outcome.GOOD, lesson = "Every additional person briefed is another point of compromise. Brief by need."),
                "bad1" to ScenarioStep(id = "bad1", text = "You brief everyone for transparency, and sensitive matter spreads to people who never needed it.",
                    outcome = Outcome.BAD, lesson = "Transparency is not a security value when it expands exposure. Need to know is."),
                "bad2" to ScenarioStep(id = "bad2", text = "You brief nobody, and the work that needed coordination fails.",
                    outcome = Outcome.BAD, lesson = "Briefing nobody is not security; it is abdication. Brief by need.")
            )
        ),
        Scenario(
            id = "bulk-d099", title = "The Routine That Lasts",
            intro = "You design a personal OPSEC routine: ambitious, detailed, and demanding two hours a day. Within a month it collapses.",
            start = "step1", briefKey = "fieldcraft/sustain",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "Why did it collapse?",
                    choices = listOf(
                        ScenarioChoice("Lack of discipline", "bad1"),
                        ScenarioChoice("It was unsustainable: routines must fit ordinary life, or they are abandoned", "step2"),
                        ScenarioChoice("Lack of tools", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you redesign?",
                    choices = listOf(
                        ScenarioChoice("A stricter routine", "bad1"),
                        ScenarioChoice("A smaller routine built into ordinary life: daily habits plus regular reviews", "good1"),
                        ScenarioChoice("No routine", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You redesign small and sustainable, and the routine survives.",
                    outcome = Outcome.GOOD, lesson = "Routines must fit ordinary life. A sustainable routine beats an ambitious collapsed one."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame discipline and design a stricter routine, which collapses faster.",
                    outcome = Outcome.BAD, lesson = "Stricter unsustainable routines fail stricter. Design for sustainability, not ambition."),
                "bad2" to ScenarioStep(id = "bad2", text = "You abandon routines entirely, losing even the habits that worked.",
                    outcome = Outcome.BAD, lesson = "Abandoning routines loses what worked along with what did not.")
            )
        ),
        Scenario(
            id = "bulk-d100", title = "Lapse Without Judgement",
            intro = "You lapse: a password reused, a review skipped. Shame tells you the posture is ruined.",
            start = "step1", briefKey = "fieldcraft/sustain",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is true?",
                    choices = listOf(
                        ScenarioChoice("The posture is ruined", "bad1"),
                        ScenarioChoice("A lapse is a lapse: record it without judgement, fix what you can, continue", "step2"),
                        ScenarioChoice("Lapses do not matter", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do after fixing it?",
                    choices = listOf(
                        ScenarioChoice("Restart from zero", "bad1"),
                        ScenarioChoice("Continue, with the lapse as a lesson about what made it happen", "good1"),
                        ScenarioChoice("Hide it", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You record, fix, learn, and continue — the posture intact.",
                    outcome = Outcome.GOOD, lesson = "Lapses are recorded without judgement, fixed where possible, and learned from. Only quitting is failure."),
                "bad1" to ScenarioStep(id = "bad1", text = "You declare the posture ruined over one lapse, and quit.",
                    outcome = Outcome.BAD, lesson = "Shame over a lapse destroys more posture than the lapse itself."),
                "bad2" to ScenarioStep(id = "bad2", text = "You hide the lapse, so its cause is never fixed and it recurs.",
                    outcome = Outcome.BAD, lesson = "Hidden lapses recur. Recorded lapses teach.")
            )
        )
    )
}
