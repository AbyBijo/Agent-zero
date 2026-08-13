package com.abybijo.agent0

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.abybijo.agent0.data.Agent0Store
import com.abybijo.agent0.data.Checklists
import com.abybijo.agent0.data.Curriculum
import com.abybijo.agent0.data.Diagnostic
import com.abybijo.agent0.data.Scenarios
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

/** Aggregate progress snapshot rendered by the dashboard. */
data class Progress(
    val onboarded: Boolean = false,
    val completedBriefs: Set<String> = emptySet(),
    val checkedItems: Set<String> = emptySet(),
    val bookmarks: Set<String> = emptySet(),
    val quizBest: Int = 0,
    val quizRuns: Int = 0,
    val diagScore: Int = 0,
    val diagTaken: Boolean = false,
    val scenariosDone: Set<String> = emptySet(),
    val reduceMotion: Boolean = false,
    val scanlines: Boolean = true
) {
    val briefFraction: Float
        get() = if (Curriculum.totalBriefs == 0) 0f
        else completedBriefs.size.toFloat() / Curriculum.totalBriefs

    val checklistFraction: Float
        get() = if (Checklists.totalItems == 0) 0f
        else checkedItems.size.toFloat() / Checklists.totalItems

    val scenarioFraction: Float
        get() = if (Scenarios.all.isEmpty()) 0f
        else scenariosDone.size.toFloat() / Scenarios.all.size

    val diagFraction: Float
        get() = if (Diagnostic.maxScore == 0) 0f else diagScore.toFloat() / Diagnostic.maxScore

    /** Overall clearance 0..1, weighted toward actually reading the material. */
    val clearance: Float
        get() = (briefFraction * 0.5f + checklistFraction * 0.2f +
            scenarioFraction * 0.15f + diagFraction * 0.15f).coerceIn(0f, 1f)

    val rank: String
        get() = when {
            clearance >= 0.95f -> "AGENT-0"
            clearance >= 0.75f -> "OPERATIVE"
            clearance >= 0.5f -> "FIELD AGENT"
            clearance >= 0.25f -> "TRAINEE"
            clearance > 0f -> "RECRUIT"
            else -> "UNCLEARED"
        }

    /** Next unread brief key, or null if the curriculum is complete. */
    val nextBriefKey: String?
        get() = Curriculum.orderedKeys.firstOrNull { it !in completedBriefs }

    fun isBriefDone(chapterId: String, briefId: String) =
        "$chapterId/$briefId" in completedBriefs

    fun chapterDone(chapterId: String): Int =
        Curriculum.chapter(chapterId)?.briefs?.count { "$chapterId/${it.id}" in completedBriefs } ?: 0
}

class AppViewModel(app: Application) : AndroidViewModel(app) {

    private val store = Agent0Store(app.applicationContext)

    /**
     * DataStore exposes each key as its own Flow. `combine` caps out at five
     * sources, so we fold them in three strongly-typed groups rather than
     * casting through a List<Any> — no unchecked casts anywhere.
     */
    private data class Learning(
        val onboarded: Boolean,
        val briefs: Set<String>,
        val checks: Set<String>,
        val marks: Set<String>
    )

    private data class Scores(
        val quizBest: Int,
        val quizRuns: Int,
        val diagScore: Int,
        val diagTaken: Boolean
    )

    private data class Prefs(
        val scenarios: Set<String>,
        val reduceMotion: Boolean,
        val scanlines: Boolean
    )

    private val learning = combine(
        store.onboarded, store.completedBriefs, store.checkedItems, store.bookmarks
    ) { onboarded, briefs, checks, marks -> Learning(onboarded, briefs, checks, marks) }

    private val scores = combine(
        store.quizBest, store.quizRuns, store.diagScore, store.diagTaken
    ) { best, runs, diag, taken -> Scores(best, runs, diag, taken) }

    private val prefs = combine(
        store.scenariosDone, store.reduceMotion, store.scanlines
    ) { done, motion, scan -> Prefs(done, motion, scan) }

    val progress: StateFlow<Progress> = combine(learning, scores, prefs) { l, s, p ->
        Progress(
            onboarded = l.onboarded,
            completedBriefs = l.briefs,
            checkedItems = l.checks,
            bookmarks = l.marks,
            quizBest = s.quizBest,
            quizRuns = s.quizRuns,
            diagScore = s.diagScore,
            diagTaken = s.diagTaken,
            scenariosDone = p.scenarios,
            reduceMotion = p.reduceMotion,
            scanlines = p.scanlines
        )
    }.stateIn(viewModelScope, SharingStarted.Eagerly, Progress())

    fun completeOnboarding() = viewModelScope.launch { store.setOnboarded(true) }
    fun toggleBrief(key: String) = viewModelScope.launch { store.toggleBriefComplete(key) }
    fun markBrief(key: String) = viewModelScope.launch { store.markBriefComplete(key) }
    fun toggleCheck(key: String) = viewModelScope.launch { store.toggleCheckItem(key) }
    fun resetChecklist(id: String) = viewModelScope.launch { store.resetChecklist(id) }
    fun toggleBookmark(key: String) = viewModelScope.launch { store.toggleBookmark(key) }
    fun recordQuiz(score: Int) = viewModelScope.launch { store.recordQuiz(score) }
    fun recordDiagnostic(score: Int) = viewModelScope.launch { store.recordDiagnostic(score) }
    fun markScenario(id: String) = viewModelScope.launch { store.markScenarioDone(id) }
    fun setReduceMotion(v: Boolean) = viewModelScope.launch { store.setReduceMotion(v) }
    fun setScanlines(v: Boolean) = viewModelScope.launch { store.setScanlines(v) }
    fun wipe() = viewModelScope.launch { store.wipeAll() }
}
