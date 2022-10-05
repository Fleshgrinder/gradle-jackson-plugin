import com.fasterxml.jackson.dataformat.toml.TomlMapper
import com.fleshgrinder.jackson.TOML_MAPPER

/**
 * Gets the global default [TomlMapper] instance.
 *
 * This is a convenience _alias_ of [TOML_MAPPER] specifically for ad-hoc use in
 * Gradle build scripts to avoid additional imports. This should not be used in
 * normal compiled code.
 *
 * @see TOML_MAPPER
 */
@JvmField
public val tomlMapper: TomlMapper =
    TOML_MAPPER
