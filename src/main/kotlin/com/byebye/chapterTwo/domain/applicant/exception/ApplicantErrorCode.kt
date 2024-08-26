package com.byebye.chapterTwo.domain.applicant.exception

import com.byebye.chapterTwo.global.auth.exception.CustomErrorCode
import org.springframework.http.HttpStatus

enum class ApplicantErrorCode (
    override val status: HttpStatus,
    override val message: String,
) : CustomErrorCode {

    APPLICANT_NOT_FOUND(HttpStatus.NOT_FOUND,  "신청하고 싶은 구인 요청을 찾을 수 없습니다"),
    BUSINESS_ALREADY_EXIST(HttpStatus.CONFLICT,  "이미 신청했습니다")

}