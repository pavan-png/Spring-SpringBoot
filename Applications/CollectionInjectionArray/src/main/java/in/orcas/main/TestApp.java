package in.orcas.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.bean.MarksInfo;
public class TestApp {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		 MarksInfo info = context.getBean("marksInfo",MarksInfo.class);
		 info.display();
	}

}
