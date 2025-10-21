package in.orcas.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import in.orcas.model.Student;

@Service
public class StudentService {

    private Map<Integer, Student> db = new HashMap<>();

    // Save student (for testing)
    public String saveStudent(Student student) {
        db.put(student.getId(), student);
        return "Student saved successfully!";
    }

    // Delete student by ID
    public String deleteStudent(Integer id) {
        if (db.containsKey(id)) {
            db.remove(id);
            return "Student deleted successfully with ID: " + id;
        } else {
            return "Student not found with ID: " + id;
        }
    }

    // View all students (optional)
    public Map<Integer, Student> getAll() {
        return db;
    }
}
