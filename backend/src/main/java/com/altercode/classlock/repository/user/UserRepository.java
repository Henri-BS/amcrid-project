package com.altercode.classlock.repository.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.entity.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	User findByUserName(String userName);

	@Query("SELECT obj FROM User obj WHERE obj.userName like ?1% ORDER BY obj.userName ASC")
	List<User> getByName(String prefix);
}
