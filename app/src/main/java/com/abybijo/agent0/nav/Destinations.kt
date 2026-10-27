package com.abybijo.agent0.nav

/** Every route in Agent-0. Kept in one place so navigation stays auditable. */
object Route {
    const val BOOT = "boot"
    const val ONBOARDING = "onboarding"

    const val HOME = "home"
    const val CHAPTERS = "chapters"
    const val DRILLS = "drills"
    const val INTEL = "intel"
    const val ABOUT = "about"
    const val PROFILE = "profile"
    const val ABOUT_DEVELOPER = "about-developer"

    const val CHAPTER_DETAIL = "chapter/{chapterId}"
    fun chapterDetail(id: String) = "chapter/$id"

    const val BRIEF = "brief/{chapterId}/{briefId}"
    fun brief(chapterId: String, briefId: String) = "brief/$chapterId/$briefId"

    // v2.0 Phase 5 — Brief Completion Hub, opened from a brief's Next
    // action once the brief is marked complete.
    const val HUB = "hub/{chapterId}/{briefId}"
    fun hub(chapterId: String, briefId: String) = "hub/$chapterId/$briefId"

    // v2.0 Phase 5d — Final Exam. Gated by the caller: only offered
    // from Profile once all briefs are complete.
    const val FINAL_EXAM = "final-exam"

    // v2.0 Phase 5e — Certificate view + PNG/PDF download and share.
    // Only reachable once the certificate is unlocked.
    const val CERTIFICATE = "certificate"

    const val QUIZ = "quiz"
    const val SCENARIO_LIST = "scenarios"
    const val SCENARIO = "scenario/{scenarioId}"
    fun scenario(id: String) = "scenario/$id"

    const val CHECKLISTS = "checklists"
    const val DIAGNOSTIC = "diagnostic"
    const val RISK = "risk"
    const val PASSWORD_LAB = "passwordlab"

    const val CASES = "cases"
    const val CASE_DETAIL = "case/{caseId}"
    fun caseDetail(id: String) = "case/$id"

    const val RESOURCES = "resources"
    const val SEARCH = "search"
    const val SETTINGS = "settings"
}

/** Bottom-bar tabs. Glyphs are unicode so no icon assets are needed. */
enum class Tab(val route: String, val label: String, val glyph: String) {
    HOME(Route.HOME, "Base", "\u25C9"),
    CHAPTERS(Route.CHAPTERS, "Train", "\u2630"),
    DRILLS(Route.DRILLS, "Drills", "\u2317"),
    INTEL(Route.INTEL, "Intel", "\u25F1"),
    PROFILE(Route.PROFILE, "Profile", "\u25CE")
}
