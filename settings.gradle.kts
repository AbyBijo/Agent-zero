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

// Prefer the complete SDK that ships on GitHub-hosted runners.
val ciPlatform = java.io.File("/usr/local/lib/android/sdk/platforms/android-34")
if (ciPlatform.isDirectory) {
    rootDir.resolve("local.properties").writeText("sdk.dir=/usr/local/lib/android/sdk\n")
}
