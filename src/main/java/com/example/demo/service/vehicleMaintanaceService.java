package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.VehicleMaintanance;
import com.example.demo.model.vehicleModel;
import com.example.demo.repository.vehicleMaintananceRepositroy;
import com.example.demo.repository.vehicleMaintananceRepositroy;

@Service
public class vehicleMaintanaceService {
	

	@Autowired
	private vehicleMaintananceRepositroy vehicleMaintananceRepositroy;
	public void addVehicleMaintanance(VehicleMaintanance maintanance) {
		
		vehicleMaintananceRepositroy.save(maintanance);
	}
	
	
	public List<VehicleMaintanance> getAllVehilceMaintanance(){
		
		return vehicleMaintananceRepositroy.findAll();
	}

	public VehicleMaintanance getVehicleMaintananceByID(int id) {
		
		return vehicleMaintananceRepositroy.findById(id).get();
	}
	
	public void deleteVehicleMaintanance(int id) {
		
		vehicleMaintananceRepositroy.deleteById(id);
	}



}
