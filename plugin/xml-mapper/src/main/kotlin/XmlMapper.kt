import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fleshgrinder.jackson.XML_MAPPER

/**
 * Gets the global default [XmlMapper] instance.
 *
 * This is a convenience _alias_ of [XML_MAPPER] specifically for ad-hoc use in
 * Gradle build scripts to avoid additional imports. This should not be used in
 * normal compiled code.
 *
 * @see XML_MAPPER
 */
@JvmField
public val xmlMapper: XmlMapper =
    XML_MAPPER
