package in.orcas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.model.Student;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @PostMapping("/register")
    public ResponseEntity<String> registerStudent(@RequestBody Student student) {
        System.out.println("Received Student Data : " + student);

        String msg = "✅ Student Registered Successfully with Name: " + student.getName();

        // Sending Body + Status
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }
}
