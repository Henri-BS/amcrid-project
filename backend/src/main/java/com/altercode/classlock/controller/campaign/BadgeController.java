package com.altercode.classlock.controller.campaign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.altercode.classlock.dto.campaign.BadgeDTO;
import com.altercode.classlock.service.campaign.BadgeService;

@RestController
@RequestMapping("/badge")
public class BadgeController {
	
	@Autowired
	private BadgeService badgeService;


	@GetMapping("/page")
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

	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBadge(@PathVariable Long id) {
		this.badgeService.deleteBadge(id);
	}
}
