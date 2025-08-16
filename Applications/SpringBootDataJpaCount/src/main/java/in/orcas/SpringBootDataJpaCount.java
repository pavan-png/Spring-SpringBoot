package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.StudentService;

@SpringBootApplication
public class SpringBootDataJpaCount {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBootDataJpaCount.class, args);

        StudentService service = ctx.getBean(StudentService.class);
        service.printStudentCount();
    }
}
