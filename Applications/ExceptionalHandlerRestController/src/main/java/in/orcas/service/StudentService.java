package in.orcas.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import in.orcas.exception.StudentNotFoundException;
import in.orcas.model.Student;

@Service
public class StudentService {

    private static Map<Integer, Student> studentDB = new HashMap<>();

    static {
        studentDB.put(101, new Student(101, "Pavan", "pavan@gmail.com"));
        studentDB.put(102, new Student(102, "Kalyan", "kalyan@gmail.com"));
    }

    public Student getStudentById(Integer id) {
        Student s = studentDB.get(id);
        if (s == null) {
            throw new StudentNotFoundException("No student found with ID: " + id);
        }
        return s;
    }
}
