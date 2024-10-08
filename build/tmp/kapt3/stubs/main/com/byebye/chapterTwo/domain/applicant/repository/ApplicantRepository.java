package com.byebye.chapterTwo.domain.applicant.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/byebye/chapterTwo/domain/applicant/repository/ApplicantRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/byebye/chapterTwo/domain/applicant/entity/ApplicantEntity;", "", "findAllByGooinId", "", "id", "findAllByUserName", "username", "", "chapterTwo"})
public abstract interface ApplicantRepository extends org.springframework.data.jpa.repository.JpaRepository<com.byebye.chapterTwo.domain.applicant.entity.ApplicantEntity, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.byebye.chapterTwo.domain.applicant.entity.ApplicantEntity> findAllByUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.byebye.chapterTwo.domain.applicant.entity.ApplicantEntity> findAllByGooinId(long id);
}