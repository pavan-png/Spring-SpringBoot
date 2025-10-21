package in.orcas.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.model.Student;
import in.orcas.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // Create student
    @PostMapping
    public String createStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    // Get all students
    @GetMapping
    public Collection<Student> getStudents() {
        return service.getAllStudents();
    }

    // ✅ Update existing student (PUT)
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }
}
