package in.orcas.service;

import java.util.List;

import in.orcas.model.Student;

public interface StudentService {
    Student createStudent(Student student);
    Student updateStudent(String id, String newName, int newAge, String newEmail);
    List<Student> getAllStudents();
}
