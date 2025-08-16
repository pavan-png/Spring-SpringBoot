package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.StudentService;

@SpringBootApplication
public class SpringBootDataJpaFindByIdApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDataJpaFindByIdApplication.class, args);

        StudentService service = context.getBean(StudentService.class);

        // Example: Find student with ID 101
        service.getStudentById(101L);
	
	}

}
