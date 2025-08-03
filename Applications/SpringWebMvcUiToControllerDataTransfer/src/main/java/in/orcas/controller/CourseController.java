package in.orcas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.orcas.model.Course;

@Controller
public class CourseController {
	
	@GetMapping("/show")
	public String display( @RequestParam(value="cid",required=false,defaultValue="0") int id,
			@RequestParam(value="cname",required=false,defaultValue="unknown") String name,
			@RequestParam(value="cost",required=false,defaultValue="0.0")double price,
			Model model) {
		Course c = new Course();
		c.setCid(id);
		c.setCname(name);
		c.setCost(price);
		
		model.addAttribute("course",c);
		return "course" ;
	}
}
