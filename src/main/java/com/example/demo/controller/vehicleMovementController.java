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

import com.example.demo.model.Location;
import com.example.demo.model.Supplier;
import com.example.demo.model.Vehicle;
import com.example.demo.model.VehicleMaintanance;
import com.example.demo.model.vehicleMovement;
import com.example.demo.service.LocationService;
import com.example.demo.service.supplierService;

import com.example.demo.service.vehicleMovementService;
import com.example.demo.service.vehicleService;

@Controller
public class vehicleMovementController {

	

	@Autowired
	private vehicleMovementService movementService;
    
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private vehicleService vehicleService;
	
    @GetMapping("/movement")
	
	String getVehicleMovementlList(Model model) {
		
		List<vehicleMovement> movement =  movementService.getAllVehilceMovement();
		List<Location> location = locationService.getAllLocation();
		List<Vehicle> vehicle = vehicleService.getAllVehicle();
		
		
		model.addAttribute("movement", movement);
		model.addAttribute("location", location);
		
		model.addAttribute("vehicle", vehicle);
		
		
		return "Movement";
	}
	
	@PostMapping("/movement/addMovement")
	
	public String addMovement(vehicleMovement vehicleMovement) {
		
		 movementService.addVehicleMovement(vehicleMovement);
		
		
		return "redirect:/movement";
	}
	
	@RequestMapping("/movement/edit/")
	@ResponseBody
	public vehicleMovement getvehicleMovementTypeID(int id) {
		
		return  movementService.getVehicleMovementByID(id);
	}
	
	@RequestMapping(value="/movement/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (vehicleMovement maintanance) {
		
		 movementService.addVehicleMovement(maintanance);
		
		return "redirect:/movement";
	}
	
	@RequestMapping(value="/movement/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteMovement(int id) {
		
		 movementService.deleteVehicleMovement(id);
		
		return "redirect:/movement";
	}
	
	
}
