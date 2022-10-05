import org.gradle.kotlin.dsl.support.expectedKotlinDslPluginsVersion

plugins {
    `kotlin-dsl`
}

dependencies {
    api("com.fleshgrinder.kotlin:case-format:0.2.0")
    api("com.gradle.publish:plugin-publish-plugin:1.0.0")
    api("io.github.gradle-nexus:publish-plugin:1.1.0")
    api("org.gradle.kotlin:gradle-kotlin-dsl-plugins:$expectedKotlinDslPluginsVersion")
    api("org.jetbrains.dokka:dokka-gradle-plugin:1.7.10")
    api("org.jetbrains.kotlin:kotlin-gradle-plugin:$embeddedKotlinVersion")
}
