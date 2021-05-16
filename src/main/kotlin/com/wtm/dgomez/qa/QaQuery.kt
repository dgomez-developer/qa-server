package com.wtm.dgomez.qa

import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class QaQuery(private val repository: QaRepository): GraphQLQueryResolver {

    fun getRecentQa(): List<QuestionModel> {
        return repository.findAll()
    }
}