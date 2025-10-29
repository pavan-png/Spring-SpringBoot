package in.orcas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.orcas.model.Student;

@Service
public class StudentService {

    private final List<Student> list = List.of(
            new Student(101, "Ravi", "Java", "Hyderabad"),
            new Student(102, "Kiran", "Python", "Chennai"),
            new Student(103, "Asha", "Spring", "Pune")
    );

    public List<Student> getAllStudents() {
        return list;
    }

    public Student getStudentById(Integer id) {
        return list.stream()
                   .filter(s -> s.getId().equals(id))
                   .findFirst()
                   .orElse(null);
    }
}
