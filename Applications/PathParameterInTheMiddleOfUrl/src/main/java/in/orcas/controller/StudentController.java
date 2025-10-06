package in.orcas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    // Example URL: http://localhost:9999/student/10/course/java
    @GetMapping("/{id}/course/{courseName}")
    public ResponseEntity<String> getCourseDetails(
            @PathVariable Integer id,
            @PathVariable String courseName) {

        String msg = "Student ID: " + id + " has enrolled in the course: " + courseName;
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
