package springdemo;

public class MyApp {

	public static void main(final String[] args) {

		// create the object
		final Coach theCoach = new TrackCoach();

		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
