package in.orcas.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.orcas.entity.mysql.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}