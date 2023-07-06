package com.altercode.classlock.repository.game;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.dto.game.ResultDTO;
import com.altercode.classlock.entity.game.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long>{

	List<Result> findAll();

	ResultDTO findResultById(Long id);

}
