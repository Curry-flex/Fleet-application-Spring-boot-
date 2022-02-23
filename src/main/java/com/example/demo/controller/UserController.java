package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@GetMapping("/register")
	
	String getUserData() {
		
		
		return "Register";
		
		
		
	}
	
	@PostMapping(value="/register/addNew")
	
	public RedirectView addUser(User user, RedirectAttributes attr) {
		
		userService.addUser(user);
		
		RedirectView rv = new RedirectView("/login",true);
		attr.addFlashAttribute("message", "Registration Successfully");
		
		return rv;
	}

}
