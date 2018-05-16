package com.sood.vaibhav;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//context.get
		//Coach coach = new TrackCoach();
		//System.out.println(coach.getDailyWorkout());
	}

}
