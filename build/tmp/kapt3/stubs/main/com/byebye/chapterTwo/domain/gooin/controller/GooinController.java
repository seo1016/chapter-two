package com.byebye.chapterTwo.domain.gooin.controller;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/gooin"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0017J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0006H\u0017J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/byebye/chapterTwo/domain/gooin/controller/GooinController;", "", "gooinService", "Lcom/byebye/chapterTwo/domain/gooin/service/GooinService;", "(Lcom/byebye/chapterTwo/domain/gooin/service/GooinService;)V", "addGooin", "Lcom/byebye/chapterTwo/global/common/BaseResponse;", "", "request", "Lcom/byebye/chapterTwo/domain/gooin/dto/req/AddGooinRequest;", "editGooin", "id", "", "dto", "getGooin", "", "Lcom/byebye/chapterTwo/domain/gooin/entity/GooinEntity;", "chapterTwo"})
public class GooinController {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.gooin.service.GooinService gooinService = null;
    
    public GooinController(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.gooin.service.GooinService gooinService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping()
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.lang.String> addGooin(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.gooin.dto.req.AddGooinRequest request) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping()
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.util.List<com.byebye.chapterTwo.domain.gooin.entity.GooinEntity>> getGooin() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PatchMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.lang.String> editGooin(long id, @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.gooin.dto.req.AddGooinRequest dto) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<com.byebye.chapterTwo.domain.gooin.entity.GooinEntity> getGooin(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
        return null;
    }
}