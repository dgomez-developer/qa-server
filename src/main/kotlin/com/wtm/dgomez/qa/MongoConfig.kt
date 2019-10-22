package com.wtm.dgomez.qa

import com.mongodb.MongoClient
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.data.mongodb.config.AbstractMongoConfiguration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoRepositories
@Import(value = MongoAutoConfiguration::class)
class MongoConfig: AbstractMongoConfiguration() {

    override fun getDatabaseName(): String {
        return "qa"
    }

    override fun mongoClient(): MongoClient {
        return MongoClient("127.0.0.1", 27017)
    }
}