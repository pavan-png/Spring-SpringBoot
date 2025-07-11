package in.orcas.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.dao.EmployeeDao;
import in.orcas.model.Employee;

public class App {
    public static void main(String[] args) {
        // Load Spring context from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get EmployeeDao bean
        EmployeeDao dao = (EmployeeDao) context.getBean("empDao");

        // Create a new Employee object
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("pavan");
        emp.setEmail("mohanpavankalyankalyan52@gmail.com");
        emp.setSalary(200000.00);
        emp.setDepartment("Development");

        // Save the employee
        int result = dao.save(emp);

        // Print result
        if (result > 0) {
            System.out.println("Employee inserted successfully.");
        } else {
            System.out.println("Insertion failed.");
        }
    }
}
