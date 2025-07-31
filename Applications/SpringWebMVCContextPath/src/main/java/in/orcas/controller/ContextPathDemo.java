package in.orcas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContextPathDemo {
	
	@GetMapping("/hello")
	public String display(Model model) {
		model.addAttribute("message","hello this is context path example");
		return("index");
	}
}
