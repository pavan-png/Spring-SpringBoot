package in.orcas.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.dao.EmployeeDao;
import in.orcas.model.Employee;

public class App {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        EmployeeDao dao = (EmployeeDao) context.getBean("empDao");

	        Employee emp = new Employee();
	        emp.setId(105);
	        emp.setName("vslakshmi");
	        dao.save(emp);

	        List<Employee> list = dao.getAll();
	        for (Employee e : list) {
	            System.out.println(e.getId() + " - " + e.getName());
	        }

	}

}
