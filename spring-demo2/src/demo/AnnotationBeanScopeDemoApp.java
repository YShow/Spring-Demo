package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {

		var context = new ClassPathXmlApplicationContext("applicationContext.xml");
		try (context) {
			var theCoach = context.getBean("tennisCoach", Coach.class);

			var alphaCoach = context.getBean("tennisCoach", Coach.class);

			boolean result = (theCoach == alphaCoach);

			System.out.println("\n Apontando pro mesmo obejto " + result);

			System.out.println("\n Localização na memoria para theCoach " + theCoach);

			System.out.println("\n Localização na memoria para alphaCoach " + alphaCoach);
			
		}

	}
}
