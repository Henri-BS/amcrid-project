package com.altercode.classlock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altercode.classlock.dto.BadgeDTO;
import com.altercode.classlock.service.BadgeService;

@RestController
@RequestMapping("/badges")
public class BadgeController {
	
	@Autowired
	private BadgeService service;
	
	@GetMapping
	public Page<BadgeDTO> findAll(Pageable pageable) {
	return service.findAll(pageable);	
	}
	
	@GetMapping(value = "/{id}")
	public BadgeDTO findById(@PathVariable Long id){
	return service.findById(id);	
	}
}
