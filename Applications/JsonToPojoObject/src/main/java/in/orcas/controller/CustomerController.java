package in.orcas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    // ✅ Example for @RequestBody (JSON → Java)
    @PostMapping("/save")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {

        System.out.println("Received Customer: " + customer);

        // you can now save it to DB or process it further
        String message = "Customer " + customer.getName() + " saved successfully!";

        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
}
