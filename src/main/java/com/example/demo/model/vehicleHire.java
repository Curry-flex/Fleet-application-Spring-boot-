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

public class vehicleHire extends Auditable<String> {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int id;

@ManyToOne
@JoinColumn(name="vehicle_id", insertable=false, updatable=false)
private Vehicle vehicle;
private Integer vehicle_id;


private Date dateOut;

//private String timeOut;


private Date dateIn;

//private String timeIn;

@ManyToOne
@JoinColumn(name="client_id", insertable=false, updatable=false)
private Client client;
private Integer client_id;

@ManyToOne
@JoinColumn(name="location_id", insertable=false, updatable=false)
private Location location;
private Integer location_id;

private String price;

private String remarks;



}
