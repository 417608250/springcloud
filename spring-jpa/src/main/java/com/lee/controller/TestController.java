package com.lee.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lee.entity.User;
import com.lee.service.UserService;
import com.lee.service.UserThread;

@Controller
@RequestMapping(value="/first")
public class TestController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/index")
	public String index(HttpServletRequest request){
		User user1 = userService.findById(1);
		User user2 = userService.findById(1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user1.setUserNo("aaaa");
		user2.setUserNo("BBBB");
		UserThread userThread = new UserThread(user1);
		Thread thread = new Thread(userThread);
		thread.start();
		UserThread userThread1 = new UserThread(user2);
		Thread thread1 = new Thread(userThread1);
		thread1.start();
//		User findById = testService.findById(1);
//		User user = new User();
//		user.setUserName("奔波尔霸");
//		user.setUserCode("AADF");
//		System.out.println(findById.getUserName());
//		request.setAttribute("message", findById.getUserName());
		return "index";
	}
	
	/*public static void main(String[] args) {
		Pattern compile = Pattern.compile("^.*#|&|\\\\|/.*$");
		String s ="#djdddde";
		Matcher matcher = compile.matcher(s);
		System.out.println(matcher.matches());
		
		System.out.println("------------------");
		Pattern compile2 = Pattern.compile("\\w{4,5}://[\\w-_]+(\\.{1}\\w+)*\\.{1}\\w+");
		String s1 = "http://abc152-k.lee.xxx5455.com";
		Matcher matcher2 = compile2.matcher(s1);
		System.out.println(matcher2.matches());
		
		
		Pattern compile3 = Pattern.compile("((?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d))");
		Matcher matcher3 = compile3.matcher("192.168.1.1");
		System.out.println(matcher3.matches());
		System.out.println("==================");
		Pattern compile4 = Pattern.compile("\\w+");
		Matcher matcher4 = compile4.matcher("委任-为");
		System.out.println(matcher4.find());
		System.out.println("==================");
		Pattern compile5 = Pattern.compile("[\u4e00-\u9fa5]");
		Matcher matcher5 = compile5.matcher("委任-为");
		System.out.println(matcher5.find());
	}*/
	
		
	
}