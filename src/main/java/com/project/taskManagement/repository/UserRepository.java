package com.project.taskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.taskManagement.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
    User findByUsername(String username);

	
}
