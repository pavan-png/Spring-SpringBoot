package in.orcas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")   // <-- Class level mapping
public class WishController {

    // Method level mapping
    @GetMapping("/msg")
    public ResponseEntity<String> generateWishMessage() {
        String msg = "Welcome to Restful Services ";

        // Returning ResponseEntity with body and status code
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
