package com.fleshgrinder.jackson

import org.gradle.api.Plugin
import yamlMapper

/**
 * The [YamlMapperPlugin] exists exclusively for importing the [YAML_MAPPER]
 * into Gradle via the standard plugin system, avoiding the need to add
 * buildscript dependencies.
 *
 * @see yamlMapper
 */
public class YamlMapperPlugin : Plugin<Any> {
    override fun apply(target: Any) {
        // Intentionally left blank.
    }
}
