package in.orcas.controller;

import java.util.HashMap;
import java.util.Map;

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
public class StudentRestController {

    private Map<Integer, Student> db = new HashMap<>();

    // POST → Create new student
    @PostMapping("/save")
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
        db.put(student.getId(), student);
        return new ResponseEntity<>("✅ Student saved: " + student.getName(), HttpStatus.CREATED);
    }

    // GET → Get student by ID
    @GetMapping("/find/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id) {
        Student stu = db.get(id);
        if (stu != null)
            return new ResponseEntity<>(stu, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // PUT → Update student
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        db.put(id, student);
        return new ResponseEntity<>("🔁 Student updated with id: " + id, HttpStatus.OK);
    }

    // DELETE → Delete student
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
        db.remove(id);
        return new ResponseEntity<>("🗑️ Student deleted with id: " + id, HttpStatus.OK);
    }
}
