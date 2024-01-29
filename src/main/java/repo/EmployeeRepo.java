package repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	void deleteEmployeeById(long id);
	Optional<Employee>findEmployeeById(long id);
}
