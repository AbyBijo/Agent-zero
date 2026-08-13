package com.abybijo.agent0.data

/**
 * Curated external references. Every entry is a first-party, well-known
 * project or organisation. Links open in the system browser via a chooser —
 * Agent-0 itself performs no network I/O whatsoever.
 *
 * 67 entries across 13 categories.
 */
object Resources {
    val all: List<ResourceItem> = listOf(
        ResourceItem("Organizations", "Electronic Frontier Foundation (EFF)", "https://www.eff.org/", "Digital civil liberties; Surveillance Self-Defense guide."),
        ResourceItem("Organizations", "OWASP Foundation", "https://owasp.org/", "Open Web Application Security Project — Top 10, Cheat Sheets."),
        ResourceItem("Organizations", "CISA", "https://www.cisa.gov/", "US Cybersecurity and Infrastructure Security Agency advisories."),
        ResourceItem("Organizations", "NIST Cybersecurity Framework", "https://www.nist.gov/cyberframework", "Authoritative risk-management framework."),
        ResourceItem("Organizations", "SANS Institute", "https://www.sans.org/", "Training, whitepapers, and incident response resources."),
        ResourceItem("Tools", "Tor Project", "https://www.torproject.org/", "Anonymous browsing via the Tor network."),
        ResourceItem("Tools", "Signal", "https://signal.org/", "End-to-end encrypted messaging and voice."),
        ResourceItem("Tools", "ProtonMail", "https://proton.me/mail", "End-to-end encrypted email (Swiss jurisdiction)."),
        ResourceItem("Tools", "Bitwarden", "https://bitwarden.com/", "Open-source password manager."),
        ResourceItem("Tools", "KeePassXC", "https://keepassxc.org/", "Local-first, offline password manager."),
        ResourceItem("Tools", "Tails OS", "https://tails.net/", "Amnesic live operating system for anonymity."),
        ResourceItem("Tools", "Qubes OS", "https://www.qubes-os.org/", "Security through compartmentalization."),
        ResourceItem("Tools", "GrapheneOS", "https://grapheneos.org/", "Hardened Android for Pixel devices."),
        ResourceItem("Talks & Media", "DEF CON Media", "https://media.defcon.org/", "Recordings and slides from DEF CON talks."),
        ResourceItem("Talks & Media", "Chaos Computer Club (CCC)", "https://media.ccc.de/", "European hacker conference recordings."),
        ResourceItem("Talks & Media", "Darknet Diaries", "https://darknetdiaries.com/", "Podcast about true cyber stories."),
        ResourceItem("Books", "The Art of Invisibility — Kevin Mitnick", "https://mitnicksecurity.com/", "Practical privacy and anonymity."),
        ResourceItem("Books", "Sandworm — Andy Greenberg", "https://www.penguinrandomhouse.com/books/557047/sandworm-by-andy-greenberg/", "Investigation of Russian cyber operations."),
        ResourceItem("Books", "Countdown to Zero Day — Kim Zetter", "https://www.countdowntozeroday.com/", "Deep dive on Stuxnet."),
        ResourceItem("Books", "Permanent Record — Edward Snowden", "https://www.edwardsnowden.com/", "Memoir on surveillance and whistleblowing."),
        ResourceItem("Books", "Security Engineering — Ross Anderson", "https://www.cl.cam.ac.uk/~rja14/book.html", "The definitive textbook, freely available."),
        ResourceItem("Training", "OverTheWire Wargames", "https://overthewire.org/wargames/", "Hands-on security challenges."),
        ResourceItem("Training", "PortSwigger Web Security Academy", "https://portswigger.net/web-security", "Free web security training by Burp Suite makers."),
        ResourceItem("Training", "Hack The Box", "https://www.hackthebox.com/", "Interactive pentesting labs."),
        ResourceItem("Communication", "Signal", "https://signal.org/", "The gold standard for end-to-end encrypted messaging and voice calls. Open-source and metadata-minimized."),
        ResourceItem("Communication", "Session", "https://getsession.org/", "Decentralized, onion-routed messenger requiring no phone number or email to sign up."),
        ResourceItem("Communication", "SimpleX Chat", "https://simplex.chat/", "The first messenger with no user IDs at all. Completely anonymous and decentralized."),
        ResourceItem("Communication", "Briar", "https://briarproject.org/", "Peer-to-peer encrypted messenger that works offline via Bluetooth/Wi-Fi and over Tor."),
        ResourceItem("Communication", "Threema", "https://threema.ch/", "Swiss-based secure messenger that doesn't require a phone number or email."),
        ResourceItem("Communication", "Element (Matrix)", "https://element.io/", "Decentralized, federated, end-to-end encrypted team communication (alternative to Slack/Teams)."),
        ResourceItem("Email & Aliasing", "Proton Mail", "https://proton.me/mail", "Swiss-based, zero-access encrypted email provider."),
        ResourceItem("Email & Aliasing", "Tuta (formerly Tutanota)", "https://tuta.com/", "German-based encrypted email with built-in calendar and contact encryption."),
        ResourceItem("Email & Aliasing", "SimpleLogin", "https://simplelogin.io/", "Open-source email aliasing service to hide your real email address (owned by Proton)."),
        ResourceItem("Email & Aliasing", "addy.io (AnonAddy)", "https://addy.io/", "Privacy-focused email forwarding and alias management."),
        ResourceItem("Email & Aliasing", "DuckDuckGo Email Protection", "https://duckduckgo.com/email/", "Free email aliasing service that strips trackers from forwarded emails."),
        ResourceItem("Passwords & Auth", "Bitwarden", "https://bitwarden.com/", "Highly secure, open-source password manager with free self-hosting options."),
        ResourceItem("Passwords & Auth", "KeePassXC", "https://keepassxc.org/", "Local-only, offline, open-source password manager. Zero cloud footprint."),
        ResourceItem("Passwords & Auth", "Aegis Authenticator", "https://getaegis.app/", "Free, secure, open-source Android app for 2FA/TOTP tokens with encrypted backups."),
        ResourceItem("Passwords & Auth", "Ente Auth", "https://ente.io/auth/", "End-to-end encrypted, cross-platform open-source 2FA app."),
        ResourceItem("Passwords & Auth", "YubiKey", "https://www.yubico.com/", "Industry-leading hardware security keys for phishing-resistant FIDO2/WebAuthn MFA."),
        ResourceItem("Encryption", "VeraCrypt", "https://veracrypt.fr/", "The standard for creating encrypted file containers and full-disk encryption."),
        ResourceItem("Encryption", "Cryptomator", "https://cryptomator.org/", "Client-side encryption for cloud storage (Dropbox, Google Drive, etc.)."),
        ResourceItem("Encryption", "Picocrypt", "https://github.com/Picocrypt/Picocrypt", "Tiny, ultra-secure, modern file encryption tool using XChaCha20 and Argon2id."),
        ResourceItem("Encryption", "Age", "https://age-encryption.org/", "Modern, simple, secure file encryption tool (successor to GPG for file encryption)."),
        ResourceItem("Encryption", "Kryptor", "https://www.kryptor.org/", "Cross-platform file encryption and signing tool using modern cryptographic algorithms."),
        ResourceItem("OS & Mobile", "Tails OS", "https://tails.net/", "Amnesic live operating system that forces all connections through Tor and leaves no trace."),
        ResourceItem("OS & Mobile", "Qubes OS", "https://www.qubes-os.org/", "Reasonably secure OS that uses Xen virtualization to compartmentalize everything."),
        ResourceItem("OS & Mobile", "GrapheneOS", "https://grapheneos.org/", "The most secure and private mobile OS, designed exclusively for Google Pixel hardware."),
        ResourceItem("OS & Mobile", "CalyxOS", "https://calyxos.org/", "De-Googled, privacy-focused Android alternative with built-in Tor and encryption."),
        ResourceItem("OS & Mobile", "Whonix", "https://www.whonix.org/", "VM-based OS that routes all traffic through Tor, preventing IP leaks even if malware has root."),
        ResourceItem("OS & Mobile", "Kicksecure", "https://www.kicksecure.com/", "Security-hardened Linux distribution, the foundation for Whonix."),
        ResourceItem("Network & VPN", "Mullvad VPN", "https://mullvad.net/", "Privacy-first VPN requiring no email, accepts cash/crypto, and keeps zero logs."),
        ResourceItem("Network & VPN", "IVPN", "https://www.ivpn.net/", "Highly transparent, independently audited VPN with anti-tracker and multi-hop features."),
        ResourceItem("Network & VPN", "Proton VPN", "https://protonvpn.com/", "Swiss-based VPN with Secure Core servers and a strict no-logs policy."),
        ResourceItem("Network & VPN", "Pi-hole", "https://pi-hole.net/", "Network-wide ad and tracker blocking DNS sinkhole (runs on a Raspberry Pi or Docker)."),
        ResourceItem("Network & VPN", "Portmaster", "https://safing.io/portmaster/", "Application firewall that monitors and blocks all network connections on your device."),
        ResourceItem("Network & VPN", "WireGuard", "https://www.wireguard.com/", "Extremely fast, modern, and secure VPN protocol (use with a trusted provider or self-host)."),
        ResourceItem("Browsers & Search", "Tor Browser", "https://www.torproject.org/", "The only browser that provides true anonymity by routing traffic through the Tor network."),
        ResourceItem("Browsers & Search", "Mullvad Browser", "https://mullvad.net/en/browser", "Tor Browser without the Tor network. Best-in-class anti-fingerprinting for clearnet."),
        ResourceItem("Browsers & Search", "Brave Browser", "https://brave.com/", "Chromium-based browser with aggressive built-in ad/tracker blocking and Tor windows."),
        ResourceItem("Browsers & Search", "SearXNG", "https://searxng.org/", "Metasearch engine that aggregates results without tracking or profiling you."),
        ResourceItem("Browsers & Search", "DuckDuckGo", "https://duckduckgo.com/", "Mainstream private search engine that doesn't track your search history."),
        ResourceItem("Utilities", "ExifCleaner", "https://exifcleaner.com/", "Drag-and-drop tool to strip hidden GPS and metadata from images, videos, and PDFs."),
        ResourceItem("Utilities", "Dangerzone", "https://dangerzone.rocks/", "Converts potentially dangerous PDFs/Office docs into safe, sanitized PDFs."),
        ResourceItem("Utilities", "MAT2", "https://0xacab.org/jvoisin/mat2", "Metadata Anonymisation Toolkit. Command-line tool to strip metadata from files."),
        ResourceItem("Utilities", "BleachBit", "https://www.bleachbit.org/", "Open-source system cleaner to wipe cache, cookies, and free disk space securely."),
        ResourceItem("Utilities", "OnionShare", "https://onionshare.org/", "Share files, host websites, or chat anonymously over the Tor network directly from your PC."),
    )

    val categories: List<String> = all.map { it.category }.distinct()

    fun byCategory(cat: String): List<ResourceItem> = all.filter { it.category == cat }

    fun search(query: String): List<ResourceItem> {
        if (query.isBlank()) return all
        val q = query.trim().lowercase()
        return all.filter {
            it.name.lowercase().contains(q) ||
                it.description.lowercase().contains(q) ||
                it.category.lowercase().contains(q)
        }
    }
}
