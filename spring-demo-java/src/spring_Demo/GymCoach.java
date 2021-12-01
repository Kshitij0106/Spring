package spring_Demo;

import org.springframework.beans.factory.annotation.Value;

public class GymCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.excercise}")
	private String excercise;
	
	@Value("${foo.reps}")
	private int reps;
	
	public GymCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 100 push-ups and 50 squats";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getExcercise() {
		return excercise;
	}

	public int getReps() {
		return reps;
	}
	
}
