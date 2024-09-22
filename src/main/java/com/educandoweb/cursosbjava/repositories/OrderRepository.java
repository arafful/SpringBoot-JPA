package com.educandoweb.cursosbjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursosbjava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

	
}
