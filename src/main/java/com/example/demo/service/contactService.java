package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;
import com.example.demo.repository.clientRepositrory;

@Service
public class contactService {
	

	@Autowired
	private ContactRepository repository;
	public void addContact(Contact contact) {
		
		repository.save(contact);
	}
	
	
	public List<Contact> getAllContact(){
		
		return repository.findAll();
	}

	public Contact getContactID(int id) {
		
		return repository.findById(id).get();
	}
	
	public void deleteContact(int id) {
		
		repository.deleteById(id);
	}



}
