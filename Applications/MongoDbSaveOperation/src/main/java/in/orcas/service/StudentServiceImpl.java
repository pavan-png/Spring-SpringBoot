package in.orcas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.orcas.model.Student;
import in.orcas.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student createStudent(Student student) {
        return repository.save(student); // Insert
    }

    @Override
    public Student updateStudent(String id, String newName, int newAge, String newEmail) {
        Student student = repository.findById(id).orElse(null);
        if (student == null) {
            System.out.println("Student not found with id: " + id);
            return null;
        }
        student.setName(newName);
        student.setAge(newAge);
        student.setEmail(newEmail);
        return repository.save(student); // Update
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}
