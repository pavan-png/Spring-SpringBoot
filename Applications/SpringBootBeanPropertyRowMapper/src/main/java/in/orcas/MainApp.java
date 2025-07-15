package in.orcas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.orcas.dao.EmployeeDao;
import in.orcas.model.Employee;

@SpringBootApplication
public class MainApp implements CommandLineRunner {

    @Autowired
    private EmployeeDao employeeDao;

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Employee> list = employeeDao.getAllEmployees();
        for (Employee e : list) {
            System.out.println(e.getId() + " | " + e.getName() + " | " + e.getEmail() +
                               " | " + e.getSalary() + " | " + e.getDepartment());
        }
    }
}
