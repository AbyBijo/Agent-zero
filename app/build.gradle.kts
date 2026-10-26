plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.abybijo.agent0"
    // Android 16 (API 36). minSdk stays 24, so the app still runs on
    // Android 7.0+ devices; only the compile/target level moves up.
    compileSdk = 36

    defaultConfig {
        applicationId = "com.abybijo.agent0"
        minSdk = 24
        targetSdk = 36
        versionCode = 2
        versionName = "1.0.1"
        vectorDrawables { useSupportLibrary = true }
    }

    signingConfigs {
        // Debug: the SDK's automatic debug key, but with the signature
        // schemes made explicit instead of left to defaults.
        // v1 is disabled: it is only needed below Android 7.0, and
        // minSdk is 24 (Android 7.0), where v2 already applies.
        getByName("debug") {
            enableV1Signing = false
            enableV2Signing = true
            enableV3Signing = true
        }
        // Release: keystore details come from Gradle properties or
        // environment variables, never from a committed file.
        // Properties: agent0.keystore, agent0.keystorePassword,
        // agent0.keyAlias, agent0.keyPassword
        // (or AGENT0_KEYSTORE, AGENT0_KEYSTORE_PASSWORD,
        // AGENT0_KEY_ALIAS, AGENT0_KEY_PASSWORD).
        // If no keystore is supplied, this config is not applied to
        // the release build type below, so a debug/CI build without a
        // keystore does not fail at configuration time.
        create("release") {
            val keystorePath =
                (project.findProperty("agent0.keystore") as String?)
                    ?: System.getenv("AGENT0_KEYSTORE")
            if (keystorePath != null) {
                storeFile = file(keystorePath)
            }
            storePassword =
                (project.findProperty("agent0.keystorePassword") as String?)
                    ?: System.getenv("AGENT0_KEYSTORE_PASSWORD")
            keyAlias =
                (project.findProperty("agent0.keyAlias") as String?)
                    ?: System.getenv("AGENT0_KEY_ALIAS")
            keyPassword =
                (project.findProperty("agent0.keyPassword") as String?)
                    ?: System.getenv("AGENT0_KEY_PASSWORD")
            enableV1Signing = false
            enableV2Signing = true
            enableV3Signing = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            // Only sign release when a keystore was actually supplied.
            val releaseSigning = signingConfigs.getByName("release")
            if (releaseSigning.storeFile != null) {
                signingConfig = releaseSigning
            }
        }
        debug {
            applicationIdSuffix = ".debug"
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources { excludes += "/META-INF/{AL2.0,LGPL2.1}" }
    }
}

dependencies {
    val composeBom = platform("androidx.compose:compose-bom:2025.10.01")
    implementation(composeBom)

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.core:core-splashscreen:1.0.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.3")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.3")
    implementation("androidx.activity:activity-compose:1.9.0")

    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.foundation:foundation")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.compose.animation:animation")

    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.datastore:datastore-preferences:1.1.1")
    implementation("androidx.window:window:1.3.0")
    implementation("androidx.compose.material3:material3-window-size-class")

    debugImplementation("androidx.compose.ui:ui-tooling")
}
