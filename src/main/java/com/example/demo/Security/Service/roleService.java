package com.example.demo.Security.Service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Security.Model.Roles;
import com.example.demo.Security.Repository.roleRepository;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@Service
public class roleService {

	 @Autowired
	 private roleRepository roleRepository;
	 
	 @Autowired
	 private UserRepository userRepository;
	 
	 public void addrole(Roles role) {
			roleRepository.save(role);
		}
		
		
		public List<Roles> getAllrole(){
			
			return roleRepository.findAll();
		}

		public Roles getroleByID(int id) {
			
			return roleRepository.findById(id).get();
		}
		
		public void deleterole(int id) {
			
			roleRepository.deleteById(id);
		}
		
		public void assignRole(int userID , int roleID) {
			
			User user = userRepository.findById(userID).orElse(null);
			Roles role = roleRepository.findById(roleID).orElse(null);
			
			Set<Roles> userRoles =user.getRoles();
			
			userRoles.add(role);
			user.setRoles(userRoles);
			userRepository.save(user);
		}
		
		public void unassingRole(int userID ,int roleID) {
			User user = userRepository.findById(userID).orElse(null);
			Roles role = roleRepository.findById(roleID).orElse(null); 
			
			Set<Roles> userroles = user.getRoles();
			
			userroles.removeIf(x -> x.getId() == roleID);
			userRepository.save(user);
			
		}
		
		public Set<Roles> getUserRoles(User user) {
			
			return user.getRoles();
		}
		
		
		public Set<Roles> notAssignrRoles(User user){
			
		 return	roleRepository.getUserNotAssignedRole(user.getId());
		}
}
