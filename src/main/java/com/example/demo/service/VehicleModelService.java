package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.vehicleModel;
import com.example.demo.model.vehicleType;
import com.example.demo.repository.vehicleModelRepositroy;
import com.example.demo.repository.vehicleModelRepositroy;

@Service
public class VehicleModelService {
	

	@Autowired
	private vehicleModelRepositroy vehicleModelRepositroy;
	public void addVehicleModel(vehicleModel vehicleModel) {
		
		vehicleModelRepositroy.save(vehicleModel);
	}
	
	
	public List<vehicleModel> getAllVehilceModel(){
		
		return vehicleModelRepositroy.findAll();
	}

	public vehicleModel getVehicleModelByID(int id) {
		
		return vehicleModelRepositroy.findById(id).get();
	}
	
	public void deleteVehicleModel(int id) {
		
		vehicleModelRepositroy.deleteById(id);
	}


}
