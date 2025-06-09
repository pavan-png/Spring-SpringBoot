package in.orcas.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.orcas.config.MainConfig;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String msg = context.getBean(String.class);
        System.out.println(msg); // Output: Hello from AppConfigA
    }
}
