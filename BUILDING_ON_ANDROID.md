# Building Agent-0 from a phone

## Short version

**AIDE cannot build this app, and no edit to the code will change that.**
Your `aapt failed` error is AIDE hitting its own ceiling, not a bug in Agent-0.

Use **AndroidIDE** (free, on-device) or **GitHub Actions** (free, cloud) instead.
Both are covered below.

---

## Why AIDE fails

AIDE's last release was **3.2.210316 in March 2021**, it targets **API 29**, and it
was removed from the Play Store in January 2024. It has been unmaintained for
years.

Agent-0 needs things that shipped *after* AIDE stopped being updated:

| Agent-0 requires | AIDE provides |
|---|---|
| compileSdk 34 (Android 14) | bundled SDK ~API 29/30 |
| Jetpack Compose + compose compiler plugin | no Compose support at all |
| Android Gradle Plugin 8.x | AIDE's own non-Gradle builder |
| JDK 17 | JDK 8 era toolchain |
| `.gradle.kts` (Kotlin DSL) build scripts | Groovy `.gradle` only |

`aapt failed` is the old **aapt1** resource compiler choking on modern resources —
adaptive icons with `<monochrome>`, `Theme.SplashScreen`, `android:localeConfig`,
AndroidX attributes it has never seen. Modern builds use **aapt2**, which AIDE
does not ship.

Even if resource packaging somehow passed, the build would then fail on Compose,
because AIDE has no Compose compiler. There is no workaround short of deleting
the entire UI layer — which is the app.

---

## Option 1 — AndroidIDE (build on the phone) ✅ recommended

[AndroidIDE](https://github.com/AndroidIDEOfficial/AndroidIDE) is an actively
maintained on-device IDE with **real Gradle, AGP 8.x, JDK 17, and aapt2** —
exactly what this project needs.

1. Install AndroidIDE from [GitHub releases](https://github.com/AndroidIDEOfficial/AndroidIDE/releases)
   or F-Droid.
2. Open its **Terminal** and install the SDK components:
   ```bash
   sdkmanager --install "platforms;android-34" "build-tools;34.0.0"
   ```
3. In AndroidIDE, choose **Open existing project** and select the `agent0` folder.
4. Set the JDK to **17** in Settings → Build & Run.
5. Tap **Build → assembleDebug**.

APK lands in `app/build/outputs/apk/debug/`.

Requirements: **arm64 device, 4 GB+ RAM, ~6 GB free**. A first build takes a
while — Gradle downloads dependencies once, then subsequent builds are quick.

---

## Option 2 — GitHub Actions (build in the cloud, no PC) ✅ easiest

Nothing to install. GitHub builds the APK and hands you a download link. This
repo already contains the workflow at `.github/workflows/build.yml`.

1. Create a repository at [github.com/new](https://github.com/new) (phone browser is fine).
2. Upload the project — either with the GitHub mobile app, the web
   **Add file → Upload files** button, or Termux:
   ```bash
   pkg install git
   cd agent0
   git init && git add -A
   git commit -m "Agent-0 initial commit"
   git branch -M main
   git remote add origin https://github.com/AbyBijo/Agent-0.git
   git push -u origin main
   ```
3. On GitHub, open the **Actions** tab → **Build Agent-0 APK** → **Run workflow**.
4. Wait ~5 minutes. Open the finished run, and under **Artifacts** download
   **Agent-0-debug-apk**.
5. Unzip on your phone and install the APK (allow "install unknown apps").

The repo now ships the Gradle wrapper (`gradlew` + `gradle-wrapper.jar`),
so the workflow just runs `./gradlew assembleDebug`.

---

## Option 3 — Termux (command line on the phone)

Workable but fiddly; the Android SDK is not officially built for Termux.
Prefer options 1 or 2. If you want it anyway:

```bash
pkg install openjdk-17 gradle wget unzip
# then install cmdline-tools + platforms;android-34 + build-tools;34.0.0
# set ANDROID_HOME, then:
cd agent0 && gradle assembleDebug
```

---

## Installing the APK

The debug build has `applicationId` **com.abybijo.agent0.debug**, so it installs
alongside a release build without conflict.

If Play Protect warns about an unsigned/unknown app, that is expected for a
self-built debug APK — choose **Install anyway**.

---

## Reality check on "no errors but aapt failed"

That combination is exactly the signature of this problem: your **Kotlin is
fine** (AIDE's editor parsed it without complaint, and the sources were
verified against the Kotlin 1.9.24 compiler with zero syntax errors), but
AIDE's **2021-era resource packager** cannot process a 2024-era Android project.

The fix is a newer toolchain, not newer code.
