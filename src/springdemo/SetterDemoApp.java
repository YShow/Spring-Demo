package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		
		var context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		var theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());

		context.close();
	}
}
