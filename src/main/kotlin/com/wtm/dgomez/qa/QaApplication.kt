package com.wtm.dgomez.qa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
class QaApplication

fun main(args: Array<String>) {
	runApplication<QaApplication>(*args)
}
