package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	private final FortuneService fortuneService;

	@Value("${prop.email}")
	private String email;
	@Value("${prop.team}")
	private String team;

	@Autowired
	public SwimCoach(final FortuneService happyFortuneService) {
		this.fortuneService = happyFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Swim now";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
