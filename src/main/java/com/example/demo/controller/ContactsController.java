package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Client;
import com.example.demo.model.Contact;
import com.example.demo.model.Country;
import com.example.demo.model.State;
import com.example.demo.service.CountryService;
import com.example.demo.service.StateService;
import com.example.demo.service.clientService;
import com.example.demo.service.contactService;

@Controller
public class ContactsController {
	
	
	
	@Autowired
	private contactService service;
	
	
	@GetMapping("/contacts")
	
	String getContactList(Model model) {
		
		List<Contact> contact = service.getAllContact();
		;
		
		
		
		model.addAttribute("contact", contact);
		
		return "contact";
	}
	
	@PostMapping("/contact/addContact")
	
	public String addContact(Contact contact) {
		
		service.addContact(contact);
		
		
		return "redirect:/contacts";
	}
	
	@RequestMapping("/contact/edit/")
	@ResponseBody
	public Contact getContactID(int id) {
		
		return service.getContactID(id);
	}
	
	@RequestMapping(value="/contact/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (Contact contact) {
		
		service.addContact(contact);
		
		return "redirect:/contacts";
	}
	
	@RequestMapping(value="/contact/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteContact(int id) {
		
		service.deleteContact(id);
		
		return "redirect:/contacts";
	}
	
	
	
//	@GetMapping("/contacts")
//	
//	String getVehicleData() {
//		return "Contacts";
//	}

}
