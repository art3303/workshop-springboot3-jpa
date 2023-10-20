package com.SpirngProject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpirngProject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
