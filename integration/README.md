# MultiFunctions Integration Apps

This standalone Gradle build verifies that external consumers can resolve and use the published GitHub Packages distribution.

It intentionally depends on:

```kotlin
com.github.stupacki:multi-functions:3.0.0-SNAPSHOT
```

The build covers:

- Android app
- iOS framework integration module
- iOS device/simulator wrapper app
- JVM consumer
- JS Node executable
- WASM JS Node executable
- WASM WASI Node executable
- Native executables for the same native targets published by the library

## Credentials

GitHub Packages usually requires credentials even for read access. Export these before running the integration build:

```sh
export GITHUB_USER=<your-github-user>
export GITHUB_TOKEN=<token-with-read-packages>
```

You can also use Gradle properties:

```sh
../gradlew :kmp-app:assemble -Pgpr.user=<your-github-user> -Pgpr.key=<token-with-read-packages>
```

## Run

### Android

Build the debug APK:

```sh
../gradlew :android-app:assembleDebug
```

Install it on a connected Android device or running emulator:

```sh
./scripts/install-android
```

### iOS

Open this Xcode project:

```text
integration/ios-device-app/MultiFunctionsIntegration.xcodeproj
```

It contains the `MultiFunctionsIntegration` scheme. The Xcode target builds the KMP framework first, then links it into a small native Swift app.

Build for iOS simulator:

```sh
./scripts/build-ios-simulator
```

Install and launch on the booted simulator:

```sh
./scripts/install-ios-simulator
```

Build for a physical iPhone or iPad:

```sh
export DEVELOPMENT_TEAM=<your-apple-team-id>
./scripts/build-ios-device
```

Install on a connected trusted device:

```sh
xcrun devicectl list devices
export DEVICE_ID=<device-identifier>
export DEVELOPMENT_TEAM=<your-apple-team-id>
./scripts/install-ios-device
```

For physical devices, you can also open the Xcode project, select your Team under Signing & Capabilities, choose your connected device, and press Run.

### Full Variant Check

From this `integration` directory:

```sh
../gradlew :kmp-app:assemble
../gradlew :android-app:assembleDebug
../gradlew :ios-app:linkDebugFrameworkIosSimulatorArm64
```

From the repository root:

```sh
./gradlew -p integration :kmp-app:assemble :android-app:assembleDebug :ios-app:linkDebugFrameworkIosSimulatorArm64
```

To test another published version:

```sh
../gradlew :kmp-app:assemble :android-app:assembleDebug :ios-app:linkDebugFrameworkIosSimulatorArm64 -PmultiFunctionsVersion=3.0.0-SNAPSHOT
```

The `kmp-app` module exposes a small application entry point for every non-Android app and non-iOS wrapper target. JVM, JS Node, WASM JS Node, WASM WASI Node, and all native executables run the same smoke path and print the target-specific result message from `integration.main`.

The iOS module builds a static framework named `MultiFunctionsIntegrationKit` for `iosX64`, `iosArm64`, and `iosSimulatorArm64`. This validates the iOS variants from the published Maven package while keeping the sample independent from the local library project.
