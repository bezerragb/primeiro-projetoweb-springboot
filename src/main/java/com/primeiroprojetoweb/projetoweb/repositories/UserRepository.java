package com.primeiroprojetoweb.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojetoweb.projetoweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
