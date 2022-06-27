package com.altercode.classlock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.dto.UserDTO;
import com.altercode.classlock.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	@Query("SELECT obj FROM User obj WHERE obj.userName like ?1% ORDER BY obj.userName ASC")
	List<User> getByName(String prefix);
}
