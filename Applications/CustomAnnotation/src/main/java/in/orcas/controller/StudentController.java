package in.orcas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.annotations.MyAnnotation;

@RestController
@MyAnnotation(author = "Pavan", version = "2.1")   // applied at class level
public class StudentController {

    @GetMapping("/hello")
    @MyAnnotation(author = "Pavan Kalyan")         // applied at method level
    public String sayHello() {
        return "Hello Student!";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Goodbye Student!";
    }
}
