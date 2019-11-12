package springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(final FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {

		return "Hoje é " + fortuneService.getFortune();
	}

	public void fazMeuStart() {
		System.out.println("Dentro do start de track coach");
	}

	public void limpaStart() {
		System.out.println("Dentro do limpa start de track coach");
	}

}
