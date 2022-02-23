package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.VehicleMaintanance;
import com.example.demo.model.vehicleMovement;
import com.example.demo.repository.vehicleMovementRepository;
import com.example.demo.repository.vehicleMovementRepository;

@Service
public class vehicleMovementService {
	


	@Autowired
	private vehicleMovementRepository vehicleMovementRepository;
	public void addVehicleMovement(vehicleMovement vehicleMovement) {
		
		vehicleMovementRepository.save(vehicleMovement);
	}
	
	
	public List<vehicleMovement> getAllVehilceMovement(){
		
		return vehicleMovementRepository.findAll();
	}

	public vehicleMovement getVehicleMovementByID(int id) {
		
		return vehicleMovementRepository.findById(id).get();
	}
	
	public void deleteVehicleMovement(int id) {
		
		vehicleMovementRepository.deleteById(id);
	}



}
