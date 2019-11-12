package ezcloud.technologies.services.department.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ezcloud.technologies.services.department.model.Employee;

@FeignClient(name = "employee-service",
fallbackFactory = EmployeeFallbackFactory.class)
public interface EmployeeClient {

	@GetMapping("/department/{departmentId}")
	List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
	
}
