package com.abybijo.agent0.data

/**
 * Domain model for the Agent-0 curriculum.
 *
 * The training material is modelled as CHAPTERS (expertise tracks) that each
 * contain BRIEFS (lessons). A brief is a list of blocks so the renderer can
 * animate each block in independently.
 */

enum class Tier(val label: String, val glyph: String) {
    BEGINNER("Beginner", "\u25B0\u25B1\u25B1"),
    INTERMEDIATE("Intermediate", "\u25B0\u25B0\u25B1"),
    ADVANCED("Advanced", "\u25B0\u25B0\u25B0")
}

sealed interface Block {
    data class Para(val text: String) : Block
    data class Bullets(val items: List<String>) : Block
    data class Numbered(val items: List<String>) : Block
    /** Callout used for real-world examples and warnings. */
    data class Field(val label: String, val text: String) : Block
    data class Terminal(val lines: List<String>) : Block
    data class Heading(val text: String, val glyph: String = "") : Block
    /** Key → value reference table. */
    data class Table(val rows: List<Pair<String, String>>) : Block
    /** An external reference rendered inline with the lesson. */
    data class Link(val title: String, val url: String, val note: String = "") : Block
}

data class Brief(
    val id: String,
    val title: String,
    val glyph: String,
    val summary: String,
    val minutes: Int,
    val blocks: List<Block>,
    val references: List<Reference> = emptyList()
)

data class Chapter(
    val id: String,
    val index: Int,
    val code: String,
    val title: String,
    val glyph: String,
    val tier: Tier,
    val tagline: String,
    val briefs: List<Brief>
) {
    val totalMinutes: Int get() = briefs.sumOf { it.minutes }
}

data class Reference(
    val title: String,
    val url: String,
    val note: String = ""
)

data class ResourceItem(
    val category: String,
    val name: String,
    val url: String,
    val description: String
)

data class CaseStudy(
    val id: String,
    val title: String,
    val year: String,
    val tags: List<String>,
    val summary: String,
    val details: String,
    val lessons: List<String>
)

data class QuizQuestion(
    val prompt: String,
    val options: List<String>,
    val answerIndex: Int,
    val rationale: String
)

data class ChecklistGroup(
    val id: String,
    val title: String,
    val glyph: String,
    val items: List<String>
)

data class DiagnosticItem(val prompt: String, val weight: Int)

/** Branching scenario simulator. */
data class ScenarioStep(
    val id: String,
    val text: String,
    val choices: List<ScenarioChoice> = emptyList(),
    val outcome: Outcome? = null,
    val lesson: String? = null
)

enum class Outcome { GOOD, BAD, NEUTRAL }

data class ScenarioChoice(val text: String, val next: String)

data class Scenario(
    val id: String,
    val title: String,
    val intro: String,
    val start: String,
    val steps: Map<String, ScenarioStep>
)
