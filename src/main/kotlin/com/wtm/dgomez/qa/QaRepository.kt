package com.wtm.dgomez.qa

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface QaRepository : JpaRepository<QuestionModel, Int>