package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryservice;
	
	@GetMapping("/country")
	
	String getVehicleData(Model model) {
		List<Country> countryList = countryservice.getCountryList();
		
		model.addAttribute("countries" ,countryList);
		return "Countries";
	}
	
	@PostMapping("/countries/addNew")
	
	public String addCountry(Country country) {
		
		countryservice.save(country);
		
		return "redirect:/country";
		
	}
	
	@RequestMapping("/countries/id")
	@ResponseBody
	public Country getCountryByid(int id) {
		return countryservice.getCountryByID(id);
	}
	
	@RequestMapping(value="/countries/update", method= {RequestMethod.PUT,RequestMethod.GET})
	//@PutMapping("/countries/update")
	
	public String updateCountry(Country country) {
		countryservice.save(country);
		
		return "redirect:/country";
		
	}
	
	@RequestMapping(value="/countries/delete/", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	public String delete(int id) {
		
		countryservice.deleteCountry(id);
		
		return "redirect:/country";
	}
}
