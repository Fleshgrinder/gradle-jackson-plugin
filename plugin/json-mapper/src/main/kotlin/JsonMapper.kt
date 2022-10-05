import com.fasterxml.jackson.databind.json.JsonMapper
import com.fleshgrinder.jackson.JSON_MAPPER

/**
 * Gets the global default [JsonMapper] instance.
 *
 * This is a convenience _alias_ of [JSON_MAPPER] specifically for ad-hoc use in
 * Gradle build scripts to avoid additional imports. This should not be used in
 * normal compiled code.
 *
 * @see JSON_MAPPER
 */
@JvmField
public val jsonMapper: JsonMapper =
    JSON_MAPPER
