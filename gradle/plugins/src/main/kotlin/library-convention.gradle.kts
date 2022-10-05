plugins {
    id("kotlin-convention")
}

description = "Jackson .${name.removeSuffix("-mapper")} Mapper Singleton"

publishing.publications.register<MavenPublication>("library") {
    from(components["java"])
}

signing.sign(publishing.publications["library"])
