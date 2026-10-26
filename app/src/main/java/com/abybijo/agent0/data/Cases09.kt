package com.abybijo.agent0.data

/** v2.0 Phase 4c: cases linked to CH-09 AI-Era briefs. Real incidents, public sources named. */
object Cases09 {
    val all: List<CaseStudy> = listOf(
        CaseStudy(
            id = "facebook-emotional-contagion-2014",
            title = "Facebook Emotional Contagion Experiment (2014)",
            year = "2014",
            tags = listOf("AI", "Feeds", "Manipulation"),
            summary = "Facebook altered the News Feeds of nearly 700,000 users to test whether emotional content in a feed changes what users post, without those users knowing they were in an experiment.",
            details = "The study, published in the Proceedings of the National Academy of Sciences, showed that users shown fewer positive posts produced fewer positive posts themselves, and vice versa. The experiment demonstrated, at scale, that a feed is not neutral: what an algorithm chooses to show shapes mood and behaviour.",
            lessons = listOf(
                "A feed is curated, not neutral. Treat its emotional pull as a designed effect, not a fact about the world.",
                "If you cannot see why something was shown to you, you cannot judge it fairly.",
                "Curate your own inputs deliberately, or someone else's algorithm will curate them for you."
            ),
            briefKey = "ai-era/ai-feed",
            source = "Proceedings of the National Academy of Sciences (2014)"
        ),
        CaseStudy(
            id = "samsung-chatgpt-leak-2023",
            title = "Samsung Engineers and ChatGPT (2023)",
            year = "2023",
            tags = listOf("AI", "Workplace", "Data Leak"),
            summary = "Samsung engineers pasted confidential source code and meeting notes into ChatGPT while debugging and summarising, and the material entered a system outside Samsung's control.",
            details = "The incident was reported after Samsung discovered the uploads and moved to restrict generative AI tools internally. The engineers were not acting maliciously; they were using a helpful tool for ordinary work. The leak happened because the tool's data handling was outside the company's boundary.",
            lessons = listOf(
                "Anything pasted into an external AI tool leaves your control. Treat it as published.",
                "Helpful tools are the most dangerous leak vector, because they are used without thinking.",
                "Workplace AI rules must be simple and known before the first paste, not written after the leak."
            ),
            briefKey = "ai-era/ai-memory",
            source = "Bloomberg (2023)"
        ),
        CaseStudy(
            id = "alexa-human-review-2019",
            title = "Alexa Recordings Reviewed by Humans (2019)",
            year = "2019",
            tags = listOf("AI", "Voice Assistants", "Privacy"),
            summary = "Amazon contractors listened to Alexa voice recordings to improve the assistant, including recordings users had not expected any human to hear.",
            details = "Bloomberg reported that a global team reviewed audio clips, some of which contained private conversations and identifying details. Amazon said the review improved accuracy, but the practice showed that 'processed by AI' often means 'heard by people you will never meet'.",
            lessons = listOf(
                "Voice assistants at home are microphones with a network connection. Assume recordings may be reviewed.",
                "Convenience features that listen continuously need a deliberate on-off decision, not a default.",
                "Review what a device stores and delete it on a schedule, not once."
            ),
            briefKey = "ai-era/ai-work-home",
            source = "Bloomberg (2019)"
        ),
        CaseStudy(
            id = "hong-kong-deepfake-fraud-2024",
            title = "Hong Kong Deepfake Video-Call Fraud (2024)",
            year = "2024",
            tags = listOf("AI", "Deepfake", "Fraud"),
            summary = "A finance worker in Hong Kong transferred a very large sum after a video call in which every other participant, including senior executives, was a deepfake.",
            details = "Hong Kong Police reported that the worker had initially doubted a suspicious message, then joined a video call where deepfaked colleagues confirmed the instruction. Seeing familiar faces on a live call overrode the original doubt. The fraud succeeded not by breaking security, but by breaking verification.",
            lessons = listOf(
                "A live video call is no longer proof of identity. Verify unusual instructions through a separate, trusted channel.",
                "Familiar faces are now forgeable. Familiarity is not authentication.",
                "When a request is unusual and urgent, the verification step is the work, not an obstacle to it."
            ),
            briefKey = "ai-era/ai-deepfake",
            source = "Hong Kong Police (2024)"
        ),
        CaseStudy(
            id = "lastpass-ceo-voice-deepfake-2024",
            title = "LastPass CEO Voice Deepfake (2024)",
            year = "2024",
            tags = listOf("AI", "Deepfake", "Phishing"),
            summary = "A LastPass employee received phone calls, messages, and voicemail impersonating the company's CEO using AI-generated voice, attempting to manipulate the employee.",
            details = "LastPass reported the attempt publicly, noting that the attacker used AI-generated audio to impersonate the chief executive. The attempt failed, but it showed that voice, long treated as a strong identifier, can now be cloned from a small sample of public audio.",
            lessons = listOf(
                "Voice alone is no longer authentication. Sensitive requests need a second, independent check.",
                "Public audio — talks, podcasts, videos — is training material for voice cloning.",
                "Report impersonation attempts, even failed ones: the next target may not recognise the fake."
            ),
            briefKey = "ai-era/ai-phishing",
            source = "LastPass (2024)"
        ),
        CaseStudy(
            id = "pope-puffer-jacket-2023",
            title = "The Pope in a Puffer Jacket (2023)",
            year = "2023",
            tags = listOf("AI", "Synthetic Media", "Verification"),
            summary = "An AI-generated image of Pope Francis in a white puffer jacket went viral in 2023, and many people believed it was a real photograph before it was debunked.",
            details = "The image was created with Midjourney and spread across social media, news outlets, and group chats. It was plausible, well-lit, and consistent with how a photograph looks — and that plausibility was enough. The image was harmless; the lesson was not.",
            lessons = listOf(
                "Plausibility is not evidence. A realistic image proves only that an image can be made.",
                "Check an image's origin before sharing it, especially when it confirms what you already believe.",
                "If an image would change your mind about something important, verify it through a second source."
            ),
            briefKey = "ai-era/ai-media-evidence",
            source = "Widely reported, March 2023"
        ),
        CaseStudy(
            id = "copilot-echoleak-2025",
            title = "Microsoft 365 Copilot EchoLeak (2025)",
            year = "2025",
            tags = listOf("AI", "Agents", "Prompt Injection"),
            summary = "Researchers demonstrated a zero-click vulnerability in Microsoft 365 Copilot in which a malicious email could manipulate the AI assistant into exfiltrating sensitive data, without the user clicking anything.",
            details = "The attack, disclosed by Aim Security Labs and acknowledged by Microsoft, used indirect prompt injection: instructions hidden in an email were treated by the assistant as instructions to follow. The assistant, acting on the user's behalf with the user's access, became the attacker's tool.",
            lessons = listOf(
                "AI agents act with your access. An agent that reads untrusted content can be steered by that content.",
                "Data an agent can reach is data an attacker can potentially reach through the agent.",
                "Limit what agents can access and what they can send, just as you would limit a new employee."
            ),
            briefKey = "ai-era/ai-agents",
            source = "Aim Security Labs (2025)"
        ),
        CaseStudy(
            id = "mata-avianca-fake-citations-2023",
            title = "Mata v. Avianca and Fake AI Citations (2023)",
            year = "2023",
            tags = listOf("AI", "Verification", "Hallucination"),
            summary = "Lawyers in a US federal case submitted a brief containing case citations invented by ChatGPT, which they had not verified before filing.",
            details = "The court in the Southern District of New York found that the cited cases did not exist. The lawyers had asked ChatGPT for supporting cases, received confident and plausible citations, and filed them without checking. The judge sanctioned the lawyers, noting that AI output had been treated as research.",
            lessons = listOf(
                "AI output that looks like research is not research. Verify every citation, quote, and fact before relying on it.",
                "Confidence in an answer is not evidence for it. Plausible formatting is not verification.",
                "The more important the document, the less AI output may be trusted unverified."
            ),
            briefKey = "ai-era/ai-verify-output",
            source = "US District Court, Southern District of New York (2023)"
        ),
        CaseStudy(
            id = "hallucinated-packages-2024",
            title = "Hallucinated Software Packages (2024)",
            year = "2024",
            tags = listOf("AI", "Code", "Supply Chain"),
            summary = "Security researchers showed that AI coding assistants regularly suggest software packages that do not exist, and attackers can register those names and wait for developers to install them.",
            details = "The research found that hallucinated package names were suggested repeatedly across prompts, making them predictable. An attacker who registers a hallucinated name turns an AI mistake into a supply-chain attack, delivered by a developer who trusted the suggestion.",
            lessons = listOf(
                "Never install a package an AI suggested without checking it exists, who maintains it, and what it contains.",
                "AI suggestions are starting points, not sources. Every dependency is a trust decision.",
                "Pin versions, review new dependencies, and treat AI-recommended packages with extra suspicion."
            ),
            briefKey = "ai-era/ai-research-code",
            source = "Security research on package hallucination (2024)"
        ),
        CaseStudy(
            id = "replika-privacy-2023",
            title = "Replika and Personal AI Companions (2023)",
            year = "2023",
            tags = listOf("AI", "Personal Data", "Privacy"),
            summary = "Mozilla's Privacy Not Included review flagged the AI companion app Replika for collecting deeply personal data, including intimate conversations, with weak privacy protections.",
            details = "Replika invites users to share their innermost thoughts with an AI companion, and Mozilla found that the app collected and shared personal data in ways users would not expect from a confidant. The case shows the gap between how a personal AI feels — private, understanding, safe — and how it actually handles data.",
            lessons = listOf(
                "A personal AI is not a private confidant. It is a service run by a company, with that company's data practices.",
                "The more personal the conversation, the more careful the data decision must be.",
                "Set personal rules for AI tools before the conversation feels private, not after."
            ),
            briefKey = "ai-era/ai-personal-rules",
            source = "Mozilla Foundation, Privacy Not Included (2023)"
        )
    )
}
