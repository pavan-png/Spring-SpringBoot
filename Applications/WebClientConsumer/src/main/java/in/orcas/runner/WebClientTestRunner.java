package in.orcas.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.orcas.model.Student;
import in.orcas.service.StudentWebClientService;

@Component
public class WebClientTestRunner implements CommandLineRunner {

    private final StudentWebClientService service;

    public WebClientTestRunner(StudentWebClientService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Student Consumer App Started ===");

        // Create student
        Student newStudent = new Student(null, "Pavan", "pavan@gmail.com");
        service.createStudent(newStudent);

        // Get student
        service.getStudent(1001);

        // Update student
        Student updated = new Student(null, "Pavan Updated", "pavan_updated@gmail.com");
        service.updateStudent(1001, updated);

        // Delete student
        service.deleteStudent(1001);

        System.out.println("=== Student Consumer App Finished ===");
    }
}
