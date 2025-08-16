package in.orcas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.orcas.entity.Student;
import in.orcas.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    // Method to get students sorted by name ascending
    public void printStudentsSortedByName() {
        List<Student> list = (List<Student>) studentRepo.findAll(Sort.by("name").ascending());
        System.out.println("=== Sorted by Name ASC ===");
        list.forEach(System.out::println);
    }

    // Method to get students sorted by fee descending
    public void printStudentsSortedByFeeDesc() {
        List<Student> list = (List<Student>) studentRepo.findAll(Sort.by("fee").descending());
        System.out.println("=== Sorted by Fee DESC ===");
        list.forEach(System.out::println);
    }

    // Method to sort by multiple properties (course ASC, then name DESC)
    public void printStudentsSortedByCourseAndName() {
        List<Student> list = (List<Student>) studentRepo.findAll(
                Sort.by("course").ascending()
                    .and(Sort.by("name").descending()));
        System.out.println("=== Sorted by Course ASC, Name DESC ===");
        list.forEach(System.out::println);
    }
}
