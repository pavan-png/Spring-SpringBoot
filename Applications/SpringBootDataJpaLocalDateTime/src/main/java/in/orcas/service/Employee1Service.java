package in.orcas.service;

import in.orcas.model.Employee1;
import in.orcas.repository.Employee1Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class Employee1Service {

    private final Employee1Repository repo;

    public Employee1Service(Employee1Repository repo) {
        this.repo = repo;
    }

    // Example: get employees who joined after 2022-01-01
    public void showEmployeesJoinedAfter() {
        LocalDateTime date = LocalDateTime.of(2022, 1, 1, 0, 0);
        List<Employee1> list = repo.findByJoiningDateAfter(date);

        for (Employee1 emp : list) {
            System.out.println(emp);
        }
    }

    // Example: get employees joined between 2021 and 2023
    public void showEmployeesJoinedBetween() {
        LocalDateTime start = LocalDateTime.of(2021, 1, 1, 0, 0);
        LocalDateTime end = LocalDateTime.of(2023, 12, 31, 23, 59);

        List<Employee1> list = repo.findByJoiningDateBetween(start, end);

        for (Employee1 emp : list) {
            System.out.println(emp);
        }
    }
}
