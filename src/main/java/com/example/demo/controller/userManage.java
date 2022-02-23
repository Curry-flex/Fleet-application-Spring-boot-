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

import com.example.demo.Security.Model.Roles;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class userManage {
	
	@Autowired
	private UserService userService;
;
	
	@GetMapping("/user")
	
	String getRolesList(Model model) {
		
		List<User> user= userService.getAllUser();
		
		
		model.addAttribute("user", user);
		
		return "User";
	}
	
	@PostMapping("/user/addUser")
	
	public String addUser(User user) {
		
		userService.addUser(user);
		
		
		return "redirect:/user";
	}
	
	@RequestMapping("/user/edit/")
	@ResponseBody
	public User getUserID(int id) {
		
		return userService.getUserByID(id);
	}
	
	@RequestMapping(value="/user/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (User user) {
		
		userService.addUser(user);
		
		return "redirect:/user";
	}
	
	@RequestMapping(value="/user/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteUser(int id) {
		
		userService.deleteUserByID(id);
		
		return "redirect:/user";
	}
	
	

}
