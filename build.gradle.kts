// Agent-0 — root build file
plugins {
    id("com.android.application") version "8.5.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
}

try {
    val out = java.io.FileOutputStream(java.io.FileDescriptor.out)
    out.write("::notice title=root build.gradle.kts::evaluated\n".toByteArray())
    out.flush()
} catch (_: Exception) {
}

gradle.buildFinished { result ->
    val failure = result.failure ?: return@buildFinished
    val parts = mutableListOf<String>()
    var t: Throwable? = failure
    var depth = 0
    while (t != null && depth < 8) {
        parts.add("${t::class.java.simpleName}: ${t.message}")
        t = t.cause
        depth++
    }
    val msg = parts.joinToString(" :: ").replace("\n", " ").take(850)
    try {
        val out = java.io.FileOutputStream(java.io.FileDescriptor.out)
        out.write("::error title=Gradle failed::$msg\n".toByteArray())
        out.flush()
    } catch (_: Exception) {
    }
}
