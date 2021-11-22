package com.spring.test.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.test.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("select u from User u where u.email=:email")
	public User getUserByName(@Param("email") String email);
	@Query("select u from User u where u.name=:name")
	public User getByName(@Param("name") String name);
}
