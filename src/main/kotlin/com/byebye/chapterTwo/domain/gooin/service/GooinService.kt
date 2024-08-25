package com.byebye.chapterTwo.domain.gooin.service

import com.byebye.chapterTwo.domain.gooin.dto.req.AddGooinRequest
import com.byebye.chapterTwo.domain.gooin.entity.GooinEntity
import com.byebye.chapterTwo.domain.gooin.repository.GooinRepository
import com.byebye.chapterTwo.global.auth.jwt.JwtUtils
import org.springframework.stereotype.Service

@Service
class GooinService(
    private val gooinRepository: GooinRepository,
    private val jwtUtils: JwtUtils
) {

    fun saveGooin(dto: AddGooinRequest){
        gooinRepository.save(
            GooinEntity(
                title = dto.title,
                description = dto.description,
                userId = jwtUtils.getMember().id!!
            )
        )
    }

}