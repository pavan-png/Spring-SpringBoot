package in.orcas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String registerStudent(String name) {
        System.out.println("Business Logic: Registering student in service layer...");
        return studentRepository.saveStudent(name);
    }
}
