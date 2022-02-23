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
import com.example.demo.model.Country;
import com.example.demo.model.State;
import com.example.demo.model.Supplier;
import com.example.demo.service.CountryService;
import com.example.demo.service.StateService;
import com.example.demo.service.clientService;
import com.example.demo.service.supplierService;

@Controller
public class SupplierController {
	
	
	

	@Autowired
	private supplierService supplierService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService
;
	
	@GetMapping("/supplier")
	
	String getClienteList(Model model) {
		
		List<Supplier> supplier = supplierService.getAllSupplier();
		List<Country> country = countryService.getCountryList();
		List<State> state = stateService.getAllState();
		
		
		model.addAttribute("supplier", supplier);
		model.addAttribute("countries", country);
		model.addAttribute("state", state);
		
		return "Supplier";
	}
	
	@PostMapping("/supplier/addSupplier")
	
	public String addClient(Supplier supplier) {
		
		supplierService.addSupplier(supplier);
		
		
		return "redirect:/supplier";
	}
	
	@RequestMapping("/supplier/edit/")
	@ResponseBody
	public Supplier getClientID(int id) {
		
		return supplierService.getSupplierByID(id);
	}
	
	@RequestMapping(value="/supplier/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (Supplier supplier) {
		
		supplierService.addSupplier(supplier);
		
		return "redirect:/supplier";
	}
	
	@RequestMapping(value="/supplier/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteClient(int id) {
		
		supplierService.deleteSupplier(id);
		
		return "redirect:/supplier";
	}
	
	
	
//	
//	@GetMapping("/supplier")
//	
//	String getVehicleData() {
//		return "Supplier";
//	}

}
