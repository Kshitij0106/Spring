package Demo;

import org.springframework.stereotype.Component;

@Component
public class PlayerFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Work hard";
	}

}
