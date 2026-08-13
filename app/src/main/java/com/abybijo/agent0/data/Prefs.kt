package com.abybijo.agent0.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "agent0_state")

/**
 * All Agent-0 state lives here, on-device, in a private DataStore.
 * Nothing is transmitted; the app holds no INTERNET permission.
 */
class Agent0Store(private val context: Context) {

    private object Keys {
        val ONBOARDED = booleanPreferencesKey("onboarded")
        val COMPLETED_BRIEFS = stringSetPreferencesKey("completed_briefs")
        val CHECKED_ITEMS = stringSetPreferencesKey("checked_items")
        val BOOKMARKS = stringSetPreferencesKey("bookmarks")
        val QUIZ_BEST = intPreferencesKey("quiz_best")
        val QUIZ_RUNS = intPreferencesKey("quiz_runs")
        val DIAG_SCORE = intPreferencesKey("diag_score")
        val DIAG_TAKEN = booleanPreferencesKey("diag_taken")
        val SCENARIOS_DONE = stringSetPreferencesKey("scenarios_done")
        val REDUCE_MOTION = booleanPreferencesKey("reduce_motion")
        val SCANLINES = booleanPreferencesKey("scanlines")
    }

    private val prefs: Flow<Preferences> = context.dataStore.data
        .catch { e -> if (e is IOException) emit(emptyPreferences()) else throw e }

    val onboarded: Flow<Boolean> = prefs.map { it[Keys.ONBOARDED] ?: false }
    val completedBriefs: Flow<Set<String>> = prefs.map { it[Keys.COMPLETED_BRIEFS] ?: emptySet() }
    val checkedItems: Flow<Set<String>> = prefs.map { it[Keys.CHECKED_ITEMS] ?: emptySet() }
    val bookmarks: Flow<Set<String>> = prefs.map { it[Keys.BOOKMARKS] ?: emptySet() }
    val quizBest: Flow<Int> = prefs.map { it[Keys.QUIZ_BEST] ?: 0 }
    val quizRuns: Flow<Int> = prefs.map { it[Keys.QUIZ_RUNS] ?: 0 }
    val diagScore: Flow<Int> = prefs.map { it[Keys.DIAG_SCORE] ?: 0 }
    val diagTaken: Flow<Boolean> = prefs.map { it[Keys.DIAG_TAKEN] ?: false }
    val scenariosDone: Flow<Set<String>> = prefs.map { it[Keys.SCENARIOS_DONE] ?: emptySet() }
    val reduceMotion: Flow<Boolean> = prefs.map { it[Keys.REDUCE_MOTION] ?: false }
    val scanlines: Flow<Boolean> = prefs.map { it[Keys.SCANLINES] ?: true }

    suspend fun setOnboarded(value: Boolean) =
        context.dataStore.edit { it[Keys.ONBOARDED] = value }

    suspend fun toggleBriefComplete(key: String) = context.dataStore.edit { p ->
        val cur = p[Keys.COMPLETED_BRIEFS] ?: emptySet()
        p[Keys.COMPLETED_BRIEFS] = if (key in cur) cur - key else cur + key
    }

    suspend fun markBriefComplete(key: String) = context.dataStore.edit { p ->
        p[Keys.COMPLETED_BRIEFS] = (p[Keys.COMPLETED_BRIEFS] ?: emptySet()) + key
    }

    suspend fun toggleCheckItem(key: String) = context.dataStore.edit { p ->
        val cur = p[Keys.CHECKED_ITEMS] ?: emptySet()
        p[Keys.CHECKED_ITEMS] = if (key in cur) cur - key else cur + key
    }

    suspend fun resetChecklist(groupId: String) = context.dataStore.edit { p ->
        p[Keys.CHECKED_ITEMS] =
            (p[Keys.CHECKED_ITEMS] ?: emptySet()).filterNot { it.startsWith("$groupId/") }.toSet()
    }

    suspend fun toggleBookmark(key: String) = context.dataStore.edit { p ->
        val cur = p[Keys.BOOKMARKS] ?: emptySet()
        p[Keys.BOOKMARKS] = if (key in cur) cur - key else cur + key
    }

    suspend fun recordQuiz(score: Int) = context.dataStore.edit { p ->
        val best = p[Keys.QUIZ_BEST] ?: 0
        if (score > best) p[Keys.QUIZ_BEST] = score
        p[Keys.QUIZ_RUNS] = (p[Keys.QUIZ_RUNS] ?: 0) + 1
    }

    suspend fun recordDiagnostic(score: Int) = context.dataStore.edit { p ->
        p[Keys.DIAG_SCORE] = score
        p[Keys.DIAG_TAKEN] = true
    }

    suspend fun markScenarioDone(id: String) = context.dataStore.edit { p ->
        p[Keys.SCENARIOS_DONE] = (p[Keys.SCENARIOS_DONE] ?: emptySet()) + id
    }

    suspend fun setReduceMotion(value: Boolean) =
        context.dataStore.edit { it[Keys.REDUCE_MOTION] = value }

    suspend fun setScanlines(value: Boolean) =
        context.dataStore.edit { it[Keys.SCANLINES] = value }

    /** Full local wipe — the app's own "burn" function. */
    suspend fun wipeAll() = context.dataStore.edit { it.clear() }
}
