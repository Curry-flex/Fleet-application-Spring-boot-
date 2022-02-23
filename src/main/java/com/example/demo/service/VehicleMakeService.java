package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Location;
import com.example.demo.model.vehicleMake;
import com.example.demo.repository.vehicleMakeRepository;
import com.example.demo.repository.vehicleMakeRepository;

@Service
public class VehicleMakeService {
	

	@Autowired
	private vehicleMakeRepository vehicleMakeRepository;
	public void addVehicleMake(vehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}
	
	
	public List<vehicleMake> getAllVehilceMake(){
		
		return vehicleMakeRepository.findAll();
	}

	public vehicleMake geVehicleMakeByID(int id) {
		
		return vehicleMakeRepository.findById(id).get();
	}
	
	public void deleteVehicleMake(int id) {
		
		vehicleMakeRepository.deleteById(id);
	}

}
