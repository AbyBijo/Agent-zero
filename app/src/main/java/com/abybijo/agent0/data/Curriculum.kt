package com.abybijo.agent0.data

/**
 * ── AGENT-0 CURRICULUM ────────────────────────────────────────────────────
 *
 * Eight chapters, ordered by expertise. A recruit who works them in sequence
 * goes from "I reuse one password" to "I can build and defend a threat model".
 *
 *   00  ORIENTATION      — the rules, the mindset, how to train
 *   01  DOCTRINE         — the five-step OPSEC process
 *   02  DIGITAL          — credentials, 2FA, encryption, devices
 *   03  PHYSICAL         — atoms, facilities, travel, surveillance
 *   04  HUMAN            — social engineering attack + defence
 *   05  COGNITIVE        — biases, emotional exploitation, mental models
 *   06  IDENTITY         — compartmentation, personas, metadata, networks
 *   07  TRADECRAFT       — threat modelling, incident response, sustaining it
 *
 * Every brief is written to be read on a phone in a few minutes and ends with
 * references the recruit can verify independently.
 */
object Curriculum {

    val chapters: List<Chapter> = listOf(
        chapter00(), chapter01(), chapter02(), chapter03(),
        chapter04(), chapter05(), chapter06(), chapter07()
    )

    val allBriefs: List<Pair<Chapter, Brief>> =
        chapters.flatMap { c -> c.briefs.map { c to it } }

    val totalBriefs: Int = allBriefs.size
    val totalMinutes: Int = chapters.sumOf { it.totalMinutes }

    fun chapter(id: String): Chapter? = chapters.firstOrNull { it.id == id }

    fun brief(chapterId: String, briefId: String): Brief? =
        chapter(chapterId)?.briefs?.firstOrNull { it.id == briefId }

    /** Flat ordered list of "chapterId/briefId" keys, for progress + next-up. */
    val orderedKeys: List<String> =
        allBriefs.map { (c, b) -> "${c.id}/${b.id}" }

    fun nextKey(after: String): String? {
        val i = orderedKeys.indexOf(after)
        return if (i >= 0 && i < orderedKeys.lastIndex) orderedKeys[i + 1] else null
    }

    fun search(query: String): List<Pair<Chapter, Brief>> {
        val q = query.trim().lowercase()
        if (q.isBlank()) return emptyList()
        return allBriefs.filter { (c, b) ->
            b.title.lowercase().contains(q) ||
                b.summary.lowercase().contains(q) ||
                c.title.lowercase().contains(q)
        }
    }
}

// ══════════════════════════════════════════════════════════════════════════
// CHAPTER 00 — ORIENTATION
// ══════════════════════════════════════════════════════════════════════════

private fun chapter00() = Chapter(
    id = "orientation",
    index = 0,
    code = "CH-00",
    title = "Orientation",
    glyph = "\u25C8",
    tier = Tier.BEGINNER,
    tagline = "The rules, the mindset, and how to use this program.",
    briefs = listOf(
        Brief(
            id = "rules",
            title = "The Rules",
            glyph = "\u2691",
            summary = "Five rules that govern everything that follows.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Operational security is not a product you install. It is a habit of " +
                        "deciding, deliberately, who gets to know what. These five rules are " +
                        "the spine of the program."
                ),
                Block.Terminal(
                    listOf(
                        "RULE 01  You don't talk about this.",
                        "RULE 02  You are not too small to be a target.",
                        "RULE 03  Perfect security does not exist. Acceptable risk does.",
                        "RULE 04  Convenience you didn't choose is a decision made for you.",
                        "RULE 05  Assume breach. Plan for detection and recovery."
                    )
                ),
                Block.Heading("Rule 01 in practice", "\u25B8"),
                Block.Para(
                    "The first rule is not theatre. Most compromises begin with information " +
                        "that was volunteered, not stolen: a job title on a public profile, a " +
                        "photo with a badge visible, a complaint about which VPN vendor your " +
                        "company uses. Every detail you publish is a free gift to whoever is " +
                        "building a profile of you."
                ),
                Block.Bullets(
                    listOf(
                        "Don't narrate your security setup — naming your password manager, VPN, or phone OS narrows an attacker's search space.",
                        "Don't post real-time location. Post after you leave, if at all.",
                        "Don't confirm or deny what tools your employer uses.",
                        "Silence is free and reversible. Disclosure is neither."
                    )
                ),
                Block.Field(
                    "Why it matters",
                    "In the 2020 Twitter breach, attackers used publicly-known internal " +
                        "tooling names and LinkedIn job titles to build a convincing vishing " +
                        "pretext against support staff. The technical exploit was trivial; the " +
                        "reconnaissance was free."
                ),
                Block.Heading("Rule 02: the myth of the small target", "\u25B8"),
                Block.Para(
                    "Most attacks are not personal. They are automated sweeps that test " +
                        "millions of credentials against thousands of sites. You are not " +
                        "chosen — you are enumerated. That is precisely why generic hygiene " +
                        "(unique passwords, 2FA, updates) removes the overwhelming majority " +
                        "of real-world risk."
                ),
                Block.Heading("Rule 03: risk, not perfection", "\u25B8"),
                Block.Para(
                    "Any security control costs something: money, time, or friction. A " +
                        "control so painful you abandon it in a week has negative value. The " +
                        "goal is the strongest posture you will actually sustain."
                ),
                Block.Heading("Rules 04 and 05", "\u25B8"),
                Block.Para(
                    "Defaults are decisions someone else made about your data. Review them. " +
                        "And assume that eventually something you rely on will be breached — " +
                        "so build so that a single failure isn't fatal."
                )
            ),
            references = listOf(
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "The best free starting curriculum for threat modelling."),
                Reference("NIST — Cybersecurity Framework", "https://www.nist.gov/cyberframework", "Risk-management structure used industry-wide.")
            )
        ),
        Brief(
            id = "howto",
            title = "How To Train",
            glyph = "\u25F3",
            summary = "The path through the program and how to make it stick.",
            minutes = 3,
            blocks = listOf(
                Block.Para(
                    "This program is designed to be worked, not read. Reading produces " +
                        "recognition; drilling produces recall. Recognition fails under pressure."
                ),
                Block.Heading("The loop", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "READ a brief in the Chapters section. Four minutes, one idea.",
                        "DRILL it — run the matching scenario or quiz in Drills.",
                        "APPLY one change immediately. One. Not a weekend overhaul.",
                        "AUDIT monthly with the Self-Diagnostic and watch the score move."
                    )
                ),
                Block.Field(
                    "Pace",
                    "One chapter per week is plenty. Recruits who binge the whole program " +
                        "in a night retain almost none of it and change no behaviour."
                ),
                Block.Heading("Reading the tier markers", "\u25B8"),
                Block.Table(
                    listOf(
                        "\u25B0\u25B1\u25B1 Beginner" to "No prior knowledge assumed. Start here.",
                        "\u25B0\u25B0\u25B1 Intermediate" to "Assumes you've done the basics: manager, 2FA, updates.",
                        "\u25B0\u25B0\u25B0 Advanced" to "Threat modelling and sustained operational discipline."
                    )
                ),
                Block.Heading("What this program is not", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Not legal advice. Laws on encryption, anonymity and recording vary enormously by country.",
                        "Not an offensive-tooling manual. Attack techniques appear only so you can recognise and defend against them.",
                        "Not a substitute for a professional threat assessment if you face a state-level adversary."
                    )
                ),
                Block.Para(
                    "Everything in Agent-0 runs offline on your device. Nothing you check, " +
                        "answer, or score is transmitted anywhere. There is no account, no " +
                        "analytics, and no network permission in the app manifest."
                )
            ),
            references = listOf(
                Reference("Learning: retrieval practice", "https://www.retrievalpractice.org/", "Why drilling beats re-reading.")
            )
        )
    )
)

// ══════════════════════════════════════════════════════════════════════════
// CHAPTER 01 — DOCTRINE
// ══════════════════════════════════════════════════════════════════════════

private fun chapter01() = Chapter(
    id = "doctrine",
    index = 1,
    code = "CH-01",
    title = "Doctrine",
    glyph = "\u2732",
    tier = Tier.BEGINNER,
    tagline = "The five-step OPSEC process, from Purple Dragon to your phone.",
    briefs = listOf(
        Brief(
            id = "origins",
            title = "Origins & Definition",
            glyph = "\u203B",
            summary = "Where OPSEC came from and what the word actually means.",
            minutes = 3,
            blocks = listOf(
                Block.Para(
                    "OPSEC was formalised in 1966 during the Vietnam War. US forces could not " +
                        "understand how their air operations kept being anticipated. A team " +
                        "codenamed PURPLE DRAGON was formed to find the leak."
                ),
                Block.Para(
                    "They found no spy. Instead they found patterns: predictable radio " +
                        "procedures, consistent pre-mission activity, and unclassified details " +
                        "that, aggregated, revealed classified intent. The insight that founded " +
                        "the discipline is that unclassified fragments assemble into classified " +
                        "conclusions."
                ),
                Block.Field(
                    "Definition",
                    "OPSEC is the process of identifying information critical to your " +
                        "objectives, determining who wants it and what they can do, finding " +
                        "your weaknesses, judging the risk, and applying proportionate " +
                        "countermeasures."
                ),
                Block.Heading("The aggregation problem", "\u25B8"),
                Block.Para(
                    "No single fact about you is sensitive. Your employer is public. Your " +
                        "gym's location is public. Your commute time is inferable. Your dog's " +
                        "name is in a photo caption. Individually: harmless. Together: a " +
                        "password reset answer, a physical routine, and a spear-phishing hook."
                ),
                Block.Terminal(
                    listOf(
                        "$ aggregate --source public",
                        "  employer .............. LinkedIn",
                        "  building .............. photo EXIF + window view",
                        "  schedule .............. gym check-ins, 06:40 daily",
                        "  family ................ tagged birthday post",
                        "  pet name .............. caption \"good boy Rex\"",
                        "> RESULT: pretext + reset answers + physical pattern"
                    )
                ),
                Block.Para(
                    "This is why OPSEC is a process rather than a checklist. A checklist " +
                        "protects known secrets. A process notices when harmless things have " +
                        "quietly become a secret in combination."
                )
            ),
            references = listOf(
                Reference("NSA — Purple Dragon (declassified history)", "https://www.nsa.gov/portals/75/documents/news-features/declassified-documents/cryptologic-histories/purple_dragon.pdf", "The origin document of modern OPSEC."),
                Reference("US National OPSEC Program (NSDD-298)", "https://irp.fas.org/offdocs/nsdd/nsdd-298.pdf", "The directive that codified the five steps.")
            )
        ),
        Brief(
            id = "step1",
            title = "Step 1 — Identify Critical Information",
            glyph = "\u2460",
            summary = "You cannot protect what you have never named.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Critical information is any data whose loss, compromise or exposure " +
                        "would damage your objective. Most people have never written theirs " +
                        "down, which means they are defending everything equally — that is, " +
                        "nothing effectively."
                ),
                Block.Bullets(
                    listOf(
                        "Authentication secrets — passwords, keys, tokens, recovery codes, seed phrases.",
                        "Operational plans — travel itineraries, meeting locations and times.",
                        "Identity links — the connection between a pseudonym and your legal name.",
                        "Source and contact data — who talks to you, and when.",
                        "Proprietary work — unreleased designs, algorithms, client lists.",
                        "PII — government IDs, financial accounts, medical and biometric records."
                    )
                ),
                Block.Field(
                    "Real-world example",
                    "A journalist covering a protest never classified their source list as " +
                        "critical, so it sat in plaintext on a synced laptop. The laptop was " +
                        "seized at a border crossing. Every source was exposed — not by a " +
                        "sophisticated attack, but by an unmade decision."
                ),
                Block.Heading("Build your CIL", "\u25B8"),
                Block.Para(
                    "Write a Critical Information List. Ten lines is enough to start. For " +
                        "each item record where it lives, who can reach it, and what happens " +
                        "the day it leaks."
                ),
                Block.Table(
                    listOf(
                        "Item" to "What exactly is the secret?",
                        "Location" to "Which devices, accounts and backups hold it?",
                        "Access" to "Who else can read it — including vendors?",
                        "Impact" to "Financial, legal, physical, reputational?",
                        "Lifetime" to "Does it stop mattering after a date?"
                    )
                ),
                Block.Para(
                    "That last row matters more than people expect. Information with a short " +
                        "lifetime (tomorrow's meeting location) needs different handling from " +
                        "information that is sensitive forever (a source's identity, your " +
                        "biometrics)."
                )
            ),
            references = listOf(
                Reference("CISA — Protecting Critical Information", "https://www.cisa.gov/opsec", "Government guidance on building a CIL.")
            )
        ),
        Brief(
            id = "step2",
            title = "Step 2 — Threat Analysis",
            glyph = "\u2461",
            summary = "Who wants it, what can they do, and how do they prefer to work?",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "A threat requires two things: capability and intent. A nation-state has " +
                        "enormous capability but almost certainly no intent toward you. A " +
                        "credential-stuffing botnet has trivial capability and total, " +
                        "indiscriminate intent. Defend against the intersection that is real " +
                        "for you."
                ),
                Block.Table(
                    listOf(
                        "Opportunistic" to "Automated scanners, credential stuffing. Low skill, enormous volume. Affects everyone.",
                        "Criminal" to "Ransomware crews, fraud rings, SIM-swappers. Profit-driven, professional, patient enough.",
                        "Social engineers" to "Phishing, vishing, pretexting. Target the human, not the machine.",
                        "Insider" to "Colleagues, contractors, ex-partners. Already inside the trust boundary.",
                        "Corporate" to "Competitors, data brokers, private investigators. Legal-ish grey methods.",
                        "Nation-state" to "APT groups, SIGINT agencies. Effectively unlimited resources and time."
                    )
                ),
                Block.Heading("Naming your adversary", "\u25B8"),
                Block.Para(
                    "Vague fear produces vague defences. Write one sentence: \"I am " +
                        "protecting X from Y, who could do Z.\" If you cannot name Y, you are " +
                        "buying tools rather than managing risk."
                ),
                Block.Field(
                    "Real-world example",
                    "A small business assumed it was too small to target. But it processed " +
                        "credit cards, which made it a target for fully automated card-skimming " +
                        "attacks that never knew or cared what the business did."
                ),
                Block.Heading("Capability honestly assessed", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Can they guess or buy your password? (Almost always yes, if reused.)",
                        "Can they intercept SMS? (Criminals can, via SIM swap — routinely.)",
                        "Can they compel disclosure legally? (Depends entirely on jurisdiction.)",
                        "Can they get physical access to your device? (The one that ends most debates.)",
                        "Can they wait nine months without being noticed? (Only the top tier.)"
                    )
                )
            ),
            references = listOf(
                Reference("MITRE ATT&CK", "https://attack.mitre.org/", "Catalogue of real adversary techniques, mapped by group."),
                Reference("Verizon DBIR", "https://www.verizon.com/business/resources/reports/dbir/", "Annual data on what actually causes breaches.")
            )
        ),
        Brief(
            id = "step3",
            title = "Step 3 — Vulnerability Assessment",
            glyph = "\u2462",
            summary = "Where the weaknesses actually are: people, process, technology.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "A vulnerability is a weakness a threat could exploit. Inventory them " +
                        "across all four surfaces — most people audit only the technical one."
                ),
                Block.Bullets(
                    listOf(
                        "Technical — unpatched software, default credentials, weak or absent encryption, exposed services.",
                        "Procedural — no offboarding, no backup verification, no clean-desk rule, no incident plan.",
                        "Human — oversharing, susceptibility to flattery or urgency, fatigue, unchallenged authority.",
                        "Physical — tailgating, unlocked rooms, visible screens, recoverable trash."
                    )
                ),
                Block.Field(
                    "Real-world example",
                    "An employee reused one password across work and a hobby forum. The forum " +
                        "was breached. Attackers replayed the credentials against the corporate " +
                        "VPN and walked in. No exploit, no malware — just reuse."
                ),
                Block.Heading("Self-assessment questions", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "If my phone were stolen unlocked right now, what would be lost?",
                        "If my email were taken over, which other accounts fall with it?",
                        "Which of my accounts share a password? (Be honest.)",
                        "Who could walk into my workspace unchallenged?",
                        "When did I last verify a backup by actually restoring a file?"
                    )
                ),
                Block.Para(
                    "Email is nearly always the answer to question two. It is the root of " +
                        "trust for password resets across your entire digital life, which is " +
                        "why it deserves your strongest available authentication."
                )
            ),
            references = listOf(
                Reference("OWASP Top 10", "https://owasp.org/www-project-top-ten/", "The canonical list of technical weaknesses."),
                Reference("Have I Been Pwned", "https://haveibeenpwned.com/", "Check which breaches already include your addresses.")
            )
        ),
        Brief(
            id = "step4",
            title = "Step 4 — Risk Assessment",
            glyph = "\u2463",
            summary = "Risk = Threat × Vulnerability × Impact. Prioritise ruthlessly.",
            minutes = 3,
            blocks = listOf(
                Block.Para(
                    "Without all three factors there is no risk — only a theoretical concern. " +
                        "A devastating vulnerability nobody can reach, or a determined threat " +
                        "against something worthless, are both noise."
                ),
                Block.Terminal(
                    listOf(
                        "RISK = THREAT x VULNERABILITY x IMPACT",
                        "",
                        "  threat ........ how often is this attempted?",
                        "  vulnerability . how likely is it to succeed here?",
                        "  impact ........ money, law, reputation, safety",
                        "",
                        "  mitigation cost = effort + budget + friction"
                    )
                ),
                Block.Heading("Triage", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "High likelihood + high impact → fix this week. Non-negotiable.",
                        "Low likelihood + high impact → mitigate and prepare recovery (backups, insurance, plans).",
                        "High likelihood + low impact → automate the fix so it costs no attention.",
                        "Low likelihood + low impact → document it and move on. Accept the risk explicitly."
                    )
                ),
                Block.Para(
                    "Explicit acceptance is a real security decision, not a failure. The " +
                        "danger is unexamined risk, not acknowledged risk. Use the Risk " +
                        "Calculator in Drills to score your own items."
                )
            ),
            references = listOf(
                Reference("FAIR risk model", "https://www.fairinstitute.org/", "Quantitative approach to information risk.")
            )
        ),
        Brief(
            id = "step5",
            title = "Step 5 — Apply Countermeasures",
            glyph = "\u2464",
            summary = "Deter, prevent, detect, recover — and then re-run the loop.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Countermeasures reduce vulnerability, reduce the adversary's capability, " +
                        "or reduce impact. They come in four flavours, and a mature posture uses " +
                        "all four rather than stacking everything into prevention."
                ),
                Block.Table(
                    listOf(
                        "Deterrence" to "Make the attack unattractive — visible cameras, legal notices, hardened reputation.",
                        "Prevention" to "Block it — encryption, MFA, access control, patching, segmentation.",
                        "Detection" to "Notice it happening — login alerts, logging, audit trails, tamper-evidence.",
                        "Recovery" to "Restore afterwards — tested backups, incident plan, revocation procedures."
                    )
                ),
                Block.Field(
                    "The common failure",
                    "Almost everyone over-invests in prevention and ignores detection and " +
                        "recovery. Equifax had no working intrusion detection because a " +
                        "certificate had expired; exfiltration continued unnoticed for 76 days."
                ),
                Block.Heading("Choosing well", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Prefer controls that fail safe — a locked-out account beats a silently open one.",
                        "Prefer controls that need no daily discipline — automation beats willpower.",
                        "Prefer reversible controls while you're learning what you can sustain.",
                        "Measure friction honestly. A control you disable in a week protects nothing."
                    )
                ),
                Block.Para(
                    "Then repeat the cycle. Your critical information changes, your adversaries " +
                        "evolve, and controls decay. OPSEC is a loop, not a project with an end date."
                )
            ),
            references = listOf(
                Reference("CIS Critical Security Controls", "https://www.cisecurity.org/controls", "Prioritised, prescriptive countermeasure list.")
            )
        )
    )
)

// ══════════════════════════════════════════════════════════════════════════
// CHAPTER 02 — DIGITAL
// ══════════════════════════════════════════════════════════════════════════

private fun chapter02() = Chapter(
    id = "digital",
    index = 2,
    code = "CH-02",
    title = "Digital",
    glyph = "\u2318",
    tier = Tier.BEGINNER,
    tagline = "Credentials, authentication, encryption, comms and devices.",
    briefs = listOf(
        Brief(
            id = "passwords",
            title = "Passwords & Secrets",
            glyph = "\u26BF",
            summary = "The single highest-value change most people can make.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "Password reuse is the most exploited weakness on the internet. Breach " +
                        "corpora containing billions of credential pairs are replayed " +
                        "automatically against every major service. If you reuse, your security " +
                        "equals that of the worst site you ever signed up for."
                ),
                Block.Heading("The fix", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Use a password manager — Bitwarden (cloud, open source) or KeePassXC (fully offline).",
                        "Every account gets a unique, generated, high-entropy password. You will never type most of them.",
                        "Protect the vault with a passphrase of 6+ random words (Diceware), not a clever short password.",
                        "Store recovery codes offline — printed, in a safe. Not in the vault they unlock.",
                        "Rotate on suspicion of compromise, not on an arbitrary calendar."
                    )
                ),
                Block.Field(
                    "Why word-based passphrases",
                    "Length defeats brute force far more effectively than symbol substitution. " +
                        "Six random dictionary words is roughly 77 bits of entropy — beyond " +
                        "offline cracking. \"P@ssw0rd!\" is about 28 bits and appears in every wordlist."
                ),
                Block.Terminal(
                    listOf(
                        "$ entropy --compare",
                        "  \"Tr0ub4dor&3\" ............... ~28 bits   cracked instantly",
                        "  \"correct horse battery\" ..... ~44 bits   hours",
                        "  6 diceware words ............ ~77 bits   infeasible",
                        "",
                        "> length dominates. always."
                    )
                ),
                Block.Heading("Handling the master passphrase", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Generate it with real dice or your manager's Diceware generator — not from your head.",
                        "Memorise it over a week by typing it daily. It sticks faster than you expect.",
                        "Write it once on paper and store it somewhere only you control, until it's memorised.",
                        "Never type it into anything except your password manager's own prompt."
                    )
                ),
                Block.Heading("Passkeys", "\u25B8"),
                Block.Para(
                    "Passkeys (FIDO2 credentials synced by your OS or manager) remove the " +
                        "password entirely and are phishing-resistant by design — the credential " +
                        "is cryptographically bound to the real domain. Adopt them wherever " +
                        "offered, while keeping a recovery path."
                )
            ),
            references = listOf(
                Reference("Bitwarden", "https://bitwarden.com/", "Open-source password manager, generous free tier."),
                Reference("KeePassXC", "https://keepassxc.org/", "Fully offline, local-only vault."),
                Reference("EFF Dice-Generated Passphrases", "https://www.eff.org/dice", "Official Diceware wordlists and method."),
                Reference("passkeys.dev", "https://passkeys.dev/", "How passkeys work and who supports them.")
            )
        ),
        Brief(
            id = "twofactor",
            title = "Two-Factor Authentication",
            glyph = "\u26BF",
            summary = "Not all second factors are equal. The ranking matters.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "2FA means a stolen password alone is insufficient. But the method you " +
                        "choose determines whether it stops a real attacker or merely a lazy one."
                ),
                Block.Table(
                    listOf(
                        "BEST — FIDO2 key" to "YubiKey, Titan, or a passkey. Phishing-resistant: the browser refuses to sign for a lookalike domain.",
                        "GOOD — TOTP app" to "Aegis, Ente Auth, FreeOTP. Offline codes. Phishable in real time, but immune to SIM swap.",
                        "WEAK — Push prompt" to "Vulnerable to MFA fatigue — attackers spam prompts until you tap accept.",
                        "AVOID — SMS" to "SIM swapping and SS7 interception are routine criminal services, not theory."
                    )
                ),
                Block.Field(
                    "Real-time phishing",
                    "Toolkits like Evilginx and EvilProxy sit between you and the real site, " +
                        "relaying your password AND your TOTP code the instant you enter them, " +
                        "then stealing the session cookie. Only hardware-bound FIDO2 credentials " +
                        "defeat this, because the signature is tied to the true origin."
                ),
                Block.Heading("Deployment order", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Email first — it is the reset path for everything else.",
                        "Password manager second.",
                        "Cloud storage, then finance, then social, then work SSO.",
                        "Buy two hardware keys: one carried, one stored as backup. Register both everywhere.",
                        "Print recovery codes for each account and store them offline."
                    )
                ),
                Block.Para(
                    "The second key is not optional. Losing a sole hardware key without " +
                        "recovery codes locks you out permanently — a self-inflicted denial of service."
                )
            ),
            references = listOf(
                Reference("Yubico", "https://www.yubico.com/", "Hardware security keys."),
                Reference("Aegis Authenticator", "https://getaegis.app/", "Open-source Android TOTP with encrypted backups."),
                Reference("Ente Auth", "https://ente.io/auth/", "E2EE cross-platform 2FA app.")
            )
        ),
        Brief(
            id = "encryption",
            title = "Encryption",
            glyph = "\u26BF",
            summary = "At rest, in transit, end-to-end — and never roll your own.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Encryption converts data into a form useless without a key. Where it is " +
                        "applied determines who can still read your data — and that distinction " +
                        "is where most people are misled by marketing."
                ),
                Block.Table(
                    listOf(
                        "At rest" to "Disk/file encryption: BitLocker, FileVault, LUKS, VeraCrypt. Defeats device theft.",
                        "In transit" to "TLS 1.3, SSH, WireGuard. Defeats network eavesdropping between hops.",
                        "End-to-end" to "Signal, Element, age, PGP. Only endpoints hold keys — the provider cannot read it."
                    )
                ),
                Block.Field(
                    "The critical distinction",
                    "\"Encrypted\" in a vendor's marketing usually means encrypted in transit " +
                        "and at rest on their servers — with keys they hold. They can read it, " +
                        "and so can anyone who compels or breaches them. Only end-to-end " +
                        "encryption removes the provider from your trust boundary."
                ),
                Block.Heading("Practical baseline", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Enable full-disk encryption on every device. On modern phones it is on by default — verify it.",
                        "Encryption is only as strong as the unlock secret. A 4-digit PIN on an encrypted phone is a 4-digit phone.",
                        "Use VeraCrypt or Cryptomator for containers, especially before cloud sync.",
                        "Use age or Picocrypt for single files — modern, simple, hard to misuse.",
                        "Never design your own cipher or protocol. Use audited, widely-reviewed libraries."
                    )
                ),
                Block.Heading("Before and after lock", "\u25B8"),
                Block.Para(
                    "A powered-on, previously-unlocked phone holds its keys in memory and is " +
                        "far more extractable than one that is powered off. If you expect device " +
                        "seizure, power down completely — that is the single most effective " +
                        "action available to you."
                )
            ),
            references = listOf(
                Reference("VeraCrypt", "https://veracrypt.fr/", "Encrypted containers and full-disk encryption."),
                Reference("age encryption", "https://age-encryption.org/", "Modern simple file encryption."),
                Reference("Cryptomator", "https://cryptomator.org/", "Client-side encryption for cloud storage.")
            )
        ),
        Brief(
            id = "comms",
            title = "Secure Communication",
            glyph = "\u26BF",
            summary = "Content, metadata, and choosing the right channel.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Protecting message content is largely solved. Protecting metadata — who " +
                        "spoke to whom, when, how often, from where — is the harder and often " +
                        "more revealing problem."
                ),
                Block.Field(
                    "Metadata is the message",
                    "A former NSA director summarised targeting bluntly: \"We kill people " +
                        "based on metadata.\" You do not need the content of a call to infer a " +
                        "relationship, a schedule, or a crisis."
                ),
                Block.Table(
                    listOf(
                        "Signal" to "Best general choice. E2EE by default, sealed sender, minimal retained metadata. Phone number required.",
                        "SimpleX" to "No user identifiers at all — strongest metadata story available today.",
                        "Session" to "Onion-routed, no phone number or email required.",
                        "Briar" to "Peer-to-peer over Tor, Bluetooth or Wi-Fi. Works with no internet at all.",
                        "Element/Matrix" to "Federated and self-hostable. Best for teams that need control.",
                        "Email" to "Designed in the 1970s with no encryption. Treat as a public postcard."
                    )
                ),
                Block.Heading("Discipline beats tooling", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Set disappearing messages by default — data you no longer hold cannot be seized.",
                        "Verify safety numbers in person or over a second channel for sensitive contacts.",
                        "Remember the endpoints: E2EE is irrelevant if the other person screenshots everything or their phone is compromised.",
                        "Beware cloud backups — some apps back up plaintext chat history unless you disable it.",
                        "Match the channel to the sensitivity. Not everything needs Briar; some things need more than Signal."
                    )
                )
            ),
            references = listOf(
                Reference("Signal", "https://signal.org/", "The default recommendation for most people."),
                Reference("SimpleX Chat", "https://simplex.chat/", "Messenger with no user IDs."),
                Reference("Briar", "https://briarproject.org/", "Offline-capable P2P messenger.")
            )
        ),
        Brief(
            id = "devices",
            title = "Device Hardening",
            glyph = "\u26BF",
            summary = "Reduce the attack surface you carry every day.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Your phone knows more about you than any other object you own. Hardening " +
                        "it is mostly subtraction: fewer apps, fewer permissions, fewer radios, " +
                        "fewer defaults left unexamined."
                ),
                Block.Numbered(
                    listOf(
                        "Enable automatic OS and app updates. Unpatched software is the most common way in.",
                        "Use a 6+ digit PIN or passphrase, never a 4-digit code or a pattern.",
                        "Confirm full-disk encryption is active.",
                        "Audit app permissions quarterly — location, microphone, camera, contacts, files.",
                        "Uninstall anything unused. Every app is a potential vulnerability and a data exporter.",
                        "Disable Bluetooth, NFC and location when not actively needed.",
                        "Turn off lock-screen notification previews — they leak 2FA codes to anyone nearby.",
                        "Set the shortest tolerable auto-lock timeout."
                    )
                ),
                Block.Heading("Higher-risk profiles", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "GrapheneOS on a Pixel — the strongest mainstream mobile hardening available.",
                        "CalyxOS — de-Googled Android, gentler learning curve.",
                        "Qubes OS — desktop compartmentalisation by virtualisation.",
                        "Tails — amnesic live OS, forces all traffic through Tor, leaves nothing behind.",
                        "Enable Lockdown Mode on iOS if you may be targeted by mercenary spyware."
                    )
                ),
                Block.Field(
                    "Reboot regularly",
                    "Many sophisticated mobile exploits are non-persistent — they do not " +
                        "survive a restart. Rebooting daily is a genuinely effective, zero-cost " +
                        "hygiene measure."
                )
            ),
            references = listOf(
                Reference("GrapheneOS", "https://grapheneos.org/", "Hardened Android for Pixel devices."),
                Reference("CalyxOS", "https://calyxos.org/", "Privacy-focused Android alternative."),
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Well-maintained, vendor-neutral tool recommendations.")
            )
        ),
        Brief(
            id = "network",
            title = "VPNs, Tor & Anonymity",
            glyph = "\u26BF",
            summary = "What each actually hides — and what it doesn't.",
            minutes = 4,
            blocks = listOf(
                Block.Field(
                    "The core misconception",
                    "A VPN does not make you anonymous. It moves your traffic's visibility " +
                        "from your ISP to your VPN provider. You have changed who you trust, " +
                        "not eliminated trust."
                ),
                Block.Table(
                    listOf(
                        "VPN" to "Good for: hostile Wi-Fi, hiding traffic from your ISP, geo-shifting. Not anonymity.",
                        "Tor" to "Three relays, no single party sees both ends. Real anonymity, at the cost of speed.",
                        "Tor Browser" to "Also resists fingerprinting — that is half its value. Don't just proxy Chrome through Tor.",
                        "Incognito" to "Hides history from others using your device. Nothing more. Not a privacy tool."
                    )
                ),
                Block.Heading("Choosing a VPN", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Prefer providers that require no personal details and accept cash — Mullvad, IVPN.",
                        "Insist on independent audits; treat unaudited \"no-logs\" claims as marketing.",
                        "Avoid free VPNs. If you are not the customer, your traffic is the product.",
                        "Verify the kill switch actually works before relying on it."
                    )
                ),
                Block.Heading("Using Tor properly", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Use the official Tor Browser at its default window size — resizing makes you unique.",
                        "Don't install extensions; each one is a fingerprint.",
                        "Never log into an account tied to your real identity over Tor and expect anonymity.",
                        "Understand exit nodes: traffic to non-HTTPS sites is readable at the exit.",
                        "For serious anonymity use Tails or Whonix, where leaks are prevented at the OS level."
                    )
                ),
                Block.Para(
                    "Behaviour deanonymises far more often than technology fails. Writing " +
                        "style, timing patterns, and one careless login link identities together " +
                        "regardless of how the packets travelled."
                )
            ),
            references = listOf(
                Reference("Tor Project", "https://www.torproject.org/", "Tor Browser and documentation."),
                Reference("Mullvad VPN", "https://mullvad.net/", "Account-number-based VPN, no email required."),
                Reference("Whonix", "https://www.whonix.org/", "VM-based OS that prevents IP leaks by design.")
            )
        ),
        Brief(
            id = "email",
            title = "Email Security",
            glyph = "\u26BF",
            summary = "The root of trust for your entire digital identity.",
            minutes = 3,
            blocks = listOf(
                Block.Para(
                    "Email is the reset path for nearly every account you own. Whoever " +
                        "controls your inbox controls your digital life. It deserves your " +
                        "strongest authentication without exception."
                ),
                Block.Bullets(
                    listOf(
                        "Use a privacy-respecting provider: Proton Mail, Tuta, Migadu, or self-hosted if you're competent to run it.",
                        "Enable the strongest 2FA available, plus an account recovery method you actually control.",
                        "Consider Google's Advanced Protection Program if you are high-risk and stay on Gmail.",
                        "Never send secrets in an unencrypted email body or attachment.",
                        "Turn off automatic remote image loading — images are read-receipt trackers."
                    )
                ),
                Block.Heading("Compartmentation through aliases", "\u25B8"),
                Block.Para(
                    "Aliasing services generate a unique address per service. Three benefits: " +
                        "your real address never spreads, a breach at one vendor cannot be " +
                        "correlated with your other accounts, and you learn exactly who leaked " +
                        "or sold your data when spam arrives at a single-purpose alias."
                ),
                Block.Terminal(
                    listOf(
                        "$ alias --map",
                        "  bank ......... k7f2x@alias.example  -> inbox",
                        "  shopping ..... m9q1z@alias.example  -> inbox",
                        "  forum ........ p3w8v@alias.example  -> BURNED 2024-03",
                        "",
                        "> one leak, one alias disabled. no blast radius."
                    )
                ),
                Block.Field(
                    "Recovery hygiene",
                    "Check your account's recovery phone and address every few months. " +
                        "Attackers who gain brief access often add a recovery method and wait — " +
                        "a quiet, persistent backdoor."
                )
            ),
            references = listOf(
                Reference("Proton Mail", "https://proton.me/mail", "Swiss zero-access encrypted email."),
                Reference("Tuta", "https://tuta.com/", "German encrypted email provider."),
                Reference("SimpleLogin", "https://simplelogin.io/", "Open-source email aliasing."),
                Reference("addy.io", "https://addy.io/", "Privacy-focused alias management.")
            )
        )
    )
)

// ══════════════════════════════════════════════════════════════════════════
// CHAPTER 03 — PHYSICAL
// ══════════════════════════════════════════════════════════════════════════

private fun chapter03() = Chapter(
    id = "physical",
    index = 3,
    code = "CH-03",
    title = "Physical",
    glyph = "\u26E8",
    tier = Tier.INTERMEDIATE,
    tagline = "Digital systems live in the physical world. Protect the atoms.",
    briefs = listOf(
        Brief(
            id = "access",
            title = "Facility & Access Control",
            glyph = "\u26F6",
            summary = "Physical access defeats almost every digital control.",
            minutes = 3,
            blocks = listOf(
                Block.Para(
                    "There is an old maxim: if an attacker has physical access to your device, " +
                        "it is no longer your device. Disk encryption raises the cost, but " +
                        "physical access enables evil-maid attacks, hardware implants and " +
                        "straightforward theft."
                ),
                Block.Bullets(
                    listOf(
                        "Enforce badge access with anti-passback so one badge can't admit a crowd.",
                        "Train staff to challenge unfamiliar faces politely — and back them up when they do.",
                        "Escort visitors at all times. An unescorted visitor is an unaudited actor.",
                        "Protect server rooms with two factors: badge plus PIN.",
                        "Review access logs. Logs nobody reads are decoration."
                    )
                ),
                Block.Field(
                    "The politeness exploit",
                    "Tailgating works because challenging someone feels rude. Attackers " +
                        "weaponise that: arms full of boxes, a delivery uniform, a phone call " +
                        "they can't interrupt. Culture is the control — leadership must make it " +
                        "explicitly safe to ask \"can I see your badge?\""
                ),
                Block.Heading("Script for challenging", "\u25B8"),
                Block.Terminal(
                    listOf(
                        "\"Hi — I don't think we've met. Who are you here to see?\"",
                        "\"I'll walk you to reception, it's on my way.\"",
                        "\"Sorry, I can't hold the door — policy. Reception's right there.\"",
                        "",
                        "> friendly, firm, no accusation, no exception"
                    )
                )
            ),
            references = listOf(
                Reference("CISA Physical Security", "https://www.cisa.gov/topics/physical-security", "Facility protection guidance.")
            )
        ),
        Brief(
            id = "cleandesk",
            title = "Clean Desk & Visual Security",
            glyph = "\u26F6",
            summary = "Shoulders, screens, whiteboards, and the bin.",
            minutes = 3,
            blocks = listOf(
                Block.Bullets(
                    listOf(
                        "Lock your screen every single time you stand up. Make it reflex, not judgement.",
                        "Use a privacy filter in open offices, cafés, trains and planes.",
                        "Cross-cut shred sensitive paper. Strip-cut output is reassemblable.",
                        "Erase whiteboards after meetings — architecture diagrams are intelligence.",
                        "Never leave documents on printers; use pull-printing where available."
                    )
                ),
                Block.Field(
                    "Dumpster diving is not obsolete",
                    "Discarded paper, old hardware and packaging for newly-installed equipment " +
                        "tell an attacker exactly what you run. A box for a specific firewall " +
                        "model on the kerb is a free network diagram."
                ),
                Block.Heading("Shoulder surfing", "\u25B8"),
                Block.Para(
                    "Assume anyone behind you can read your screen and watch you type. On " +
                        "public transport, in coffee shops, at airport gates — position yourself " +
                        "with your back to a wall, and never enter your master passphrase " +
                        "without checking sightlines first. Cameras in public spaces record " +
                        "keystrokes too."
                )
            ),
            references = listOf(
                Reference("SANS Security Awareness", "https://www.sans.org/security-awareness-training/", "Workplace behavioural guidance.")
            )
        ),
        Brief(
            id = "travel",
            title = "Travel Security",
            glyph = "\u26F6",
            summary = "Borders, hotels, hostile networks and clean devices.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Travel strips away your normal controls. You cross jurisdictions with " +
                        "different legal powers, use networks you don't control, and leave " +
                        "devices in rooms staff can enter."
                ),
                Block.Numbered(
                    listOf(
                        "Travel with a clean device: wiped, freshly encrypted, minimal data, no unnecessary accounts.",
                        "Power devices fully OFF before any border crossing — this puts encryption keys out of memory.",
                        "Know your legal rights in both departure and arrival jurisdictions before you fly.",
                        "Apply tamper-evidence to device seams — glitter nail polish photographed close-up is the classic trick.",
                        "Never leave devices unattended in hotel rooms. Room safes are opened with a staff master code.",
                        "Avoid public USB charging ports; carry your own charger or a data-blocker.",
                        "Treat hotel and conference Wi-Fi as hostile — use your own VPN or phone hotspot.",
                        "Log out and re-verify accounts after returning."
                    )
                ),
                Block.Field(
                    "Border reality",
                    "In many countries border officers may inspect devices without a warrant, " +
                        "and in some may compel a password. The reliable defence is not " +
                        "resistance at the checkpoint — it is not carrying the data across the " +
                        "border at all. Sync it down afterwards from an account you can access remotely."
                ),
                Block.Heading("Tamper checks on return", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Compare seal photographs taken before departure.",
                        "Check for new USB devices, unexpected profiles, or unknown Bluetooth pairings.",
                        "Review account login history for the travel window.",
                        "If a device left your sight in a high-risk context, treat it as untrusted and rebuild it."
                    )
                )
            ),
            references = listOf(
                Reference("EFF — Digital Privacy at the US Border", "https://www.eff.org/wp/digital-privacy-us-border-2017", "Rights and practical guidance."),
                Reference("Tails OS", "https://tails.net/", "Amnesic OS that leaves no trace on the host.")
            )
        ),
        Brief(
            id = "surveillance",
            title = "Surveillance Awareness",
            glyph = "\u26F6",
            summary = "Patterns, cameras, radios and the discipline of variation.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Surveillance exploits predictability. If your movements are a schedule, " +
                        "observing you once is enough to predict you forever."
                ),
                Block.Bullets(
                    listOf(
                        "Vary routes, timings and meeting locations when it matters.",
                        "Cover webcams; use a hardware mic switch if your device offers one.",
                        "Be aware of IMSI catchers (\"Stingrays\") near sensitive gatherings — they impersonate cell towers.",
                        "Use a Faraday bag when true radio silence is required; airplane mode is a software promise, not a physical one.",
                        "Remember that leaving your phone at home is itself a detectable signal if you always carry it."
                    )
                ),
                Block.Heading("The device you carry is a beacon", "\u25B8"),
                Block.Para(
                    "A phone continuously reports to towers, broadcasts Wi-Fi and Bluetooth " +
                        "identifiers, and hands location to dozens of apps that sell it onward " +
                        "to data brokers. Commercially available location datasets have been " +
                        "used to identify individuals repeatedly. This is a market, not a conspiracy."
                ),
                Block.Field(
                    "Practical counter-measures",
                    "Enable MAC address randomisation. Turn off Wi-Fi and Bluetooth scanning " +
                        "when not connecting. Deny background location to everything that " +
                        "doesn't strictly need it. Reset your advertising ID regularly, or " +
                        "disable it entirely."
                ),
                Block.Heading("Counter-surveillance basics", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Notice, don't react. Recognising a repeated face or vehicle is the skill; confronting is not.",
                        "Use natural chokepoints — a shop with one entrance — to see who follows.",
                        "Establish a baseline of what normal looks like where you live and work, so anomalies stand out.",
                        "Document quietly: time, place, description. Patterns emerge from records, not memory."
                    )
                )
            ),
            references = listOf(
                Reference("EFF Street-Level Surveillance", "https://sls.eff.org/", "Detailed reference on police and commercial surveillance tech."),
                Reference("Amnesty Security Lab", "https://securitylab.amnesty.org/", "Research on spyware targeting civil society.")
            )
        ),
        Brief(
            id = "assets",
            title = "Asset & Media Protection",
            glyph = "\u26F6",
            summary = "Inventory, chain of custody, and real destruction.",
            minutes = 3,
            blocks = listOf(
                Block.Bullets(
                    listOf(
                        "Maintain an asset inventory: what you have, where it is, who owns it. You cannot protect an unknown device.",
                        "Track chain of custody for sensitive hardware from purchase to destruction.",
                        "Verify hardware provenance; be cautious with second-hand or gifted devices.",
                        "Destroy retired media properly — degauss, shred, or physically destroy platters and chips.",
                        "Remember that a 'deleted' file is merely unlinked, not erased."
                    )
                ),
                Block.Field(
                    "SSDs don't wipe like disks",
                    "Wear-levelling means overwriting a file on an SSD does not reliably " +
                        "overwrite the original cells. The correct approach is full-disk " +
                        "encryption from day one, then destroy the key — a 'crypto-erase'. " +
                        "Encrypted-from-new media is trivially and verifiably disposable."
                ),
                Block.Heading("Supply-chain caution", "\u25B8"),
                Block.Para(
                    "Buy critical hardware — especially security keys — from the manufacturer " +
                        "or an authorised reseller. Inspect packaging for tamper evidence. " +
                        "Cheap marketplace cables and chargers have shipped with implants; the " +
                        "O.MG cable is a commercially sold example."
                )
            ),
            references = listOf(
                Reference("NIST SP 800-88 — Media Sanitization", "https://csrc.nist.gov/pubs/sp/800/88/r1/final", "The authoritative standard for destroying data.")
            )
        )
    )
)

// ══════════════════════════════════════════════════════════════════════════
// CHAPTER 04 — HUMAN
// ══════════════════════════════════════════════════════════════════════════

private fun chapter04() = Chapter(
    id = "human",
    index = 4,
    code = "CH-04",
    title = "Human",
    glyph = "\u263F",
    tier = Tier.INTERMEDIATE,
    tagline = "Social engineering: the attacks, the tells, the protocols.",
    briefs = listOf(
        Brief(
            id = "vectors",
            title = "Attack Vectors",
            glyph = "\u2318",
            summary = "The standard repertoire, so you recognise it in the wild.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Social engineering attacks the human, not the machine. It remains the " +
                        "leading initial-access method because it needs no exploit — only a " +
                        "plausible story."
                ),
                Block.Table(
                    listOf(
                        "Phishing" to "Mass email impersonating trusted brands — Microsoft 365, DocuSign, HR, couriers.",
                        "Spear phishing" to "Researched and personalised. References real colleagues, projects, events.",
                        "Whaling" to "Targets executives specifically, usually for payment authority.",
                        "Vishing" to "Voice calls impersonating IT, the bank, or an authority. Now AI-voice-cloned.",
                        "Smishing" to "SMS lures — undelivered package, toll fee, bank alert.",
                        "Pretexting" to "A fabricated scenario and identity built to earn trust before the ask.",
                        "Baiting" to "Dropped USB drives, cracked software, free-gift lures.",
                        "Tailgating" to "Physically following an authorised person through a controlled door.",
                        "Quid pro quo" to "Offering help — usually fake IT support — in exchange for access."
                    )
                ),
                Block.Field(
                    "Business Email Compromise",
                    "BEC causes more measured financial loss than ransomware. No malware is " +
                        "involved: an attacker studies your invoicing, then emails accounts " +
                        "payable with new bank details at exactly the right moment in the cycle."
                ),
                Block.Heading("AI has changed the economics", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Grammatical errors are no longer a reliable tell — that heuristic is dead.",
                        "Voice cloning needs only seconds of audio, easily taken from social video.",
                        "Real-time deepfake video has already been used to authorise multi-million-dollar transfers.",
                        "The defence shifts from detecting fakery to verifying through a second, pre-agreed channel."
                    )
                )
            ),
            references = listOf(
                Reference("FBI IC3", "https://www.ic3.gov/", "Report cybercrime; annual BEC loss statistics."),
                Reference("APWG Phishing Reports", "https://apwg.org/trendsreports/", "Quarterly phishing trend data.")
            )
        ),
        Brief(
            id = "redflags",
            title = "Red Flags",
            glyph = "\u2318",
            summary = "The emotional signature of a social engineering attempt.",
            minutes = 3,
            blocks = listOf(
                Block.Para(
                    "You will not reliably detect a well-made fake by inspecting it. You will " +
                        "detect the attack by noticing what it is doing to you emotionally."
                ),
                Block.Terminal(
                    listOf(
                        "! URGENCY ....... \"in the next 10 minutes\"",
                        "! AUTHORITY ..... \"this is the CFO\"",
                        "! SECRECY ....... \"don't discuss this with anyone\"",
                        "! EMOTION ....... fear / flattery / greed / guilt",
                        "! ODD CHANNEL ... a director emailing from Gmail",
                        "! THE ASK ....... credentials, MFA codes, money, access",
                        "",
                        "> two or more together = stop and verify"
                    )
                ),
                Block.Field(
                    "The master tell",
                    "Urgency plus secrecy is the combination that should stop you cold. " +
                        "Legitimate business almost never requires that you act immediately AND " +
                        "tell nobody. That pairing exists specifically to prevent you from " +
                        "verifying."
                ),
                Block.Heading("What attackers ask for", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Credentials or an MFA code — no legitimate support desk will ever ask.",
                        "A payment, gift cards, or changed bank details.",
                        "Remote access to your machine.",
                        "Confirmation of details they should already possess — a classic verification-flip.",
                        "For you to disable a security control \"temporarily\"."
                    )
                ),
                Block.Para(
                    "Train the reflex: strong emotion during a request is itself the alarm. " +
                        "Feel it, name it, and slow down. Attacks are built to fail against delay."
                )
            ),
            references = listOf(
                Reference("CISA — Recognize and Report Phishing", "https://www.cisa.gov/secure-our-world/recognize-and-report-phishing", "Concise official guidance.")
            )
        ),
        Brief(
            id = "verification",
            title = "Verification Protocols",
            glyph = "\u2318",
            summary = "Turn trust into a procedure so it can't be talked around.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "The countermeasure to social engineering is not scepticism — it is " +
                        "procedure. A protocol you follow every time cannot be argued out of you " +
                        "by a persuasive stranger."
                ),
                Block.Numbered(
                    listOf(
                        "OUT-OF-BAND: verify via a channel the requester didn't choose. Call a number you already had — never one they supplied.",
                        "SHARED SECRET: agree a code word in advance with family and finance colleagues for high-stakes requests.",
                        "CHALLENGE-RESPONSE: ask something only the real person could answer, that isn't on their public profile.",
                        "PROCESS GATE: require two-person approval for payments and bank-detail changes above a threshold.",
                        "COOLING PERIOD: mandate a delay on any unusual high-value request. Attacks decay with time."
                    )
                ),
                Block.Field(
                    "The family code word",
                    "AI voice cloning has made \"grandparent scams\" devastatingly effective. " +
                        "Agree one word with your family today. If a distressed call asks for " +
                        "money, ask for the word. It costs nothing and defeats a cloned voice entirely."
                ),
                Block.Heading("Getting it right", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Never verify a request using contact details contained in the request itself.",
                        "Reply-all and 'reply' can both be spoofed — compose a fresh message to a known address.",
                        "Verify the person, not the account: a compromised real account passes every technical check.",
                        "Make verification blameless and expected. If following policy feels insulting, the policy will be skipped."
                    )
                ),
                Block.Para(
                    "Say this without apology: \"Our policy is that I verify this on a number " +
                        "I already have. I'll call you right back.\" A legitimate colleague will " +
                        "respect it. An attacker will apply pressure — which confirms your suspicion."
                )
            ),
            references = listOf(
                Reference("FTC — Family Emergency Scams", "https://consumer.ftc.gov/articles/family-emergency-scams", "Consumer guidance on voice-clone scams.")
            )
        ),
        Brief(
            id = "influence",
            title = "Influence & Manipulation",
            glyph = "\u2318",
            summary = "Cialdini's principles, weaponised — and how to disarm them.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Social engineers rely on well-documented persuasion principles. Knowing " +
                        "the names lets you notice the technique while it is being used on you."
                ),
                Block.Table(
                    listOf(
                        "Reciprocity" to "A small favour first, so refusing the real ask feels rude. Counter: gifts create no obligation.",
                        "Commitment" to "Get a trivial yes, then escalate. Counter: judge each request on its own merits.",
                        "Social proof" to "\"Everyone on your team already did this.\" Counter: verify with one of them.",
                        "Authority" to "Uniforms, titles, logos, letterheads. Counter: authority is claimed, not proven.",
                        "Liking" to "Mirroring, flattery, shared interests discovered suspiciously fast. Counter: rapport is not identity.",
                        "Scarcity" to "\"Only until 5pm.\" Counter: artificial deadlines are the point.",
                        "Unity" to "\"We insiders understand each other.\" Counter: belonging is not credentials."
                    )
                ),
                Block.Heading("The disarm", "\u25B8"),
                Block.Para(
                    "Naming the technique to yourself breaks its power: \"this is scarcity " +
                        "plus authority.\" Analysis moves you out of the emotional register the " +
                        "attack depends on and into a deliberate one."
                ),
                Block.Field(
                    "Elicitation",
                    "Skilled operators rarely ask for information directly. They state " +
                        "something wrong so you correct them, complain so you commiserate with " +
                        "detail, or flatter your expertise so you demonstrate it. Notice when a " +
                        "conversation keeps returning to one topic — and when you're doing all " +
                        "the talking."
                )
            ),
            references = listOf(
                Reference("Social-Engineer.org", "https://www.social-engineer.org/", "Framework, podcast and research on human hacking.")
            )
        )
    )
)

// ══════════════════════════════════════════════════════════════════════════
// CHAPTER 05 — COGNITIVE
// ══════════════════════════════════════════════════════════════════════════

private fun chapter05() = Chapter(
    id = "cognitive",
    index = 5,
    code = "CH-05",
    title = "Cognitive",
    glyph = "\u25D3",
    tier = Tier.INTERMEDIATE,
    tagline = "Your mind is both the best defence and the softest target.",
    briefs = listOf(
        Brief(
            id = "biases",
            title = "Cognitive Biases",
            glyph = "\u25CE",
            summary = "The predictable ways your reasoning fails under pressure.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Biases are efficient shortcuts that usually serve you well. Attackers " +
                        "know exactly which ones to trigger."
                ),
                Block.Table(
                    listOf(
                        "Optimism bias" to "\"It won't happen to me.\" The reason most people never start.",
                        "Normalcy bias" to "Dismissing early warning signs as noise because things have always been fine.",
                        "Confirmation bias" to "Seeking only evidence that you are already secure.",
                        "Authority bias" to "Complying with anyone who looks or sounds official.",
                        "Sunk cost" to "Persisting with a risky habit because you've invested in it.",
                        "Automation bias" to "Trusting the tool even when it is plainly wrong.",
                        "Halo effect" to "Trusting a whole person because of one impressive trait.",
                        "Dunning-Kruger" to "Overestimating your competence — most dangerous just after learning a little."
                    )
                ),
                Block.Field(
                    "The relevant irony",
                    "Finishing this program will make you feel substantially more secure than " +
                        "you are. Competence grows slower than confidence. Treat that gap as a " +
                        "permanent condition to be managed, not a phase to be passed."
                ),
                Block.Heading("Counter-measures", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Pre-commit to rules while calm; follow them when rushed. Rules outperform judgement under pressure.",
                        "Actively seek disconfirming evidence — ask what would prove you are already compromised.",
                        "Use checklists. Aviation solved this problem decades ago; expertise does not remove the need.",
                        "Run pre-mortems: assume the breach already happened, then explain how."
                    )
                )
            ),
            references = listOf(
                Reference("Thinking, Fast and Slow — Kahneman", "https://en.wikipedia.org/wiki/Thinking,_Fast_and_Slow", "Foundational work on dual-process reasoning."),
                Reference("Cognitive bias codex", "https://en.wikipedia.org/wiki/List_of_cognitive_biases", "Reference list of documented biases.")
            )
        ),
        Brief(
            id = "emotion",
            title = "Emotional Exploitation",
            glyph = "\u25CE",
            summary = "Every attack needs you to feel something first.",
            minutes = 3,
            blocks = listOf(
                Block.Table(
                    listOf(
                        "Fear" to "\"Your account is compromised — act now.\" The most common lever by far.",
                        "Greed" to "Prizes, refunds, investment returns, recovered funds.",
                        "Guilt" to "\"If you don't help me I'll lose my job.\"",
                        "Loneliness" to "Romance and long-con friendship scams. Patient — often months.",
                        "Curiosity" to "\"Photos of you.\" Malware's oldest delivery mechanism.",
                        "Fatigue" to "End-of-day and Friday-afternoon attacks, when willpower is spent."
                    )
                ),
                Block.Field(
                    "The universal rule",
                    "Treat strong emotion during any request as the alarm itself. The " +
                        "attacker needs you in an emotional state because your deliberate mind " +
                        "would catch this. Feeling rushed, flattered, frightened or thrilled is " +
                        "the signal to stop."
                ),
                Block.Heading("The pause protocol", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Notice the feeling and name it out loud: \"I feel rushed.\"",
                        "State the rule: \"I don't make security decisions while rushed.\"",
                        "Impose delay — ten minutes minimum, overnight if consequential.",
                        "Verify out-of-band during the delay.",
                        "Decide from the calm state, not the triggered one."
                    )
                ),
                Block.Para(
                    "Attacks are perishable. Nearly every social engineering scheme collapses " +
                        "when you introduce time, because the pretext cannot survive scrutiny " +
                        "and the attacker's window is short."
                )
            ),
            references = listOf(
                Reference("FTC Scam Alerts", "https://consumer.ftc.gov/scams", "Current scam patterns and emotional lures.")
            )
        ),
        Brief(
            id = "models",
            title = "Mental Models",
            glyph = "\u25CE",
            summary = "Five models that generate correct decisions automatically.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "You cannot memorise a response for every situation. Models generalise: " +
                        "internalise these five and most novel decisions answer themselves."
                ),
                Block.Table(
                    listOf(
                        "Assume breach" to "Something will be compromised. Optimise for fast detection and clean recovery, not just walls.",
                        "Defence in depth" to "No single control is sufficient. Layer them so one failure isn't total failure.",
                        "Least privilege" to "Grant the minimum access required, for the minimum time.",
                        "Zero trust" to "Never trust by location. Verify every time, including inside the perimeter.",
                        "Fail secure" to "When something breaks, it should break closed — denying access, not granting it."
                    )
                ),
                Block.Heading("Compartmentation", "\u25B8"),
                Block.Para(
                    "The sixth model, and the most powerful for individuals: separate your " +
                        "activities so that compromise of one does not cascade. Different " +
                        "emails, different passwords, different browsers, different devices for " +
                        "genuinely different roles. This is the principle that converts a " +
                        "catastrophe into an inconvenience."
                ),
                Block.Terminal(
                    listOf(
                        "$ threat-model --self",
                        "  what am i protecting? ......... ______",
                        "  from whom? .................... ______",
                        "  how bad if it fails? .......... ______",
                        "  how likely is it? ............. ______",
                        "  what will i actually sustain? . ______",
                        "",
                        "> five questions. answer them for real."
                    )
                ),
                Block.Field(
                    "Threat modelling as a habit",
                    "Those five questions are the whole discipline, compressed. Run them " +
                        "before adopting a new app, before a trip, before publishing anything, " +
                        "and whenever your circumstances change."
                )
            ),
            references = listOf(
                Reference("EFF — Your Security Plan", "https://ssd.eff.org/module/your-security-plan", "The five-question threat model, well explained."),
                Reference("NIST Zero Trust Architecture", "https://csrc.nist.gov/pubs/sp/800/207/final", "The formal specification.")
            )
        ),
        Brief(
            id = "mindset",
            title = "Defensive Mindset",
            glyph = "\u25CE",
            summary = "Sustainable vigilance without paranoia or burnout.",
            minutes = 3,
            blocks = listOf(
                Block.Bullets(
                    listOf(
                        "Sceptical by default: trust is earned incrementally and can be revoked.",
                        "Verify out-of-band for anything sensitive. Every time — no exceptions for familiar names.",
                        "Sleep on it. Time dissolves manufactured pressure.",
                        "Practise security mindfulness — notice when you're being rushed, flattered or frightened.",
                        "Debrief after incidents and near-misses. Learn without shame.",
                        "Hold boundaries: you owe no one your secrets, and \"no\" is a complete answer."
                    )
                ),
                Block.Field(
                    "Paranoia is a failure mode",
                    "Unsustainable vigilance collapses into apathy. The recruit who encrypts " +
                        "everything, trusts nobody and burns out in a month ends up less secure " +
                        "than the one who keeps five solid habits for years. Calibrate to your " +
                        "actual threat model and protect your capacity to sustain it."
                ),
                Block.Heading("Blameless culture", "\u25B8"),
                Block.Para(
                    "If clicking a bad link means humiliation, people hide it — and hidden " +
                        "incidents become disasters. The organisations that recover fastest are " +
                        "those where reporting a mistake within minutes is treated as the win it " +
                        "genuinely is. Apply the same standard to yourself."
                ),
                Block.Heading("When you make a mistake", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Report immediately — speed matters far more than completeness.",
                        "Disconnect the affected device from the network if malware is plausible.",
                        "Change credentials from a different, known-clean device.",
                        "Preserve evidence: don't wipe before anyone qualified can look.",
                        "Write down what happened while it's fresh; fix the process, not the person."
                    )
                )
            ),
            references = listOf(
                Reference("Google SRE — Postmortem Culture", "https://sre.google/sre-book/postmortem-culture/", "The canonical text on blameless review.")
            )
        )
    )
)

// ══════════════════════════════════════════════════════════════════════════
// CHAPTER 06 — IDENTITY
// ══════════════════════════════════════════════════════════════════════════

private fun chapter06() = Chapter(
    id = "identity",
    index = 6,
    code = "CH-06",
    title = "Identity",
    glyph = "\u25EF",
    tier = Tier.ADVANCED,
    tagline = "Compartmentation, personas, metadata and your public shadow.",
    briefs = listOf(
        Brief(
            id = "compartments",
            title = "Compartmentation",
            glyph = "\u25F0",
            summary = "Separate identities so one failure doesn't cascade.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Compartmentation is the practice of keeping distinct areas of your life " +
                        "cryptographically and behaviourally separate, so that compromising one " +
                        "reveals nothing about the others."
                ),
                Block.Table(
                    listOf(
                        "Legal identity" to "Banking, government, employment, medical. Maximum protection, minimum exposure.",
                        "Professional" to "Public-facing work. Deliberately visible, carefully curated.",
                        "Social" to "Friends and family. Moderate exposure, biggest oversharing risk.",
                        "Pseudonymous" to "Forums, activism, research. Must never touch the others."
                    )
                ),
                Block.Heading("How compartments break", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Reused username or email across two compartments — the single most common failure.",
                        "The same phone number for account recovery in both.",
                        "Logging into both from the same browser profile or IP.",
                        "Writing style, timezone of activity, and recurring typos — stylometry is effective.",
                        "A photo posted in one compartment that also exists in the other.",
                        "Payment: a card or crypto address that links back to your legal name."
                    )
                ),
                Block.Field(
                    "One link is enough",
                    "Compartmentation is brittle: correlation only needs to succeed once. " +
                        "Ross Ulbricht's Silk Road identity was traced substantially through an " +
                        "early forum post made under a username he had also used with his real " +
                        "email — years before, and long forgotten."
                ),
                Block.Heading("Maintaining separation", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Separate browser profiles at minimum; separate devices or VMs for serious separation.",
                        "Unique email alias per compartment, never a shared recovery address.",
                        "Never cross-post content, phrasing, or images.",
                        "Vary activity hours if timing patterns would correlate you.",
                        "Assume that when a compartment is burned, it stays burned. Retire it; don't repair it."
                    )
                )
            ),
            references = listOf(
                Reference("Whonix — Anonymity Guide", "https://www.whonix.org/wiki/DoNot", "Exhaustive list of behaviours that deanonymise people."),
                Reference("Qubes OS", "https://www.qubes-os.org/", "Compartmentalisation enforced by the operating system.")
            )
        ),
        Brief(
            id = "metadata",
            title = "Metadata & Digital Exhaust",
            glyph = "\u25F0",
            summary = "The data about your data, which you never chose to send.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Every file you create and every action you take emits metadata. It is " +
                        "invisible in normal use and frequently more revealing than the content."
                ),
                Block.Bullets(
                    listOf(
                        "Photos: GPS coordinates, exact timestamp, camera serial number, sometimes the owner's name.",
                        "Documents: author, organisation, revision history, tracked changes, deleted text still present in the file.",
                        "PDFs: producing software, embedded fonts, and often the full editing history.",
                        "Email headers: originating IP, client software, full relay path.",
                        "Screenshots: window titles, notification previews, other tabs, the clock and battery state."
                    )
                ),
                Block.Field(
                    "Documented consequences",
                    "John McAfee's location in Guatemala was exposed by GPS EXIF data in a " +
                        "journalist's photo. Vice's 2012 story is the standard example — the " +
                        "reporter did nothing more than upload an unedited iPhone picture."
                ),
                Block.Heading("Stripping metadata", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Use MAT2, ExifCleaner, or your OS's built-in 'remove properties' before sharing files.",
                        "Screenshot a document rather than sending the original when only the content matters.",
                        "Re-encode images rather than trusting a single strip pass.",
                        "For truly sensitive documents, retype the content into a fresh file.",
                        "Redact by removing content, never by drawing black boxes over it — the text remains underneath."
                    )
                ),
                Block.Heading("Redaction failures", "\u25B8"),
                Block.Para(
                    "Black rectangles in PDFs are a layer, not a deletion — the text is " +
                        "selectable underneath and this has embarrassed governments and law " +
                        "firms repeatedly. Pixelation and blurring are frequently reversible. " +
                        "Flatten to an image and crop, or delete the content in the source and " +
                        "regenerate the file."
                )
            ),
            references = listOf(
                Reference("MAT2 — Metadata Anonymisation Toolkit", "https://0xacab.org/jvoisin/mat2", "Command-line metadata stripping."),
                Reference("ExifCleaner", "https://exifcleaner.com/", "Drag-and-drop GUI metadata remover."),
                Reference("Dangerzone", "https://dangerzone.rocks/", "Converts risky documents into safe, flattened PDFs.")
            )
        ),
        Brief(
            id = "osint",
            title = "Your OSINT Shadow",
            glyph = "\u25F0",
            summary = "Investigate yourself before someone else does.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Open-source intelligence is the assembly of public fragments into a " +
                        "profile. Every social engineering attack begins here. The defence " +
                        "begins with running the same collection against yourself."
                ),
                Block.Heading("Self-assessment sweep", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Search your full name, each email address, each username, and your phone number.",
                        "Check haveibeenpwned.com for every address you use.",
                        "Reverse-image-search your profile photos — they link accounts you thought were separate.",
                        "Review the privacy settings and public post history on every social account.",
                        "Search data-broker sites for yourself and file opt-outs.",
                        "Check for your details in public records, company registries and domain WHOIS."
                    )
                ),
                Block.Field(
                    "What attackers assemble",
                    "Employer and role, colleagues' names, your manager, office location, " +
                        "commute pattern, family members, pets, schools, hobbies, the software " +
                        "you use, your birthday and hometown — enough for a convincing pretext " +
                        "and most password-reset answers."
                ),
                Block.Heading("Reducing the shadow", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Answer security questions with generated nonsense stored in your password manager — never the truth.",
                        "Remove your birthday, hometown, phone number and employer from public profiles.",
                        "Turn off location tagging; post after leaving a place, never while there.",
                        "Watch photo backgrounds — badges, screens, documents, street signs, reflections.",
                        "Use domain WHOIS privacy on anything you register.",
                        "Audit what colleagues, family and old accounts publish about you."
                    )
                ),
                Block.Para(
                    "You cannot erase your shadow, and attempting to can amplify it. Aim to " +
                        "shrink it and to know precisely what it contains, so you are never " +
                        "surprised by what an attacker already knows."
                )
            ),
            references = listOf(
                Reference("Have I Been Pwned", "https://haveibeenpwned.com/", "Breach exposure lookup."),
                Reference("OSINT Framework", "https://osintframework.com/", "Map of the tools used against you."),
                Reference("EFF — Surveillance Self-Defense", "https://ssd.eff.org/", "Practical guides to reducing exposure.")
            )
        ),
        Brief(
            id = "personas",
            title = "Personas & Legends",
            glyph = "\u25F0",
            summary = "Building a pseudonym that holds up — legally and practically.",
            minutes = 4,
            blocks = listOf(
                Block.Field(
                    "Legal boundary",
                    "Pseudonymity is legitimate and often essential for journalists, " +
                        "researchers, abuse survivors and activists. Using a false identity to " +
                        "commit fraud, evade law enforcement, or impersonate a real person is a " +
                        "crime. This brief covers defensive pseudonymity only."
                ),
                Block.Para(
                    "A persona is a consistent, self-contained identity used for a specific " +
                        "purpose. Its strength is measured entirely by how completely it is " +
                        "separated from your legal identity — not by how elaborate its backstory is."
                ),
                Block.Heading("Construction rules", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "Generate every detail; never adapt your real biography. Not your real birthday minus a year.",
                        "Create it on infrastructure that has never touched your real identity — device or VM, network, accounts.",
                        "Unique email, unique username, unique password, unique recovery path.",
                        "Never use a real photo of anyone, including AI faces that may be reused elsewhere. Avoid faces entirely if possible.",
                        "Establish it slowly. Accounts created and used immediately look synthetic.",
                        "Keep a written legend: details you improvise inconsistently will betray you."
                    )
                ),
                Block.Heading("Operational discipline", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Never log into the persona and your real identity from the same browser or IP.",
                        "Adjust writing style deliberately — vocabulary, punctuation, emoji habits, sign-offs.",
                        "Post outside your real timezone's typical hours where feasible.",
                        "Never mention real locations, employers, dates or relationships.",
                        "Never pay for anything with a method linked to your legal name.",
                        "When it is burned, abandon it completely. Do not migrate contacts across."
                    )
                ),
                Block.Field(
                    "The hardest part",
                    "Personas fail through fatigue, not analysis. Months in, discipline slips: " +
                        "a real detail, a shared joke, a login from home. Assume any persona you " +
                        "maintain for years will eventually be linked, and never place anything " +
                        "behind it that you could not survive being attributed to you."
                )
            ),
            references = listOf(
                Reference("Whonix — DoNot guide", "https://www.whonix.org/wiki/DoNot", "The definitive list of persona mistakes."),
                Reference("Tails OS", "https://tails.net/", "Amnesic environment for persona work.")
            )
        )
    )
)

// ══════════════════════════════════════════════════════════════════════════
// CHAPTER 07 — TRADECRAFT
// ══════════════════════════════════════════════════════════════════════════

private fun chapter07() = Chapter(
    id = "tradecraft",
    index = 7,
    code = "CH-07",
    title = "Tradecraft",
    glyph = "\u2726",
    tier = Tier.ADVANCED,
    tagline = "Threat modelling, incident response, and keeping it alive.",
    briefs = listOf(
        Brief(
            id = "threatmodel",
            title = "Building a Threat Model",
            glyph = "\u2723",
            summary = "Turn the whole doctrine into one page you actually use.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "A threat model is a written document, not a feeling. Writing it forces " +
                        "the specificity that makes every subsequent decision easy."
                ),
                Block.Numbered(
                    listOf(
                        "ASSETS — list what you're protecting, most valuable first.",
                        "ADVERSARIES — name who might want each asset, and what they can realistically do.",
                        "SURFACES — list where each asset lives and every path that reaches it.",
                        "IMPACT — describe what happens the day each asset is exposed.",
                        "CONTROLS — record what protects it now and what the gap is.",
                        "ACCEPTANCE — state explicitly which risks you are choosing to live with."
                    )
                ),
                Block.Terminal(
                    listOf(
                        "ASSET ..... client source list",
                        "ADVERSARY . civil litigant w/ subpoena power; opportunistic thief",
                        "SURFACE ... laptop, phone, cloud backup, email archive",
                        "IMPACT .... source harm, legal exposure, career loss",
                        "CONTROLS .. FDE, Signal disappearing msgs, no cloud sync",
                        "GAP ....... email archive still holds 3yrs of contacts",
                        "ACTION .... purge archive, move to E2EE notes  [DUE: 7d]"
                    )
                ),
                Block.Field(
                    "Keep it one page",
                    "A threat model longer than a page will never be reread, and one that is " +
                        "never reread is decoration. Review quarterly and whenever your " +
                        "circumstances change — new job, new relationship, new country, new " +
                        "public attention."
                ),
                Block.Heading("Common modelling errors", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Modelling the most dramatic adversary instead of the most likely one.",
                        "Listing controls you intend to adopt rather than the ones actually in place.",
                        "Ignoring the human surface — you, your family, your colleagues.",
                        "Forgetting backups, which frequently have weaker protection than the primary copy.",
                        "Never revisiting it after the initial burst of enthusiasm."
                    )
                )
            ),
            references = listOf(
                Reference("EFF — Your Security Plan", "https://ssd.eff.org/module/your-security-plan", "The clearest personal threat-modelling walkthrough."),
                Reference("OWASP Threat Modeling", "https://owasp.org/www-community/Threat_Modeling", "Structured approach for systems.")
            )
        ),
        Brief(
            id = "incident",
            title = "Incident Response",
            glyph = "\u2723",
            summary = "What to do in the first hour, decided before you need it.",
            minutes = 5,
            blocks = listOf(
                Block.Para(
                    "You will not think clearly during a compromise. The plan must exist " +
                        "beforehand, written down, somewhere you can reach without the affected " +
                        "device."
                ),
                Block.Heading("First hour", "\u25B8"),
                Block.Numbered(
                    listOf(
                        "CONTAIN — disconnect the affected device from the network. Don't power it off if forensics may matter.",
                        "ASSESS — what was accessible from that device or account? Assume everything reachable was reached.",
                        "ROTATE — change credentials from a different, known-clean device. Email first, then finance, then the rest.",
                        "REVOKE — terminate active sessions, remove unknown OAuth grants, unenrol unrecognised 2FA devices.",
                        "CHECK PERSISTENCE — new recovery emails/phones, forwarding rules, inbox filters, new SSH keys, new app passwords.",
                        "NOTIFY — tell your employer, bank, and anyone whose data was exposed. Fast disclosure limits damage.",
                        "PRESERVE — take notes with timestamps; keep logs before anything is wiped.",
                        "RECOVER — rebuild from known-good media rather than cleaning in place, if malware is suspected."
                    )
                ),
                Block.Field(
                    "The step people miss",
                    "Attackers establish persistence early. Changing your password while a " +
                        "mail-forwarding rule or a rogue recovery address remains in place " +
                        "accomplishes nothing. Always audit recovery settings, forwarding rules " +
                        "and connected apps after any account compromise."
                ),
                Block.Heading("Prepare in advance", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Keep an offline printed contact sheet: bank fraud line, employer security, carrier, key colleagues.",
                        "Store recovery codes on paper, physically separated from your devices.",
                        "Maintain a tested offline backup — ransomware encrypts connected backups too.",
                        "Know your reporting channels ahead of time (in India: cybercrime.gov.in and 1930).",
                        "Rehearse once. An unrehearsed plan is a hypothesis."
                    )
                ),
                Block.Heading("SIM swap: act in minutes", "\u25B8"),
                Block.Para(
                    "If your phone abruptly loses all service for no reason, treat it as a SIM " +
                        "swap until proven otherwise. Call your carrier from another line " +
                        "immediately and lock the account. Attackers move to your email and bank " +
                        "within minutes of taking the number."
                )
            ),
            references = listOf(
                Reference("India — National Cyber Crime Reporting Portal", "https://cybercrime.gov.in/", "Official reporting channel; helpline 1930."),
                Reference("CISA Incident Response", "https://www.cisa.gov/report", "US reporting and guidance."),
                Reference("NIST SP 800-61 — Incident Handling", "https://csrc.nist.gov/pubs/sp/800/61/r2/final", "The standard IR lifecycle.")
            )
        ),
        Brief(
            id = "sustaining",
            title = "Sustaining Operations",
            glyph = "\u2723",
            summary = "Security decays. Build the maintenance loop.",
            minutes = 4,
            blocks = listOf(
                Block.Para(
                    "Every posture degrades: accounts accumulate, permissions drift, backups " +
                        "silently fail, tools change hands, and habits erode. Without " +
                        "maintenance, today's good posture is next year's false confidence."
                ),
                Block.Table(
                    listOf(
                        "Daily" to "Lock screen, check login alerts, stay sceptical of inbound requests.",
                        "Weekly" to "Review app permissions and OAuth grants, apply updates, scan statements.",
                        "Monthly" to "Run the Self-Diagnostic, verify a backup restore, rotate what's due.",
                        "Quarterly" to "Re-read your threat model, audit your OSINT shadow, review recovery settings.",
                        "Annually" to "Full inventory, retire unused accounts, replace ageing hardware keys."
                    )
                ),
                Block.Field(
                    "Verify, don't assume",
                    "An untested backup is a rumour. Restore one real file every month. " +
                        "Organisations discover their backups were broken for a year at " +
                        "precisely the moment they need them."
                ),
                Block.Heading("Staying current", "\u25B8"),
                Block.Bullets(
                    listOf(
                        "Follow a small number of high-signal sources — Krebs on Security, Schneier, your vendors' advisories.",
                        "Subscribe to breach notifications for your addresses.",
                        "Re-evaluate tools annually; ownership changes and audit results matter more than features.",
                        "Beware security theatre: measure whether a control actually reduces a modelled risk.",
                        "Teach someone else. Explaining exposes the gaps in your own understanding faster than anything."
                    )
                ),
                Block.Heading("Graduation", "\u25B8"),
                Block.Para(
                    "You've reached the end of the program. You now have the doctrine, the " +
                        "digital and physical practices, the human and cognitive defences, and " +
                        "the identity discipline. What remains is repetition — the drills, the " +
                        "checklists, and the monthly audit. Competence here is a maintained " +
                        "state, never an achieved one."
                ),
                Block.Terminal(
                    listOf(
                        "$ agent0 --status",
                        "  curriculum .......... COMPLETE",
                        "  posture ............. MEASURE MONTHLY",
                        "  rule 01 ............. STILL IN EFFECT",
                        "",
                        "> you don't talk about this."
                    )
                )
            ),
            references = listOf(
                Reference("Krebs on Security", "https://krebsonsecurity.com/", "Investigative security journalism."),
                Reference("Schneier on Security", "https://www.schneier.com/", "Analysis of security, policy and risk."),
                Reference("Privacy Guides", "https://www.privacyguides.org/", "Continuously updated tool recommendations.")
            )
        )
    )
)
