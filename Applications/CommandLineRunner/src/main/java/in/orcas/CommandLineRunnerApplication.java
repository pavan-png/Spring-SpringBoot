package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerApplication {

	public static void main(String[] args) {
		 System.out.println("Main method started...");
	     SpringApplication.run(CommandLineRunnerApplication.class, args);
	     System.out.println("Main method ended...");
	}

}
