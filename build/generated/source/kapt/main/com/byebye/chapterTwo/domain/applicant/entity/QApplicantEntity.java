package com.byebye.chapterTwo.domain.applicant.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QApplicantEntity is a Querydsl query type for ApplicantEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QApplicantEntity extends EntityPathBase<ApplicantEntity> {

    private static final long serialVersionUID = 1192222402L;

    public static final QApplicantEntity applicantEntity = new QApplicantEntity("applicantEntity");

    public final NumberPath<Long> gooinId = createNumber("gooinId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath userName = createString("userName");

    public QApplicantEntity(String variable) {
        super(ApplicantEntity.class, forVariable(variable));
    }

    public QApplicantEntity(Path<ApplicantEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QApplicantEntity(PathMetadata metadata) {
        super(ApplicantEntity.class, metadata);
    }

}

