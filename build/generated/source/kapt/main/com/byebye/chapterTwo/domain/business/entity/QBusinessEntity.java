package com.byebye.chapterTwo.domain.business.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBusinessEntity is a Querydsl query type for BusinessEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBusinessEntity extends EntityPathBase<BusinessEntity> {

    private static final long serialVersionUID = -341384804L;

    public static final QBusinessEntity businessEntity = new QBusinessEntity("businessEntity");

    public final StringPath ceo = createString("ceo");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath phoneNum = createString("phoneNum");

    public final StringPath shortDescription = createString("shortDescription");

    public QBusinessEntity(String variable) {
        super(BusinessEntity.class, forVariable(variable));
    }

    public QBusinessEntity(Path<BusinessEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBusinessEntity(PathMetadata metadata) {
        super(BusinessEntity.class, metadata);
    }

}

