package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.orcas.service.StudentService;

@SpringBootApplication
public class SpringBootDataJpaFindAllByIdApplication {

	public static void main(String[] args) {
		// Start Spring Boot context
        ConfigurableApplicationContext context =SpringApplication.run(SpringBootDataJpaFindAllByIdApplication.class, args);
	
	 StudentService service = context.getBean(StudentService.class);
	 service.getStudentsByIds();
	}

}
