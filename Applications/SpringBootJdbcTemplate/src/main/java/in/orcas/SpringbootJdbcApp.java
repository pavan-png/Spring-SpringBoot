package in.orcas;

import java.util.List;

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
        Employee e1 = new Employee();
        e1.setId(102);
        e1.setName("Devadatta");
        e1.setEmail("devadatta017@gmail.com");
        e1.setSalary(200000);
        e1.setDepartment("Development");
        dao.save(e1);

        List<Employee> list = dao.getAll();
        for (Employee e : list) {
            System.out.println(e.getId() + " - " + e.getName());
        }
    }
}
