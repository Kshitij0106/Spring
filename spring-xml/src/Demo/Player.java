package Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Player {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach fCoach = context.getBean("footballCoach", Coach.class);

		System.out.println(fCoach.getDailyWorkout());

		System.out.println(fCoach.getDailyFortune());

		Coach gymCoach = context.getBean("gymCoach", Coach.class);

		System.out.println(gymCoach.getDailyWorkout());

		System.out.println(gymCoach.getDailyFortune());

		// ----------------- Scope of Beans -------------------------

//		Coach runCoach = context.getBean("runningCoach", Coach.class);
//		
//		Coach runCoach1 = context.getBean("runningCoach", Coach.class);
//		
//		System.out.println(runCoach);
//		System.out.println(runCoach1);
		
		// ----------------- injecting literal values -------------------------
//		FootballCoach footballCoach = context.getBean("footballCoach", FootballCoach.class);
//		System.out.println(footballCoach.getTeam());
//		System.out.println(footballCoach.getSponsor());

		context.close();
	}

}
