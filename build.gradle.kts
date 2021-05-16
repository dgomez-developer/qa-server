import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.2.0.RELEASE"
	id("io.spring.dependency-management") version "1.0.8.RELEASE"
	kotlin("jvm") version "1.3.50"
	kotlin("plugin.spring") version "1.3.50"
	kotlin("plugin.jpa") version "1.3.50"
}

group = "com.wtm.dgomez"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
	maven {
		setUrl("https://oss.sonatype.org/content/repositories/snapshots/")
	}
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("com.h2database:h2:1.4.200")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("io.springfox:springfox-swagger-ui:2.6.1")
	implementation("io.springfox:springfox-swagger2:2.6.1")

	// GraphQL
	implementation("com.graphql-java-kickstart:graphql-spring-boot-starter:11.0.0")
	// to embed Altair tool
	runtimeOnly("com.graphql-java-kickstart:altair-spring-boot-starter:11.0.0")
	// to embed GraphiQL tool
	runtimeOnly( "com.graphql-java-kickstart:graphiql-spring-boot-starter:11.0.0")
	// to embed GraphQL Playground tool
	runtimeOnly("com.graphql-java-kickstart:playground-spring-boot-starter:11.0.0")
	// to embed Voyager tool
	runtimeOnly("com.graphql-java-kickstart:voyager-spring-boot-starter:11.0.0")

	// Tests
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}
