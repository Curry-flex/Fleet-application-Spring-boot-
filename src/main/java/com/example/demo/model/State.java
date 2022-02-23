package com.example.demo.model;

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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo (generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class State extends Auditable<String> {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String capital;
	private String code;
	
	@ManyToOne(
			 cascade = CascadeType.DETACH
			)
	@JoinColumn(
			name="country_id",
			insertable=false, updatable=false
			)
	private Country country;
	private int country_id;
	
	private String details;
	
	@OneToMany(
			mappedBy = "state",
			cascade = CascadeType.REMOVE
			)
	
	private List<Client> client;
	
	
	
	@OneToMany(
			mappedBy = "state",
			cascade = CascadeType.REMOVE
			)
	
	private List<Location> location;
	
	
	@OneToMany(
			mappedBy = "state",
			cascade = CascadeType.REMOVE
			)
	
	private List<Employee> employee;
	
	@OneToMany(
			mappedBy = "state",
			cascade = CascadeType.REMOVE
			)
	
	private List<Supplier> supplier;
	
	
	

}
