package Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Player {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach footballCoach = context.getBean("footballCoach", Coach.class);
		
		System.out.println(footballCoach.getDailyWorkout());

		System.out.println(footballCoach.getDailyFortune());
		
		Coach gymCoach = context.getBean("gymCoach", Coach.class);
		
		System.out.println(gymCoach.getDailyWorkout());
		
		System.out.println(gymCoach.getDailyFortune());
		
		// -------------- scope of beans ------------------
//		Coach footCoach = context.getBean("footballCoach", Coach.class);
//		
//		System.out.println(footCoach);
//		
//		System.out.println(footballCoach);
		
		context.close();

	}

}
