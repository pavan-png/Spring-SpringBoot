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
        Employee emp = new Employee();
        emp.setId(105);
        emp.setName("Anand");
        emp.setEmail("anandsaiavvaru@gmail.com");
        emp.setSalary(200000);
        emp.setDepartment("Development");

        int result = employeeDao.save(emp);
        if (result > 0) {
            System.out.println("Employee inserted successfully.");
        } else {
            System.out.println("Insert failed.");
        }

        List<Employee> employeeList = employeeDao.getAll();
        for (Employee e : employeeList) {
            System.out.println(e.getId() + " | " + e.getName() + " | " +
                               e.getEmail() + " | " + e.getSalary() + " | " +
                               e.getDepartment());
        }
    }
}
