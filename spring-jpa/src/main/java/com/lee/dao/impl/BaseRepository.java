package com.lee.dao.impl;

import com.mysema.query.types.EntityPath;
import com.mysema.query.types.Predicate;

public interface BaseRepository<T,P extends EntityPath<T>> {
	
	public T findOne(P path, Predicate predicate);
	
	public void update(T entity);
}
