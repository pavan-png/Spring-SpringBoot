package in.orcas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.orcas.dao.EmployeeDao;
import in.orcas.model.Employee;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private EmployeeDao employeeDao;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Create and insert new Employee
        Employee emp = new Employee();
        emp.setId(104);
        emp.setName("lakshmi");
        emp.setEmail("vslakshmi@gmail.com");
        emp.setSalary(200000);
        emp.setDepartment("Clothing");

        int result = employeeDao.save(emp);

        if (result > 0) {
            System.out.println("Insert successful.");
        } else {
            System.out.println("Insert failed.");
        }

        // Fetch all employees and print
        List<Employee> employees = employeeDao.getAll();

        for (Employee e : employees) {
            System.out.println(e.getId() + " | " +
                               e.getName() + " | " +
                               e.getEmail() + " | " +
                               e.getSalary() + " | " +
                               e.getDepartment());
        }
    }
}
