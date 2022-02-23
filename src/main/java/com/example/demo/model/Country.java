package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo (generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Country extends Auditable<String>{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private String capital;
	private String description;
	private String nationality;
	private String continent;
	
	@OneToMany(
			mappedBy = "country",
			 cascade = CascadeType.REMOVE
			)

  private List<State> state;
	
	@JsonIgnore
	@OneToMany(
			mappedBy = "country",
			cascade = CascadeType.REMOVE
			)
	
	private List<Client> client;
	
	@JsonIgnore
	@OneToMany(
			mappedBy = "country",
			cascade = CascadeType.REMOVE
			)
	
	private List<Location> location;
	
	@OneToMany(
			mappedBy = "country",
			cascade = CascadeType.REMOVE
			)
	
	private List<Employee> employee;
	
	@OneToMany(
			mappedBy = "country",
			cascade = CascadeType.REMOVE
			)
	
	private List<Supplier> supplier;
	
  
}
