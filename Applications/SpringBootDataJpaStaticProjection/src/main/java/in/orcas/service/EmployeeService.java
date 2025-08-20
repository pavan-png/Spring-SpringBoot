package in.orcas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.projection.EmployeeView;
import in.orcas.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public void showProjectedEmployees() {
        List<EmployeeView> list = repo.findByCountry("India"); // Example filter

        System.out.println("---- Employees from India (Only Name & Company) ----");
        list.forEach(e -> 
            System.out.println("Name: " + e.getName() + ", Company: " + e.getCompany())
        );
    }
}
