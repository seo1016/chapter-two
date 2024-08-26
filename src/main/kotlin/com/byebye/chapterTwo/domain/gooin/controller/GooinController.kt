package com.byebye.chapterTwo.domain.gooin.controller

import com.byebye.chapterTwo.domain.gooin.dto.req.AddGooinRequest
import com.byebye.chapterTwo.domain.gooin.entity.GooinEntity
import com.byebye.chapterTwo.domain.gooin.service.GooinService
import com.byebye.chapterTwo.global.common.BaseResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/gooin")
class GooinController(
    private val gooinService: GooinService
) {
    @PostMapping
    fun addGooin(@RequestBody request: AddGooinRequest): BaseResponse<String> {
        return gooinService.saveGooin(request)
    }

    @GetMapping
    fun getGooin():BaseResponse<List<GooinEntity>>{
        return gooinService.getGooin()
    }

    @PatchMapping("/{id}")
    fun editGooin(id:Long, dto:AddGooinRequest): BaseResponse<String> {
        return gooinService.editGooin(id,dto)
    }

    @GetMapping("/{id}")
    fun getGooin(@PathVariable id:Long):BaseResponse<GooinEntity> {
        return gooinService.getDetail(id)
    }

}
