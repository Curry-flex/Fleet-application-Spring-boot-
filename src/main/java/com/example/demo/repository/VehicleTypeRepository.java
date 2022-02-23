package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.vehicleType;

public interface VehicleTypeRepository extends JpaRepository<vehicleType, Integer>{
	

}
