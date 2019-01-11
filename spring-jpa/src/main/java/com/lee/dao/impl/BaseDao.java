package com.lee.dao.impl;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.EntityPath;
import com.mysema.query.types.Predicate;
@Repository
public class BaseDao<T,P extends EntityPath<T>> {
	
	
	
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public T findOne(P path ,Predicate predicate){
			
			JPAQuery jpaQuery = getQuery().from(path).where(predicate);
			T uniqueResult = jpaQuery.uniqueResult(path);
			return uniqueResult;
	}
	
	public void update(T entity){
		entityManager.merge(entity);
	}
	
	private JPAQuery getQuery(){
		JPAQuery jpaQuery = new JPAQuery(entityManager);
		return jpaQuery;
	}
}
