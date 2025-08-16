package in.orcas.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.entity.Student;
import in.orcas.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public void deleteMultipleStudents() {
        // Create a list of students to delete (IDs must match DB records)
        Student s1 = new Student(5L, "Raj", "Hibernate", 4000.0);
        Student s2 = new Student(4L, "Emma", "Spring Boot",5000.0);
       

        List<Student> studentsToDelete = Arrays.asList(s1, s2);

        // Call deleteAll with Iterable
        studentRepo.deleteAll(studentsToDelete);

        System.out.println("Selected students deleted successfully!");
    }
}
