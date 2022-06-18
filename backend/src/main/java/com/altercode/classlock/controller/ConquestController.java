package com.altercode.classlock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altercode.classlock.dto.ConquestDTO;
import com.altercode.classlock.dto.UserRankDTO;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.service.UserService;

@RestController
@RequestMapping("/conquest")
public class ConquestController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public Page<ConquestDTO> findAllConquests(Pageable pageable) {
		return service.findAllConquests(pageable);
	}
	
	@GetMapping("/ranking")
	public ResponseEntity<List<UserRankDTO>> userXpRank() {
		List<UserRankDTO> list = service.userXpRank();
		return ResponseEntity.ok(list);
	}
	@GetMapping("/{id}")
    public ResponseEntity<ConquestDTO> getConquestById(@PathVariable("id") Long id) {
        ConquestDTO result = service.findConquestById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
	
	@GetMapping("/user")
	public ResponseEntity<List<ConquestDTO>> findByUser(User user) {
		List<ConquestDTO> list = service.findByUser(user);
		return ResponseEntity.ok(list);
	}
}
