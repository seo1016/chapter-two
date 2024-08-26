package com.byebye.chapterTwo.domain.gooin.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00130\nH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/byebye/chapterTwo/domain/gooin/service/GooinService;", "", "gooinRepository", "Lcom/byebye/chapterTwo/domain/gooin/repository/GooinRepository;", "jwtUtils", "Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;", "gooinMapper", "Lcom/byebye/chapterTwo/domain/gooin/mapper/GooinMapper;", "(Lcom/byebye/chapterTwo/domain/gooin/repository/GooinRepository;Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;Lcom/byebye/chapterTwo/domain/gooin/mapper/GooinMapper;)V", "editGooin", "Lcom/byebye/chapterTwo/global/common/BaseResponse;", "", "id", "", "dto", "Lcom/byebye/chapterTwo/domain/gooin/dto/req/AddGooinRequest;", "getDetail", "Lcom/byebye/chapterTwo/domain/gooin/entity/GooinEntity;", "getGooin", "", "saveGooin", "chapterTwo"})
public class GooinService {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.gooin.repository.GooinRepository gooinRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils = null;
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.gooin.mapper.GooinMapper gooinMapper = null;
    
    public GooinService(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.gooin.repository.GooinRepository gooinRepository, @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils, @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.gooin.mapper.GooinMapper gooinMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.lang.String> saveGooin(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.gooin.dto.req.AddGooinRequest dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.util.List<com.byebye.chapterTwo.domain.gooin.entity.GooinEntity>> getGooin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.lang.String> editGooin(long id, @org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.gooin.dto.req.AddGooinRequest dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<com.byebye.chapterTwo.domain.gooin.entity.GooinEntity> getDetail(long id) {
        return null;
    }
}