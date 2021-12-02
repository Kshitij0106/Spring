package Demo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	private String team,sponsor;
	
	public FootballCoach() {
	}
	
//	// constructor injection
//	public FootballCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Do Dribbling practice";
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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

}
