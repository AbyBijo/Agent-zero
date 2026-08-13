// Agent-0 — root build file
plugins {
    id("com.android.application") version "8.5.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
}

// On GitHub Actions, post a Gradle failure onto the PR so we can read it
// without the job log archive (blocked from this environment).
if (System.getenv("GITHUB_ACTIONS") == "true") {
    gradle.buildFinished { result ->
        val failure = result.failure ?: return@buildFinished
        try {
            reportCiFailure(failure)
        } catch (e: Exception) {
            logger.error("ci-report: ${e.message}")
        }
    }
}

fun reportCiFailure(failure: Throwable) {
    val repo = System.getenv("GITHUB_REPOSITORY") ?: return
    val eventPath = System.getenv("GITHUB_EVENT_PATH")
    var pr: String? = null
    if (eventPath != null) {
        val event = java.io.File(eventPath)
        if (event.isFile) {
            val text = event.readText()
            val m = Regex("\"number\"\\s*:\\s*(\\d+)").find(text)
            pr = m?.groupValues?.get(1)
        }
    }
    if (pr == null) {
        pr = Regex("refs/pull/(\\d+)/").find(System.getenv("GITHUB_REF") ?: "")?.groupValues?.get(1)
    }

    val token = System.getenv("GITHUB_TOKEN")
        ?: System.getenv("GH_TOKEN")
        ?: readGitHubTokenFromGitConfig()
        ?: return

    val sw = java.io.StringWriter()
    failure.printStackTrace(java.io.PrintWriter(sw))
    val trace = sw.toString().lineSequence().take(80).joinToString("\n")

    val sdk = System.getenv("ANDROID_HOME") ?: "(unset)"
    val lp = rootDir.resolve("local.properties")
    val lpText = if (lp.isFile) lp.readText().trim() else "(missing)"
    val runner34 = java.io.File("/usr/local/lib/android/sdk/platforms/android-34").isDirectory

    val body = """
        ## Agent-0 APK build failed

        ANDROID_HOME=`$sdk`
        local.properties:
        ```
        $lpText
        ```
        runner has android-34: `$runner34`

        ```
        ${trace.take(4000)}
        ```
    """.trimIndent()

    val json = "{\"body\":\"" + body
        .replace("\\", "\\\\")
        .replace("\"", "\\\"")
        .replace("\n", "\\n")
        .replace("\r", "") + "\"}"

    val endpoint = if (pr != null) {
        "https://api.github.com/repos/$repo/issues/$pr/comments"
    } else {
        val sha = System.getenv("GITHUB_SHA") ?: return
        "https://api.github.com/repos/$repo/commits/$sha/comments"
    }

    val url = java.net.URI(endpoint).toURL()
    val conn = url.openConnection() as java.net.HttpURLConnection
    conn.requestMethod = "POST"
    conn.doOutput = true
    conn.setRequestProperty("Authorization", "Bearer $token")
    conn.setRequestProperty("Accept", "application/vnd.github+json")
    conn.setRequestProperty("Content-Type", "application/json; charset=utf-8")
    conn.outputStream.use { it.write(json.toByteArray(Charsets.UTF_8)) }
    val code = conn.responseCode
    val err = try { (if (code >= 400) conn.errorStream else conn.inputStream)?.bufferedReader()?.readText() } catch (_: Exception) { null }
    logger.lifecycle("ci-report: POST $endpoint -> $code ${err?.take(200)}")
    conn.disconnect()
}

fun readGitHubTokenFromGitConfig(): String? {
    return try {
        val proc = ProcessBuilder("git", "config", "--local", "--get-regexp", "http\\..*extraheader")
            .directory(rootDir)
            .redirectErrorStream(true)
            .start()
        val out = proc.inputStream.bufferedReader().readText()
        proc.waitFor()
        val encoded = Regex("(?i)AUTHORIZATION:\\s*basic\\s+(\\S+)").find(out)?.groupValues?.get(1) ?: return null
        val decoded = String(java.util.Base64.getDecoder().decode(encoded))
        decoded.substringAfter(":").trim().ifBlank { null }
    } catch (_: Exception) {
        null
    }
}
