package com.lee.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAop {
	
	
	Logger logger = LoggerFactory.getLogger(LogAop.class);
	
	public void printLog(){
		System.out.println("目标方法执行前执行日志打印");
		
	}
	
	public void afterExcute(){
		System.out.println("目标方法执行后执行打印日志");
	}
}
