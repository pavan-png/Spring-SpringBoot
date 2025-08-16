package in.orcas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public void printStudentCount() {
        long count = studentRepo.count(); // Counts total rows in the table
        System.out.println("Total number of students: " + count);
    }
}
