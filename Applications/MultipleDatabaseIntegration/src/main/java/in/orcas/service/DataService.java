package in.orcas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.entity.mysql.Employee;
import in.orcas.entity.postgres.Student;
import in.orcas.mysql.repo.EmployeeRepo;
import in.orcas.postgres.repo.StudentRepo;

@Service
public class DataService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    // === PostgreSQL CRUD ===
    public Student saveStudent(Student s) { return studentRepo.save(s); }
    public List<Student> getAllStudents() { return studentRepo.findAll(); }

    // === MySQL CRUD ===
    public Employee saveEmployee(Employee e) { return employeeRepo.save(e); }
    public List<Employee> getAllEmployees() { return employeeRepo.findAll(); }
}
