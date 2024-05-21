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
            version = "1.5.0"

            from(components["java"])
        }
    }
}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17

    sourceSets["main"].java {
        srcDir("src/main/kotlin")
    }
    sourceSets["test"].java {
        srcDir("src/test/kotlin")
    }
}

kotlin {
    jvmToolchain(17)
}


dependencies {
    val kotlinVersion = "1.9.10"
    val kotestVersion = "5.7.2"

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")

    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
    testImplementation("io.kotest:kotest-property:$kotestVersion")
}

tasks.test {
    useJUnitPlatform()
}
