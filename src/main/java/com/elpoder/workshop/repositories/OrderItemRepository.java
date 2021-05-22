package com.elpoder.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elpoder.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
