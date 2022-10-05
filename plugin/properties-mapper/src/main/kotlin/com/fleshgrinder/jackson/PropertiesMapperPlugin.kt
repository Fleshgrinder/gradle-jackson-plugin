package com.fleshgrinder.jackson

import org.gradle.api.Plugin
import propertiesMapper

/**
 * The [PropertiesMapperPlugin] exists exclusively for importing the
 * [PROPERTIES_MAPPER] into Gradle via the standard plugin system, avoiding the
 * need to add buildscript dependencies.
 *
 * @see propertiesMapper
 */
public class PropertiesMapperPlugin : Plugin<Any> {
    override fun apply(target: Any) {
        // Intentionally left blank.
    }
}
