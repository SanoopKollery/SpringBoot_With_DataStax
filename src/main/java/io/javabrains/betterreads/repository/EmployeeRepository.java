package io.javabrains.betterreads.repository;


import io.javabrains.betterreads.model.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@EnableCassandraRepositories
public interface EmployeeRepository extends CassandraRepository<Employee,String> {
}
