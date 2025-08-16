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

    public void getStudentsByIds() {
        List<Long> ids = Arrays.asList(1L, 2L, 3L);
        List<Student> students = studentRepo.findAllById(ids);
        students.forEach(System.out::println);
    }
}
