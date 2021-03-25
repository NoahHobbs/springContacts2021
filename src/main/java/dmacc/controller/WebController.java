package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dmacc.repository.ContactRepository;

@Controller
public class WebController {
	@Autowired 
	ContactRepository repo;
	
	
	@GetMapping("/viewAll")
	public String viewAllContacts(Model model) {
		model.addAttribute("contacts", repo.findAll());
		return "results";
	}
}


