package com.abybijo.agent0.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextGeometricTransform
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat

/**
 * Agent-0 palette. Strictly monochrome — black canvas, white signal.
 * No hue is permitted anywhere in the app; emphasis is carried by
 * luminance, weight, spacing and motion instead of colour.
 */
object Ink {
    val Black = Color(0xFF000000)
    val Void = Color(0xFF050505)
    val Panel = Color(0xFF0A0A0A)
    val PanelHi = Color(0xFF101010)
    val Hairline = Color(0xFF1C1C1C)
    val Rule = Color(0xFF2A2A2A)
    val Dim = Color(0xFF6E6E6E)
    val Mid = Color(0xFF9A9A9A)
    val Soft = Color(0xFFC8C8C8)
    val White = Color(0xFFFFFFFF)
    val Scan = Color(0x0DFFFFFF)
}

/**
 * Terminal typeface.
 *
 * We deliberately use the platform monospace family so the project has zero
 * binary font assets and builds from source on any machine. To swap in a
 * custom terminal face (JetBrains Mono, IBM Plex Mono, Share Tech Mono…):
 *   1. drop the .ttf files into app/src/main/res/font/
 *   2. replace the line below with:
 *        val TerminalFont = FontFamily(
 *            Font(R.font.jetbrains_mono_regular, FontWeight.Normal),
 *            Font(R.font.jetbrains_mono_bold, FontWeight.Bold)
 *        )
 * Nothing else in the app needs to change.
 */
val TerminalFont: FontFamily = FontFamily.Monospace

private val Mono = TerminalFont

private val Agent0Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Mono, fontWeight = FontWeight.Bold, fontSize = 34.sp,
        lineHeight = 40.sp, letterSpacing = 2.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = Mono, fontWeight = FontWeight.Bold, fontSize = 22.sp,
        lineHeight = 28.sp, letterSpacing = 1.5.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = Mono, fontWeight = FontWeight.Bold, fontSize = 18.sp,
        lineHeight = 24.sp, letterSpacing = 1.sp
    ),
    titleMedium = TextStyle(
        fontFamily = Mono, fontWeight = FontWeight.Bold, fontSize = 15.sp,
        lineHeight = 21.sp, letterSpacing = 0.8.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Mono, fontWeight = FontWeight.Normal, fontSize = 14.sp,
        lineHeight = 23.sp, letterSpacing = 0.2.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Mono, fontWeight = FontWeight.Normal, fontSize = 13.sp,
        lineHeight = 21.sp, letterSpacing = 0.2.sp
    ),
    bodySmall = TextStyle(
        fontFamily = Mono, fontWeight = FontWeight.Normal, fontSize = 11.5.sp,
        lineHeight = 17.sp, letterSpacing = 0.4.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Mono, fontWeight = FontWeight.Bold, fontSize = 10.sp,
        lineHeight = 14.sp, letterSpacing = 1.6.sp,
        textGeometricTransform = TextGeometricTransform.None
    )
)

private val Agent0Colors = darkColorScheme(
    primary = Ink.White,
    onPrimary = Ink.Black,
    secondary = Ink.Soft,
    onSecondary = Ink.Black,
    background = Ink.Black,
    onBackground = Ink.White,
    surface = Ink.Panel,
    onSurface = Ink.White,
    surfaceVariant = Ink.PanelHi,
    onSurfaceVariant = Ink.Mid,
    outline = Ink.Rule,
    outlineVariant = Ink.Hairline,
    error = Ink.White,
    onError = Ink.Black
)

@Composable
fun Agent0Theme(
    @Suppress("UNUSED_PARAMETER") darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = android.graphics.Color.BLACK
            window.navigationBarColor = android.graphics.Color.BLACK
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = false
                isAppearanceLightNavigationBars = false
            }
        }
    }
    // The app is monochrome by design: it never follows the system light theme.
    MaterialTheme(
        colorScheme = Agent0Colors,
        typography = Agent0Typography,
        content = content
    )
}
