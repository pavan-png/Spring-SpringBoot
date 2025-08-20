package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.EmployeeService;

@SpringBootApplication
public class SpringBootDataJpaCustomMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDataJpaCustomMethodsApplication.class, args);
		EmployeeService service = context.getBean(EmployeeService.class);
		service.testRepositoryMethods();
		
		
	}

}
