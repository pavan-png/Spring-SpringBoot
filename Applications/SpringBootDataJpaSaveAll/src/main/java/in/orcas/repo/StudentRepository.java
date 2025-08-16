package in.orcas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.orcas.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // saveAll() comes from JpaRepository
}
