plugins {
    id("java")
}

group = "org.tony"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // include lombok
    implementation("org.projectlombok:lombok:1.18.20")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}