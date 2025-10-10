package in.orcas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Example: http://localhost:8081/student/register?name=John
    @GetMapping("/register")
    public String registerStudent(@RequestParam String name) {
        return studentService.registerStudent(name);
    }
}
