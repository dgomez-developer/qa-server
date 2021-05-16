package com.wtm.dgomez.qa

import graphql.kickstart.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component

@Component
class QaMutation(private val repository: QaRepository) : GraphQLMutationResolver {

    fun writeQuestion(question: String, contact: String?): QuestionModel {
        return repository.save(QuestionModel(question = question, contact = contact))
    }

}