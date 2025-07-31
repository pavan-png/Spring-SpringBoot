package in.orcas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class SecondApp {
	
	
	@RequestMapping("/hello")
	public ModelAndView requestMethodName() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","second application");
		mv.setViewName("index");
		return mv;
	}
	
	@GetMapping("/hi")
	public String display(Model model) {
		model.addAttribute("message","springboot is awesome");
		return "index";
	}
	
	
	
}
