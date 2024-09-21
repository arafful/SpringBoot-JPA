package com.educandoweb.cursosbjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursosbjava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

	
}
