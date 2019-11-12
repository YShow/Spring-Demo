package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		var context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		var theCoach = context.getBean("myCoach",Coach.class);
		
		var alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n Apontando para o mesmo objeto: " + result);
		
		System.out.println("\n Localizacao da memoria  para theCoach " + theCoach);
		
		System.out.println("\n Localizacao da memoria  para alphaCoach " + alphaCoach);
		
		context.close();
	}
}
