import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

group = "org.automation"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JUnit 5
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")

    // Appium + Selenium
    implementation("io.appium:java-client:8.2.0")
    implementation("org.seleniumhq.selenium:selenium-java:4.6.0")

    // Submodules
    implementation(project(":Screens"))
}

tasks.test {
    useJUnitPlatform()

    systemProperty("platform", System.getProperty("platform"))
    systemProperty("webDriverUrl", System.getProperty("webDriverUrl"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
