package in.orcas.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import in.orcas.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public void demoKeywords() {
        // 1. Basic Finders
        System.out.println("Find by name: " + repo.findByName("John"));
        System.out.println("Find by country: " + repo.findByCountry("India"));

        // 2. Conditional Filters
        System.out.println("Find by Country AND Company: " + repo.findByCountryAndCompany("India", "Google"));
        System.out.println("Find by Salary Between 40000 and 80000: " + repo.findBySalaryBetween(40000.0, 80000.0));
        System.out.println("Find by IDs in list: " + repo.findByIdIn(Arrays.asList(1L, 2L, 3L)));

        // 3. String Search
        System.out.println("Name contains 'an': " + repo.findByNameContainingIgnoreCase("an"));
        System.out.println("Name starting with 'A': " + repo.findByNameStartingWith("A"));
        System.out.println("Name ending with 'sh': " + repo.findByNameEndingWith("sh"));

        // 4. Sorting
        System.out.println("Employees in USA sorted by salary DESC: " + repo.findByCountryOrderBySalaryDesc("USA"));

        // 5. Limiting Results
        System.out.println("Top paid employee: " + repo.findTopByOrderBySalaryDesc());
        System.out.println("Top 5 employees in India by salary: " + repo.findTop5ByCountryOrderBySalaryDesc("India"));

        // 6. Count & Exists
        System.out.println("Count employees in India: " + repo.countByCountry("India"));
        System.out.println("Does employee named 'Alice' exist? " + repo.existsByName("Alice"));

        // 7. Distinct
        System.out.println("Distinct employees in Microsoft: " + repo.findDistinctByCompany("Microsoft"));
    }
}
