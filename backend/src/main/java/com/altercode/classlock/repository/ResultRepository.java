package com.altercode.classlock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.dto.ResultDTO;
import com.altercode.classlock.entity.Result;
import com.altercode.classlock.entity.User;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long>{

	List<Result> findAll();

	ResultDTO findResultById(Long id);

}
