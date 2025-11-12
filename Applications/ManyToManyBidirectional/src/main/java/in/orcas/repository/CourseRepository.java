package in.orcas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.orcas.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}