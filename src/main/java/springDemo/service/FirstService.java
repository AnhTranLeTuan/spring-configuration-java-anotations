package springDemo.service;

import org.springframework.stereotype.Component;

@Component
public class FirstService implements AdditionalService {

	@Override
	public String additionalService() {
		return "First service";
	}

}
