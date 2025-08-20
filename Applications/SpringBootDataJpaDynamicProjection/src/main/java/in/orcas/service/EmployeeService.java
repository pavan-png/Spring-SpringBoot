package in.orcas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.projection.EmployeeInfoView;
import in.orcas.projection.NameCompanyView;
import in.orcas.projection.NameView;
import in.orcas.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public void testDynamicProjections() {
        // Only Name
        List<NameView> names = repo.findByCountry("India", NameView.class);
        System.out.println("--- Only Names ---");
        names.forEach(e -> System.out.println(e.getName()));

        // Name + Company
        List<NameCompanyView> nameCompany = repo.findByCountry("India", NameCompanyView.class);
        System.out.println("--- Name + Company ---");
        nameCompany.forEach(e -> System.out.println(e.getName() + " | " + e.getCompany()));

        // Name + Company + Salary
        List<EmployeeInfoView> info = repo.findByCountry("India", EmployeeInfoView.class);
        System.out.println("--- Name + Company + Salary ---");
        info.forEach(e -> System.out.println(e.getName() + " | " + e.getCompany() + " | " + e.getSalary()));
    }
}
