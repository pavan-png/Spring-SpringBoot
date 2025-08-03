package in.orcas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.orcas.model.Course;


@Controller
public class CourseController {
	@GetMapping("/show")
	public String showData(Model model) {
	    Course c = new Course();
	    c.setCid(101);
	    c.setCname("Java");
	    c.setCost(1500.0);
	    model.addAttribute("course", c); // passing the object to JSP
	    return "course"; // JSP name
	}
	
	
}
