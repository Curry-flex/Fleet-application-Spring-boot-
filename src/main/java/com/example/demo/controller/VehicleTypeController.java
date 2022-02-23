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

import com.example.demo.model.vehicleMake;
import com.example.demo.model.vehicleType;
import com.example.demo.service.VehicleTypeService;

@Controller
public class VehicleTypeController {
	
	@Autowired
	private VehicleTypeService vehicleTypeService;
;
	
	@GetMapping("/vehicle-type")
	
	String getVehicleTypeList(Model model) {
		
		List<vehicleType> vehicleType = vehicleTypeService.getAllVehilceType();
		
		
		model.addAttribute("vehicleType", vehicleType);
		
		return "vehicle-type";
	}
	
	@PostMapping("/vehicleType/addVehicleType")
	
	public String addlocation(vehicleType vehicleType) {
		
		vehicleTypeService.addVehicleType(vehicleType);
		
		
		return "redirect:/vehicle-type";
	}
	
	@RequestMapping("/vehicleType/edit/")
	@ResponseBody
	public vehicleType getvehicleTypeID(int id) {
		
		return vehicleTypeService.getVehicleTypeByID(id);
	}
	
	@RequestMapping(value="/vehicleType/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (vehicleType vehicleType) {
		
		vehicleTypeService.addVehicleType(vehicleType);
		
		return "redirect:/vehicle-type";
	}
	
	@RequestMapping(value="/vehicleType/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteLocation(int id) {
		
		vehicleTypeService.deleteVehicleMakeType(id);
		
		return "redirect:/vehicle-type";
	}
	
	

}
