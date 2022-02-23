package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.model.vehicleModel;
import com.example.demo.repository.clientRepositrory;


@Service
public class clientService {
	

	@Autowired
	private clientRepositrory repositrory;
	public void addClient(Client client) {
		
		 repositrory.save(client);
	}
	
	
	public List<Client> getAllClient(){
		
		return  repositrory.findAll();
	}

	public Client getClientByID(int id) {
		
		return  repositrory.findById(id).get();
	}
	
	public void deleteClient(int id) {
		
		 repositrory.deleteById(id);
	}
	
public long getCountClient() {
		
		return repositrory.count();
	}


}
