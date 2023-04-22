package com.altercode.classlock.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.altercode.classlock.dto.ConquestDTO;
import com.altercode.classlock.dto.UserDTO;
import com.altercode.classlock.entity.Conquest;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.repository.ConquestRepository;
import com.altercode.classlock.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ConquestRepository conquestRepository;

    public List<UserDTO> findAll() {
        List<User> result = userRepository.findAll();
        return result.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
    }

    public Page<UserDTO> findAll(Pageable pageable) {
        Page<User> result = userRepository.findAll(pageable);
        Page<UserDTO> page = result.map(x -> new UserDTO(x));
        return page;
    }

    public UserDTO findById(Long id) {
        User result = userRepository.findById(id).get();
        UserDTO dto = new UserDTO(result);
        return dto;
    }

    public List<ConquestDTO> findByUser(User user) {
        return conquestRepository.findByUser(user);
    }

    public Page<ConquestDTO> findAllConquests(Pageable pageable) {
        Page<Conquest> result = conquestRepository.findAll(pageable);
        Page<ConquestDTO> page = result.map(x -> new ConquestDTO(x));
        return page;
    }

    public ConquestDTO findConquestById(Long id) {
        return conquestRepository.findConquestById(id);
    }

    public List<UserDTO> getByName(String prefix) {
        List<User> result = userRepository.getByName(prefix);
        return result.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
    }

    public UserDTO saveUser(UserDTO dto) {
        User add = new User();
        add.setUserName(dto.getUserName());
        add.setEmail(dto.getEmail());
        add.setPassword(dto.getPassword());
        add.setImage(dto.getImage());
        return new UserDTO(userRepository.saveAndFlush(add));
    }
}
