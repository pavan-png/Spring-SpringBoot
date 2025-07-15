package in.orcas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.orcas.dao.EmployeeDao;
import in.orcas.model.Employee;

@SpringBootApplication
public class SpringbootJdbcApp implements CommandLineRunner {

    @Autowired
    private EmployeeDao dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJdbcApp.class, args);
    }

    @Override
    public void run(String... args) {
        Employee e = new Employee();
        e.setId(102);
        e.setName("pavan");
        e.setEmail("pavan@gmail.com");

        String status = dao.save(e);
        System.out.println("Stored Procedure Result: " + status);
    }
}
