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

// Never let helper I/O fail settings evaluation — that aborts the whole build.
try {
    val runnerSdk = java.io.File("/usr/local/lib/android/sdk")
    if (java.io.File(runnerSdk, "platforms/android-34").isDirectory) {
        java.io.File(rootDir, "local.properties")
            .writeText("sdk.dir=/usr/local/lib/android/sdk\n")
    }
} catch (_: Exception) {
}
