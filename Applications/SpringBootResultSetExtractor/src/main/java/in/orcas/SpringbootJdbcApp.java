package in.orcas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.orcas.model.Employee;
import in.orcas.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootJdbcApp implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJdbcApp.class, args);
    }

    @Override
    public void run(String... args) {
        List<Employee> employees = repository.getAllEmployees();
        for (Employee e : employees) {
            System.out.println(e.getId() + " | " + e.getName() + " | " + e.getEmail() + " | " + e.getSalary() + " | " + e.getDepartment());
        }
    }
}
