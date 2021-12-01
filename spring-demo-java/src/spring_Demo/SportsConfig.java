package spring_Demo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("spring_Demo") // scans and creates bean automatically of all the class that supports @component
@PropertySource("classpath:sport.properties")
public class SportsConfig {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach gymCoach() {
		return new GymCoach(sadFortuneService());
	}

}
