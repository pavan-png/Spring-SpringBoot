package in.orcas.postgres.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.orcas.entity.postgres.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
}