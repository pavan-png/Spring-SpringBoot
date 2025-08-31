package in.orcas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.orcas.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
