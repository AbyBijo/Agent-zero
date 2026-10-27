# Agent-0 Changelog

## v2.0.1 (2026-10-27)

Resolved minor bugs and known issues.

- **Back navigation fixed** — the app never handled the Android system back
  button, so back walked through every brief and hub visited, and replayed
  the guided tour in reverse. Opening a brief now flattens the stack, and
  back from a brief or hub — header arrow and system back alike — always
  lands on that brief's chapter page. Tour steps move the same flat way,
  and finishing or skipping the tour leaves exactly home behind.
- **Profile alignment fixed** — long chapter titles no longer squeeze the
  chapter counts until they break across lines. The count is now a single
  non-wrapping token pinned to the right.
- **Chapter summary hub** — finishing a chapter's last brief now opens a
  chapter summary page (tagline, briefs, drills, minutes, every brief
  ticked) that asks whether to continue to the next chapter's first
  brief. The same summary is reachable from a completed chapter's page.
  The per-brief hub on every brief is unchanged.
- **Badges are chapter-only** — a grid of the 16 chapter badges, each
  unlocking only when its whole chapter is complete.
- **Final exam gate** — the exam now opens only after all briefs are
  complete and at least 35% of the drills are done (119 of 338). Profile
  shows exactly how many drills are left when briefs are done but drills
  are short.
- **Creator website** — About and About Developer now point to
  abybijo.web.app.

## v2.0.0 (2026-10-27)

Full curriculum expansion, built on the v1.0.1 baseline (9 chapters, 49 briefs).

- **Curriculum:** 16 chapters (CH-00–CH-15), 120 briefs in total — the 49 original
  briefs unchanged in order and content, plus 71 new briefs in CH-09 AI-Era OPSEC,
  CH-10 Financial Privacy, CH-11 Team/Workplace, CH-12 Incident Response,
  CH-13 OSINT/Counter-OSINT, CH-14 Travel/Borders, and CH-15 Capstone.
- **Practice:** 338 scenario drills (38 + 300), 548 practice questions
  (45 + 503), 409 case files (59 + 350), every new brief carrying at least
  1 drill, 1 linked case with a named public source, and 3 questions.
- **Progression:** sequential locking — the next brief unlocks only when the
  previous one is complete. No quiz threshold, no other gate.
- **Profile:** replaces About at top level. Name, age (display-only, never a
  gate), inbuilt avatar, progress, bookmarks, per-brief notes, badges, and the
  certificate section. Settings holds About and About Developer.
- **Brief Completion Hub:** after each brief, its question bank (tap-to-reveal
  answers), drills, linked cases with sources, and resources, plus the next
  brief. Notes are deliberately excluded from the Hub.
- **Quiz:** serves only questions from briefs already completed.
- **Final exam:** a dedicated 100-question bank (54 Advanced), separate from the
  practice bank, 30 minutes, question and option order jumbled on every take,
  pass mark 70/100. It unlocks only after all 120 briefs are complete.
- **Certificate:** unlocked by completing all briefs and passing the final
  exam. In-app view with the Agent-0 sigil, PNG and PDF download, and system
  share. It is a self-paced on-device completion record, not an accredited
  qualification, and it never fabricates a name — a real name is required.
- **Illustrations:** runtime vector illustrations for every brief in the
  monochrome aesthetic (black canvas, white/cream lines, yellow only for
  warnings, red only for danger).
- **Unchanged guarantees:** zero permissions, no network code, no accounts,
  no analytics, no ads, no WebView, local-only storage. Rule 1 is the only Rule.

## v1.0.1

- 9 chapters, 49 briefs, 38 scenario drills, 59 case files, 45 quiz questions,
  85 checklist items, ~186 minutes. Offline, zero permissions.
