package com.sood.vaibhav.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
private FortuneInterface fortuneInterface;
private String emailAddress;
private String team;
public void setFortuneInterface(FortuneInterface fortuneInterface) {
	this.fortuneInterface = fortuneInterface;
}
@Autowired
public TennisCoach(FortuneInterface theFortuneInterface) {

	fortuneInterface = theFortuneInterface;
}
	@Override
	public String getDailyWorkout() {
	//	System.out.println("this is your coach address"+ getEmailAddress());
		return "Practice your backhand volley"  ;
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneInterface.getFortune();
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}


}
