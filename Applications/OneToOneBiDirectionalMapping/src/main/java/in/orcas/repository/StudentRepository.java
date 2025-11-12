package in.orcas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.orcas.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
