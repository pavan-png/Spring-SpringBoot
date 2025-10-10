package in.orcas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.service.IEmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService service;

    @GetMapping("/save")
    public String saveEmployee() {
        System.out.println("Controller Layer: Received request to save employee...");
        service.registerEmployee();
        return "Request processed. Check console logs for transaction details.";
    }
}
