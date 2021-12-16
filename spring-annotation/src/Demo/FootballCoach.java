package Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FootballCoach implements Coach {
	
	
	// field injection
//	@Autowired  // searches by type
//	@Qualifier("playerFortuneService")  // searches by name
	private FortuneService fortuneService;
	
	public FootballCoach() {
	}
	
	// constructor injection
//	@Autowired
//	public FootballCoach(@Qualifier("playerFortuneService")FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Do dribbling practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// setter injection
	@Autowired
	@Qualifier("playerFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
