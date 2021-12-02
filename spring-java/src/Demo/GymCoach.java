package Demo;

import org.springframework.beans.factory.annotation.Value;

public class GymCoach implements Coach {
	
	@Value("${foo.gymName}")
	private String gymName;
	
	@Value("${foo.gymLocation}")
	private String gymLocation;
	
	private FortuneService fortuneService;
	
	public GymCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 100 burpees and 250 squats";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getGymName() {
		return gymName;
	}

	public String getGymLocation() {
		return gymLocation;
	}

}
