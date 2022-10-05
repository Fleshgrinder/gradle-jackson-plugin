@file:JvmName("YamlMapperSingleton")

package com.fleshgrinder.jackson

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper

/**
 * Gets the global default [YAMLMapper] instance.
 *
 * @see objectMapperOf
 */
@JvmField
public val YAML_MAPPER: YAMLMapper =
    objectMapperOf(YAMLMapper.builder())
