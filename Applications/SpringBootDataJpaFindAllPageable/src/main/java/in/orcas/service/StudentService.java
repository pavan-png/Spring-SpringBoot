package in.orcas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import in.orcas.entity.Student;
import in.orcas.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    // Method to demonstrate pagination
    public void displayStudentsWithPagination(int pageNo, int pageSize) {
        // Create Pageable object
        PageRequest pageable = PageRequest.of(pageNo, pageSize);
        

        // Fetch page data
        Page<Student> page = studentRepo.findAll(pageable);

        // Extract content (records)
        List<Student> students = page.getContent();

        // Print students
        students.forEach(System.out::println);

        // Print extra pagination info
        System.out.println("Total Pages : " + page.getTotalPages());
        System.out.println("Total Records : " + page.getTotalElements());
        System.out.println("Current Page Number : " + page.getNumber());
        System.out.println("Page Size : " + page.getSize());
    }
}
