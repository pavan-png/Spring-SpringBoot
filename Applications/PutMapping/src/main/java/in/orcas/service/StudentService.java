package in.orcas.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import in.orcas.model.Student;

@Service
public class StudentService {

    private Map<Integer, Student> students = new HashMap<>();

    // Create new student
    public String addStudent(Student student) {
        students.put(student.getId(), student);
        return "Student added successfully!";
    }

    // Get all students
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    // Update existing student
    public String updateStudent(Integer id, Student updatedStudent) {
        Student existing = students.get(id);
        if (existing == null) {
            return "Student with ID " + id + " not found!";
        }

        // Update old data with new data
        existing.setName(updatedStudent.getName());
        existing.setEmail(updatedStudent.getEmail());

        students.put(id, existing);
        return "Student with ID " + id + " updated successfully!";
    }
}
