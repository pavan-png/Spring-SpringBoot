package in.orcas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import in.orcas.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Calling Stored Procedure: GET_EMPLOYEE_SALARY
    @Procedure(procedureName = "GET_EMPLOYEE_SALARY")
    Double getEmployeeSalary(@Param("emp_id") Long empId);
}
