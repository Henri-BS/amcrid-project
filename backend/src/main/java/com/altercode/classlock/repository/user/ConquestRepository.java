package com.altercode.classlock.repository.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.dto.user.ConquestDTO;
import com.altercode.classlock.dto.user.UserRankDTO;
import com.altercode.classlock.entity.user.Conquest;
import com.altercode.classlock.entity.user.User;

@Repository
public interface ConquestRepository extends JpaRepository<Conquest, Long> {

	@Query("SELECT new com.altercode.classlock.dto.user.UserRankDTO(obj.user, obj.totalXp) "
			+ "FROM Conquest AS obj GROUP BY obj.user ORDER BY obj.totalXp DESC")
	List<UserRankDTO> userXpRank();

	ConquestDTO findConquestById(Long id);
	
	Conquest findByUser(User user);
}
