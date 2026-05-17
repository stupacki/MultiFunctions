plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

val multiFunctionsVersion = providers.gradleProperty("multiFunctionsVersion").get()

kotlin {
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    targets.withType<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget>().configureEach {
        binaries.framework {
            baseName = "MultiFunctionsIntegrationKit"
            isStatic = true
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation("com.github.stupacki:multi-functions:$multiFunctionsVersion")
            }
        }
    }
}
