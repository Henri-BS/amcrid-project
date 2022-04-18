package com.altercode.classlock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.altercode.classlock.dto.UserDTO;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public Page<UserDTO>findAll(Pageable pageable) {
		Page<User> result = repository.findAll(pageable);
		Page<UserDTO> page = result.map(x -> new UserDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		User result = repository.findById(id).get();
		UserDTO dto = new UserDTO(result);
		return dto;
	}
}
