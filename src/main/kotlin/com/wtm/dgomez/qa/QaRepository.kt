package com.wtm.dgomez.qa

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
abstract class QaRepository : MongoRepository<QuestionModel, Int>