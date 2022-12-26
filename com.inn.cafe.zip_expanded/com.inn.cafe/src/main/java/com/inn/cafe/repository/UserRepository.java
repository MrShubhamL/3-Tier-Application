package com.inn.cafe.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.inn.cafe.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	 public User findByEmail(String email);
	 
	 public User findByPasswordAndEmail(String password, String email);
	 
	 @Query("FROM User")
	 public Set<User> getUsers();

}
