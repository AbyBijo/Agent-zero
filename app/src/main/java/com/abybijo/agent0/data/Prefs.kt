package com.abybijo.agent0.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
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
        val USER_NAME = stringPreferencesKey("user_name")
        // v2.0 profile fields (SRS §7.3, §8.1). Age is display-only and
        // must never gate content, locking, or quiz tiers. Avatar is an
        // inbuilt drawable id only — no photo, camera, or gallery access.
        val USER_AGE = intPreferencesKey("user_age")
        val AVATAR_ID = stringPreferencesKey("avatar_id")
        val TOUR_COMPLETED = booleanPreferencesKey("tour_completed")
        val PROFILE_PROMPT_DISMISSED = booleanPreferencesKey("profile_prompt_dismissed")
        val LAST_POSITION = stringPreferencesKey("last_position")
        // v2.0 personal notes (SRS §7.4): one line per brief, stored as
        // "chapterId/briefId<TAB>escaped-note". Notes are local only and
        // are never included in any certificate or share payload.
        val NOTES = stringPreferencesKey("notes")
    }

    private val prefs: Flow<Preferences> = context.dataStore.data
        .catch { e -> if (e is IOException) emit(emptyPreferences()) else throw e }

    companion object {
        private fun escapeNote(text: String): String = text
            .replace("\\", "\\\\")
            .replace("\n", "\\n")
            .replace("\r", "\\r")
            .replace("\t", "\\t")

        private fun unescapeNote(text: String): String {
            val out = StringBuilder()
            var i = 0
            while (i < text.length) {
                val c = text[i]
                if (c == '\\' && i + 1 < text.length) {
                    when (text[i + 1]) {
                        'n' -> out.append('\n')
                        'r' -> out.append('\r')
                        't' -> out.append('\t')
                        '\\' -> out.append('\\')
                        else -> { out.append(c); out.append(text[i + 1]) }
                    }
                    i += 2
                } else {
                    out.append(c)
                    i++
                }
            }
            return out.toString()
        }

        private fun parseNotes(raw: String): Map<String, String> {
            if (raw.isBlank()) return emptyMap()
            val map = linkedMapOf<String, String>()
            raw.lines().forEach { line ->
                val tab = line.indexOf('\t')
                if (tab > 0) map[line.substring(0, tab)] = unescapeNote(line.substring(tab + 1))
            }
            return map
        }

        private fun serializeNotes(map: Map<String, String>): String =
            map.entries.joinToString("\n") { (k, v) -> "$k\t${escapeNote(v)}" }
    }

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
    val userName: Flow<String> = prefs.map { it[Keys.USER_NAME] ?: "" }
    val userAge: Flow<Int?> = prefs.map { it[Keys.USER_AGE] }
    val avatarId: Flow<String> = prefs.map { it[Keys.AVATAR_ID] ?: "" }
    val tourCompleted: Flow<Boolean> = prefs.map { it[Keys.TOUR_COMPLETED] ?: false }
    val profilePromptDismissed: Flow<Boolean> =
        prefs.map { it[Keys.PROFILE_PROMPT_DISMISSED] ?: false }
    val lastPosition: Flow<String> = prefs.map { it[Keys.LAST_POSITION] ?: "" }

    val notes: Flow<Map<String, String>> = prefs.map { p ->
        parseNotes(p[Keys.NOTES] ?: "")
    }

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

    suspend fun setUserName(value: String) =
        context.dataStore.edit { it[Keys.USER_NAME] = value.trim() }

    /** Age is stored only for display on the Profile page (SRS §7.3). */
    suspend fun setUserAge(value: Int?) = context.dataStore.edit { p ->
        if (value == null) p.remove(Keys.USER_AGE) else p[Keys.USER_AGE] = value
    }

    suspend fun setAvatarId(value: String) =
        context.dataStore.edit { it[Keys.AVATAR_ID] = value.trim() }

    suspend fun setTourCompleted(value: Boolean) =
        context.dataStore.edit { it[Keys.TOUR_COMPLETED] = value }

    suspend fun setProfilePromptDismissed(value: Boolean) =
        context.dataStore.edit { it[Keys.PROFILE_PROMPT_DISMISSED] = value }

    /** "chapterId/briefId", or "" when no position has been saved yet. */
    suspend fun setLastPosition(value: String) =
        context.dataStore.edit { it[Keys.LAST_POSITION] = value.trim() }

    /** Save a note for one brief; a blank note deletes it. */
    suspend fun setNote(key: String, text: String) = context.dataStore.edit { p ->
        val cur = parseNotes(p[Keys.NOTES] ?: "").toMutableMap()
        if (text.isBlank()) cur.remove(key) else cur[key] = text
        p[Keys.NOTES] = serializeNotes(cur)
    }

    suspend fun deleteNote(key: String) = context.dataStore.edit { p ->
        val cur = parseNotes(p[Keys.NOTES] ?: "").toMutableMap()
        cur.remove(key)
        p[Keys.NOTES] = serializeNotes(cur)
    }

    /** Full local wipe — the app's own "burn" function. */
    suspend fun wipeAll() = context.dataStore.edit { it.clear() }
}
