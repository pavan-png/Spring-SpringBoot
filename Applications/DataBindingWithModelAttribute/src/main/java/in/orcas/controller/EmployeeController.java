package in.orcas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.orcas.model.Employee;

@Controller
public class EmployeeController {

    // 1. Show register.jsp page (GET request)
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        // Add empty Employee object to bind form fields
        model.addAttribute("employee", new Employee());
        return "register"; // /WEB-INF/views/register.jsp
    }

    // 2. Process submitted data and show result.jsp (POST request)
    @PostMapping("/emp_register")
    public String processRegisterForm(@ModelAttribute("employee") Employee emp, Model model) {
        // here normally service.save(emp) would be called
        model.addAttribute("emp", emp); // send employee object to result.jsp
        return "result"; // /WEB-INF/views/result.jsp
    }
}
