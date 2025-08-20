package in.orcas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.orcas.model.Employee;
import in.orcas.projection.EmployeeView;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Static Projection → fetch only name & company for employees in a given country
    List<EmployeeView> findByCountry(String country);
}
