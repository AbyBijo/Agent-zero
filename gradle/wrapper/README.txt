Gradle wrapper for Agent-0.

    ./gradlew assembleDebug      # debug APK
    ./gradlew assembleRelease    # release APK

The wrapper scripts (gradlew / gradlew.bat) and gradle-wrapper.jar are
committed so CI and local machines can build without a preinstalled Gradle.
They download Gradle 8.7 from services.gradle.org on first use.
