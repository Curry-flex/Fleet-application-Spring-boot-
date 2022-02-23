package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vehicle;
import com.example.demo.model.vehicleHire;
import com.example.demo.repository.VehicleRepository;

@Service
public class vehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;
	
	public List<Vehicle> getAllVehicle(){
		return vehicleRepository.findAll();
	}
	
   public void addVehicle(Vehicle vehicle) {
		
		vehicleRepository.save(vehicle);
	}
   
   public Vehicle getVehicleByID(int id) {
		
		return vehicleRepository.findById(id).get();
	}
	
	public void deleteVehicle(int id) {
		
		vehicleRepository.deleteById(id);
	}
	
	
	public long getCountVehicle() {
		
		return vehicleRepository.count();
	}


	
	
	
}
