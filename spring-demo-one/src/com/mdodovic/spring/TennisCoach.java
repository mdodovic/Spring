package com.mdodovic.spring;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkout() {
		return "Do cardio every day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
