plugins {
    kotlin("jvm") version "2.0.0"
    id("maven-publish")
}

group = "com.sztorm"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}