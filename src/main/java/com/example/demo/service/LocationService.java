package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Location;
import com.example.demo.repository.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepository;
	public void addLocation(Location location) {
		locationRepository.save(location);
	}
	
	
	public List<Location> getAllLocation(){
		
		return locationRepository.findAll();
	}

	public Location getLocationByID(int id) {
		
		return locationRepository.findById(id).get();
	}
	
	public void deleteLocation(int id) {
		
		locationRepository.deleteById(id);
	}
}
