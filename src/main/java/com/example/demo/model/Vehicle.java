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
public class Vehicle  extends Auditable<String>{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	private String name;
	@ManyToOne
	@JoinColumn(name="vehicleType_id", insertable=false, updatable=false)
	private vehicleType vehicleType;
	private Integer vehicleType_id;	
	
	private String vehicleNumber;
	
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registrationDate;
	
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date acquisitionDate;
	
	
	@ManyToOne
	@JoinColumn(name="vehicleMake_id", insertable=false, updatable=false)
	private vehicleMake vehicleMake;
	private Integer vehicleMake_id;
	
	
	private String fuelCapacity;
	
	private String netWeight;

	@ManyToOne
	@JoinColumn(name="employee_id", insertable=false, updatable=false)
	private Employee employee;
	private Integer employee_id;
	
	@ManyToOne
	@JoinColumn(name="vehiclemodel_id", insertable=false, updatable=false)
	private vehicleModel vehicleModel;	
	private Integer vehiclemodel_id;

	@ManyToOne
	@JoinColumn(name="location_id", insertable=false, updatable=false)	
	private Location location;
	private Integer location_id;
	
	
	@OneToMany(
			mappedBy = "vehicle",
			cascade = CascadeType.REMOVE
			)
	
	private List<vehicleHire> vehicleHire; 
	
	

	@OneToMany(
			mappedBy = "vehicle",
			cascade = CascadeType.REMOVE
			)

	private List<VehicleMaintanance> vehicleMaintanace; 
	
	
	@OneToMany(
			mappedBy = "vehicle",
			cascade = CascadeType.REMOVE
			)

	private List<vehicleMovement> movements; 
	
	

}
