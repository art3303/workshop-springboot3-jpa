package com.SpirngProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpirngProject.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
