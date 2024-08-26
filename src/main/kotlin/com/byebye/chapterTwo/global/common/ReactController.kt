package com.byebye.chapterTwo.global.common

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ReactController {
    @GetMapping("/home")
    fun index(): String {return "home"}
}