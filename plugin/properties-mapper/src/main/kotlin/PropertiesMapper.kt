import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper
import com.fleshgrinder.jackson.PROPERTIES_MAPPER

/**
 * Gets the global default [JavaPropsMapper] instance.
 *
 * This is a convenience _alias_ of [PROPERTIES_MAPPER] specifically for ad-hoc use in
 * Gradle build scripts to avoid additional imports. This should not be used in
 * normal compiled code.
 *
 * @see PROPERTIES_MAPPER
 */
@JvmField
public val propertiesMapper: JavaPropsMapper =
    PROPERTIES_MAPPER
