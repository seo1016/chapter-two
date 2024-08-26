package com.byebye.chapterTwo.domain.applicant.dto

data class Applicant(
    val id : Long? = null,
    val gooinId: Long,
    val userName : String,
){
    constructor(id:Long, userName: String) : this(
        id = null?:0,
        gooinId = id,
        userName = userName
    )
}
