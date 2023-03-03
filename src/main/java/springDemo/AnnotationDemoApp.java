package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("configurationFile.xml");
		
		Coach coach1 = container.getBean("footballCoach", Coach.class);
		Coach coach2 = container.getBean("soccer", Coach.class);
		Coach coach3 = container.getBean("footballCoach", Coach.class);
		// The object  in "coach4" variable contain data retrieved from the properties file "coachInformation.properties"
		// The object also have custom code that will be executed during the bean initialization and destruction
		TennisCoach coach4 = container.getBean("tennisCoach", TennisCoach.class);
				
		System.out.println(coach1.getAdditionalInformation());
		System.out.println(coach2.getAdditionalInformation() + "\n");
		
		// Check the address of "coach1" and "coach3" to verify they are different from each other, indicating prototype scope
		System.out.println(coach1);
		System.out.println(coach3 + "\n");
		
		System.out.println(coach4.coachPersonalInformation());
		
		container.close();

	}
}
