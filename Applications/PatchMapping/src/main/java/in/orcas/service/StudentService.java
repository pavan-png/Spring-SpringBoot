package in.orcas.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import in.orcas.model.Student;

@Service
public class StudentService {

    // Simulated in-memory DB
    private Map<Integer, Student> db = new HashMap<>();

    // CREATE
    public Student saveStudent(Student s) {
        db.put(s.getId(), s);
        return s;
    }

    // READ
    public Student getStudent(Integer id) {
        return db.get(id);
    }

    // FULL UPDATE (PUT)
    public Student updateFullStudent(Integer id, Student newStudent) {
        db.put(id, newStudent); // Replace entire object
        return newStudent;
    }

    // PARTIAL UPDATE (PATCH)
    public Student updatePartialStudent(Integer id, Map<String, Object> updates) {
        Student student = db.get(id);
        if (student == null) return null;

        if (updates.containsKey("name"))
            student.setName((String) updates.get("name"));

        if (updates.containsKey("email"))
            student.setEmail((String) updates.get("email"));

        if (updates.containsKey("city"))
            student.setCity((String) updates.get("city"));

        db.put(id, student);
        return student;
    }
}
