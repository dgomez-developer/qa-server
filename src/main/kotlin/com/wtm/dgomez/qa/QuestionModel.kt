package com.wtm.dgomez.qa

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class QuestionModel(@Id val id: String = UUID.randomUUID().toString()
                         , val question: String, val contact: String?)