package in.orcas.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.dao.EmployeeDao;

public class App {
    public static void main(String[] args) {
        // Load the Spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the DAO bean from the context
        EmployeeDao dao = (EmployeeDao) context.getBean("empDao");

        // Call the method to fetch employee name by ID
        int empId = 106;  
        String name = dao.getEmployeeNameById(empId);

        // Print the result
        System.out.println("Employee name for ID " + empId + " is: " + name);
    }
}