package in.orcas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.orcas.model.User;

@Controller
public class UserController {

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new User());  // Empty user object for form binding
        return "register";
    }

    @PostMapping("/data")
    public String registerUser(@ModelAttribute User user, Model model) {
        System.out.println("Registered User: " + user);  // Prints object using Lombok-generated toString()

        model.addAttribute("user", user);  // Pass user object to view for display

        return "success";
    }
}
