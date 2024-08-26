package com.byebye.chapterTwo.global.common

import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class EnvironmentLogger {
    @Value("\${spring.datasource.url}")
    private val dbUrl: String? = null

    @Value("\${spring.datasource.username}")
    private val dbUsername: String? = null

    @Value("\${spring.datasource.password}")
    private val dbPassword: String? = null

    @PostConstruct
    fun logEnvironment() {
        println("Database URL: $dbUrl")
        println("Database Username: $dbUsername")
        // Note: Be careful with logging sensitive information like passwords
        println("Database Password: $dbPassword")
    }
}