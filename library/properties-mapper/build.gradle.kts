plugins {
    id("library-convention")
}

dependencies {
    api(projects.library.objectMapper)
    api(libs.format.properties)
}
