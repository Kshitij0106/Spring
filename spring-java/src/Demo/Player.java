package Demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Player {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

		Coach footCoach = context.getBean("footballCoach", Coach.class);
		
		System.out.println(footCoach.getDailyWorkout());
		
		System.out.println(footCoach.getDailyFortune());
		
		GymCoach gymCoach = context.getBean("gymCoach", GymCoach.class);
		
		System.out.println(gymCoach.getDailyWorkout());
		
		System.out.println(gymCoach.getDailyFortune());
		
		System.out.println("Name: "+gymCoach.getGymName());
		
		System.out.println("Location: "+gymCoach.getGymLocation());

		context.close();
	}

}
