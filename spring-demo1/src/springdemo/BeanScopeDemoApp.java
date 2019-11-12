package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(final String[] args) {
		final var context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		final var theCoach = context.getBean("myCoach", Coach.class);

		final var alphaCoach = context.getBean("myCoach", Coach.class);

		final boolean result = theCoach == alphaCoach;

		System.out.println("\n Apontando para o mesmo objeto: " + result);

		System.out.println("\n Localizacao da memoria  para theCoach " + theCoach);

		System.out.println("\n Localizacao da memoria  para alphaCoach " + alphaCoach);

		context.close();
	}
}
