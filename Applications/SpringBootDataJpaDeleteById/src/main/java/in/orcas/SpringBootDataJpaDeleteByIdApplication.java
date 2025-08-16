package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.StudentService;

@SpringBootApplication
public class SpringBootDataJpaDeleteByIdApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBootDataJpaDeleteByIdApplication.class, args);

        StudentService service = ctx.getBean(StudentService.class);

        // Deleting a student by ID
        service.deleteStudentById(9L);
    }
}
