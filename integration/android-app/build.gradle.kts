plugins {
    id("com.android.application")
}

val multiFunctionsVersion = providers.gradleProperty("multiFunctionsVersion").get()
val compileSdkVersion = providers.gradleProperty("compileSdk").get().toInt()
val minSdkVersion = providers.gradleProperty("minSdk").get().toInt()

android {
    namespace = "io.multifunctions.integration"
    compileSdk = compileSdkVersion

    defaultConfig {
        applicationId = "io.multifunctions.integration"
        minSdk = minSdkVersion
        targetSdk = compileSdkVersion
        versionCode = 1
        versionName = multiFunctionsVersion
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("com.github.stupacki:multi-functions:$multiFunctionsVersion")
}
