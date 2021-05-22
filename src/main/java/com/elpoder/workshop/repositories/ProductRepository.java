package com.elpoder.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elpoder.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
