package in.orcas.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.bean.College;
public class TestApp {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		 College info = context.getBean("collegeBean",College.class);

		 System.out.println(info);
	}

}
