package ezcloud.technologies.services.organization.model;

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
	private String name;
	private List<Employee> employees = new ArrayList<>();


	public Department(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
