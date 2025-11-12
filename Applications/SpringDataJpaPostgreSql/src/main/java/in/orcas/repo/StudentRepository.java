package in.orcas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.orcas.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> { }
