package com.altercode.classlock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altercode.classlock.dto.ChapterDTO;
import com.altercode.classlock.service.ChapterService;

@RestController
@RequestMapping("/chapter")

public class ChapterController {
	@Autowired
	private ChapterService service;

	@GetMapping
	public Page<ChapterDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}

	@GetMapping("/all")
	public ResponseEntity<List<ChapterDTO>> findAll() {
		List<ChapterDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ChapterDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
