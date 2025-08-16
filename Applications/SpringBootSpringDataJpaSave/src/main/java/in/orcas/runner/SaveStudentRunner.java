package in.orcas.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.orcas.entity.Student;
import in.orcas.repository.StudentRepository;

@Component
public class SaveStudentRunner implements CommandLineRunner {

    private final StudentRepository repo;

    public SaveStudentRunner(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student("Pavan", "Java", 15000.0);
        Student s2 = new Student("Kalyan", "Spring Boot", 18000.0);

        repo.save(s1);
        repo.save(s2);

        System.out.println("✅ Students saved successfully!");
    }
}
