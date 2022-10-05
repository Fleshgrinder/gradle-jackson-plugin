@file:JvmName("JsonMapperSingleton")

package com.fleshgrinder.jackson

import com.fasterxml.jackson.databind.json.JsonMapper

/**
 * Gets the global default [JsonMapper] instance.
 *
 * @see objectMapperOf
 */
@JvmField
public val JSON_MAPPER: JsonMapper =
    objectMapperOf(JsonMapper.builder())
