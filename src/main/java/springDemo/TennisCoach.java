package springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import springDemo.service.AdditionalService;

@Component
public class TennisCoach implements Coach {
	
	private AdditionalService service;
	// Inject data from the properties file
	@Value("${DOB}")
	private String dob;
	@Value("${Country}")
	private String country;
	
	public TennisCoach(@Qualifier("firstService") AdditionalService service) {
		this.service = service;
	}
	@Override
	public String getAdditionalInformation() {
		return service.additionalService();
	}

	@Override
	public String getExercises() {
		return "Tennis Exercises";
	}
	
	public String coachPersonalInformation() {
		return "DOB: " + dob + "\n"
			+  "Country: " + country;
	}
	
	// 
	@PostConstruct
	public void initFunction() {
		System.out.println("Tasks during bean initialization");
	}
	
	@PreDestroy
	public void destroyFunction() {
		System.out.println("Tasks during bean destruction");
	}
	
	public void setService(AdditionalService service) {
		this.service = service;
	}   
	

}
