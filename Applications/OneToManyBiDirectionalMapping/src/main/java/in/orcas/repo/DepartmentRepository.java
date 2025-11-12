package in.orcas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.orcas.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
