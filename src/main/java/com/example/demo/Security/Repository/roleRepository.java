package com.example.demo.Security.Repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Security.Model.Roles;

public interface roleRepository extends JpaRepository<Roles, Integer> {
	
	@Query(
			value="SELECT *FROM roles where id  NOT in(SELECT roles_id from user_role WHERE user_id =?1)",
			nativeQuery = true
			)
	
	 Set<Roles> getUserNotAssignedRole(int UserID);

}
