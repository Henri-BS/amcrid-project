package com.altercode.classlock.service;

import java.util.List;
import java.util.stream.Collectors;

import com.altercode.classlock.entity.Conquest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.altercode.classlock.dto.ConquestDTO;
import com.altercode.classlock.dto.UserDTO;
import com.altercode.classlock.dto.UserRankDTO;
import com.altercode.classlock.dto.XpDTO;
import com.altercode.classlock.entity.Badge;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.repository.BadgeRepository;
import com.altercode.classlock.repository.ConquestRepository;
import com.altercode.classlock.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private BadgeRepository badgeRepository;

	@Autowired
	private ConquestRepository conquestRepository;

	public List<UserDTO> findAll() {
		List<User> result = repository.findAll();
		return result.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public Page<UserDTO> findAll(Pageable pageable) {
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

	@Transactional
	public List<UserDTO> findByUserName(String name) {
		return repository.findByUserName(name);
	}

	public List<ConquestDTO> findAllConquests() {
		List<Conquest> result = conquestRepository.findAll();
		return result.stream().map(x -> new ConquestDTO(x)).collect(Collectors.toList());
	}

	@Transactional
	public ConquestDTO findConquestById(Long id) {
		return conquestRepository.findConquestById(id);
	}

	@Transactional
	public List<Badge> findAllById(Iterable<Long> ids) {
		List<Badge> result = badgeRepository.findAllById(ids);
		return result;
	}

	/*
	 * public List<User> getByName(String prefix) { return
	 * repository.getByName(prefix); }
	 */	
	
	@Transactional(readOnly = true)
	public List<UserRankDTO> userXpRank() {
		return conquestRepository.userXpRank();
	}
}
