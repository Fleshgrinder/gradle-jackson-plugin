plugins {
    id("library-convention")
}

dependencies {
    api(projects.library.objectMapper)
    api(libs.format.xml)
    api(libs.woodstox)
}
