package demo;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private final List<String> data = List.of("sorte", "recompensa", "azar");

	private final Random myRandom = new Random();

	@Override
	public String getFortune() {
		final int index = myRandom.nextInt(data.size());

		return data.get(index);
	}

}
