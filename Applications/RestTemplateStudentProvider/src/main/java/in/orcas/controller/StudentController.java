package in.orcas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

    // GET - fetch a student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        System.out.println("📩 Received GET request for ID: " + id);
        return new Student(id, "Ravi", "Hyderabad");
    }

    // POST - add new student
    @PostMapping
    public String addStudent(@RequestBody Student s) {
        System.out.println("📩 Received POST request: " + s);
        return "✅ Student added successfully: " + s.getName();
    }
}
