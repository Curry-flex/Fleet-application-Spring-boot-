package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Country;
import com.example.demo.model.State;
import com.example.demo.repository.CountryRepository;
import com.example.demo.repository.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	public void addState(State state) {
		
      stateRepository.save(state);
		
	}
	
	public List<State> getAllState(){

		return  stateRepository.findAll();
	}
	
	public List<Country> getAllCountries(){
		return countryRepository.findAll();
	}

	public State getStateID(int id) {
	return	 stateRepository.findById(id).get();
	}
	
	public void delete(int id) {

		stateRepository.deleteById(id);
	}
}
