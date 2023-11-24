package com.primeiroprojetoweb.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojetoweb.projetoweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
