package com.abybijo.agent0.data

/**
 * v2.0 progression rules — pure functions, no Android dependency, so the
 * locking logic can be reasoned about (and tested) without a device.
 *
 * SRS §4, in code:
 * - A brief unlocks only when the previous brief is completed.
 * - The first brief is always unlocked.
 * - A completed brief is always accessible, even if the user's progress
 *   is non-sequential (see migration, below).
 * - There is no quiz pass threshold for unlocking.
 * - The certificate unlocks only when every brief is completed.
 *
 * A "key" is "chapterId/briefId", exactly as Curriculum.orderedKeys
 * produces it. All functions here take the ordered list explicitly so
 * they do not depend on Curriculum order at test time.
 */
object Progression {

    /** The brief that must be completed before [key], or null for the first brief. */
    fun prerequisiteKey(orderedKeys: List<String>, key: String): String? {
        val i = orderedKeys.indexOf(key)
        return if (i > 0) orderedKeys[i - 1] else null
    }

    /**
     * True if [key] is the first brief, or its immediate predecessor is
     * completed. This is the unlock test for a brief the learner has not
     * yet completed.
     */
    fun isUnlocked(orderedKeys: List<String>, completed: Set<String>, key: String): Boolean {
        if (key !in orderedKeys) return false
        val prerequisite = prerequisiteKey(orderedKeys, key)
        return prerequisite == null || prerequisite in completed
    }

    /**
     * True if the learner may open [key]: it is completed, or it is
     * unlocked by the rule above. Completed briefs are never re-locked.
     */
    fun isAccessible(orderedKeys: List<String>, completed: Set<String>, key: String): Boolean {
        return key in completed || isUnlocked(orderedKeys, completed, key)
    }

    /** The first brief the learner has not completed, or null when done. */
    fun nextIncompleteKey(orderedKeys: List<String>, completed: Set<String>): String? {
        return orderedKeys.firstOrNull { it !in completed }
    }

    /**
     * Migration helper (SRS §4.4): the completed briefs in curriculum
     * order, up to (but not including) the first incomplete brief.
     * Progress after that point is preserved as completed, but it does
     * not unlock anything beyond the first incomplete brief — the
     * learner resumes from there.
     */
    fun sequentialPrefix(orderedKeys: List<String>, completed: Set<String>): List<String> {
        val prefix = mutableListOf<String>()
        for (key in orderedKeys) {
            if (key in completed) prefix.add(key) else break
        }
        return prefix
    }

    /** True only when every brief in [orderedKeys] is completed. */
    fun isCertificateUnlocked(orderedKeys: List<String>, completed: Set<String>): Boolean {
        return orderedKeys.isNotEmpty() && orderedKeys.all { it in completed }
    }

    /** Remaining briefs for the certificate lock message, in order. */
    fun remainingForCertificate(orderedKeys: List<String>, completed: Set<String>): List<String> {
        return orderedKeys.filter { it !in completed }
    }
}
