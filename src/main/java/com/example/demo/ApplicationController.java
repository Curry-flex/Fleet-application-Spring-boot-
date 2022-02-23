package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Employee;
import com.example.demo.service.CountryService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.clientService;
import com.example.demo.service.vehicleService;

@Controller
public class ApplicationController {
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private vehicleService vehicleService;
	
	
	@Autowired
	private clientService clientService;
	
	@Autowired
	private CountryService countryService;
	
@GetMapping("/index")

	String Home(Model model) {
	
	 long count = service.getCount();
	 long vehicle = vehicleService.getCountVehicle();
	 long client =clientService.getCountClient();
	 long country = countryService.getCountCountry();
	

	 model.addAttribute("count",count);
	 model.addAttribute("vehicle",vehicle);
	 model.addAttribute("client",client);
	 model.addAttribute("country",country);
		return "index";
	}
	
@GetMapping ("/login")
	
	String login() {
		
		return "login";
	}


@GetMapping ("/logout")

String logout() {
	
	return "login";
}


@GetMapping ("/accessDenied")

String accessDenied() {
	
	return "accessDinied";
}

//@GetMapping ("/register")
//
//String register() {
//	
//	return "Register";
//}

}
