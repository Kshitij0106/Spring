package spring_Demo;

import org.springframework.stereotype.Component;

@Component
public class PlayerFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Go have fun";
	}

}
