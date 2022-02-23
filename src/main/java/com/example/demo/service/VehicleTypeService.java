package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.vehicleMake;
import com.example.demo.model.vehicleType;
import com.example.demo.repository.VehicleTypeRepository;


@Service
public class VehicleTypeService {
	

	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
	public void addVehicleType(vehicleType vehicleType) {
		
		vehicleTypeRepository.save(vehicleType);
	}
	
	
	public List<vehicleType> getAllVehilceType(){
		
		return vehicleTypeRepository.findAll();
	}

	public vehicleType getVehicleTypeByID(int id) {
		
		return vehicleTypeRepository.findById(id).get();
	}
	
	public void deleteVehicleMakeType(int id) {
		
		vehicleTypeRepository.deleteById(id);
	}

}
