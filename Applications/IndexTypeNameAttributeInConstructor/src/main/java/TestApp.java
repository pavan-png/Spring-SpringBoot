import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = context.getBean("student1", Student.class);
		s1.display();

		Student s2 = context.getBean("student2", Student.class);
		s2.display();

	
		
		
		
	}

}
