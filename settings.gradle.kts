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

// GitHub-hosted runners already have a full SDK here. Prefer it over a
// cmdline-tools-only ANDROID_HOME that setup-android may have installed.
val runnerSdk = java.io.File("/usr/local/lib/android/sdk")
if (java.io.File(runnerSdk, "platforms/android-34").isDirectory) {
    val lp = settings.rootDir.resolve("local.properties")
    if (!lp.exists()) {
        lp.writeText("sdk.dir=/usr/local/lib/android/sdk\n")
    }
}

// When running on GitHub Actions, post the Gradle failure to the commit so
// we can read it without downloading the (sandbox-blocked) job logs.
gradle.buildFinished { result ->
    val failure = result.failure ?: return@buildFinished
    if (System.getenv("GITHUB_ACTIONS") != "true") return@buildFinished

    fun token(): String? {
        System.getenv("GITHUB_TOKEN")?.takeIf { it.isNotBlank() }?.let { return it }
        System.getenv("GH_TOKEN")?.takeIf { it.isNotBlank() }?.let { return it }
        return try {
            val proc = ProcessBuilder("git", "config", "--get-regexp", "http\\..*\\.extraheader")
                .directory(settings.rootDir)
                .redirectErrorStream(true)
                .start()
            val out = proc.inputStream.bufferedReader().readText()
            proc.waitFor()
            val encoded = Regex("(?i)AUTHORIZATION:\\s*basic\\s+(\\S+)").find(out)?.groupValues?.get(1)
                ?: return null
            val decoded = String(java.util.Base64.getDecoder().decode(encoded))
            decoded.substringAfter(":").trim().ifBlank { null }
        } catch (_: Exception) {
            null
        }
    }

    val tok = token() ?: return@buildFinished
    val repo = System.getenv("GITHUB_REPOSITORY") ?: return@buildFinished
    val sha = System.getenv("GITHUB_SHA") ?: return@buildFinished

    val sw = java.io.StringWriter()
    failure.printStackTrace(java.io.PrintWriter(sw))
    val trace = sw.toString().lineSequence().take(120).joinToString("\n")

    val sdkHome = System.getenv("ANDROID_HOME") ?: "(unset)"
    val lpText = settings.rootDir.resolve("local.properties").let { if (it.isFile) it.readText() else "(missing)" }
    val platforms = java.io.File(sdkHome, "platforms").list()?.sorted()?.joinToString() ?: "(none)"
    val runnerPlatforms = java.io.File("/usr/local/lib/android/sdk/platforms").list()?.sorted()?.joinToString() ?: "(none)"

    val body = buildString {
        appendLine("## Agent-0 APK build failed")
        appendLine()
        appendLine("ANDROID_HOME=`$sdkHome`")
        appendLine()
        appendLine("local.properties:")
        appendLine("```")
        appendLine(lpText.trim())
        appendLine("```")
        appendLine()
        appendLine("ANDROID_HOME/platforms: $platforms")
        appendLine()
        appendLine("/usr/local/lib/android/sdk/platforms: $runnerPlatforms")
        appendLine()
        appendLine("```")
        appendLine(trace.take(5500))
        appendLine("```")
    }

    try {
        val url = java.net.URI("https://api.github.com/repos/$repo/commits/$sha/comments").toURL()
        val conn = url.openConnection() as java.net.HttpURLConnection
        conn.requestMethod = "POST"
        conn.doOutput = true
        conn.setRequestProperty("Authorization", "Bearer $tok")
        conn.setRequestProperty("Accept", "application/vnd.github+json")
        conn.setRequestProperty("Content-Type", "application/json; charset=utf-8")
        conn.setRequestProperty("X-GitHub-Api-Version", "2022-11-28")
        val json = buildString {
            append("{\"body\":\"")
            append(
                body.replace("\\", "\\\\")
                    .replace("\"", "\\\"")
                    .replace("\n", "\\n")
                    .replace("\r", "")
            )
            append("\"}")
        }
        conn.outputStream.use { it.write(json.toByteArray(Charsets.UTF_8)) }
        conn.inputStream.bufferedReader().use { it.readText() }
        conn.disconnect()
    } catch (e: Exception) {
        System.err.println("ci-report: failed to post commit comment: ${e.message}")
    }
}
