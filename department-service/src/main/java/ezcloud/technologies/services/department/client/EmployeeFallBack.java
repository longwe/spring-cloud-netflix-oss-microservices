package ezcloud.technologies.services.department.client;

import java.util.ArrayList;
import java.util.List;

import ezcloud.technologies.services.department.model.Employee;
import feign.FeignException;

public class EmployeeFallBack implements EmployeeClient {

	public EmployeeFallBack(Throwable cause) {
		super();
		this.cause = cause;
	}

	private final Throwable cause;
	
	@Override
	public List<Employee> findByDepartment(Long departmentId) {
		if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            // Treat the HTTP 404 status
        }

        return new ArrayList<>();
	}

}
