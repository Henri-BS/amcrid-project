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

import com.altercode.classlock.dto.UserDTO;
import com.altercode.classlock.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public Page<UserDTO> findAll(Pageable pageable) {
	return service.findAll(pageable);	
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<UserDTO>> findAll() {
		List<UserDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public UserDTO findById(@PathVariable Long id){
	return service.findById(id);	
	}
	
	@GetMapping("/profile")
	public ResponseEntity<List<UserDTO>> findByName(String userName) {
		List<UserDTO> list = service.findByUserName(userName);
		return ResponseEntity.ok(list);
	}
	
	

	/*
	 * @GetMapping("/search") public List<User> getdByName(@RequestParam String
	 * prefix){ return service.getByName(prefix); 
	 * }
	 */
	

}
