package com.abybijo.agent0.data

/** v2.0 Phase 4c bulk drills, batch 5: 41 drills, a second drill per brief, for CH-12 to CH-15. */
object ScenariosBulk5 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "bulk-d131", title = "The Call You Must Not Delay",
            intro = "You discover a compromise involving another person who may be in danger. You hesitate, unsure whether to report.",
            start = "step1", briefKey = "incident/ir-first-hour",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What comes first?",
                    choices = listOf(
                        ScenarioChoice("Protecting information", "bad1"),
                        ScenarioChoice("Safety: get real-world help first; Rule 1 never means do not report", "step2"),
                        ScenarioChoice("Investigating fully first", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do in parallel?",
                    choices = listOf(
                        ScenarioChoice("Nothing else", "bad1"),
                        ScenarioChoice("Contain what you can, preserve evidence, and contact trusted help", "good1"),
                        ScenarioChoice("Warn everyone publicly", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You prioritise safety, contain, preserve, and get help — in that order.",
                    outcome = Outcome.GOOD, lesson = "Safety first, always. Rule 1 never means do not report."),
                "bad1" to ScenarioStep(id = "bad1", text = "You protect information while a person stays in danger.",
                    outcome = Outcome.BAD, lesson = "Information protection serves safety. Reversing that order endangers people."),
                "bad2" to ScenarioStep(id = "bad2", text = "You investigate fully before helping, and danger continues during the investigation.",
                    outcome = Outcome.BAD, lesson = "Investigation follows safety, not the reverse.")
            )
        ),
        Scenario(
            id = "bulk-d132", title = "Evidence on a Phone",
            intro = "Key evidence of an incident lives only on a phone that is about to run out of battery and may be wiped remotely.",
            start = "step1", briefKey = "incident/ir-evidence",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Let it die", "bad1"),
                        ScenarioChoice("Preserve it: charge, isolate from networks, and copy it securely", "step2"),
                        ScenarioChoice("Scroll through it", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you handle the copy?",
                    choices = listOf(
                        ScenarioChoice("Share it widely", "bad1"),
                        ScenarioChoice("Keep it intact, dated, and access-controlled", "good1"),
                        ScenarioChoice("Edit out embarrassing parts", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You preserve the evidence intact, dated, and access-controlled.",
                    outcome = Outcome.GOOD, lesson = "Evidence must be preserved intact, dated, and access-controlled, or it loses value."),
                "bad1" to ScenarioStep(id = "bad1", text = "You let the only evidence die or be wiped.",
                    outcome = Outcome.BAD, lesson = "Unpreserved evidence is lost evidence. Act before it disappears."),
                "bad2" to ScenarioStep(id = "bad2", text = "You edit evidence, destroying its credibility for any investigation.",
                    outcome = Outcome.BAD, lesson = "Edited evidence is worthless evidence. Preserve intact, always.")
            )
        ),
        Scenario(
            id = "bulk-d133", title = "Sessions Everywhere",
            intro = "After a compromise, you change your password — but old sessions stay logged in on other devices.",
            start = "step1", briefKey = "incident/ir-account",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did you miss?",
                    choices = listOf(
                        ScenarioChoice("Nothing; the password is changed", "bad1"),
                        ScenarioChoice("Active sessions: the attacker stays logged in despite the new password", "step2"),
                        ScenarioChoice("The username", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What completes the lockdown?",
                    choices = listOf(
                        ScenarioChoice("A longer password", "bad1"),
                        ScenarioChoice("Revoking all sessions, from a clean device, plus stronger authentication", "good1"),
                        ScenarioChoice("Logging out locally", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You revoke all sessions from a clean device and strengthen authentication.",
                    outcome = Outcome.GOOD, lesson = "A password change without session revocation leaves the attacker logged in."),
                "bad1" to ScenarioStep(id = "bad1", text = "You change the password and call it done, while the attacker session continues.",
                    outcome = Outcome.BAD, lesson = "Sessions survive password changes. Revoke them all."),
                "bad2" to ScenarioStep(id = "bad2", text = "You log out locally, which does nothing about remote sessions.",
                    outcome = Outcome.BAD, lesson = "Local logout is not session revocation. Revoke everywhere.")
            )
        ),
        Scenario(
            id = "bulk-d134", title = "Device or Data?",
            intro = "A device is compromised. You must decide: clean it, or rebuild it from scratch?",
            start = "step1", briefKey = "incident/ir-device",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "When is rebuilding right?",
                    choices = listOf(
                        ScenarioChoice("Always", "bad1"),
                        ScenarioChoice("When compromise is deep or uncertain — a rebuild from trusted media is more trustworthy", "step2"),
                        ScenarioChoice("Never", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do with data before rebuilding?",
                    choices = listOf(
                        ScenarioChoice("Restore everything blindly", "bad1"),
                        ScenarioChoice("Restore only verified-clean data from a trusted backup, after checking it", "good1"),
                        ScenarioChoice("Lose it all", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You rebuild from trusted media and restore only verified-clean data.",
                    outcome = Outcome.GOOD, lesson = "Deep or uncertain compromise deserves a rebuild, with only verified-clean data restored."),
                "bad1" to ScenarioStep(id = "bad1", text = "You rebuild for every minor issue, wasting time and data.",
                    outcome = Outcome.BAD, lesson = "Rebuilding everything for minor issues is disproportionate. Match response to depth."),
                "bad2" to ScenarioStep(id = "bad2", text = "You restore everything blindly, reintroducing the compromise you just removed.",
                    outcome = Outcome.BAD, lesson = "Blind restore reintroduces compromise. Restore verified-clean data only.")
            )
        ),
        Scenario(
            id = "bulk-d135", title = "Breach Letter",
            intro = "You receive a breach notice: your data was exposed months ago, and you are only now told.",
            start = "step1", briefKey = "incident/ir-breach",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Ignore it; it is old", "bad1"),
                        ScenarioChoice("Act as if exposure is live: change affected credentials, strengthen authentication, watch for misuse", "step2"),
                        ScenarioChoice("Sue immediately", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you watch for?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Unusual logins, messages, transactions, and impersonation, over time", "good1"),
                        ScenarioChoice("News coverage", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You act on the old breach as if live, and monitor for misuse over time.",
                    outcome = Outcome.GOOD, lesson = "Old breaches are still live exposure. Act, and monitor over time — breached data is used slowly."),
                "bad1" to ScenarioStep(id = "bad1", text = "You ignore an old breach, and the exposed data is used against you later.",
                    outcome = Outcome.BAD, lesson = "Age does not retire breached data. It is used when convenient, not when fresh."),
                "bad2" to ScenarioStep(id = "bad2", text = "You pursue legal action before securing your accounts, leaving them open.",
                    outcome = Outcome.BAD, lesson = "Secure first, litigate second. Open accounts do not wait for courts.")
            )
        ),
        Scenario(
            id = "bulk-d136", title = "Account in Your Name",
            intro = "Someone opens an account in your name. You discover it from a statement you did not expect.",
            start = "step1", briefKey = "incident/ir-identity-theft",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Wait to see if it happens again", "bad1"),
                        ScenarioChoice("Act quickly: contact the institution, freeze credit where available, document everything", "step2"),
                        ScenarioChoice("Close your own accounts", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you document?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Dates, amounts, contacts, reference numbers — everything, in order", "good1"),
                        ScenarioChoice("Your feelings", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You act fast and document thoroughly, giving institutions what they need to help.",
                    outcome = Outcome.GOOD, lesson = "Identity theft demands speed and documentation. Both, together, are what institutions act on."),
                "bad1" to ScenarioStep(id = "bad1", text = "You wait, and the fraudulent account accumulates debt in your name.",
                    outcome = Outcome.BAD, lesson = "Waiting lets fraudulent accounts grow. Act at first discovery."),
                "bad2" to ScenarioStep(id = "bad2", text = "You close your own accounts, harming yourself while the fraudulent one continues.",
                    outcome = Outcome.BAD, lesson = "Close the fraudulent account, not your own. Target the fraud.")
            )
        ),
        Scenario(
            id = "bulk-d137", title = "Reporting, Done Right",
            intro = "You report an incident to authorities. The officer asks for details you have not organised.",
            start = "step1", briefKey = "incident/ir-reporting",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What makes a report useful?",
                    choices = listOf(
                        ScenarioChoice("Emotion", "bad1"),
                        ScenarioChoice("Facts: what happened, when, what evidence exists, what harm resulted", "step2"),
                        ScenarioChoice("Suspicions", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you bring?",
                    choices = listOf(
                        ScenarioChoice("Your opinions", "bad1"),
                        ScenarioChoice("An organised timeline with evidence, dates, and reference numbers", "good1"),
                        ScenarioChoice("A lawyer", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You report with facts and an organised timeline, and the report is acted on.",
                    outcome = Outcome.GOOD, lesson = "Reports need facts: what, when, evidence, harm. Organised timelines get acted on."),
                "bad1" to ScenarioStep(id = "bad1", text = "You report with emotion and suspicion, and the report stalls.",
                    outcome = Outcome.BAD, lesson = "Emotion and suspicion slow reports. Facts move them."),
                "bad2" to ScenarioStep(id = "bad2", text = "You bring a lawyer before bringing facts, and the report still lacks substance.",
                    outcome = Outcome.BAD, lesson = "Representation does not substitute for facts. Bring the timeline.")
            )
        ),
        Scenario(
            id = "bulk-d138", title = "Talking to Family",
            intro = "After an incident, family asks what happened. You want to reassure them, but details are sensitive and an investigation is ongoing.",
            start = "step1", briefKey = "incident/ir-talking",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you share?",
                    choices = listOf(
                        ScenarioChoice("Everything; family deserves it", "bad1"),
                        ScenarioChoice("What they need to stay safe, without sensitive details or investigation specifics", "step2"),
                        ScenarioChoice("Nothing", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why limit detail?",
                    choices = listOf(
                        ScenarioChoice("To be secretive", "bad1"),
                        ScenarioChoice("Because detail can leak further, harm investigations, and expose others", "good1"),
                        ScenarioChoice("Because it is embarrassing", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You share safety-relevant information and withhold sensitive detail.",
                    outcome = Outcome.GOOD, lesson = "Share what people need to stay safe, not investigation details. Detail leaks and harms."),
                "bad1" to ScenarioStep(id = "bad1", text = "You share everything, and sensitive detail spreads through family networks.",
                    outcome = Outcome.BAD, lesson = "Family networks spread information fast. Share safety, not detail."),
                "bad2" to ScenarioStep(id = "bad2", text = "You share nothing, leaving family unprotected and anxious.",
                    outcome = Outcome.BAD, lesson = "Silence leaves people unprotected. Share what they need to stay safe.")
            )
        ),
        Scenario(
            id = "bulk-d139", title = "Checklist, Item by Item",
            intro = "Recovery is underway. You feel 'mostly done' but have no checklist, and cannot say what remains.",
            start = "step1", briefKey = "incident/ir-recovery-checklist",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is missing?",
                    choices = listOf(
                        ScenarioChoice("Effort", "bad1"),
                        ScenarioChoice("A checklist: every compromised item, each with a fix and a verification step", "step2"),
                        ScenarioChoice("Time", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "When is an item done?",
                    choices = listOf(
                        ScenarioChoice("When you fix it", "bad1"),
                        ScenarioChoice("When the fix is verified, not merely applied", "good1"),
                        ScenarioChoice("When you feel done", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You build the checklist and verify each fix, so 'done' means verified.",
                    outcome = Outcome.GOOD, lesson = "Recovery needs a checklist, and items are done when verified, not when fixed."),
                "bad1" to ScenarioStep(id = "bad1", text = "You feel mostly done, while compromised items remain unverified and open.",
                    outcome = Outcome.BAD, lesson = "'Mostly done' without a checklist is mostly unknown."),
                "bad2" to ScenarioStep(id = "bad2", text = "You feel done, which is a feeling, not a verification.",
                    outcome = Outcome.BAD, lesson = "Feelings are not verifications. Check each item.")
            )
        ),
        Scenario(
            id = "bulk-d140", title = "Review That Changes Things",
            intro = "Your after-action review produces a long report. Nobody changes any procedure as a result.",
            start = "step1", briefKey = "incident/ir-after-action",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What failed?",
                    choices = listOf(
                        ScenarioChoice("The incident", "bad1"),
                        ScenarioChoice("The review: it produced a report, not changes", "step2"),
                        ScenarioChoice("The team", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What must a review produce?",
                    choices = listOf(
                        ScenarioChoice("A report", "bad1"),
                        ScenarioChoice("Concrete changes: updated procedures, controls, and training, with owners", "good1"),
                        ScenarioChoice("Blame", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You convert the review into owned, concrete changes, and the next incident meets better defences.",
                    outcome = Outcome.GOOD, lesson = "A review that produces no changes is a ritual. Changes with owners are the product."),
                "bad1" to ScenarioStep(id = "bad1", text = "You file a long report, and the same failure recurs unchanged.",
                    outcome = Outcome.BAD, lesson = "Reports without changes are filing, not learning."),
                "bad2" to ScenarioStep(id = "bad2", text = "You assign blame, and future incidents go unreported.",
                    outcome = Outcome.BAD, lesson = "Blame suppresses the reporting that reviews depend on.")
            )
        ),
        Scenario(
            id = "bulk-d141", title = "Shadow in the Search Results",
            intro = "Searching your name, you find old posts, photos, and records forming a detailed picture you never assembled yourself.",
            start = "step1", briefKey = "osint/osint-shadow",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is this picture?",
                    choices = listOf(
                        ScenarioChoice("Your reputation", "bad1"),
                        ScenarioChoice("Your digital shadow: what public data assembles about you", "step2"),
                        ScenarioChoice("Gossip", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Who reads it?",
                    choices = listOf(
                        ScenarioChoice("Nobody", "bad1"),
                        ScenarioChoice("Adversaries, employers, strangers — anyone who searches", "good1"),
                        ScenarioChoice("Only friends", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You accept that your shadow is public reading material, and start managing it.",
                    outcome = Outcome.GOOD, lesson = "Your shadow is read by anyone who searches. Manage it as public material."),
                "bad1" to ScenarioStep(id = "bad1", text = "You treat the shadow as reputation, missing that it is also targeting material.",
                    outcome = Outcome.BAD, lesson = "A shadow is not just reputation; it is also a map for adversaries."),
                "bad2" to ScenarioStep(id = "bad2", text = "You assume nobody reads it, while search makes it available to everyone.",
                    outcome = Outcome.BAD, lesson = "Search makes shadows universal reading. Assume readers.")
            )
        ),
        Scenario(
            id = "bulk-d142", title = "Audit, Then Act",
            intro = "Your self-audit finds twenty exposures. You feel overwhelmed and do nothing.",
            start = "step1", briefKey = "osint/osint-self-audit",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do with twenty exposures?",
                    choices = listOf(
                        ScenarioChoice("Nothing; too many", "bad1"),
                        ScenarioChoice("Prioritise by sensitivity and fix in order, starting with the worst", "step2"),
                        ScenarioChoice("Fix the easiest first", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why prioritise?",
                    choices = listOf(
                        ScenarioChoice("For efficiency", "bad1"),
                        ScenarioChoice("Because the worst exposures cause the most harm, and fixing them first reduces risk fastest", "good1"),
                        ScenarioChoice("For morale", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You prioritise by sensitivity and work through the list, worst first.",
                    outcome = Outcome.GOOD, lesson = "Audits overwhelm unless prioritised. Worst first reduces risk fastest."),
                "bad1" to ScenarioStep(id = "bad1", text = "You do nothing because there are too many, and all twenty stay exposed.",
                    outcome = Outcome.BAD, lesson = "Overwhelm is the audit's trap. Prioritisation is the escape."),
                "bad2" to ScenarioStep(id = "bad2", text = "You fix the easiest first, feeling productive while the worst exposures remain.",
                    outcome = Outcome.BAD, lesson = "Easiest-first feels productive and protects least. Worst-first protects most.")
            )
        ),
        Scenario(
            id = "bulk-d143", title = "Post in Haste",
            intro = "Excited, you post a photo from an event: location tagged, friends tagged, time stamped.",
            start = "step1", briefKey = "osint/osint-social",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did the post reveal?",
                    choices = listOf(
                        ScenarioChoice("Your excitement", "bad1"),
                        ScenarioChoice("Location, companions, and timing — in one post", "step2"),
                        ScenarioChoice("Nothing", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you check before posting next time?",
                    choices = listOf(
                        ScenarioChoice("Your grammar", "bad1"),
                        ScenarioChoice("What the post reveals: location, people, documents, patterns — now and in aggregate", "good1"),
                        ScenarioChoice("Your followers", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You check reveals before posting, and delay or strip location and tags.",
                    outcome = Outcome.GOOD, lesson = "Check what a post reveals — location, people, patterns — now and in aggregate."),
                "bad1" to ScenarioStep(id = "bad1", text = "You post in excitement, and one post maps your whereabouts and company.",
                    outcome = Outcome.BAD, lesson = "Excitement posts fastest and reveals most. Check before posting."),
                "bad2" to ScenarioStep(id = "bad2", text = "You check followers, who are not the ones assembling your shadow.",
                    outcome = Outcome.BAD, lesson = "Followers are not the audience that matters. Searchers and scrapers are.")
            )
        ),
        Scenario(
            id = "bulk-d144", title = "Broker, Again",
            intro = "You opt out of a data broker. Six months later, your details are back on the same broker.",
            start = "step1", briefKey = "osint/osint-brokers",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "Why did it return?",
                    choices = listOf(
                        ScenarioChoice("You did it wrong", "bad1"),
                        ScenarioChoice("Broker data reappears from new sources over time; removal is maintenance, not a one-time fix", "step2"),
                        ScenarioChoice("Brokers are illegal", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Give up", "bad1"),
                        ScenarioChoice("Repeat opt-outs on a schedule, and reduce the sources feeding brokers", "good1"),
                        ScenarioChoice("Sue the broker", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You schedule repeated opt-outs and reduce source data, keeping exposure lower over time.",
                    outcome = Outcome.GOOD, lesson = "Broker removal is maintenance: repeat on a schedule, and reduce source data."),
                "bad1" to ScenarioStep(id = "bad1", text = "You give up after one return, and exposure grows unchecked.",
                    outcome = Outcome.BAD, lesson = "One opt-out is not a cure. Giving up after a return surrenders the field."),
                "bad2" to ScenarioStep(id = "bad2", text = "You pursue legal action while the data stays live and spreading.",
                    outcome = Outcome.BAD, lesson = "Legal action is slow; data spreads fast. Maintain opt-outs in parallel.")
            )
        ),
        Scenario(
            id = "bulk-d145", title = "Removal, Partially Done",
            intro = "You remove yourself from major brokers, but your details remain in public records and old accounts.",
            start = "step1", briefKey = "osint/osint-removal",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What remains?",
                    choices = listOf(
                        ScenarioChoice("Nothing important", "bad1"),
                        ScenarioChoice("Public records and old accounts, which brokers and searchers also draw on", "step2"),
                        ScenarioChoice("Only brokers", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is the complete approach?",
                    choices = listOf(
                        ScenarioChoice("Brokers only", "bad1"),
                        ScenarioChoice("Systematic removal: brokers, old accounts, and public records, repeated over time", "good1"),
                        ScenarioChoice("A new name", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You expand removal systematically across brokers, accounts, and records.",
                    outcome = Outcome.GOOD, lesson = "Removal must be systematic: brokers, accounts, records — repeated over time."),
                "bad1" to ScenarioStep(id = "bad1", text = "You stop at brokers, leaving records and accounts feeding new broker entries.",
                    outcome = Outcome.BAD, lesson = "Brokers refill from records and accounts. Removal must cover sources too."),
                "bad2" to ScenarioStep(id = "bad2", text = "You change your name, while records under the old name remain public.",
                    outcome = Outcome.BAD, lesson = "A new name does not erase old records. Remove sources, not just labels.")
            )
        ),
        Scenario(
            id = "bulk-d146", title = "Recorded Talk",
            intro = "You give a public talk. An audience member records it, clips a sentence out of context, and posts it.",
            start = "step1", briefKey = "osint/osint-public-speaking",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What should you have accepted in advance?",
                    choices = listOf(
                        ScenarioChoice("That talks are private", "bad1"),
                        ScenarioChoice("That public speaking creates permanent, shareable, clippable records", "step2"),
                        ScenarioChoice("That audiences are kind", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you decide before speaking?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("What you are willing to have recorded, clipped, and shared permanently", "good1"),
                        ScenarioChoice("To avoid controversy", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You decide in advance what you accept as permanently recorded, and speak within it.",
                    outcome = Outcome.GOOD, lesson = "Public speaking is permanent recording. Decide in advance what you accept as recorded."),
                "bad1" to ScenarioStep(id = "bad1", text = "You assume a talk is private, and a clip out of context defines you.",
                    outcome = Outcome.BAD, lesson = "No public talk is private. Clips, not context, travel."),
                "bad2" to ScenarioStep(id = "bad2", text = "You avoid controversy entirely, which is not a decision about recording.",
                    outcome = Outcome.BAD, lesson = "Avoiding controversy does not avoid recording. Decide what you accept recorded.")
            )
        ),
        Scenario(
            id = "bulk-d147", title = "Children in the Frame",
            intro = "You post family photos including children, with school uniforms and locations visible.",
            start = "step1", briefKey = "osint/osint-personal-life",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is at stake?",
                    choices = listOf(
                        ScenarioChoice("Nothing; family photos are normal", "bad1"),
                        ScenarioChoice("Children's privacy and safety: uniforms, locations, and routines identify and locate them", "step2"),
                        ScenarioChoice("Your privacy only", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Post less often", "bad1"),
                        ScenarioChoice("Share family photos privately, with identifying details removed, and never with locations or routines", "good1"),
                        ScenarioChoice("Use filters", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You move family photos to private sharing, stripped of identifying details.",
                    outcome = Outcome.GOOD, lesson = "Children did not choose exposure. Share family privately, stripped of identifying detail."),
                "bad1" to ScenarioStep(id = "bad1", text = "You post normally, and children's schools, locations, and routines become public.",
                    outcome = Outcome.BAD, lesson = "Normal family posting exposes children who cannot consent to it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You filter photos, leaving uniforms and locations visible.",
                    outcome = Outcome.BAD, lesson = "Filters do not remove uniforms, locations, or metadata.")
            )
        ),
        Scenario(
            id = "bulk-d148", title = "House for Sale",
            intro = "Your home is listed for sale, with photos of every room, floor plans, and the address public.",
            start = "step1", briefKey = "osint/osint-household",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What does the listing reveal?",
                    choices = listOf(
                        ScenarioChoice("Only the price", "bad1"),
                        ScenarioChoice("Layout, valuables, security, routines, and address — a full household map", "step2"),
                        ScenarioChoice("Nothing new", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Nothing; listings are normal", "bad1"),
                        ScenarioChoice("Minimise listing detail, remove valuables and personal items from photos, and control viewings", "good1"),
                        ScenarioChoice("Raise the price", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You minimise the listing and control viewings, reducing the household map.",
                    outcome = Outcome.GOOD, lesson = "Sale listings map households: layout, valuables, security. Minimise detail and control viewings."),
                "bad1" to ScenarioStep(id = "bad1", text = "You accept a full listing as normal, publishing a household map to everyone.",
                    outcome = Outcome.BAD, lesson = "Normal listings are complete household maps. Normal is not safe."),
                "bad2" to ScenarioStep(id = "bad2", text = "You raise the price, which changes nothing about the map published.",
                    outcome = Outcome.BAD, lesson = "Price does not protect layout, valuables, or security details.")
            )
        ),
        Scenario(
            id = "bulk-d149", title = "Public Role, Private Life",
            intro = "Your public role grows. Fans and critics seek your private address, family, and routines.",
            start = "step1", briefKey = "osint/osint-public-roles",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the tension?",
                    choices = listOf(
                        ScenarioChoice("None", "bad1"),
                        ScenarioChoice("Visibility is required, but it expands shadow and exposure", "step2"),
                        ScenarioChoice("Fame", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "How do you manage it?",
                    choices = listOf(
                        ScenarioChoice("Share everything", "bad1"),
                        ScenarioChoice("Separate public and private: a public persona, with private life protected behind boundaries", "good1"),
                        ScenarioChoice("Quit the role", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You separate public persona from private life, with real boundaries between them.",
                    outcome = Outcome.GOOD, lesson = "Public roles require separation: a public persona, private life behind boundaries."),
                "bad1" to ScenarioStep(id = "bad1", text = "You share everything, and private life becomes public property.",
                    outcome = Outcome.BAD, lesson = "Sharing everything dissolves the boundary that protects private life."),
                "bad2" to ScenarioStep(id = "bad2", text = "You quit a role that separation could have sustained.",
                    outcome = Outcome.BAD, lesson = "Quitting is not the only answer to exposure. Separation sustains public roles.")
            )
        ),
        Scenario(
            id = "bulk-d150", title = "The Untouched Core",
            intro = "Everything about you is becoming public: work, opinions, routines. You realise nothing remains private.",
            start = "step1", briefKey = "osint/osint-private-core",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "Why does that matter?",
                    choices = listOf(
                        ScenarioChoice("It does not; transparency is good", "bad1"),
                        ScenarioChoice("A life with no private core has no fallback when public exposure grows", "step2"),
                        ScenarioChoice("It is lonely", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you protect?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("A core: people, places, and routines that never become public", "good1"),
                        ScenarioChoice("Your opinions", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You deliberately keep a private core untouched by public life.",
                    outcome = Outcome.GOOD, lesson = "A private core is a fallback: people, places, routines that never become public."),
                "bad1" to ScenarioStep(id = "bad1", text = "You embrace total transparency, and have nothing untouched when exposure turns hostile.",
                    outcome = Outcome.BAD, lesson = "Total transparency leaves no fallback. Hostile exposure then reaches everything."),
                "bad2" to ScenarioStep(id = "bad2", text = "You protect opinions while routines and locations stay public.",
                    outcome = Outcome.BAD, lesson = "Opinions are the least of it. People, places, and routines are the core.")
            )
        ),
        Scenario(
            id = "bulk-d151", title = "Trip, Unmodelled",
            intro = "You travel to a new country with no threat model: no research on crime, surveillance, border rules, or data risks.",
            start = "step1", briefKey = "travel/travel-threat-model",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is missing?",
                    choices = listOf(
                        ScenarioChoice("Nothing; travel is routine", "bad1"),
                        ScenarioChoice("A structured assessment: destination, route, activities, data carried", "step2"),
                        ScenarioChoice("A guidebook", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you research?",
                    choices = listOf(
                        ScenarioChoice("Only hotels", "bad1"),
                        ScenarioChoice("Crime, surveillance, border rules, health, and data exposure for this destination", "good1"),
                        ScenarioChoice("Only weather", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You research the destination's risks and model the trip before leaving.",
                    outcome = Outcome.GOOD, lesson = "Travel needs a threat model: destination, route, activities, data — researched, not assumed."),
                "bad1" to ScenarioStep(id = "bad1", text = "You treat travel as routine, and destination-specific risks meet you unprepared.",
                    outcome = Outcome.BAD, lesson = "Routine travel is not risk-free travel. Destinations differ."),
                "bad2" to ScenarioStep(id = "bad2", text = "You research hotels only, missing crime, surveillance, and border rules.",
                    outcome = Outcome.BAD, lesson = "Hotels are the least of travel risk. Model the rest.")
            )
        ),
        Scenario(
            id = "bulk-d152", title = "Packed Everything",
            intro = "You pack every device and every document 'just in case', for a short trip.",
            start = "step1", briefKey = "travel/travel-packing",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did you maximise?",
                    choices = listOf(
                        ScenarioChoice("Convenience", "bad1"),
                        ScenarioChoice("Exposure: everything you own is now subject to travel risk at once", "step2"),
                        ScenarioChoice("Weight", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you pack instead?",
                    choices = listOf(
                        ScenarioChoice("The same, but in a better bag", "bad1"),
                        ScenarioChoice("Only what the trip needs, with the rest backed up at home", "good1"),
                        ScenarioChoice("Nothing", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You pack trip essentials only, leaving the rest backed up at home.",
                    outcome = Outcome.GOOD, lesson = "Pack only what the trip needs. 'Just in case' maximises travel exposure."),
                "bad1" to ScenarioStep(id = "bad1", text = "You pack everything, and one bag loss or search exposes your whole life.",
                    outcome = Outcome.BAD, lesson = "'Just in case' is how a short trip carries your whole life into risk."),
                "bad2" to ScenarioStep(id = "bad2", text = "You pack nothing, which is impractical and unnecessary when essentials suffice.",
                    outcome = Outcome.BAD, lesson = "Essentials, not everything and not nothing, are the packing standard.")
            )
        ),
        Scenario(
            id = "bulk-d153", title = "Rules You Did Not Read",
            intro = "At a border, you learn the destination's device search rules are far stricter than you assumed.",
            start = "step1", briefKey = "travel/travel-border",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What should you have known?",
                    choices = listOf(
                        ScenarioChoice("Nothing; borders are similar", "bad1"),
                        ScenarioChoice("The destination's specific border search rules, and your advance plan", "step2"),
                        ScenarioChoice("The language", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do now?",
                    choices = listOf(
                        ScenarioChoice("Argue", "bad1"),
                        ScenarioChoice("Stay calm, follow your advance plan as far as possible, and note what happens", "good1"),
                        ScenarioChoice("Surrender everything", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You stay calm and follow what plan you have, learning to research rules before the next crossing.",
                    outcome = Outcome.GOOD, lesson = "Border rules vary by country and are general information, not legal advice — research them before travel."),
                "bad1" to ScenarioStep(id = "bad1", text = "You assume borders are similar, and stricter rules meet you unprepared.",
                    outcome = Outcome.BAD, lesson = "Border rules are not universal. Assuming similarity is the error."),
                "bad2" to ScenarioStep(id = "bad2", text = "You argue with border officers, escalating a situation you cannot win.",
                    outcome = Outcome.BAD, lesson = "Arguing at a border escalates without changing the rules.")
            )
        ),
        Scenario(
            id = "bulk-d154", title = "Clean, But Not Backed Up",
            intro = "You travel with a clean device — but you never backed up the data you removed, and you need it mid-trip.",
            start = "step1", briefKey = "travel/travel-clean-device",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What was half-done?",
                    choices = listOf(
                        ScenarioChoice("The cleaning", "bad1"),
                        ScenarioChoice("The backup: minimisation without backup leaves needed data inaccessible", "step2"),
                        ScenarioChoice("The trip", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What is the complete preparation?",
                    choices = listOf(
                        ScenarioChoice("Clean only", "bad1"),
                        ScenarioChoice("Minimise, back up verifiably, and arrange secure access to the backup if needed", "good1"),
                        ScenarioChoice("Back up only", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You complete the pair: minimise plus verifiable backup, with secure access arranged.",
                    outcome = Outcome.GOOD, lesson = "Clean travel needs both halves: minimisation and a verifiable backup."),
                "bad1" to ScenarioStep(id = "bad1", text = "You clean without backing up, and needed data is gone for the trip.",
                    outcome = Outcome.BAD, lesson = "Minimisation without backup is data loss, not security."),
                "bad2" to ScenarioStep(id = "bad2", text = "You back up without minimising, and the device still carries everything.",
                    outcome = Outcome.BAD, lesson = "Backup without minimisation leaves travel exposure unchanged.")
            )
        ),
        Scenario(
            id = "bulk-d155", title = "Hotel Safe, False Comfort",
            intro = "You lock valuables in the hotel room safe, assuming it is secure. Hotel staff hold override codes.",
            start = "step1", briefKey = "travel/travel-hotels",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the safe's limit?",
                    choices = listOf(
                        ScenarioChoice("None; safes are secure", "bad1"),
                        ScenarioChoice("Staff overrides: hotel safes are accessible to staff", "step2"),
                        ScenarioChoice("Its size", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do with truly sensitive items?",
                    choices = listOf(
                        ScenarioChoice("Use the safe anyway", "bad1"),
                        ScenarioChoice("Carry them, or use a genuinely controlled store — never rely on a hotel safe alone", "good1"),
                        ScenarioChoice("Hide them in the room", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You carry sensitive items or store them under real control, not hotel-safe trust.",
                    outcome = Outcome.GOOD, lesson = "Hotel safes have staff overrides. They are convenience, not security, for sensitive items."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust the hotel safe, and staff override access makes that trust misplaced.",
                    outcome = Outcome.BAD, lesson = "A safe with a staff override is not a safe against staff."),
                "bad2" to ScenarioStep(id = "bad2", text = "You hide valuables in the room, which any search finds.",
                    outcome = Outcome.BAD, lesson = "Hiding in a hotel room is not storing. Rooms are searched routinely.")
            )
        ),
        Scenario(
            id = "bulk-d156", title = "Conference Wi-Fi",
            intro = "At a conference, you join the event Wi-Fi and access sensitive work systems without any protection.",
            start = "step1", briefKey = "travel/travel-networks",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is the network?",
                    choices = listOf(
                        ScenarioChoice("Trusted; it is an official event network", "bad1"),
                        ScenarioChoice("Untrusted: large, open, and full of strangers", "step2"),
                        ScenarioChoice("Safe with a password", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What protects sensitive access here?",
                    choices = listOf(
                        ScenarioChoice("Nothing needed", "bad1"),
                        ScenarioChoice("Encrypted connections everywhere, plus a trusted VPN, and avoiding sensitive systems where possible", "good1"),
                        ScenarioChoice("A strong password", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You protect every connection and defer sensitive access to a trusted network.",
                    outcome = Outcome.GOOD, lesson = "Event networks are untrusted regardless of official status. Encrypt everything, defer sensitive access."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust an official event network, and strangers on it observe your traffic.",
                    outcome = Outcome.BAD, lesson = "Official does not mean trusted. Large open networks are hostile by default."),
                "bad2" to ScenarioStep(id = "bad2", text = "You trust a Wi-Fi password, which every attendee also has.",
                    outcome = Outcome.BAD, lesson = "A shared password is not a private network. Everyone has it.")
            )
        ),
        Scenario(
            id = "bulk-d157", title = "Meeting in a Loud Place",
            intro = "You hold a sensitive meeting in a busy restaurant, believing background noise provides privacy.",
            start = "step1", briefKey = "travel/travel-meetings",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "Does noise provide privacy?",
                    choices = listOf(
                        ScenarioChoice("Yes; noise covers voices", "bad1"),
                        ScenarioChoice("No: nearby listeners, staff, and recordings all defeat noise", "step2"),
                        ScenarioChoice("Partly", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Where should sensitive meetings happen?",
                    choices = listOf(
                        ScenarioChoice("Anywhere busy", "bad1"),
                        ScenarioChoice("A place you control: private, with device management agreed", "good1"),
                        ScenarioChoice("Anywhere quiet", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You move sensitive meetings to controlled places with agreed device rules.",
                    outcome = Outcome.GOOD, lesson = "Noise is not privacy. Controlled places and device rules are."),
                "bad1" to ScenarioStep(id = "bad1", text = "You trust restaurant noise, and neighbours, staff, and phones capture the meeting.",
                    outcome = Outcome.BAD, lesson = "Noise covers nothing reliably. Listeners adapt; recordings do not need quiet."),
                "bad2" to ScenarioStep(id = "bad2", text = "You choose a quiet place, which makes eavesdropping easier, not harder.",
                    outcome = Outcome.BAD, lesson = "Quiet helps listeners. Control, not ambience, makes a meeting private.")
            )
        ),
        Scenario(
            id = "bulk-d158", title = "Watcher at the Market",
            intro = "Travelling, you notice the same person at the market, the museum, and your hotel lobby.",
            start = "step1", briefKey = "travel/travel-surveillance",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Return to the hotel", "bad1"),
                        ScenarioChoice("Go to a busy public place, contact a trusted person, and note specifics", "step2"),
                        ScenarioChoice("Confront them", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you note?",
                    choices = listOf(
                        ScenarioChoice("Your feelings", "bad1"),
                        ScenarioChoice("Specifics: appearance, times, places, direction", "good1"),
                        ScenarioChoice("Nothing", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You go public, contact help, and note specifics for later assessment.",
                    outcome = Outcome.GOOD, lesson = "Possible surveillance while travelling: go public, contact help, note specifics."),
                "bad1" to ScenarioStep(id = "bad1", text = "You return to the hotel, leading a possible watcher to where you sleep.",
                    outcome = Outcome.BAD, lesson = "Never lead a possible watcher to your lodging."),
                "bad2" to ScenarioStep(id = "bad2", text = "You confront a stranger in a foreign place, escalating uncertainty into conflict.",
                    outcome = Outcome.BAD, lesson = "Confrontation abroad escalates fastest. Go public instead.")
            )
        ),
        Scenario(
            id = "bulk-d159", title = "Phone Held at the Border",
            intro = "Your phone is taken at a border for inspection and returned an hour later. You resume normal use.",
            start = "step1", briefKey = "travel/travel-device-taken",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What should you assume?",
                    choices = listOf(
                        ScenarioChoice("It was only looked at", "bad1"),
                        ScenarioChoice("It may have been copied or modified; treat it as potentially compromised", "step2"),
                        ScenarioChoice("It is fine; it was returned", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Keep using it", "bad1"),
                        ScenarioChoice("Revoke sessions, change credentials from a clean device, inspect, and restore from backup if in doubt", "good1"),
                        ScenarioChoice("Throw it away", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You treat the taken device as compromised and act accordingly.",
                    outcome = Outcome.GOOD, lesson = "A device taken and returned is potentially compromised. Revoke, change from clean hardware, inspect, restore."),
                "bad1" to ScenarioStep(id = "bad1", text = "You resume normal use of a device that may have been copied or implanted.",
                    outcome = Outcome.BAD, lesson = "Return does not mean untouched. An hour is ample for copying or implantation."),
                "bad2" to ScenarioStep(id = "bad2", text = "You discard without inspection, losing a usable device and any evidence.",
                    outcome = Outcome.BAD, lesson = "Inspect first, discard on evidence — and preserve evidence of what happened.")
            )
        ),
        Scenario(
            id = "bulk-d160", title = "Home Again, Unchecked",
            intro = "You return home from travel and resume normal device and account use without any checks.",
            start = "step1", briefKey = "travel/travel-return-home",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did you skip?",
                    choices = listOf(
                        ScenarioChoice("Nothing; home is safe", "bad1"),
                        ScenarioChoice("Post-travel checks: devices, accounts, and data for signs of access or compromise", "step2"),
                        ScenarioChoice("Unpacking", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you check?",
                    choices = listOf(
                        ScenarioChoice("Only photos", "bad1"),
                        ScenarioChoice("Devices, sessions, account activity, and data changes", "good1"),
                        ScenarioChoice("Only luggage", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You check devices, sessions, and activity, catching a suspicious login early.",
                    outcome = Outcome.GOOD, lesson = "Post-travel checks catch compromise early: devices, sessions, activity, data."),
                "bad1" to ScenarioStep(id = "bad1", text = "You skip checks, and a travel compromise persists at home for months.",
                    outcome = Outcome.BAD, lesson = "Travel compromise does not end at home. It persists until checked."),
                "bad2" to ScenarioStep(id = "bad2", text = "You check luggage, which is not where digital compromise lives.",
                    outcome = Outcome.BAD, lesson = "Digital compromise lives in devices and accounts, not suitcases.")
            )
        ),
        Scenario(
            id = "bulk-d161", title = "Every Trip, Same Mistakes",
            intro = "Every trip, you repeat the same errors: full devices, no backup, no checks on return.",
            start = "step1", briefKey = "travel/travel-routine",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is missing?",
                    choices = listOf(
                        ScenarioChoice("Luck", "bad1"),
                        ScenarioChoice("A repeatable routine: minimise, back up, check on return, update the model", "step2"),
                        ScenarioChoice("Better gear", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you build?",
                    choices = listOf(
                        ScenarioChoice("A longer packing list", "bad1"),
                        ScenarioChoice("A travel routine with a checklist, used every trip", "good1"),
                        ScenarioChoice("A travel agent", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You build a checklist routine, and trips stop repeating the same errors.",
                    outcome = Outcome.GOOD, lesson = "A repeatable travel routine — minimise, back up, check, update — stops repeated errors."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame luck, and the same errors repeat on the next trip.",
                    outcome = Outcome.BAD, lesson = "Repeated errors are not luck. They are the absence of a routine."),
                "bad2" to ScenarioStep(id = "bad2", text = "You buy better gear, which does not fix a missing routine.",
                    outcome = Outcome.BAD, lesson = "Gear does not substitute for routine. Checklists do.")
            )
        ),
        Scenario(
            id = "bulk-d162", title = "Daily, Not Heroic",
            intro = "You try to be perfectly secure for one day, exhaust yourself, and do nothing the next week.",
            start = "step1", briefKey = "capstone/cap-daily",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What failed?",
                    choices = listOf(
                        ScenarioChoice("Your willpower", "bad1"),
                        ScenarioChoice("The design: heroic days collapse; small daily habits survive", "step2"),
                        ScenarioChoice("Your tools", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you adopt?",
                    choices = listOf(
                        ScenarioChoice("Bigger heroic days", "bad1"),
                        ScenarioChoice("Small, repeatable daily habits: lock, review, note", "good1"),
                        ScenarioChoice("Nothing", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You adopt small daily habits, and they survive the week and the month.",
                    outcome = Outcome.GOOD, lesson = "Daily habits are small and repeatable. Heroic days collapse; habits survive."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame willpower and attempt bigger heroic days, collapsing faster.",
                    outcome = Outcome.BAD, lesson = "Willpower is not the design flaw. Unsustainable design is."),
                "bad2" to ScenarioStep(id = "bad2", text = "You do nothing, losing even the habits that worked.",
                    outcome = Outcome.BAD, lesson = "Nothing is not a habit. Small is.")
            )
        ),
        Scenario(
            id = "bulk-d163", title = "Review You Keep Postponing",
            intro = "Your monthly review is postponed three months running, because 'nothing has changed'.",
            start = "step1", briefKey = "capstone/cap-reviews",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What changed anyway?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Accounts, permissions, subscriptions, and your situation — quietly, over three months", "step2"),
                        ScenarioChoice("Your memory", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you reinstate?",
                    choices = listOf(
                        ScenarioChoice("Annual reviews", "bad1"),
                        ScenarioChoice("A scheduled, light review that actually happens", "good1"),
                        ScenarioChoice("No reviews", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You reinstate a light, scheduled review, and it happens.",
                    outcome = Outcome.GOOD, lesson = "Reviews must be scheduled and light, or they are postponed forever. Change happens quietly."),
                "bad1" to ScenarioStep(id = "bad1", text = "You assume nothing changed, while three months of quiet change accumulate.",
                    outcome = Outcome.BAD, lesson = "'Nothing changed' is the assumption reviews exist to test."),
                "bad2" to ScenarioStep(id = "bad2", text = "You drop reviews entirely, and quiet change goes permanently unnoticed.",
                    outcome = Outcome.BAD, lesson = "No review means no detection. Quiet change becomes permanent exposure.")
            )
        ),
        Scenario(
            id = "bulk-d164", title = "Stress Makes Shortcuts",
            intro = "Under stress, you skip verification steps 'just this once' — repeatedly.",
            start = "step1", briefKey = "capstone/cap-stress",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is stress doing?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Narrowing attention and pushing shortcuts, which is when mistakes happen", "step2"),
                        ScenarioChoice("Improving focus", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What protects you under stress?",
                    choices = listOf(
                        ScenarioChoice("Trying harder", "bad1"),
                        ScenarioChoice("Pre-decided procedures: pause, check, verify — followed even when stressed", "good1"),
                        ScenarioChoice("Avoiding stress", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You follow pre-decided procedures under stress, and shortcuts stop.",
                    outcome = Outcome.GOOD, lesson = "Stress narrows attention and pushes shortcuts. Pre-decided procedures are the defence."),
                "bad1" to ScenarioStep(id = "bad1", text = "You try harder under stress, which narrows attention further.",
                    outcome = Outcome.BAD, lesson = "Effort under stress does not widen attention. Procedures do."),
                "bad2" to ScenarioStep(id = "bad2", text = "You avoid stress entirely, which is impossible and leaves no defence when it arrives.",
                    outcome = Outcome.BAD, lesson = "Stress cannot be avoided, only prepared for. Procedures are preparation.")
            )
        ),
        Scenario(
            id = "bulk-d165", title = "Burnout, Quietly",
            intro = "Your security routine becomes a burden: every action feels heavy, and you start avoiding it all.",
            start = "step1", briefKey = "capstone/cap-burnout",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is happening?",
                    choices = listOf(
                        ScenarioChoice("Laziness", "bad1"),
                        ScenarioChoice("Burnout: an unsustainable routine collapsing under its own weight", "step2"),
                        ScenarioChoice("Boredom", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you change?",
                    choices = listOf(
                        ScenarioChoice("Push through", "bad1"),
                        ScenarioChoice("Simplify to proportionate, sustainable controls you can keep", "good1"),
                        ScenarioChoice("Quit security", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You simplify to sustainable controls, and the routine returns.",
                    outcome = Outcome.GOOD, lesson = "Burnout is a design signal, not a character flaw. Simplify to sustainable controls."),
                "bad1" to ScenarioStep(id = "bad1", text = "You push through burnout, and collapse harder a month later.",
                    outcome = Outcome.BAD, lesson = "Pushing through burnout deepens it. Simplifying recovers it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You quit security entirely, losing even sustainable protections.",
                    outcome = Outcome.BAD, lesson = "Quitting loses what worked. Simplifying keeps it.")
            )
        ),
        Scenario(
            id = "bulk-d166", title = "New Tool, Old Plan",
            intro = "A new tool changes your workflow, but your OPSEC plan still describes the old workflow.",
            start = "step1", briefKey = "capstone/cap-updating",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is stale?",
                    choices = listOf(
                        ScenarioChoice("The tool", "bad1"),
                        ScenarioChoice("The plan: it describes a workflow that no longer exists", "step2"),
                        ScenarioChoice("Your habits", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you update?",
                    choices = listOf(
                        ScenarioChoice("Nothing; the plan is general", "bad1"),
                        ScenarioChoice("The plan, the threat model, and the routines for the new workflow", "good1"),
                        ScenarioChoice("The tool's settings only", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You update plan, model, and routines for the new workflow.",
                    outcome = Outcome.GOOD, lesson = "Tools change workflows, and workflows change plans. Update all three together."),
                "bad1" to ScenarioStep(id = "bad1", text = "You keep an old plan for a new workflow, and its controls miss the new risks.",
                    outcome = Outcome.BAD, lesson = "A plan for a dead workflow protects nothing current."),
                "bad2" to ScenarioStep(id = "bad2", text = "You tweak settings only, leaving plan and routines stale.",
                    outcome = Outcome.BAD, lesson = "Settings are not a plan. Update plan, model, and routines.")
            )
        ),
        Scenario(
            id = "bulk-d167", title = "Teaching by Lecture",
            intro = "You lecture a friend on OPSEC for an hour. They remember nothing and change nothing.",
            start = "step1", briefKey = "capstone/cap-teaching",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "Why did it fail?",
                    choices = listOf(
                        ScenarioChoice("The friend is uninterested", "bad1"),
                        ScenarioChoice("Lectures do not build habits; practices demonstrated and rehearsed do", "step2"),
                        ScenarioChoice("The hour was too short", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you do instead?",
                    choices = listOf(
                        ScenarioChoice("Lecture longer", "bad1"),
                        ScenarioChoice("Demonstrate one practice, rehearse it together, and build from there", "good1"),
                        ScenarioChoice("Give a handout", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You demonstrate and rehearse one practice, and your friend actually adopts it.",
                    outcome = Outcome.GOOD, lesson = "Teaching is practices demonstrated and rehearsed, not lectures delivered."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame the learner, while the method — lecture — was the failure.",
                    outcome = Outcome.BAD, lesson = "Blaming learners for lecture failure repeats lecture failure."),
                "bad2" to ScenarioStep(id = "bad2", text = "You hand out paper, which is a lecture in print.",
                    outcome = Outcome.BAD, lesson = "Handouts do not build habits either. Rehearsal does.")
            )
        ),
        Scenario(
            id = "bulk-d168", title = "Plan Without Review Dates",
            intro = "Your personal OPSEC plan is thorough — but has no review dates, and two years pass without a look.",
            start = "step1", briefKey = "capstone/cap-plan1",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What is missing?",
                    choices = listOf(
                        ScenarioChoice("Detail", "bad1"),
                        ScenarioChoice("Review dates: a plan without them is a plan that decays unnoticed", "step2"),
                        ScenarioChoice("Tools", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What do you add?",
                    choices = listOf(
                        ScenarioChoice("More detail", "bad1"),
                        ScenarioChoice("Scheduled reviews, plus reviews on change, with an owner — you", "good1"),
                        ScenarioChoice("A new plan", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You add scheduled reviews and reviews on change, and the plan stays current.",
                    outcome = Outcome.GOOD, lesson = "A plan needs review dates and an owner, or it decays unnoticed."),
                "bad1" to ScenarioStep(id = "bad1", text = "You add detail to a plan nobody reviews, and detail decays too.",
                    outcome = Outcome.BAD, lesson = "Detail without review is decoration. Review dates make plans live."),
                "bad2" to ScenarioStep(id = "bad2", text = "You write a new plan, which will also decay without review dates.",
                    outcome = Outcome.BAD, lesson = "A new plan without review dates repeats the old plan's fate.")
            )
        ),
        Scenario(
            id = "bulk-d169", title = "Ambitious Plan, Abandoned",
            intro = "Your plan is ambitious and comprehensive — and abandoned within a month, because it never fit your life.",
            start = "step1", briefKey = "capstone/cap-plan2",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "Why was it abandoned?",
                    choices = listOf(
                        ScenarioChoice("Lack of discipline", "bad1"),
                        ScenarioChoice("It never fit your life: controls you cannot maintain are not controls", "step2"),
                        ScenarioChoice("Lack of tools", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What makes a plan realistic?",
                    choices = listOf(
                        ScenarioChoice("Ambition", "bad1"),
                        ScenarioChoice("That it fits your life: controls you can actually maintain, every day", "good1"),
                        ScenarioChoice("Comprehensiveness", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You rebuild a plan that fits your life, and it survives the month and beyond.",
                    outcome = Outcome.GOOD, lesson = "A realistic plan fits your life. Controls you cannot maintain are not controls."),
                "bad1" to ScenarioStep(id = "bad1", text = "You blame discipline and rebuild ambitiously, abandoning again.",
                    outcome = Outcome.BAD, lesson = "Ambition that does not fit life is not discipline's failure; it is design's."),
                "bad2" to ScenarioStep(id = "bad2", text = "You make the plan comprehensive, which is what made it unmaintainable.",
                    outcome = Outcome.BAD, lesson = "Comprehensiveness without fit is abandonment waiting to happen.")
            )
        ),
        Scenario(
            id = "bulk-d170", title = "Scenario, No Review",
            intro = "You complete a scenario exercise, get the 'good' outcome, and move on without reviewing what you missed.",
            start = "step1", briefKey = "capstone/cap-scenario",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What did you miss?",
                    choices = listOf(
                        ScenarioChoice("Nothing; you got it right", "bad1"),
                        ScenarioChoice("The review: what you nearly missed, and what the bad paths teach", "step2"),
                        ScenarioChoice("The next scenario", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "What does review add?",
                    choices = listOf(
                        ScenarioChoice("Nothing", "bad1"),
                        ScenarioChoice("Understanding of near-misses and bad paths, which is where the learning lives", "good1"),
                        ScenarioChoice("A score", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You review near-misses and bad paths, and the scenario teaches twice.",
                    outcome = Outcome.GOOD, lesson = "Scenarios teach in review: near-misses and bad paths hold the learning, not just the good outcome."),
                "bad1" to ScenarioStep(id = "bad1", text = "You move on after a good outcome, learning only that you were right once.",
                    outcome = Outcome.BAD, lesson = "A good outcome without review teaches little. Review teaches."),
                "bad2" to ScenarioStep(id = "bad2", text = "You chase scores, which measure outcomes, not understanding.",
                    outcome = Outcome.BAD, lesson = "Scores are not learning. Review is.")
            )
        ),
        Scenario(
            id = "bulk-d171", title = "Certificate, Honestly Earned",
            intro = "You complete all 120 briefs. Someone asks what your certificate proves.",
            start = "step1", briefKey = "capstone/cap-completion",
            steps = mapOf(
                "step1" to ScenarioStep(id = "step1", text = "What do you say?",
                    choices = listOf(
                        ScenarioChoice("That you are a qualified expert", "bad1"),
                        ScenarioChoice("That it is a self-paced, on-device completion record — not an accredited qualification", "step2"),
                        ScenarioChoice("That you finished the app", "bad2"))),
                "step2" to ScenarioStep(id = "step2", text = "Why does the wording matter?",
                    choices = listOf(
                        ScenarioChoice("It does not", "bad1"),
                        ScenarioChoice("Because claiming accreditation you do not hold misleads others and undermines the work", "good1"),
                        ScenarioChoice("For modesty", "bad2"))),
                "good1" to ScenarioStep(id = "good1", text = "You describe the certificate honestly, and its real value — completed learning — stands.",
                    outcome = Outcome.GOOD, lesson = "The certificate is a completion record, not an accredited qualification. Honest wording protects its value."),
                "bad1" to ScenarioStep(id = "bad1", text = "You claim expertise you do not hold, and the certificate becomes a falsehood.",
                    outcome = Outcome.BAD, lesson = "Overclaiming a certificate destroys the credibility of the learning behind it."),
                "bad2" to ScenarioStep(id = "bad2", text = "You understate it as merely finishing an app, hiding the learning it records.",
                    outcome = Outcome.BAD, lesson = "Understating hides real learning. Describe it accurately: completed, self-paced, on-device.")
            )
        )
    )
}
