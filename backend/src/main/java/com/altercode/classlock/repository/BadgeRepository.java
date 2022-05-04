package com.altercode.classlock.repository;

import com.altercode.classlock.dto.XpDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.entity.Badge;

import java.util.List;
import java.util.Optional;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long>{

	@Query(value = "SELECT (obj.xp)"
			+ "FROM Badge AS obj")
	Optional<Badge> totalUserXp(Integer xp);

}
