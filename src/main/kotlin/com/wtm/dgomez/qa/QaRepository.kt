package com.wtm.dgomez.qa

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface QaRepository : MongoRepository<QuestionModel, Int>