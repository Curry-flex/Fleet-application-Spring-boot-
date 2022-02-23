package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice;
import com.example.demo.model.Location;
import com.example.demo.repository.invoiceRepository;

@Service
public class invoiceService {
	
	@Autowired
	private invoiceRepository repository;
	public void Addinvoice(Invoice invoice) {
		repository.save(invoice);
	}
	
	
	public List<Invoice> getAllInvoice(){
		
		return repository.findAll();
	}

	public Invoice getInvoiceByID(int id) {
		
		return repository.findById(id).get();
	}
	
	public void deleteInvoice(int id) {
		
		repository.deleteById(id);
	}

}
