import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fleshgrinder.jackson.CSV_MAPPER

/**
 * Gets the global default [CsvMapper] instance.
 *
 * This is a convenience _alias_ of [CSV_MAPPER] specifically for ad-hoc use in
 * Gradle build scripts to avoid additional imports. This should not be used in
 * normal compiled code.
 *
 * @see CSV_MAPPER
 */
@JvmField
public val csvMapper: CsvMapper =
    CSV_MAPPER
