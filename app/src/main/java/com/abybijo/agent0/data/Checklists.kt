package com.abybijo.agent0.data

/**
 * Operational checklists. Progress persists locally on-device.
 */
object Checklists {
    val groups: List<ChecklistGroup> = listOf(
        ChecklistGroup(
            id = "daily",
            title = "Daily Routine",
            glyph = "\u25CF",
            items = listOf(
                "Lock your screen every time you leave your desk",
                "Verify all software updates are applied",
                "Review login alerts on critical accounts",
                "Check password manager for breach notifications",
                "Back up encrypted notes or important files",
                "Clear clipboard after copying sensitive data",
                "Inspect your email inbox for phishing attempts",
                "Verify 2FA devices are in your possession"
            )
        ),
        ChecklistGroup(
            id = "weekly",
            title = "Weekly Sweep",
            glyph = "\u25D0",
            items = listOf(
                "Audit installed apps and revoke unused permissions",
                "Review connected OAuth applications",
                "Test restore of backups (at least one file)",
                "Rotate sensitive API keys if rotation is due",
                "Run malware scan on all endpoints",
                "Clear browser cookies and cache on shared devices",
                "Review recent logins on cloud accounts",
                "Check credit/debit card statements for anomalies",
                "Shred sensitive paper from the week"
            )
        ),
        ChecklistGroup(
            id = "monthly",
            title = "Monthly Audit",
            glyph = "\u25D1",
            items = listOf(
                "Run the Self-Diagnostic (in Tools section)",
                "Review and rotate recovery codes for critical accounts",
                "Inspect physical security of home/office (locks, cameras)",
                "Update emergency contacts and incident response plan",
                "Audit who has access to shared drives/cloud",
                "Review privacy settings on social media",
                "Verify PGP key validity / expiry",
                "Practice a tabletop incident response scenario",
                "Review travel OPSEC procedures if you traveled",
                "Test hardware security keys work across accounts"
            )
        ),
        ChecklistGroup(
            id = "travel",
            title = "Travel Protocol",
            glyph = "\u2708",
            items = listOf(
                "Prepare a \"clean\" travel device (wiped, encrypted, minimal data)",
                "Disable biometric unlock (FaceID/TouchID) before crossing borders",
                "Back up all local data at home and remove it from the travel device",
                "Install and test a trusted VPN on the travel device",
                "Log out of all non-essential cloud accounts and browsers",
                "Pack a physical privacy screen and Faraday bag for devices",
                "Set up an out-of-band check-in schedule with a trusted contact",
                "Enable full-disk encryption and a strong 6+ digit PIN on devices",
                "Remove physical documents, badges, and sensitive USB drives from bags",
                "(Post-Travel) Wipe the travel device completely before reconnecting to home/office network"
            )
        ),
        ChecklistGroup(
            id = "incident",
            title = "Incident Response",
            glyph = "\u26A0",
            items = listOf(
                "Isolate the affected device from the network (unplug Ethernet, disable Wi-Fi)",
                "Do NOT power off the device (preserve RAM for forensics, unless destructive wiping is occurring)",
                "Document the timeline: what happened, when, and what was clicked/opened",
                "Take photos of the screen with a separate, secure camera",
                "Notify the Incident Response team or IT Security via a known-good out-of-band channel",
                "Revoke active sessions and API tokens from a clean, secure device",
                "Change passwords for critical accounts from a clean device",
                "Preserve logs and avoid running unauthorized cleanup tools that might destroy evidence",
                "Draft an initial incident report for stakeholders",
                "Conduct a post-mortem to update the IR plan based on lessons learned"
            )
        ),
        ChecklistGroup(
            id = "hardening",
            title = "Device Hardening",
            glyph = "\u2699",
            items = listOf(
                "Audit all installed applications and uninstall unused software",
                "Review and disable unnecessary background services and startup items",
                "Check firewall rules and block all unsolicited inbound connections",
                "Verify full-disk encryption is active and functioning",
                "Test local backup integrity by restoring a random file",
                "Review user accounts and remove any unknown or disabled users",
                "Audit SSH keys and revoke any unrecognized authorized_keys",
                "Check for and apply pending firmware/BIOS updates",
                "Review shared folders, SMB shares, and network permissions",
                "Run a rootkit/malware scan using an offline or bootable scanner"
            )
        ),
        ChecklistGroup(
            id = "privacy",
            title = "Privacy Sweep",
            glyph = "\u25C8",
            items = listOf(
                "Review and revoke third-party app permissions (OAuth, \"Sign in with...\")",
                "Request data removal from data brokers and people-search sites",
                "Audit social media privacy settings and delete old, unnecessary posts",
                "Clear browser cookies, cache, and site data (or use container tabs)",
                "Review location history and disable unnecessary location tracking on mobile",
                "Check your email address against Have I Been Pwned and update compromised passwords",
                "Unsubscribe from unused newsletters and request deletion of dormant accounts",
                "Review microphone and camera permissions on all devices and browsers",
                "Use a metadata stripping tool (ExifCleaner) before uploading photos publicly",
                "Audit smart home devices and disable \"improve product\" data sharing"
            )
        ),
        ChecklistGroup(
            id = "vulnassess",
            title = "Vulnerability Assessment",
            glyph = "\u2317",
            items = listOf(
                "Run an external port scan (e.g., Nmap) against your public IP or network perimeter",
                "Review web application security headers (CSP, HSTS, X-Frame-Options)",
                "Check SSL/TLS certificate expiration and configuration (Qualys SSL Labs)",
                "Review DNS records for unintended open resolvers or exposed subdomains",
                "Audit cloud storage buckets (S3, Azure Blobs) for public access misconfigurations",
                "Review dependency vulnerabilities (npm audit, pip-audit, dependabot alerts)",
                "Check for exposed credentials in public code repositories",
                "Review physical security (door locks, camera blind spots, clean desk compliance)",
                "Conduct a tabletop exercise or phishing simulation for team members",
                "Document all findings and assign risk scores to prioritize remediation"
            )
        ),
    )

    val totalItems: Int = groups.sumOf { it.items.size }

    fun byId(id: String): ChecklistGroup? = groups.firstOrNull { it.id == id }
}
