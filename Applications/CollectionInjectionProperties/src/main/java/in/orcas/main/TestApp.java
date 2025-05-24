package in.orcas.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.bean.UniversityInfo;
public class TestApp {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		 
		 UniversityInfo info = context.getBean("universityBean",UniversityInfo.class);
		 System.out.println(info);
	}

}
