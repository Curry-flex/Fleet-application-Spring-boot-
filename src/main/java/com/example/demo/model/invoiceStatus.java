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
public class invoiceStatus extends Auditable<String> {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private int id;
	private String status;
	private String  description;
	
	
	@OneToMany(
			mappedBy = "invoiceStatus",
			
			cascade = CascadeType.REMOVE
			)
	private List<Invoice> invoices;
	
	

}
