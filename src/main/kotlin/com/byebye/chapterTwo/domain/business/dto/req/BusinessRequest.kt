package com.byebye.chapterTwo.domain.business.dto.req

import com.fasterxml.jackson.annotation.JsonProperty

data class BusinessRequest(
    @JsonProperty("name") val name : String,
    @JsonProperty("description") val description : String,
    @JsonProperty("shortDescription") val shortDescription : String,
    @JsonProperty("ceo") val ceo : String,
    @JsonProperty("phoneNum") val phoneNum : String,
)
