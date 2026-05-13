import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

val jvmTargetVersion = libs.versions.jvmTargetVersion.get()

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.maven.publish)
    alias(libs.plugins.dokka)
}

@OptIn(ExperimentalWasmDsl::class)
kotlin {
    // JVM target
    jvm {
        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(jvmTargetVersion))
        }
    }

    android {
        namespace = "io.multifunctions"
        compileSdk = libs.versions.compileSdk.get().toInt()
        minSdk = libs.versions.minSdk.get().toInt()

        withHostTest {}

        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(jvmTargetVersion))
        }
    }

    js {
        browser()
        nodejs()
    }

    wasmJs {
        browser()
        nodejs()
    }

    wasmWasi {
        nodejs()
    }

    // Native targets
    linuxX64()
    linuxArm64()
    mingwX64()
    macosArm64()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    tvosArm64()
    tvosSimulatorArm64()
    watchosArm32()
    watchosArm64()
    watchosSimulatorArm64()
    watchosDeviceArm64()
    androidNativeX86()
    androidNativeX64()
    androidNativeArm32()
    androidNativeArm64()

    // Add source sets for each platform
    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.kotlin.stdlib)
            }
        }
        commonTest {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
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
            artifactId = "multi-functions"
            version = "2.1.0"

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

    matching {
        it.name in setOf(
            "tvosSimulatorArm64Test",
            "watchosSimulatorArm64Test",
        )
    }.configureEach {
        enabled = false
    }
}
