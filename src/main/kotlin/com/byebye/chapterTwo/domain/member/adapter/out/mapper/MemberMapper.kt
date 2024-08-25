package com.byebye.chapterTwo.domain.member.adapter.out.mapper

import com.byebye.chapterTwo.domain.member.adapter.out.entity.MemberEntity
import com.byebye.chapterTwo.domain.member.application.model.Member
import com.byebye.chapterTwo.domain.member.application.model.value.*
import org.springframework.stereotype.Component

@Component
class MemberMapper{

    fun toDomain(entity: MemberEntity): Member {
        return Member (
            id = MemberId(entity.id!!),
            name = MemberName(entity.name),
            phoneNum = MemberPhoneNum(entity.phoneNum),
            password = MemberPassword(entity.password),
            role = MemberRole(entity.role),
        )
    }

    fun toEntity(domain: Member): MemberEntity {
        return MemberEntity (
            id = domain.id?.value ?: 0,
            name = domain.name.value,
            phoneNum = domain.phoneNum.value,
            password = domain.password.value,
        )
    }

}