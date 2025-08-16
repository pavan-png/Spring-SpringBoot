package in.orcas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.entity.Student;
import in.orcas.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public void fetchAllStudents() {
        List<Student> students = studentRepo.findAll();
        students.forEach(System.out::println);
    }
}
