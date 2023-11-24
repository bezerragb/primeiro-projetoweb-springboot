package com.primeiroprojetoweb.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojetoweb.projetoweb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
