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
import com.example.demo.model.Country;
import com.example.demo.model.State;
import com.example.demo.model.vehicleMake;
import com.example.demo.service.CountryService;
import com.example.demo.service.StateService;
import com.example.demo.service.clientService;

@Controller
public class ClientController {
	


	@Autowired
	private clientService service;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService
;
	
	@GetMapping("/client")
	
	String getClienteList(Model model) {
		
		List<Client> client = service.getAllClient();
		List<Country> country = countryService.getCountryList();
		List<State> state = stateService.getAllState();
		
		
		model.addAttribute("client", client);
		model.addAttribute("countries", country);
		model.addAttribute("state", state);
		
		return "client";
	}
	
	@PostMapping("/client/addClient")
	
	public String addClient(Client  client) {
		
		service.addClient(client);
		
		
		return "redirect:/client";
	}
	
	@RequestMapping("/client/edit/")
	@ResponseBody
	public Client getClientID(int id) {
		
		return service.getClientByID(id);
	}
	
	@RequestMapping(value="/client/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (Client client) {
		
		service.addClient(client);
		
		return "redirect:/client";
	}
	
	@RequestMapping(value="/client/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteClient(int id) {
		
		service.deleteClient(id);
		
		return "redirect:/client";
	}
	
	
	
	

}
