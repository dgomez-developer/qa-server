package com.wtm.dgomez.qa

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import javax.servlet.http.HttpServletResponse

@Controller
class QaController {

    @Autowired
    lateinit var repository: QaRepository

    @GetMapping(value = ["/questions"])
    fun getAllQuestions(): List<QuestionModel> {
        return repository.findAll()
    }

    @PostMapping(value = ["/question"], consumes = ["application/json"])
    fun createQuestion(@RequestBody question: QuestionModel, response: HttpServletResponse): QuestionModel {
        val questionCreated = repository.save(question)
        questionCreated?.let {
            response.status = HttpStatus.CREATED.value()
        }
        return questionCreated
    }
}