package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	public static void main(String[] args) {
		var context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		var theCoach = context.getBean("myCoach",Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}
}
