package com.byebye.chapterTwo.domain.member.adapter.out.repository;

@org.springframework.stereotype.Repository()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepository;", "Lorg/springframework/data/repository/CrudRepository;", "Lcom/byebye/chapterTwo/domain/member/adapter/out/entity/MemberEntity;", "", "Lcom/byebye/chapterTwo/domain/member/adapter/out/repository/MemberRepositoryCustom;", "existsByName", "", "name", "", "findByName", "chapterTwo"})
public abstract interface MemberRepository extends org.springframework.data.repository.CrudRepository<com.byebye.chapterTwo.domain.member.adapter.out.entity.MemberEntity, java.lang.Long>, com.byebye.chapterTwo.domain.member.adapter.out.repository.MemberRepositoryCustom {
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public abstract com.byebye.chapterTwo.domain.member.adapter.out.entity.MemberEntity findByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @java.lang.Override()
    public abstract boolean existsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
}