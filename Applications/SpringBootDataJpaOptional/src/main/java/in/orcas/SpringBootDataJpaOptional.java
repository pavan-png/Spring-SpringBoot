package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.StudentService;

@SpringBootApplication
public class SpringBootDataJpaOptional {

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(SpringBootDataJpaOptional.class, args);

        // get StudentService bean from context
        StudentService studentService = context.getBean(StudentService.class);

        // call the demo method manually (instead of overriding run())
        studentService.demoOptionalMethods(1L); // try with an existing / non-existing id
    }
}
