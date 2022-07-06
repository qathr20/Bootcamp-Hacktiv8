package com.belajar.api.BelajarApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.api.BelajarApi.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
