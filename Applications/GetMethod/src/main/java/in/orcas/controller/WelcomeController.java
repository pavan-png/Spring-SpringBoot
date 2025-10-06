package in.orcas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    // Example with mandatory parameters
    @GetMapping("/msg")
    public ResponseEntity<String> greetMessage(
            @RequestParam("id") Integer id,
            @RequestParam("name") String name) {

        String msg = "Hello " + name + ", your ID is " + id;
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    // Example with optional parameter
    @GetMapping("/optionalMsg")
    public ResponseEntity<String> greetOptionalMessage(
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam("name") String name) {

        String msg = "Hello " + name;
        if (id != null) {
            msg += ", your ID is " + id;
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
