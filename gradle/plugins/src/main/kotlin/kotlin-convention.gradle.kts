import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka")
    id("publish-convention")
}

dependencies {
    api(platform(project(":platform")))
}

java {
    withSourcesJar()
    withJavadocJar()
}

kotlin.explicitApi()

tasks {
    withType<KotlinCompile>().configureEach {
        kotlinOptions {
            allWarningsAsErrors = true
        }
    }

    dokkaJavadoc {
        outputDirectory.set(javadoc.map { checkNotNull(it.destinationDir) })
    }

    javadoc {
        dependsOn(dokkaJavadoc)
    }
}
