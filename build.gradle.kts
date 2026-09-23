plugins {
    kotlin("jvm") version "2.4.20"
}

group = "org.doraemon"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://snapshots.kord.dev")
}

dependencies {
    //testImplementation(kotlin("test"))
    implementation("dev.kord:kord-core:0.18.1")
    implementation("ch.qos.logback:logback-classic:1.6.3")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}