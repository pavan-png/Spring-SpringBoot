package in.orcas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @GetMapping("/get")
    public Customer getCustomer() {
        // Create and return Java Object
        Customer c = new Customer(101, "Sachin Tendulkar", "sachin@gmail.com");
        return c;  // Spring will convert this Java object to JSON automatically
    }
}
