plugins {
    id("java")
    id ("org.flywaydb.flyway" ) version ("9.22.3")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("org.hibernate:hibernate-core:6.4.0.Final")
    implementation ("com.h2database:h2:2.2.224")
    implementation ("org.flywaydb:flyway-core:9.22.3")
    runtimeOnly ("com.h2database:h2:2.1.214")
}

flyway {
    url = "jdbc:h2:./spacetravel"
    user = "sa"
    password = ""
    locations = arrayOf("filesystem:src/main/resources/db/migration")
}
tasks.test {
    useJUnitPlatform()
}
