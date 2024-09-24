package com.educandoweb.cursosbjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursosbjava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

	
}
