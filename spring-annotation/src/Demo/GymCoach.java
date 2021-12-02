package Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {
	
	// field injection
//	@Autowired
//	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public GymCoach() {
	}
	
	// constructor injection
	@Autowired
	public GymCoach(@Qualifier("databaseFortuneService")FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 100 sit-ups and 100 lunges";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// setter injection
//	@Autowired
//	@Qualifier("randomFortuneService")
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

}
