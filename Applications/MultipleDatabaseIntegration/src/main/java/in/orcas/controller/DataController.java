package in.orcas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.entity.mysql.Employee;
import in.orcas.entity.postgres.Student;
import in.orcas.service.DataService;

@RestController
@RequestMapping("/api")
public class DataController {

    @Autowired
    private DataService service;

    // === PostgreSQL ===
    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student s) {
        return service.saveStudent(s);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    // === MySQL ===
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee e) {
        return service.saveEmployee(e);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }
}
