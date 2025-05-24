package in.orcas.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.bean.PersonInfo;
public class TestApp {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		 
		 PersonInfo info = context.getBean("person",PersonInfo.class);
		 System.out.println(info);
	}

}
