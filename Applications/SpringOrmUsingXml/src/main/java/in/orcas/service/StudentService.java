package in.orcas.service;

import java.util.List;

import in.orcas.model.StudentDTO;

public interface StudentService {
    void saveStudent(StudentDTO dto);
    void updateStudent(StudentDTO dto);
    void deleteStudent(int id);
    List<StudentDTO> getAllStudents();
    StudentDTO getStudentById(int id);
}