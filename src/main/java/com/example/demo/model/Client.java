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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client  extends Auditable<String>{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String address;
	private String city;
	private String phone;
	private String website;
	private String email;
	
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
			mappedBy = "client",
			cascade = CascadeType.REMOVE
			)

	private List<Invoice> invoices;
	
	
	@OneToMany(
			mappedBy = "client",
			cascade = CascadeType.REMOVE
			)
	
	private List<vehicleHire> vehicleHire; 
	
	
	
	
	
}
