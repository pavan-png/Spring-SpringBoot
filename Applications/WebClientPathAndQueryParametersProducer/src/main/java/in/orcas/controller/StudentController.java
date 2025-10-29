package in.orcas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return new Student(id, "Ravi", "Java", "Hyd");
    }

    @GetMapping("/search")
    public List<Student> searchStudents(
            @RequestParam String course,
            @RequestParam String city) {
        return List.of(
            new Student(101, "Ravi", course, city),
            new Student(102, "Kiran", course, city)
        );
    }
}
