package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitle {
	
	@GetMapping("/job-title")
	
	String getVehicleData() {
		return "Job-title";
	}

}
