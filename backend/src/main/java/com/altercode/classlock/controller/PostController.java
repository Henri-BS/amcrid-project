package com.altercode.classlock.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altercode.classlock.dto.PostDTO;
import com.altercode.classlock.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping
    public ResponseEntity<Page<PostDTO>> findAll(Pageable pageable) {
        Page<PostDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public PostDTO findById(@PathVariable Long id) {
    	return service.findById(id);
    }
}