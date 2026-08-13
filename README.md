# AGENT-0

**OPSEC Training Program — native Android app**

A complete, offline, monochrome operational-security curriculum for beginners
through intermediates. Written from scratch in Kotlin + Jetpack Compose — no
WebView, no HTML, no bundled web assets.

> **RULE 01 — You don't talk about this.**

---

## What it is

Agent-0 turns operational security into a structured training program rather
than a reference dump: eight chapters graded by expertise, branching decision
drills, a weighted self-diagnostic, a case archive of real breaches, and a
vetted resource library.

Aesthetic: pure black canvas, white type, terminal monospace, unicode glyphs
instead of icon assets. No colour appears anywhere in the app — emphasis is
carried by luminance, weight, spacing and motion.

---

## Contents

| Subsystem | Volume |
|---|---|
| Chapters | 8, graded Beginner → Advanced |
| Briefs (lessons) | 35, ~135 min total |
| Scenario drills | 38 branching, every path verified reachable |
| Quiz bank | 35 questions, each with a rationale |
| Checklist items | 77 across 8 operational routines |
| Case files | 57 documented breaches |
| External references | 67 vetted links + 71 in-brief citations |
| Self-diagnostic | 24 weighted controls |

### Curriculum

```
CH-00  ORIENTATION   The rules, the mindset, how to train
CH-01  DOCTRINE      The five-step OPSEC process (Purple Dragon → today)
CH-02  DIGITAL       Credentials, 2FA, encryption, comms, devices, network, email
CH-03  PHYSICAL      Facilities, clean desk, travel, surveillance, media destruction
CH-04  HUMAN         Social engineering: vectors, red flags, verification, influence
CH-05  COGNITIVE     Biases, emotional exploitation, mental models, mindset
CH-06  IDENTITY      Compartmentation, metadata, OSINT shadow, personas
CH-07  TRADECRAFT    Threat modelling, incident response, sustaining operations
```

---

## Privacy by construction

This is the part that matters most in a security app:

- **No `android.permission.INTERNET`.** The manifest declares *zero*
  permissions. The app is structurally incapable of transmitting anything
  off-device — this is verifiable, not a promise.
- **No accounts, no analytics, no ads, no payments.** Everything is unlocked.
- **No cloud backup.** `allowBackup="false"` plus explicit data-extraction
  exclusions, so the platform never copies your progress anywhere.
- **Passphrase Lab is in-memory only.** Nothing typed is stored or logged.
- **External links hand off to your browser** through a system chooser, so
  you always verify third-party sources yourself.
- **Burn button** in Settings wipes all local state instantly.

---

## Build

> **Building from a phone?** AIDE **cannot** build this project — it is
> unmaintained since 2021 and has no Jetpack Compose or aapt2 support, which is
> what causes `aapt failed`. Use **AndroidIDE** or the included **GitHub Actions**
> workflow instead. See **[BUILDING_ON_ANDROID.md](BUILDING_ON_ANDROID.md)**.

Requirements: Android Studio (Koala or newer), JDK 17, Android SDK 34.

```bash
git clone <your-repo-url>
cd Agent-0
```

Open the folder in Android Studio and press **Run**. Gradle syncs and
regenerates the wrapper automatically.

Command line (once the wrapper JAR exists — see `gradle/wrapper/README.txt`):

```bash
./gradlew assembleDebug      # APK → app/build/outputs/apk/debug/
./gradlew installDebug       # build + install to a connected device
./gradlew assembleRelease    # minified + resource-shrunk release build
```

| Setting | Value |
|---|---|
| `minSdk` | 24 (Android 7.0) |
| `targetSdk` / `compileSdk` | 34 |
| Language | Kotlin 1.9.24 |
| UI | Jetpack Compose (BOM 2024.06.00), Material 3 |
| Architecture | Single-activity, Compose Navigation, `AndroidViewModel` + DataStore |

---

## Architecture

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

### Design system

Everything is custom — the app deliberately avoids stock Material widgets so
the monochrome terminal language stays consistent.

**Animation primitives** (`ui/components/Reveal.kt`)
- `RevealIn` — staggered lift + fade, used by nearly every content block
- `TypewriterText` — frame-driven character reveal with a trailing block cursor
- `ScrambleText` — glyphs churn through noise then lock in left-to-right
- `AsciiBar` — progress rendered as `[██████░░░░] 60%`
- `CheckGlyph` — hollow square that fills on toggle

**Micro-interactions**
- Buttons invert to a white slab and scale on press, with haptic feedback
- No Material ripples anywhere (`noRippleClickable`)
- CRT scanline overlay + travelling scan sweep + vignette (toggleable)
- Bottom-bar tabs mark selection with a growing rule, not a coloured pill

**Motion tokens** (`ui/theme/Motion.kt`) — one `Decode` easing curve drives
every reveal so the whole app feels like a single machine.

### Accessibility

- **Reduce motion** setting skips the boot sequence and shortens transitions.
- **Scanlines** can be disabled for readability.
- Pure black/white is maximum contrast (far above WCAG AAA).
- All type scales with the system font size; no hardcoded `sp` overrides.

---

## The logo

The Agent-0 sigil is drawn entirely in code — no raster assets at any density.

Structure, outside in: an outer ring and inner ring with a slowly rotating
laurel of 60 radial ticks between them; 13 clearance studs; cardinal crosshair
reticle ticks; a shield with a chief bar; and a keyhole at the centre as the
classified core.

- In-app: `ui/components/Logo.kt` (Compose `Canvas`, animated)
- Launcher: `res/drawable/ic_launcher_foreground.xml` (adaptive + monochrome
  themed-icon support, with a legacy vector for API 24–25)

To use a real terminal typeface, drop `.ttf` files into `res/font/` and edit
the four commented lines in `ui/theme/Theme.kt`. The app ships with the
platform monospace so it builds with zero binary assets.

---

## Disclaimer

Agent-0 is educational material for **defensive** operational security. Attack
techniques are described only so they can be recognised and resisted. It is not
legal advice — laws on encryption, anonymity and recording vary substantially
between countries, and you are responsible for your own compliance. If you face
a state-level adversary, seek a professional assessment.

---

## Credits

**With love, by Aby Bijo**

- GitHub — <https://github.com/AbyBijo>
- Email — Abybijo1978@gmail.com
- Academic — abybijo2025bca@mac.edu.in

This curriculum draws on public work by the Electronic Frontier Foundation,
NIST, CISA, OWASP, the Tor Project, Privacy Guides, the Whonix documentation
team, and years of conference research from DEF CON and CCC. Verify everything
here against those primary sources.

---

*You don't talk about this.*
