@file:JvmName("CsvMapperSingleton")

package com.fleshgrinder.jackson

import com.fasterxml.jackson.dataformat.csv.CsvMapper

/**
 * Gets the global default [CsvMapper] instance.
 *
 * @see objectMapperOf
 */
@JvmField
public val CSV_MAPPER: CsvMapper =
    objectMapperOf(CsvMapper.builder())
