package springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import springDemo.service.AdditionalService;

// Mark the "FootballCoach" class as the bean by @Component
/* As there is no bean ID specified, the bean ID will be the class name with 
the first letter lower case, which is footballCoach. */
@Component
@Scope("prototype")
public class FootballCoach implements Coach {
	
	// Field injection
	/* @Autowired can be used alone without @Qualifier only if there is one unique bean. 
	   If there are more than one bean of the same type available, @Qualifier will be needed to distinguish. */
	@Autowired
	@Qualifier("firstService")
	AdditionalService service;
	
	// Constructor injection
	/* @Autowired can be used alone without @Qualifier only if there is one unique bean. 
	   If there are more than one bean of the same type available, @Qualifier will be needed to distinguish. */

	
	@Override
	public String getExercises() {
		return "Football Exercises";
	}
	  

	@Override
	public String getAdditionalInformation() {
		
		return   service.additionalService();
	}
	
}
