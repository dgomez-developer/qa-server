package com.wtm.dgomez.qa

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

@Document
data class QuestionModel(@Id val id: String = UUID.randomUUID().toString()
                         , val question: String, val contact: String?)