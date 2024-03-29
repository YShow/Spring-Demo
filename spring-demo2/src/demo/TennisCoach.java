package demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	// Exemplo de field injection
	// @Autowired
	private FortuneService fortuneService;

	@PostConstruct
	private void fazStart() {
		System.out.println("passou pelo fazStart()");
	}
	@PreDestroy
	private void limpaClose() {
		System.out.println("passou pelo limpaClose()");
	}
	
	public TennisCoach() {
		super();
		System.out.println(">> dentro do construtor default de tennisCoach");
	}

	// exemplo de setter injection
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println(">> TennisCoach: dentro do  setFortuneService() metodo");
	 * this.fortuneService = fortuneService; }
	 */
	// Exemplo de Constructor injection
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") final FortuneService fortuneService) {
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
