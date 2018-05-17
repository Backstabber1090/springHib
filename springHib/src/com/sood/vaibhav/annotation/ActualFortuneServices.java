package com.sood.vaibhav.annotation;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class ActualFortuneServices implements FortuneInterface {
private String[] fortunes =new String[]  {"Today is your lucky day","Hardwork has real fruits","Dont even bother","try and try again you will succeed","You should make it","You're not going to make it in a day"};
	@Override
	public String getFortune() {
		Random m  = new Random();
		int n = m.nextInt(5);
		return fortunes[n];
	}

}
