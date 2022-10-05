import com.fasterxml.jackson.dataformat.yaml.YAMLMapper
import com.fleshgrinder.jackson.YAML_MAPPER

/**
 * Gets the global default [YAMLMapper] instance.
 *
 * This is a convenience _alias_ of [YAML_MAPPER] specifically for ad-hoc use in
 * Gradle build scripts to avoid additional imports. This should not be used in
 * normal compiled code.
 *
 * @see YAML_MAPPER
 */
@JvmField
public val yamlMapper: YAMLMapper =
    YAML_MAPPER
