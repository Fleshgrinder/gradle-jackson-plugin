@file:JvmName("XmlMapperSingleton")

package com.fleshgrinder.jackson

import com.ctc.wstx.stax.WstxInputFactory
import com.ctc.wstx.stax.WstxOutputFactory
import com.fasterxml.jackson.dataformat.xml.XmlFactory
import com.fasterxml.jackson.dataformat.xml.XmlMapper

/**
 * Gets the global default [XmlMapper] instance.
 *
 * @see objectMapperOf
 */
@JvmField
public val XML_MAPPER: XmlMapper =
    objectMapperOf(XmlMapper.builder(XmlFactory(WstxInputFactory(), WstxOutputFactory())))
