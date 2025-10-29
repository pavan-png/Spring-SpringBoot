package in.orcas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.model.Student;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    // GET method
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id) {
        Student s = new Student(id, "John", "john@gmail.com");
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    // POST method
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        student.setId(1001);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    // PUT method
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        student.setId(id);
        student.setName(student.getName() + " (Updated)");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // DELETE method
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
        return new ResponseEntity<>("Student with ID " + id + " deleted successfully", HttpStatus.OK);
    }
}
