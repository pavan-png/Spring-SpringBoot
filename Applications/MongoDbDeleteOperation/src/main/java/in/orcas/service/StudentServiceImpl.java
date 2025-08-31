package in.orcas.service;

import org.springframework.stereotype.Service;

import in.orcas.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deleteStudentById(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            System.out.println("Deleted student with id: " + id);
        } else {
            System.out.println("No student found with id: " + id);
        }
    }

    @Override
    public void deleteAllStudents() {
        repository.deleteAll();
        System.out.println("Deleted all students from DB");
    }
}
