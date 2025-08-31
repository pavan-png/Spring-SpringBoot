package in.orcas.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;   // ✅ correct Pageable
import org.springframework.data.domain.Sort;

import in.orcas.model.Student;

public interface StudentService {
    long countStudents();
    Page<Student> getStudentsByPage(Pageable pageable);   // ✅ now works with PageRequest
    List<Student> getStudentsSorted(Sort sort);
}
