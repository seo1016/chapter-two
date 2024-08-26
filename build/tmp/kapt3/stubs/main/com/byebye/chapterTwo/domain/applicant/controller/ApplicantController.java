package com.byebye.chapterTwo.domain.applicant.controller;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/applicant"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006H\u0017J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/byebye/chapterTwo/domain/applicant/controller/ApplicantController;", "", "applicantService", "Lcom/byebye/chapterTwo/domain/applicant/service/ApplicantService;", "(Lcom/byebye/chapterTwo/domain/applicant/service/ApplicantService;)V", "applicant", "Lcom/byebye/chapterTwo/global/common/BaseResponse;", "", "id", "", "getAllApplicants", "", "Lcom/byebye/chapterTwo/domain/applicant/entity/ApplicantEntity;", "getApplicantById", "getApplicantByName", "chapterTwo"})
public class ApplicantController {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.domain.applicant.service.ApplicantService applicantService = null;
    
    public ApplicantController(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.domain.applicant.service.ApplicantService applicantService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.lang.String> applicant(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.util.List<com.byebye.chapterTwo.domain.applicant.entity.ApplicantEntity>> getApplicantById(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/my/{id}"})
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.util.List<com.byebye.chapterTwo.domain.applicant.entity.ApplicantEntity>> getApplicantByName() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/all"})
    @org.jetbrains.annotations.NotNull()
    public com.byebye.chapterTwo.global.common.BaseResponse<java.util.List<com.byebye.chapterTwo.domain.applicant.entity.ApplicantEntity>> getAllApplicants() {
        return null;
    }
}