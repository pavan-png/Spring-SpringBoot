package in.orcas.service;

import org.springframework.stereotype.Service;

import in.orcas.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    // Method to test all repository methods
    public void testRepositoryMethods() {
        // 1. Basic Finder
        System.out.println("Employee by name: " + repo.findByName("John"));

        // 2. Conditional Filters
        System.out.println("Employees in India & Google: " +
                repo.findByCountryAndCompany("India", "Google"));
        System.out.println("Employees salary between 40000 and 80000: " +
                repo.findBySalaryBetween(40000.0, 80000.0));

        // 3. String Search
        System.out.println("Employees name contains 'an': " +
                repo.findByNameContainingIgnoreCase("an"));

        // 4. Sorting
        System.out.println("Employees in USA sorted by salary desc: " +
                repo.findByCountryOrderBySalaryDesc("USA"));

        // 5. Limiting
        System.out.println("Highest paid employee: " +
                repo.findTopByOrderBySalaryDesc());
        System.out.println("Top 3 in India by salary: " +
                repo.findTop3ByCountryOrderBySalaryDesc("India"));

        // 6. Count & Exists
        System.out.println("Total in Amazon: " + repo.countByCompany("Amazon"));
        System.out.println("Is there an employee named 'Alice'? " + repo.existsByName("Alice"));

        // 7. Distinct
        System.out.println("Distinct companies (Microsoft): " +
                repo.findDistinctByCompany("Microsoft"));
    }
}
