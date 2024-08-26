package com.byebye.chapterTwo.domain.business.service

import com.byebye.chapterTwo.domain.business.dto.req.BusinessRequest
import com.byebye.chapterTwo.domain.business.entity.BusinessEntity
import com.byebye.chapterTwo.domain.business.exception.BusinessErrorCode
import com.byebye.chapterTwo.domain.business.repository.BusinessRepository
import com.byebye.chapterTwo.global.auth.exception.CustomException
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.stereotype.Service

@Service
class BusinessService(
    private val businessRepository: BusinessRepository,
) {
    fun addBusiness(dto: BusinessRequest):BaseResponse<String>{
        businessRepository.save(BusinessEntity(null,
            name = dto.name,
            description = dto.description,
            shortDescription = dto.shortDescription,
            ceo = dto.ceo,
            phoneNum = dto.phoneNum)
        )
        return BaseResponse(
            message = "생성 성공!!"
        )
    }

    fun getBusiness(): BaseResponse<List<BusinessEntity>>{
        return BaseResponse(
            message = "조회 성공",
            data = businessRepository.findAll()
        )
    }

    fun getById(id:Long):BaseResponse<BusinessEntity>{
        return BaseResponse(
            message = "조회 성공",
            data = businessRepository.findById(id).orElseThrow{ CustomException(BusinessErrorCode.BUSINESS_NOT_FOUND)}
        )
    }

}