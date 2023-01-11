package io.javabrains.betterreads.service;


import io.javabrains.betterreads.exception.InputArgumentException;
import io.javabrains.betterreads.model.ApiResponse;
import io.javabrains.betterreads.model.Employee;
import io.javabrains.betterreads.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository ;


    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    public Optional<Employee> getEmployee(String id) {
        return this.employeeRepository.findById(id);
    }


    public Employee newEmployee(String fname, String lname,int age,String joinDate,
                                float salary) {
        Employee employee = new Employee();
        employee.setId(UUID.randomUUID().toString());
        employee.setFname(fname);
        employee.setLname(lname);
        employee.setJoindate(joinDate);
        employee.setAge(age);
        employee.setSalary(salary);
        return this.employeeRepository.save(employee);
    }

    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    public ApiResponse deleteEmployee(String id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (!employee.isPresent())
           return  new ApiResponse("Employee not found !!");
         this.employeeRepository.deleteById(id);
         return  new ApiResponse("Employee deleted successfully");
    }

    public Employee updateEmployee(String id, String fname, String lname,int age,String joinDate,
                                   float salary)
    {
        Employee oldEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new InputArgumentException("Employee Id is not valid !!"));
        oldEmployee.setFname(fname);
        oldEmployee.setLname(lname);
        oldEmployee.setAge(age);
        oldEmployee.setJoindate(joinDate);
        oldEmployee.setSalary(salary);
        return employeeRepository.save(oldEmployee);

    }
}
