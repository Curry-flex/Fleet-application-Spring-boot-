package com.example.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@MappedSuperclass
@JsonIdentityInfo (generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class commonObject extends Auditable<String> {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String descrption;
	private String details;
	
	public commonObject(int id, String descrption, String details) {
		super();
		this.id = id;
		this.descrption = descrption;
		this.details = details;
	}

	public commonObject() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "commonObject [id=" + id + ", descrption=" + descrption + ", details=" + details + "]";
	}
	
	
	
	
	
	

}
