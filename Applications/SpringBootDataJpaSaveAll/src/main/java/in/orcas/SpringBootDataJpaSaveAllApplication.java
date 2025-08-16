package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.StudentService;

@SpringBootApplication
public class SpringBootDataJpaSaveAllApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SpringBootDataJpaSaveAllApplication.class, args);
		
		StudentService service = ctx.getBean(StudentService.class);
		service.saveMultipleStudents();
	}

}
