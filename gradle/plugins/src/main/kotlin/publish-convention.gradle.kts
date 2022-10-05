plugins {
    id("maven-publish")
    id("signing")
}

signing {
    setRequired({
        providers.gradleProperty("signing.enabled").getOrElse("true") != "true" &&
            !project.version.toString().endsWith("-SNAPSHOT") &&
            gradle.taskGraph.let { it.hasTask("publish") || it.hasTask("publishToMavenLocal") }
    })
}
