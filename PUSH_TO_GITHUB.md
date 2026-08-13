# Pushing Agent-0 to GitHub

The repository is **already initialised and committed** in this workspace:

```
branch : main
commit : Agent-0 v1.0.0 — offline OPSEC training program for Android
author : Aby Bijo <Abybijo1978@gmail.com>
files  : 67 tracked, 12,579 lines
status : scanned — no credentials, no build artifacts
```

All that remains is creating the remote repo and pushing. Pick one route.

---

## Why I couldn't do this step for you

I have no access to your GitHub account — no token, no SSH key, no `gh` CLI in
this sandbox.

**Do not paste a Personal Access Token into a chat to work around that.** Chat
history persists, a PAT is a live credential that can create and delete repos,
and handing one to a third party is precisely the mistake Chapter 02 (Passwords
& Secrets) and Chapter 04 (Verification Protocols) train you to refuse. If you
ever did paste one anywhere, revoke it immediately at
<https://github.com/settings/tokens>.

Routes below keep the credential on your device, where it belongs.

---

## Route A — GitHub website + Termux (phone, recommended)

**1. Create the empty repo**

Go to <https://github.com/new> and set:

- **Repository name:** `Agent-0`
- **Visibility:** Public (or Private — your call)
- **Do NOT** tick "Add a README", `.gitignore`, or a licence.
  The project already has all three; initialising would cause a merge conflict.

**2. Create a token scoped to one job**

<https://github.com/settings/tokens> → **Generate new token (fine-grained)**

- Expiration: **7 days** (you only need it once)
- Repository access: **Only select repositories → Agent-0**
- Permissions: **Contents → Read and write** — nothing else

Least privilege, short lifetime. Chapter 01, Step 5.

**3. Push from Termux**

```bash
pkg install git
cd /path/to/agent0

git remote add origin https://github.com/AbyBijo/Agent-0.git
git push -u origin main
```

Username: `AbyBijo` · Password: **paste the token** (not your account password).

**4. Delete the token** at the tokens page once the push succeeds.

---

## Route B — Upload through the GitHub web UI (no terminal)

Slower, but needs no tooling at all.

1. Create the empty repo as in Route A step 1.
2. On the repo page tap **Add file → Upload files**.
3. Upload the project folders. Preserve the directory structure —
   `app/`, `gradle/`, `.github/` and the root files must keep their paths.
4. Commit directly to `main`.

Mobile browsers sometimes flatten folder uploads. Verify afterwards that
`app/src/main/java/com/abybijo/agent0/MainActivity.kt` exists at that exact
path; if it landed at the root, the build will fail.

---

## Route C — GitHub mobile app

The official app can create the repository but **cannot upload a folder tree**.
Use it for step 1, then finish with Route A or B.

---

## Immediately after the push: get your APK

The workflow at `.github/workflows/build.yml` is already committed, so the
moment the push lands GitHub can build the APK for you — no PC, no AIDE.

1. Repo → **Actions** tab
2. If prompted, click **I understand my workflows, go ahead and enable them**
3. **Build Agent-0 APK** → **Run workflow** → branch `main`
4. Wait ~5 minutes
5. Open the completed run → **Artifacts** → download **Agent-0-debug-apk**
6. Unzip on your phone and install (allow "install unknown apps")

A first run takes longer while Gradle caches dependencies.

---

## Recommended repo settings

Once it's live:

- **About → Description:**
  `Agent-0 — offline OPSEC training program for Android. Native Kotlin + Compose, monochrome terminal UI, zero permissions.`
- **Topics:** `android` `kotlin` `jetpack-compose` `opsec` `security`
  `privacy` `education` `offline-first` `material3`
- **Settings → General:** disable Wikis and Projects if you don't want them.

---

## Verifying the push

```bash
git log --oneline -1        # a59bc49 Agent-0 v1.0.0 …
git ls-files | wc -l        # 67
git remote -v               # origin  https://github.com/AbyBijo/Agent-0.git
```

On GitHub the repo should show **67 files**, the README rendered on the landing
page, and an **Actions** tab ready to build.
