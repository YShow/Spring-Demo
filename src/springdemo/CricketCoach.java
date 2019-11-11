package springdemo;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Dentro do setter");
		this.fortuneService = fortuneService;
	}

	public CricketCoach() {
		System.out.println("Dentro do construtor no-arg");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pratice Fast bowling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
