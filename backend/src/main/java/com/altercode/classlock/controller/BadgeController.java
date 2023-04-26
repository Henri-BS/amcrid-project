package com.altercode.classlock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.altercode.classlock.dto.BadgeDTO;
import com.altercode.classlock.dto.XpDTO;
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
	public ResponseEntity<Page<BadgeDTO>> findAll(Pageable pageable) {
	Page<BadgeDTO> page = badgeService.findAll(pageable);
	return ResponseEntity.ok(page);
	}
	
	@GetMapping( "/{id}")
	public ResponseEntity<BadgeDTO> findById(@PathVariable Long id){
	BadgeDTO find = badgeService.findById(id);
	return ResponseEntity.ok(find);
	}

	@PostMapping("/add")
	public ResponseEntity<BadgeDTO> saveBadge(@RequestBody BadgeDTO dto) {
		BadgeDTO add = badgeService.saveBadge(dto);
		return new ResponseEntity<>(add, HttpStatus.CREATED);
	}

	@PutMapping("/edit")
	public ResponseEntity<BadgeDTO> updateBadge(@RequestBody BadgeDTO dto) {
		BadgeDTO edit = badgeService.updateBadge(dto);
		return new ResponseEntity<>(edit, HttpStatus.OK);
	}
}
