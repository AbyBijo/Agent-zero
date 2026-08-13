pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
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

// Make sure a complete SDK + accepted licenses are visible to AGP.
// setup-android can leave ANDROID_HOME pointing at a stub, or leave a
// required license unsigned; either one kills assembleDebug in ~30s.
val sdkCandidates = listOfNotNull(
    System.getenv("ANDROID_HOME"),
    System.getenv("ANDROID_SDK_ROOT"),
    "/usr/local/lib/android/sdk",
    System.getProperty("user.home") + "/.android/sdk"
).map { java.io.File(it) }.distinct()

val completeSdk = sdkCandidates.firstOrNull { sdk ->
    java.io.File(sdk, "platforms/android-34").isDirectory
} ?: sdkCandidates.firstOrNull { it.isDirectory }

if (completeSdk != null) {
    rootDir.resolve("local.properties")
        .writeText("sdk.dir=${completeSdk.absolutePath}\n")
}

val licenseHash = "\n24333f8a63b6825ea9c5514f83c2829b004d1fee\n"
val previewHash = "\n84831b9409646161ce1e3b0a3266c82e0a4d342\n"
sdkCandidates.forEach { sdk ->
    if (!sdk.isDirectory) return@forEach
    val licenses = java.io.File(sdk, "licenses")
    licenses.mkdirs()
    java.io.File(licenses, "android-sdk-license").writeText(licenseHash)
    java.io.File(licenses, "android-sdk-preview-license").writeText(previewHash)
}

gradle.buildFinished { result ->
    val failure = result.failure ?: return@buildFinished
    val text = failure.stackTraceToString()
        .replace("\r", "")
        .replace("\n", " | ")
        .take(900)
    println("::error title=Gradle assembleDebug failed::$text")
}
