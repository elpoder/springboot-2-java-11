package com.elpoder.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elpoder.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
