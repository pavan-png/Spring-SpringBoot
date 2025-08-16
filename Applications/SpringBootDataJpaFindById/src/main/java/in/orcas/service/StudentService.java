package in.orcas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.entity.Student;
import in.orcas.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public void getStudentById(Long id) {
        Optional<Student> optionalStudent = studentRepo.findById(id);

        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            System.out.println("Student Found: " + student);
        } else {
            System.out.println("No Student Found with ID: " + id);
        }
    }
}
