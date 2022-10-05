import org.gradle.kotlin.dsl.support.serviceOf

pluginManagement {
    includeBuild("gradle/plugins")
}

rootProject.name = "jackson-mappers"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(
    gradle.serviceOf<ObjectFactory>().fileTree().from(settingsDir).matching {
        exclude("**/build/**")
        exclude("gradle/plugins/**")
        include("*/**/build.gradle.kts")
    }.map { it.parentFile.toRelativeString(settingsDir).replace(File.separatorChar, ':') }
)
