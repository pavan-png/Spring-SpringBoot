package in.orcas.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.bean.Car;
public class TestApp {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		 
		 Car info = context.getBean("car1",Car.class);
		 System.out.println(info);
	}

}
