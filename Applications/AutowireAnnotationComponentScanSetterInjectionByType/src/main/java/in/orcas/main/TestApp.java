package in.orcas.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.bean.Flipkart;

public class TestApp {
    public static void main(String[] args) {

        // Step 1: Load the Spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Step 2: Get the Flipkart bean (target)
        Flipkart flipkart = context.getBean("fpkt", Flipkart.class);

        // Step 3: Prepare test inputs
        String[] items = {"Shoes", "Shirt", "Watch"};
        float[] prices = {1500.0f, 800.0f, 1200.0f};

        // Step 4: Invoke business logic
        String result = flipkart.shopping(items, prices);

        // Step 5: Print result
        System.out.println(result);
    }
}

