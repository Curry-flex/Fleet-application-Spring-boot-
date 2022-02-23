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
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Location  extends Auditable<String>{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private String address;
	
	@ManyToOne(
			cascade = CascadeType.DETACH
			)
	@JoinColumn(
			name="country_id",
			insertable=false, updatable=false
			
			)
	private Country country;
	private int country_id;
	
	
	@ManyToOne(
			cascade = CascadeType.DETACH
			)
	@JoinColumn(
			name="state_id",
			insertable=false, updatable=false
			
			)
	private State state;
	private int state_id;
	
	@OneToMany(
			mappedBy = "location",
			cascade = CascadeType.REMOVE
			)
	
	private List<Vehicle> vehicle; 
	
	
	@OneToMany(
			mappedBy = "location",
			cascade = CascadeType.REMOVE
			)
	
	private List<vehicleHire> vehicleHire; 
	
	
	@OneToMany(
			mappedBy = "location1",
			cascade = CascadeType.REMOVE
			)

	private List<Location> location1; 
	
	
	@OneToMany(
			mappedBy = "location2",
			cascade = CascadeType.REMOVE
			)

	private List<Location> location2; 
	
	
	

}
