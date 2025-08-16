package in.orcas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.orcas.service.StudentService;

@SpringBootApplication
public class SpringBootDataJpaPageable {

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        var context = SpringApplication.run(SpringBootDataJpaPageable.class, args);

        StudentService service = context.getBean(StudentService.class);

        // Fetch page 0 with size 2 (first 2 records)
        service.displayStudentsWithPagination(0, 2);

        // Fetch page 1 with size 2 (next 2 records)
        service.displayStudentsWithPagination(1, 2);
    }
}
