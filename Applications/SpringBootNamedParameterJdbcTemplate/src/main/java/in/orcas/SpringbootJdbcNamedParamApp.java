package in.orcas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.orcas.dao.EmployeeDao;
import in.orcas.model.Employee;

@SpringBootApplication
public class SpringbootJdbcNamedParamApp implements CommandLineRunner {

    @Autowired
    private EmployeeDao dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJdbcNamedParamApp.class, args);
    }

    @Override
    public void run(String... args) {
        Employee e = new Employee();
        e.setId(103);
        e.setName("srinivas");
        e.setEmail("ch.srinivasam@gmail.com");
        e.setSalary(2000000.00);
        e.setDepartment("CEO");

        int result = dao.save(e);
        System.out.println("Rows inserted: " + result);

        List<Employee> employees = dao.getAll();
        for (Employee emp : employees) {
            System.out.println(emp.getId() + " - " + emp.getName());
        }
    }

}
