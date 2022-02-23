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
import com.example.demo.model.Employee;
import com.example.demo.model.State;
import com.example.demo.service.CountryService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.StateService;
import com.example.demo.service.clientService;

@Controller
public class EmployeeController {
	
	

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService
;
	
	@GetMapping("/employee")
	
	String getClienteList(Model model) {
		
		List<Employee> employee =employeeService.getAllEmployee();
		List<Country> country = countryService.getCountryList();
		List<State> state = stateService.getAllState();
		
		
		model.addAttribute("employee", employee);
		model.addAttribute("countries", country);
		model.addAttribute("state", state);
		
		System.out.println(employee.size());
		return "Employee";
	}
	
	@PostMapping("/employee/addEmployee")
	
	public String addEmployee(Employee employee) {
		
		employeeService.addEmployee(employee);
		
		
		return "redirect:/employee";
	}
	
	@RequestMapping("/employee/edit/")
	@ResponseBody
	public Employee getEmployee(int id) {
		
		return employeeService.getEmployeeByID(id);
	}
	
	@RequestMapping(value="/employee/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (Employee employee) {
		
		employeeService.addEmployee(employee);
		
		return "redirect:/employee";
	}
	
	@RequestMapping(value="/employee/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteEmployee(int id) {
		
		employeeService.deleteEmployee(id);
		
		return "redirect:/employee";
	}
	
	
	
//	
//	@GetMapping("/employee")
//	
//	String getVehicleData() {
//		return "Employee";
//	}

}
