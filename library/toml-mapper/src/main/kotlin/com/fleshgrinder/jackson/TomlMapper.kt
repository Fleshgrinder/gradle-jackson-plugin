@file:JvmName("TomlMapperSingleton")

package com.fleshgrinder.jackson

import com.fasterxml.jackson.dataformat.toml.TomlMapper

/**
 * Gets the global default [TomlMapper] instance.
 *
 * @see objectMapperOf
 */
@JvmField
public val TOML_MAPPER: TomlMapper =
    objectMapperOf(TomlMapper.builder())
