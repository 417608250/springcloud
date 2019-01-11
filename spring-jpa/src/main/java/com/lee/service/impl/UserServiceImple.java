package com.lee.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.dao.UserRepositoty;
import com.lee.entity.QUser;
import com.lee.entity.User;
import com.lee.service.UserService;
import com.mysema.query.types.Predicate;
@Service
public class UserServiceImple implements UserService{
	
	public UserServiceImple(){
		System.out.println(888888);
	}
	
	@Autowired
	private UserRepositoty userRepo;
	
	public User findById(Integer id) {
		QUser q = QUser.user;
		Predicate predicate = q.id.eq(id);
		User user = userRepo.findOne(q, predicate);
		return user;
	}

	@Override
	public void update(User entity) {
		userRepo.update(entity);
	}

}
