package com.sood.vaibhav;

public class TrackCoach implements Coach{
	private FortuneInterface fortuneInterface;
	public TrackCoach(FortuneInterface fortuneInterface) {
		//super();
		this.fortuneInterface = fortuneInterface;
	}

	@Override
	public String getDailyWorkout() {
		
		return "jog for 10 mins ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneInterface.getFortune();
	}
	public void doMyStartupStuff (){
		System.out.println("startup method called");
		
		
	}
	
	
	public void doMyCleanupupStuff () {
		System.out.println("cleanup method called");
		
		
		
	}
}
