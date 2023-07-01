package com.altercode.classlock.controller;

import java.util.List;

import com.altercode.classlock.dto.QuizBadgeDTO;
import com.altercode.classlock.dto.UserRelationDTO;
import com.altercode.classlock.entity.Quiz;
import com.altercode.classlock.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	public ResponseEntity<Page<BadgeDTO>> findAll(Pageable pageable) {
	Page<BadgeDTO> page = badgeService.findAll(pageable);
	return ResponseEntity.ok(page);
	}
	
	@GetMapping( "/{id}")
	public ResponseEntity<BadgeDTO> findById(@PathVariable Long id){
	BadgeDTO find = badgeService.findById(id);
	return ResponseEntity.ok(find);
	}

	@GetMapping("/by-quiz/{quiz}")
	public ResponseEntity<List<QuizBadgeDTO>> findAllBadgesByQuiz(@PathVariable Quiz quiz) {
		List<QuizBadgeDTO> list = badgeService.findAllBadgesByQuiz(quiz);
		return ResponseEntity.ok(list);
	}

	@GetMapping("/by-user/{user}")
	public ResponseEntity<Page<UserRelationDTO>> findAllBadgesByUser(Pageable pageable, @PathVariable User user) {
		Page<UserRelationDTO> list = badgeService.findAllBadgesByUser(pageable, user);
		return ResponseEntity.ok(list);
	}

	@PostMapping("/add")
	public ResponseEntity<BadgeDTO> saveBadge(@RequestBody BadgeDTO dto) {
		BadgeDTO add = badgeService.saveBadge(dto);
		return new ResponseEntity<>(add, HttpStatus.CREATED);
	}

	@PostMapping("/add-quiz")
	public ResponseEntity<QuizBadgeDTO> saveQuizBadge(@RequestBody QuizBadgeDTO dto) {
		QuizBadgeDTO add = badgeService.saveQuizBadge(dto);
		return new ResponseEntity<>(add, HttpStatus.CREATED);
	}

	@PostMapping("/add-user")
	public ResponseEntity<UserRelationDTO> saveUserBadge(@RequestBody UserRelationDTO dto) {
		UserRelationDTO add = badgeService.saveUserBadge(dto);
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
