package in.orcas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public void callStoredProcedureExample(Long empId) {
        Double salary = repo.getEmployeeSalary(empId);
        System.out.println("Employee Salary for ID " + empId + " = " + salary);
    }
}
