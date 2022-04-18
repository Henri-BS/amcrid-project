package com.altercode.classlock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altercode.classlock.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
