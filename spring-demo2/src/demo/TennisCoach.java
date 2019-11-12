package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	//Exemplo de field injection
	//@Autowired
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		super();
		System.out.println(">> dentro do construtor default de tennisCoach");
	}
	//exemplo de setter injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: dentro do  setFortuneService() metodo");
		this.fortuneService = fortuneService;
	}
	*/
	//Exemplo de Constructor injection
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Pratice you backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
