package in.orcas.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public void deleteMultipleStudentsById() {
        List<Long> ids = Arrays.asList(1L, 2L, 3L); // IDs you want to delete
        studentRepo.deleteAllById(ids);
        System.out.println("Deleted students with IDs: " + ids);
    }
}
