package com.sood.vaibhav.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

Coach c  = context.getBean("tennisCoach",Coach.class);
System.out.println(c.getDailyWorkout());
System.out.println(c.getDailyFortune());
context.close();

	}

}
