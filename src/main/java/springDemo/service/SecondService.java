package springDemo.service;

import org.springframework.stereotype.Component;

@Component
public class SecondService implements AdditionalService {

	@Override
	public String additionalService() {
		return "Second service";
	}

}
