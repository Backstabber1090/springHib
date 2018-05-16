package com.sood.vaibhav;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
	Coach c  = context.getBean("myCoach",Coach.class);
	Coach alpha  = context.getBean("myCoach",Coach.class);
	boolean a  = c==alpha; //prototype scope test in xml file 
	
	System.out.println(a);
	context.close();
	}
	
}
