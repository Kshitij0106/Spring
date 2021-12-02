package Demo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("Demo") // scans and creates bean automatically of all the class that supports @component
public class SportsConfig {
	
	@Bean
	public FortuneService playerFortuneService() {
		return new PlayerFortuneService();
	}
	
	@Bean
	public Coach footballCoach() {
		return new FootballCoach(playerFortuneService());
	}
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach gymCoach() {
		return new GymCoach(sadFortuneService());
	}

}
