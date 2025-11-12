package in.orcas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.model.Student;
import in.orcas.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // Create or Update
    @PostMapping
    public Student saveStudent(@RequestBody Student s) {
        return service.saveStudent(s);
    }

    // Read All
    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }

    // Read One
    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.deleteStudent(id);
    }
}
