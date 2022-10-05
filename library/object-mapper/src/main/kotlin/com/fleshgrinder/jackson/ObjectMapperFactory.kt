@file:JvmName("ObjectMapperFactory")

package com.fleshgrinder.jackson

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.cfg.MapperBuilder
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinFeature.SingletonSupport
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.slf4j.LoggerFactory

private val JDK8_MODULE = Jdk8Module()
private val JSR310_MODULE = JavaTimeModule()
private val KOTLIN_MODULE = KotlinModule.Builder().enable(SingletonSupport).build()

/**
 * Creates a new [ObjectMapper] [M] built with the supplied [builder] [B] after
 * adding the default Java 8+ and Kotlin modules.
 *
 * The following modules are added:
 *
 * - [Jdk8Module],
 * - [JavaTimeModule], and
 * - [KotlinModule] with the [SingletonSupport] feature enabled.
 */
@JvmName("create")
public fun <M : ObjectMapper, B : MapperBuilder<M, B>> objectMapperOf(builder: B): M =
    builder.addModule(JDK8_MODULE).addModule(JSR310_MODULE).addModule(KOTLIN_MODULE).build().also {
        LoggerFactory.getLogger("com.fleshgrinder.jackson.ObjectMapperFactory").apply {
            if (isDebugEnabled) {
                val mapper = it::class.java
                debug("Created new {} in class loader {}", mapper.simpleName, mapper.classLoader)
            }
        }
    }
