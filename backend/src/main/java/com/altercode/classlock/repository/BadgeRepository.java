package com.altercode.classlock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.entity.Badge;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long>{

	/*
	 * @Query("SELECT new com.altercode.classlock.dto.XpDTO(obj.user, SUM(obj.xp))"
	 * + "FROM Badge AS obj GROUP BY obj.user") List<XpDTO> totalUserXp();
	 * List<XpDTO> totalUserXp();	 
	 */
	
}
