import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

val multiFunctionsVersion = providers.gradleProperty("multiFunctionsVersion").get()
val jvmTargetVersion = providers.gradleProperty("jvmTargetVersion").get()

@OptIn(ExperimentalKotlinGradlePluginApi::class, ExperimentalWasmDsl::class)
kotlin {
    jvm {
        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(jvmTargetVersion))
        }
        mainRun {
            mainClass.set("integration.MainKt")
        }
    }

    js {
        nodejs()
        binaries.executable()
    }

    wasmJs {
        nodejs()
        binaries.executable()
    }

    wasmWasi {
        nodejs()
        binaries.executable()
    }

    linuxX64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    linuxArm64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    mingwX64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    macosArm64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    iosX64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    iosArm64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    iosSimulatorArm64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    tvosArm64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    tvosSimulatorArm64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    watchosArm32 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    watchosArm64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    watchosSimulatorArm64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    watchosDeviceArm64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    androidNativeX86 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    androidNativeX64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    androidNativeArm32 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }
    androidNativeArm64 {
        binaries.executable {
            entryPoint = "integration.main"
        }
    }

    sourceSets {
        commonMain {
            dependencies {
//              Github Packages
//                implementation("com.github.stupacki:multi-functions:$multiFunctionsVersion")
//              JitPack
                implementation("com.github.stupacki:MultiFunctions:release~3.0.0")
            }
        }
    }
}
