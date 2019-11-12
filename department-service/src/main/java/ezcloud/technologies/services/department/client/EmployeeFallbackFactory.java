package ezcloud.technologies.services.department.client;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class EmployeeFallbackFactory  implements FallbackFactory<EmployeeClient> {

	@Override
	public EmployeeClient create(Throwable cause) {
		return new EmployeeFallBack(cause);
	}

}
