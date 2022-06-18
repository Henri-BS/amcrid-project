package com.altercode.classlock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.dto.ConquestDTO;
import com.altercode.classlock.dto.UserRankDTO;
import com.altercode.classlock.entity.Conquest;
import com.altercode.classlock.entity.User;

@Repository
public interface ConquestRepository extends JpaRepository<Conquest, Long> {

	@Query("SELECT new com.altercode.classlock.dto.UserRankDTO(obj.user, obj.totalXp) "
			+ "FROM Conquest AS obj GROUP BY obj.user ORDER BY obj.totalXp DESC")
	List<UserRankDTO> userXpRank();

	ConquestDTO findConquestById(Long id);
	
	List<ConquestDTO> findByUser(User user);
}
