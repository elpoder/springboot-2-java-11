package com.elpoder.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elpoder.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
