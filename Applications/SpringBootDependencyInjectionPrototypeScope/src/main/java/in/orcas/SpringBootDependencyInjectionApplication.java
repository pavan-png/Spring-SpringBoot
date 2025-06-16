package in.orcas;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.orcas.service.WishMessageGenerator;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication {

    @Bean
    public LocalDateTime date() {
        System.out.println("🔹 Creating LocalDateTime bean...");
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        System.out.println("🔸 Starting Spring Boot application...");
        ConfigurableApplicationContext ctx =
            SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);

        // Because WishMessageGenerator is prototype-scoped, each getBean() returns a new instance:
        WishMessageGenerator wmg1 = ctx.getBean("wmg", WishMessageGenerator.class);
        System.out.println("→ First bean instance hash: " + wmg1.hashCode());
        System.out.println("   " + wmg1.generateWishMessage("pavan"));

        WishMessageGenerator wmg2 = ctx.getBean("wmg", WishMessageGenerator.class);
        System.out.println("→ Second bean instance hash: " + wmg2.hashCode());
        System.out.println("   " + wmg2.generateWishMessage("kalyan"));

        ctx.close();
        System.out.println("🔸 Application context closed.");
    }
}
