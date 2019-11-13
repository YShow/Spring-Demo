package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(final String[] args) {
		final var context = new AnnotationConfigApplicationContext(SportConfig.class);
		try (context) {
			final var theCoach = context.getBean("swimCoach", SwimCoach.class);

			System.out.println(theCoach.getDailyWorkout());

			System.out.println(theCoach.getDailyFortune());

			System.out.println(theCoach.getEmail());

			System.out.println(theCoach.getTeam());
		}
	}

}
