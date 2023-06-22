plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "com.lucasalfare.fl-mmof"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.LucasAlfare:FLListening:v1.2")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}