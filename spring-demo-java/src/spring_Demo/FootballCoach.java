package spring_Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Do dribbling practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
