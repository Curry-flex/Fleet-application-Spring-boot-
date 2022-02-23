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
import com.example.demo.model.Location;
import com.example.demo.model.Vehicle;
import com.example.demo.model.vehicleHire;
import com.example.demo.model.vehicleMovement;
import com.example.demo.service.LocationService;
import com.example.demo.service.clientService;
import com.example.demo.service.vehicleHireService;
import com.example.demo.service.vehicleMovementService;
import com.example.demo.service.vehicleService;

@Controller
public class vehicleHireController {
	


	@Autowired
	private vehicleHireService vehicleHireService;
    
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private vehicleService vehicleService;
	
	@Autowired
	private clientService  clientService;
	
    @GetMapping("/hires")
	
	String getVehicleMovementlList(Model model) {
		
		List<vehicleHire> hire = vehicleHireService.getAllVehicleHire();
		List<Location> location = locationService.getAllLocation();
		List<Vehicle> vehicle = vehicleService.getAllVehicle();
		List<Client> client = clientService.getAllClient();
		
		
		model.addAttribute("hire", hire);
		model.addAttribute("location", location);
		
		model.addAttribute("vehicle", vehicle);
		model.addAttribute("client", client);
		
		
		return "Hires";
	}
	
	@PostMapping("/hire/addHire")
	
	public String addHire(vehicleHire hire) {
		
		vehicleHireService.addVehicleHire(hire);
		
		
		return "redirect:/hires";
	}
	
	@RequestMapping("/hire/edit/")
	@ResponseBody
	public vehicleHire getvehicleHireID(int id) {
		
		return vehicleHireService.getVehicleHireByID(id);
	}
	
	@RequestMapping(value="/hire/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (vehicleHire hire) {
		
		vehicleHireService.addVehicleHire(hire);
		
		return "redirect:/hires";
	}
	
	@RequestMapping(value="/hire/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteHire(int id) {
		
		vehicleHireService.deleteVehicleHire(id);
		
		return "redirect:/hires";
	}
	
	
	
	
	
	
	
	
//	
//	@GetMapping("/hires")
//	
//	String getVehicleData() {
//		return "Hires";
//	}

}
