package com.altercode.classlock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.dto.XpDTO;
import com.altercode.classlock.entity.Badge;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long>{
	
	@Query("SELECT SUM(b.xp)"
			+ "FROM Badge b")
	List<XpDTO> totalUserXp();
}
