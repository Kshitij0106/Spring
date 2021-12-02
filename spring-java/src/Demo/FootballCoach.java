package Demo;

//import org.springframework.stereotype.Component;

//@Component
public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do shooting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
