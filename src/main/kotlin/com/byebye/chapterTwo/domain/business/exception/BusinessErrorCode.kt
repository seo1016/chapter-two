package com.byebye.chapterTwo.domain.business.exception

import com.byebye.chapterTwo.global.auth.exception.CustomErrorCode
import org.springframework.http.HttpStatus

enum class BusinessErrorCode  (
    override val status: HttpStatus,
    override val message: String,
) : CustomErrorCode {

    BUSINESS_NOT_FOUND(HttpStatus.NOT_FOUND,  "해당 회사를 찾을 수 없습니다")

}