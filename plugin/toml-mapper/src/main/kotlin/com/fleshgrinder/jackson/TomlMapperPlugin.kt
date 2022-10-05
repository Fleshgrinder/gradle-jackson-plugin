package com.fleshgrinder.jackson

import org.gradle.api.Plugin
import tomlMapper

/**
 * The [TomlMapperPlugin] exists exclusively for importing the [TOML_MAPPER]
 * into Gradle via the standard plugin system, avoiding the need to add
 * buildscript dependencies.
 *
 * @see tomlMapper
 */
public class TomlMapperPlugin : Plugin<Any> {
    override fun apply(target: Any) {
        // Intentionally left blank.
    }
}
