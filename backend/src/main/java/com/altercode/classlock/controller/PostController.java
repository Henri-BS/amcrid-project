package com.altercode.classlock.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.altercode.classlock.dto.PostDTO;
import com.altercode.classlock.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public ResponseEntity<Page<PostDTO>> findAll(Pageable pageable) {
        Page<PostDTO> list = postService.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public PostDTO findById(@PathVariable Long id) {
    	return postService.findById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO dto) {
        PostDTO add = postService.savePost(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }
}