package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Country;
import com.example.demo.model.State;
import com.example.demo.service.StateService;

import antlr.collections.List;

@Controller
public class StateController {
	@Autowired
	
	private StateService stateService;
	
	@GetMapping("/state")
	
	String getState(Model model) {
	
		 java.util.List<State> state = stateService.getAllState();
		 model.addAttribute("state",state);
		 
		 java.util.List<Country> country = stateService.getAllCountries();
		 model.addAttribute("countries",country);
		return "State";
	}
	

	
	@PostMapping("/state/addState")
	
	public String addState(State state) {
		stateService.addState(state);
		
		return "redirect:/state";
		
	}
	
	@RequestMapping("/state/edit")
	@ResponseBody
	
	State getStateByID(int id) {
		
	return stateService.getStateID(id);
	}
	
	@RequestMapping(value="/state/update", method = {RequestMethod.PUT ,RequestMethod.GET})
	
	String updateState(State state) {
		
		stateService.addState(state);
		
		return "redirect:/state";
	}
	
	@RequestMapping(value="/state/delete" , method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	public String deleteState(int id) {
		
		stateService.delete(id);
		
		return "redirect:/state";
	}

}
