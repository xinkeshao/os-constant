plugins {
    id("java")
    id("application")
}

group = "io.github.shaoxinke"
version = "1.0-SNAPSHOT"

application {
    mainClass = "io.github.shaoxinke.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}