package in.orcas;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.orcas.service.WishMessageGenerator;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication {

    // Bean factory moved here
    @Bean
    public LocalDateTime date() {
        System.out.println("🔹 Creating LocalDateTime bean...");
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        System.out.println("🔸 Starting Spring Boot application...");
        ConfigurableApplicationContext ctx =
            SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);

        // fetch your service bean
        WishMessageGenerator wmg =
            ctx.getBean("wmg", WishMessageGenerator.class);

        // call business logic
        String msg = wmg.generateWishMessage("pavan");
        System.out.println("🔹 Wish Message: " + msg);

        // close context
        ctx.close();
        System.out.println("🔸 Application context closed.");
    }
}
