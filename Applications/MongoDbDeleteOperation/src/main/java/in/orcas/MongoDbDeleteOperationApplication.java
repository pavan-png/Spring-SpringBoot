package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.service.StudentService;

@SpringBootApplication
public class MongoDbDeleteOperationApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MongoDbDeleteOperationApplication.class, args);

        StudentService studentService = context.getBean(StudentService.class);

        // Example: delete a student by ID
        studentService.deleteStudentById("66d4f7c8b12a4a2d9e4f1234");

        // Example: delete all students
        studentService.deleteAllStudents();
    }
}
