package Demo;

public class GymCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public GymCoach() {
	}
	
//	//constructor-injection
//	public GymCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Do 100 push-ups and 50 pull-ups";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// setter injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void startupStuff() {
		System.out.println("init method");
	}
	
	public void cleanUpStuff() {
		System.out.println("destroy method");
	}

}
