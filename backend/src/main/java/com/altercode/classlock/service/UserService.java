package com.altercode.classlock.service;

import java.util.List;
import java.util.stream.Collectors;

import com.altercode.classlock.dto.UserRelationDTO;
import com.altercode.classlock.entity.UserBadge;
import com.altercode.classlock.entity.UserPost;
import com.altercode.classlock.repository.UserBadgeRepository;
import com.altercode.classlock.repository.UserPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.altercode.classlock.dto.UserDTO;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.repository.ConquestRepository;
import com.altercode.classlock.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserPostRepository userPostRepository;

    public List<UserDTO> findAll() {
        List<User> result = userRepository.findAll();
        return result.stream().map(UserDTO::new).collect(Collectors.toList());
    }

    public Page<UserDTO> findAll(Pageable pageable) {
        Page<User> result = userRepository.findAll(pageable);
        return result.map(UserDTO::new);
    }

    public List<UserDTO> getByName(String prefix) {
        List<User> result = userRepository.getByName(prefix);
        return result.stream().map(UserDTO::new).collect(Collectors.toList());
    }

    public List<UserRelationDTO> findAllPostersByUser(User user){
        List<UserPost> list = userPostRepository.findAllPostersByUser(user);
        return list.stream().map(UserRelationDTO::new).collect(Collectors.toList());
    }

    public UserDTO findById(Long id) {
        User result = userRepository.findById(id).orElseThrow();
        return new UserDTO(result);
    }

    public UserDTO saveUser(UserDTO dto) {
        User add = new User();
        add.setUserName(dto.getUserName());
        add.setEmail(dto.getEmail());
        add.setPassword(dto.getPassword());
        add.setImage(dto.getImage());
        return new UserDTO(userRepository.saveAndFlush(add));
    }

    public UserDTO updateUser(UserDTO dto) {
        User edit = userRepository.findById(dto.getId()).orElseThrow();


        edit.setId(edit.getId());
        edit.setUserName(dto.getUserName());
        edit.setEmail(edit.getEmail());
        edit.setPassword(edit.getPassword());
        edit.setImage(dto.getImage());
        return new UserDTO(userRepository.save(edit));
    }

    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }
}
