plugins {
    id("library-convention")
}

dependencies {
    implementation(libs.slf4j.api)
    api(libs.module.jdk8)
    api(libs.module.jsr310)
    api(libs.module.kotlin)
}
