package com.SpirngProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpirngProject.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
