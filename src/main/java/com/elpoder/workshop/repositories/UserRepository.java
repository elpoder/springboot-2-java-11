package com.elpoder.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elpoder.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
