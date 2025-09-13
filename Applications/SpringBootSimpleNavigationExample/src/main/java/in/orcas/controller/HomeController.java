package in.orcas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

   @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("message", "Welcome to the Home Page of Spring Boot MVC!");
        return "home";
    }

    @RequestMapping("/second")
    public String secondPage(Model model) {
        model.addAttribute("message", "This is the Second Page.");
        return "second";
    }
}
