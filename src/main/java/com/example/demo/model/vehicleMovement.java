package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

public class vehicleMovement extends Auditable<String>{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	
	@ManyToOne
	@JoinColumn(name="vehicle_id", insertable=false, updatable=false)
	private Vehicle vehicle;
	private int vehicle_id;
	
	@ManyToOne
	@JoinColumn(name="location1_id", insertable=false, updatable=false)
	private Location location1;
	private int location1_id;
	

	private Date date1;
	
	@ManyToOne
	@JoinColumn(name="location2_id", insertable=false, updatable=false)
	private Location location2;
	private int location2_id;
	
	
	private Date date2;

	private String remarks;

}
