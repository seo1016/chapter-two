package com.byebye.chapterTwo.domain.applicant.service

import com.byebye.chapterTwo.domain.applicant.entity.ApplicantEntity
import com.byebye.chapterTwo.domain.applicant.repository.ApplicantRepository
import com.byebye.chapterTwo.global.auth.jwt.JwtUtils
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.stereotype.Service

@Service
class ApplicantService(
    private val applicantRepository: ApplicantRepository,
    private val jwtUtils: JwtUtils
) {
    fun applicant(id: Long): BaseResponse<String>{
        applicantRepository.save(ApplicantEntity(
            id = null,
            gooinId = id,
            userName = jwtUtils.getMember().name
        ))
        return BaseResponse(
            message = "지원 성공"
        )
    }

    fun getApplicants(): BaseResponse<List<ApplicantEntity>> {
        return BaseResponse(
            message = "조회 성공",
            data = applicantRepository.findAll()
        )
    }

    fun myApplicantsByName() : BaseResponse<List<ApplicantEntity>> {
        return BaseResponse(
            message = "조회 성공",
            data = applicantRepository.findAllByUserName(jwtUtils.getMember().name)
        )
    }

    fun myApplicantsById(id: Long) : BaseResponse<List<ApplicantEntity>> {
        return BaseResponse(
            message = "조회 성공",
            data = applicantRepository.findAllByGooinId(id)
        )
    }
}