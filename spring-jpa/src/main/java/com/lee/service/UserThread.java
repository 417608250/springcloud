package com.lee.service;

import org.springframework.web.context.ContextLoader;

import com.lee.entity.User;
import com.lee.service.UserService;

public class UserThread implements Runnable {
	
	public UserThread(){
		System.out.println(999999999);
	}
	
	private UserService userService = ContextLoader.getCurrentWebApplicationContext().getBean(UserService.class); 
	
	private User user;
	
	public UserThread(User u){
		user = u;
	}
	
	@Override
	public void run() {
		userService.update(user);
	}

}
