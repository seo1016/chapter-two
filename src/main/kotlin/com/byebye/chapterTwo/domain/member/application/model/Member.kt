package com.byebye.chapterTwo.domain.member.application.model

import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req.EditMemberRequest
import com.byebye.chapterTwo.domain.member.adapter.`in`.dto.req.RegisterMemberRequest
import com.byebye.chapterTwo.domain.member.application.model.value.*

data class Member (

    val id: MemberId?,
    var name: MemberName,
    val password: MemberPassword,
    val role: MemberRole,
    var phoneNum: MemberPhoneNum

) {

    constructor(dto: RegisterMemberRequest, encrypted: String) : this (
        id = MemberId(0),
        name = MemberName(dto.name),
        password = MemberPassword(encrypted),
        role = MemberRole("ROLE_USER"),
        phoneNum = MemberPhoneNum(dto.phoneNum)
    )

    fun editMember (dto: EditMemberRequest) {
        this.name = MemberName(dto.name)
    }

}