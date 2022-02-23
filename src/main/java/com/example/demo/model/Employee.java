package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee  extends Auditable<String>{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstname;
	private String lastname;
	private String gender;
	private Date hireDate;
	private String phone;
	private String email;
	
	@ManyToOne
	@JoinColumn(
			name="country_id",
			insertable = false,
			updatable = false
			)
   private Country country;
	private int country_id;
	
	@ManyToOne
	@JoinColumn(
			name="state_id",
			insertable = false,
			updatable = false
			)
   private State state;
	private int state_id;
	
	
	@OneToMany(
			mappedBy = "employee",
			cascade = CascadeType.REMOVE
			)
	
	private List<Vehicle> vehicle; 
	

}
