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

import com.example.demo.model.vehicleModel;
import com.example.demo.model.vehicleType;
import com.example.demo.service.VehicleModelService;
import com.example.demo.service.VehicleTypeService;

@Controller
public class VehicleModelController {
	
	
	@Autowired
	private VehicleModelService vehicleModelService;

	
    @GetMapping("/vehicle-model")
	
	String getVehicleModelList(Model model) {
		
		List<vehicleModel> vehicleModel = vehicleModelService.getAllVehilceModel();
		
		
		model.addAttribute("vehicleModel", vehicleModel);
		
		return "vehicle-model";
	}
	
	@PostMapping("/vehicleModel/addVehicleModel")
	
	public String addModel(vehicleModel vehicleModel) {
		
		vehicleModelService.addVehicleModel(vehicleModel);
		
		
		return "redirect:/vehicle-model";
	}
	
	@RequestMapping("/vehicleModel/edit/")
	@ResponseBody
	public vehicleModel getvehicleTypeID(int id) {
		
		return vehicleModelService.getVehicleModelByID(id);
	}
	
	@RequestMapping(value="/vehicleModel/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (vehicleModel veModel) {
		
		vehicleModelService.addVehicleModel(veModel);
		
		return "redirect:/vehicle-model";
	}
	
	@RequestMapping(value="/vehicleModel/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteModel(int id) {
		
		vehicleModelService.deleteVehicleModel(id);
		
		return "redirect:/vehicle-model";
	}
	
	
	

}
