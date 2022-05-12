package com.altercode.classlock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.dto.ResultDTO;
import com.altercode.classlock.dto.TotalCorrectSumDTO;
import com.altercode.classlock.entity.Result;
import com.altercode.classlock.entity.User;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long>{


	List<Result> findAll();

	List<ResultDTO> findByUser(User user);

	ResultDTO findResultById(Long id);
	
	@Query(value = "SELECT new com.altercode.classlock.dto.TotalCorrectSumDTO(obj.user, SUM(obj.totalCorrect)) "
			+ "FROM Result AS obj GROUP BY obj.user")
	List<TotalCorrectSumDTO> TotalQuestionsCorrect(); 

}
