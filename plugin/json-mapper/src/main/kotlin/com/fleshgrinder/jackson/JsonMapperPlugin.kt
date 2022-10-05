package com.fleshgrinder.jackson

import jsonMapper
import org.gradle.api.Plugin

/**
 * The [JsonMapperPlugin] exists exclusively for importing the [JSON_MAPPER]
 * into Gradle via the standard plugin system, avoiding the need to add
 * buildscript dependencies.
 *
 * @see jsonMapper
 */
public class JsonMapperPlugin : Plugin<Any> {
    override fun apply(target: Any) {
        // Intentionally left blank.
    }
}
