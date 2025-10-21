package in.orcas.controller;

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

    // POST - Create new student
    @PostMapping
    public String createStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    // DELETE - Remove student by ID
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        return service.deleteStudent(id);
    }

    // GET - Optional (view all)
    @GetMapping
    public Object getAll() {
        return service.getAll();
    }
}
