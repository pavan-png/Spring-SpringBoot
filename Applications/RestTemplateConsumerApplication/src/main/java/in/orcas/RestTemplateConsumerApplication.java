package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateConsumerApplication.class, args);

		System.out.println("✅ Student Consumer App Started...");
	}

	// Create RestTemplate bean
	@Bean
	public RestTemplate createRestTemplate() {
	    return new RestTemplate();
	}
}
