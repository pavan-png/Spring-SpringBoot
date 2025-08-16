package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.StudentService;

@SpringBootApplication
public class SpringBootDataJpaFindAllApplication {

	public static void main(String[] args) {
	ApplicationContext context	= SpringApplication.run(SpringBootDataJpaFindAllApplication.class, args);
	StudentService service= context.getBean(StudentService.class);
	service.fetchAllStudents();
	
	}

}
