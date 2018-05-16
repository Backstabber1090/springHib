package com.sood.vaibhav;

public class BaseballCoach implements Coach {
private FortuneInterface fortuneInterface;
	public  BaseballCoach(FortuneInterface thefortuneInterface) {
		setFortuneInterface(thefortuneInterface);
	}
	
	@Override
	public String getDailyWorkout() {
		return "get 30 mins of batting practice";
	}

	public FortuneInterface getFortuneInterface() {
		return fortuneInterface;
	}

	public void setFortuneInterface(FortuneInterface fortuneInterface) {
		this.fortuneInterface = fortuneInterface;
	}

	@Override
	public String getDailyFortune() {
		//use service to get Fortune
		return fortuneInterface.getFortune();
	}
}
