package in.orcas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import in.orcas.model.Employee1;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface Employee1Repository extends JpaRepository<Employee1, Long> {

    // Find employees who joined after a given date-time
    List<Employee1> findByJoiningDateAfter(LocalDateTime dateTime);

    // Find employees who joined before a given date-time
    List<Employee1> findByJoiningDateBefore(LocalDateTime dateTime);

    // Find employees between two joining dates
    List<Employee1> findByJoiningDateBetween(LocalDateTime start, LocalDateTime end);
}
