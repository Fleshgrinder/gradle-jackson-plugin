plugins {
    `java-platform`
    id("publish-convention")
}

dependencies.constraints {
    fileTree(rootDir) {
        include("library/*-mapper/build.gradle.kts")
        include("plugin/*-mapper/build.gradle.kts")
    }.forEach {
        api(project(it.parentFile.run { ":${parentFile.name}:$name" }))
    }
}

publishing.publications.register<MavenPublication>("platform") {
    from(components["javaPlatform"])
}
