package Demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private Random myRandom = new Random();
	
	private String fortunes[] = {"Play Hard, Work Hard",
					"Better Luck next time",
					"Do it better"};

	@Override
	public String getFortune() {
		int idx = myRandom.nextInt(fortunes.length);
		return fortunes[idx];
	}

}
