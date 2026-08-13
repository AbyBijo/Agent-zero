package com.abybijo.agent0.ui.theme

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween

/**
 * Motion tokens. Everything in Agent-0 moves on one of these curves so the
 * whole app feels like a single machine rather than a pile of screens.
 */
object Motion {
    /** Decisive, mechanical settle — used for reveals. */
    val Decode: Easing = CubicBezierEasing(0.16f, 1f, 0.3f, 1f)
    /** Snappy in-out for state flips (checkbox, toggle, press). */
    val Snap: Easing = CubicBezierEasing(0.4f, 0f, 0.2f, 1f)
    val Standard: Easing = FastOutSlowInEasing

    const val Instant = 90
    const val Fast = 180
    const val Normal = 280
    const val Slow = 460
    const val Cinematic = 900

    /** Stagger step between siblings in a list reveal. */
    const val StaggerMs = 45
    const val StaggerMaxIndex = 12

    fun <T> fast() = tween<T>(Fast, easing = Snap)
    fun <T> normal() = tween<T>(Normal, easing = Decode)
    fun <T> slow() = tween<T>(Slow, easing = Decode)

    fun staggerDelay(index: Int): Int = (index.coerceAtMost(StaggerMaxIndex)) * StaggerMs
}
