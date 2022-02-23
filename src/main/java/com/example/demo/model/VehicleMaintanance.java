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
public class VehicleMaintanance extends Auditable<String> {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	private Date startDate;
	
	
	private Date endDate;
	
	private String price;
	
	@ManyToOne
	@JoinColumn(name="supplier_id", insertable=false, updatable=false)
	private Supplier supplier;
	private Integer supplier_id;
	
	@ManyToOne
	@JoinColumn(name="vehicle_id", insertable=false, updatable=false)
	private Vehicle vehicle;
	private Integer vehicle_id;
	
	private String remarks;

}
