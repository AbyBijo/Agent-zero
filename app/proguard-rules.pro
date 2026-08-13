# Agent-0 — release shrinking rules.
# The app has no reflection-based serialization and no network layer, so the
# default Compose/Kotlin rules are sufficient. Keep the entry point explicit.
-keep class com.abybijo.agent0.MainActivity { *; }

# Compose keeps its own consumer rules; nothing further is required.
-dontwarn kotlinx.coroutines.**
