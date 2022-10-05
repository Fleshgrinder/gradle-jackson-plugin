# Version Catalog

The **version catalog** can be imported into a Gradle build to simplify the
notation of dependencies by centralizing their definition. Fore details on this
functionality refer to the [Official Gradle Docs].

Add the following to your `settings.gradle.kts` script:

> **Note** replace the `+` version with the [latest release] version, unless you
> are using [dependency locking].

```kotlin
dependencyResolutionManagement {
    versionCatalogs {
        register("jacksonMapperLibs") {
            from("com.fleshgrinder.jackson:version-catalog:+")
        }
    }
}
```

Afterwards in your `build.gradle.kts` scripts:

```kotlin
plugins {
    alias(jacksonMapperLibs.plugin.json)
    alias(jacksonMapperLibs.plugin.yaml)
}

dependencies {
    implementation(jacksonMapperLibs.json)
    implementation(jacksonMapperLibs.yaml)
}
```

<!-- @formatter:off -->
[Official Gradle Docs]: https://docs.gradle.org/current/userguide/platforms.html
[latest release]: https://github.com/fleshgrinder/jackson-mapper/releases/latest
[dependency locking]: https://docs.gradle.org/current/userguide/dependency_locking.html
