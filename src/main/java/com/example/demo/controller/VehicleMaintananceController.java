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

import com.example.demo.model.Supplier;
import com.example.demo.model.Vehicle;
import com.example.demo.model.VehicleMaintanance;
import com.example.demo.model.vehicleModel;
import com.example.demo.service.vehicleMaintanaceService;
import com.example.demo.service.supplierService;
import com.example.demo.service.vehicleMaintanaceService;
import com.example.demo.service.vehicleService;

@Controller
public class VehicleMaintananceController {
	

	
	@Autowired
	private vehicleMaintanaceService vehicleMaintanaceService;
    
	@Autowired
	private supplierService supplierService;
	
	@Autowired
	private vehicleService vehicleService;
	
    @GetMapping("/maintanance")
	
	String getVehicleMaintancelList(Model model) {
		
		List<VehicleMaintanance> vmaintanance = vehicleMaintanaceService.getAllVehilceMaintanance();
		List<Supplier> supplier = supplierService.getAllSupplier();
		List<Vehicle> vehicle = vehicleService.getAllVehicle();
		
		
		model.addAttribute("maintanance", vmaintanance);
		model.addAttribute("supplier", supplier);
		
		model.addAttribute("vehicle", vehicle);
		
		
		return "Maintanance";
	}
	
	@PostMapping("/maintanance/addVehicleMaintanance")
	
	public String addMaintanance(VehicleMaintanance maintanance) {
		
		vehicleMaintanaceService.addVehicleMaintanance(maintanance);
		
		
		return "redirect:/maintanance";
	}
	
	@RequestMapping("/maintanance/edit/")
	@ResponseBody
	public VehicleMaintanance getvehicleMaintananceTypeID(int id) {
		
		return vehicleMaintanaceService.getVehicleMaintananceByID(id);
	}
	
	@RequestMapping(value="/maintanance/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (VehicleMaintanance maintanance) {
		
		vehicleMaintanaceService.addVehicleMaintanance(maintanance);
		
		return "redirect:/maintanance";
	}
	
	@RequestMapping(value="/maintanance/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteMaintanance(int id) {
		
		vehicleMaintanaceService.deleteVehicleMaintanance(id);
		
		return "redirect:/maintanance";
	}
	
	
	
	
	
//	@GetMapping("/maintanance")
//	
//	String getVehicleData() {
//		return "Maintanance";
//	}

}
