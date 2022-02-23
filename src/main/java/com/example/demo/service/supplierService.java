package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.model.Supplier;
import com.example.demo.repository.supplierRepository;

@Service
public class supplierService {
	

	@Autowired
	private  supplierRepository supplierRepository;
	public void addSupplier(Supplier supplier) {
		
		 supplierRepository.save(supplier);
	}
	
	
	public List<Supplier> getAllSupplier(){
		
		return  supplierRepository.findAll();
	}

	public Supplier getSupplierByID(int id) {
		
		return  supplierRepository.findById(id).get();
	}
	
	public void deleteSupplier(int id) {
		
		 supplierRepository.deleteById(id);
	}


}
