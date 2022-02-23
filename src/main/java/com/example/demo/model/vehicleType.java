package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@JsonIdentityInfo (generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class vehicleType extends commonObject {
	
	@OneToMany(
			mappedBy = "vehicleType",
			cascade = CascadeType.REMOVE
			)
	
	private List<Vehicle> vehicle; 
	

}
