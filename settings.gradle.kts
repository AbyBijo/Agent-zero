pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

// Prefer a complete Android SDK (one that already has platform 34) over
// ANDROID_HOME. GitHub-hosted runners ship a full SDK at
// /usr/local/lib/android/sdk; some setup actions replace ANDROID_HOME with a
// cmdline-tools-only tree, which makes assembleDebug die in ~30s.
val candidateSdks = buildList {
    val localProps = settings.rootDir.resolve("local.properties")
    if (localProps.isFile) {
        localProps.readLines()
            .firstOrNull { it.trim().startsWith("sdk.dir=") }
            ?.substringAfter("sdk.dir=")
            ?.trim()
            ?.takeIf { it.isNotEmpty() }
            ?.let { add(java.io.File(it)) }
    }
    sequenceOf("ANDROID_HOME", "ANDROID_SDK_ROOT")
        .mapNotNull { System.getenv(it)?.takeIf(String::isNotBlank) }
        .forEach { add(java.io.File(it)) }
    add(java.io.File("/usr/local/lib/android/sdk"))
    System.getProperty("user.home")?.let { add(java.io.File(it, "Android/Sdk")) }
}
val completeSdk = candidateSdks.firstOrNull { sdk ->
    sdk.resolve("platforms/android-34").isDirectory
}
if (completeSdk != null) {
    val lp = settings.rootDir.resolve("local.properties")
    val current = if (lp.isFile) lp.readText() else ""
    val line = "sdk.dir=${completeSdk.absolutePath.replace("\\", "/")}"
    if (!current.lines().any { it.trim() == line }) {
        val without = current.lines().filterNot { it.trim().startsWith("sdk.dir=") }
        lp.writeText((without + line).filter { it.isNotBlank() }.joinToString("\n") + "\n")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Agent-0"
include(":app")
