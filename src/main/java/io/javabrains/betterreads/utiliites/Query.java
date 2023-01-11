package io.javabrains.betterreads.utiliites;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.javabrains.betterreads.model.Employee;
import io.javabrains.betterreads.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private EmployeeService employeeService;

	public Optional<Employee> getEmployee(String id) {
		return this.employeeService.getEmployee(id);
	}
}
