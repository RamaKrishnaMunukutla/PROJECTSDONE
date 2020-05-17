package com.java.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s1 = (Student) ctx.getBean("std");
		s1.cheating();
		AnotherStudent s2 =  (AnotherStudent) ctx.getBean("std2");
		s2.startCheating();

	}
}