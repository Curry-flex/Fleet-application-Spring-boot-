package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.vehicleHire;
import com.example.demo.model.vehicleMovement;
import com.example.demo.repository.vehicleHireRepository;
import com.example.demo.repository.vehicleHireRepository;

@Service
public class vehicleHireService {
	


	@Autowired
	private vehicleHireRepository vehicleHireRepository;
	public void addVehicleHire(vehicleHire vehicleHire) {
		
		vehicleHireRepository.save(vehicleHire);
	}
	
	
	public List<vehicleHire> getAllVehicleHire(){
		
		return vehicleHireRepository.findAll();
	}

	public vehicleHire getVehicleHireByID(int id) {
		
		return vehicleHireRepository.findById(id).get();
	}
	
	public void deleteVehicleHire(int id) {
		
		vehicleHireRepository.deleteById(id);
	}




}
