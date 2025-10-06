package in.orcas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    // URL: http://localhost:9999/welcome/msg/10/sachin
    @GetMapping("/msg/{id}/{name}")
    public ResponseEntity<String> greetMessage(
            @PathVariable Integer id,
            @PathVariable String name) {

        String msg = "Hello " + name + ", your ID is " + id;
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
