package in.orcas.producer.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.producer.model.Student;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @PostMapping("/register")
    public ResponseEntity<String> registerStudent(@RequestBody Student student) {
        System.out.println("Received Student :: " + student);

        // Create custom headers for response
        HttpHeaders headers = new HttpHeaders();
        headers.add("app-name", "StudentProviderApp");
        headers.add("operation", "Student Registration");

        // Body + Headers + StatusCode
        return new ResponseEntity<>(
                "Student registered successfully: " + student.getName(),
                headers,
                HttpStatus.CREATED
        );
    }
}
