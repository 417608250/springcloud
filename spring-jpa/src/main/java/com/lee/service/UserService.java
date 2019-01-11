package com.lee.service;

import com.lee.entity.User;

public interface UserService {
	
	public User findById(Integer id);
	
	public void update(User entity);
}
