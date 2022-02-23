package com.example.demo.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import com.example.demo.Security.Model.Roles;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


public class User extends Auditable<String>{
	
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int id;

private String firstname;
private String lastname;
private String username;
private String password;



@ManyToMany(
		cascade = CascadeType.ALL,
		fetch = FetchType.EAGER
		)
@JoinTable(
		name="user_role",
		joinColumns = {@JoinColumn(name="user_id")},
		inverseJoinColumns = {@JoinColumn(name="roles_id")}
		
		
		)
Set<Roles> roles = new HashSet<>();


}
