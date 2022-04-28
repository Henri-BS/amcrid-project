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

import com.altercode.classlock.dto.BadgeDTO;
import com.altercode.classlock.dto.XpDTO;
import com.altercode.classlock.service.BadgeService;

@RestController
@RequestMapping("/badge")
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
/*	
	@GetMapping(value = "/total-xp")
	public ResponseEntity<List<XpDTO>> totalUserXp() {
		List<XpDTO> list = service.totalUserXp();
		return ResponseEntity.ok(list);
	}
*/
}
