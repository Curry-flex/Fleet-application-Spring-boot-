package com.example.demo.repository;

import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
//	@Query(
//			value="select count(*) from employee",
//			nativeQuery = true
//			)
//	public int coutOfEmployee() {
//		
//		
//	}

}
