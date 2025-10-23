// File: StudentController.java
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

    // Simple GET API to fetch student info
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return new Student(id, "John", "john@gmail.com");
    }

    // Simple POST API to add student info
    @PostMapping("/add") 
    public String addStudent(@RequestBody Student s) {
        return "Student added: " + s.getName();
    }
}
