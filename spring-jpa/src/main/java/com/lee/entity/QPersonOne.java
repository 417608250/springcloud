package com.lee.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPersonOne is a Querydsl query type for PersonOne
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPersonOne extends EntityPathBase<PersonOne> {

    private static final long serialVersionUID = 1178785877;

    public static final QPersonOne personOne = new QPersonOne("personOne");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QPersonOne(String variable) {
        super(PersonOne.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QPersonOne(Path<? extends PersonOne> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QPersonOne(PathMetadata<?> metadata) {
        super(PersonOne.class, metadata);
    }

}

