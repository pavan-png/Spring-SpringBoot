package in.orcas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.orcas.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Dynamic Projection
    <T> List<T> findByCountry(String country, Class<T> type);
}
