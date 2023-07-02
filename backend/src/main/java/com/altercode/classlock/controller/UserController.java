package com.altercode.classlock.controller;

import java.util.List;

import com.altercode.classlock.dto.UserRelationDTO;
import com.altercode.classlock.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.altercode.classlock.dto.UserDTO;
import com.altercode.classlock.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Page<UserDTO> findAll(Pageable pageable) {
        return userService.findAll(pageable);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> list = userService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/search")
    public ResponseEntity<List<UserDTO>> getByName(@RequestParam String prefix) {
        List<UserDTO> list = userService.getByName(prefix);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/list-post/{user}")
    public ResponseEntity<Page<UserRelationDTO>> findAllPostersByUser(Pageable pageable, User user){
        Page<UserRelationDTO> page = userService.findAllPostersByUser(pageable, user);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO dto) {
        UserDTO add = userService.saveUser(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO dto) {
        UserDTO edit = userService.updateUser(dto);
        return new ResponseEntity<>(edit, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id) {
        this.userService.deleteUser(id);
    }
}
