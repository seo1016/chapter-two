package com.byebye.chapterTwo.global.common

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ReactController {
    private val logger = LoggerFactory.getLogger(ReactController::class.java)

    // "/" 또는 "/home"으로 요청 시 React의 index.html을 반환
    @GetMapping("/", "/home", "/{path:[^\\.]*}")
    fun index(model: Model): String {
        logger.info("React index.html is being returned")
        return "index"  // React의 index.html 반환
    }
}