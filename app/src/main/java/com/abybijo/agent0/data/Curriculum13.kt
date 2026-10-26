package com.abybijo.agent0.data

/**
 * CHAPTER 13 — OSINT, COUNTER-OSINT, AND PUBLIC LIFE (Specialisation)
 *
 * The public information already available about you, and lawful,
 * practical ways to reduce it. Defensive self-audit only. No instructions
 * for investigating, tracking, or harassing another person. Every
 * self-audit brief warns the learner not to turn the technique on
 * someone else.
 */
fun chapter13() = Chapter(
    id = "osint",
    index = 13,
    code = "CH-13",
    title = "OSINT, Counter-OSINT, and Public Life",
    glyph = "\u25CE",
    tier = Tier.ADVANCED,
    tagline = "What is already public about you — and how to reduce it, lawfully.",
    briefs = listOf(
        Brief(
            id = "osint-shadow",
            title = "Your Public Shadow: What Is Already Out There",
            glyph = "\u25CE",
            summary = "The categories of public information, and why they matter together, not one by one.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Your public shadow is everything about you that is already " +
                        "publicly available: posts, photos, profiles, public records, " +
                        "data broker listings, and the traces other people have left " +
                        "about you. No single item is usually dangerous. Together, " +
                        "they form a picture: where you live, where you go, who you " +
                        "know, and when you are away. That combination is the risk."
                ),
                Block.Heading("Categories of exposure", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Identity: names, usernames, photos, and biographical details.",
                        "Location: check-ins, photo backgrounds, event attendance, and routines.",
                        "Relationships: friends, family, colleagues, and who appears in your photos.",
                        "History: old posts, old profiles, and old accounts you have forgotten."
                    )
                ),
                Block.Field(
                    "Combination is the risk",
                    "One photo tells little. A photo plus a check-in plus a friend's " +
                        "tag plus a routine tells an attacker where you will be, and when."
                ),
                Block.Para(
                    "This chapter is about seeing your own shadow, and reducing " +
                        "it — lawfully, and only for yourself. Never turn these " +
                        "techniques on another person."
                )
            ),
            outcomes = listOf(
                "List the categories of public information that form your public shadow.",
                "Explain why combined information is riskier than any single item.",
                "Commit to defensive self-audit only, never investigating another person."
            ),
            howTo = listOf(
                "List what categories of information about you are already public.",
                "Look for combinations: location plus routine plus relationships.",
                "Note which combinations would matter to an adversary.",
                "Use the rest of this chapter to reduce them, one category at a time."
            ),
            bestPractices = listOf(
                "Think in combinations, not in single posts.",
                "Old, forgotten accounts are part of your shadow too."
            ),
            cautions = listOf(
                "Never use self-audit techniques to investigate, track, or harass another person.",
                "A single harmless-looking item can be the missing piece in a combination."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to reducing public exposure.")
            )
        ),
        Brief(
            id = "osint-self-audit",
            title = "Search Yourself Like an Adversary Would",
            glyph = "\u25CE",
            summary = "A defensive self-audit, step by step, on your own information only.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "A self-audit means searching for your own information the way " +
                        "an adversary would: your names, usernames, email addresses, " +
                        "phone numbers, and photos, in search engines and on the " +
                        "platforms you use. You are looking for what is already " +
                        "public, so you can decide what to remove, restrict, or " +
                        "accept. This is for your own information only."
                ),
                Block.Warning(
                    "Your own information only",
                    "Do not turn this audit on another person. Searching someone else's " +
                        "information, tracking them, or building a picture of their life " +
                        "is not self-defence, and this app does not teach it."
                ),
                Block.Heading("The audit, step by step", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Search your full name, your usernames, and your email addresses, in quotation marks and without.",
                        "Search your phone number and your old usernames, which you may have forgotten.",
                        "Check image search for your photos, including photos others posted of you.",
                        "Check each platform's public view of your profile, as a stranger would see it.",
                        "Write down everything you find, and sort it into remove, restrict, or accept."
                    )
                ),
                Block.Para(
                    "Repeat the audit regularly. New information appears constantly: " +
                        "new posts, new tags, new data broker listings, and new " +
                        "public records."
                )
            ),
            outcomes = listOf(
                "Run a defensive self-audit on your own information only.",
                "Search names, usernames, emails, phone numbers, and photos, including image search.",
                "Sort findings into remove, restrict, or accept."
            ),
            howTo = listOf(
                "Search your names, usernames, emails, and phone numbers, with and without quotation marks.",
                "Use image search for your photos, including photos others posted.",
                "View each of your profiles as a stranger would see them.",
                "Write down findings and sort them into remove, restrict, or accept."
            ),
            bestPractices = listOf(
                "Audit regularly; new public information appears constantly.",
                "Old usernames and old accounts are part of the audit."
            ),
            cautions = listOf(
                "Never audit another person: that is investigation, not self-defence.",
                "Finding nothing in one search does not mean nothing is public."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to self-audits.")
            )
        ),
        Brief(
            id = "osint-social",
            title = "Social Media: Posts, Photos, Friends, and Tags",
            glyph = "\u25C9",
            summary = "How posts combine into a picture you did not intend — and how to break the combination.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Social media posts combine in ways their authors rarely intend. " +
                        "A photo's background shows a location. A tag shows a " +
                        "relationship. A timestamp shows a routine. A friend list " +
                        "shows a network. Each post is a piece, and the platform " +
                        "assembles the pieces for anyone who looks."
                ),
                Block.Heading("Break the combination", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Review photos for backgrounds, reflections, and documents before posting.",
                        "Review tags: who can tag you, and who can see tagged posts.",
                        "Review friend and follower lists: do you know everyone who can see your posts?",
                        "Review old posts with fresh eyes: what you posted years ago may reveal more now."
                    )
                ),
                Block.Field(
                    "Friends leak too",
                    "Your friends' posts about you — tags, photos, check-ins — are " +
                        "part of your shadow, even when your own posts are careful. " +
                        "Ask friends to check before tagging you."
                ),
                Block.Para(
                    "You do not need to leave social media to reduce this risk. " +
                        "You need to post as if the pieces will be assembled, because " +
                        "they will be."
                )
            ),
            outcomes = listOf(
                "Explain how posts, photos, tags, and friend lists combine into a picture.",
                "Review photos, tags, and friend lists for unintended exposure.",
                "Ask friends to check before tagging you."
            ),
            howTo = listOf(
                "Before posting, check photo backgrounds, reflections, and documents.",
                "Set who can tag you and who can see tagged posts.",
                "Review your friend and follower lists for people you do not know.",
                "Review old posts with fresh eyes, and remove or restrict what no longer fits."
            ),
            bestPractices = listOf(
                "Post as if the pieces will be assembled, because they will be.",
                "Friends' posts about you are part of your shadow too."
            ),
            cautions = listOf(
                "A careful post can still be undone by a friend's tag or photo.",
                "Old posts reveal more over time, as other pieces appear."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to social media privacy.")
            )
        ),
        Brief(
            id = "osint-brokers",
            title = "Data Brokers and Public Records",
            glyph = "\u25A3",
            summary = "What brokers collect, and what lawful removal requests can and cannot do.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Data brokers collect and sell personal information: names, " +
                        "addresses, phone numbers, relatives, and property records, " +
                        "largely from public records and other public sources. They " +
                        "are not hackers; they are businesses built on information " +
                        "that is already public, assembled into a convenient package."
                ),
                Block.Heading("What removal can and cannot do", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Many brokers offer opt-out or removal processes, and many jurisdictions give you a right to request them.",
                        "Removal from one broker does not remove you from others, or from the underlying public records.",
                        "Information removed from a broker can reappear when the broker refreshes its data.",
                        "Removal is therefore maintenance, not a one-time fix."
                    )
                ),
                Block.Field(
                    "The source remains",
                    "Brokers assemble public records; they do not create them. " +
                        "Removing a broker listing does not remove the public record " +
                        "it came from."
                ),
                Block.Para(
                    "Use lawful removal requests, and keep a record of them. Be " +
                        "wary of paid removal services that promise complete erasure: " +
                        "no service can erase public records, and some sell your " +
                        "information further."
                )
            ),
            outcomes = listOf(
                "Explain what data brokers collect and where it comes from.",
                "Use lawful removal requests, understanding their limits.",
                "Treat broker removal as maintenance, not a one-time fix."
            ),
            howTo = listOf(
                "Search major data brokers for your own information.",
                "Submit lawful removal or opt-out requests where offered.",
                "Keep a record of each request and its date.",
                "Repeat the check regularly, because listings reappear."
            ),
            bestPractices = listOf(
                "Removal is maintenance: schedule it, or it will lapse.",
                "Keep records of every removal request."
            ),
            cautions = listOf(
                "Paid services promising complete erasure cannot deliver it.",
                "Removing a broker listing does not remove the underlying public record."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to data brokers.")
            )
        ),
        Brief(
            id = "osint-removal",
            title = "Removing, Reducing, and Correcting Exposure",
            glyph = "\u2713",
            summary = "Requests, settings, and the limits of removal — what you can actually take back, and what you must live with differently.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Some public information can be removed. Some can only be " +
                        "reduced. Some cannot be removed at all, and must be lived " +
                        "with differently — by changing what you post next, rather " +
                        "than chasing what is already out. Knowing which category " +
                        "an item belongs to saves you from wasting effort, and from " +
                        "false comfort."
                ),
                Block.Heading("Three categories", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Remove: your own posts, your own profiles, and broker listings with opt-out processes.",
                        "Reduce: settings that limit who sees future posts, and requests to others to remove their posts about you.",
                        "Accept and adapt: public records and information already copied elsewhere, managed by changing future behaviour."
                    )
                ),
                Block.Field(
                    "Correcting matters too",
                    "Wrong information about you is also exposure: it misleads " +
                        "people who act on it. Correct it where the source allows " +
                        "correction, and keep a record of the correction."
                ),
                Block.Para(
                    "Work through your self-audit findings in priority order: " +
                        "location and routine first, then relationships, then " +
                        "everything else."
                )
            ),
            outcomes = listOf(
                "Sort exposure into remove, reduce, or accept-and-adapt.",
                "Use settings and requests to reduce future exposure.",
                "Prioritise location and routine exposure first."
            ),
            howTo = listOf(
                "Sort each self-audit finding into remove, reduce, or accept-and-adapt.",
                "Remove your own posts and profiles, and request broker opt-outs.",
                "Tighten settings for future posts, and ask others to remove their posts about you.",
                "For what cannot be removed, change future behaviour to reduce its value."
            ),
            bestPractices = listOf(
                "Priority order: location and routine first.",
                "Correct wrong information where the source allows it."
            ),
            cautions = listOf(
                "Chasing removal of what cannot be removed wastes effort and creates false comfort.",
                "Information already copied elsewhere cannot be recalled by deleting the original."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to reducing exposure.")
            )
        ),
        Brief(
            id = "osint-public-speaking",
            title = "Public Speaking, Publishing, and Visibility",
            glyph = "\u2605",
            summary = "The trade-off between being known and being exposed — and how to choose it deliberately.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Being known is often necessary: for work, for a cause, for a " +
                        "community. But every public appearance, publication, and " +
                        "interview adds to your public shadow, permanently, and in " +
                        "ways you cannot fully control. The choice is not between " +
                        "visibility and invisibility. It is between deliberate " +
                        "visibility and accidental exposure."
                ),
                Block.Heading("Choose deliberately", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Decide what you will be public about, and what you will not, before you are asked.",
                        "Assume everything public is permanent and searchable, even if a platform offers deletion.",
                        "Separate public and private identities where your work allows it, and keep the boundary consistent.",
                        "Review what event organisers and publishers will post about you, before they post it."
                    )
                ),
                Block.Field(
                    "Publicity is a one-way door",
                    "You can become more public at any time. Becoming less public " +
                        "afterwards is slow, partial, and often impossible. Choose " +
                        "the door carefully."
                ),
                Block.Para(
                    "Visibility has real benefits, and this brief does not argue " +
                        "against it. It argues for choosing it, rather than drifting " +
                        "into it."
                )
            ),
            outcomes = listOf(
                "Decide deliberately what you will be public about.",
                "Treat public material as permanent and searchable.",
                "Review what others will post about you before they post it."
            ),
            howTo = listOf(
                "Write down what you will be public about, and what you will not.",
                "Before an appearance or publication, check what will be posted about you.",
                "Separate public and private identities where your work allows it.",
                "Keep that boundary consistent across platforms."
            ),
            bestPractices = listOf(
                "Deliberate visibility beats accidental exposure.",
                "Publicity is a one-way door; choose it carefully."
            ),
            cautions = listOf(
                "Deletion from a platform does not delete copies already made.",
                "An inconsistent boundary between public and private identities leaks both ways."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to public visibility.")
            )
        ),
        Brief(
            id = "osint-personal-life",
            title = "Personal Life in Public",
            glyph = "\u2764",
            summary = "Relationships, routines, and locations in public posts — the parts of life that should never have been content.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Personal life is the richest source of public exposure, because " +
                        "it is the most posted about: relationships, celebrations, " +
                        "travel, routines, and locations. Each post feels small. " +
                        "Together, they reveal who you love, where you go, when you " +
                        "are away, and what your life looks like from the outside."
                ),
                Block.Heading("Keep personal life personal", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Delay travel and location posts until after you return.",
                        "Avoid posting routines: regular times, regular places, regular routes.",
                        "Think before posting about relationships: a partner, a child, or a family member did not choose your audience.",
                        "Share celebrations with the people who were there, not necessarily with everyone."
                    )
                ),
                Block.Warning(
                    "Others did not choose your audience",
                    "Posting about someone else exposes them to your audience, " +
                        "without their consent. Their privacy is not yours to trade " +
                        "for engagement."
                ),
                Block.Para(
                    "A private life is not a secret life. It is a life whose " +
                        "details are shared with the people they belong to, not " +
                        "with everyone."
                )
            ),
            outcomes = listOf(
                "Delay location and travel posts until after returning.",
                "Avoid posting routines, regular times, and regular routes.",
                "Recognise that posting about others exposes them without their consent."
            ),
            howTo = listOf(
                "Post travel and location content only after you return.",
                "Remove routine details from posts: times, places, and routes.",
                "Ask before posting about another person, especially family.",
                "Share personal celebrations with the people involved, not with everyone."
            ),
            bestPractices = listOf(
                "A private life is shared with the people it belongs to, not with everyone.",
                "Delay is the simplest protection for location posts."
            ),
            cautions = listOf(
                "Routines are the most useful information an adversary can gather from posts.",
                "Posting about others without consent exposes people who never chose your audience."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to personal privacy.")
            )
        ),
        Brief(
            id = "osint-household",
            title = "Household and Family Exposure",
            glyph = "\u2302",
            summary = "Protecting the people around you, not just yourself — because your shadow falls on them too.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Your public shadow falls on the people around you. Your address " +
                        "is their address. Your photos include them. Your posts " +
                        "reveal their routines, their schools, their workplaces. " +
                        "Protecting yourself without protecting your household " +
                        "leaves the easiest path to you wide open."
                ),
                Block.Heading("Protect the household together", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Agree, as a household, what may be posted about the home and its members.",
                        "Check shared accounts and devices: a family member's loose settings can expose everyone.",
                        "Teach children, in age-appropriate ways, what not to share about the family.",
                        "Review what schools, clubs, and organisations post about your family."
                    )
                ),
                Block.Field(
                    "One person's settings, everyone's exposure",
                    "A household shares an address, a network, and often a device. " +
                        "One member's public post can expose the whole household."
                ),
                Block.Para(
                    "Household protection is a conversation, not a rule imposed " +
                        "by one person. Agree it together, and revisit it as " +
                        "children grow and circumstances change."
                )
            ),
            outcomes = listOf(
                "Agree household rules for what may be posted about the home and its members.",
                "Check shared accounts and devices for loose settings.",
                "Review what organisations post about your family."
            ),
            howTo = listOf(
                "Agree household posting rules together, and write them down.",
                "Audit shared accounts and devices for public settings.",
                "Ask schools, clubs, and organisations what they post, and opt out where possible.",
                "Revisit the rules as children grow and circumstances change."
            ),
            bestPractices = listOf(
                "Household protection is a conversation, not an imposed rule.",
                "One member's settings can expose the whole household."
            ),
            cautions = listOf(
                "Children's information posted by adults is still children's information.",
                "Organisations post about families routinely, unless asked not to."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to family privacy.")
            )
        ),
        Brief(
            id = "osint-public-roles",
            title = "Public-Facing Roles: Journalists, Activists, and Creators",
            glyph = "\u2605",
            summary = "Higher visibility, higher discipline, same principles — for people whose work requires being known.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Journalists, activists, and creators cannot choose invisibility: " +
                        "their work requires being known. Their discipline must " +
                        "therefore be higher, not lower. The same principles apply " +
                        "— separation, need-to-know, and careful posting — but with " +
                        "more at stake, and with adversaries who are more motivated."
                ),
                Block.Heading("Higher visibility, higher discipline", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Separate public work identity from private life, strictly, and keep the boundary in every post.",
                        "Protect sources and contacts with the same care you protect yourself, and more.",
                        "Assume your public work attracts motivated adversaries, and plan for harassment and doxxing.",
                        "Have a plan, in advance, for what to do if you are doxxed or targeted."
                    )
                ),
                Block.Warning(
                    "Sources are not your story to tell",
                    "A source who trusted you did not trust your audience. Protecting " +
                        "sources is not optional, and it is not a trade-off against " +
                        "your own convenience."
                ),
                Block.Para(
                    "Public-facing work is valuable, and this brief does not argue " +
                        "against it. It argues for doing it with the discipline its " +
                        "risks demand."
                )
            ),
            outcomes = listOf(
                "Apply separation, need-to-know, and careful posting with higher discipline in public-facing roles.",
                "Protect sources and contacts with at least the care you protect yourself.",
                "Have a plan in advance for doxxing or targeting."
            ),
            howTo = listOf(
                "Keep public work identity strictly separate from private life.",
                "Protect source and contact information as carefully as your own.",
                "Plan in advance for harassment and doxxing responses.",
                "Review every public post for what it reveals about your private life and your contacts."
            ),
            bestPractices = listOf(
                "Higher visibility demands higher discipline, not lower.",
                "A doxxing plan made in advance beats one made in panic."
            ),
            cautions = listOf(
                "Public work attracts motivated adversaries, not only casual observers.",
                "A source's trust is not yours to trade for convenience."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides for journalists and activists.")
            )
        ),
        Brief(
            id = "osint-private-core",
            title = "Living Publicly With a Private Core",
            glyph = "\u25C9",
            summary = "A sustainable split between public and private life — so visibility does not consume everything.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "The goal of this chapter is not invisibility. It is a " +
                        "sustainable split: a public life you choose, and a private " +
                        "core you protect. Without that split, visibility expands " +
                        "until there is nothing left that is only yours. With it, " +
                        "you can be public, and still have a life that is not content."
                ),
                Block.Heading("The split, sustained", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Define your private core: what will never be public, no matter the opportunity.",
                        "Review the boundary regularly, because opportunities and pressures change.",
                        "Protect the core with the same tools as the rest of this chapter: audits, settings, and restraint.",
                        "Accept that the split needs maintenance; it is not set once and forgotten."
                    )
                ),
                Block.Field(
                    "A life that is not content",
                    "The private core is not secrecy for its own sake. It is the part " +
                        "of your life that exists for itself, not for an audience — " +
                        "and that is what makes the public part sustainable."
                ),
                Block.Para(
                    "Review this chapter's audit regularly, and revisit the " +
                        "boundary whenever your life changes: a new job, a new " +
                        "place, a new relationship, a new risk."
                )
            ),
            outcomes = listOf(
                "Define a private core that will never be public.",
                "Review the public-private boundary regularly.",
                "Maintain the split with audits, settings, and restraint."
            ),
            howTo = listOf(
                "Write down what your private core includes, and what it excludes.",
                "Review the boundary whenever your life changes.",
                "Run the self-audit regularly to check the boundary holds.",
                "Protect the core with audits, settings, and restraint, not with hope."
            ),
            bestPractices = listOf(
                "A private core makes a public life sustainable.",
                "Boundaries need maintenance, not just declaration."
            ),
            cautions = listOf(
                "Without a defined core, visibility expands until nothing is private.",
                "A boundary declared once and never reviewed will drift."
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Guides to privacy and public life.")
            )
        )
    )
)
