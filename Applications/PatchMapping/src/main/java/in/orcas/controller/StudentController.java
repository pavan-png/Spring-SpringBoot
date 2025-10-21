package in.orcas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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

    @Autowired
    private StudentService service;

    // ✅ 1. CREATE (POST)
    @PostMapping("/create")
    public String createStudent(@RequestBody Student student) {
        Student saved = service.saveStudent(student);
        return "✅ Student created with ID: " + saved.getId();
    }

    // ✅ 2. READ (GET)
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return service.getStudent(id);
    }

    // ✅ 3. FULL UPDATE (PUT)
    @PutMapping("/{id}")
    public String updateFull(@PathVariable Integer id, @RequestBody Student student) {
        Student updated = service.updateFullStudent(id, student);
        return "✅ Full update done for student ID: " + id;
    }

    // ✅ 4. PARTIAL UPDATE (PATCH)
    @PatchMapping("/{id}")
    public String updatePartial(@PathVariable Integer id, @RequestBody Map<String, Object> updates) {
        Student updated = service.updatePartialStudent(id, updates);
        if (updated == null)
            return "❌ Student not found with ID: " + id;
        return "✅ Partial update done for student ID: " + id;
    }
}
