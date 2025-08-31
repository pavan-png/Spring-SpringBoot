package in.orcas.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.orcas.model.Student;
import in.orcas.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;  
    }

    @Override
    public long countStudents() {
        return repository.count();  // returns total number of documents
    }

    @Override
    public Page<Student> getStudentsByPage(Pageable pageable) {
        return repository.findAll(pageable); // pagination
    }

    @Override
    public List<Student> getStudentsSorted(Sort sort) {
        return repository.findAll(sort); // sorting
    }
}
