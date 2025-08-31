package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.orcas.model.Student;
import in.orcas.service.StudentService;

@SpringBootApplication
public class MongoDbSaveOperationApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MongoDbSaveOperationApplication.class, args);

        StudentService studentService = context.getBean(StudentService.class);

        // 1. Create new student (Insert)
        Student student = new Student(null, "John Doe", 22, "john@example.com");
        Student savedStudent = studentService.createStudent(student);
        System.out.println("Inserted Student: " + savedStudent);

        // 2. Update existing student
        if (savedStudent != null) {
            Student updatedStudent = studentService.updateStudent(
                    savedStudent.getId(),
                    "John Smith",
                    23,
                    "john.smith@example.com"
            );
            System.out.println("Updated Student: " + updatedStudent);
        }

        // 3. Fetch all students
        System.out.println("All Students in DB: " + studentService.getAllStudents());
    }
}
