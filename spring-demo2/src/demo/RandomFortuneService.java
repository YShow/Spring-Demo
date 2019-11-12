package demo;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	
	private List<String> data = List.of("sorte","recompensa","azar");
	
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.size());
	
		return data.get(index);
	}

}
