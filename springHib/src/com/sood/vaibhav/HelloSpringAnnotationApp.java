package com.sood.vaibhav;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAnnotationApp {

	public static void main(String[] args) {
	//load the spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansBasednnotation-applicationContext.xml");
		
		//retrieve a bean
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		//Coach theCricketCoach = context.getBean("myCricketCoach",Coach.class);
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
//		System.out.println(theCricketCoach.getDailyWorkout()       );
//		System.out.println(theCricketCoach.getDailyFortune());
//		System.out.println();
		//close context
	
context.close();
	}

}
