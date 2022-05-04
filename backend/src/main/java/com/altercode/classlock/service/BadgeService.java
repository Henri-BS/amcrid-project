package com.altercode.classlock.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	private BadgeRepository badgeRepository;
	
	@Transactional(readOnly = true)
	public Page<BadgeDTO>findAll(Pageable pageable) {
		Page<Badge> result = badgeRepository.findAll(pageable);
		Page<BadgeDTO> page = result.map(x -> new BadgeDTO(x));
		return page;
	}

	public List<BadgeDTO> findAll() {
		List<Badge> result = badgeRepository.findAll();
		return result.stream().map(x -> new BadgeDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public BadgeDTO findById(Long id) {
		Badge result = badgeRepository.findById(id).get();
		BadgeDTO dto = new BadgeDTO(result);
		return dto;
	}

	@Transactional(readOnly = true)
	public Optional<Badge> totalUserXp(Integer xp) {
		return badgeRepository.totalUserXp(xp);
	}

}
