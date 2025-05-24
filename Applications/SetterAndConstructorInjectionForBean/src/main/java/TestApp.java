import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person1 = context.getBean("person1", Person.class);
		System.out.println(person1);
		Person person2 = context.getBean("person2", Person.class);
		System.out.println(person2);
		
		
	
		
		
		
	}

}
