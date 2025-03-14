plugins {
    id("kotlin")
    id("java")
    id("maven-publish")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.stupacki"
            artifactId = "MultiFunctions"
            version = "1.4.2"

            from(components["java"])
        }
    }
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }

    sourceSets["main"].java {
        srcDir("src/main/kotlin")
    }
    sourceSets["test"].java {
        srcDir("src/test/kotlin")
    }
}

kotlin {
    jvmToolchain(21)
}


dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(libs.kotlin.sdt)

    testImplementation(libs.bundles.kotest)
}

tasks.test {
    useJUnitPlatform()
}
