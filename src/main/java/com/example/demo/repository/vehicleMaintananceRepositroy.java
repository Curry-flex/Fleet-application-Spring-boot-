package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.VehicleMaintanance;

public interface vehicleMaintananceRepositroy extends JpaRepository<VehicleMaintanance, Integer> {

}
