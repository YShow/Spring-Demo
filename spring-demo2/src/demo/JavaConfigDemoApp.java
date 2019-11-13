package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(final String[] args) {
		final var context = new AnnotationConfigApplicationContext(SportConfig.class);
		try (context) {
			final var theCoach = context.getBean("tennisCoach", Coach.class);

			System.out.println(theCoach.getDailyWorkout());

			System.out.println(theCoach.getDailyFortune());
		}
	}

}
