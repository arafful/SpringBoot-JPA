package com.educandoweb.cursosbjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursosbjava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

	
}
