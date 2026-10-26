package com.abybijo.agent0.data

/** v2.0 Phase 4c: drills linked to CH-13 OSINT briefs, one per brief. Defensive self-audit only. */
object Scenarios13 {
    val all: List<Scenario> = listOf(
        Scenario(
            id = "osint-shadow-drill",
            title = "The Picture You Did Not Post",
            intro = "A stranger at an event correctly guesses where you live, where you work, and your weekend routine — from public information alone. You posted none of it directly.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "How did they know?",
                    choices = listOf(
                        ScenarioChoice("They must have hacked you", "bad1"),
                        ScenarioChoice("Public pieces combined: posts, tags, photos, and records form a picture together", "step2"),
                        ScenarioChoice("Someone you know told them", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you do about your public shadow?",
                    choices = listOf(
                        ScenarioChoice("Delete all social media immediately", "bad2"),
                        ScenarioChoice("Audit your public information, and reduce the combinations that reveal location and routine", "good1"),
                        ScenarioChoice("Post less, but change nothing else", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You audit, find the combinations — a check-in plus a friend's tag plus a routine post — and break them. No single deletion fixes a shadow, but breaking combinations shrinks it.",
                    outcome = Outcome.GOOD,
                    lesson = "Combination is the risk. Audit your public shadow and break the combinations, especially location plus routine."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Blaming hacking, or merely posting less, leaves the existing public pieces in place, still combinable by anyone who looks.",
                    outcome = Outcome.BAD,
                    lesson = "Existing public information does not vanish when you post less. Audit and reduce what is already out."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Deleting everything, or blaming a friend, either destroys useful presence or misses the real mechanism: public combination.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "The mechanism is combination, not a single leaker. Address the combinations."
                )
            ),
            briefKey = "osint/osint-shadow"
        ),
        Scenario(
            id = "osint-self-audit-drill",
            title = "Search Yourself, Not Others",
            intro = "You decide to audit your public exposure. A friend suggests you 'audit' a colleague too, 'to show them how exposed they are'. It would be easy, and the friend insists it is helpful.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Audit the colleague too; it is helpful", "bad1"),
                        ScenarioChoice("Audit only yourself, and offer to teach the colleague to audit themselves", "step2"),
                        ScenarioChoice("Audit neither; audits are intrusive", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "Your own audit finds old accounts, old posts, and broker listings. What do you do with the findings?",
                    choices = listOf(
                        ScenarioChoice("Sort them into remove, restrict, or accept, and act in priority order", "good1"),
                        ScenarioChoice("Delete everything at once", "bad2"),
                        ScenarioChoice("Keep the list for later", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You audit only yourself, sort findings into remove, restrict, or accept, and act on location and routine first. The colleague, taught to self-audit, finds their own exposure — without you investigating them.",
                    outcome = Outcome.GOOD,
                    lesson = "Self-audit means your own information only. Never turn audit techniques on another person; teach them to audit themselves."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Auditing a colleague, or keeping findings for later, either investigates another person or lets your own exposure sit unaddressed.",
                    outcome = Outcome.BAD,
                    lesson = "Investigating another person is not self-defence, and an unactioned audit is not protection."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Deleting everything at once, or auditing neither, either destroys useful presence or leaves all exposure in place.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Sort first, act in priority order: location and routine before everything else."
                )
            ),
            briefKey = "osint/osint-self-audit"
        ),
        Scenario(
            id = "osint-social-drill",
            title = "The Tag You Did Not Approve",
            intro = "A friend tags you in photos from a private gathering, with the location, and the post is public. You did not agree to be tagged, and the photos show people who did not agree either.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do first?",
                    choices = listOf(
                        ScenarioChoice("Untag yourself and ask the friend to remove or restrict the post", "step2"),
                        ScenarioChoice("Leave it; it is just a photo", "bad1"),
                        ScenarioChoice("Report the friend's account", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "How do you prevent the next tag?",
                    choices = listOf(
                        ScenarioChoice("Set tag approval, so tags need your agreement before appearing", "good1"),
                        ScenarioChoice("Ask friends generally to be careful", "bad2"),
                        ScenarioChoice("Stop attending gatherings", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The post is restricted, the tag is removed, and tag approval is on. Friends' posts about you no longer become your exposure without your agreement.",
                    outcome = Outcome.GOOD,
                    lesson = "Friends' posts are part of your shadow. Remove, ask, and set tag approval so future tags need your agreement."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Leaving the tag, or avoiding gatherings, either leaves the exposure public or sacrifices your social life for a settings problem.",
                    outcome = Outcome.BAD,
                    lesson = "A tag is a setting problem with a settings fix, not a reason to withdraw."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Reporting a friend, or vaguely asking for care, either damages the relationship or changes nothing about future tags.",
                    outcome = Outcome.BAD,
                    lesson = "Ask directly for removal, and set approval. Vague requests and reports do not fix tags."
                )
            ),
            briefKey = "osint/osint-social"
        ),
        Scenario(
            id = "osint-brokers-drill",
            title = "The Broker Listing",
            intro = "You search a data broker site and find your name, address, phone number, and relatives listed, for sale. A paid service promises to 'erase you from the internet completely' for a monthly fee.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do about the paid service?",
                    choices = listOf(
                        ScenarioChoice("Pay it; complete erasure is worth it", "bad1"),
                        ScenarioChoice("Decline it; no service can erase public records, and some sell your data further", "step2"),
                        ScenarioChoice("Pay for one month", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What is the sound approach to broker listings?",
                    choices = listOf(
                        ScenarioChoice("Submit lawful removal requests, keep records, and repeat regularly — removal is maintenance", "good1"),
                        ScenarioChoice("Submit one request and forget it", "bad2"),
                        ScenarioChoice("Contact the broker's customers directly", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You submit removal requests, record them, and repeat the check regularly. Listings shrink and stay smaller, because removal is treated as maintenance, not a one-time fix.",
                    outcome = Outcome.GOOD,
                    lesson = "Broker removal is lawful, limited, and recurring: listings reappear, so removal must be maintenance."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Paying for complete erasure, or contacting customers, either funds a false promise or creates new exposure.",
                    outcome = Outcome.BAD,
                    lesson = "No service can erase public records. Promises of complete erasure are themselves a warning."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "One request, or one month of a service, lapses while brokers refresh their data and listings return.",
                    outcome = Outcome.BAD,
                    lesson = "One-time removal lapses. Schedule it, or it will not hold."
                )
            ),
            briefKey = "osint/osint-brokers"
        ),
        Scenario(
            id = "osint-removal-drill",
            title = "What Cannot Be Removed",
            intro = "Your audit finds three kinds of exposure: your own old posts, a public record, and a photo someone else posted of you. You want all three gone, today.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "How do you sort them?",
                    choices = listOf(
                        ScenarioChoice("All three are removable; chase all three equally", "bad1"),
                        ScenarioChoice("Own posts: remove. Others' posts: request removal. Public records: accept and adapt future behaviour", "step2"),
                        ScenarioChoice("None are removable; give up", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "In what order do you act?",
                    choices = listOf(
                        ScenarioChoice("Location and routine exposure first", "good1"),
                        ScenarioChoice("Easiest first", "bad2"),
                        ScenarioChoice("Oldest first", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You remove your posts, request removal of others' posts, and adapt future behaviour around the public record — location and routine first. Effort goes where it can actually help.",
                    outcome = Outcome.GOOD,
                    lesson = "Sort exposure into remove, reduce, or accept-and-adapt, and prioritise location and routine. Chasing the unremovable wastes effort and creates false comfort."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Chasing all three equally, or ordering by age, spends effort on the public record while location exposure stays live.",
                    outcome = Outcome.BAD,
                    lesson = "Priority is by risk, not by age or ease. Location and routine first."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Giving up because some exposure cannot be removed abandons the exposure that can be removed.",
                    outcome = Outcome.BAD,
                    lesson = "Some exposure is unremovable; much is not. Act on what can be acted on."
                )
            ),
            briefKey = "osint/osint-removal"
        ),
        Scenario(
            id = "osint-public-speaking-drill",
            title = "The Invitation to Be Known",
            intro = "You are invited to speak at a public event, with your talk recorded and posted online. It would help your work, and it would permanently add to your public shadow.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "How do you decide?",
                    choices = listOf(
                        ScenarioChoice("Accept immediately; visibility is always good", "bad1"),
                        ScenarioChoice("Decide deliberately: what will be public, what will not, and what organisers will post about you", "step2"),
                        ScenarioChoice("Decline all public speaking forever", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You accept, with conditions. What do you check before the event?",
                    choices = listOf(
                        ScenarioChoice("What organisers will post about you, and whether you can review it", "good1"),
                        ScenarioChoice("Nothing; organisers handle publicity", "bad1"),
                        ScenarioChoice("Only the audience size", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You accept deliberately, review what will be posted, and keep your private core out of it. Visibility is chosen, not drifted into, and the recording helps your work without exposing your life.",
                    outcome = Outcome.GOOD,
                    lesson = "Publicity is a one-way door. Choose it deliberately, review what others post about you, and protect your private core."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Accepting immediately, or leaving publicity to organisers, lets others decide what becomes permanently public about you.",
                    outcome = Outcome.BAD,
                    lesson = "Drifting into visibility lets others choose your exposure for you."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Declining all visibility forever sacrifices work that may matter, for a risk that deliberate choices could have managed.",
                    outcome = Outcome.NEUTRAL,
                    lesson = "Visibility is not the enemy; accidental exposure is. Choose deliberately."
                )
            ),
            briefKey = "osint/osint-public-speaking"
        ),
        Scenario(
            id = "osint-personal-life-drill",
            title = "The Holiday Post",
            intro = "You are about to post holiday photos, live, from abroad — with location tags, daily updates, and a countdown to your return. Friends are already commenting.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What is wrong with live holiday posts?",
                    choices = listOf(
                        ScenarioChoice("Nothing; friends enjoy them", "bad1"),
                        ScenarioChoice("They announce that your home is empty, and when you return", "step2"),
                        ScenarioChoice("Only the location tags matter", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "What do you do instead?",
                    choices = listOf(
                        ScenarioChoice("Post after returning, without routine details", "good1"),
                        ScenarioChoice("Post live, but only to close friends", "bad2"),
                        ScenarioChoice("Post live, but without location tags", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "You post after returning, sharing the holiday with the people who were there, without announcing an empty home or a routine. Delay is the simplest protection.",
                    outcome = Outcome.GOOD,
                    lesson = "Delay location and travel posts until after returning. Live posts announce absence and routine."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Live posts, even without tags, still announce absence through timing, comments, and context — and routines leak through daily updates.",
                    outcome = Outcome.BAD,
                    lesson = "Removing tags does not remove the announcement. Timing and routine leak too."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Close-friends posts still travel: screenshots, shares, and friends' own posts carry them further than the intended audience.",
                    outcome = Outcome.BAD,
                    lesson = "A restricted audience is not a private audience. Delay beats restriction for travel posts."
                )
            ),
            briefKey = "osint/osint-personal-life"
        ),
        Scenario(
            id = "osint-household-drill",
            title = "The Family Photo",
            intro = "A family member posts a photo of your home's exterior, your children's school event, and your address visible on a parcel in the background. The post is public, and they see no problem.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Ask them to remove or restrict it, and agree household posting rules together", "step2"),
                        ScenarioChoice("Leave it; family posts are harmless", "bad1"),
                        ScenarioChoice("Impose rules unilaterally and forbid all family posts", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "How do you make household rules hold?",
                    choices = listOf(
                        ScenarioChoice("Agree them together, write them down, and revisit them as children grow", "good1"),
                        ScenarioChoice("Set them once and never mention them again", "bad2"),
                        ScenarioChoice("Monitor every family member's posts yourself", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The post is restricted, rules are agreed and written down, and the household reviews them as circumstances change. One member's settings no longer expose everyone.",
                    outcome = Outcome.GOOD,
                    lesson = "Household protection is a conversation, agreed together and revisited — because one member's post can expose the whole household."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Leaving the post, or monitoring every family member yourself, either leaves the exposure or creates a surveillance dynamic that collapses.",
                    outcome = Outcome.BAD,
                    lesson = "Shared households need shared rules, not surveillance by one member."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Imposed rules, or rules set once and forgotten, either breed resentment or drift as children grow and circumstances change.",
                    outcome = Outcome.BAD,
                    lesson = "Rules imposed without agreement fail; rules never revisited drift."
                )
            ),
            briefKey = "osint/osint-household"
        ),
        Scenario(
            id = "osint-public-roles-drill",
            title = "The Source Who Trusted You",
            intro = "You do public-facing work, and a source shares sensitive information with you in confidence. A colleague suggests using the story, with details changed, because 'no one will know it is them'.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What do you do?",
                    choices = listOf(
                        ScenarioChoice("Use it with details changed; that protects them", "bad1"),
                        ScenarioChoice("Protect the source, the information, and the fact of the contact — and do not use it without consent", "step2"),
                        ScenarioChoice("Use it, but anonymously", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You also face online harassment for your public work. What do you have ready?",
                    choices = listOf(
                        ScenarioChoice("A plan made in advance for doxxing and targeting, and strict separation of public and private life", "good1"),
                        ScenarioChoice("Nothing; you will handle it if it happens", "bad1"),
                        ScenarioChoice("A public response ready to post", "bad2")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The source stays protected, your public and private lives stay separated, and a pre-made plan handles the harassment calmly. Higher visibility met higher discipline.",
                    outcome = Outcome.GOOD,
                    lesson = "Public-facing work demands higher discipline: protect sources absolutely, separate identities strictly, and plan for targeting in advance."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Changed details and anonymity still identify sources through context, and no plan for harassment means panic when it arrives.",
                    outcome = Outcome.BAD,
                    lesson = "Anonymisation by detail-changing is unreliable, and a plan made in panic is not a plan."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Anonymous use, or a ready public response, either exposes the source through context or escalates harassment.",
                    outcome = Outcome.BAD,
                    lesson = "A source's trust is not yours to trade for a story, and escalation is not a response plan."
                )
            ),
            briefKey = "osint/osint-public-roles"
        ),
        Scenario(
            id = "osint-private-core-drill",
            title = "What Will Never Be Public",
            intro = "An opportunity arises that would help your career, but requires making public something you had decided would never be public: a part of your private life. The pressure to accept is strong.",
            start = "step1",
            steps = mapOf(
                "step1" to ScenarioStep(
                    id = "step1",
                    text = "What guides the decision?",
                    choices = listOf(
                        ScenarioChoice("The opportunity's size", "bad1"),
                        ScenarioChoice("Your defined private core: what will never be public, no matter the opportunity", "step2"),
                        ScenarioChoice("What others would do", "bad2")
                    )
                ),
                "step2" to ScenarioStep(
                    id = "step2",
                    text = "You decline the public part but accept the opportunity in a limited form. What sustains that boundary?",
                    choices = listOf(
                        ScenarioChoice("Reviewing the boundary regularly, and maintaining it with audits, settings, and restraint", "good1"),
                        ScenarioChoice("Declaring it once and never thinking about it again", "bad2"),
                        ScenarioChoice("Hoping no one notices the boundary", "bad1")
                    )
                ),
                "good1" to ScenarioStep(
                    id = "good1",
                    text = "The opportunity proceeds without the private disclosure, and the boundary holds because it is reviewed and maintained, not merely declared. Your public life stays sustainable, because your private core stays private.",
                    outcome = Outcome.GOOD,
                    lesson = "Define a private core that will never be public, and maintain the boundary with audits, settings, and restraint. Boundaries need maintenance, not just declaration."
                ),
                "bad1" to ScenarioStep(
                    id = "bad1",
                    text = "Deciding by opportunity size, or hoping no one notices, lets pressure erode the core until nothing is private.",
                    outcome = Outcome.BAD,
                    lesson = "Without a defined core, visibility expands until nothing is private."
                ),
                "bad2" to ScenarioStep(
                    id = "bad2",
                    text = "Following others, or declaring a boundary once and forgetting it, lets the boundary drift with every new pressure.",
                    outcome = Outcome.BAD,
                    lesson = "A boundary declared once and never reviewed will drift."
                )
            ),
            briefKey = "osint/osint-private-core"
        )
    )
}
