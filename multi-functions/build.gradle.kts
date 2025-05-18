val jvmTargetVersion = "17"

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.maven.publish)
}

kotlin {
    // JVM target
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = jvmTargetVersion
        }
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
