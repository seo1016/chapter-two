package com.byebye.chapterTwo.domain.applicant.controller

import com.byebye.chapterTwo.domain.applicant.entity.ApplicantEntity
import com.byebye.chapterTwo.domain.applicant.service.ApplicantService
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/applicant")
class ApplicantController (
    private val applicantService: ApplicantService
){
    @PostMapping("/{id}")
    fun applicant(@PathVariable id: Long) : BaseResponse<String> {
        return applicantService.applicant(id)
    }

    @GetMapping("/{id}")
    fun getApplicantById(@PathVariable id: Long): BaseResponse<List<ApplicantEntity>> {
        return applicantService.myApplicantsById(id)
    }

    @GetMapping("/my/{id}")
    fun getApplicantByName(): BaseResponse<List<ApplicantEntity>> {
        return applicantService.myApplicantsByName()
    }

    @GetMapping("/all")
    fun getAllApplicants(): BaseResponse<List<ApplicantEntity>> {
        return applicantService.getApplicants()
    }

}