package com.byebye.chapterTwo.domain.business.repository

import com.byebye.chapterTwo.domain.business.entity.BusinessEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BusinessRepository : JpaRepository<BusinessEntity, Long> {
}