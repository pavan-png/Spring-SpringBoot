package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.DatabaseService;

@SpringBootApplication
public class SpringBootDependencyInjectionUsingYmlApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDependencyInjectionUsingYmlApplication.class, args);
		DatabaseService service = context.getBean(DatabaseService.class);
		service.printDbInfo();
	}

}
