package com.byebye.chapterTwo.domain.business.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/byebye/chapterTwo/domain/business/service/BusinessService;", "", "businessRepository", "Lcom/byebye/chapterTwo/domain/business/repository/BusinessRepository;", "(Lcom/byebye/chapterTwo/domain/business/repository/BusinessRepository;)V", "addBusiness", "Lcom/byebye/chapterTwo/global/common/BaseResponse;", "", "dto", "Lcom/byebye/chapterTwo/domain/business/dto/req/BusinessRequest;", "getBusiness", "", "Lcom/byebye/chapterTwo/domain/business/entity/BusinessEntity;", "getById", "id", "", "chapterTwo"})
public class BusinessService {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.business.repository.BusinessRepository businessRepository = null;
    
    public BusinessService(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.business.repository.BusinessRepository businessRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.lang.String> addBusiness(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.business.dto.req.BusinessRequest dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.util.List<com.byebye.chapterTwo.domain.business.entity.BusinessEntity>> getBusiness() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<com.byebye.chapterTwo.domain.business.entity.BusinessEntity> getById(long id) {
        return null;
    }
}