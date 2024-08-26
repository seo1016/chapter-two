package com.byebye.chapterTwo.domain.member.adapter.`in`.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ReactController {

    @GetMapping("/",  "/{path:[^\\.]*}")
    fun index(model: Model): String {
        return "index"
    }
}