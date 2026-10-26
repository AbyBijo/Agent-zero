# AGENT-0

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Platform: Android](https://img.shields.io/badge/Platform-Android-3DDC84.svg)](https://developer.android.com)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.24-7F52FF.svg)](https://kotlinlang.org)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-BOM%202024.06.00-4285F4.svg)](https://developer.android.com/jetpack/compose)
[![minSdk](https://img.shields.io/badge/minSdk-24-brightgreen.svg)](app/build.gradle.kts)
[![Offline](https://img.shields.io/badge/Offline-Zero%20permissions-black.svg)](app/src/main/AndroidManifest.xml)

**An offline, native Android training program for operational security (OPSEC).**

Agent-0 turns OPSEC into a structured curriculum — not a reference dump. Learn the
doctrine, practise decisions under pressure, test yourself, and audit your own
habits, all in one monochrome, terminal-style app that never connects to the
internet.

> **RULE 01 — You don't talk about this.**

---

## Contents

- [Why Agent-0](#why-agent-0)
- [At a glance](#at-a-glance)
- [What you will learn](#what-you-will-learn)
- [Train, assess, and reference](#train-assess-and-reference)
- [Privacy by construction](#privacy-by-construction)
- [Quick start](#quick-start)
- [Build from source](#build-from-source)
- [Project structure](#project-structure)
- [Design system](#design-system)
- [Accessibility](#accessibility)
- [Contributing](#contributing)
- [Disclaimer](#disclaimer)
- [License and credits](#license-and-credits)

---

## Why Agent-0

Most OPSEC advice is scattered: blog posts, checklists, and tools that each
cover one corner of the problem. Agent-0 brings the discipline together:

- **Structured learning** — eight chapters, graded Beginner → Advanced, so you
  build understanding in order instead of collecting disconnected tips.
- **Decision practice, not just reading** — branching scenario drills force a
  choice, then show the consequence of that choice.
- **Self-assessment** — a weighted diagnostic and a quiz bank with rationales,
  so you can see where you are weak instead of guessing.
- **Real-world grounding** — 57 documented breach case files and 67 vetted
  external references, so the lessons are tied to failures that actually
  happened.
- **Privacy as architecture, not policy** — the app declares zero Android
  permissions and has no network code, so it cannot transmit anything
  off-device. That claim is verifiable in the manifest, not something you have
  to take on trust.

### Who it is for

- Beginners and intermediates who want a disciplined introduction to OPSEC.
- People who want to practise social-engineering resistance, credential
  hygiene, device and travel security, and threat modelling in one place.
- Anyone who prefers a local, offline tool over a cloud account, a feed, or a
  subscription.

### Who it is not for

- It is not a hacking tool, and it does not teach offensive techniques for
  their own sake. Attack techniques are described only so they can be
  recognised and resisted.
- It is not a substitute for professional advice if you face a state-level
  adversary. See [Disclaimer](#disclaimer).

---

## At a glance

| | |
|---|---|
| **Version** | 1.0.0 (`versionCode` 1) |
| **Platform** | Android 7.0+ (`minSdk` 24) |
| **Language / UI** | Kotlin 1.9.24 · Jetpack Compose (BOM 2024.06.00) · Material 3 |
| **Build** | Android Gradle Plugin 8.5.2 · Gradle 8.7 · JDK 17 |
| **Target / compile SDK** | 34 |
| **Network** | None — zero permissions declared |
| **Accounts / analytics / ads** | None — everything is unlocked |
| **Storage** | Local only, via DataStore · cloud backup disabled |
| **License** | [MIT](LICENSE) |

### Content volume

| Subsystem | Volume |
|---|---|
| Chapters | 8, graded Beginner → Advanced |
| Briefs (lessons) | 35, ~135 minutes total |
| Scenario drills | 38 branching drills, every path verified reachable |
| Quiz bank | 35 questions, each with a rationale |
| Checklist items | 77, across 8 operational routines |
| Case files | 57 documented breaches |
| External references | 67 vetted links, plus 71 in-brief citations |
| Self-diagnostic | 24 weighted controls |

---

## What you will learn

| Chapter | Focus |
|---|---|
| **CH-00 · Orientation** | The rules, the mindset, and how to train |
| **CH-01 · Doctrine** | The five-step OPSEC process, from Purple Dragon to today |
| **CH-02 · Digital** | Credentials, 2FA, encryption, communications, devices, network, email |
| **CH-03 · Physical** | Facilities, clean desk, travel, surveillance, media destruction |
| **CH-04 · Human** | Social engineering: vectors, red flags, verification, influence |
| **CH-05 · Cognitive** | Biases, emotional exploitation, mental models, mindset |
| **CH-06 · Identity** | Compartmentation, metadata, OSINT shadow, personas |
| **CH-07 · Tradecraft** | Threat modelling, incident response, sustaining operations |

Each chapter is broken into short, hand-authored briefs. There are no bundled
web pages and no WebView — the curriculum is written in Kotlin and rendered
natively in Compose.

---

## Train, assess, and reference

### Learn

- **Chapter reader** — chapter list, chapter detail, and a brief reader with a
  dedicated block renderer for each lesson format.
- **Unified search** — search across the curriculum from the home dashboard.

### Train

- **Scenario drills** — branching decisions with verified-reachable paths.
  Wrong choices are instructive, not just marked wrong.
- **Quiz** — 35 questions, each with a rationale explaining the answer.
- **Checklists** — 77 items across 8 operational routines, for repeatable
  habits rather than one-off reading.
- **Passphrase Lab** — practise passphrase thinking in memory only. Nothing
  typed in the lab is stored or logged.

### Assess

- **Self-diagnostic** — 24 weighted controls, graded, so you can prioritise
  the gaps that matter most.
- **Risk view** — a consolidated view of where your current posture stands.

### Reference

- **Case archive** — 57 case files on real breaches, to study what failed and
  why.
- **Resource library** — 67 vetted external references. Links open in your
  browser through the system chooser, so you always verify third-party sources
  yourself.

---

## Privacy by construction

In a security app, privacy claims should be auditable. Every claim below can
be checked in the source.

| Claim | Mechanism | Where to verify |
|---|---|---|
| Cannot transmit data off-device | The manifest declares **zero** permissions — in particular, no `android.permission.INTERNET` | [`app/src/main/AndroidManifest.xml`](app/src/main/AndroidManifest.xml) |
| No cloud backup of your progress | `allowBackup="false"`, `fullBackupContent="false"`, plus explicit data-extraction rules | [`app/src/main/AndroidManifest.xml`](app/src/main/AndroidManifest.xml), [`app/src/main/res/xml/data_extraction_rules.xml`](app/src/main/res/xml/data_extraction_rules.xml) |
| No accounts, analytics, ads, or payments | None are implemented, and no such SDK is in the dependency list | [`app/build.gradle.kts`](app/build.gradle.kts) |
| Nothing leaves the device | The only I/O is local DataStore persistence for your progress | [`app/src/main/java/com/abybijo/agent0/data/Prefs.kt`](app/src/main/java/com/abybijo/agent0/data/Prefs.kt) |
| Passphrase Lab is private | Lab input is held in memory only — it is not stored or logged | In-app, under Drills → Passphrase Lab |
| You can erase everything | A **Burn** button in Settings wipes all local state instantly | In-app, under Settings |

External references are the one deliberate exception to “nothing leaves the
device”: tapping one hands the URL to Android's system chooser, so your
browser — not Agent-0 — makes the request, and you choose where it goes.

---

## Quick start

### Option 1 — Build in the cloud with GitHub Actions (no setup)

1. Open the repository on GitHub.
2. Go to **Actions → Build Agent-0 APK → Run workflow**.
3. Download the `Agent-0-debug-apk` artifact and install it on your device.

This is the easiest route if you are building from a phone. The workflow is
defined in [`.github/workflows/build.yml`](.github/workflows/build.yml).

### Option 2 — Android Studio (recommended for development)

1. Clone the repository and open it in Android Studio (Koala or newer).
2. Let Gradle sync — the wrapper is regenerated automatically.
3. Press **Run**.

### Option 3 — Build on your phone with AndroidIDE

See [`BUILDING_ON_ANDROID.md`](BUILDING_ON_ANDROID.md) for the full on-device
guide.

> **AIDE cannot build this project.** AIDE is unmaintained since 2021 and has
> no Jetpack Compose or aapt2 support, which is what causes `aapt failed`.
> That is a limitation of AIDE, not a bug in Agent-0. Use AndroidIDE or
> GitHub Actions instead.

---

## Build from source

### Requirements

- Android Studio Koala or newer (for the IDE route)
- JDK 17
- Android SDK 34
- Gradle 8.7 (for the command-line route — the repository ships wrapper
  properties for 8.7 but no wrapper JAR, matching the CI setup)

### Clone

```bash
git clone https://github.com/AbyBijo/Agent-zero.git
cd Agent-zero
```

### Command line

```bash
gradle assembleDebug      # APK → app/build/outputs/apk/debug/
gradle installDebug       # Build + install to a connected device
gradle assembleRelease    # Minified + resource-shrunk release build
```

If you have a working Gradle wrapper in your checkout, `./gradlew` can be
used in place of `gradle` above.

### Build configuration

| Setting | Value |
|---|---|
| `applicationId` | `com.abybijo.agent0` (debug builds add `.debug`) |
| `minSdk` / `targetSdk` / `compileSdk` | 24 / 34 / 34 |
| Kotlin | 1.9.24 (Compose compiler extension 1.5.14) |
| Compose | BOM 2024.06.00, Material 3 |
| Architecture | Single activity, Compose Navigation, `AndroidViewModel` + DataStore |
| Release build | Minification and resource shrinking enabled (`proguard-rules.pro`) |

---

## Project structure

```
com.abybijo.agent0
├── MainActivity.kt            Single activity, edge-to-edge, splash
├── AppViewModel.kt            Progress state, strongly-typed flow combination
├── data/
│   ├── Models.kt              Domain types (Chapter, Brief, Block, Scenario…)
│   ├── Curriculum.kt          All 8 chapters / 35 briefs, hand-authored
│   ├── Cases.kt               57 case studies
│   ├── Scenarios.kt           38 branching drills
│   ├── QuizBank.kt            35 questions + rationales
│   ├── Checklists.kt          77 checklist items
│   ├── Diagnostic.kt          24 weighted controls + grading
│   ├── Resources.kt           67 external references
│   └── Prefs.kt               DataStore persistence (the only I/O in the app)
├── nav/
│   ├── Destinations.kt        Every route in one auditable file
│   ├── Agent0App.kt           NavHost + boot/onboarding gate
│   └── TerminalBottomBar.kt   Custom bottom bar (no Material ripple/pill)
├── ui/
│   ├── theme/                 Ink palette, mono typography, Motion tokens
│   └── components/            Reveal primitives, surfaces, sigil, CRT backdrop
└── feature/
    ├── onboarding/            Boot sequence + 4-panel induction
    ├── home/                  Dashboard + unified search
    ├── chapters/              Chapter list, detail, brief reader, block renderer
    ├── drills/                Quiz, scenarios, checklists, diagnostic, risk, lab
    ├── intel/                 Case archive, resource library
    └── about/                 Credits, privacy statement, settings
```

## Design system

The app deliberately avoids stock Material widgets so its monochrome terminal
language stays consistent:

- **Canvas** — pure black, white type, terminal monospace, Unicode glyphs
  instead of icon assets. No colour appears anywhere; emphasis is carried by
  luminance, weight, spacing, and motion.
- **Animation primitives** (`ui/components/Reveal.kt`):
  - `RevealIn` — staggered lift + fade, used by nearly every content block
  - `TypewriterText` — frame-driven character reveal with a trailing block cursor
  - `ScrambleText` — glyphs churn through noise, then lock in left to right
  - `AsciiBar` — progress rendered as `[██████░░░░] 60%`
  - `CheckGlyph` — hollow square that fills on toggle
- **Micro-interactions** — buttons invert to a white slab and scale on press,
  with haptic feedback; no Material ripples anywhere (`noRippleClickable`);
  CRT scanline overlay, travelling scan sweep, and vignette (all toggleable);
  bottom-bar tabs mark selection with a growing rule, not a coloured pill.
- **Motion tokens** (`ui/theme/Motion.kt`) — one `Decode` easing curve drives
  every reveal, so the whole app feels like a single machine.

### The sigil

The Agent-0 sigil is drawn entirely in code — no raster assets at any density.
Outside in: an outer ring and an inner ring with a slowly rotating laurel of
60 radial ticks between them; 13 clearance studs; cardinal crosshair reticle
ticks; a shield with a chief bar; and a keyhole at the centre as the
classified core.

- In-app: `ui/components/Logo.kt` (Compose `Canvas`, animated)
- Launcher: `res/drawable/ic_launcher_foreground.xml` (adaptive + monochrome
  themed-icon support, with a legacy vector for API 24–25)

To use a real terminal typeface, drop `.ttf` files into `res/font/` and edit
the four commented lines in `ui/theme/Theme.kt`. The app ships with the
platform monospace, so it builds with zero binary assets.

## Accessibility

- **Reduce motion** — skips the boot sequence and shortens transitions.
- **Scanlines** — can be disabled for readability.
- **Contrast** — pure black/white is maximum contrast, far above WCAG AAA.
- **Text scaling** — all type scales with the system font size; no hardcoded
  `sp` overrides.

---

## Contributing

Contributions are welcome. To keep the project coherent, please follow these
ground rules:

1. **Keep it offline.** Do not add a permission, a network call, an analytics
   SDK, or any dependency that transmits data. A contribution that breaks the
   zero-permission guarantee will not be accepted.
2. **Keep it monochrome.** No colour, no stock Material ripples, no raster
   assets unless there is a strong reason — and then, say what it is.
3. **Keep content hand-authored and verifiable.** New briefs, cases, and
   references should cite primary sources, and every path in a new scenario
   drill must be reachable.
4. **Keep the architecture boring.** One activity, Compose Navigation, a
   single `AppViewModel` for progress state, DataStore as the only I/O.
5. **Open an issue first** for large changes, so the direction can be agreed
   before the work is done.

Suggested workflow: fork the repository, create a feature branch, make the
change, build a debug APK, and open a pull request describing what changed
and how you verified it.

---

## Disclaimer

Agent-0 is educational material for **defensive** operational security.
Attack techniques are described only so they can be recognised and resisted.
It is not legal advice — laws on encryption, anonymity, and recording vary
substantially between countries, and you are responsible for your own
compliance. If you face a state-level adversary, seek a professional
assessment.

---

## License and credits

**License:** [MIT](LICENSE) — Copyright (c) 2026 Aby Bijo.

**Author**

- Aby Bijo — GitHub: <https://github.com/AbyBijo>
- Email: Abybijo1978@gmail.com
- Academic: abybijo2025bca@mac.edu.in

**Sources and influences**

This curriculum draws on public work by the Electronic Frontier Foundation,
NIST, CISA, OWASP, the Tor Project, Privacy Guides, the Whonix documentation
team, and years of conference research from DEF CON and CCC. Verify everything
here against those primary sources.

---

*You don't talk about this.*
