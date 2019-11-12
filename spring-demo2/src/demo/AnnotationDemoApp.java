package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(final String[] args) {
		final var context = new ClassPathXmlApplicationContext("applicationContext.xml");

		try (context) {
			final var theCoach = context.getBean("thatTennisCoach", Coach.class);

			System.out.println(theCoach.getDailyWorkout());
		}
	}

}
