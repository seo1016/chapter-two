package com.byebye.chapterTwo.domain.applicant.repository

import com.byebye.chapterTwo.domain.applicant.entity.ApplicantEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ApplicantRepository : JpaRepository<ApplicantEntity,Long> {
    fun findAllByUserName(username: String): List<ApplicantEntity>
    fun findAllByGooinId(id: Long): List<ApplicantEntity>
}