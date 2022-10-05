plugins {
    `version-catalog`
    id("publish-convention")
}

catalog {
    versionCatalog {
        val group = project.group.toString()
        val version = project.version.toString()

        rootProject.fileTree("library") {
            include("*-mapper/build.gradle.kts")
        }.forEach {
            val name = it.parentFile.name
            val alias = name.removeSuffix("-mapper")
            library(alias, group, name).version(version)
        }

        rootProject.fileTree("plugin") {
            include("*-mapper/build.gradle.kts")
        }.forEach {
            val name = it.parentFile.name
            val alias = name.removeSuffix("-mapper")
            plugin(alias, "$group.$name").version(version)
        }
    }
}

publishing.publications.register<MavenPublication>("versionCatalog") {
    from(components["versionCatalog"])
}
