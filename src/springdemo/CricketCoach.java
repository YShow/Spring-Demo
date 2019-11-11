package springdemo;

public class CricketCoach implements Coach {


	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Dentro do setter e-mail");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Dentro do setter team");
		this.team = team;
	}

	private String team;
	private FortuneService fortuneService;
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Dentro do setter fortune");
		this.fortuneService = fortuneService;
	}

	public CricketCoach() {
		System.out.println("Dentro do construtor no-arg");
	}

	@Override
	public String getDailyWorkout() {
	
		return "Pratice Fast bowling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
