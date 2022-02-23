package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Country;
import com.example.demo.model.State;
import com.example.demo.model.invoiceStatus;
import com.example.demo.repository.CountryRepository;
import com.example.demo.repository.invoiceStatusRepository;

@Service
public class InvoiceStatusService {
	
	@Autowired
	private invoiceStatusRepository statusRepository;
	
	
	public void addinvoiceStatus(invoiceStatus status) {
		
      statusRepository.save(status);
		
	}
	
	public List<invoiceStatus> getAllInvoiceStatus(){

		return  statusRepository.findAll();
	}
	
	

	public invoiceStatus getSInvoiceStatusID(int id) {
	return	 statusRepository.findById(id).get();
	}
	
	public void delete(int id) {

		statusRepository.deleteById(id);
	}

}
