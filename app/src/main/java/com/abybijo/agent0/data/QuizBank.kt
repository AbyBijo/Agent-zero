package com.abybijo.agent0.data

/**
 * Assessment bank — 35 questions. Each carries a rationale so a
 * wrong answer teaches instead of just scoring.
 */
object QuizBank {
    val all: List<QuizQuestion> = listOf(
        QuizQuestion(
            prompt = "What is the primary goal of OPSEC?",
            options = listOf("Eliminate all risk", "Reduce risk to an acceptable level", "Encrypt everything", "Hide from the internet"),
            answerIndex = 1,
            rationale = "OPSEC aims to manage residual risk, not achieve impossible perfection."
        ),
        QuizQuestion(
            prompt = "Which is the first step of the 5-step OPSEC process?",
            options = listOf("Apply countermeasures", "Threat analysis", "Identify critical information", "Risk assessment"),
            answerIndex = 2,
            rationale = "You cannot protect what you have not identified as critical."
        ),
        QuizQuestion(
            prompt = "Which authentication method is strongest?",
            options = listOf("SMS code", "Email link", "TOTP app", "FIDO2 hardware key"),
            answerIndex = 3,
            rationale = "FIDO2 keys are phishing-resistant and cannot be intercepted remotely."
        ),
        QuizQuestion(
            prompt = "What does PBKDF2 stand for?",
            options = listOf("Password-Based Key Derivation Function 2", "Public Binary Key Diffusion Function 2", "Private Block Key Distribution Format 2", "Password Binding Key Defense Function 2"),
            answerIndex = 0,
            rationale = "PBKDF2 derives cryptographic keys from passwords via iterated hashing."
        ),
        QuizQuestion(
            prompt = "Which password-hashing algorithm is currently recommended?",
            options = listOf("MD5", "SHA-1", "Argon2id", "DES-crypt"),
            answerIndex = 2,
            rationale = "Argon2id is memory-hard and resists GPU/ASIC attacks."
        ),
        QuizQuestion(
            prompt = "What is credential stuffing?",
            options = listOf("Writing down passwords", "Automated login attempts using breached credential lists", "Brute-forcing a single account", "Shoulder surfing"),
            answerIndex = 1,
            rationale = "Attackers test leaked username/password pairs against many services."
        ),
        QuizQuestion(
            prompt = "A CEO emails you from a Gmail address asking for an urgent wire transfer. What should you do?",
            options = listOf("Comply immediately", "Verify out-of-band via a known number", "Reply asking for confirmation", "Forward to IT"),
            answerIndex = 1,
            rationale = "Impersonation of executives via email is a classic BEC attack."
        ),
        QuizQuestion(
            prompt = "Which of these is NOT a Cialdini principle of influence?",
            options = listOf("Reciprocity", "Scarcity", "Encryption", "Authority"),
            answerIndex = 2,
            rationale = "Encryption is a technical control, not a social influence principle."
        ),
        QuizQuestion(
            prompt = "What is tailgating?",
            options = listOf("Following an authorized person through a secure door", "Driving behind someone", "Backing up data", "A phishing technique"),
            answerIndex = 0,
            rationale = "Tailgating is a physical access bypass technique."
        ),
        QuizQuestion(
            prompt = "Which bias leads people to underestimate their own risk?",
            options = listOf("Confirmation bias", "Optimism bias", "Halo effect", "Sunk cost"),
            answerIndex = 1,
            rationale = "Optimism bias makes people believe negative events are less likely to affect them."
        ),
        QuizQuestion(
            prompt = "What does \"assume breach\" mean?",
            options = listOf("Give up on security", "Plan for inevitable compromise and focus on detection/recovery", "Hack yourself", "Blame users"),
            answerIndex = 1,
            rationale = "No system is perfect; defenders must detect and recover quickly."
        ),
        QuizQuestion(
            prompt = "Why is SMS-based 2FA considered weak?",
            options = listOf("Slow delivery", "Vulnerable to SIM swapping and SS7 attacks", "Expensive", "Not widely supported"),
            answerIndex = 1,
            rationale = "Attackers can intercept SMS via carrier-level attacks."
        ),
        QuizQuestion(
            prompt = "What is a Faraday bag used for?",
            options = listOf("Storing paper", "Blocking all radio signals from a device", "Cooling hardware", "Charging devices"),
            answerIndex = 1,
            rationale = "Faraday bags create a radio shield, preventing tracking and remote access."
        ),
        QuizQuestion(
            prompt = "Which tool provides true anonymity on the internet?",
            options = listOf("VPN", "Incognito mode", "Tor Browser", "Proxy"),
            answerIndex = 2,
            rationale = "Tor routes traffic through 3 relays and does not rely on a single trusted provider."
        ),
        QuizQuestion(
            prompt = "What is a \"clean device\" for travel?",
            options = listOf("Newly purchased device", "Wiped, encrypted device with minimal data", "Device with antivirus", "Device with latest updates"),
            answerIndex = 1,
            rationale = "A clean device limits the damage if seized or inspected."
        ),
        QuizQuestion(
            prompt = "Which of these is a supply-chain attack?",
            options = listOf("SQL injection", "Compromising a software vendor's build system", "Phishing", "DDoS"),
            answerIndex = 1,
            rationale = "Supply-chain attacks target vendors to reach many downstream victims."
        ),
        QuizQuestion(
            prompt = "What was Stuxnet primarily designed to do?",
            options = listOf("Steal credit cards", "Cause physical damage to Iranian centrifuges", "Encrypt files for ransom", "Mine cryptocurrency"),
            answerIndex = 1,
            rationale = "Stuxnet was the first known cyberweapon to cause kinetic damage."
        ),
        QuizQuestion(
            prompt = "Why did the OPM breach matter?",
            options = listOf("It exposed 21M SF-86 security clearance records", "It crashed the internet", "It was a ransomware attack", "It was a DDoS"),
            answerIndex = 0,
            rationale = "SF-86 forms contain deeply personal details ideal for future espionage."
        ),
        QuizQuestion(
            prompt = "What should you do when receiving an urgent request for credentials?",
            options = listOf("Comply immediately", "Verify out-of-band", "Share via email", "Forward to a coworker"),
            answerIndex = 1,
            rationale = "Urgency is a classic social-engineering red flag."
        ),
        QuizQuestion(
            prompt = "What does \"least privilege\" mean?",
            options = listOf("No one gets any access", "Give each person the minimum access needed", "Give everyone admin", "Only IT gets access"),
            answerIndex = 1,
            rationale = "Least privilege limits the blast radius of a compromise."
        ),
        QuizQuestion(
            prompt = "Which encryption mode provides authentication?",
            options = listOf("AES-CBC", "AES-ECB", "AES-GCM", "ROT13"),
            answerIndex = 2,
            rationale = "GCM is an authenticated encryption mode providing confidentiality + integrity."
        ),
        QuizQuestion(
            prompt = "What is a \"shared secret\" in social-engineering defense?",
            options = listOf("A password everyone knows", "A pre-agreed code word for verifying sensitive requests", "A database", "A firewall rule"),
            answerIndex = 1,
            rationale = "Shared secrets let you verify identity over untrusted channels."
        ),
        QuizQuestion(
            prompt = "Which file-destruction method is most reliable for SSDs?",
            options = listOf("Magnet", "Shredding / physical destruction", "Format", "Delete key"),
            answerIndex = 1,
            rationale = "SSDs have wear-leveling; physical destruction is the only sure method."
        ),
        QuizQuestion(
            prompt = "What does a VPN primarily do?",
            options = listOf("Make you anonymous", "Shift trust from ISP to VPN provider", "Block malware", "Encrypt the hard drive"),
            answerIndex = 1,
            rationale = "VPNs do not equal anonymity; they change who you trust."
        ),
        QuizQuestion(
            prompt = "What is vishing?",
            options = listOf("Video phishing", "Voice phishing", "Visual phishing", "Virtual phishing"),
            answerIndex = 1,
            rationale = "Vishing uses voice calls to manipulate victims."
        ),
        QuizQuestion(
            prompt = "Which is the best password recovery strategy?",
            options = listOf("Security questions", "Printed recovery codes stored in a safe", "Email reset link only", "SMS reset"),
            answerIndex = 1,
            rationale = "Printed codes offline are resistant to remote attacks."
        ),
        QuizQuestion(
            prompt = "What is the main weakness of password reuse?",
            options = listOf("Hard to remember", "One breach compromises all accounts", "Slow login", "Browser incompatibility"),
            answerIndex = 1,
            rationale = "Credential stuffing exploits reused passwords at scale."
        ),
        QuizQuestion(
            prompt = "What does \"defense in depth\" mean?",
            options = listOf("Single strong firewall", "Multiple overlapping security layers", "Deepest basement server", "Encrypting twice"),
            answerIndex = 1,
            rationale = "No single control is perfect; layers compensate for each other."
        ),
        QuizQuestion(
            prompt = "Which is a sign of a phishing email?",
            options = listOf("Correct logo", "Mismatched sender domain", "Polite tone", "HTML formatting"),
            answerIndex = 1,
            rationale = "Sender address spoofing often fails at the domain level."
        ),
        QuizQuestion(
            prompt = "What should you assume about email?",
            options = listOf("It is encrypted by default", "It is a public postcard unless E2E encrypted", "It is always safe", "It cannot be intercepted"),
            answerIndex = 1,
            rationale = "Standard email is transmitted in cleartext across many servers."
        ),
        QuizQuestion(
            prompt = "What is a BEC attack?",
            options = listOf("Browser Exploit Code", "Business Email Compromise", "Binary Encryption Certificate", "Biometric Entry Control"),
            answerIndex = 1,
            rationale = "BEC scams impersonate executives to authorize fraudulent transfers."
        ),
        QuizQuestion(
            prompt = "Which bias makes people comply with someone in uniform?",
            options = listOf("Halo effect", "Authority bias", "Confirmation bias", "Anchoring"),
            answerIndex = 1,
            rationale = "Uniforms, titles, and logos trigger automatic compliance."
        ),
        QuizQuestion(
            prompt = "What is the recommended minimum iteration count for PBKDF2-SHA256 today?",
            options = listOf("100", "1,000", "100,000+", "1"),
            answerIndex = 2,
            rationale = "Modern hardware requires high iterations to slow attackers."
        ),
        QuizQuestion(
            prompt = "What is a SIM swap attack?",
            options = listOf("Replacing your phone", "Convincing a carrier to port your number to an attacker's SIM", "Buying a new SIM", "A type of malware"),
            answerIndex = 1,
            rationale = "SIM swaps bypass SMS-based 2FA and account recovery."
        ),
        QuizQuestion(
            prompt = "Which practice reduces OPSEC risk when traveling?",
            options = listOf("Posting location on social media", "Using hotel Wi-Fi without VPN", "Carrying a clean encrypted device", "Leaving devices in the hotel room"),
            answerIndex = 2,
            rationale = "Clean devices limit the blast radius of device seizure."
        ),
    )

    /** Deterministic-per-session shuffle of [count] questions. */
    fun session(count: Int = 10, seed: Long = System.currentTimeMillis()): List<QuizQuestion> =
        all.shuffled(kotlin.random.Random(seed)).take(count.coerceAtMost(all.size))
}
