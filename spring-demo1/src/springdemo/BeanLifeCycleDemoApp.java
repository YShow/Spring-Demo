package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	public static void main(final String[] args) {
		final var context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		try (context) {
			final var theCoach = context.getBean("myCoach", Coach.class);

			System.out.println(theCoach.getDailyWorkout());

		}
	}
}
