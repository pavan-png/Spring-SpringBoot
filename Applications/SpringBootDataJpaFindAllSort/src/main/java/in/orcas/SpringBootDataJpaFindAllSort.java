package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.StudentService;

@SpringBootApplication
public class SpringBootDataJpaFindAllSort{

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDataJpaFindAllSort.class, args);

        StudentService service = context.getBean(StudentService.class);

        // Call service methods directly
        service.printStudentsSortedByName();
        service.printStudentsSortedByFeeDesc();
        service.printStudentsSortedByCourseAndName();
    }
}
