package com.byebye.chapterTwo.domain.business.dto

import com.byebye.chapterTwo.domain.business.dto.req.BusinessRequest

data class Business(
    val id: Long? = null,
    var name: String,
    var shortDescription: String,
    var description: String,
    var ceo: String,
    var phoneNum: String
){
    constructor(dto: BusinessRequest) : this(
        id = null?:0,
        name = dto.name,
        shortDescription = dto.shortDescription,
        description = dto.description,
        ceo = dto.ceo,
        phoneNum = dto.phoneNum
    )
}
