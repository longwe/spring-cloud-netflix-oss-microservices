package ezcloud.technologies.services.department.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Department {

	private Long id;
	private Long organizationId;
	private String name;
	private List<Employee> employees = new ArrayList<>();

	

	public Department(Long organizationId, String name) {
		super();
		this.organizationId = organizationId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", organizationId=" + organizationId + ", name=" + name + "]";
	}

}
