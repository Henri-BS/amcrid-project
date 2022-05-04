package com.altercode.classlock.controller;

import java.util.List;
import java.util.Optional;

import com.altercode.classlock.entity.Badge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altercode.classlock.dto.BadgeDTO;
import com.altercode.classlock.service.BadgeService;

@RestController
@RequestMapping("/badge")
public class BadgeController {
	
	@Autowired
	private BadgeService badgeService;

	@GetMapping("/all")
	public ResponseEntity<List<BadgeDTO>> findAll() {
		List<BadgeDTO> list = badgeService.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping
	public Page<BadgeDTO> findAll(Pageable pageable) {
	return badgeService.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public BadgeDTO findById(@PathVariable Long id){
	return badgeService.findById(id);
	}

	@GetMapping(value = "/total-xp")
	public ResponseEntity<Optional<Badge>> totalUserXp(Integer xp) {
		Optional<Badge> list = badgeService.totalUserXp(xp);
		return ResponseEntity.ok(list);
	}
}
