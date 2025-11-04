package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunnerApplication {

	public static void main(String[] args) {
		 System.out.println("Main method started...");
		SpringApplication.run(ApplicationRunnerApplication.class, args);
		 System.out.println("Main method ended...");
	}

}
