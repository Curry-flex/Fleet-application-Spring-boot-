package com.example.demo.Security.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Security.Model.Roles;
import com.example.demo.Security.Service.roleService;
import com.example.demo.model.User;
import com.example.demo.service.UserService;



@Controller
public class roleController {
	

	@Autowired
	private roleService roleService;
	
	@Autowired
	private UserService userService;
;
	
	@GetMapping("/role")
	
	String getRolesList(Model model) {
		
		List<Roles> role= roleService.getAllrole();
		
		
		model.addAttribute("role", role);
		
		return "Role";
	}
	
	@PostMapping("/role/addRole")
	
	public String addRoles(Roles Roles) {
		
		roleService.addrole(Roles);
		
		
		return "redirect:/role";
	}
	
	@RequestMapping("/role/edit/")
	@ResponseBody
	public Roles getRolesID(int id) {
		
		return roleService.getroleByID(id);
	}
	
	@RequestMapping(value="/role/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (Roles Roles) {
		
		roleService.addrole(Roles);
		
		return "redirect:/role";
	}
	
	@RequestMapping(value="/role/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteRole(int id) {
		
		roleService.deleterole(id);
		
		return "redirect:/role";
	}
	
	
	@GetMapping("/security/userEdit/{id}")
	
	public String getAlluserRoles(@PathVariable("id") Integer id, Model model) {
		
		User user  = userService.getUserByID(id);
		model.addAttribute("user",user);
		model.addAttribute("userRole", roleService.getUserRoles(user));
		model.addAttribute("userNotRole", roleService.notAssignrRoles(user));
		
		return "/userEdit";
		
	}
	
	
	
	@RequestMapping("role/assign/{userID}/{roleID}")
	
	public String assignRole(@PathVariable int userID , @PathVariable int roleID) {
		
		roleService.assignRole(userID, roleID);
		
		return "redirect:/security/userEdit/" + userID;
	}
	
	
	
	@RequestMapping("role/unassign/{userID}/{roleID}")
	
	public String UnassignRole(@PathVariable int userID , @PathVariable int roleID) {
		
		roleService.unassingRole(userID, roleID);
		
		return "redirect:/security/userEdit/" + userID;
	}
	
	

}
