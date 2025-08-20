package in.orcas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.orcas.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // 1. Basic Finders
    Employee findByName(String name);
    List<Employee> findByCountry(String country);

    // 2. Conditional Filters
    List<Employee> findByCountryAndCompany(String country, String company);
    List<Employee> findBySalaryBetween(Double min, Double max);
    List<Employee> findByIdIn(List<Long> ids);

    // 3. String Search
    List<Employee> findByNameContainingIgnoreCase(String keyword);
    List<Employee> findByNameStartingWith(String prefix);
    List<Employee> findByNameEndingWith(String suffix);

    // 4. Sorting
    List<Employee> findByCountryOrderBySalaryDesc(String country);

    // 5. Limiting Results
    Employee findTopByOrderBySalaryDesc();
    List<Employee> findTop5ByCountryOrderBySalaryDesc(String country);

    // 6. Count & Exists
    long countByCountry(String country);
    boolean existsByName(String name);

    // 7. Distinct
    List<Employee> findDistinctByCompany(String company);
}
