package com.sood.vaibhav;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifecycleApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		Coach c  = context.getBean("myCoach",Coach.class);
	
		
		System.out.println(c.getDailyWorkout());
		context.close();
	}

}
