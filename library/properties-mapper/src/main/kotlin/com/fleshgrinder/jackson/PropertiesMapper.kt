@file:JvmName("PropertiesMapperSingleton")

package com.fleshgrinder.jackson

import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper

/**
 * Gets the global default [JavaPropsMapper] instance.
 *
 * @see objectMapperOf
 */
@JvmField
public val PROPERTIES_MAPPER: JavaPropsMapper =
    objectMapperOf(JavaPropsMapper.builder())
