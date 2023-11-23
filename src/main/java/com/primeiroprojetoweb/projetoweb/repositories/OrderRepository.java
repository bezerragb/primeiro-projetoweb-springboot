package com.primeiroprojetoweb.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojetoweb.projetoweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
