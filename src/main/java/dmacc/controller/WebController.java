package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Contact;
import dmacc.repository.ContactRepository;

@Controller
public class WebController {
	@Autowired 
	ContactRepository repo;
	
	
	@GetMapping("/viewAll")
	public String viewAllContacts(Model model) {
		model.addAttribute("contacts", repo.findAll());
		return "results ";
	}
	
	@GetMapping("/inputContact")
	public String addNewContact(Model model) {
		Contact c = new Contact();
		model.addAttribute("newContact", c);
		return "input";
	}
	
	@PostMapping("/inputContact")
	public String addNewContact(@ModelAttribute Contact c, Model model) {
		repo.save(c);
		return viewAllContacts(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateContact(@PathVariable("id") long id, Model model) {
		Contact c  = repo.findAllById(id).orElse(null);
		model.addAttribute("newContact", c);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseContact(Contact c, Model model) {
		repo.save(c);
		return viewAllContacts(model);
	}
}


