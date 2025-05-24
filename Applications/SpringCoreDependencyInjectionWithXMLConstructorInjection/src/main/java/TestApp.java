import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		WishMessageGenerator wmg1 = context.getBean("wmg",WishMessageGenerator.class );
		String result = wmg1.generateWishMessage("pavan");
		System.out.println(result);
	
		
		
		
	}

}
