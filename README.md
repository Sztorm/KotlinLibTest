## KotlinLibTest
In this repository I'm checking how things are working.

## Installation

Step 1. Add it in your root `build.gradle.kts` at the end of repositories:

```kotlin
allprojects {
    repositories {
        maven("https://jitpack.io")
    }
}
```

Step 2. Add the dependency

```kotlin
dependencies {
    implementation("com.github.Sztorm.KotlinLibTest:libtest:1.0.0")
}
```