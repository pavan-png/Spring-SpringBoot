package in.orcas.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.orcas.bean.WishMessageGenerator;
import in.orcas.config.AppConfig;

public class TestApp {
    public static void main(String[] args) {
        // Load Spring Container
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get Bean
        WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);

        // Call Business Logic
        String message = generator.greetMessage("pavan");
        System.out.println(message);
    }
}
