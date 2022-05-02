package com.altercode.classlock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.dto.ConquestDTO;
import com.altercode.classlock.entity.Conquest;

import java.util.List;

@Repository
public interface ConquestRepository extends JpaRepository<Conquest, Long> {

	ConquestDTO findConquestById(Long id);
}
