package com.altercode.classlock.controller.user;

import com.altercode.classlock.service.ConquestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.altercode.classlock.dto.ConquestDTO;
import com.altercode.classlock.controller.campaign.entity.user.User;

@RestController
@RequestMapping("/conquest")
public class ConquestController {
	
	@Autowired
	private ConquestService conquestService;
	
	@GetMapping
	public Page<ConquestDTO> findAllConquests(Pageable pageable) {
		return conquestService.findAllConquests(pageable);
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<ConquestDTO> getConquestById(@PathVariable("id") Long id) {
        ConquestDTO result = conquestService.findConquestById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
	
	@GetMapping("/user")
	public ResponseEntity<ConquestDTO> findByUser(User user) {
		ConquestDTO find = conquestService.findByUser(user);
		return ResponseEntity.ok(find);
	}

	@PutMapping("/update-values/{user}")
	public ResponseEntity<ConquestDTO> updateConquestValues(ConquestDTO dto, @PathVariable User user) {
		ConquestDTO update = conquestService.updateConquestValues(dto, user);
		return new ResponseEntity<>(update, HttpStatus.OK);
	}
	}
