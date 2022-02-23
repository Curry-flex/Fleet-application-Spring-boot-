package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;

@Service
public class CountryService {
	@Autowired
	private CountryRepository countryrepository;
	
	public List<Country> getCountryList(){
		
		return countryrepository.findAll();
	}

	
	public void save(Country country) {
		countryrepository.save(country);
	}
	
	public Country getCountryByID(int id) {
		
		return countryrepository.findById(id).get();
	}
	
	public void deleteCountry(int id) {
		
		countryrepository.deleteById(id);
	}
	
public long getCountCountry() {
		
		return countryrepository.count();
	}
}
