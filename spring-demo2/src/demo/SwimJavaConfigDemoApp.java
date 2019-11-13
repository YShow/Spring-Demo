package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(final String[] args) {
		final var context = new AnnotationConfigApplicationContext(SportConfig.class);
		try (context) {
			final var theCoach = context.getBean("swimCoach", Coach.class);

			System.out.println(theCoach.getDailyWorkout());

			System.out.println(theCoach.getDailyFortune());
		}
	}

}
