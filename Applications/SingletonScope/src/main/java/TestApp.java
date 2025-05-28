import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		WishMessageGenerator wmg1 = context.getBean("wmg",WishMessageGenerator.class );
		String result = wmg1.generateWishMessage("pavan");
		System.out.println(wmg1.hashCode());
		
		WishMessageGenerator wmg2 = context.getBean("wmg",WishMessageGenerator.class );
		String result1 = wmg2.generateWishMessage("pavan");
		System.out.println(wmg2.hashCode());
		
		
	}

}
