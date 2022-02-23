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
import com.example.demo.model.Employee;
import com.example.demo.model.Location;
import com.example.demo.model.Vehicle;
import com.example.demo.model.vehicleHire;
import com.example.demo.model.vehicleMake;
import com.example.demo.model.vehicleModel;
import com.example.demo.model.vehicleType;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.LocationService;
import com.example.demo.service.VehicleMakeService;
import com.example.demo.service.VehicleModelService;
import com.example.demo.service.VehicleTypeService;
import com.example.demo.service.clientService;
import com.example.demo.service.vehicleService;
import com.example.demo.service.vehicleService;

@Controller
public class vehicleController {
	


	@Autowired
	private VehicleMakeService vehicleMakeService;
	
	@Autowired
	private VehicleTypeService vehicleTypeService;
	
	@Autowired
	private VehicleModelService service;
	
	@Autowired
	private EmployeeService employeeService;
    
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private vehicleService vehicleService;
	
	
	
    @GetMapping("/vehicle-data")
	
	String getVehicleMovementlList(Model model) {
		
		List<vehicleMake> make = vehicleMakeService.getAllVehilceMake();
		List<vehicleModel> modo = service.getAllVehilceModel();
		List<vehicleType> type = vehicleTypeService.getAllVehilceType();
		List<Employee> employee = employeeService.getAllEmployee();
		List<Location> location = locationService.getAllLocation();
		List<Vehicle> vehicle = vehicleService.getAllVehicle();
		
		
		
		model.addAttribute("make", make);
		model.addAttribute("location", location);
		
		model.addAttribute("vehicle", vehicle);
		model.addAttribute("modo", modo);
		model.addAttribute("type", type);
		model.addAttribute("employee", employee);
		
	
		return "Vehicle";
	}
	
	@PostMapping("/vehicle/addVehicle")
	
	public String addVehicle(Vehicle vehicle) {
		
		vehicleService.addVehicle(vehicle);
		
		
		return "redirect:/vehicle-data";
	}
	
	@RequestMapping("/vehicle/edit/")
	@ResponseBody
	public Vehicle getvehicleID(int id) {
		
		return vehicleService.getVehicleByID(id);
	}
	
	@RequestMapping(value="/vehicle/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (Vehicle vehicle) {
		
		vehicleService.addVehicle(vehicle);
		return "redirect:/vehicle-data";
	}
	
	@RequestMapping(value="/vehicle/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteHVehicle(int id) {
		
		vehicleService.deleteVehicle(id);
		
		return "redirect:/vehicle-data";
	}
	
	
	
	
	
	

}
