package com.byebye.chapterTwo.domain.business.controller

import com.byebye.chapterTwo.domain.business.dto.req.BusinessRequest
import com.byebye.chapterTwo.domain.business.entity.BusinessEntity
import com.byebye.chapterTwo.domain.business.service.BusinessService
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/business")
class BusinessController(
    private val businessService: BusinessService
) {
    @GetMapping
    fun getBusinesses(): BaseResponse<List<BusinessEntity>> {
        return businessService.getBusiness()
    }

    @PostMapping
    fun addBusiness(@RequestBody dto: BusinessRequest): BaseResponse<String> {
        return businessService.addBusiness(dto)
    }

    @GetMapping("/{id}")
    fun getBusinessDetail(@PathVariable("id") id: Long): BaseResponse<BusinessEntity> {
        return businessService.getById(id)
    }

}