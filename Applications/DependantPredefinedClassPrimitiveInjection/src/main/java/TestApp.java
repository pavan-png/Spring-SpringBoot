import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		WishMessageGenerator wmg = context.getBean("wmg", WishMessageGenerator.class);
		wmg.printMessage();
	
		
		
		
	}

}
