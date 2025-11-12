package in.orcas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.model.Student;
import in.orcas.repo.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    // Create / Update
    public Student saveStudent(Student s) {
        return repo.save(s);
    }

    // Read All
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // Read One
    public Student getStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Delete
    public String deleteStudent(Long id) {
        repo.deleteById(id);
        return "Student deleted successfully";
    }
}
