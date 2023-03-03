package springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import springDemo.service.AdditionalService;

// Mark the "SoccerCoach" as the bean by @Component
@Component("soccer")
public class SoccerCoach implements Coach {
	
	AdditionalService service;
	
	@Override
	public String getExercises() {
		return "Soccer Exercises";
	}

	@Override
	public String getAdditionalInformation() {
		
		return service.additionalService();
	}
	
	// Setter injection
	@Autowired
	@Qualifier("secondService")
	public void setService(AdditionalService service) {
		this.service = service;
	}
	
}
