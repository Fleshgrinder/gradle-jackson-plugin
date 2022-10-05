package com.fleshgrinder.jackson

import csvMapper
import org.gradle.api.Plugin

/**
 * The [CsvMapperPlugin] exists exclusively for importing the [CSV_MAPPER] into
 * Gradle via the standard plugin system, avoiding the need to add buildscript
 * dependencies.
 *
 * @see csvMapper
 */
public class CsvMapperPlugin : Plugin<Any> {
    override fun apply(target: Any) {
        // Intentionally left blank.
    }
}
