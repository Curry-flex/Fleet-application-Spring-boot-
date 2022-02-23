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

import com.example.demo.model.Country;
import com.example.demo.model.Location;
import com.example.demo.model.State;
import com.example.demo.service.CountryService;
import com.example.demo.service.LocationService;
import com.example.demo.service.StateService;

@Controller
public class locationController {
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/location")
	
	String getLocationList(Model model) {
		
		List<Country> country = countryService.getCountryList();
		List<State> state =stateService.getAllState();
		List<Location> location = locationService.getAllLocation();
		
		model.addAttribute("countries", country);
		model.addAttribute("state", state);
		model.addAttribute("location", location);
		return "location";
	}
	
	@PostMapping("/location/addLocation")
	
	public String addlocation(Location location) {
		
		locationService.addLocation(location);
		
		
		return "redirect:/location";
	}
	
	@RequestMapping("/location/edit/")
	@ResponseBody
	public Location getLocationID(int id) {
		
		return locationService.getLocationByID(id);
	}
	
	@RequestMapping(value="/location/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (Location location) {
		
		locationService.addLocation(location);
		
		return "redirect:/location";
	}
	
	@RequestMapping(value="/location/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteLocation(int id) {
		
		locationService.deleteLocation(id);
		
		return "redirect:/location";
	}

}
