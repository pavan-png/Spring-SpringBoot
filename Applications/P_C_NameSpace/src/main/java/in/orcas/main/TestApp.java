package in.orcas.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.bean.Employee;


public class TestApp {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       Employee emp= (Employee) context.getBean("employee");
       System.out.println(emp);
    }
}
