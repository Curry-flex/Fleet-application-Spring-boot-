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

import org.springframework.format.annotation.DateTimeFormat;

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
public class Invoice extends Auditable<String> {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//@DateTimeFormat(pattern = "mm/dd/yyy")	
	private Date invoiceDate;
	
	@ManyToOne(
			 cascade = CascadeType.DETACH
			)
	@JoinColumn(
			name="invoiceStatus_id",
			insertable=false, updatable=false
			
			)
	private invoiceStatus invoiceStatus;
	private int invoiceStatus_id;
	
	
	@ManyToOne(
			 cascade = CascadeType.DETACH
			)
	@JoinColumn(
			name="client_id",
			insertable=false, updatable=false
			
			)
	private Client client;
	private int client_id;
	
	
}
