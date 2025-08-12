package in.orcas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Book {
	
	@GetMapping("/booksinfo/{bname}/author/{authorname}")
	public String display(@PathVariable("bname")String bname,@PathVariable("authorname")String authorname ,Model model) {
		String message = "the book name is "+bname+ " and author name is "+authorname;
		model.addAttribute("message",message);
		return"index";
	}
}
