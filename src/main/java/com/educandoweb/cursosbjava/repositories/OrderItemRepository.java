package com.educandoweb.cursosbjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursosbjava.entities.OrderItem;
import com.educandoweb.cursosbjava.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {

	
}
