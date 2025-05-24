package in.orcas.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.bean.ContactsInfo;
public class TestApp {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		 
		 ContactsInfo info = context.getBean("contactsInfo",ContactsInfo.class);
		 System.out.println(info);
	}

}
