package personal.projects.ems_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.projects.ems_backend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long > {
}
