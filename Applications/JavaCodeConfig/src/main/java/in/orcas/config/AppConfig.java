package in.orcas.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.orcas.bean")
public class AppConfig {
	
	@Bean
	public LocalDateTime dateTime() {
		return LocalDateTime.now();
	}
}
