package com.SpirngProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpirngProject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
