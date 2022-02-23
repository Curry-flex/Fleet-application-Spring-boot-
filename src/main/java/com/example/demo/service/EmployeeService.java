package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.Vehicle;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeService {
	

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	 public void addEmployee(Employee employee) {
			
			employeeRepository.save(employee);
		}
	   
	   public Employee getEmployeeByID(int id) {
			
			return employeeRepository.findById(id).get();
		}
		
		public void deleteEmployee(int id) {
			
			employeeRepository.deleteById(id);
		}
		
		
		public long getCount() {
			
			return employeeRepository.count();
		}


	

}
