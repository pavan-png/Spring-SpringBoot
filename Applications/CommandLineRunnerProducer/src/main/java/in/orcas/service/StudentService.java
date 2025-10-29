package in.orcas.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import in.orcas.model.Student;

@Service
public class StudentService {

    private final Map<Integer, Student> studentMap = new HashMap<>();

    // CREATE
    public Student saveStudent(Student s) {
        studentMap.put(s.getId(), s);
        return s;
    }

    // READ ALL
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentMap.values());
    }

    // READ ONE
    public Student getStudentById(Integer id) {
        return studentMap.get(id);
    }

    // UPDATE
    public Student updateStudent(Student s) {
        studentMap.put(s.getId(), s);
        return s;
    }

    // DELETE
    public String deleteStudent(Integer id) {
        studentMap.remove(id);
        return "Student with ID " + id + " deleted successfully";
    }
}
