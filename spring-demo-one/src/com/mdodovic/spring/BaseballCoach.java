package com.mdodovic.spring;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mintues on batting practice";
	}	
}
