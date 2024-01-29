package com.sirajsaleem.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirajsaleem.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	void deleteEmployeeById(long id);
	Optional<Employee>findEmployeeById(long id);
}
