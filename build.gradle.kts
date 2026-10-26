// Agent-0 — root build file
// Android 16 (API 36) toolchain: AGP 8.11.1 requires Gradle 8.13+,
// Kotlin 2.2.21, and the Compose compiler plugin (not the old
// kotlinCompilerExtensionVersion setting, which Kotlin 2.x no longer uses).
plugins {
    id("com.android.application") version "8.11.1" apply false
    id("org.jetbrains.kotlin.android") version "2.2.21" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.2.21" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "2.2.21" apply false
}
