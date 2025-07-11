package in.orcas.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.dao.EmployeeDao;
import in.orcas.model.Employee;

public class App {
	public static void main(String[] args) {
	    // Load Spring context from XML file
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	    // Get the DAO bean from Spring container
	    EmployeeDao dao = (EmployeeDao) context.getBean("empDao");

	    // Create a new employee and insert into DB
	    Employee emp = new Employee();
	    emp.setId(106);
	    emp.setName("Anand");
	    dao.save(emp);

	    // Fetch and print all employees using query()
	    System.out.println("All Employees:");
	    List<Employee> list = dao.getAll();
	    for (Employee e : list) {
	        System.out.println(e.getId() + " - " + e.getName());
	    }

	    // Fetch a single employee by ID using queryForObject()
	    System.out.println("\nFetching employee with ID 105:");
	    Employee emp106 = dao.getById(106);
	    System.out.println(emp106.getId() + " - " + emp106.getName());
	}


}
