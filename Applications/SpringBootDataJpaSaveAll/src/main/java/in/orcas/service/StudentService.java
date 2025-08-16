package in.orcas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.orcas.entity.Student;
import in.orcas.repo.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public void saveMultipleStudents() {
        List<Student> students = List.of(
            new Student(null, "John", "Java", 4500.0),
            new Student(null, "Emma", "Spring Boot", 5000.0),
            new Student(null, "Raj", "Hibernate", 4000.0)
        );

        repo.saveAll(students);
        System.out.println("Students saved successfully!");
    }
}
