package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void addUser(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
	}
	
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	public User getUserByID(int id) {
		
		return userRepository.findById(id).get();
	}
	
   public void deleteUserByID(int id) {
		
		userRepository.deleteById(id);
	}

}
