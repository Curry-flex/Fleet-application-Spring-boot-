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
import com.example.demo.model.vehicleMake;
import com.example.demo.service.CountryService;
import com.example.demo.service.LocationService;
import com.example.demo.service.StateService;
import com.example.demo.service.VehicleMakeService;

@Controller
public class VehicleMakeController {
	

	@Autowired
	private VehicleMakeService vehicleMakeService;
;
	
	@GetMapping("/vehicle-make")
	
	String getVehicleMakeList(Model model) {
		
		List<vehicleMake> vehicle = vehicleMakeService.getAllVehilceMake();
		
		
		model.addAttribute("vehicle", vehicle);
		
		return "vehicle-make";
	}
	
	@PostMapping("/vehicleMake/addVehicleMake")
	
	public String addlocation(vehicleMake vehicleMake) {
		
		vehicleMakeService.addVehicleMake(vehicleMake);
		
		
		return "redirect:/vehicle-make";
	}
	
	@RequestMapping("/vehicleMake/edit/")
	@ResponseBody
	public vehicleMake getLocationID(int id) {
		
		return vehicleMakeService.geVehicleMakeByID(id);
	}
	
	@RequestMapping(value="/vehicleMake/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (vehicleMake vehicleMake) {
		
		vehicleMakeService.addVehicleMake(vehicleMake);
		
		return "redirect:/vehicle-make";
	}
	
	@RequestMapping(value="/vehicleMake/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteLocation(int id) {
		
		vehicleMakeService.deleteVehicleMake(id);
		
		return "redirect:/vehicle-make";
	}
	
	
	
	
	
	

}
