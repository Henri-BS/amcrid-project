package com.altercode.classlock.controller;

import java.util.List;

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

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/search")
    public ResponseEntity<List<UserDTO>> getdByName(@RequestParam String prefix) {
        List<UserDTO> list = service.getByName(prefix);
        return ResponseEntity.ok(list);
    }

    @PostMapping("/add")
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO dto) {
        UserDTO add = service.saveUser(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO dto) {
        UserDTO edit = service.updateUser(dto);
        return new ResponseEntity<>(edit, HttpStatus.OK);
    }
}
