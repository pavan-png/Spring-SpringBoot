package in.orcas.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "in.orcas.bean")
@PropertySource("classpath:application.properties")
public class AppConfig {
	@Bean
	public Random random() {
		return new Random();
	}
}
