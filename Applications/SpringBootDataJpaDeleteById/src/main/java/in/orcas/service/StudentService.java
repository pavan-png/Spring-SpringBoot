package in.orcas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public void deleteStudentById(Long id) {
        if(studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
            System.out.println(" Student with ID " + id + " deleted successfully!");
        } else {
            System.out.println(" No Student found with ID " + id);
        }
    }
}
