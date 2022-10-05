import com.fleshgrinder.extensions.kotlin.toUpperCamelCase

plugins {
    id("kotlin-convention")
    id("com.gradle.plugin-publish")
    id("org.gradle.kotlin.kotlin-dsl")
}

val format = name.removeSuffix("-mapper")
group = "com.fleshgrinder.gradle.jackson"
description = "Jackson .$format Mapper Plugin"

dependencies {
    api(project(":library:${project.name}"))
}

gradlePlugin.plugins.register("") {
    id = "${project.group}.${project.name}"
    implementationClass = "${project.group}.${project.name.toUpperCamelCase()}Plugin"
}

pluginBundle {
    website = ""
    description = project.description
    vcsUrl = website
    tags = setOf("jackson", "serialization", "deserialization", format, "$format-serialization", "$format-deserialization")
}
