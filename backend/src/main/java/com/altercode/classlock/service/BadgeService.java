package com.altercode.classlock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.altercode.classlock.dto.BadgeDTO;
import com.altercode.classlock.entity.Badge;
import com.altercode.classlock.repository.BadgeRepository;

@Service
public class BadgeService {

	@Autowired
	private BadgeRepository repository;
	
	@Transactional(readOnly = true)
	public Page<BadgeDTO>findAll(Pageable pageable) {
		Page<Badge> result = repository.findAll(pageable);
		Page<BadgeDTO> page = result.map(x -> new BadgeDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public BadgeDTO findById(Long id) {
		Badge result = repository.findById(id).get();
		BadgeDTO dto = new BadgeDTO(result);
		return dto;
	}
	
}
