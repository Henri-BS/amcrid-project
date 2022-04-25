package com.altercode.classlock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.dto.XpDTO;
import com.altercode.classlock.entity.Badge;

public interface BadgeRepository extends JpaRepository<Badge, Long>{
	
	@Query("SELECT new com.altercode.classlock.dto.XpDTO(obj.user, SUM(obj.xp))"
			+ "FROM Badge AS obj GROUP BY obj.user")
	List<XpDTO> totalUserXp();
}
