import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.maven.publish)
}

kotlin {
    // JVM target
    jvm {
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    jvmTarget.set(JvmTarget.JVM_17)
                }
            }
        }
    }

    // JavaScript target
    js(IR) {
        browser()
        nodejs()
    }

    // Native targets
    macosX64()
    macosArm64()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    linuxX64()
    linuxArm64()
    mingwX64()

    // Add source sets for each platform
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlin.stdlib)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
        val macosX64Main by getting
        val macosX64Test by getting
        val macosArm64Main by getting
        val macosArm64Test by getting
        val iosX64Main by getting
        val iosX64Test by getting
        val iosArm64Main by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Main by getting
        val iosSimulatorArm64Test by getting
        val linuxX64Main by getting
        val linuxX64Test by getting
        val linuxArm64Main by getting
        val linuxArm64Test by getting
        val mingwX64Main by getting
        val mingwX64Test by getting
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.stupacki"
            artifactId = "MultiFunctions"
            version = "1.4.2"

            from(components["kotlin"])
        }
    }
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
}
