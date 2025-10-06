package in.orcas.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Mark this class as REST controller
@RestController
@RequestMapping("/customer")
public class CustomerController {

    // GET - Read
    @GetMapping("/report")
    public ResponseEntity<String> showCustomerReport() {
        return new ResponseEntity<>("FROM GET - showCustomerReport()", HttpStatus.OK);
    }

    // POST - Create
    @PostMapping("/report")
    public ResponseEntity<String> registerCustomer() {
        return new ResponseEntity<>("FROM POST - registerCustomer()", HttpStatus.CREATED);
    }

    // PUT - Full Update
    @PutMapping("/modify")
    public ResponseEntity<String> updateCustomer() {
        return new ResponseEntity<>("FROM PUT - updateCustomer()", HttpStatus.OK);
    }

    // PATCH - Partial Update
    @PatchMapping("/pmodify")
    public ResponseEntity<String> updateCustomerByNo() {
        return new ResponseEntity<>("FROM PATCH - updateCustomerByNo()", HttpStatus.OK);
    }

    // DELETE - Delete
    @DeleteMapping("/remove")
    public ResponseEntity<String> deleteCustomer() {
        return new ResponseEntity<>("FROM DELETE - deleteCustomer()", HttpStatus.NO_CONTENT);
    }

    // HEAD - Only headers, no body
    @RequestMapping(value = "/head", method = RequestMethod.HEAD)
    public ResponseEntity<Void> headCustomer() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // OPTIONS - Returns allowed methods
    @RequestMapping(value = "/options", method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> optionsCustomer() {
        return ResponseEntity.ok().build();  // Spring automatically adds Allow header
    }

    // TRACE - Debugging request
    @RequestMapping(value = "/trace", method = RequestMethod.TRACE)
    public ResponseEntity<String> traceCustomer() {
        return new ResponseEntity<>("FROM TRACE - traceCustomer()", HttpStatus.OK);
    }
}
