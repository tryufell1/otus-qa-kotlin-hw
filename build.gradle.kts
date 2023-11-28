import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.20"
    application
}

group = "me.learning"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.9.20")
    implementation(kotlin("reflect"))

}

tasks.test {
    useJUnitPlatform()
}

//tasks.withType<KotlinCompile> {
//    kotlinOptions.jvmTarget = "1.8"
//}

kotlin { // Extension for easy setup
    jvmToolchain(15) // Target version of generated JVM bytecode. See 7️⃣
}
application {
    mainClass.set("MainKt")
}