package com.altercode.classlock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.entity.Badge;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long>{

}
