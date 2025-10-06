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

    // Example URL: http://localhost:9999/student/info/10
    @GetMapping("/info/{id}")
    public ResponseEntity<String> getStudentInfo(@PathVariable Integer id) {

        String msg = "Fetching details for Student ID: " + id;
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
