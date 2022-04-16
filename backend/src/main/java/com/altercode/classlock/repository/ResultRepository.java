package com.altercode.classlock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.entity.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long>{

	
	
}
