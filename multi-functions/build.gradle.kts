val jvmTargetVersion = "17"

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.maven.publish)
}

kotlin {
    // JVM target
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = jvmTargetVersion
        }
    }

    // Android target
    androidTarget {
        publishLibraryVariants("release", "debug")
    }

    // Native targets
    macosX64()
    macosArm64()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    // Add source sets for each platform
    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlin.stdlib)
        }
        commonTest.dependencies {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
    }
}

android {
    namespace = "com.github.stupacki.multifunctions"
    compileSdk = 35
    defaultConfig {
        minSdk = 21
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(jvmTargetVersion))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.stupacki"
            artifactId = "MultiFunctions"
            version = "2.0.0"

            afterEvaluate {
                from(components["kotlin"])
            }
        }
    }
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
}
