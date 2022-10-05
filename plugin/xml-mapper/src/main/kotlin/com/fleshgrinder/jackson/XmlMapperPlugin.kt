package com.fleshgrinder.jackson

import org.gradle.api.Plugin
import xmlMapper

/**
 * The [XmlMapperPlugin] exists exclusively for importing the [XML_MAPPER] into
 * Gradle via the standard plugin system, avoiding the need to add buildscript
 * dependencies.
 *
 * @see xmlMapper
 */
public class XmlMapperPlugin : Plugin<Any> {
    override fun apply(target: Any) {
        // Intentionally left blank.
    }
}
