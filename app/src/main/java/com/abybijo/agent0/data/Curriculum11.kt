package com.abybijo.agent0.data

/**
 * CHAPTER 11 — TEAM, WORKPLACE, AND ORGANISATIONAL OPSEC (Specialisation)
 *
 * OPSEC stops being personal when other people are involved. This chapter
 * is for teams, workplaces, and groups — including small, informal ones —
 * not just for companies.
 */
fun chapter11() = Chapter(
    id = "team",
    index = 11,
    code = "CH-11",
    title = "Team, Workplace, and Organisational OPSEC",
    glyph = "\u25C9",
    tier = Tier.ADVANCED,
    tagline = "One careful person cannot carry a careless team.",
    briefs = listOf(
        Brief(
            id = "team-discipline",
            title = "OPSEC Is a Team Discipline",
            glyph = "\u25C9",
            summary = "Why one careful person cannot carry a careless team — and what a team posture actually is.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Personal OPSEC is about your own habits. Team OPSEC is about " +
                        "what happens between people: who knows what, who can access " +
                        "what, and what leaks through the gaps. A team is only as " +
                        "disciplined as its least careful member on their worst day, " +
                        "because an attacker needs only one gap."
                ),
                Block.Heading("A posture, not a person", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "A team posture is the set of shared habits: how information is handled, stored, and shared.",
                        "It must survive staff changes, bad days, and busy weeks — not only good intentions.",
                        "It is written down, or it is not a posture; it is a hope.",
                        "It applies to informal groups too: a small team leaks just as fast as a large one."
                    )
                ),
                Block.Field(
                    "The weakest link is a design problem",
                    "If one person's mistake can expose everything, the design is " +
                        "wrong, not just the person. Fix access and defaults so a " +
                        "single mistake costs less."
                ),
                Block.Para(
                    "This chapter is about building that design: need-to-know, " +
                        "shared access, onboarding, meetings, vendors, and culture."
                )
            ),
            outcomes = listOf(
                "Explain why team OPSEC is a shared posture, not an individual habit.",
                "Identify how a single gap exposes a whole team.",
                "Treat weak links as design problems, not only as personal failures."
            ),
            howTo = listOf(
                "Write down how your team handles, stores, and shares information.",
                "Check whether one person's mistake could expose everything.",
                "Fix access and defaults so a single mistake costs less."
            ),
            bestPractices = listOf(
                "A posture that only works on good days is not a posture.",
                "Write it down, or it will drift with every new member."
            ),
            cautions = listOf(
                "Informal groups leak just as fast as formal ones.",
                "Blaming one person for a design failure fixes nothing."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to organisational security.")
            )
        ),
        Brief(
            id = "team-need-to-know",
            title = "Need-to-Know in a Real Team",
            glyph = "\u25A3",
            summary = "Applying need-to-know without secrecy theatre — access that matches the work, and nothing more.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Need-to-know means each person can access what their work " +
                        "requires, and nothing more. Done badly, it becomes secrecy " +
                        "theatre: everyone locked out of everything, work grinding to " +
                        "a halt, and people inventing workarounds that leak more than " +
                        "the original access ever did. Done well, it is invisible: " +
                        "people have what they need, and nothing they do not."
                ),
                Block.Heading("Match access to work", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "List what each role actually needs, and grant that — no more, no less.",
                        "Review access when roles change, not only when people leave.",
                        "Default to the least access that lets the work happen, and raise it on request with a reason.",
                        "Watch for workarounds: a workaround is a sign the access rule is wrong, not that the person is."
                    )
                ),
                Block.Warning(
                    "Secrecy theatre backfires",
                    "Rules so strict that work becomes impossible do not make a team " +
                        "secure. They make it secretive, resentful, and creative about " +
                        "bypassing the rules."
                ),
                Block.Para(
                    "Need-to-know is a living list, not a one-time decision. Roles " +
                        "change, projects change, and access must change with them."
                )
            ),
            outcomes = listOf(
                "Apply need-to-know as access matched to work, not as blanket secrecy.",
                "Review access when roles change, not only when people leave.",
                "Recognise workarounds as a sign the access rule is wrong."
            ),
            howTo = listOf(
                "List what each role actually needs and grant exactly that.",
                "Review access whenever a role changes.",
                "Raise access on request, with a reason recorded.",
                "Treat every workaround as feedback on the rule, not only on the person."
            ),
            bestPractices = listOf(
                "Least access that lets the work happen, raised on request.",
                "Access is a living list, reviewed with every role change."
            ),
            cautions = listOf(
                "Blanket secrecy creates workarounds that leak more than the original access.",
                "Access granted once and never reviewed is access granted forever."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to organisational security.")
            )
        ),
        Brief(
            id = "team-shared",
            title = "Shared Accounts, Shared Drives, Shared Risk",
            glyph = "\u21C4",
            summary = "The most common team failure, and how to fix it: shared credentials, shared drives, and no way to revoke one person.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "Shared accounts are the most common team failure. One password " +
                        "known by everyone cannot be revoked for one person, cannot be " +
                        "traced to one person, and cannot be changed without telling " +
                        "everyone — which means it is never changed. Shared drives " +
                        "have the same problem at larger scale: everything visible to " +
                        "everyone, forever, with no record of who took what."
                ),
                Block.Heading("Replace sharing with individual access", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Give each person their own account, even for shared services.",
                        "Use groups and roles on shared drives, so access follows the role, not the person who happened to be there first.",
                        "When someone leaves, revoke their account — not a password everyone still knows.",
                        "Audit shared drives regularly: who has access, and do they still need it?"
                    )
                ),
                Block.Field(
                    "Revocability is the test",
                    "If you cannot revoke one person's access without disturbing " +
                        "everyone else, you do not have access control. You have a " +
                        "shared secret, and it will leak."
                ),
                Block.Para(
                    "For genuinely shared needs — a team inbox, a team social account " +
                        "— use a tool that gives individual access and an audit trail, " +
                        "rather than a single password passed around."
                )
            ),
            outcomes = listOf(
                "Explain why shared credentials cannot be revoked or traced.",
                "Replace shared accounts with individual accounts and role-based access.",
                "Audit shared drives for access that is no longer needed."
            ),
            howTo = listOf(
                "Give each person their own account for every shared service.",
                "Put shared drive access behind groups and roles.",
                "On departure, revoke the person's account, not a shared password.",
                "Audit shared drive access regularly."
            ),
            bestPractices = listOf(
                "Revocability is the test of access control.",
                "Shared needs get individual access with an audit trail, not a shared password."
            ),
            cautions = listOf(
                "A password known by everyone is never changed, because changing it disturbs everyone.",
                "Shared drive access granted once is rarely reviewed."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to organisational security.")
            )
        ),
        Brief(
            id = "team-onboarding",
            title = "Onboarding and Offboarding People Safely",
            glyph = "\u25B6",
            summary = "Access in, access out, in order — so a new member starts clean and a departing member leaves nothing behind.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Onboarding and offboarding are the two moments a team's access " +
                        "most often goes wrong. New members get everything at once, " +
                        "because it is faster; departing members keep access for " +
                        "weeks, because nobody owned revoking it. Both failures are " +
                        "checklist failures, and checklists fix them."
                ),
                Block.Heading("In, and out, in order", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Onboarding: grant access by role, in order, and record what was granted.",
                        "Offboarding: revoke access the day a person leaves, in the reverse order, and record what was revoked.",
                        "Name one owner for each checklist, so it is never nobody's job.",
                        "Include the informal access: shared drives, group chats, and keys, not only formal accounts."
                    )
                ),
                Block.Warning(
                    "Informal access is still access",
                    "Formal accounts get revoked; group chats, shared drives, and " +
                        "spare keys get forgotten. An offboarding checklist that omits " +
                        "them leaves the door open."
                ),
                Block.Para(
                    "Test the checklists: have a new member confirm they can do " +
                        "their work, and have a departing member confirm, where " +
                        "appropriate, that they no longer have access."
                )
            ),
            outcomes = listOf(
                "Run onboarding and offboarding as checklists with named owners.",
                "Revoke access on the day a person leaves, including informal access.",
                "Record what was granted and what was revoked."
            ),
            howTo = listOf(
                "Write an onboarding checklist, granting access by role, in order.",
                "Write an offboarding checklist, revoking access on departure day, in reverse order.",
                "Name one owner for each checklist.",
                "Include group chats, shared drives, and keys, not only formal accounts."
            ),
            bestPractices = listOf(
                "Checklists, with owners, fix what good intentions forget.",
                "Departure-day revocation is a rule, not a favour."
            ),
            cautions = listOf(
                "Granting everything at once, because it is faster, defeats need-to-know.",
                "Forgotten informal access is the commonest offboarding failure."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to organisational security.")
            )
        ),
        Brief(
            id = "team-meetings",
            title = "Meetings, Notes, and Internal Leaks",
            glyph = "\u25CB",
            summary = "Where team information actually escapes: notes, recordings, and casual sharing after the meeting ends.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Team information rarely leaks through a dramatic breach. It " +
                        "leaks through notes: a shared document that was never " +
                        "restricted, a recording left in a chat, a summary forwarded " +
                        "to someone who was not in the room, a whiteboard photographed " +
                        "by accident. Meetings create information; notes carry it " +
                        "further than the meeting ever intended."
                ),
                Block.Heading("Contain the notes", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Decide, before the meeting, what level of sensitivity it is, and who may see its notes.",
                        "Store notes where only the intended audience can reach them, with the same access rules as the meeting itself.",
                        "Treat recordings as the most sensitive form of notes: they capture what was said, not only what was decided.",
                        "Delete or archive notes when they are no longer needed, rather than letting them accumulate forever."
                    )
                ),
                Block.Field(
                    "Notes outlive meetings",
                    "A meeting ends in an hour. Its notes live for years, are searchable, " +
                        "and are shared by people who were never in the room. Treat " +
                        "notes as the real record, because they are."
                ),
                Block.Para(
                    "Casual sharing after a meeting — 'you should have heard this' " +
                        "— is an internal leak, even when the listener is trusted. " +
                        "Trusted people leak too, through their own notes, chats, and " +
                        "devices."
                )
            ),
            outcomes = listOf(
                "Identify notes, recordings, and casual sharing as the real leak paths.",
                "Store meeting notes with the same access rules as the meeting.",
                "Treat recordings as the most sensitive form of notes."
            ),
            howTo = listOf(
                "Set a sensitivity level for a meeting before it starts.",
                "Store its notes where only its intended audience can reach them.",
                "Restrict recordings more tightly than written notes.",
                "Archive or delete notes when they are no longer needed."
            ),
            bestPractices = listOf(
                "Notes are the real record; treat them as such.",
                "Casual sharing to a trusted person is still a leak."
            ),
            cautions = listOf(
                "Shared documents that were never restricted are the commonest internal leak.",
                "Notes accumulate forever unless someone owns deleting them."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to organisational security.")
            )
        ),
        Brief(
            id = "team-vendors",
            title = "Working With Contractors and Vendors",
            glyph = "\u25A3",
            summary = "Third-party access, and what to agree before it starts — because a vendor's gap becomes your gap.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Contractors and vendors need access to do their work, and that " +
                        "access is often wider, less monitored, and longer-lived than " +
                        "any employee's. A vendor's breach becomes your breach, and a " +
                        "vendor's departing employee becomes your unrevoked account. " +
                        "Agree the terms before access starts, because after it " +
                        "starts, you have no leverage."
                ),
                Block.Heading("Agree before access", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Grant the least access the work requires, for the shortest time it requires.",
                        "Agree, in writing, what data the vendor may hold, where, and for how long.",
                        "Agree how access is revoked when the work ends, and who owns revoking it.",
                        "Ask what the vendor's own practices are — and treat silence as a warning, not as reassurance."
                    )
                ),
                Block.Warning(
                    "Vendor access outlives vendor work",
                    "The commonest vendor failure is access that nobody revoked when " +
                        "the contract ended. Put an expiry date on vendor access, and " +
                        "a named owner for revoking it."
                ),
                Block.Para(
                    "Monitor vendor access while it is active. A vendor who needs " +
                        "access once a month should not hold permanent access for the " +
                        "other twenty-nine days."
                )
            ),
            outcomes = listOf(
                "Grant vendors least access for the shortest time the work requires.",
                "Agree data handling and revocation terms before access starts.",
                "Put an expiry date and a named owner on vendor access."
            ),
            howTo = listOf(
                "Scope vendor access to the work, and set an expiry date.",
                "Agree in writing what data is held, where, and for how long.",
                "Name who owns revoking vendor access when work ends.",
                "Monitor vendor access while it is active."
            ),
            bestPractices = listOf(
                "Terms agreed before access are terms you can enforce.",
                "Vendor access with an expiry date is vendor access that ends."
            ),
            cautions = listOf(
                "Vendor access left active after a contract ends is an unmonitored door.",
                "A vendor's silence about its own practices is a warning, not reassurance."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to third-party access.")
            )
        ),
        Brief(
            id = "team-remote",
            title = "Remote and Hybrid Team OPSEC",
            glyph = "\u2302",
            summary = "Home, travel, and shared spaces as workplaces — where the office's protections no longer apply.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Remote and hybrid work moves the workplace into homes, cafés, " +
                        "and hotel rooms, where none of the office's protections apply: " +
                        "no controlled network, no locked door, no colleague noticing " +
                        "a stranger at a desk. The team's posture must travel with " +
                        "the person, because the office no longer travels with them."
                ),
                Block.Heading("The posture travels with the person", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Separate work and personal devices and accounts, even at home.",
                        "Treat home and public networks as untrusted: use the protections the team provides, every time.",
                        "Keep work out of shared spaces: screens, calls, and papers visible to household members or strangers.",
                        "Agree what may leave the office — data, devices, and documents — and what may not."
                    )
                ),
                Block.Field(
                    "Home is not the office",
                    "A home network is shared with family, guests, and smart devices " +
                        "nobody chose for security. Treat it as a public network with " +
                        "better furniture."
                ),
                Block.Para(
                    "Hybrid teams need one set of rules for both settings, not two. " +
                        "Rules that apply only in the office will be broken at home, " +
                        "and rules that apply only at home will be forgotten in the " +
                        "office."
                )
            ),
            outcomes = listOf(
                "Apply team protections at home, in travel, and in shared spaces.",
                "Separate work and personal devices and accounts in every setting.",
                "Keep work out of view in shared spaces."
            ),
            howTo = listOf(
                "Use separate work devices and accounts, even at home.",
                "Use team-provided network protections on every network, every time.",
                "Position screens and calls away from household members and strangers.",
                "Follow one set of rules for office and remote work alike."
            ),
            bestPractices = listOf(
                "One set of rules for both settings, or the rules will be broken in one of them.",
                "The posture travels with the person, because the office no longer does."
            ),
            cautions = listOf(
                "Home networks are shared with family, guests, and smart devices.",
                "Work visible in a shared space is work already leaked."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to remote work security.")
            )
        ),
        Brief(
            id = "team-managers",
            title = "Managers: Setting the Posture Without Fear",
            glyph = "\u2605",
            summary = "Leadership that people will actually follow — because a posture people resent is a posture people bypass.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Managers set a team's posture more than any policy does. If the " +
                        "manager treats security as a burden, the team will too. If " +
                        "the manager models the posture — and explains why it " +
                        "matters, in terms of the team's real work — the team will " +
                        "follow it, because it makes sense, not because it is enforced."
                ),
                Block.Heading("Model it, explain it, resource it", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Model the posture yourself: the manager who bypasses the rules teaches the team to bypass them.",
                        "Explain the why in terms of the team's work, not in abstract threats.",
                        "Resource it: time, tools, and training, not only rules.",
                        "Reward reporting mistakes early; punish hiding them, and you will get hiding."
                    )
                ),
                Block.Warning(
                    "Fear produces compliance theatre",
                    "A team managed by fear will look compliant and act insecure: " +
                        "rules followed where visible, bypassed where not, and " +
                        "mistakes hidden until they become incidents."
                ),
                Block.Para(
                    "A posture people understand and can actually follow, on a " +
                        "busy day, is worth more than a perfect policy nobody follows."
                )
            ),
            outcomes = listOf(
                "Set a team posture by modelling it, explaining it, and resourcing it.",
                "Reward early reporting of mistakes instead of punishing it.",
                "Recognise fear-driven compliance as theatre, not security."
            ),
            howTo = listOf(
                "Follow the team's rules yourself, visibly.",
                "Explain each rule in terms of the team's real work.",
                "Provide the time, tools, and training the rules require.",
                "Thank people who report mistakes early."
            ),
            bestPractices = listOf(
                "The manager's behaviour is the policy the team actually learns.",
                "A posture that survives a busy day is a posture that survives."
            ),
            cautions = listOf(
                "Fear produces hidden mistakes, which become incidents.",
                "Rules without time, tools, or training are rules that will be bypassed."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to organisational security.")
            )
        ),
        Brief(
            id = "team-mistake",
            title = "When a Teammate Makes a Mistake",
            glyph = "\u2764",
            summary = "Response without blame, and Rule 1 applied inside a team — because how you respond decides whether the next mistake is reported or hidden.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Every team will have a member who clicks the wrong link, shares " +
                        "the wrong file, or loses a device. How the team responds in " +
                        "that moment decides everything that follows: a blame-free " +
                        "response gets the next mistake reported early, when it can " +
                        "still be contained; a blaming response gets the next mistake " +
                        "hidden, until it becomes an incident."
                ),
                Block.Heading("Contain, learn, support", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Contain first: fix the exposure, using the incident sequence from CH-12.",
                        "Learn second: what in the design allowed this mistake, and what changes?",
                        "Support third: the person who reported early did the team a favour, and should be told so.",
                        "Rule 1 inside a team: discuss the incident with those who need to know, not as gossip."
                    )
                ),
                Block.Field(
                    "Blame is a security failure",
                    "A culture that blames individuals for design failures will keep " +
                        "getting the same failures, reported later and later, until " +
                        "one of them is not reported at all."
                ),
                Block.Para(
                    "The question after a mistake is never 'who did this?' first. " +
                        "It is 'what do we change, so the next person cannot make " +
                        "the same mistake so easily?'"
                )
            ),
            outcomes = listOf(
                "Respond to a teammate's mistake with containment, learning, and support, in that order.",
                "Apply Rule 1 inside a team: discuss incidents only with those who need to know.",
                "Treat blame as a security failure that drives mistakes underground."
            ),
            howTo = listOf(
                "Contain the exposure first, using the CH-12 sequence.",
                "Ask what in the design allowed the mistake, and change it.",
                "Thank the person who reported early.",
                "Discuss the incident only with those who need to know."
            ),
            bestPractices = listOf(
                "Early reporting is a favour to the team; treat it as one.",
                "Fix the design, not only the person."
            ),
            cautions = listOf(
                "Blaming drives the next mistake underground.",
                "Discussing an incident as gossip breaches Rule 1 inside the team."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to incident response.")
            )
        ),
        Brief(
            id = "team-drills",
            title = "Team Drills, Reviews, and Culture",
            glyph = "\u25C8",
            summary = "Making OPSEC a habit, not an annual training day — drills, reviews, and a culture that keeps the posture alive.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Annual training does not make a habit. Drills do: short, " +
                        "regular exercises that test one thing at a time, in the " +
                        "conditions the team actually works in. Reviews do the rest: " +
                        "regular, short checks of access, notes, and procedures, " +
                        "before they drift. Culture is what remains when the drill " +
                        "and the review are over."
                ),
                Block.Heading("Small, regular, real", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Drill one thing at a time: a phishing simulation, a lost-device exercise, a revocation test.",
                        "Review access, shared drives, and vendor access on a schedule, not when something goes wrong.",
                        "Make reviews blame-free, or they will become performances.",
                        "Record what each drill and review changed, and who owns the change."
                    )
                ),
                Block.Field(
                    "A habit is a schedule, not a sentiment",
                    "Teams that say they value security but never drill or review it " +
                        "do not value it. They value saying so. The schedule is the " +
                        "proof."
                ),
                Block.Para(
                    "Culture follows practice, not the other way round. A team that " +
                        "drills, reviews, and responds without blame will become a " +
                        "team that takes OPSEC seriously — because it already does."
                )
            ),
            outcomes = listOf(
                "Replace annual training with short, regular drills and reviews.",
                "Review access, drives, and vendor access on a schedule.",
                "Build culture from practice: drills, reviews, and blame-free response."
            ),
            howTo = listOf(
                "Schedule short drills, one thing at a time, in real working conditions.",
                "Schedule access, drive, and vendor reviews, and keep to the schedule.",
                "Keep drills and reviews blame-free.",
                "Record every change a drill or review produces, with an owner."
            ),
            bestPractices = listOf(
                "Small, regular, and real beats large, annual, and theoretical.",
                "The schedule is the proof that a team values its posture."
            ),
            cautions = listOf(
                "Annual training without drills or reviews is a performance, not a habit.",
                "Reviews that blame become performances too."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to organisational security.")
            )
        )
    )
)
